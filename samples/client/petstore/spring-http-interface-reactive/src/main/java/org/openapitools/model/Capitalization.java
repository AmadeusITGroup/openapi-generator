package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Capitalization
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Capitalization {

  private String smallCamel;

  private String capitalCamel;

  private String smallSnake;

  private String capitalSnake;

  private String scAETHFlowPoints;

  private String ATT_NAME;

  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

  /**
   * Get smallCamel
   * @return smallCamel
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Capitalization.java
  @Schema(name = "smallCamel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("smallCamel")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/Capitalization.java
  public String getSmallCamel() {
    return smallCamel;
  }

  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

  /**
   * Get capitalCamel
   * @return capitalCamel
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Capitalization.java
  @Schema(name = "CapitalCamel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("CapitalCamel")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/Capitalization.java
  public String getCapitalCamel() {
    return capitalCamel;
  }

  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

  /**
   * Get smallSnake
   * @return smallSnake
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Capitalization.java
  @Schema(name = "small_Snake", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("small_Snake")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/Capitalization.java
  public String getSmallSnake() {
    return smallSnake;
  }

  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

  /**
   * Get capitalSnake
   * @return capitalSnake
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Capitalization.java
  @Schema(name = "Capital_Snake", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("Capital_Snake")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/Capitalization.java
  public String getCapitalSnake() {
    return capitalSnake;
  }

  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

  /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Capitalization.java
  @Schema(name = "SCA_ETH_Flow_Points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("SCA_ETH_Flow_Points")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/Capitalization.java
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }

  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }

  /**
   * Name of the pet 
   * @return ATT_NAME
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/Capitalization.java
  @Schema(name = "ATT_NAME", description = "Name of the pet ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("ATT_NAME")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/Capitalization.java
  public String getATTNAME() {
    return ATT_NAME;
  }

  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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

