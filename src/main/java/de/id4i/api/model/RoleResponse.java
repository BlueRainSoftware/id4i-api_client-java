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
import de.id4i.api.model.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RoleResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-28T22:12:33.167Z")
public class RoleResponse {
  @SerializedName("elements")
  private List<Role> elements = new ArrayList<>();

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("total")
  private Integer total = null;

  public RoleResponse elements(List<Role> elements) {
    this.elements = elements;
    return this;
  }

  public RoleResponse addElementsItem(Role elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Role> getElements() {
    return elements;
  }

  public void setElements(List<Role> elements) {
    this.elements = elements;
  }

  public RoleResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The number of returned elements
   * @return limit
  **/
  @ApiModelProperty(example = "100", required = true, value = "The number of returned elements")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public RoleResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Starting with the n-th element
   * @return offset
  **/
  @ApiModelProperty(example = "0", required = true, value = "Starting with the n-th element")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public RoleResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of elements
   * @return total
  **/
  @ApiModelProperty(example = "200", value = "The total number of elements")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleResponse roleResponse = (RoleResponse) o;
    return Objects.equals(this.elements, roleResponse.elements) &&
        Objects.equals(this.limit, roleResponse.limit) &&
        Objects.equals(this.offset, roleResponse.offset) &&
        Objects.equals(this.total, roleResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, limit, offset, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleResponse {\n");
    
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

