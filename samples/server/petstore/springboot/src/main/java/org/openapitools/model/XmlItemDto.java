package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * XmlItemDto
 */

@JsonTypeName("XmlItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class XmlItemDto {

  private String attributeString;

  private BigDecimal attributeNumber;

  private Integer attributeInteger;

  private Boolean attributeBoolean;

  @Valid
  private List<Integer> wrappedArray;

  private String nameString;

  private BigDecimal nameNumber;

  private Integer nameInteger;

  private Boolean nameBoolean;

  @Valid
  private List<Integer> nameArray;

  @Valid
  private List<Integer> nameWrappedArray;

  private String prefixString;

  private BigDecimal prefixNumber;

  private Integer prefixInteger;

  private Boolean prefixBoolean;

  @Valid
  private List<Integer> prefixArray;

  @Valid
  private List<Integer> prefixWrappedArray;

  private String namespaceString;

  private BigDecimal namespaceNumber;

  private Integer namespaceInteger;

  private Boolean namespaceBoolean;

  @Valid
  private List<Integer> namespaceArray;

  @Valid
  private List<Integer> namespaceWrappedArray;

  private String prefixNsString;

  private BigDecimal prefixNsNumber;

  private Integer prefixNsInteger;

  private Boolean prefixNsBoolean;

  @Valid
  private List<Integer> prefixNsArray;

  @Valid
  private List<Integer> prefixNsWrappedArray;

  public XmlItemDto attributeString(String attributeString) {
    this.attributeString = attributeString;
    return this;
  }

  /**
   * Get attributeString
   * @return attributeString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "attribute_string", example = "string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("attribute_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public String getAttributeString() {
    return attributeString;
  }

  public void setAttributeString(String attributeString) {
    this.attributeString = attributeString;
  }

  public XmlItemDto attributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
    return this;
  }

  /**
   * Get attributeNumber
   * @return attributeNumber
  */
  @Valid 
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "attribute_number", example = "1.234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("attribute_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public BigDecimal getAttributeNumber() {
    return attributeNumber;
  }

  public void setAttributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
  }

  public XmlItemDto attributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
    return this;
  }

  /**
   * Get attributeInteger
   * @return attributeInteger
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "attribute_integer", example = "-2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("attribute_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Integer getAttributeInteger() {
    return attributeInteger;
  }

  public void setAttributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
  }

  public XmlItemDto attributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
    return this;
  }

  /**
   * Get attributeBoolean
   * @return attributeBoolean
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "attribute_boolean", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("attribute_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Boolean getAttributeBoolean() {
    return attributeBoolean;
  }

  public void setAttributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }

  public XmlItemDto wrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
    return this;
  }

  public XmlItemDto addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }
    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

  /**
   * Get wrappedArray
   * @return wrappedArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "wrapped_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getWrappedArray() {
    return wrappedArray;
  }

  public void setWrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }

  public XmlItemDto nameString(String nameString) {
    this.nameString = nameString;
    return this;
  }

  /**
   * Get nameString
   * @return nameString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "name_string", example = "string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("name_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public String getNameString() {
    return nameString;
  }

  public void setNameString(String nameString) {
    this.nameString = nameString;
  }

  public XmlItemDto nameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
    return this;
  }

  /**
   * Get nameNumber
   * @return nameNumber
  */
  @Valid 
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "name_number", example = "1.234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("name_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public BigDecimal getNameNumber() {
    return nameNumber;
  }

  public void setNameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
  }

  public XmlItemDto nameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
    return this;
  }

  /**
   * Get nameInteger
   * @return nameInteger
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "name_integer", example = "-2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("name_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Integer getNameInteger() {
    return nameInteger;
  }

  public void setNameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
  }

  public XmlItemDto nameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
    return this;
  }

  /**
   * Get nameBoolean
   * @return nameBoolean
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "name_boolean", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("name_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Boolean getNameBoolean() {
    return nameBoolean;
  }

  public void setNameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
  }

  public XmlItemDto nameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
    return this;
  }

  public XmlItemDto addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }
    this.nameArray.add(nameArrayItem);
    return this;
  }

  /**
   * Get nameArray
   * @return nameArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "name_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("name_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getNameArray() {
    return nameArray;
  }

  public void setNameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
  }

  public XmlItemDto nameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

  public XmlItemDto addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }
    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

  /**
   * Get nameWrappedArray
   * @return nameWrappedArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "name_wrapped_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("name_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getNameWrappedArray() {
    return nameWrappedArray;
  }

  public void setNameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }

  public XmlItemDto prefixString(String prefixString) {
    this.prefixString = prefixString;
    return this;
  }

  /**
   * Get prefixString
   * @return prefixString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_string", example = "string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("prefix_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public String getPrefixString() {
    return prefixString;
  }

  public void setPrefixString(String prefixString) {
    this.prefixString = prefixString;
  }

  public XmlItemDto prefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  /**
   * Get prefixNumber
   * @return prefixNumber
  */
  @Valid 
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_number", example = "1.234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("prefix_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public BigDecimal getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public XmlItemDto prefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
    return this;
  }

  /**
   * Get prefixInteger
   * @return prefixInteger
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_integer", example = "-2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("prefix_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Integer getPrefixInteger() {
    return prefixInteger;
  }

  public void setPrefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
  }

  public XmlItemDto prefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
    return this;
  }

  /**
   * Get prefixBoolean
   * @return prefixBoolean
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_boolean", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("prefix_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Boolean getPrefixBoolean() {
    return prefixBoolean;
  }

  public void setPrefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }

  public XmlItemDto prefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
    return this;
  }

  public XmlItemDto addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }
    this.prefixArray.add(prefixArrayItem);
    return this;
  }

  /**
   * Get prefixArray
   * @return prefixArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getPrefixArray() {
    return prefixArray;
  }

  public void setPrefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
  }

  public XmlItemDto prefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

  public XmlItemDto addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }
    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixWrappedArray
   * @return prefixWrappedArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_wrapped_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getPrefixWrappedArray() {
    return prefixWrappedArray;
  }

  public void setPrefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }

  public XmlItemDto namespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
    return this;
  }

  /**
   * Get namespaceString
   * @return namespaceString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "namespace_string", example = "string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("namespace_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public String getNamespaceString() {
    return namespaceString;
  }

  public void setNamespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
  }

  public XmlItemDto namespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
    return this;
  }

  /**
   * Get namespaceNumber
   * @return namespaceNumber
  */
  @Valid 
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "namespace_number", example = "1.234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("namespace_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public BigDecimal getNamespaceNumber() {
    return namespaceNumber;
  }

  public void setNamespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }

  public XmlItemDto namespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
    return this;
  }

  /**
   * Get namespaceInteger
   * @return namespaceInteger
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "namespace_integer", example = "-2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("namespace_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Integer getNamespaceInteger() {
    return namespaceInteger;
  }

  public void setNamespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }

  public XmlItemDto namespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

  /**
   * Get namespaceBoolean
   * @return namespaceBoolean
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "namespace_boolean", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("namespace_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Boolean getNamespaceBoolean() {
    return namespaceBoolean;
  }

  public void setNamespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }

  public XmlItemDto namespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
    return this;
  }

  public XmlItemDto addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }
    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

  /**
   * Get namespaceArray
   * @return namespaceArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "namespace_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("namespace_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getNamespaceArray() {
    return namespaceArray;
  }

  public void setNamespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }

  public XmlItemDto namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

  public XmlItemDto addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }
    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

  /**
   * Get namespaceWrappedArray
   * @return namespaceWrappedArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "namespace_wrapped_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("namespace_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getNamespaceWrappedArray() {
    return namespaceWrappedArray;
  }

  public void setNamespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }

  public XmlItemDto prefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
    return this;
  }

  /**
   * Get prefixNsString
   * @return prefixNsString
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_ns_string", example = "string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("prefix_ns_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public String getPrefixNsString() {
    return prefixNsString;
  }

  public void setPrefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
  }

  public XmlItemDto prefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

  /**
   * Get prefixNsNumber
   * @return prefixNsNumber
  */
  @Valid 
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_ns_number", example = "1.234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("prefix_ns_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public BigDecimal getPrefixNsNumber() {
    return prefixNsNumber;
  }

  public void setPrefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }

  public XmlItemDto prefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

  /**
   * Get prefixNsInteger
   * @return prefixNsInteger
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_ns_integer", example = "-2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("prefix_ns_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Integer getPrefixNsInteger() {
    return prefixNsInteger;
  }

  public void setPrefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }

  public XmlItemDto prefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

  /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_ns_boolean", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("prefix_ns_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public Boolean getPrefixNsBoolean() {
    return prefixNsBoolean;
  }

  public void setPrefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }

  public XmlItemDto prefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
    return this;
  }

  public XmlItemDto addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }
    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

  /**
   * Get prefixNsArray
   * @return prefixNsArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_ns_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_ns_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getPrefixNsArray() {
    return prefixNsArray;
  }

  public void setPrefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }

  public XmlItemDto prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

  public XmlItemDto addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }
    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixNsWrappedArray
   * @return prefixNsWrappedArray
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/XmlItem.java
  @Schema(name = "prefix_ns_wrapped_array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_ns_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/springboot/src/main/java/org/openapitools/model/XmlItemDto.java
  public List<Integer> getPrefixNsWrappedArray() {
    return prefixNsWrappedArray;
  }

  public void setPrefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItemDto xmlItem = (XmlItemDto) o;
    return Objects.equals(this.attributeString, xmlItem.attributeString) &&
        Objects.equals(this.attributeNumber, xmlItem.attributeNumber) &&
        Objects.equals(this.attributeInteger, xmlItem.attributeInteger) &&
        Objects.equals(this.attributeBoolean, xmlItem.attributeBoolean) &&
        Objects.equals(this.wrappedArray, xmlItem.wrappedArray) &&
        Objects.equals(this.nameString, xmlItem.nameString) &&
        Objects.equals(this.nameNumber, xmlItem.nameNumber) &&
        Objects.equals(this.nameInteger, xmlItem.nameInteger) &&
        Objects.equals(this.nameBoolean, xmlItem.nameBoolean) &&
        Objects.equals(this.nameArray, xmlItem.nameArray) &&
        Objects.equals(this.nameWrappedArray, xmlItem.nameWrappedArray) &&
        Objects.equals(this.prefixString, xmlItem.prefixString) &&
        Objects.equals(this.prefixNumber, xmlItem.prefixNumber) &&
        Objects.equals(this.prefixInteger, xmlItem.prefixInteger) &&
        Objects.equals(this.prefixBoolean, xmlItem.prefixBoolean) &&
        Objects.equals(this.prefixArray, xmlItem.prefixArray) &&
        Objects.equals(this.prefixWrappedArray, xmlItem.prefixWrappedArray) &&
        Objects.equals(this.namespaceString, xmlItem.namespaceString) &&
        Objects.equals(this.namespaceNumber, xmlItem.namespaceNumber) &&
        Objects.equals(this.namespaceInteger, xmlItem.namespaceInteger) &&
        Objects.equals(this.namespaceBoolean, xmlItem.namespaceBoolean) &&
        Objects.equals(this.namespaceArray, xmlItem.namespaceArray) &&
        Objects.equals(this.namespaceWrappedArray, xmlItem.namespaceWrappedArray) &&
        Objects.equals(this.prefixNsString, xmlItem.prefixNsString) &&
        Objects.equals(this.prefixNsNumber, xmlItem.prefixNsNumber) &&
        Objects.equals(this.prefixNsInteger, xmlItem.prefixNsInteger) &&
        Objects.equals(this.prefixNsBoolean, xmlItem.prefixNsBoolean) &&
        Objects.equals(this.prefixNsArray, xmlItem.prefixNsArray) &&
        Objects.equals(this.prefixNsWrappedArray, xmlItem.prefixNsWrappedArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeString, attributeNumber, attributeInteger, attributeBoolean, wrappedArray, nameString, nameNumber, nameInteger, nameBoolean, nameArray, nameWrappedArray, prefixString, prefixNumber, prefixInteger, prefixBoolean, prefixArray, prefixWrappedArray, namespaceString, namespaceNumber, namespaceInteger, namespaceBoolean, namespaceArray, namespaceWrappedArray, prefixNsString, prefixNsNumber, prefixNsInteger, prefixNsBoolean, prefixNsArray, prefixNsWrappedArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlItemDto {\n");
    sb.append("    attributeString: ").append(toIndentedString(attributeString)).append("\n");
    sb.append("    attributeNumber: ").append(toIndentedString(attributeNumber)).append("\n");
    sb.append("    attributeInteger: ").append(toIndentedString(attributeInteger)).append("\n");
    sb.append("    attributeBoolean: ").append(toIndentedString(attributeBoolean)).append("\n");
    sb.append("    wrappedArray: ").append(toIndentedString(wrappedArray)).append("\n");
    sb.append("    nameString: ").append(toIndentedString(nameString)).append("\n");
    sb.append("    nameNumber: ").append(toIndentedString(nameNumber)).append("\n");
    sb.append("    nameInteger: ").append(toIndentedString(nameInteger)).append("\n");
    sb.append("    nameBoolean: ").append(toIndentedString(nameBoolean)).append("\n");
    sb.append("    nameArray: ").append(toIndentedString(nameArray)).append("\n");
    sb.append("    nameWrappedArray: ").append(toIndentedString(nameWrappedArray)).append("\n");
    sb.append("    prefixString: ").append(toIndentedString(prefixString)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    prefixInteger: ").append(toIndentedString(prefixInteger)).append("\n");
    sb.append("    prefixBoolean: ").append(toIndentedString(prefixBoolean)).append("\n");
    sb.append("    prefixArray: ").append(toIndentedString(prefixArray)).append("\n");
    sb.append("    prefixWrappedArray: ").append(toIndentedString(prefixWrappedArray)).append("\n");
    sb.append("    namespaceString: ").append(toIndentedString(namespaceString)).append("\n");
    sb.append("    namespaceNumber: ").append(toIndentedString(namespaceNumber)).append("\n");
    sb.append("    namespaceInteger: ").append(toIndentedString(namespaceInteger)).append("\n");
    sb.append("    namespaceBoolean: ").append(toIndentedString(namespaceBoolean)).append("\n");
    sb.append("    namespaceArray: ").append(toIndentedString(namespaceArray)).append("\n");
    sb.append("    namespaceWrappedArray: ").append(toIndentedString(namespaceWrappedArray)).append("\n");
    sb.append("    prefixNsString: ").append(toIndentedString(prefixNsString)).append("\n");
    sb.append("    prefixNsNumber: ").append(toIndentedString(prefixNsNumber)).append("\n");
    sb.append("    prefixNsInteger: ").append(toIndentedString(prefixNsInteger)).append("\n");
    sb.append("    prefixNsBoolean: ").append(toIndentedString(prefixNsBoolean)).append("\n");
    sb.append("    prefixNsArray: ").append(toIndentedString(prefixNsArray)).append("\n");
    sb.append("    prefixNsWrappedArray: ").append(toIndentedString(prefixNsWrappedArray)).append("\n");
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

