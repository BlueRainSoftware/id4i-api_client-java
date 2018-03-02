/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.3-SNAPSHOT
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
import de.id4i.api.model.Visibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OwnedDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-02T14:21:49.901Z")
public class OwnedDocument {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("ownerOrganizationId")
  private Long ownerOrganizationId = null;

  @SerializedName("visibility")
  private Visibility visibility = null;

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

  public OwnedDocument visibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Visibility configuration
   * @return visibility
  **/
  @ApiModelProperty(value = "Visibility configuration")
  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
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
        Objects.equals(this.visibility, ownedDocument.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, ownerOrganizationId, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnedDocument {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

