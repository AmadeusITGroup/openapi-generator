package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdditionalPropertiesObjectDto
 */

@JsonTypeName("AdditionalPropertiesObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdditionalPropertiesObjectDto extends HashMap<String, Map> {

  @JsonProperty("name")
  private String name;

  public AdditionalPropertiesObjectDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @ApiModelProperty(value = "")
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
    AdditionalPropertiesObjectDto additionalPropertiesObject = (AdditionalPropertiesObjectDto) o;
    return Objects.equals(this.name, additionalPropertiesObject.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesObjectDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

