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
 * DogAllOfDto
 */

@JsonTypeName("Dog_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DogAllOfDto {

  private String breed;

  public DogAllOfDto breed(String breed) {
    this.breed = breed;
    return this;
  }

  /**
   * Get breed
   * @return breed
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-beanvalidation-no-nullable/src/main/java/org/openapitools/model/DogAllOf.java
  @Schema(name = "breed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("breed")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/DogAllOfDto.java
  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DogAllOfDto dogAllOf = (DogAllOfDto) o;
    return Objects.equals(this.breed, dogAllOf.breed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DogAllOfDto {\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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

