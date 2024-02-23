package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * EnumArrays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class EnumArrays   {
  /**
   * Gets or Sets justSymbol
   */
  public enum JustSymbol {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    DOLLAR("$");

    private String value;

    JustSymbol(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JustSymbol fromValue(String text) {
      for (JustSymbol b : JustSymbol.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("just_symbol")
  private JustSymbol justSymbol;

  /**
   * Gets or Sets arrayEnum
   */
  public enum ArrayEnum {
    FISH("fish"),
    
    CRAB("crab");

    private String value;

    ArrayEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrayEnum fromValue(String text) {
      for (ArrayEnum b : ArrayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("array_enum")
  private List<ArrayEnum> arrayEnum = null;

  public EnumArrays justSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
    return this;
  }

   /**
   * Get justSymbol
   * @return justSymbol
  **/
  @ApiModelProperty(value = "")
  public JustSymbol getJustSymbol() {
    return justSymbol;
  }

  public void setJustSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
  }

  public EnumArrays arrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
    return this;
  }

  public EnumArrays addArrayEnumItem(ArrayEnum arrayEnumItem) {
    if (this.arrayEnum == null) {
      this.arrayEnum = ;
    }
    this.arrayEnum.add(arrayEnumItem);
    return this;
  }

   /**
   * Get arrayEnum
   * @return arrayEnum
  **/
  @ApiModelProperty(value = "")
  public List<ArrayEnum> getArrayEnum() {
    return arrayEnum;
  }

  public void setArrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
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
    return Objects.equals(this.justSymbol, enumArrays.justSymbol) &&
        Objects.equals(this.arrayEnum, enumArrays.arrayEnum);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

