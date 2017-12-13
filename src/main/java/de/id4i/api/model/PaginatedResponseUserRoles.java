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
import de.id4i.api.model.UserRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaginatedResponseUserRoles
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-13T15:31:54.241Z")
public class PaginatedResponseUserRoles {
  @SerializedName("elements")
  private List<UserRoles> elements = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("total")
  private Integer total = null;

  public PaginatedResponseUserRoles elements(List<UserRoles> elements) {
    this.elements = elements;
    return this;
  }

  public PaginatedResponseUserRoles addElementsItem(UserRoles elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<UserRoles>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @ApiModelProperty(value = "")
  public List<UserRoles> getElements() {
    return elements;
  }

  public void setElements(List<UserRoles> elements) {
    this.elements = elements;
  }

  public PaginatedResponseUserRoles limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public PaginatedResponseUserRoles offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public PaginatedResponseUserRoles total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
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
    PaginatedResponseUserRoles paginatedResponseUserRoles = (PaginatedResponseUserRoles) o;
    return Objects.equals(this.elements, paginatedResponseUserRoles.elements) &&
        Objects.equals(this.limit, paginatedResponseUserRoles.limit) &&
        Objects.equals(this.offset, paginatedResponseUserRoles.offset) &&
        Objects.equals(this.total, paginatedResponseUserRoles.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, limit, offset, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResponseUserRoles {\n");
    
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

