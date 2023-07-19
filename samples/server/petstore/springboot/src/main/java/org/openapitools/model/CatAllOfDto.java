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
 * CatAllOfDto
 */

@JsonTypeName("Cat_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CatAllOfDto {

  private Boolean declawed;

  public CatAllOfDto declawed(Boolean declawed) {
    this.declawed = declawed;
    return this;
  }

  /**
   * Get declawed
   * @return declawed
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/CatAllOf.java
  @Schema(name = "declawed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("declawed")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/CatAllOfDto.java
  public Boolean getDeclawed() {
    return declawed;
  }

  public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatAllOfDto catAllOf = (CatAllOfDto) o;
    return Objects.equals(this.declawed, catAllOf.declawed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declawed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatAllOfDto {\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
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

