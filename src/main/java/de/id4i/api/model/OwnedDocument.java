/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.1.4-SNAPSHOT
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
 * OwnedDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-05T11:04:37.682Z")
public class OwnedDocument {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("ownerOrganizationId")
  private Long ownerOrganizationId = null;

  @SerializedName("publicVisibility")
  private Boolean publicVisibility = null;

  @SerializedName("sharedWithOrganizationIds")
  private List<Long> sharedWithOrganizationIds = null;

  public OwnedDocument filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(example = "publicInfo.pdf", value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

   /**
   * The organization&#39;s id which owns the document
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(example = "5", value = "The organization's id which owns the document")
  public Long getOwnerOrganizationId() {
    return ownerOrganizationId;
  }

  public OwnedDocument publicVisibility(Boolean publicVisibility) {
    this.publicVisibility = publicVisibility;
    return this;
  }

   /**
   * Document is publicly readable
   * @return publicVisibility
  **/
  @ApiModelProperty(example = "true", value = "Document is publicly readable")
  public Boolean getPublicVisibility() {
    return publicVisibility;
  }

  public void setPublicVisibility(Boolean publicVisibility) {
    this.publicVisibility = publicVisibility;
  }

  public OwnedDocument sharedWithOrganizationIds(List<Long> sharedWithOrganizationIds) {
    this.sharedWithOrganizationIds = sharedWithOrganizationIds;
    return this;
  }

  public OwnedDocument addSharedWithOrganizationIdsItem(Long sharedWithOrganizationIdsItem) {
    if (this.sharedWithOrganizationIds == null) {
      this.sharedWithOrganizationIds = new ArrayList<Long>();
    }
    this.sharedWithOrganizationIds.add(sharedWithOrganizationIdsItem);
    return this;
  }

   /**
   * Document is readable by these organizations
   * @return sharedWithOrganizationIds
  **/
  @ApiModelProperty(example = "[101,102,103]", value = "Document is readable by these organizations")
  public List<Long> getSharedWithOrganizationIds() {
    return sharedWithOrganizationIds;
  }

  public void setSharedWithOrganizationIds(List<Long> sharedWithOrganizationIds) {
    this.sharedWithOrganizationIds = sharedWithOrganizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnedDocument ownedDocument = (OwnedDocument) o;
    return Objects.equals(this.filename, ownedDocument.filename) &&
        Objects.equals(this.ownerOrganizationId, ownedDocument.ownerOrganizationId) &&
        Objects.equals(this.publicVisibility, ownedDocument.publicVisibility) &&
        Objects.equals(this.sharedWithOrganizationIds, ownedDocument.sharedWithOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, ownerOrganizationId, publicVisibility, sharedWithOrganizationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnedDocument {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
    sb.append("    publicVisibility: ").append(toIndentedString(publicVisibility)).append("\n");
    sb.append("    sharedWithOrganizationIds: ").append(toIndentedString(sharedWithOrganizationIds)).append("\n");
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

