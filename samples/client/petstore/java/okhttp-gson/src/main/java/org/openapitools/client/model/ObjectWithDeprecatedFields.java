/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.DeprecatedObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ObjectWithDeprecatedFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-amadeus")
public class ObjectWithDeprecatedFields {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_ID = "id";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_DEPRECATED_REF = "deprecatedRef";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_DEPRECATED_REF)
  private DeprecatedObject deprecatedRef;

  public static final String SERIALIZED_NAME_BARS = "bars";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_BARS)
  private List<String> bars;

  public ObjectWithDeprecatedFields() {
  }

  public ObjectWithDeprecatedFields uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Deprecated
  public ObjectWithDeprecatedFields id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  @Deprecated
  public void setId(BigDecimal id) {
    this.id = id;
  }


  @Deprecated
  public ObjectWithDeprecatedFields deprecatedRef(DeprecatedObject deprecatedRef) {
    this.deprecatedRef = deprecatedRef;
    return this;
  }

   /**
   * Get deprecatedRef
   * @return deprecatedRef
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public DeprecatedObject getDeprecatedRef() {
    return deprecatedRef;
  }

  @Deprecated
  public void setDeprecatedRef(DeprecatedObject deprecatedRef) {
    this.deprecatedRef = deprecatedRef;
  }


  @Deprecated
  public ObjectWithDeprecatedFields bars(List<String> bars) {
    this.bars = bars;
    return this;
  }

  public ObjectWithDeprecatedFields addBarsItem(String barsItem) {
    if (this.bars == null) {
      this.bars = new ArrayList<>();
    }
    this.bars.add(barsItem);
    return this;
  }

   /**
   * Get bars
   * @return bars
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public List<String> getBars() {
    return bars;
  }

  @Deprecated
  public void setBars(List<String> bars) {
    this.bars = bars;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ObjectWithDeprecatedFields instance itself
   */
  public ObjectWithDeprecatedFields putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectWithDeprecatedFields objectWithDeprecatedFields = (ObjectWithDeprecatedFields) o;
    return Objects.equals(this.uuid, objectWithDeprecatedFields.uuid) &&
        Objects.equals(this.id, objectWithDeprecatedFields.id) &&
        Objects.equals(this.deprecatedRef, objectWithDeprecatedFields.deprecatedRef) &&
        Objects.equals(this.bars, objectWithDeprecatedFields.bars)&&
        Objects.equals(this.additionalProperties, objectWithDeprecatedFields.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, id, deprecatedRef, bars, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWithDeprecatedFields {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deprecatedRef: ").append(toIndentedString(deprecatedRef)).append("\n");
    sb.append("    bars: ").append(toIndentedString(bars)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("uuid");
    openapiFields.add("id");
    openapiFields.add("deprecatedRef");
    openapiFields.add("bars");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ObjectWithDeprecatedFields
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ObjectWithDeprecatedFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjectWithDeprecatedFields is not found in the empty JSON string", ObjectWithDeprecatedFields.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `deprecatedRef`
      if (jsonObj.get("deprecatedRef") != null && !jsonObj.get("deprecatedRef").isJsonNull()) {
        DeprecatedObject.validateJsonElement(jsonObj.get("deprecatedRef"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bars") != null && !jsonObj.get("bars").isJsonNull() && !jsonObj.get("bars").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bars` to be an array in the JSON string but got `%s`", jsonObj.get("bars").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjectWithDeprecatedFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjectWithDeprecatedFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjectWithDeprecatedFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjectWithDeprecatedFields.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjectWithDeprecatedFields>() {
           @Override
           public void write(JsonWriter out, ObjectWithDeprecatedFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjectWithDeprecatedFields read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ObjectWithDeprecatedFields instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjectWithDeprecatedFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjectWithDeprecatedFields
  * @throws IOException if the JSON string is invalid with respect to ObjectWithDeprecatedFields
  */
  public static ObjectWithDeprecatedFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjectWithDeprecatedFields.class);
  }

 /**
  * Convert an instance of ObjectWithDeprecatedFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

