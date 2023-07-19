/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.ClientDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.FileSchemaTestClassDto;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterCompositeDto;
import org.openapitools.model.UserDto;
import org.openapitools.model.XmlItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface FakeApi {

    /**
     * POST /fake/create_xml_item : creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItemDto XmlItem Body (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake/create_xml_item",
        accept = "application/json",
        contentType = "application/xml"
    )
    ResponseEntity<Void> createXmlItem(
         @RequestBody XmlItemDto xmlItemDto
    );


    /**
     * POST /fake/outer/boolean
     * Test serialization of outer boolean types
     *
     * @param body Input boolean as post body (optional)
     * @return Output boolean (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake/outer/boolean",
        accept = "*/*",
        contentType = "application/json"
    )
    ResponseEntity<Boolean> fakeOuterBooleanSerialize(
         @RequestBody(required = false) Boolean body
    );


    /**
     * POST /fake/outer/composite
     * Test serialization of object with outer number type
     *
     * @param outerCompositeDto Input composite as post body (optional)
     * @return Output composite (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake/outer/composite",
        accept = "*/*",
        contentType = "application/json"
    )
    ResponseEntity<OuterCompositeDto> fakeOuterCompositeSerialize(
         @RequestBody(required = false) OuterCompositeDto outerCompositeDto
    );


    /**
     * POST /fake/outer/number
     * Test serialization of outer number types
     *
     * @param body Input number as post body (optional)
     * @return Output number (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake/outer/number",
        accept = "*/*",
        contentType = "application/json"
    )
    ResponseEntity<BigDecimal> fakeOuterNumberSerialize(
         @RequestBody(required = false) BigDecimal body
    );


    /**
     * POST /fake/outer/string
     * Test serialization of outer string types
     *
     * @param body Input string as post body (optional)
     * @return Output string (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake/outer/string",
        accept = "*/*",
        contentType = "application/json"
    )
    ResponseEntity<String> fakeOuterStringSerialize(
         @RequestBody(required = false) String body
    );


    /**
     * PUT /fake/body-with-file-schema
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param fileSchemaTestClassDto  (required)
     * @return Success (status code 200)
     */
    @HttpExchange(
        method = "PUT",
        value = "/fake/body-with-file-schema",
        accept = "application/json",
        contentType = "application/json"
    )
    ResponseEntity<Void> testBodyWithFileSchema(
         @RequestBody FileSchemaTestClassDto fileSchemaTestClassDto
    );


    /**
     * PUT /fake/body-with-query-params
     *
     * @param query  (required)
     * @param userDto  (required)
     * @return Success (status code 200)
     */
    @HttpExchange(
        method = "PUT",
        value = "/fake/body-with-query-params",
        accept = "application/json",
        contentType = "application/json"
    )
    ResponseEntity<Void> testBodyWithQueryParams(
         @RequestParam(value = "query", required = true) String query,
         @RequestBody UserDto userDto
    );


    /**
     * PATCH /fake : To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param clientDto client model (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "PATCH",
        value = "/fake",
        accept = "application/json",
        contentType = "application/json"
    )
    ResponseEntity<ClientDto> testClientModel(
         @RequestBody ClientDto clientDto
    );


    /**
     * POST /fake : Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake",
        accept = "application/json",
        contentType = "application/x-www-form-urlencoded"
    )
    ResponseEntity<Void> testEndpointParameters(
         @RequestParam(value = "number", required = true) BigDecimal number,
         @RequestParam(value = "double", required = true) Double _double,
         @RequestParam(value = "pattern_without_delimiter", required = true) String patternWithoutDelimiter,
         @RequestParam(value = "byte", required = true) byte[] _byte,
         @RequestParam(value = "integer", required = false) Integer integer,
         @RequestParam(value = "int32", required = false) Integer int32,
         @RequestParam(value = "int64", required = false) Long int64,
         @RequestParam(value = "float", required = false) Float _float,
         @RequestParam(value = "string", required = false) String string,
         @RequestPart(value = "binary", required = false) MultipartFile binary,
         @RequestParam(value = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
         @RequestParam(value = "dateTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dateTime,
         @RequestParam(value = "password", required = false) String password,
         @RequestParam(value = "callback", required = false) String paramCallback
    );


    /**
     * GET /fake : To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return Invalid request (status code 400)
     *         or Not found (status code 404)
     */
    @HttpExchange(
        method = "GET",
        value = "/fake",
        accept = "application/json",
        contentType = "application/x-www-form-urlencoded"
    )
    ResponseEntity<Void> testEnumParameters(
         @RequestHeader(value = "enum_header_string_array", required = false) List<String> enumHeaderStringArray,
         @RequestHeader(value = "enum_header_string", required = false, defaultValue = "-efg") String enumHeaderString,
         @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,
         @RequestParam(value = "enum_query_string", required = false, defaultValue = "-efg") String enumQueryString,
         @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,
         @RequestParam(value = "enum_query_double", required = false) Double enumQueryDouble,
         @RequestPart(value = "enum_form_string_array", required = false) List<String> enumFormStringArray,
         @RequestParam(value = "enum_form_string", required = false) String enumFormString
    );


    /**
     * DELETE /fake : Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return Something wrong (status code 400)
     */
    @HttpExchange(
        method = "DELETE",
        value = "/fake",
        accept = "application/json"
    )
    ResponseEntity<Void> testGroupParameters(
         @RequestParam(value = "required_string_group", required = true) Integer requiredStringGroup,
         @RequestHeader(value = "required_boolean_group", required = true) Boolean requiredBooleanGroup,
         @RequestParam(value = "required_int64_group", required = true) Long requiredInt64Group,
         @RequestParam(value = "string_group", required = false) Integer stringGroup,
         @RequestHeader(value = "boolean_group", required = false) Boolean booleanGroup,
         @RequestParam(value = "int64_group", required = false) Long int64Group
    );


    /**
     * POST /fake/inline-additionalProperties : test inline additionalProperties
     * 
     *
     * @param requestBody request body (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "POST",
        value = "/fake/inline-additionalProperties",
        accept = "application/json",
        contentType = "application/json"
    )
    ResponseEntity<Void> testInlineAdditionalProperties(
         @RequestBody Map<String, String> requestBody
    );


    /**
     * GET /fake/jsonFormData : test json serialization of form data
     * 
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @return successful operation (status code 200)
     */
    @HttpExchange(
        method = "GET",
        value = "/fake/jsonFormData",
        accept = "application/json",
        contentType = "application/x-www-form-urlencoded"
    )
    ResponseEntity<Void> testJsonFormData(
         @RequestParam(value = "param", required = true) String param,
         @RequestParam(value = "param2", required = true) String param2
    );


    /**
     * PUT /fake/test-query-parameters
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     * @return Success (status code 200)
     */
    @HttpExchange(
        method = "PUT",
        value = "/fake/test-query-parameters",
        accept = "application/json"
    )
    ResponseEntity<Void> testQueryParameterCollectionFormat(
         @RequestParam(value = "pipe", required = true) List<String> pipe,
         @RequestParam(value = "http", required = true) List<String> http,
         @RequestParam(value = "url", required = true) List<String> url,
         @RequestParam(value = "context", required = true) List<String> context
    );

}
