package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NumberOnly
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NumberOnly {

  private BigDecimal justNumber;

  public NumberOnly justNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
    return this;
  }

  /**
   * Get justNumber
   * @return justNumber
  */
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/NumberOnly.java
  @Valid 
  @Schema(name = "JustNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  
  @JsonProperty("JustNumber")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/NumberOnly.java
  public BigDecimal getJustNumber() {
    return justNumber;
  }

  public void setJustNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOnly numberOnly = (NumberOnly) o;
    return Objects.equals(this.justNumber, numberOnly.justNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOnly {\n");
    sb.append("    justNumber: ").append(toIndentedString(justNumber)).append("\n");
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

