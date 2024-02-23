/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:40.991Z[UTC]
 *
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.jackson.nullable.JsonNullable;

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
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * to test the default value of properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultValue {
  public static final String SERIALIZED_NAME_ARRAY_STRING_ENUM_REF_DEFAULT = "array_string_enum_ref_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_ENUM_REF_DEFAULT)
  private List<StringEnumRef> arrayStringEnumRefDefault = new ArrayList<>(Arrays.asList(StringEnumRef.SUCCESS, StringEnumRef.FAILURE));

  /**
   * Gets or Sets arrayStringEnumDefault
   */
  @JsonAdapter(ArrayStringEnumDefault.Adapter.class)
  public enum ArrayStringEnumDefault {
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    UNCLASSIFIED("unclassified");

    private String value;

    ArrayStringEnumDefault(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArrayStringEnumDefault fromValue(String value) {
      for (ArrayStringEnumDefault b : ArrayStringEnumDefault.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArrayStringEnumDefault> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArrayStringEnumDefault enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArrayStringEnumDefault read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArrayStringEnumDefault.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARRAY_STRING_ENUM_DEFAULT = "array_string_enum_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_ENUM_DEFAULT)
  private List<ArrayStringEnumDefault> arrayStringEnumDefault = new ArrayList<>(Arrays.asList(ArrayStringEnumDefault.SUCCESS, ArrayStringEnumDefault.FAILURE));

  public static final String SERIALIZED_NAME_ARRAY_STRING_DEFAULT = "array_string_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_DEFAULT)
  private List<String> arrayStringDefault = new ArrayList<>(Arrays.asList("failure", "skipped"));

  public static final String SERIALIZED_NAME_ARRAY_INTEGER_DEFAULT = "array_integer_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_INTEGER_DEFAULT)
  private List<Integer> arrayIntegerDefault = new ArrayList<>(Arrays.asList(1, 3));

  public static final String SERIALIZED_NAME_ARRAY_STRING = "array_string";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING)
  private List<String> arrayString;

  public static final String SERIALIZED_NAME_ARRAY_STRING_NULLABLE = "array_string_nullable";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_NULLABLE)
  private List<String> arrayStringNullable;

  public static final String SERIALIZED_NAME_ARRAY_STRING_EXTENSION_NULLABLE = "array_string_extension_nullable";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_EXTENSION_NULLABLE)
  private List<String> arrayStringExtensionNullable;

  public static final String SERIALIZED_NAME_STRING_NULLABLE = "string_nullable";
  @SerializedName(SERIALIZED_NAME_STRING_NULLABLE)
  private String stringNullable;

  public DefaultValue() {
  }

  public DefaultValue arrayStringEnumRefDefault(List<StringEnumRef> arrayStringEnumRefDefault) {
    
    this.arrayStringEnumRefDefault = arrayStringEnumRefDefault;
    return this;
  }

  public DefaultValue addArrayStringEnumRefDefaultItem(StringEnumRef arrayStringEnumRefDefaultItem) {
    if (this.arrayStringEnumRefDefault == null) {
      this.arrayStringEnumRefDefault = new ArrayList<>(Arrays.asList(StringEnumRef.SUCCESS, StringEnumRef.FAILURE));
    }
    this.arrayStringEnumRefDefault.add(arrayStringEnumRefDefaultItem);
    return this;
  }

   /**
   * Get arrayStringEnumRefDefault
   * @return arrayStringEnumRefDefault
  **/
  @javax.annotation.Nullable
  public List<StringEnumRef> getArrayStringEnumRefDefault() {
    return arrayStringEnumRefDefault;
  }


  public void setArrayStringEnumRefDefault(List<StringEnumRef> arrayStringEnumRefDefault) {
    this.arrayStringEnumRefDefault = arrayStringEnumRefDefault;
  }


  public DefaultValue arrayStringEnumDefault(List<ArrayStringEnumDefault> arrayStringEnumDefault) {
    
    this.arrayStringEnumDefault = arrayStringEnumDefault;
    return this;
  }

  public DefaultValue addArrayStringEnumDefaultItem(ArrayStringEnumDefault arrayStringEnumDefaultItem) {
    if (this.arrayStringEnumDefault == null) {
      this.arrayStringEnumDefault = new ArrayList<>(Arrays.asList(ArrayStringEnumDefault.SUCCESS, ArrayStringEnumDefault.FAILURE));
    }
    this.arrayStringEnumDefault.add(arrayStringEnumDefaultItem);
    return this;
  }

   /**
   * Get arrayStringEnumDefault
   * @return arrayStringEnumDefault
  **/
  @javax.annotation.Nullable
  public List<ArrayStringEnumDefault> getArrayStringEnumDefault() {
    return arrayStringEnumDefault;
  }


  public void setArrayStringEnumDefault(List<ArrayStringEnumDefault> arrayStringEnumDefault) {
    this.arrayStringEnumDefault = arrayStringEnumDefault;
  }


  public DefaultValue arrayStringDefault(List<String> arrayStringDefault) {
    
    this.arrayStringDefault = arrayStringDefault;
    return this;
  }

  public DefaultValue addArrayStringDefaultItem(String arrayStringDefaultItem) {
    if (this.arrayStringDefault == null) {
      this.arrayStringDefault = new ArrayList<>(Arrays.asList("failure", "skipped"));
    }
    this.arrayStringDefault.add(arrayStringDefaultItem);
    return this;
  }

   /**
   * Get arrayStringDefault
   * @return arrayStringDefault
  **/
  @javax.annotation.Nullable
  public List<String> getArrayStringDefault() {
    return arrayStringDefault;
  }


  public void setArrayStringDefault(List<String> arrayStringDefault) {
    this.arrayStringDefault = arrayStringDefault;
  }


  public DefaultValue arrayIntegerDefault(List<Integer> arrayIntegerDefault) {
    
    this.arrayIntegerDefault = arrayIntegerDefault;
    return this;
  }

  public DefaultValue addArrayIntegerDefaultItem(Integer arrayIntegerDefaultItem) {
    if (this.arrayIntegerDefault == null) {
      this.arrayIntegerDefault = new ArrayList<>(Arrays.asList(1, 3));
    }
    this.arrayIntegerDefault.add(arrayIntegerDefaultItem);
    return this;
  }

   /**
   * Get arrayIntegerDefault
   * @return arrayIntegerDefault
  **/
  @javax.annotation.Nullable
  public List<Integer> getArrayIntegerDefault() {
    return arrayIntegerDefault;
  }


  public void setArrayIntegerDefault(List<Integer> arrayIntegerDefault) {
    this.arrayIntegerDefault = arrayIntegerDefault;
  }


  public DefaultValue arrayString(List<String> arrayString) {
    
    this.arrayString = arrayString;
    return this;
  }

  public DefaultValue addArrayStringItem(String arrayStringItem) {
    if (this.arrayString == null) {
      this.arrayString = new ArrayList<>();
    }
    this.arrayString.add(arrayStringItem);
    return this;
  }

   /**
   * Get arrayString
   * @return arrayString
  **/
  @javax.annotation.Nullable
  public List<String> getArrayString() {
    return arrayString;
  }


  public void setArrayString(List<String> arrayString) {
    this.arrayString = arrayString;
  }


  public DefaultValue arrayStringNullable(List<String> arrayStringNullable) {
    
    this.arrayStringNullable = arrayStringNullable;
    return this;
  }

  public DefaultValue addArrayStringNullableItem(String arrayStringNullableItem) {
    if (this.arrayStringNullable == null) {
      this.arrayStringNullable = new ArrayList<>();
    }
    this.arrayStringNullable.add(arrayStringNullableItem);
    return this;
  }

   /**
   * Get arrayStringNullable
   * @return arrayStringNullable
  **/
  @javax.annotation.Nullable
  public List<String> getArrayStringNullable() {
    return arrayStringNullable;
  }


  public void setArrayStringNullable(List<String> arrayStringNullable) {
    this.arrayStringNullable = arrayStringNullable;
  }


  public DefaultValue arrayStringExtensionNullable(List<String> arrayStringExtensionNullable) {
    
    this.arrayStringExtensionNullable = arrayStringExtensionNullable;
    return this;
  }

  public DefaultValue addArrayStringExtensionNullableItem(String arrayStringExtensionNullableItem) {
    if (this.arrayStringExtensionNullable == null) {
      this.arrayStringExtensionNullable = new ArrayList<>();
    }
    this.arrayStringExtensionNullable.add(arrayStringExtensionNullableItem);
    return this;
  }

   /**
   * Get arrayStringExtensionNullable
   * @return arrayStringExtensionNullable
  **/
  @javax.annotation.Nullable
  public List<String> getArrayStringExtensionNullable() {
    return arrayStringExtensionNullable;
  }


  public void setArrayStringExtensionNullable(List<String> arrayStringExtensionNullable) {
    this.arrayStringExtensionNullable = arrayStringExtensionNullable;
  }


  public DefaultValue stringNullable(String stringNullable) {
    
    this.stringNullable = stringNullable;
    return this;
  }

   /**
   * Get stringNullable
   * @return stringNullable
  **/
  @javax.annotation.Nullable
  public String getStringNullable() {
    return stringNullable;
  }


  public void setStringNullable(String stringNullable) {
    this.stringNullable = stringNullable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultValue defaultValue = (DefaultValue) o;
    return Objects.equals(this.arrayStringEnumRefDefault, defaultValue.arrayStringEnumRefDefault) &&
        Objects.equals(this.arrayStringEnumDefault, defaultValue.arrayStringEnumDefault) &&
        Objects.equals(this.arrayStringDefault, defaultValue.arrayStringDefault) &&
        Objects.equals(this.arrayIntegerDefault, defaultValue.arrayIntegerDefault) &&
        Objects.equals(this.arrayString, defaultValue.arrayString) &&
        Objects.equals(this.arrayStringNullable, defaultValue.arrayStringNullable) &&
        Objects.equals(this.arrayStringExtensionNullable, defaultValue.arrayStringExtensionNullable) &&
        Objects.equals(this.stringNullable, defaultValue.stringNullable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayStringEnumRefDefault, arrayStringEnumDefault, arrayStringDefault, arrayIntegerDefault, arrayString, arrayStringNullable, arrayStringExtensionNullable, stringNullable);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultValue {\n");
    sb.append("    arrayStringEnumRefDefault: ").append(toIndentedString(arrayStringEnumRefDefault)).append("\n");
    sb.append("    arrayStringEnumDefault: ").append(toIndentedString(arrayStringEnumDefault)).append("\n");
    sb.append("    arrayStringDefault: ").append(toIndentedString(arrayStringDefault)).append("\n");
    sb.append("    arrayIntegerDefault: ").append(toIndentedString(arrayIntegerDefault)).append("\n");
    sb.append("    arrayString: ").append(toIndentedString(arrayString)).append("\n");
    sb.append("    arrayStringNullable: ").append(toIndentedString(arrayStringNullable)).append("\n");
    sb.append("    arrayStringExtensionNullable: ").append(toIndentedString(arrayStringExtensionNullable)).append("\n");
    sb.append("    stringNullable: ").append(toIndentedString(stringNullable)).append("\n");
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
    openapiFields.add("array_string_enum_ref_default");
    openapiFields.add("array_string_enum_default");
    openapiFields.add("array_string_default");
    openapiFields.add("array_integer_default");
    openapiFields.add("array_string");
    openapiFields.add("array_string_nullable");
    openapiFields.add("array_string_extension_nullable");
    openapiFields.add("string_nullable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DefaultValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DefaultValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultValue is not found in the empty JSON string", DefaultValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DefaultValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DefaultValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_string_enum_ref_default") != null && !jsonObj.get("array_string_enum_ref_default").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_string_enum_ref_default` to be an array in the JSON string but got `%s`", jsonObj.get("array_string_enum_ref_default").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_string_enum_default") != null && !jsonObj.get("array_string_enum_default").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_string_enum_default` to be an array in the JSON string but got `%s`", jsonObj.get("array_string_enum_default").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_string_default") != null && !jsonObj.get("array_string_default").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_string_default` to be an array in the JSON string but got `%s`", jsonObj.get("array_string_default").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_integer_default") != null && !jsonObj.get("array_integer_default").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_integer_default` to be an array in the JSON string but got `%s`", jsonObj.get("array_integer_default").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_string") != null && !jsonObj.get("array_string").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_string` to be an array in the JSON string but got `%s`", jsonObj.get("array_string").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_string_nullable") != null && !jsonObj.get("array_string_nullable").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_string_nullable` to be an array in the JSON string but got `%s`", jsonObj.get("array_string_nullable").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_string_extension_nullable") != null && !jsonObj.get("array_string_extension_nullable").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_string_extension_nullable` to be an array in the JSON string but got `%s`", jsonObj.get("array_string_extension_nullable").toString()));
      }
      if ((jsonObj.get("string_nullable") != null && !jsonObj.get("string_nullable").isJsonNull()) && !jsonObj.get("string_nullable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_nullable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_nullable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultValue.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultValue>() {
           @Override
           public void write(JsonWriter out, DefaultValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DefaultValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DefaultValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DefaultValue
  * @throws IOException if the JSON string is invalid with respect to DefaultValue
  */
  public static DefaultValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultValue.class);
  }

 /**
  * Convert an instance of DefaultValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

