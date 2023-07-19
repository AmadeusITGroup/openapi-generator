package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ClientDto
 */

@JsonTypeName("Client")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ClientDto {

  private String client;

  public ClientDto client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-beanvalidation-no-nullable/src/main/java/org/openapitools/model/Client.java
  @Schema(name = "client", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
========
  @JsonProperty("client")
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/ClientDto.java
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDto client = (ClientDto) o;
    return Objects.equals(this.client, client.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDto {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

