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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Id4n
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-20T09:28:45.131Z")
public class Id4n {
  @SerializedName("id4n")
  private String id4n = null;

  public Id4n id4n(String id4n) {
    this.id4n = id4n;
    return this;
  }

   /**
   * Get id4n
   * @return id4n
  **/
  @ApiModelProperty(value = "")
  public String getId4n() {
    return id4n;
  }

  public void setId4n(String id4n) {
    this.id4n = id4n;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Id4n id4n = (Id4n) o;
    return Objects.equals(this.id4n, id4n.id4n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id4n);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Id4n {\n");
    
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
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

