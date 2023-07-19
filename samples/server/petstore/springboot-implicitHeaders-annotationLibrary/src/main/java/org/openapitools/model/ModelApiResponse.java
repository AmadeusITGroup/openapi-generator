package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes the result of uploading an image resource
 */

@JsonTypeName("ApiResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ModelApiResponse {

  private Integer code;

  private String type;

  private String message;

  public ModelApiResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/ModelApiResponse.java
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("code")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot-implicitHeaders-annotationLibrary/src/main/java/org/openapitools/model/ModelApiResponse.java
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ModelApiResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/ModelApiResponse.java
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("type")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot-implicitHeaders-annotationLibrary/src/main/java/org/openapitools/model/ModelApiResponse.java
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModelApiResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/ModelApiResponse.java
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("message")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot-implicitHeaders-annotationLibrary/src/main/java/org/openapitools/model/ModelApiResponse.java
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.code, _apiResponse.code) &&
        Objects.equals(this.type, _apiResponse.type) &&
        Objects.equals(this.message, _apiResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

