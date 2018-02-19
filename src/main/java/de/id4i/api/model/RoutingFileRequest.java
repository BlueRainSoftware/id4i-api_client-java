/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.2-SNAPSHOT
 * Contact: info@bluerain.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.id4i.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.id4i.api.model.RoutingFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoutingFileRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-19T22:01:40.357Z")
public class RoutingFileRequest {
  @SerializedName("routing")
  private RoutingFile routing = null;

  @SerializedName("organizationId")
  private Long organizationId = null;

  public RoutingFileRequest routing(RoutingFile routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Get routing
   * @return routing
  **/
  @ApiModelProperty(required = true, value = "")
  public RoutingFile getRouting() {
    return routing;
  }

  public void setRouting(RoutingFile routing) {
    this.routing = routing;
  }

  public RoutingFileRequest organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingFileRequest routingFileRequest = (RoutingFileRequest) o;
    return Objects.equals(this.routing, routingFileRequest.routing) &&
        Objects.equals(this.organizationId, routingFileRequest.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routing, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingFileRequest {\n");
    
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

