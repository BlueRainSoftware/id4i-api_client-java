/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.2-SNAPSHOT
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServiceCosts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-26T09:16:56.840Z")
public class ServiceCosts {
  @SerializedName("listing")
  private Map<String, Float> listing = new HashMap<String, Float>();

  public ServiceCosts listing(Map<String, Float> listing) {
    this.listing = listing;
    return this;
  }

  public ServiceCosts putListingItem(String key, Float listingItem) {
    this.listing.put(key, listingItem);
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, Float> getListing() {
    return listing;
  }

  public void setListing(Map<String, Float> listing) {
    this.listing = listing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCosts serviceCosts = (ServiceCosts) o;
    return Objects.equals(this.listing, serviceCosts.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCosts {\n");
    
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
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

