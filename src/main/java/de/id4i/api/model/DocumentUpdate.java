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
import de.id4i.api.model.VisibilityUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DocumentUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-23T22:07:51.822Z")
public class DocumentUpdate {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("visibility")
  private VisibilityUpdate visibility = null;

  public DocumentUpdate filename(String filename) {
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

  public DocumentUpdate mimeType(String mimeType) {
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

  public DocumentUpdate visibility(VisibilityUpdate visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Visibility configuration
   * @return visibility
  **/
  @ApiModelProperty(value = "Visibility configuration")
  public VisibilityUpdate getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityUpdate visibility) {
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
    DocumentUpdate documentUpdate = (DocumentUpdate) o;
    return Objects.equals(this.filename, documentUpdate.filename) &&
        Objects.equals(this.mimeType, documentUpdate.mimeType) &&
        Objects.equals(this.visibility, documentUpdate.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, mimeType, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpdate {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

