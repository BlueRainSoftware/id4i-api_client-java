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
 * An organization
 */
@ApiModel(description = "An organization")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-07T22:11:33.046Z")
public class Organization {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("logoURL")
  private String logoURL = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

   /**
   * The id of the organization ( Deprecated: Use namespace instead. )
   * @return id
  **/
  @ApiModelProperty(example = "100", value = "The id of the organization ( Deprecated: Use namespace instead. )")
  public Long getId() {
    return id;
  }

   /**
   * URL to a logo of the organization
   * @return logoURL
  **/
  @ApiModelProperty(example = "/api/v1/public/images/abcdef", value = "URL to a logo of the organization")
  public String getLogoURL() {
    return logoURL;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the organization
   * @return name
  **/
  @ApiModelProperty(example = "ACME Inc.", required = true, value = "The name of the organization")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace of the organization
   * @return namespace
  **/
  @ApiModelProperty(example = "de.acme", required = true, value = "The namespace of the organization")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.logoURL, organization.logoURL) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.namespace, organization.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logoURL, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

