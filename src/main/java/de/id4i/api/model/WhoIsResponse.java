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
import de.id4i.api.model.Organization;
import de.id4i.api.model.OrganizationAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WhoIsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T10:06:46.630Z")
public class WhoIsResponse {
  @SerializedName("organization")
  private Organization organization = null;

  @SerializedName("organizationAddress")
  private OrganizationAddress organizationAddress = null;

  public WhoIsResponse organization(Organization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public WhoIsResponse organizationAddress(OrganizationAddress organizationAddress) {
    this.organizationAddress = organizationAddress;
    return this;
  }

   /**
   * Get organizationAddress
   * @return organizationAddress
  **/
  @ApiModelProperty(value = "")
  public OrganizationAddress getOrganizationAddress() {
    return organizationAddress;
  }

  public void setOrganizationAddress(OrganizationAddress organizationAddress) {
    this.organizationAddress = organizationAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhoIsResponse whoIsResponse = (WhoIsResponse) o;
    return Objects.equals(this.organization, whoIsResponse.organization) &&
        Objects.equals(this.organizationAddress, whoIsResponse.organizationAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, organizationAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhoIsResponse {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationAddress: ").append(toIndentedString(organizationAddress)).append("\n");
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

