/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.2-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * A list of id4ns
 */
@ApiModel(description = "A list of id4ns")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T22:03:11.759Z")
public class ListOfId4ns {
  @SerializedName("id4ns")
  private List<String> id4ns = null;

  public ListOfId4ns id4ns(List<String> id4ns) {
    this.id4ns = id4ns;
    return this;
  }

  public ListOfId4ns addId4nsItem(String id4nsItem) {
    if (this.id4ns == null) {
      this.id4ns = new ArrayList<>();
    }
    this.id4ns.add(id4nsItem);
    return this;
  }

   /**
   * A list of id4ns.
   * @return id4ns
  **/
  @ApiModelProperty(value = "A list of id4ns.")
  public List<String> getId4ns() {
    return id4ns;
  }

  public void setId4ns(List<String> id4ns) {
    this.id4ns = id4ns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfId4ns listOfId4ns = (ListOfId4ns) o;
    return Objects.equals(this.id4ns, listOfId4ns.id4ns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id4ns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfId4ns {\n");
    
    sb.append("    id4ns: ").append(toIndentedString(id4ns)).append("\n");
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

