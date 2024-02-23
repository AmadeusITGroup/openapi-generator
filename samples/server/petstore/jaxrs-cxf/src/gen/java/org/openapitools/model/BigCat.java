package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Cat;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BigCat extends Cat {
  
public enum Kind {

LIONS(String.valueOf("lions")), TIGERS(String.valueOf("tigers")), LEOPARDS(String.valueOf("leopards")), JAGUARS(String.valueOf("jaguars"));


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

  @ApiModelProperty(value = "")
  private Kind kind;
 /**
   * Get kind
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    if (kind == null) {
      return null;
    }
    return kind.value();
  }

  public void setKind(Kind kind) {
    this.kind = kind;
  }

  public BigCat kind(Kind kind) {
    this.kind = kind;
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
    BigCat bigCat = (BigCat) o;
    return Objects.equals(kind, bigCat.kind) &&
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

