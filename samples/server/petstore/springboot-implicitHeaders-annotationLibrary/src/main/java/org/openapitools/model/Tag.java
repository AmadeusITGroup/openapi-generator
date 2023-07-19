package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * A tag for a pet
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Tag {

  private Long id;

  private String name;

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Tag.java
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("id")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot-implicitHeaders-annotationLibrary/src/main/java/org/openapitools/model/Tag.java
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Tag.java
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("name")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot-implicitHeaders-annotationLibrary/src/main/java/org/openapitools/model/Tag.java
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.name, tag.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

