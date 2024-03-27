package org.openapitools.client;

import org.openapitools.client.auth.Authentication;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.auth.HttpBearerAuth;
import org.openapitools.client.auth.ApiKeyAuth;
import org.openapitools.client.auth.OAuth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.vertx.core.*;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.file.AsyncFile;
import io.vertx.core.file.FileSystem;
import io.vertx.core.file.OpenOptions;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;

import java.time.OffsetDateTime;
import java.text.DateFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toMap;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-amadeus")
public class ApiClient extends JavaTimeFormatter {

    private static final Pattern CONTENT_DISPOSITION_PATTERN = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
    private static final OpenOptions FILE_DOWNLOAD_OPTIONS = new OpenOptions().setCreate(true).setTruncateExisting(true);

    private final Vertx vertx;
    private final JsonObject config;
    private final String identifier;

    private MultiMap defaultHeaders = MultiMap.caseInsensitiveMultiMap();
    private MultiMap defaultCookies = MultiMap.caseInsensitiveMultiMap();
    private Map<String, Authentication> authentications;
    private String basePath = "http://petstore.swagger.io:80/v2";
    private DateFormat dateFormat;
    private ObjectMapper objectMapper;
    private String downloadsDir = "";
    private int timeout = -1;

    public ApiClient(Vertx vertx, JsonObject config) {
        Objects.requireNonNull(vertx, "Vertx must not be null");
        Objects.requireNonNull(config, "Config must not be null");

        this.vertx = vertx;

        // Use RFC3339 format for date and datetime.
        // See http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14
        this.dateFormat = new RFC3339DateFormat();

        // Use UTC as the default time zone.
        this.dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        // Build object mapper
        this.objectMapper = new ObjectMapper();
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        this.objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.setDateFormat(dateFormat);

        // Setup authentications (key: authentication name, value: authentication).
        this.authentications = new HashMap<>();
        authentications.put("petstore_auth", new OAuth());
        authentications.put("api_key", new ApiKeyAuth("header", "api_key"));
        authentications.put("api_key_query", new ApiKeyAuth("query", "api_key_query"));
        authentications.put("http_basic_test", new HttpBasicAuth());
        // Prevent the authentications from being modified.
        this.authentications = Collections.unmodifiableMap(authentications);

        // Configurations
        this.basePath = config.getString("basePath", this.basePath);
        this.downloadsDir = config.getString("downloadsDir", this.downloadsDir);
        this.config = config;
        this.identifier = UUID.randomUUID().toString();
        this.timeout = config.getInteger("timeout", -1);
    }

    public Vertx getVertx() {
        return vertx;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public ApiClient setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        return this;
    }

    public synchronized WebClient getWebClient() {
        String webClientIdentifier = "web-client-" + identifier;
        WebClient webClient = this.vertx.getOrCreateContext().get(webClientIdentifier);
        if (webClient == null) {
            webClient = buildWebClient(vertx, config);
            this.vertx.getOrCreateContext().put(webClientIdentifier, webClient);
        }
        return webClient;
    }

    public String getBasePath() {
        return basePath;
    }

    public ApiClient setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public String getDownloadsDir() {
        return downloadsDir;
    }

    public ApiClient setDownloadsDir(String downloadsDir) {
        this.downloadsDir = downloadsDir;
        return this;
    }

    public MultiMap getDefaultHeaders() {
        return defaultHeaders;
    }

    public ApiClient addDefaultHeader(String key, String value) {
        defaultHeaders.add(key, value);
        return this;
    }

    public MultiMap getDefaultCookies() {
        return defaultHeaders;
    }

    public ApiClient addDefaultCookie(String key, String value) {
        defaultCookies.add(key, value);
        return this;
    }

    /**
     * Get authentications (key: authentication name, value: authentication).
     *
     * @return Map of authentication object
     */
    public Map<String, Authentication> getAuthentications() {
        return authentications;
    }

