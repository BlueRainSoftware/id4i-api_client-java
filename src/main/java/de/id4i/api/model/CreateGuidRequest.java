/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.8-SNAPSHOT
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
 * GUID creation information
 */
@ApiModel(description = "GUID creation information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-30T22:07:01.144Z")
public class CreateGuidRequest {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  public CreateGuidRequest count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The total number of GUIDs to create
   * minimum: 1
   * maximum: 1000
   * @return count
  **/
  @ApiModelProperty(example = "1", required = true, value = "The total number of GUIDs to create")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CreateGuidRequest length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * The charactersequence length of the GUID
   * minimum: 7
   * maximum: 255
   * @return length
  **/
  @ApiModelProperty(example = "40", required = true, value = "The charactersequence length of the GUID")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public CreateGuidRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The namespace of the organization where the generated GUIDs should be assigned.
   * @return organizationId
  **/
  @ApiModelProperty(example = "de.acme", required = true, value = "The namespace of the organization where the generated GUIDs should be assigned.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
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
    CreateGuidRequest createGuidRequest = (CreateGuidRequest) o;
    return Objects.equals(this.count, createGuidRequest.count) &&
        Objects.equals(this.length, createGuidRequest.length) &&
        Objects.equals(this.organizationId, createGuidRequest.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, length, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGuidRequest {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

