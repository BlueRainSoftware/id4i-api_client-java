/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.7.0-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * TransferReceiveInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-11T09:57:14.005Z")
public class TransferReceiveInfo {
  @SerializedName("holderOrganizationId")
  private String holderOrganizationId = null;

  @SerializedName("keepOwnership")
  private Boolean keepOwnership = null;

  @SerializedName("nextScanOwnership")
  private Boolean nextScanOwnership = null;

  @SerializedName("ownerOrganizationId")
  private String ownerOrganizationId = null;

  @SerializedName("recipientOrganizationIds")
  private List<String> recipientOrganizationIds = null;

  public TransferReceiveInfo holderOrganizationId(String holderOrganizationId) {
    this.holderOrganizationId = holderOrganizationId;
    return this;
  }

   /**
   * The current holder of the object
   * @return holderOrganizationId
  **/
  @ApiModelProperty(example = "de.id4i", required = true, value = "The current holder of the object")
  public String getHolderOrganizationId() {
    return holderOrganizationId;
  }

  public void setHolderOrganizationId(String holderOrganizationId) {
    this.holderOrganizationId = holderOrganizationId;
  }

   /**
   * Keep the public ownership while transferring the object
   * @return keepOwnership
  **/
  @ApiModelProperty(example = "true", value = "Keep the public ownership while transferring the object")
  public Boolean isKeepOwnership() {
    return keepOwnership;
  }

   /**
   * Allow anyone which scans or knows the ID4N to obtain this object
   * @return nextScanOwnership
  **/
  @ApiModelProperty(example = "false", value = "Allow anyone which scans or knows the ID4N to obtain this object")
  public Boolean isNextScanOwnership() {
    return nextScanOwnership;
  }

   /**
   * The current publicly visible owner of the object
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(example = "de.bluerain", value = "The current publicly visible owner of the object")
  public String getOwnerOrganizationId() {
    return ownerOrganizationId;
  }

  public TransferReceiveInfo recipientOrganizationIds(List<String> recipientOrganizationIds) {
    this.recipientOrganizationIds = recipientOrganizationIds;
    return this;
  }

  public TransferReceiveInfo addRecipientOrganizationIdsItem(String recipientOrganizationIdsItem) {
    if (this.recipientOrganizationIds == null) {
      this.recipientOrganizationIds = new ArrayList<>();
    }
    this.recipientOrganizationIds.add(recipientOrganizationIdsItem);
    return this;
  }

   /**
   * Allow only these organizations to obtain this object
   * @return recipientOrganizationIds
  **/
  @ApiModelProperty(example = "[\"de.acme\",\"com.porsche\",\"com.example\"]", value = "Allow only these organizations to obtain this object")
  public List<String> getRecipientOrganizationIds() {
    return recipientOrganizationIds;
  }

  public void setRecipientOrganizationIds(List<String> recipientOrganizationIds) {
    this.recipientOrganizationIds = recipientOrganizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferReceiveInfo transferReceiveInfo = (TransferReceiveInfo) o;
    return Objects.equals(this.holderOrganizationId, transferReceiveInfo.holderOrganizationId) &&
        Objects.equals(this.keepOwnership, transferReceiveInfo.keepOwnership) &&
        Objects.equals(this.nextScanOwnership, transferReceiveInfo.nextScanOwnership) &&
        Objects.equals(this.ownerOrganizationId, transferReceiveInfo.ownerOrganizationId) &&
        Objects.equals(this.recipientOrganizationIds, transferReceiveInfo.recipientOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderOrganizationId, keepOwnership, nextScanOwnership, ownerOrganizationId, recipientOrganizationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferReceiveInfo {\n");
    
    sb.append("    holderOrganizationId: ").append(toIndentedString(holderOrganizationId)).append("\n");
    sb.append("    keepOwnership: ").append(toIndentedString(keepOwnership)).append("\n");
    sb.append("    nextScanOwnership: ").append(toIndentedString(nextScanOwnership)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
    sb.append("    recipientOrganizationIds: ").append(toIndentedString(recipientOrganizationIds)).append("\n");
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

