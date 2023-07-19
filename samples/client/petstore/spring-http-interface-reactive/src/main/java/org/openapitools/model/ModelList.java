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
 * ModelList
 */

@JsonTypeName("List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ModelList {

  private String _123list;

  public ModelList _123list(String _123list) {
    this._123list = _123list;
    return this;
  }

  /**
   * Get _123list
   * @return _123list
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/ModelList.java
  @Schema(name = "123-list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("123-list")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/ModelList.java
  public String get123list() {
    return _123list;
  }

  public void set123list(String _123list) {
    this._123list = _123list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelList _list = (ModelList) o;
    return Objects.equals(this._123list, _list._123list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_123list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelList {\n");
    sb.append("    _123list: ").append(toIndentedString(_123list)).append("\n");
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

