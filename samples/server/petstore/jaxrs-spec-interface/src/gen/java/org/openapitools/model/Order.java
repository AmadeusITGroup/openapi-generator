/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:47.458Z[UTC]
 */

package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class Order  implements Serializable {
  
  
  private @Valid Long id;

  
  private @Valid Long petId;

  
  private @Valid Integer quantity;

  
  private @Valid Date shipDate;


public enum Status {

    PLACED(String.valueOf("PLACED")), APPROVED(String.valueOf("APPROVED")), DELIVERED(String.valueOf("DELIVERED"));


    private String value;

    Status (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static Status fromString(String s) {
        for (Status b : Status.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static Status fromValue(String value) {
        for (Status b : Status.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  
  private @Valid Status status;

  
  private @Valid Boolean complete = false;

  /**
   **/
  public Order id(Long id) {
    this.id = id;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("petId")
  public Long getPetId() {
    return petId;
  }

  @JsonProperty("petId")
  public void setPetId(Long petId) {
    this.petId = petId;
  }

  /**
   **/
  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  @JsonProperty("quantity")
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  public Order shipDate(Date shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  @JsonProperty("shipDate")
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  /**
   * Order Status
   **/
  public Order status(Status status) {
    this.status = status;
    return this;
  }

  
  
  @ApiModelProperty(value = "Order Status")
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Status status) {
    this.status = status;
  }

  /**
   **/
  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  
  
  @ApiModelProperty(value = "")
  @JsonProperty("complete")
  public Boolean getComplete() {
    return complete;
  }

  @JsonProperty("complete")
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId, quantity, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

