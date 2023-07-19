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
 * OuterComposite
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OuterComposite {

  private BigDecimal myNumber;

  private String myString;

  private Boolean myBoolean;

  public OuterComposite myNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
    return this;
  }

  /**
   * Get myNumber
   * @return myNumber
  */
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/OuterComposite.java
  @Valid 
  @Schema(name = "my_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  
  @JsonProperty("my_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/OuterComposite.java
  public BigDecimal getMyNumber() {
    return myNumber;
  }

  public void setMyNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
  }

  public OuterComposite myString(String myString) {
    this.myString = myString;
    return this;
  }

  /**
   * Get myString
   * @return myString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/OuterComposite.java
  @Schema(name = "my_string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("my_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/OuterComposite.java
  public String getMyString() {
    return myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  public OuterComposite myBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
    return this;
  }

  /**
   * Get myBoolean
   * @return myBoolean
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/OuterComposite.java
  @Schema(name = "my_boolean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("my_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/OuterComposite.java
  public Boolean getMyBoolean() {
    return myBoolean;
  }

  public void setMyBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(this.myNumber, outerComposite.myNumber) &&
        Objects.equals(this.myString, outerComposite.myString) &&
        Objects.equals(this.myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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

