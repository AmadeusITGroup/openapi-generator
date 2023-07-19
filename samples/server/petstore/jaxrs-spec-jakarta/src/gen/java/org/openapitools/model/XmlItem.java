package org.openapitools.model;

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * XmlItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class XmlItem {

  @JsonProperty("attribute_string")
  private String attributeString;

  @JsonProperty("attribute_number")
  private BigDecimal attributeNumber;

  @JsonProperty("attribute_integer")
  private Integer attributeInteger;

  @JsonProperty("attribute_boolean")
  private Boolean attributeBoolean;

  @JsonProperty("wrapped_array")
  
  private List<Integer> wrappedArray = null;

  @JsonProperty("name_string")
  private String nameString;

  @JsonProperty("name_number")
  private BigDecimal nameNumber;

  @JsonProperty("name_integer")
  private Integer nameInteger;

  @JsonProperty("name_boolean")
  private Boolean nameBoolean;

  @JsonProperty("name_array")
  
  private List<Integer> nameArray = null;

  @JsonProperty("name_wrapped_array")
  
  private List<Integer> nameWrappedArray = null;

  @JsonProperty("prefix_string")
  private String prefixString;

  @JsonProperty("prefix_number")
  private BigDecimal prefixNumber;

  @JsonProperty("prefix_integer")
  private Integer prefixInteger;

  @JsonProperty("prefix_boolean")
  private Boolean prefixBoolean;

  @JsonProperty("prefix_array")
  
  private List<Integer> prefixArray = null;

  @JsonProperty("prefix_wrapped_array")
  
  private List<Integer> prefixWrappedArray = null;

  @JsonProperty("namespace_string")
  private String namespaceString;

  @JsonProperty("namespace_number")
  private BigDecimal namespaceNumber;

  @JsonProperty("namespace_integer")
  private Integer namespaceInteger;

  @JsonProperty("namespace_boolean")
  private Boolean namespaceBoolean;

  @JsonProperty("namespace_array")
  
  private List<Integer> namespaceArray = null;

  @JsonProperty("namespace_wrapped_array")
  
  private List<Integer> namespaceWrappedArray = null;

  @JsonProperty("prefix_ns_string")
  private String prefixNsString;

  @JsonProperty("prefix_ns_number")
  private BigDecimal prefixNsNumber;

  @JsonProperty("prefix_ns_integer")
  private Integer prefixNsInteger;

  @JsonProperty("prefix_ns_boolean")
  private Boolean prefixNsBoolean;

  @JsonProperty("prefix_ns_array")
  
  private List<Integer> prefixNsArray = null;

  @JsonProperty("prefix_ns_wrapped_array")
  
  private List<Integer> prefixNsWrappedArray = null;

========
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("XmlItem")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class XmlItem  implements Serializable {
  private @Valid String attributeString;
  private @Valid BigDecimal attributeNumber;
  private @Valid Integer attributeInteger;
  private @Valid Boolean attributeBoolean;
  private @Valid List<Integer> wrappedArray;
  private @Valid String nameString;
  private @Valid BigDecimal nameNumber;
  private @Valid Integer nameInteger;
  private @Valid Boolean nameBoolean;
  private @Valid List<Integer> nameArray;
  private @Valid List<Integer> nameWrappedArray;
  private @Valid String prefixString;
  private @Valid BigDecimal prefixNumber;
  private @Valid Integer prefixInteger;
  private @Valid Boolean prefixBoolean;
  private @Valid List<Integer> prefixArray;
  private @Valid List<Integer> prefixWrappedArray;
  private @Valid String namespaceString;
  private @Valid BigDecimal namespaceNumber;
  private @Valid Integer namespaceInteger;
  private @Valid Boolean namespaceBoolean;
  private @Valid List<Integer> namespaceArray;
  private @Valid List<Integer> namespaceWrappedArray;
  private @Valid String prefixNsString;
  private @Valid BigDecimal prefixNsNumber;
  private @Valid Integer prefixNsInteger;
  private @Valid Boolean prefixNsBoolean;
  private @Valid List<Integer> prefixNsArray;
  private @Valid List<Integer> prefixNsWrappedArray;

  protected XmlItem(XmlItemBuilder<?, ?> b) {
    this.attributeString = b.attributeString;
    this.attributeNumber = b.attributeNumber;
    this.attributeInteger = b.attributeInteger;
    this.attributeBoolean = b.attributeBoolean;
    this.wrappedArray = b.wrappedArray;
    this.nameString = b.nameString;
    this.nameNumber = b.nameNumber;
    this.nameInteger = b.nameInteger;
    this.nameBoolean = b.nameBoolean;
    this.nameArray = b.nameArray;
    this.nameWrappedArray = b.nameWrappedArray;
    this.prefixString = b.prefixString;
    this.prefixNumber = b.prefixNumber;
    this.prefixInteger = b.prefixInteger;
    this.prefixBoolean = b.prefixBoolean;
    this.prefixArray = b.prefixArray;
    this.prefixWrappedArray = b.prefixWrappedArray;
    this.namespaceString = b.namespaceString;
    this.namespaceNumber = b.namespaceNumber;
    this.namespaceInteger = b.namespaceInteger;
    this.namespaceBoolean = b.namespaceBoolean;
    this.namespaceArray = b.namespaceArray;
    this.namespaceWrappedArray = b.namespaceWrappedArray;
    this.prefixNsString = b.prefixNsString;
    this.prefixNsNumber = b.prefixNsNumber;
    this.prefixNsInteger = b.prefixNsInteger;
    this.prefixNsBoolean = b.prefixNsBoolean;
    this.prefixNsArray = b.prefixNsArray;
    this.prefixNsWrappedArray = b.prefixNsWrappedArray;
  }

  public XmlItem() {
  }

  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem attributeString(String attributeString) {
    this.attributeString = attributeString;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get attributeString
   * @return attributeString
  */
  
========
  
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("attribute_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public String getAttributeString() {
    return attributeString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("attribute_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setAttributeString(String attributeString) {
    this.attributeString = attributeString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem attributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get attributeNumber
   * @return attributeNumber
  */
  
========
  
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("attribute_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public BigDecimal getAttributeNumber() {
    return attributeNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("attribute_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setAttributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem attributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get attributeInteger
   * @return attributeInteger
  */
  
========
  
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("attribute_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Integer getAttributeInteger() {
    return attributeInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("attribute_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setAttributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem attributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get attributeBoolean
   * @return attributeBoolean
  */
  
========
  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("attribute_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Boolean getAttributeBoolean() {
    return attributeBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("attribute_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setAttributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem wrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addWrappedArrayItem(Integer wrappedArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getWrappedArray() {
    return wrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setWrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }

    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

  public XmlItem removeWrappedArrayItem(Integer wrappedArrayItem) {
    if (wrappedArrayItem != null && this.wrappedArray != null) {
      this.wrappedArray.remove(wrappedArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem nameString(String nameString) {
    this.nameString = nameString;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get nameString
   * @return nameString
  */
  
========
  
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("name_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public String getNameString() {
    return nameString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("name_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNameString(String nameString) {
    this.nameString = nameString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem nameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get nameNumber
   * @return nameNumber
  */
  
========
  
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("name_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public BigDecimal getNameNumber() {
    return nameNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("name_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem nameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get nameInteger
   * @return nameInteger
  */
  
========
  
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("name_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Integer getNameInteger() {
    return nameInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("name_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem nameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get nameBoolean
   * @return nameBoolean
  */
  
========
  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("name_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Boolean getNameBoolean() {
    return nameBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("name_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem nameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addNameArrayItem(Integer nameArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("name_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getNameArray() {
    return nameArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("name_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }

    this.nameArray.add(nameArrayItem);
    return this;
  }

  public XmlItem removeNameArrayItem(Integer nameArrayItem) {
    if (nameArrayItem != null && this.nameArray != null) {
      this.nameArray.remove(nameArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem nameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("name_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getNameWrappedArray() {
    return nameWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("name_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }

    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

  public XmlItem removeNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (nameWrappedArrayItem != null && this.nameWrappedArray != null) {
      this.nameWrappedArray.remove(nameWrappedArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixString(String prefixString) {
    this.prefixString = prefixString;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixString
   * @return prefixString
  */
  
========
  
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("prefix_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public String getPrefixString() {
    return prefixString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixString(String prefixString) {
    this.prefixString = prefixString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixNumber
   * @return prefixNumber
  */
  
========
  
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("prefix_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public BigDecimal getPrefixNumber() {
    return prefixNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixInteger
   * @return prefixInteger
  */
  
========
  
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("prefix_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Integer getPrefixInteger() {
    return prefixInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixBoolean
   * @return prefixBoolean
  */
  
========
  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("prefix_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Boolean getPrefixBoolean() {
    return prefixBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addPrefixArrayItem(Integer prefixArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getPrefixArray() {
    return prefixArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }

    this.prefixArray.add(prefixArrayItem);
    return this;
  }

  public XmlItem removePrefixArrayItem(Integer prefixArrayItem) {
    if (prefixArrayItem != null && this.prefixArray != null) {
      this.prefixArray.remove(prefixArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getPrefixWrappedArray() {
    return prefixWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }

    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

  public XmlItem removePrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (prefixWrappedArrayItem != null && this.prefixWrappedArray != null) {
      this.prefixWrappedArray.remove(prefixWrappedArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem namespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get namespaceString
   * @return namespaceString
  */
  
========
  
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("namespace_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public String getNamespaceString() {
    return namespaceString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("namespace_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNamespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem namespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get namespaceNumber
   * @return namespaceNumber
  */
  
========
  
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("namespace_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public BigDecimal getNamespaceNumber() {
    return namespaceNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("namespace_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNamespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem namespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get namespaceInteger
   * @return namespaceInteger
  */
  
========
  
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("namespace_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Integer getNamespaceInteger() {
    return namespaceInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("namespace_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNamespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem namespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get namespaceBoolean
   * @return namespaceBoolean
  */
  
========
  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("namespace_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Boolean getNamespaceBoolean() {
    return namespaceBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("namespace_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNamespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem namespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addNamespaceArrayItem(Integer namespaceArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("namespace_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getNamespaceArray() {
    return namespaceArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("namespace_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNamespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }

    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

  public XmlItem removeNamespaceArrayItem(Integer namespaceArrayItem) {
    if (namespaceArrayItem != null && this.namespaceArray != null) {
      this.namespaceArray.remove(namespaceArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("namespace_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getNamespaceWrappedArray() {
    return namespaceWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("namespace_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setNamespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }

    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

  public XmlItem removeNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (namespaceWrappedArrayItem != null && this.namespaceWrappedArray != null) {
      this.namespaceWrappedArray.remove(namespaceWrappedArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixNsString
   * @return prefixNsString
  */
  
========
  
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty("prefix_ns_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public String getPrefixNsString() {
    return prefixNsString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_ns_string")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixNsNumber
   * @return prefixNsNumber
  */
  
========
  
  @ApiModelProperty(example = "1.234", value = "")
  @JsonProperty("prefix_ns_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public BigDecimal getPrefixNsNumber() {
    return prefixNsNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_ns_number")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixNsInteger
   * @return prefixNsInteger
  */
  
========
  
  @ApiModelProperty(example = "-2", value = "")
  @JsonProperty("prefix_ns_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Integer getPrefixNsInteger() {
    return prefixNsInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_ns_integer")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
  */
  
========
  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("prefix_ns_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public Boolean getPrefixNsBoolean() {
    return prefixNsBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_ns_boolean")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addPrefixNsArrayItem(Integer prefixNsArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_ns_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getPrefixNsArray() {
    return prefixNsArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_ns_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }

    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

  public XmlItem removePrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (prefixNsArrayItem != null && this.prefixNsArray != null) {
      this.prefixNsArray.remove(prefixNsArrayItem);
    }

    return this;
  }
  /**
   **/
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public XmlItem prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
  public XmlItem addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
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
  
========
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix_ns_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public List<Integer> getPrefixNsWrappedArray() {
    return prefixNsWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  @JsonProperty("prefix_ns_wrapped_array")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  public void setPrefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }

<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========
  public XmlItem addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }

    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

  public XmlItem removePrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (prefixNsWrappedArrayItem != null && this.prefixNsWrappedArray != null) {
      this.prefixNsWrappedArray.remove(prefixNsWrappedArrayItem);
    }

    return this;
  }

>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItem xmlItem = (XmlItem) o;
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
    sb.append("class XmlItem {\n");
    
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
<<<<<<<< HEAD:samples/client/petstore/spring-http-interface-reactive/src/main/java/org/openapitools/model/XmlItem.java
========


  public static XmlItemBuilder<?, ?> builder() {
    return new XmlItemBuilderImpl();
  }

  private static final class XmlItemBuilderImpl extends XmlItemBuilder<XmlItem, XmlItemBuilderImpl> {

    @Override
    protected XmlItemBuilderImpl self() {
      return this;
    }

    @Override
    public XmlItem build() {
      return new XmlItem(this);
    }
  }

  public static abstract class XmlItemBuilder<C extends XmlItem, B extends XmlItemBuilder<C, B>>  {
    private String attributeString;
    private BigDecimal attributeNumber;
    private Integer attributeInteger;
    private Boolean attributeBoolean;
    private List<Integer> wrappedArray;
    private String nameString;
    private BigDecimal nameNumber;
    private Integer nameInteger;
    private Boolean nameBoolean;
    private List<Integer> nameArray;
    private List<Integer> nameWrappedArray;
    private String prefixString;
    private BigDecimal prefixNumber;
    private Integer prefixInteger;
    private Boolean prefixBoolean;
    private List<Integer> prefixArray;
    private List<Integer> prefixWrappedArray;
    private String namespaceString;
    private BigDecimal namespaceNumber;
    private Integer namespaceInteger;
    private Boolean namespaceBoolean;
    private List<Integer> namespaceArray;
    private List<Integer> namespaceWrappedArray;
    private String prefixNsString;
    private BigDecimal prefixNsNumber;
    private Integer prefixNsInteger;
    private Boolean prefixNsBoolean;
    private List<Integer> prefixNsArray;
    private List<Integer> prefixNsWrappedArray;
    protected abstract B self();

    public abstract C build();

    public B attributeString(String attributeString) {
      this.attributeString = attributeString;
      return self();
    }
    public B attributeNumber(BigDecimal attributeNumber) {
      this.attributeNumber = attributeNumber;
      return self();
    }
    public B attributeInteger(Integer attributeInteger) {
      this.attributeInteger = attributeInteger;
      return self();
    }
    public B attributeBoolean(Boolean attributeBoolean) {
      this.attributeBoolean = attributeBoolean;
      return self();
    }
    public B wrappedArray(List<Integer> wrappedArray) {
      this.wrappedArray = wrappedArray;
      return self();
    }
    public B nameString(String nameString) {
      this.nameString = nameString;
      return self();
    }
    public B nameNumber(BigDecimal nameNumber) {
      this.nameNumber = nameNumber;
      return self();
    }
    public B nameInteger(Integer nameInteger) {
      this.nameInteger = nameInteger;
      return self();
    }
    public B nameBoolean(Boolean nameBoolean) {
      this.nameBoolean = nameBoolean;
      return self();
    }
    public B nameArray(List<Integer> nameArray) {
      this.nameArray = nameArray;
      return self();
    }
    public B nameWrappedArray(List<Integer> nameWrappedArray) {
      this.nameWrappedArray = nameWrappedArray;
      return self();
    }
    public B prefixString(String prefixString) {
      this.prefixString = prefixString;
      return self();
    }
    public B prefixNumber(BigDecimal prefixNumber) {
      this.prefixNumber = prefixNumber;
      return self();
    }
    public B prefixInteger(Integer prefixInteger) {
      this.prefixInteger = prefixInteger;
      return self();
    }
    public B prefixBoolean(Boolean prefixBoolean) {
      this.prefixBoolean = prefixBoolean;
      return self();
    }
    public B prefixArray(List<Integer> prefixArray) {
      this.prefixArray = prefixArray;
      return self();
    }
    public B prefixWrappedArray(List<Integer> prefixWrappedArray) {
      this.prefixWrappedArray = prefixWrappedArray;
      return self();
    }
    public B namespaceString(String namespaceString) {
      this.namespaceString = namespaceString;
      return self();
    }
    public B namespaceNumber(BigDecimal namespaceNumber) {
      this.namespaceNumber = namespaceNumber;
      return self();
    }
    public B namespaceInteger(Integer namespaceInteger) {
      this.namespaceInteger = namespaceInteger;
      return self();
    }
    public B namespaceBoolean(Boolean namespaceBoolean) {
      this.namespaceBoolean = namespaceBoolean;
      return self();
    }
    public B namespaceArray(List<Integer> namespaceArray) {
      this.namespaceArray = namespaceArray;
      return self();
    }
    public B namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
      this.namespaceWrappedArray = namespaceWrappedArray;
      return self();
    }
    public B prefixNsString(String prefixNsString) {
      this.prefixNsString = prefixNsString;
      return self();
    }
    public B prefixNsNumber(BigDecimal prefixNsNumber) {
      this.prefixNsNumber = prefixNsNumber;
      return self();
    }
    public B prefixNsInteger(Integer prefixNsInteger) {
      this.prefixNsInteger = prefixNsInteger;
      return self();
    }
    public B prefixNsBoolean(Boolean prefixNsBoolean) {
      this.prefixNsBoolean = prefixNsBoolean;
      return self();
    }
    public B prefixNsArray(List<Integer> prefixNsArray) {
      this.prefixNsArray = prefixNsArray;
      return self();
    }
    public B prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
      this.prefixNsWrappedArray = prefixNsWrappedArray;
      return self();
    }
  }
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/server/petstore/jaxrs-spec-jakarta/src/gen/java/org/openapitools/model/XmlItem.java
}

