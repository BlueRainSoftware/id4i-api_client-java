/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.5-SNAPSHOT
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-12T14:10:50.064Z")
public class Id4n {
  @SerializedName("id4n")
  private String id4n = null;

  public Id4n id4n(String id4n) {
    this.id4n = id4n;
    return this;
  }

   /**
   * The ID
   * @return id4n
  **/
  @ApiModelProperty(example = "3THvgrWxqgTFC4", value = "The ID")
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

