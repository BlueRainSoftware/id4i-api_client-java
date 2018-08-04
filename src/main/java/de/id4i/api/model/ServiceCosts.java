/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.8.6
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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServiceCosts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T22:04:06.734Z")
public class ServiceCosts {
  @SerializedName("listing")
  private Map<String, BigDecimal> listing = new HashMap<>();

  public ServiceCosts listing(Map<String, BigDecimal> listing) {
    this.listing = listing;
    return this;
  }

  public ServiceCosts putListingItem(String key, BigDecimal listingItem) {
    this.listing.put(key, listingItem);
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, BigDecimal> getListing() {
    return listing;
  }

  public void setListing(Map<String, BigDecimal> listing) {
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

