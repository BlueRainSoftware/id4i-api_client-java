/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.8.6
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
import de.id4i.api.model.Organization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaginatedOrganizationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-01T13:57:06.157Z")
public class PaginatedOrganizationResponse {
  @SerializedName("elements")
  private List<Organization> elements = new ArrayList<>();

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("total")
  private Integer total = null;

  public PaginatedOrganizationResponse elements(List<Organization> elements) {
    this.elements = elements;
    return this;
  }

  public PaginatedOrganizationResponse addElementsItem(Organization elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Organization> getElements() {
    return elements;
  }

  public void setElements(List<Organization> elements) {
    this.elements = elements;
  }

  public PaginatedOrganizationResponse limit(Integer limit) {
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

  public PaginatedOrganizationResponse offset(Integer offset) {
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

  public PaginatedOrganizationResponse total(Integer total) {
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
    PaginatedOrganizationResponse paginatedOrganizationResponse = (PaginatedOrganizationResponse) o;
    return Objects.equals(this.elements, paginatedOrganizationResponse.elements) &&
        Objects.equals(this.limit, paginatedOrganizationResponse.limit) &&
        Objects.equals(this.offset, paginatedOrganizationResponse.offset) &&
        Objects.equals(this.total, paginatedOrganizationResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, limit, offset, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedOrganizationResponse {\n");
    
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

