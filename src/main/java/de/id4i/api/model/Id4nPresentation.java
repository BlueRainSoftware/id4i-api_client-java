/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.1.3-SNAPSHOT
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
 * Id4nPresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-22T11:48:40.551Z")
public class Id4nPresentation {
  @SerializedName("id4n")
  private String id4n = null;

  @SerializedName("label")
  private String label = null;

  public Id4nPresentation id4n(String id4n) {
    this.id4n = id4n;
    return this;
  }

   /**
   * Get id4n
   * @return id4n
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId4n() {
    return id4n;
  }

  public void setId4n(String id4n) {
    this.id4n = id4n;
  }

  public Id4nPresentation label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Id4nPresentation id4nPresentation = (Id4nPresentation) o;
    return Objects.equals(this.id4n, id4nPresentation.id4n) &&
        Objects.equals(this.label, id4nPresentation.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id4n, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Id4nPresentation {\n");
    
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

