package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListDto
 */

@JsonTypeName("List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ListDto {

<<<<<<<< HEAD:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ModelList.java
  @JsonProperty("123-list")
  private String _123List;

  public ModelList _123List(String _123List) {
========
  private String _123List;

  public ListDto _123List(String _123List) {
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ListDto.java
    this._123List = _123List;
    return this;
  }

  /**
   * Get _123List
   * @return _123List
  */
  
  @ApiModelProperty(value = "")
<<<<<<<< HEAD:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ModelList.java
========
  @JsonProperty("123-list")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ListDto.java
  public String get123List() {
    return _123List;
  }

  public void set123List(String _123List) {
    this._123List = _123List;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
<<<<<<<< HEAD:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ModelList.java
    ModelList _list = (ModelList) o;
========
    ListDto _list = (ListDto) o;
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ListDto.java
    return Objects.equals(this._123List, _list._123List);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_123List);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
<<<<<<<< HEAD:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ModelList.java
    sb.append("class ModelList {\n");
========
    sb.append("class ListDto {\n");
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/ListDto.java
    sb.append("    _123List: ").append(toIndentedString(_123List)).append("\n");
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

