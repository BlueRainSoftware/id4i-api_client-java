/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.4.1-SNAPSHOT
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
 * ApiKeyChangeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-05T12:02:26.050Z")
public class ApiKeyChangeRequest {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("newLabel")
  private String newLabel = null;

  public ApiKeyChangeRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ApiKeyChangeRequest newLabel(String newLabel) {
    this.newLabel = newLabel;
    return this;
  }

   /**
   * Get newLabel
   * @return newLabel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNewLabel() {
    return newLabel;
  }

  public void setNewLabel(String newLabel) {
    this.newLabel = newLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyChangeRequest apiKeyChangeRequest = (ApiKeyChangeRequest) o;
    return Objects.equals(this.active, apiKeyChangeRequest.active) &&
        Objects.equals(this.newLabel, apiKeyChangeRequest.newLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, newLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyChangeRequest {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    newLabel: ").append(toIndentedString(newLabel)).append("\n");
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

