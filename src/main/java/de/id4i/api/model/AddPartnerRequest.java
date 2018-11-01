/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.4-SNAPSHOT
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
 * AddPartnerRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T22:02:50.831Z")
public class AddPartnerRequest {
  @SerializedName("organizationId")
  private String organizationId = null;

  public AddPartnerRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The namespace of the partner organization to add
   * @return organizationId
  **/
  @ApiModelProperty(example = "org.acme", required = true, value = "The namespace of the partner organization to add")
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
    AddPartnerRequest addPartnerRequest = (AddPartnerRequest) o;
    return Objects.equals(this.organizationId, addPartnerRequest.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPartnerRequest {\n");
    
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

