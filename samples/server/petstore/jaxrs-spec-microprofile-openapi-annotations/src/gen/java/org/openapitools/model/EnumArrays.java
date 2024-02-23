/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:47.530Z[UTC]
 */

package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@org.eclipse.microprofile.openapi.annotations.media.Schema(description="")
@JsonTypeName("EnumArrays")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EnumArrays  implements Serializable {
  

public enum JustSymbol {

    GREATER_THAN_OR_EQUAL_TO(String.valueOf(">=")), __(String.valueOf("__"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static JustSymbol fromString(String s) {
        for (JustSymbol b : JustSymbol.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  
  private @Valid JustSymbol justSymbol;


public enum ArrayEnum {

    FISH(String.valueOf("FISH")), CRAB(String.valueOf("CRAB"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static ArrayEnum fromString(String s) {
        for (ArrayEnum b : ArrayEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  
  private @Valid List<ArrayEnum> arrayEnum;

  

  protected EnumArrays(EnumArraysBuilder<?, ?> b) {
    this.justSymbol = b.justSymbol;
    this.arrayEnum = b.arrayEnum;
  }

  public EnumArrays() {
  }

  /**
   **/
  public EnumArrays justSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("just_symbol")
  public JustSymbol getJustSymbol() {
    return justSymbol;
  }

  @JsonProperty("just_symbol")
  public void setJustSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
  }

  /**
   **/
  public EnumArrays arrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("array_enum")
  public List<ArrayEnum> getArrayEnum() {
    return arrayEnum;
  }

  @JsonProperty("array_enum")
  public void setArrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }

  public EnumArrays addArrayEnumItem(ArrayEnum arrayEnumItem) {
    if (this.arrayEnum == null) {
      this.arrayEnum = new ArrayList<>();
    }

    this.arrayEnum.add(arrayEnumItem);
    return this;
  }

  public EnumArrays removeArrayEnumItem(ArrayEnum arrayEnumItem) {
    if (arrayEnumItem != null && this.arrayEnum != null) {
      this.arrayEnum.remove(arrayEnumItem);
    }

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


  public static EnumArraysBuilder<?, ?> builder() {
    return new EnumArraysBuilderImpl();
  }

  private static final class EnumArraysBuilderImpl extends EnumArraysBuilder<EnumArrays, EnumArraysBuilderImpl> {

    @Override
    protected EnumArraysBuilderImpl self() {
      return this;
    }

    @Override
    public EnumArrays build() {
      return new EnumArrays(this);
    }
  }

  public static abstract class EnumArraysBuilder<C extends EnumArrays, B extends EnumArraysBuilder<C, B>>  {
    private JustSymbol justSymbol;
    private List<ArrayEnum> arrayEnum;
    protected abstract B self();

    public abstract C build();

    public B justSymbol(JustSymbol justSymbol) {
      this.justSymbol = justSymbol;
      return self();
    }
    public B arrayEnum(List<ArrayEnum> arrayEnum) {
      this.arrayEnum = arrayEnum;
      return self();
    }
  }

  
}

