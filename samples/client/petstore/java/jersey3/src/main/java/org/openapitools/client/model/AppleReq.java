/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppleReq
 */
@JsonPropertyOrder({
  AppleReq.JSON_PROPERTY_CULTIVAR,
  AppleReq.JSON_PROPERTY_MEALY
})
@JsonTypeName("appleReq")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-amadeus")
public class AppleReq {
  public static final String JSON_PROPERTY_CULTIVAR = "cultivar";
  private String cultivar;

  public static final String JSON_PROPERTY_MEALY = "mealy";
  private Boolean mealy;

  public AppleReq() { 
  }

  public AppleReq cultivar(String cultivar) {
    this.cultivar = cultivar;
    return this;
  }

   /**
   * Get cultivar
   * @return cultivar
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CULTIVAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCultivar() {
    return cultivar;
  }


  @JsonProperty(JSON_PROPERTY_CULTIVAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCultivar(String cultivar) {
    this.cultivar = cultivar;
  }


  public AppleReq mealy(Boolean mealy) {
    this.mealy = mealy;
    return this;
  }

   /**
   * Get mealy
   * @return mealy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEALY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMealy() {
    return mealy;
  }


  @JsonProperty(JSON_PROPERTY_MEALY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMealy(Boolean mealy) {
    this.mealy = mealy;
  }


  /**
   * Return true if this appleReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleReq appleReq = (AppleReq) o;
    return Objects.equals(this.cultivar, appleReq.cultivar) &&
        Objects.equals(this.mealy, appleReq.mealy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cultivar, mealy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleReq {\n");
    sb.append("    cultivar: ").append(toIndentedString(cultivar)).append("\n");
    sb.append("    mealy: ").append(toIndentedString(mealy)).append("\n");
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

