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
 * DocumentUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-01T18:27:19.122Z")
public class DocumentUpdate {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("publicVisibility")
  private Boolean publicVisibility = null;

  @SerializedName("visibleByOrganizationIds")
  private List<Long> visibleByOrganizationIds = null;

  public DocumentUpdate filename(String filename) {
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

  public DocumentUpdate publicVisibility(Boolean publicVisibility) {
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

  public DocumentUpdate visibleByOrganizationIds(List<Long> visibleByOrganizationIds) {
    this.visibleByOrganizationIds = visibleByOrganizationIds;
    return this;
  }

  public DocumentUpdate addVisibleByOrganizationIdsItem(Long visibleByOrganizationIdsItem) {
    if (this.visibleByOrganizationIds == null) {
      this.visibleByOrganizationIds = new ArrayList<Long>();
    }
    this.visibleByOrganizationIds.add(visibleByOrganizationIdsItem);
    return this;
  }

   /**
   * Document is readable by these organizations
   * @return visibleByOrganizationIds
  **/
  @ApiModelProperty(example = "[101,102,103]", value = "Document is readable by these organizations")
  public List<Long> getVisibleByOrganizationIds() {
    return visibleByOrganizationIds;
  }

  public void setVisibleByOrganizationIds(List<Long> visibleByOrganizationIds) {
    this.visibleByOrganizationIds = visibleByOrganizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUpdate documentUpdate = (DocumentUpdate) o;
    return Objects.equals(this.filename, documentUpdate.filename) &&
        Objects.equals(this.publicVisibility, documentUpdate.publicVisibility) &&
        Objects.equals(this.visibleByOrganizationIds, documentUpdate.visibleByOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, publicVisibility, visibleByOrganizationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpdate {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    publicVisibility: ").append(toIndentedString(publicVisibility)).append("\n");
    sb.append("    visibleByOrganizationIds: ").append(toIndentedString(visibleByOrganizationIds)).append("\n");
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

