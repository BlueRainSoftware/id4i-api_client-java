/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 1.0.0
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
 * AppInfoPresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-03T14:52:13.099+01:00")
public class AppInfoPresentation {
  @SerializedName("branch")
  private String branch = null;

  @SerializedName("commitTime")
  private String commitTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("productionMode")
  private Boolean productionMode = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("version")
  private String version = null;

  public AppInfoPresentation branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public AppInfoPresentation commitTime(String commitTime) {
    this.commitTime = commitTime;
    return this;
  }

   /**
   * Get commitTime
   * @return commitTime
  **/
  @ApiModelProperty(value = "")
  public String getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(String commitTime) {
    this.commitTime = commitTime;
  }

  public AppInfoPresentation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppInfoPresentation productionMode(Boolean productionMode) {
    this.productionMode = productionMode;
    return this;
  }

   /**
   * Get productionMode
   * @return productionMode
  **/
  @ApiModelProperty(value = "")
  public Boolean isProductionMode() {
    return productionMode;
  }

  public void setProductionMode(Boolean productionMode) {
    this.productionMode = productionMode;
  }

  public AppInfoPresentation revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public AppInfoPresentation version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoPresentation appInfoPresentation = (AppInfoPresentation) o;
    return Objects.equals(this.branch, appInfoPresentation.branch) &&
        Objects.equals(this.commitTime, appInfoPresentation.commitTime) &&
        Objects.equals(this.name, appInfoPresentation.name) &&
        Objects.equals(this.productionMode, appInfoPresentation.productionMode) &&
        Objects.equals(this.revision, appInfoPresentation.revision) &&
        Objects.equals(this.version, appInfoPresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, commitTime, name, productionMode, revision, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoPresentation {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productionMode: ").append(toIndentedString(productionMode)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

