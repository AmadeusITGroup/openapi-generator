package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OuterEnumDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EnumTestDto
 */

@JsonTypeName("Enum_Test")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class EnumTestDto {

  /**
   * Gets or Sets enumString
   */
  public enum EnumStringEnum {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumStringEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumStringEnum fromValue(String value) {
      for (EnumStringEnum b : EnumStringEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EnumStringEnum enumString;

  /**
   * Gets or Sets enumStringRequired
   */
  public enum EnumStringRequiredEnum {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumStringRequiredEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumStringRequiredEnum fromValue(String value) {
      for (EnumStringRequiredEnum b : EnumStringRequiredEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EnumStringRequiredEnum enumStringRequired;

  /**
   * Gets or Sets enumInteger
   */
  public enum EnumIntegerEnum {
    NUMBER_1(1),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    EnumIntegerEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumIntegerEnum fromValue(Integer value) {
      for (EnumIntegerEnum b : EnumIntegerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EnumIntegerEnum enumInteger;

  /**
   * Gets or Sets enumNumber
   */
  public enum EnumNumberEnum {
    NUMBER_1_DOT_1(1.1),
    
    NUMBER_MINUS_1_DOT_2(-1.2);

    private Double value;

    EnumNumberEnum(Double value) {
      this.value = value;
    }

    @JsonValue
    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EnumNumberEnum fromValue(Double value) {
      for (EnumNumberEnum b : EnumNumberEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EnumNumberEnum enumNumber;

  private OuterEnumDto outerEnum;

  public EnumTestDto enumString(EnumStringEnum enumString) {
    this.enumString = enumString;
    return this;
  }

  /**
   * Get enumString
   * @return enumString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/EnumTest.java
  @Schema(name = "enum_string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("enum_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/EnumTestDto.java
  public EnumStringEnum getEnumString() {
    return enumString;
  }

  public void setEnumString(EnumStringEnum enumString) {
    this.enumString = enumString;
  }

  public EnumTestDto enumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
    return this;
  }

  /**
   * Get enumStringRequired
   * @return enumStringRequired
  */
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/EnumTest.java
  @NotNull 
  @Schema(name = "enum_string_required", requiredMode = Schema.RequiredMode.REQUIRED)
========
  @NotNull
  @JsonProperty("enum_string_required")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/EnumTestDto.java
  public EnumStringRequiredEnum getEnumStringRequired() {
    return enumStringRequired;
  }

  public void setEnumStringRequired(EnumStringRequiredEnum enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }

  public EnumTestDto enumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
    return this;
  }

  /**
   * Get enumInteger
   * @return enumInteger
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/EnumTest.java
  @Schema(name = "enum_integer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("enum_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/EnumTestDto.java
  public EnumIntegerEnum getEnumInteger() {
    return enumInteger;
  }

  public void setEnumInteger(EnumIntegerEnum enumInteger) {
    this.enumInteger = enumInteger;
  }

  public EnumTestDto enumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
    return this;
  }

  /**
   * Get enumNumber
   * @return enumNumber
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/EnumTest.java
  @Schema(name = "enum_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("enum_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/EnumTestDto.java
  public EnumNumberEnum getEnumNumber() {
    return enumNumber;
  }

  public void setEnumNumber(EnumNumberEnum enumNumber) {
    this.enumNumber = enumNumber;
  }

  public EnumTestDto outerEnum(OuterEnumDto outerEnum) {
    this.outerEnum = outerEnum;
    return this;
  }

  /**
   * Get outerEnum
   * @return outerEnum
  */
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-reactive/src/main/java/org/openapitools/model/EnumTest.java
  @Valid 
  @Schema(name = "outerEnum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OuterEnum getOuterEnum() {
========
  
  @JsonProperty("outerEnum")
  public OuterEnumDto getOuterEnum() {
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/EnumTestDto.java
    return outerEnum;
  }

  public void setOuterEnum(OuterEnumDto outerEnum) {
    this.outerEnum = outerEnum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTestDto enumTest = (EnumTestDto) o;
    return Objects.equals(this.enumString, enumTest.enumString) &&
        Objects.equals(this.enumStringRequired, enumTest.enumStringRequired) &&
        Objects.equals(this.enumInteger, enumTest.enumInteger) &&
        Objects.equals(this.enumNumber, enumTest.enumNumber) &&
        Objects.equals(this.outerEnum, enumTest.outerEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumStringRequired, enumInteger, enumNumber, outerEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTestDto {\n");
    sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
    sb.append("    enumStringRequired: ").append(toIndentedString(enumStringRequired)).append("\n");
    sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
    sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
    sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
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