    /**
     * Get authentication for the given name.
     *
     * @param authName The authentication name
     * @return The authentication, null if not found
     */
    public Authentication getAuthentication(String authName) {
        return authentications.get(authName);
    }

    /**
     * Helper method to set access token for the first Bearer authentication.
     * @param bearerToken Bearer token
     */
    public ApiClient setBearerToken(String bearerToken) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBearerAuth) {
                ((HttpBearerAuth) auth).setBearerToken(bearerToken);
                return this;
            }
        }
        throw new RuntimeException("No Bearer authentication configured!");
    }

    /**
     * Helper method to set username for the first HTTP basic authentication.
     *
     * @param username Username
     */
    public ApiClient setUsername(String username) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBasicAuth) {
                ((HttpBasicAuth) auth).setUsername(username);
                return this;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }

    /**
     * Helper method to set password for the first HTTP basic authentication.
     *
     * @param password Password
     */
    public ApiClient setPassword(String password) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBasicAuth) {
                ((HttpBasicAuth) auth).setPassword(password);
                return this;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }

    /**
     * Helper method to set API key value for the first API key authentication.
     *
     * @param apiKey API key
     */
    public ApiClient setApiKey(String apiKey) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof ApiKeyAuth) {
                ((ApiKeyAuth) auth).setApiKey(apiKey);
                return this;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }

    /**
     * Helper method to set API key prefix for the first API key authentication.
     *
     * @param apiKeyPrefix API key prefix
     */
    public ApiClient setApiKeyPrefix(String apiKeyPrefix) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof ApiKeyAuth) {
                ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
                return this;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }

    /**
     * Helper method to set access token for the first OAuth2 authentication.
     *
     * @param accessToken Access token
     */
    public ApiClient setAccessToken(String accessToken) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof OAuth) {
                ((OAuth) auth).setAccessToken(accessToken);
                return this;
            }
        }
        throw new RuntimeException("No OAuth2 authentication configured!");
    }

    /**
     * Format the given Date object into string.
     *
     * @param date Date
     * @return Date in string format
     */
    public String formatDate(Date date) {
        return dateFormat.format(date);
    }

    /**
     * Format the given parameter object into string.
     *
     * @param param Object
     * @return Object in string format
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } else if (param instanceof Date) {
            return formatDate((Date) param);
        } else if (param instanceof OffsetDateTime) {
            return formatOffsetDateTime((OffsetDateTime) param);
        } else if (param instanceof Collection) {
            StringBuilder b = new StringBuilder();
            for (Object o : (Collection) param) {
                if (b.length() > 0) {
                    b.append(',');
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } else {
            return String.valueOf(param);
        }
    }

    /*
     * Format to {@code Pair} objects.
     * @param collectionFormat Collection format
     * @param name Name
     * @param value Value
     * @return List of pairs
     */
    public List<Pair> parameterToPairs(String collectionFormat, String name, Object value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null) return params;

        Collection valueCollection;
        if (value instanceof Collection) {
            valueCollection = (Collection) value;
        } else {
            params.add(new Pair(name, parameterToString(value)));
            return params;
        }

        if (valueCollection.isEmpty()) {
            return params;
        }

        // get the collection format (default: csv)
        String format = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat);

        // create the params based on the collection format
        if ("multi".equals(format)) {
            for (Object item : valueCollection) {
                params.add(new Pair(name, parameterToString(item)));
            }
            return params;
        }

        String delimiter = ",";
        if ("csv".equals(format)) {
            delimiter = ",";
        } else if ("ssv".equals(format)) {
            delimiter = " ";
        } else if ("tsv".equals(format)) {
            delimiter = "\t";
        } else if ("pipes".equals(format)) {
            delimiter = "|";
        }

        StringBuilder sb = new StringBuilder();
        for (Object item : valueCollection) {
            sb.append(delimiter);
            sb.append(parameterToString(item));
        }

        params.add(new Pair(name, sb.substring(1)));

        return params;
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     * application/json
     * application/json; charset=UTF8
     * APPLICATION/JSON
     * application/vnd.company+json
     *
     * @param mime MIME
     * @return True if the MIME type is JSON
     */
    private boolean isJsonMime(String mime) {
        String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
        return mime != null && (mime.matches(jsonMime) || mime.equalsIgnoreCase("application/json-patch+json"));
    }

    /**
     * Select the Accept header's value from the given accepts array:
     * if JSON exists in the given array, use it;
     * otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty,
     * null will be returned (not to set the Accept header explicitly).
     */
    protected String selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return StringUtil.join(accepts, ",");
    }

    /**
     * Select the Content-Type header's value from the given array:
     * if JSON exists in the given array, use it;
     * otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty,
     * JSON will be used.
     */
    protected String selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0) {
            return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes[0];
    }

    public void sendBody(HttpRequest<Buffer> request,
                         Handler<AsyncResult<HttpResponse<Buffer>>> responseHandler,
                         Object body) {
        if (body instanceof byte[]) {
            Buffer buffer = Buffer.buffer((byte[]) body);
            request.sendBuffer(buffer, responseHandler);
        } else if (body instanceof AsyncFile) {
            AsyncFile file = (AsyncFile) body;
            request.sendStream(file, responseHandler);
        } else {
            try {
                request.sendBuffer(Buffer.buffer(this.objectMapper.writeValueAsBytes(body)), responseHandler);
            } catch (JsonProcessingException jsonProcessingException) {
                responseHandler.handle(Future.failedFuture(jsonProcessingException));
            }
        }
    }

    /**
     * Invoke API by sending HTTP request with the given options.
     *
     * @param <T> Type
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "POST", "PUT", "HEAD" and "DELETE"
     * @param queryParams The query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param cookieParams The cookie parameters
     * @param formParams The form parameters
     * @param accepts The request's Accept headers
     * @param contentTypes The request's Content-Type headers
     * @param authNames The authentications to apply
     * @param authInfo The call specific auth override
     * @param returnType The return type into which to deserialize the response
     * @param resultHandler The asynchronous response handler
     */
    public <T> void invokeAPI(String path, String method, List<Pair> queryParams, Object body, MultiMap headerParams,
                              MultiMap cookieParams, Map<String, Object> formParams, String[] accepts, String[] contentTypes, String[] authNames, AuthInfo authInfo,
                              TypeReference<T> returnType, Handler<AsyncResult<T>> resultHandler) {

        updateParamsForAuth(authNames, authInfo, queryParams, headerParams, cookieParams);

        if (accepts != null && accepts.length > 0) {
            headerParams.add(HttpHeaders.ACCEPT, selectHeaderAccept(accepts));
        }

        if (contentTypes != null) {
            headerParams.add(HttpHeaders.CONTENT_TYPE, selectHeaderContentType(contentTypes));
        }

        HttpMethod httpMethod = HttpMethod.valueOf(method);
        HttpRequest<Buffer> request = getWebClient().requestAbs(httpMethod, basePath + path);
        request.timeout(this.timeout);

        if (httpMethod == HttpMethod.PATCH) {
            request.putHeader("X-HTTP-Method-Override", "PATCH");
        }

        queryParams.forEach(entry -> {
            if (entry.getValue() != null) {
                request.addQueryParam(entry.getName(), entry.getValue());
            }
        });

        headerParams.forEach(entry -> {
            if (entry.getValue() != null) {
                request.putHeader(entry.getKey(), entry.getValue());
            }
        });

        defaultHeaders.forEach(entry -> {
            if (entry.getValue() != null) {
                request.putHeader(entry.getKey(), entry.getValue());
            }
        });

        final MultiMap cookies = MultiMap.caseInsensitiveMultiMap().addAll(cookieParams).addAll(defaultCookies);
        request.putHeader("Cookie", buildCookieHeader(cookies));

        Handler<AsyncResult<HttpResponse<Buffer>>> responseHandler = buildResponseHandler(returnType, resultHandler);
        if (body != null) {
            sendBody(request, responseHandler, body);
        } else if (formParams != null && !formParams.isEmpty()) {
            Map<String, String> formMap = formParams.entrySet().stream().collect(toMap(Map.Entry::getKey, entry -> parameterToString(entry.getValue())));
            MultiMap form = MultiMap.caseInsensitiveMultiMap().addAll(formMap);
            request.sendForm(form, responseHandler);
        } else {
            request.send(responseHandler);
        }
    }

    private String buildCookieHeader(MultiMap cookies) {
      final StringBuilder cookieValue = new StringBuilder();
      String delimiter = "";
      for (final Map.Entry<String, String> entry : cookies.entries()) {
          if (entry.getValue() != null) {
              cookieValue.append(String.format("%s%s=%s", delimiter, entry.getKey(), entry.getValue()));
              delimiter = "; ";
          }
      }
      return cookieValue.toString();
    }

    /**
     * Sanitize filename by removing path.
     * e.g. ../../sun.gif becomes sun.gif
     *
     * @param filename The filename to be sanitized
     * @return The sanitized filename
     */
    protected String sanitizeFilename(String filename) {
        return filename.replaceAll(".*[/\\\\]", "");
    }

    /**
     * Create a filename from the given headers.
     * When the headers have no "Content-Disposition" information, a random UUID name is generated.
     *
     * @param headers The HTTP response headers
     * @return The filename
     */
    protected String generateFilename(MultiMap headers) {
        String filename = UUID.randomUUID().toString();
        String contentDisposition = headers.get("Content-Disposition");
        if (contentDisposition != null && !contentDisposition.isEmpty()) {
            Matcher matcher = CONTENT_DISPOSITION_PATTERN.matcher(contentDisposition);
            if (matcher.find()) {
                filename = sanitizeFilename(matcher.group(1));
            }
        }
        return filename;
    }

    /**
     * File Download handling.
     *
     * @param response The HTTP response
     * @param handler The response handler
     */
    protected <T> void handleFileDownload(HttpResponse<Buffer> response, Handler<AsyncResult<T>> handler) {
        FileSystem fs = getVertx().fileSystem();

        String filename = generateFilename(response.headers());
        Consumer<String> fileHandler = directory -> {
            fs.open(directory + filename, FILE_DOWNLOAD_OPTIONS, asyncFileResult -> {
                if (asyncFileResult.succeeded()) {
                    AsyncFile asyncFile = asyncFileResult.result();
                    asyncFile.write(response.bodyAsBuffer());
                    //noinspection unchecked
                    handler.handle(Future.succeededFuture((T) asyncFile));
                } else {
                    handler.handle(ApiException.fail(asyncFileResult.cause()));
                }
            });
        };

        String dir = getDownloadsDir();
        if (dir != null && !dir.isEmpty()) {
            fs.mkdirs(dir, mkdirResult -> {
                String sanitizedFolder = dir.endsWith("/") ? dir : dir + "/";
                fileHandler.accept(sanitizedFolder);
            });
        } else {
            fileHandler.accept("");
        }
    }

    /**
     * Build a response handler for the HttpResponse.
     *
     * @param returnType The return type
     * @param handler The response handler
     * @return The HTTP response handler
     */
    protected <T> Handler<AsyncResult<HttpResponse<Buffer>>> buildResponseHandler(TypeReference<T> returnType,
                                                                                  Handler<AsyncResult<T>> handler) {
        return response -> {
            AsyncResult<T> result;
            if (response.succeeded()) {
                HttpResponse<Buffer> httpResponse = response.result();
                if (httpResponse.statusCode() / 100 == 2) {
                    if (httpResponse.statusCode() == 204 || returnType == null) {
                        result = Future.succeededFuture(null);
                    } else {
                        T resultContent = null;
                        if ("byte[]".equals(returnType.getType().toString())) {
                            resultContent = (T) httpResponse.body().getBytes();
                            result = Future.succeededFuture(resultContent);
                        } else if (AsyncFile.class.equals(returnType.getType())) {
                            handleFileDownload(httpResponse, handler);
                            return;
                        } else {
                            try {
                                resultContent = this.objectMapper.readValue(httpResponse.bodyAsString(), returnType);
                                result = Future.succeededFuture(resultContent);
                            } catch (Exception e) {
                                result =  ApiException.fail(new DecodeException("Failed to decode:" + e.getMessage(), e));
                            }
                        }
                    }
                } else {
                    result = ApiException.fail(httpResponse.statusMessage(), httpResponse.statusCode(), httpResponse.headers(), httpResponse.bodyAsString());
                }
            } else if (response.cause() instanceof ApiException) {
                result = Future.failedFuture(response.cause());
            } else {
                result = ApiException.fail(500, response.cause() != null ? response.cause().getMessage() : null);
            }
            handler.handle(result);
        };
    }

    /**
     * Build the WebClient used to make HTTP requests.
     *
     * @param vertx Vertx
     * @return WebClient
     */
    protected WebClient buildWebClient(Vertx vertx, JsonObject config) {

        if (!config.containsKey("userAgent")) {
            config.put("userAgent", "OpenAPI-Generator/1.0.0/java");
        }

        return WebClient.create(vertx, new WebClientOptions(config));
    }


    /**
     * Update query and header parameters based on authentication settings.
     *
     * @param authNames The authentications to apply
     */
    protected void updateParamsForAuth(String[] authNames, AuthInfo authInfo, List<Pair> queryParams, MultiMap headerParams, MultiMap cookieParams) {
        for (String authName : authNames) {
            Authentication auth;
            if (authInfo != null && authInfo.authentications.containsKey(authName)) {
                auth = authInfo.authentications.get(authName);
            } else {
                auth = authentications.get(authName);
            }
            if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
            auth.applyToParams(queryParams, headerParams, cookieParams);
        }
    }

    public static class AuthInfo {

        private final Map<String, Authentication> authentications = new LinkedHashMap<>();

        public void addPetstore_authAuthentication(String accessToken) {
           OAuth auth = new OAuth();
           auth.setAccessToken(accessToken);
           authentications.put("petstore_auth", auth);
        }

        public void addApi_keyAuthentication(String apikey, String apiKeyPrefix) {
           ApiKeyAuth auth = new ApiKeyAuth("header","api_key");
           auth.setApiKey(apikey);
           auth.setApiKeyPrefix(apiKeyPrefix);
           authentications.put("api_key", auth);
        }

        public void addApi_key_queryAuthentication(String apikey, String apiKeyPrefix) {
           ApiKeyAuth auth = new ApiKeyAuth("query","api_key_query");
           auth.setApiKey(apikey);
           auth.setApiKeyPrefix(apiKeyPrefix);
           authentications.put("api_key_query", auth);
        }

        public void addHttp_basic_testAuthentication(String username, String password) {
            HttpBasicAuth auth = new HttpBasicAuth();
            auth.setUsername(username);
            auth.setPassword(password);
            authentications.put("http_basic_test", auth);
        }

        public static AuthInfo forPetstore_authAuthentication(String accessToken) {
            AuthInfo authInfo = new AuthInfo();
            authInfo.addPetstore_authAuthentication(accessToken);
            return authInfo;
        }

        public static AuthInfo forApi_keyAuthentication(String apikey, String apiKeyPrefix) {
            AuthInfo authInfo = new AuthInfo();
            authInfo.addApi_keyAuthentication(apikey, apiKeyPrefix);
            return authInfo;
        }

        public static AuthInfo forApi_key_queryAuthentication(String apikey, String apiKeyPrefix) {
            AuthInfo authInfo = new AuthInfo();
            authInfo.addApi_key_queryAuthentication(apikey, apiKeyPrefix);
            return authInfo;
        }

        public static AuthInfo forHttp_basic_test(String username, String password) {
            AuthInfo authInfo = new AuthInfo();
            authInfo.addHttp_basic_testAuthentication(username, password);
            return authInfo;
        }
    }
}
