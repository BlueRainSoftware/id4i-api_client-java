/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.8.5-SNAPSHOT
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
 * Guid
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-27T22:03:40.957Z")
public class Guid {
  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("holderOrganizationId")
  private String holderOrganizationId = null;

  @SerializedName("id4n")
  private String id4n = null;

  @SerializedName("ownerOrganizationId")
  private String ownerOrganizationId = null;

  /**
   * Physical attachment state of the GUID
   */
  @JsonAdapter(PhysicalStateEnum.Adapter.class)
  public enum PhysicalStateEnum {
    UNATTACHED("UNATTACHED"),
    
    ATTACHED("ATTACHED"),
    
    DETACHED("DETACHED");

    private String value;

    PhysicalStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhysicalStateEnum fromValue(String text) {
      for (PhysicalStateEnum b : PhysicalStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PhysicalStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhysicalStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhysicalStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PhysicalStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("physicalState")
  private PhysicalStateEnum physicalState = null;

   /**
   * The UTC unix timestamp of when this GUID has been created
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "1517232722", value = "The UTC unix timestamp of when this GUID has been created")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

   /**
   * Organization namespace of the GUID holder
   * @return holderOrganizationId
  **/
  @ApiModelProperty(value = "Organization namespace of the GUID holder")
  public String getHolderOrganizationId() {
    return holderOrganizationId;
  }

   /**
   * The ID
   * @return id4n
  **/
  @ApiModelProperty(example = "3THvgrWxqgTFC4", value = "The ID")
  public String getId4n() {
    return id4n;
  }

   /**
   * Organization namespace of the GUID owner
   * @return ownerOrganizationId
  **/
  @ApiModelProperty(value = "Organization namespace of the GUID owner")
  public String getOwnerOrganizationId() {
    return ownerOrganizationId;
  }

  public Guid physicalState(PhysicalStateEnum physicalState) {
    this.physicalState = physicalState;
    return this;
  }

   /**
   * Physical attachment state of the GUID
   * @return physicalState
  **/
  @ApiModelProperty(value = "Physical attachment state of the GUID")
  public PhysicalStateEnum getPhysicalState() {
    return physicalState;
  }

  public void setPhysicalState(PhysicalStateEnum physicalState) {
    this.physicalState = physicalState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guid guid = (Guid) o;
    return Objects.equals(this.createdTimestamp, guid.createdTimestamp) &&
        Objects.equals(this.holderOrganizationId, guid.holderOrganizationId) &&
        Objects.equals(this.id4n, guid.id4n) &&
        Objects.equals(this.ownerOrganizationId, guid.ownerOrganizationId) &&
        Objects.equals(this.physicalState, guid.physicalState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, holderOrganizationId, id4n, ownerOrganizationId, physicalState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guid {\n");
    
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    holderOrganizationId: ").append(toIndentedString(holderOrganizationId)).append("\n");
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
    sb.append("    physicalState: ").append(toIndentedString(physicalState)).append("\n");
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

