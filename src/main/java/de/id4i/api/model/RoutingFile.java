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
import de.id4i.api.model.Route;
import de.id4i.api.model.RoutingOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RoutingFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-31T22:11:32.473Z")
public class RoutingFile {
  @SerializedName("options")
  private RoutingOptions options = null;

  @SerializedName("routes")
  private List<Route> routes = new ArrayList<>();

  public RoutingFile options(RoutingOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public RoutingOptions getOptions() {
    return options;
  }

  public void setOptions(RoutingOptions options) {
    this.options = options;
  }

  public RoutingFile routes(List<Route> routes) {
    this.routes = routes;
    return this;
  }

  public RoutingFile addRoutesItem(Route routesItem) {
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Route> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Route> routes) {
    this.routes = routes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingFile routingFile = (RoutingFile) o;
    return Objects.equals(this.options, routingFile.options) &&
        Objects.equals(this.routes, routingFile.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, routes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingFile {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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

