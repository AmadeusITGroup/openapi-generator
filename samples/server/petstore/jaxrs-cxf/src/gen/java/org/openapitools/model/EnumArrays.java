package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EnumArrays  {
  
public enum JustSymbol {

GREATER_THAN_OR_EQUAL_TO(String.valueOf(">=")), DOLLAR(String.valueOf("$"));


    private String value;

    JustSymbol (String v) {
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
    public static JustSymbol fromValue(String value) {
        for (JustSymbol b : JustSymbol.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private JustSymbol justSymbol;

public enum ArrayEnum {

FISH(String.valueOf("fish")), CRAB(String.valueOf("crab"));


    private String value;

    ArrayEnum (String v) {
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
    public static ArrayEnum fromValue(String value) {
        for (ArrayEnum b : ArrayEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private List<ArrayEnum> arrayEnum;
 /**
   * Get justSymbol
   * @return justSymbol
  **/
  @JsonProperty("just_symbol")
  public String getJustSymbol() {
    if (justSymbol == null) {
      return null;
    }
    return justSymbol.value();
  }

  public void setJustSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
  }

  public EnumArrays justSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
    return this;
  }

 /**
   * Get arrayEnum
   * @return arrayEnum
  **/
  @JsonProperty("array_enum")
  public List<ArrayEnum> getArrayEnum() {
    return arrayEnum;
  }

  public void setArrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }

  public EnumArrays arrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
    return this;
  }

  public EnumArrays addArrayEnumItem(ArrayEnum arrayEnumItem) {
    this.arrayEnum.add(arrayEnumItem);
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
    EnumArrays enumArrays = (EnumArrays) o;
    return Objects.equals(justSymbol, enumArrays.justSymbol) &&
        Objects.equals(arrayEnum, enumArrays.arrayEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justSymbol, arrayEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumArrays {\n");
    
    sb.append("    justSymbol: ").append(toIndentedString(justSymbol)).append("\n");
    sb.append("    arrayEnum: ").append(toIndentedString(arrayEnum)).append("\n");
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

