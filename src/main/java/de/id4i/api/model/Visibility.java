/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.5
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
 * Visibility
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-09T22:02:51.715Z")
public class Visibility {
  @SerializedName("public")
  private Boolean _public = null;

  @SerializedName("sharedOrganizationIds")
  private List<String> sharedOrganizationIds = null;

  public Visibility _public(Boolean _public) {
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

  public Visibility sharedOrganizationIds(List<String> sharedOrganizationIds) {
    this.sharedOrganizationIds = sharedOrganizationIds;
    return this;
  }

  public Visibility addSharedOrganizationIdsItem(String sharedOrganizationIdsItem) {
    if (this.sharedOrganizationIds == null) {
      this.sharedOrganizationIds = new ArrayList<>();
    }
    this.sharedOrganizationIds.add(sharedOrganizationIdsItem);
    return this;
  }

   /**
   * Document is readable by these organizations (independend of ID4N ownership)
   * @return sharedOrganizationIds
  **/
  @ApiModelProperty(example = "[\"de.acme\",\"com.porsche\",\"de.bluerain\"]", value = "Document is readable by these organizations (independend of ID4N ownership)")
  public List<String> getSharedOrganizationIds() {
    return sharedOrganizationIds;
  }

  public void setSharedOrganizationIds(List<String> sharedOrganizationIds) {
    this.sharedOrganizationIds = sharedOrganizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Visibility visibility = (Visibility) o;
    return Objects.equals(this._public, visibility._public) &&
        Objects.equals(this.sharedOrganizationIds, visibility.sharedOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_public, sharedOrganizationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Visibility {\n");
    
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    sharedOrganizationIds: ").append(toIndentedString(sharedOrganizationIds)).append("\n");
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

