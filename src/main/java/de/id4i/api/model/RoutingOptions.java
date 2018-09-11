/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.1-SNAPSHOT
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
 * RoutingOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-11T13:00:39.830Z")
public class RoutingOptions {
  @SerializedName("deleteOutdatedRoutes")
  private Boolean deleteOutdatedRoutes = null;

  public RoutingOptions deleteOutdatedRoutes(Boolean deleteOutdatedRoutes) {
    this.deleteOutdatedRoutes = deleteOutdatedRoutes;
    return this;
  }

   /**
   * Get deleteOutdatedRoutes
   * @return deleteOutdatedRoutes
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleteOutdatedRoutes() {
    return deleteOutdatedRoutes;
  }

  public void setDeleteOutdatedRoutes(Boolean deleteOutdatedRoutes) {
    this.deleteOutdatedRoutes = deleteOutdatedRoutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingOptions routingOptions = (RoutingOptions) o;
    return Objects.equals(this.deleteOutdatedRoutes, routingOptions.deleteOutdatedRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOutdatedRoutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingOptions {\n");
    
    sb.append("    deleteOutdatedRoutes: ").append(toIndentedString(deleteOutdatedRoutes)).append("\n");
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

