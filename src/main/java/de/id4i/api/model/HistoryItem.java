/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.7.3-SNAPSHOT
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
 * GUID history item
 */
@ApiModel(description = "GUID history item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-27T22:04:29.308Z")
public class HistoryItem {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("sequenceId")
  private Integer sequenceId = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  /**
   * Type of the history item
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CREATED("CREATED"),
    
    DESTROYED("DESTROYED"),
    
    RECYCLED("RECYCLED"),
    
    SHIPMENT_PREPARED("SHIPMENT_PREPARED"),
    
    STORED("STORED"),
    
    RETRIEVED_FROM_STORAGE("RETRIEVED_FROM_STORAGE"),
    
    PACKAGED("PACKAGED"),
    
    DISPATCHED("DISPATCHED"),
    
    RECEIVED("RECEIVED"),
    
    REPROCESSING_STARTED("REPROCESSING_STARTED"),
    
    REPROCESSING_CANCELLED("REPROCESSING_CANCELLED"),
    
    REPROCESSING_FINISHED("REPROCESSING_FINISHED"),
    
    DISASSEMBLED("DISASSEMBLED"),
    
    MAINTENANCE_STARTED("MAINTENANCE_STARTED"),
    
    MAINTENANCE_CANCELLED("MAINTENANCE_CANCELLED"),
    
    MAINTENANCE_FINISHED("MAINTENANCE_FINISHED"),
    
    PRODUCTION_STEP_STARTED("PRODUCTION_STEP_STARTED"),
    
    PRODUCTION_STEP_CANCELLED("PRODUCTION_STEP_CANCELLED"),
    
    PRODUCTION_STEP_FINISHED("PRODUCTION_STEP_FINISHED");

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

  @SerializedName("visibility")
  private Visibility visibility = null;

  public HistoryItem organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Originator of the history item
   * @return organizationId
  **/
  @ApiModelProperty(example = "93", required = true, value = "Originator of the history item")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

   /**
   * Forms the primary key of the history item together with the GUID and the organizationId
   * @return sequenceId
  **/
  @ApiModelProperty(example = "9784", value = "Forms the primary key of the history item together with the GUID and the organizationId")
  public Integer getSequenceId() {
    return sequenceId;
  }

   /**
   * History item timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "1517232722", value = "History item timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  public HistoryItem type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the history item
   * @return type
  **/
  @ApiModelProperty(example = "DISPATCHED", required = true, value = "Type of the history item")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HistoryItem visibility(Visibility visibility) {
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
    HistoryItem historyItem = (HistoryItem) o;
    return Objects.equals(this.organizationId, historyItem.organizationId) &&
        Objects.equals(this.sequenceId, historyItem.sequenceId) &&
        Objects.equals(this.timestamp, historyItem.timestamp) &&
        Objects.equals(this.type, historyItem.type) &&
        Objects.equals(this.visibility, historyItem.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, sequenceId, timestamp, type, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryItem {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

