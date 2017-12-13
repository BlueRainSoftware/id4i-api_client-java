/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.0.1-alpha
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateRoutingCollectionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-13T13:44:59.801Z")
public class CreateRoutingCollectionRequest {
  @SerializedName("label")
  private String label = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("organizationId")
  private Long organizationId = null;

  public CreateRoutingCollectionRequest label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CreateRoutingCollectionRequest length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * minimum: 6
   * maximum: 255
   * @return length
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public CreateRoutingCollectionRequest organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(required = true, value = "")
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
    CreateRoutingCollectionRequest createRoutingCollectionRequest = (CreateRoutingCollectionRequest) o;
    return Objects.equals(this.label, createRoutingCollectionRequest.label) &&
        Objects.equals(this.length, createRoutingCollectionRequest.length) &&
        Objects.equals(this.organizationId, createRoutingCollectionRequest.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, length, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoutingCollectionRequest {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

