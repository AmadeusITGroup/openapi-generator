/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:47.691Z[UTC]
 */

package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OuterEnum;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;
import java.util.Map;



@JsonTypeName("Enum_Test")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EnumTest  implements Serializable {
  

public enum EnumString {

    UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("LOWER")), EMPTY(String.valueOf(""));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static EnumString fromString(String s) {
        for (EnumString b : EnumString.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  
  private @Valid EnumString enumString;


public enum EnumStringRequired {

    UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("LOWER")), EMPTY(String.valueOf(""));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static EnumStringRequired fromString(String s) {
        for (EnumStringRequired b : EnumStringRequired.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  
  private @Valid EnumStringRequired enumStringRequired;


public enum EnumInteger {

    NUMBER_1(Integer.valueOf(1)), NUMBER__1(Integer.valueOf(_1));


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

    /**
     * Convert a String into Integer, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static EnumInteger fromString(String s) {
        for (EnumInteger b : EnumInteger.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  
  private @Valid EnumInteger enumInteger;


public enum EnumNumber {

    NUMBER_1/1(Double.valueOf(1/1)), NUMBER__1/2(Double.valueOf(_1/2));


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

    /**
     * Convert a String into Double, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static EnumNumber fromString(String s) {
        for (EnumNumber b : EnumNumber.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  
  private @Valid EnumNumber enumNumber;

  
  private @Valid OuterEnum outerEnum;

  

  protected EnumTest(EnumTestBuilder<?, ?> b) {
    this.enumString = b.enumString;
    this.enumStringRequired = b.enumStringRequired;
    this.enumInteger = b.enumInteger;
    this.enumNumber = b.enumNumber;
    this.outerEnum = b.outerEnum;
  }

  public EnumTest() {
  }

  /**
   **/
  public EnumTest enumString(EnumString enumString) {
    this.enumString = enumString;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("enum_string")
  public EnumString getEnumString() {
    return enumString;
  }

  @JsonProperty("enum_string")
  public void setEnumString(EnumString enumString) {
    this.enumString = enumString;
  }

  /**
   **/
  public EnumTest enumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
    return this;
  }

  
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("enum_string_required")
  @NotNull
  public EnumStringRequired getEnumStringRequired() {
    return enumStringRequired;
  }

  @JsonProperty("enum_string_required")
  public void setEnumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }

  /**
   **/
  public EnumTest enumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("enum_integer")
  public EnumInteger getEnumInteger() {
    return enumInteger;
  }

  @JsonProperty("enum_integer")
  public void setEnumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
  }

  /**
   **/
  public EnumTest enumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("enum_number")
  public EnumNumber getEnumNumber() {
    return enumNumber;
  }

  @JsonProperty("enum_number")
  public void setEnumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
  }

  /**
   **/
  public EnumTest outerEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("outerEnum")
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }

  @JsonProperty("outerEnum")
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


  public static EnumTestBuilder<?, ?> builder() {
    return new EnumTestBuilderImpl();
  }

  private static final class EnumTestBuilderImpl extends EnumTestBuilder<EnumTest, EnumTestBuilderImpl> {

    @Override
    protected EnumTestBuilderImpl self() {
      return this;
    }

    @Override
    public EnumTest build() {
      return new EnumTest(this);
    }
  }

  public static abstract class EnumTestBuilder<C extends EnumTest, B extends EnumTestBuilder<C, B>>  {
    private EnumString enumString;
    private EnumStringRequired enumStringRequired;
    private EnumInteger enumInteger;
    private EnumNumber enumNumber;
    private OuterEnum outerEnum;
    protected abstract B self();

    public abstract C build();

    public B enumString(EnumString enumString) {
      this.enumString = enumString;
      return self();
    }
    public B enumStringRequired(EnumStringRequired enumStringRequired) {
      this.enumStringRequired = enumStringRequired;
      return self();
    }
    public B enumInteger(EnumInteger enumInteger) {
      this.enumInteger = enumInteger;
      return self();
    }
    public B enumNumber(EnumNumber enumNumber) {
      this.enumNumber = enumNumber;
      return self();
    }
    public B outerEnum(OuterEnum outerEnum) {
      this.outerEnum = outerEnum;
      return self();
    }
  }

  
  private Map<String, Object> unknown = new HashMap<>();

  @JsonAnyGetter
  public Map<String, Object> getUnknown() {
    return unknown;
  }

  @JsonAnySetter
  public void addUnknown(String key, Object value) {
    unknown.put(key, value);
  }
  
}

