/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.2-SNAPSHOT
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
import de.id4i.api.model.InputStream;
import de.id4i.api.model.URI;
import de.id4i.api.model.URL;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InputStreamResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-01T14:56:04.234Z")
public class InputStreamResource {
  @SerializedName("description")
  private String description = null;

  @SerializedName("file")
  private java.io.File file = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("inputStream")
  private InputStream inputStream = null;

  @SerializedName("open")
  private Boolean open = null;

  @SerializedName("readable")
  private Boolean readable = null;

  @SerializedName("uri")
  private URI uri = null;

  @SerializedName("url")
  private URL url = null;

  public InputStreamResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InputStreamResource file(java.io.File file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")
  public java.io.File getFile() {
    return file;
  }

  public void setFile(java.io.File file) {
    this.file = file;
  }

  public InputStreamResource filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public InputStreamResource inputStream(InputStream inputStream) {
    this.inputStream = inputStream;
    return this;
  }

   /**
   * Get inputStream
   * @return inputStream
  **/
  @ApiModelProperty(value = "")
  public InputStream getInputStream() {
    return inputStream;
  }

  public void setInputStream(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  public InputStreamResource open(Boolean open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @ApiModelProperty(value = "")
  public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public InputStreamResource readable(Boolean readable) {
    this.readable = readable;
    return this;
  }

   /**
   * Get readable
   * @return readable
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadable() {
    return readable;
  }

  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  public InputStreamResource uri(URI uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }

  public InputStreamResource url(URL url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStreamResource inputStreamResource = (InputStreamResource) o;
    return Objects.equals(this.description, inputStreamResource.description) &&
        Objects.equals(this.file, inputStreamResource.file) &&
        Objects.equals(this.filename, inputStreamResource.filename) &&
        Objects.equals(this.inputStream, inputStreamResource.inputStream) &&
        Objects.equals(this.open, inputStreamResource.open) &&
        Objects.equals(this.readable, inputStreamResource.readable) &&
        Objects.equals(this.uri, inputStreamResource.uri) &&
        Objects.equals(this.url, inputStreamResource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, filename, inputStream, open, readable, uri, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStreamResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

