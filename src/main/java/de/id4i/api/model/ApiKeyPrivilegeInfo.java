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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiKeyPrivilegeInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-14T22:08:56.938Z")
public class ApiKeyPrivilegeInfo {
  @SerializedName("allowsBillableOperations")
  private Boolean allowsBillableOperations = null;

  @SerializedName("helpText")
  private String helpText = null;

  @SerializedName("id4nAssociated")
  private Boolean id4nAssociated = null;

  @SerializedName("name")
  private String name = null;

  public ApiKeyPrivilegeInfo allowsBillableOperations(Boolean allowsBillableOperations) {
    this.allowsBillableOperations = allowsBillableOperations;
    return this;
  }

   /**
   * Get allowsBillableOperations
   * @return allowsBillableOperations
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowsBillableOperations() {
    return allowsBillableOperations;
  }

  public void setAllowsBillableOperations(Boolean allowsBillableOperations) {
    this.allowsBillableOperations = allowsBillableOperations;
  }

  public ApiKeyPrivilegeInfo helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }

   /**
   * Get helpText
   * @return helpText
  **/
  @ApiModelProperty(value = "")
  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  public ApiKeyPrivilegeInfo id4nAssociated(Boolean id4nAssociated) {
    this.id4nAssociated = id4nAssociated;
    return this;
  }

   /**
   * Get id4nAssociated
   * @return id4nAssociated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isId4nAssociated() {
    return id4nAssociated;
  }

  public void setId4nAssociated(Boolean id4nAssociated) {
    this.id4nAssociated = id4nAssociated;
  }

  public ApiKeyPrivilegeInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyPrivilegeInfo apiKeyPrivilegeInfo = (ApiKeyPrivilegeInfo) o;
    return Objects.equals(this.allowsBillableOperations, apiKeyPrivilegeInfo.allowsBillableOperations) &&
        Objects.equals(this.helpText, apiKeyPrivilegeInfo.helpText) &&
        Objects.equals(this.id4nAssociated, apiKeyPrivilegeInfo.id4nAssociated) &&
        Objects.equals(this.name, apiKeyPrivilegeInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowsBillableOperations, helpText, id4nAssociated, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyPrivilegeInfo {\n");
    
    sb.append("    allowsBillableOperations: ").append(toIndentedString(allowsBillableOperations)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    id4nAssociated: ").append(toIndentedString(id4nAssociated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

