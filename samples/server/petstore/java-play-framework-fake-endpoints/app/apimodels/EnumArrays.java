package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * EnumArrays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EnumArrays   {
  /**
   * Gets or Sets justSymbol
   */
  public enum JustSymbol {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    DOLLAR("$");

    private final String value;

    JustSymbol(String value) {
      this.value = value;
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

  @JsonProperty("just_symbol")
  
  private JustSymbol justSymbol;

  /**
   * Gets or Sets arrayEnum
   */
  public enum ArrayEnum {
    FISH("fish"),
    
    CRAB("crab");

    private final String value;

    ArrayEnum(String value) {
      this.value = value;
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
      this.arrayEnum = new ArrayList<>();
    }
    this.arrayEnum.add(arrayEnumItem);
    return this;
  }

   /**
   * Get arrayEnum
   * @return arrayEnum
  **/
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
    return Objects.equals(justSymbol, enumArrays.justSymbol) &&
        Objects.equals(arrayEnum, enumArrays.arrayEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justSymbol, arrayEnum);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

