/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.0.1-alpha
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-20T08:44:38.186Z")
public class ApiKeyPrivilegeInfo {
  @SerializedName("id4nAssociated")
  private Boolean id4nAssociated = null;

  @SerializedName("name")
  private String name = null;

  public ApiKeyPrivilegeInfo id4nAssociated(Boolean id4nAssociated) {
    this.id4nAssociated = id4nAssociated;
    return this;
  }

   /**
   * Get id4nAssociated
   * @return id4nAssociated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getId4nAssociated() {
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
    return Objects.equals(this.id4nAssociated, apiKeyPrivilegeInfo.id4nAssociated) &&
        Objects.equals(this.name, apiKeyPrivilegeInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id4nAssociated, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyPrivilegeInfo {\n");
    
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

