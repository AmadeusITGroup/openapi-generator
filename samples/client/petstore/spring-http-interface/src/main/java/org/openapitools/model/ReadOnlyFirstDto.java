package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReadOnlyFirstDto
 */

@JsonTypeName("ReadOnlyFirst")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReadOnlyFirstDto {

  private String bar;

  private String baz;

  public ReadOnlyFirstDto bar(String bar) {
    this.bar = bar;
    return this;
  }

  /**
   * Get bar
   * @return bar
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-beanvalidation-no-nullable/src/main/java/org/openapitools/model/ReadOnlyFirst.java
  @Schema(name = "bar", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("bar")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/ReadOnlyFirstDto.java
  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }

  public ReadOnlyFirstDto baz(String baz) {
    this.baz = baz;
    return this;
  }

  /**
   * Get baz
   * @return baz
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-beanvalidation-no-nullable/src/main/java/org/openapitools/model/ReadOnlyFirst.java
  @Schema(name = "baz", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("baz")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/ReadOnlyFirstDto.java
  public String getBaz() {
    return baz;
  }

  public void setBaz(String baz) {
    this.baz = baz;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadOnlyFirstDto readOnlyFirst = (ReadOnlyFirstDto) o;
    return Objects.equals(this.bar, readOnlyFirst.bar) &&
        Objects.equals(this.baz, readOnlyFirst.baz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, baz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadOnlyFirstDto {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    baz: ").append(toIndentedString(baz)).append("\n");
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

