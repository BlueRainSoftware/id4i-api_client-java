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
 * A partner organization
 */
@ApiModel(description = "A partner organization")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-13T22:08:37.358Z")
public class PartnerOrganization {
  @SerializedName("logoURL")
  private String logoURL = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

   /**
   * URL to a logo of the organization
   * @return logoURL
  **/
  @ApiModelProperty(example = "/api/v1/public/images/abcdef", value = "URL to a logo of the organization")
  public String getLogoURL() {
    return logoURL;
  }

   /**
   * The name of the organization
   * @return name
  **/
  @ApiModelProperty(example = "ACME Inc.", value = "The name of the organization")
  public String getName() {
    return name;
  }

   /**
   * The namespace of the organization
   * @return namespace
  **/
  @ApiModelProperty(example = "de.acme", value = "The namespace of the organization")
  public String getNamespace() {
    return namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerOrganization partnerOrganization = (PartnerOrganization) o;
    return Objects.equals(this.logoURL, partnerOrganization.logoURL) &&
        Objects.equals(this.name, partnerOrganization.name) &&
        Objects.equals(this.namespace, partnerOrganization.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoURL, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerOrganization {\n");
    
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

