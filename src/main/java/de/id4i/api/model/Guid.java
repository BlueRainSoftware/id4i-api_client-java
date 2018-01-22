/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.1.3-SNAPSHOT
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
 * Guid
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-22T15:34:38.542Z")
public class Guid {
  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("id4n")
  private String id4n = null;

  @SerializedName("nextScanOwnership")
  private Boolean nextScanOwnership = null;

  @SerializedName("ownerOrganizationId")
  private Long ownerOrganizationId = null;

  public Guid createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public Guid id4n(String id4n) {
    this.id4n = id4n;
    return this;
  }

   /**
   * Get id4n
   * @return id4n
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId4n() {
    return id4n;
  }

  public void setId4n(String id4n) {
    this.id4n = id4n;
  }

  public Guid nextScanOwnership(Boolean nextScanOwnership) {
    this.nextScanOwnership = nextScanOwnership;
    return this;
  }

   /**
   * Get nextScanOwnership
   * @return nextScanOwnership
  **/
  @ApiModelProperty(value = "")
  public Boolean getNextScanOwnership() {
    return nextScanOwnership;
  }

  public void setNextScanOwnership(Boolean nextScanOwnership) {
    this.nextScanOwnership = nextScanOwnership;
  }

  public Guid ownerOrganizationId(Long ownerOrganizationId) {
    this.ownerOrganizationId = ownerOrganizationId;
    return this;
  }

   /**
   * Get ownerOrganizationId
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(value = "")
  public Long getOwnerOrganizationId() {
    return ownerOrganizationId;
  }

  public void setOwnerOrganizationId(Long ownerOrganizationId) {
    this.ownerOrganizationId = ownerOrganizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guid guid = (Guid) o;
    return Objects.equals(this.createdTimestamp, guid.createdTimestamp) &&
        Objects.equals(this.id4n, guid.id4n) &&
        Objects.equals(this.nextScanOwnership, guid.nextScanOwnership) &&
        Objects.equals(this.ownerOrganizationId, guid.ownerOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, id4n, nextScanOwnership, ownerOrganizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guid {\n");
    
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
    sb.append("    nextScanOwnership: ").append(toIndentedString(nextScanOwnership)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
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

