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
import de.id4i.api.model.Visibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GUID history item update (diff patch)
 */
@ApiModel(description = "GUID history item update (diff patch)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-09T22:07:23.368Z")
public class HistoryItemUpdate {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("visibility")
  private Visibility visibility = null;

  public HistoryItemUpdate organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * New organization id displayed for this item. If given, must match the holder of GUID and the organization the history item is found under.
   * @return organizationId
  **/
  @ApiModelProperty(example = "de.acme", value = "New organization id displayed for this item. If given, must match the holder of GUID and the organization the history item is found under.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public HistoryItemUpdate visibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * History item visibility restrictions
   * @return visibility
  **/
  @ApiModelProperty(value = "History item visibility restrictions")
  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryItemUpdate historyItemUpdate = (HistoryItemUpdate) o;
    return Objects.equals(this.organizationId, historyItemUpdate.organizationId) &&
        Objects.equals(this.visibility, historyItemUpdate.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryItemUpdate {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

