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
 * BillingPosition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-17T07:01:36.771Z")
public class BillingPosition {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("sum")
  private Float sum = null;

  public BillingPosition count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public BillingPosition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BillingPosition service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(required = true, value = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public BillingPosition sum(Float sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getSum() {
    return sum;
  }

  public void setSum(Float sum) {
    this.sum = sum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPosition billingPosition = (BillingPosition) o;
    return Objects.equals(this.count, billingPosition.count) &&
        Objects.equals(this.description, billingPosition.description) &&
        Objects.equals(this.service, billingPosition.service) &&
        Objects.equals(this.sum, billingPosition.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, description, service, sum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPosition {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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

