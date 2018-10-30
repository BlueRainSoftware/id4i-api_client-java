/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.3
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GUID history item
 */
@ApiModel(description = "GUID history item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-30T22:03:28.451Z")
public class HistoryItem {
  @SerializedName("additionalProperties")
  private Map<String, String> additionalProperties = null;

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
    
    REPROCESSING_STEP_STARTED("REPROCESSING_STEP_STARTED"),
    
    REPROCESSING_STEP_CANCELLED("REPROCESSING_STEP_CANCELLED"),
    
    REPROCESSING_STEP_FINISHED("REPROCESSING_STEP_FINISHED"),
    
    REPROCESSING_CANCELLED("REPROCESSING_CANCELLED"),
    
    REPROCESSING_FINISHED("REPROCESSING_FINISHED"),
    
    DISASSEMBLED("DISASSEMBLED"),
    
    MAINTENANCE_STARTED("MAINTENANCE_STARTED"),
    
    MAINTENANCE_STEP_STARTED("MAINTENANCE_STEP_STARTED"),
    
    MAINTENANCE_STEP_CANCELLED("MAINTENANCE_STEP_CANCELLED"),
    
    MAINTENANCE_STEP_FINISHED("MAINTENANCE_STEP_FINISHED"),
    
    MAINTENANCE_CANCELLED("MAINTENANCE_CANCELLED"),
    
    MAINTENANCE_FINISHED("MAINTENANCE_FINISHED"),
    
    PRODUCTION_STARTED("PRODUCTION_STARTED"),
    
    PRODUCTION_CANCELLED("PRODUCTION_CANCELLED"),
    
    PRODUCTION_FINISHED("PRODUCTION_FINISHED"),
    
    PRODUCTION_STEP_STARTED("PRODUCTION_STEP_STARTED"),
    
    PRODUCTION_STEP_CANCELLED("PRODUCTION_STEP_CANCELLED"),
    
    PRODUCTION_STEP_FINISHED("PRODUCTION_STEP_FINISHED"),
    
    QUALITY_CHECK_PERFORMED("QUALITY_CHECK_PERFORMED");

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

  public HistoryItem additionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public HistoryItem putAdditionalPropertiesItem(String key, String additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * History items custom additional properties
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "History items custom additional properties")
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public HistoryItem organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Originator of the history item
   * @return organizationId
  **/
  @ApiModelProperty(example = "org.acme", required = true, value = "Originator of the history item")
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
    return Objects.equals(this.additionalProperties, historyItem.additionalProperties) &&
        Objects.equals(this.organizationId, historyItem.organizationId) &&
        Objects.equals(this.sequenceId, historyItem.sequenceId) &&
        Objects.equals(this.timestamp, historyItem.timestamp) &&
        Objects.equals(this.type, historyItem.type) &&
        Objects.equals(this.visibility, historyItem.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, organizationId, sequenceId, timestamp, type, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryItem {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

