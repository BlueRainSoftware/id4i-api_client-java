/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.7-SNAPSHOT
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WhoIsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-29T22:04:30.922Z")
public class WhoIsResponse {
  @SerializedName("aliases")
  private Map<String, String> aliases = null;

  @SerializedName("organization")
  private Organization organization = null;

  @SerializedName("organizationAddress")
  private OrganizationAddress organizationAddress = null;

  public WhoIsResponse aliases(Map<String, String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public WhoIsResponse putAliasesItem(String key, String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new HashMap<>();
    }
    this.aliases.put(key, aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAliases() {
    return aliases;
  }

  public void setAliases(Map<String, String> aliases) {
    this.aliases = aliases;
  }

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
    return Objects.equals(this.aliases, whoIsResponse.aliases) &&
        Objects.equals(this.organization, whoIsResponse.organization) &&
        Objects.equals(this.organizationAddress, whoIsResponse.organizationAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, organization, organizationAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhoIsResponse {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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

