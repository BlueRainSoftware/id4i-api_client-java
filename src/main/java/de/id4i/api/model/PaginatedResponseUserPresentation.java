/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.3-SNAPSHOT
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
import de.id4i.api.model.UserPresentation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaginatedResponseUserPresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-03T15:00:25.108Z")
public class PaginatedResponseUserPresentation {
  @SerializedName("elements")
  private List<UserPresentation> elements = new ArrayList<UserPresentation>();

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("total")
  private Integer total = null;

  public PaginatedResponseUserPresentation elements(List<UserPresentation> elements) {
    this.elements = elements;
    return this;
  }

  public PaginatedResponseUserPresentation addElementsItem(UserPresentation elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @ApiModelProperty(required = true, value = "")
  public List<UserPresentation> getElements() {
    return elements;
  }

  public void setElements(List<UserPresentation> elements) {
    this.elements = elements;
  }

  public PaginatedResponseUserPresentation limit(Integer limit) {
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

  public PaginatedResponseUserPresentation offset(Integer offset) {
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

  public PaginatedResponseUserPresentation total(Integer total) {
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
    PaginatedResponseUserPresentation paginatedResponseUserPresentation = (PaginatedResponseUserPresentation) o;
    return Objects.equals(this.elements, paginatedResponseUserPresentation.elements) &&
        Objects.equals(this.limit, paginatedResponseUserPresentation.limit) &&
        Objects.equals(this.offset, paginatedResponseUserPresentation.offset) &&
        Objects.equals(this.total, paginatedResponseUserPresentation.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, limit, offset, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResponseUserPresentation {\n");
    
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

