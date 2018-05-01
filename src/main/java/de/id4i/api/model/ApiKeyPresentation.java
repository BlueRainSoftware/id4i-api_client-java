/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.5.1
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
 * ApiKeyPresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-01T22:02:48.801Z")
public class ApiKeyPresentation {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("organizationId")
  private Long organizationId = null;

  public ApiKeyPresentation active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether this API key is active
   * @return active
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether this API key is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ApiKeyPresentation createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The UTC unix timestamp of when this api key has been created
   * @return createdAt
  **/
  @ApiModelProperty(example = "1517232722", required = true, value = "The UTC unix timestamp of when this api key has been created")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public ApiKeyPresentation createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "user123", required = true, value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ApiKeyPresentation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The api key identifier
   * @return key
  **/
  @ApiModelProperty(example = "39978f49-6ff1-4147-bf0f-9910185084b7", required = true, value = "The api key identifier")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApiKeyPresentation label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label / name of the api key
   * @return label
  **/
  @ApiModelProperty(example = "My Api Key", required = true, value = "The label / name of the api key")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ApiKeyPresentation organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The organization id this api key belongs to
   * @return organizationId
  **/
  @ApiModelProperty(example = "10", required = true, value = "The organization id this api key belongs to")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyPresentation apiKeyPresentation = (ApiKeyPresentation) o;
    return Objects.equals(this.active, apiKeyPresentation.active) &&
        Objects.equals(this.createdAt, apiKeyPresentation.createdAt) &&
        Objects.equals(this.createdBy, apiKeyPresentation.createdBy) &&
        Objects.equals(this.key, apiKeyPresentation.key) &&
        Objects.equals(this.label, apiKeyPresentation.label) &&
        Objects.equals(this.organizationId, apiKeyPresentation.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, createdBy, key, label, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyPresentation {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

