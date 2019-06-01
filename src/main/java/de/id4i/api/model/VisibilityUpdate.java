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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VisibilityUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-01T22:02:30.540Z")
public class VisibilityUpdate {
  @SerializedName("public")
  private Boolean _public = null;

  @SerializedName("sharedWithOrganizationIds")
  private List<String> sharedWithOrganizationIds = null;

  public VisibilityUpdate _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Document is publicly readable (if ID4N is owned by the same organization)
   * @return _public
  **/
  @ApiModelProperty(example = "true", value = "Document is publicly readable (if ID4N is owned by the same organization)")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public VisibilityUpdate sharedWithOrganizationIds(List<String> sharedWithOrganizationIds) {
    this.sharedWithOrganizationIds = sharedWithOrganizationIds;
    return this;
  }

  public VisibilityUpdate addSharedWithOrganizationIdsItem(String sharedWithOrganizationIdsItem) {
    if (this.sharedWithOrganizationIds == null) {
      this.sharedWithOrganizationIds = new ArrayList<>();
    }
    this.sharedWithOrganizationIds.add(sharedWithOrganizationIdsItem);
    return this;
  }

   /**
   * Document is readable by these organizations (independend of ID4N ownership)
   * @return sharedWithOrganizationIds
  **/
  @ApiModelProperty(example = "[\"de.acme\",\"com.porsche\",\"de.bluerain\"]", value = "Document is readable by these organizations (independend of ID4N ownership)")
  public List<String> getSharedWithOrganizationIds() {
    return sharedWithOrganizationIds;
  }

  public void setSharedWithOrganizationIds(List<String> sharedWithOrganizationIds) {
    this.sharedWithOrganizationIds = sharedWithOrganizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisibilityUpdate visibilityUpdate = (VisibilityUpdate) o;
    return Objects.equals(this._public, visibilityUpdate._public) &&
        Objects.equals(this.sharedWithOrganizationIds, visibilityUpdate.sharedWithOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_public, sharedWithOrganizationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisibilityUpdate {\n");
    
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    sharedWithOrganizationIds: ").append(toIndentedString(sharedWithOrganizationIds)).append("\n");
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

