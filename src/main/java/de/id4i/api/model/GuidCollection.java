/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.1.4-SNAPSHOT
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
 * GuidCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T10:26:16.555Z")
public class GuidCollection {
  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("id4n")
  private String id4n = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("nextScanOwnership")
  private Boolean nextScanOwnership = null;

  @SerializedName("ownerOrganizationId")
  private Long ownerOrganizationId = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ROUTING_COLLECTION("ROUTING_COLLECTION"),
    
    LOGISTIC_COLLECTION("LOGISTIC_COLLECTION"),
    
    LABELLED_COLLECTION("LABELLED_COLLECTION");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

   /**
   * Get id4n
   * @return id4n
  **/
  @ApiModelProperty(value = "")
  public String getId4n() {
    return id4n;
  }

  public GuidCollection label(String label) {
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

  public GuidCollection nextScanOwnership(Boolean nextScanOwnership) {
    this.nextScanOwnership = nextScanOwnership;
    return this;
  }

   /**
   * Get nextScanOwnership
   * @return nextScanOwnership
  **/
  @ApiModelProperty(value = "")
  public Boolean getNextScanOwnership() {
    return nextScanOwnership;
  }

  public void setNextScanOwnership(Boolean nextScanOwnership) {
    this.nextScanOwnership = nextScanOwnership;
  }

  public GuidCollection ownerOrganizationId(Long ownerOrganizationId) {
    this.ownerOrganizationId = ownerOrganizationId;
    return this;
  }

   /**
   * Get ownerOrganizationId
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(value = "")
  public Long getOwnerOrganizationId() {
    return ownerOrganizationId;
  }

  public void setOwnerOrganizationId(Long ownerOrganizationId) {
    this.ownerOrganizationId = ownerOrganizationId;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidCollection guidCollection = (GuidCollection) o;
    return Objects.equals(this.createdTimestamp, guidCollection.createdTimestamp) &&
        Objects.equals(this.id4n, guidCollection.id4n) &&
        Objects.equals(this.label, guidCollection.label) &&
        Objects.equals(this.nextScanOwnership, guidCollection.nextScanOwnership) &&
        Objects.equals(this.ownerOrganizationId, guidCollection.ownerOrganizationId) &&
        Objects.equals(this.type, guidCollection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, id4n, label, nextScanOwnership, ownerOrganizationId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidCollection {\n");
    
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    nextScanOwnership: ").append(toIndentedString(nextScanOwnership)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

