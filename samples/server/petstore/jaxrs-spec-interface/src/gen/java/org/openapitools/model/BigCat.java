/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:47.458Z[UTC]
 */

package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Cat;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("BigCat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class BigCat extends Cat implements Serializable {
  

public enum Kind {

    LIONS(String.valueOf("LIONS")), TIGERS(String.valueOf("TIGERS")), LEOPARDS(String.valueOf("LEOPARDS")), JAGUARS(String.valueOf("JAGUARS"));


    private String value;

    Kind (String v) {
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
	public static Kind fromString(String s) {
        for (Kind b : Kind.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static Kind fromValue(String value) {
        for (Kind b : Kind.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  
  private @Valid Kind kind;

  /**
   **/
  public BigCat kind(Kind kind) {
    this.kind = kind;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("kind")
  public Kind getKind() {
    return kind;
  }

  @JsonProperty("kind")
  public void setKind(Kind kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigCat bigCat = (BigCat) o;
    return Objects.equals(this.kind, bigCat.kind) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigCat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

