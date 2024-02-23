package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OuterEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EnumTest  {
  
public enum EnumString {

UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("lower")), EMPTY(String.valueOf(""));


    private String value;

    EnumString (String v) {
        value = v;
    }

    public String value() {
        return value;
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

  @ApiModelProperty(value = "")
  private EnumString enumString;

public enum EnumStringRequired {

UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("lower")), EMPTY(String.valueOf(""));


    private String value;

    EnumStringRequired (String v) {
        value = v;
    }

    public String value() {
        return value;
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

  @ApiModelProperty(required = true, value = "")
  private EnumStringRequired enumStringRequired;

public enum EnumInteger {

NUMBER_1(Integer.valueOf(1)), NUMBER_MINUS_1(Integer.valueOf(-1));


    private Integer value;

    EnumInteger (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
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

  @ApiModelProperty(value = "")
  private EnumInteger enumInteger;

public enum EnumNumber {

NUMBER_1_DOT_1(Double.valueOf(1.1)), NUMBER_MINUS_1_DOT_2(Double.valueOf(-1.2));


    private Double value;

    EnumNumber (Double v) {
        value = v;
    }

    public Double value() {
        return value;
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

  @ApiModelProperty(value = "")
  private EnumNumber enumNumber;

  @ApiModelProperty(value = "")
  @Valid
  private OuterEnum outerEnum;
 /**
   * Get enumString
   * @return enumString
  **/
  @JsonProperty("enum_string")
  public String getEnumString() {
    if (enumString == null) {
      return null;
    }
    return enumString.value();
  }

  public void setEnumString(EnumString enumString) {
    this.enumString = enumString;
  }

  public EnumTest enumString(EnumString enumString) {
    this.enumString = enumString;
    return this;
  }

 /**
   * Get enumStringRequired
   * @return enumStringRequired
  **/
  @JsonProperty("enum_string_required")
  @NotNull
  public String getEnumStringRequired() {
    if (enumStringRequired == null) {
      return null;
    }
    return enumStringRequired.value();
  }

  public void setEnumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }

  public EnumTest enumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
    return this;
  }

 /**
   * Get enumInteger
   * @return enumInteger
  **/
  @JsonProperty("enum_integer")
  public Integer getEnumInteger() {
    if (enumInteger == null) {
      return null;
    }
    return enumInteger.value();
  }

  public void setEnumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
  }

  public EnumTest enumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

 /**
   * Get enumNumber
   * @return enumNumber
  **/
  @JsonProperty("enum_number")
  public Double getEnumNumber() {
    if (enumNumber == null) {
      return null;
    }
    return enumNumber.value();
  }

  public void setEnumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
  }

  public EnumTest enumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

 /**
   * Get outerEnum
   * @return outerEnum
  **/
  @JsonProperty("outerEnum")
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }

  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }

  public EnumTest outerEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
    return this;
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
    return Objects.equals(enumString, enumTest.enumString) &&
        Objects.equals(enumStringRequired, enumTest.enumStringRequired) &&
        Objects.equals(enumInteger, enumTest.enumInteger) &&
        Objects.equals(enumNumber, enumTest.enumNumber) &&
        Objects.equals(outerEnum, enumTest.outerEnum);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

