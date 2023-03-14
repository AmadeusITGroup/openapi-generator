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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * SpecialModelName
 */
@JsonPropertyOrder({
  SpecialModelName.JSON_PROPERTY_$_SPECIAL_PROPERTY_NAME
})
@JsonTypeName("$special[model.name]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@XmlRootElement(name = "$special[model.name]")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "$special[model.name]")
public class SpecialModelName {
  public static final String JSON_PROPERTY_$_SPECIAL_PROPERTY_NAME = "$special[property.name]";
  @XmlElement(name = "$special[property.name]")
  private Long $specialPropertyName;

  public SpecialModelName() {
  }

  public SpecialModelName $specialPropertyName(Long $specialPropertyName) {
    
    this.$specialPropertyName = $specialPropertyName;
    return this;
  }

   /**
   * Get $specialPropertyName
   * @return $specialPropertyName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_$_SPECIAL_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "$special[property.name]")

  public Long get$SpecialPropertyName() {
    return $specialPropertyName;
  }


  @JsonProperty(JSON_PROPERTY_$_SPECIAL_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "$special[property.name]")
  public void set$SpecialPropertyName(Long $specialPropertyName) {
    this.$specialPropertyName = $specialPropertyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialModelName $specialModelName = (SpecialModelName) o;
    return Objects.equals(this.$specialPropertyName, $specialModelName.$specialPropertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash($specialPropertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialModelName {\n");
    sb.append("    $specialPropertyName: ").append(toIndentedString($specialPropertyName)).append("\n");
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

