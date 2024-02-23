package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OuterEnum;

/**
 * EnumTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
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
    public static EnumString fromValue(String text) {
      for (EnumString b : EnumString.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("enum_string")
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
    public static EnumStringRequired fromValue(String text) {
      for (EnumStringRequired b : EnumStringRequired.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("enum_string_required")
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
    public static EnumInteger fromValue(String text) {
      for (EnumInteger b : EnumInteger.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("enum_integer")
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
    public static EnumNumber fromValue(String text) {
      for (EnumNumber b : EnumNumber.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("enum_number")
  private EnumNumber enumNumber;

  @JsonProperty("outerEnum")
  private OuterEnum outerEnum;

  public EnumTest enumString(EnumString enumString) {
    this.enumString = enumString;
    return this;
  }

   /**
   * Get enumString
   * @return enumString
  **/
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(value = "")
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }

  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
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
        Objects.equals(this.outerEnum, enumTest.outerEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumStringRequired, enumInteger, enumNumber, outerEnum);
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

