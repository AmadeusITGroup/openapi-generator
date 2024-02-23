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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OuterEnum;
import org.openapitools.model.OuterEnumDefaultValue;
import org.openapitools.model.OuterEnumInteger;
import org.openapitools.model.OuterEnumIntegerDefaultValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * EnumTest
 */
@JsonPropertyOrder({
  EnumTest.JSON_PROPERTY_ENUM_STRING,
  EnumTest.JSON_PROPERTY_ENUM_STRING_REQUIRED,
  EnumTest.JSON_PROPERTY_ENUM_INTEGER,
  EnumTest.JSON_PROPERTY_ENUM_NUMBER,
  EnumTest.JSON_PROPERTY_OUTER_ENUM,
  EnumTest.JSON_PROPERTY_OUTER_ENUM_INTEGER,
  EnumTest.JSON_PROPERTY_OUTER_ENUM_DEFAULT_VALUE,
  EnumTest.JSON_PROPERTY_OUTER_ENUM_INTEGER_DEFAULT_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class EnumTest   {
  /**
   * Gets or Sets enumString
   */
  public enum EnumString {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumString(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumString fromValue(String value) {
      for (EnumString b : EnumString.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENUM_STRING = "enum_string";
  @JsonProperty(JSON_PROPERTY_ENUM_STRING)
  private EnumString enumString;

  /**
   * Gets or Sets enumStringRequired
   */
  public enum EnumStringRequired {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumStringRequired(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumStringRequired fromValue(String value) {
      for (EnumStringRequired b : EnumStringRequired.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENUM_STRING_REQUIRED = "enum_string_required";
  @JsonProperty(JSON_PROPERTY_ENUM_STRING_REQUIRED)
  private EnumStringRequired enumStringRequired;

  /**
   * Gets or Sets enumInteger
   */
  public enum EnumInteger {
    NUMBER_1(1),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    EnumInteger(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumInteger fromValue(Integer value) {
      for (EnumInteger b : EnumInteger.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENUM_INTEGER = "enum_integer";
  @JsonProperty(JSON_PROPERTY_ENUM_INTEGER)
  private EnumInteger enumInteger;

  /**
   * Gets or Sets enumNumber
   */
  public enum EnumNumber {
    NUMBER_1_DOT_1(1.1),
    
    NUMBER_MINUS_1_DOT_2(-1.2);

    private Double value;

    EnumNumber(Double value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumNumber fromValue(Double value) {
      for (EnumNumber b : EnumNumber.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENUM_NUMBER = "enum_number";
  @JsonProperty(JSON_PROPERTY_ENUM_NUMBER)
  private EnumNumber enumNumber;

  public static final String JSON_PROPERTY_OUTER_ENUM = "outerEnum";
  @JsonProperty(JSON_PROPERTY_OUTER_ENUM)
  private OuterEnum outerEnum;

  public static final String JSON_PROPERTY_OUTER_ENUM_INTEGER = "outerEnumInteger";
  @JsonProperty(JSON_PROPERTY_OUTER_ENUM_INTEGER)
  private OuterEnumInteger outerEnumInteger;

  public static final String JSON_PROPERTY_OUTER_ENUM_DEFAULT_VALUE = "outerEnumDefaultValue";
  @JsonProperty(JSON_PROPERTY_OUTER_ENUM_DEFAULT_VALUE)
  private OuterEnumDefaultValue outerEnumDefaultValue = OuterEnumDefaultValue.PLACED;

  public static final String JSON_PROPERTY_OUTER_ENUM_INTEGER_DEFAULT_VALUE = "outerEnumIntegerDefaultValue";
  @JsonProperty(JSON_PROPERTY_OUTER_ENUM_INTEGER_DEFAULT_VALUE)
  private OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue = OuterEnumIntegerDefaultValue.NUMBER_0;

  public EnumTest enumString(EnumString enumString) {
    this.enumString = enumString;
    return this;
  }

  /**
   * Get enumString
   * @return enumString
   **/
  @JsonProperty(value = "enum_string")
  @ApiModelProperty(value = "")
  
  public EnumString getEnumString() {
    return enumString;
  }

  public void setEnumString(EnumString enumString) {
    this.enumString = enumString;
  }

  public EnumTest enumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
    return this;
  }

  /**
   * Get enumStringRequired
   * @return enumStringRequired
   **/
  @JsonProperty(value = "enum_string_required")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public EnumStringRequired getEnumStringRequired() {
    return enumStringRequired;
  }

  public void setEnumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }

  public EnumTest enumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

  /**
   * Get enumInteger
   * @return enumInteger
   **/
  @JsonProperty(value = "enum_integer")
  @ApiModelProperty(value = "")
  
  public EnumInteger getEnumInteger() {
    return enumInteger;
  }

  public void setEnumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
  }

  public EnumTest enumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

  /**
   * Get enumNumber
   * @return enumNumber
   **/
  @JsonProperty(value = "enum_number")
  @ApiModelProperty(value = "")
  
  public EnumNumber getEnumNumber() {
    return enumNumber;
  }

  public void setEnumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
  }

  public EnumTest outerEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
    return this;
  }

  /**
   * Get outerEnum
   * @return outerEnum
   **/
  @JsonProperty(value = "outerEnum")
  @ApiModelProperty(value = "")
  @Valid 
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }

  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }

  public EnumTest outerEnumInteger(OuterEnumInteger outerEnumInteger) {
    this.outerEnumInteger = outerEnumInteger;
    return this;
  }

  /**
   * Get outerEnumInteger
   * @return outerEnumInteger
   **/
  @JsonProperty(value = "outerEnumInteger")
  @ApiModelProperty(value = "")
  @Valid 
  public OuterEnumInteger getOuterEnumInteger() {
    return outerEnumInteger;
  }

  public void setOuterEnumInteger(OuterEnumInteger outerEnumInteger) {
    this.outerEnumInteger = outerEnumInteger;
  }

  public EnumTest outerEnumDefaultValue(OuterEnumDefaultValue outerEnumDefaultValue) {
    this.outerEnumDefaultValue = outerEnumDefaultValue;
    return this;
  }

  /**
   * Get outerEnumDefaultValue
   * @return outerEnumDefaultValue
   **/
  @JsonProperty(value = "outerEnumDefaultValue")
  @ApiModelProperty(value = "")
  @Valid 
  public OuterEnumDefaultValue getOuterEnumDefaultValue() {
    return outerEnumDefaultValue;
  }

  public void setOuterEnumDefaultValue(OuterEnumDefaultValue outerEnumDefaultValue) {
    this.outerEnumDefaultValue = outerEnumDefaultValue;
  }

  public EnumTest outerEnumIntegerDefaultValue(OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue) {
    this.outerEnumIntegerDefaultValue = outerEnumIntegerDefaultValue;
    return this;
  }

  /**
   * Get outerEnumIntegerDefaultValue
   * @return outerEnumIntegerDefaultValue
   **/
  @JsonProperty(value = "outerEnumIntegerDefaultValue")
  @ApiModelProperty(value = "")
  @Valid 
  public OuterEnumIntegerDefaultValue getOuterEnumIntegerDefaultValue() {
    return outerEnumIntegerDefaultValue;
  }

  public void setOuterEnumIntegerDefaultValue(OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue) {
    this.outerEnumIntegerDefaultValue = outerEnumIntegerDefaultValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTest enumTest = (EnumTest) o;
    return Objects.equals(this.enumString, enumTest.enumString) &&
        Objects.equals(this.enumStringRequired, enumTest.enumStringRequired) &&
        Objects.equals(this.enumInteger, enumTest.enumInteger) &&
        Objects.equals(this.enumNumber, enumTest.enumNumber) &&
        Objects.equals(this.outerEnum, enumTest.outerEnum) &&
        Objects.equals(this.outerEnumInteger, enumTest.outerEnumInteger) &&
        Objects.equals(this.outerEnumDefaultValue, enumTest.outerEnumDefaultValue) &&
        Objects.equals(this.outerEnumIntegerDefaultValue, enumTest.outerEnumIntegerDefaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumStringRequired, enumInteger, enumNumber, outerEnum, outerEnumInteger, outerEnumDefaultValue, outerEnumIntegerDefaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTest {\n");
    
    sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
    sb.append("    enumStringRequired: ").append(toIndentedString(enumStringRequired)).append("\n");
    sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
    sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
    sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
    sb.append("    outerEnumInteger: ").append(toIndentedString(outerEnumInteger)).append("\n");
    sb.append("    outerEnumDefaultValue: ").append(toIndentedString(outerEnumDefaultValue)).append("\n");
    sb.append("    outerEnumIntegerDefaultValue: ").append(toIndentedString(outerEnumIntegerDefaultValue)).append("\n");
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
}

