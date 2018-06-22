/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.8.1-SNAPSHOT
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
 * OrganizationAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-22T22:04:07.883Z")
public class OrganizationAddress {
  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("postCode")
  private String postCode = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("telephone")
  private String telephone = null;

  public OrganizationAddress companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "ACME Inc.", value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public OrganizationAddress firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Max", required = true, value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public OrganizationAddress lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Muster", required = true, value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public OrganizationAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(example = "Examplestreet 1", required = true, value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OrganizationAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OrganizationAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "MyCity", required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrganizationAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The ISO 3166 two-letter country code
   * @return countryCode
  **/
  @ApiModelProperty(example = "DE", required = true, value = "The ISO 3166 two-letter country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

   /**
   * The country name
   * @return countryName
  **/
  @ApiModelProperty(example = "Germany", value = "The country name")
  public String getCountryName() {
    return countryName;
  }

  public OrganizationAddress telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * The telephone number e.g.
   * @return telephone
  **/
  @ApiModelProperty(example = "+49 8088 12345", value = "The telephone number e.g.")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAddress organizationAddress = (OrganizationAddress) o;
    return Objects.equals(this.companyName, organizationAddress.companyName) &&
        Objects.equals(this.firstname, organizationAddress.firstname) &&
        Objects.equals(this.lastname, organizationAddress.lastname) &&
        Objects.equals(this.street, organizationAddress.street) &&
        Objects.equals(this.postCode, organizationAddress.postCode) &&
        Objects.equals(this.city, organizationAddress.city) &&
        Objects.equals(this.countryCode, organizationAddress.countryCode) &&
        Objects.equals(this.countryName, organizationAddress.countryName) &&
        Objects.equals(this.telephone, organizationAddress.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, firstname, lastname, street, postCode, city, countryCode, countryName, telephone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAddress {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

