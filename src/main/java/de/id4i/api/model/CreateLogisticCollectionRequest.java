/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.4.0
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
 * CreateLogisticCollectionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-31T12:39:55.226Z")
public class CreateLogisticCollectionRequest {
  @SerializedName("label")
  private String label = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("organizationId")
  private Long organizationId = null;

  public CreateLogisticCollectionRequest label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CreateLogisticCollectionRequest length(Integer length) {
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

  public CreateLogisticCollectionRequest organizationId(Long organizationId) {
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
    CreateLogisticCollectionRequest createLogisticCollectionRequest = (CreateLogisticCollectionRequest) o;
    return Objects.equals(this.label, createLogisticCollectionRequest.label) &&
        Objects.equals(this.length, createLogisticCollectionRequest.length) &&
        Objects.equals(this.organizationId, createLogisticCollectionRequest.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, length, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLogisticCollectionRequest {\n");
    
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

