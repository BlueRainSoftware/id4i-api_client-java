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
import de.id4i.api.model.ListOfGS1s;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GS1/MAPP codes import information
 */
@ApiModel(description = "GS1/MAPP codes import information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-15T22:03:00.172Z")
public class ImportGS1CodesRequest {
  @SerializedName("listOfGS1s")
  private ListOfGS1s listOfGS1s = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  public ImportGS1CodesRequest listOfGS1s(ListOfGS1s listOfGS1s) {
    this.listOfGS1s = listOfGS1s;
    return this;
  }

   /**
   * The list of GS1/Mapp codes to be imported
   * @return listOfGS1s
  **/
  @ApiModelProperty(required = true, value = "The list of GS1/Mapp codes to be imported")
  public ListOfGS1s getListOfGS1s() {
    return listOfGS1s;
  }

  public void setListOfGS1s(ListOfGS1s listOfGS1s) {
    this.listOfGS1s = listOfGS1s;
  }

  public ImportGS1CodesRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The organization where the GS1/Mapp code is imported.
   * @return organizationId
  **/
  @ApiModelProperty(example = "de.acme", required = true, value = "The organization where the GS1/Mapp code is imported.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGS1CodesRequest importGS1CodesRequest = (ImportGS1CodesRequest) o;
    return Objects.equals(this.listOfGS1s, importGS1CodesRequest.listOfGS1s) &&
        Objects.equals(this.organizationId, importGS1CodesRequest.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listOfGS1s, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGS1CodesRequest {\n");
    
    sb.append("    listOfGS1s: ").append(toIndentedString(listOfGS1s)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

