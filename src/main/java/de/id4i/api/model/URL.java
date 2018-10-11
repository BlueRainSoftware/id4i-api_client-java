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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * URL
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-11T08:28:00.753Z")
public class URL {
  @SerializedName("authority")
  private String authority = null;

  @SerializedName("content")
  private Object content = null;

  @SerializedName("defaultPort")
  private Integer defaultPort = null;

  @SerializedName("file")
  private String file = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("userInfo")
  private String userInfo = null;

  public URL authority(String authority) {
    this.authority = authority;
    return this;
  }

   /**
   * Get authority
   * @return authority
  **/
  @ApiModelProperty(value = "")
  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public URL content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public URL defaultPort(Integer defaultPort) {
    this.defaultPort = defaultPort;
    return this;
  }

   /**
   * Get defaultPort
   * @return defaultPort
  **/
  @ApiModelProperty(value = "")
  public Integer getDefaultPort() {
    return defaultPort;
  }

  public void setDefaultPort(Integer defaultPort) {
    this.defaultPort = defaultPort;
  }

  public URL file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public URL host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @ApiModelProperty(value = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public URL path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public URL port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public URL protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public URL query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public URL ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public URL userInfo(String userInfo) {
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @ApiModelProperty(value = "")
  public String getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(String userInfo) {
    this.userInfo = userInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URL URL = (URL) o;
    return Objects.equals(this.authority, URL.authority) &&
        Objects.equals(this.content, URL.content) &&
        Objects.equals(this.defaultPort, URL.defaultPort) &&
        Objects.equals(this.file, URL.file) &&
        Objects.equals(this.host, URL.host) &&
        Objects.equals(this.path, URL.path) &&
        Objects.equals(this.port, URL.port) &&
        Objects.equals(this.protocol, URL.protocol) &&
        Objects.equals(this.query, URL.query) &&
        Objects.equals(this.ref, URL.ref) &&
        Objects.equals(this.userInfo, URL.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, content, defaultPort, file, host, path, port, protocol, query, ref, userInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URL {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    defaultPort: ").append(toIndentedString(defaultPort)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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

