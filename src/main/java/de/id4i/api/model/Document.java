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
import de.id4i.api.model.Visibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Document
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-11T22:06:52.180Z")
public class Document {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("ownerOrganizationId")
  private String ownerOrganizationId = null;

  @SerializedName("visibility")
  private Visibility visibility = null;

  public Document filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * File Name
   * @return filename
  **/
  @ApiModelProperty(example = "publicInfo.pdf", value = "File Name")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Document mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime Type
   * @return mimeType
  **/
  @ApiModelProperty(example = "text/plain", value = "Mime Type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

   /**
   * The organization&#39;s namespace which owns the document
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(example = "de.bluerain", value = "The organization's namespace which owns the document")
  public String getOwnerOrganizationId() {
    return ownerOrganizationId;
  }

  public Document visibility(Visibility visibility) {
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
    Document document = (Document) o;
    return Objects.equals(this.filename, document.filename) &&
        Objects.equals(this.mimeType, document.mimeType) &&
        Objects.equals(this.ownerOrganizationId, document.ownerOrganizationId) &&
        Objects.equals(this.visibility, document.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, mimeType, ownerOrganizationId, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

