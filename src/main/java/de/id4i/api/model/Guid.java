/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.4.1-SNAPSHOT
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-07T22:03:20.191Z")
public class Guid {
  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("holderOrganizationId")
  private Long holderOrganizationId = null;

  @SerializedName("id4n")
  private String id4n = null;

  @SerializedName("ownerOrganizationId")
  private Long ownerOrganizationId = null;

   /**
   * The UTC unix timestamp of when this GUID has been created
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "1517232722", value = "The UTC unix timestamp of when this GUID has been created")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

   /**
   * Organization ID of the GUID holder
   * @return holderOrganizationId
  **/
  @ApiModelProperty(value = "Organization ID of the GUID holder")
  public Long getHolderOrganizationId() {
    return holderOrganizationId;
  }

   /**
   * The ID
   * @return id4n
  **/
  @ApiModelProperty(example = "3THvgrWxqgTFC4", value = "The ID")
  public String getId4n() {
    return id4n;
  }

   /**
   * Organization ID of the GUID owner
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(value = "Organization ID of the GUID owner")
  public Long getOwnerOrganizationId() {
    return ownerOrganizationId;
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
        Objects.equals(this.holderOrganizationId, guid.holderOrganizationId) &&
        Objects.equals(this.id4n, guid.id4n) &&
        Objects.equals(this.ownerOrganizationId, guid.ownerOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, holderOrganizationId, id4n, ownerOrganizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guid {\n");
    
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    holderOrganizationId: ").append(toIndentedString(holderOrganizationId)).append("\n");
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
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

