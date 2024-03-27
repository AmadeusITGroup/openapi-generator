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
import android.os.Parcelable;
import android.os.Parcel;

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
 * TypeHolderDefault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-amadeus")
public class TypeHolderDefault implements Parcelable {
  public static final String SERIALIZED_NAME_STRING_ITEM = "string_item";
  @SerializedName(SERIALIZED_NAME_STRING_ITEM)
  private String stringItem = "what";

  public static final String SERIALIZED_NAME_NUMBER_ITEM = "number_item";
  @SerializedName(SERIALIZED_NAME_NUMBER_ITEM)
  private BigDecimal numberItem;

  public static final String SERIALIZED_NAME_INTEGER_ITEM = "integer_item";
  @SerializedName(SERIALIZED_NAME_INTEGER_ITEM)
  private Integer integerItem;

  public static final String SERIALIZED_NAME_BOOL_ITEM = "bool_item";
  @SerializedName(SERIALIZED_NAME_BOOL_ITEM)
  private Boolean boolItem = true;

  public static final String SERIALIZED_NAME_ARRAY_ITEM = "array_item";
  @SerializedName(SERIALIZED_NAME_ARRAY_ITEM)
  private List<Integer> arrayItem = new ArrayList<>();

  public TypeHolderDefault() {
  }

  public TypeHolderDefault stringItem(String stringItem) {
    this.stringItem = stringItem;
    return this;
  }

   /**
   * Get stringItem
   * @return stringItem
  **/
  @javax.annotation.Nonnull
  public String getStringItem() {
    return stringItem;
  }

  public void setStringItem(String stringItem) {
    this.stringItem = stringItem;
  }


  public TypeHolderDefault numberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
    return this;
  }

   /**
   * Get numberItem
   * @return numberItem
  **/
  @javax.annotation.Nonnull
  public BigDecimal getNumberItem() {
    return numberItem;
  }

  public void setNumberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
  }


  public TypeHolderDefault integerItem(Integer integerItem) {
    this.integerItem = integerItem;
    return this;
  }

   /**
   * Get integerItem
   * @return integerItem
  **/
  @javax.annotation.Nonnull
  public Integer getIntegerItem() {
    return integerItem;
  }

  public void setIntegerItem(Integer integerItem) {
    this.integerItem = integerItem;
  }


  public TypeHolderDefault boolItem(Boolean boolItem) {
    this.boolItem = boolItem;
    return this;
  }

   /**
   * Get boolItem
   * @return boolItem
  **/
  @javax.annotation.Nonnull
  public Boolean getBoolItem() {
    return boolItem;
  }

  public void setBoolItem(Boolean boolItem) {
    this.boolItem = boolItem;
  }


  public TypeHolderDefault arrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
    return this;
  }

  public TypeHolderDefault addArrayItemItem(Integer arrayItemItem) {
    if (this.arrayItem == null) {
      this.arrayItem = new ArrayList<>();
    }
    this.arrayItem.add(arrayItemItem);
    return this;
  }

   /**
   * Get arrayItem
   * @return arrayItem
  **/
  @javax.annotation.Nonnull
  public List<Integer> getArrayItem() {
    return arrayItem;
  }

  public void setArrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderDefault typeHolderDefault = (TypeHolderDefault) o;
    return Objects.equals(this.stringItem, typeHolderDefault.stringItem) &&
        Objects.equals(this.numberItem, typeHolderDefault.numberItem) &&
        Objects.equals(this.integerItem, typeHolderDefault.integerItem) &&
        Objects.equals(this.boolItem, typeHolderDefault.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderDefault.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, integerItem, boolItem, arrayItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderDefault {\n");
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(stringItem);
    out.writeValue(numberItem);
    out.writeValue(integerItem);
    out.writeValue(boolItem);
    out.writeValue(arrayItem);
  }

  TypeHolderDefault(Parcel in) {
    stringItem = (String)in.readValue(null);
    numberItem = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    integerItem = (Integer)in.readValue(null);
    boolItem = (Boolean)in.readValue(null);
    arrayItem = (List<Integer>)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<TypeHolderDefault> CREATOR = new Parcelable.Creator<TypeHolderDefault>() {
    public TypeHolderDefault createFromParcel(Parcel in) {
      return new TypeHolderDefault(in);
    }
    public TypeHolderDefault[] newArray(int size) {
      return new TypeHolderDefault[size];
    }
  };

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("string_item");
    openapiFields.add("number_item");
    openapiFields.add("integer_item");
    openapiFields.add("bool_item");
    openapiFields.add("array_item");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("string_item");
    openapiRequiredFields.add("number_item");
    openapiRequiredFields.add("integer_item");
    openapiRequiredFields.add("bool_item");
    openapiRequiredFields.add("array_item");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TypeHolderDefault
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TypeHolderDefault.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TypeHolderDefault is not found in the empty JSON string", TypeHolderDefault.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TypeHolderDefault.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TypeHolderDefault` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TypeHolderDefault.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("string_item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_item").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("array_item") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("array_item").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_item` to be an array in the JSON string but got `%s`", jsonObj.get("array_item").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TypeHolderDefault.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TypeHolderDefault' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TypeHolderDefault> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TypeHolderDefault.class));

       return (TypeAdapter<T>) new TypeAdapter<TypeHolderDefault>() {
           @Override
           public void write(JsonWriter out, TypeHolderDefault value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TypeHolderDefault read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TypeHolderDefault given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TypeHolderDefault
  * @throws IOException if the JSON string is invalid with respect to TypeHolderDefault
  */
  public static TypeHolderDefault fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TypeHolderDefault.class);
  }

 /**
  * Convert an instance of TypeHolderDefault to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

