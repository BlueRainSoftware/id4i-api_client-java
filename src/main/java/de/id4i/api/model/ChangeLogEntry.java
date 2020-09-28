/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.8-SNAPSHOT
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A changelog entry
 */
@ApiModel(description = "A changelog entry")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-28T22:08:09.051Z")
public class ChangeLogEntry {
  @SerializedName("id")
  private String id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("messageProperties")
  private Map<String, Object> messageProperties = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

   /**
   * The unique id of the changelog entry
   * @return id
  **/
  @ApiModelProperty(example = "e100123", value = "The unique id of the changelog entry")
  public String getId() {
    return id;
  }

   /**
   * The message as template or rendered as plain text
   * @return message
  **/
  @ApiModelProperty(example = "User {{&user}} has changed the title of {{&object}}", value = "The message as template or rendered as plain text")
  public String getMessage() {
    return message;
  }

  public ChangeLogEntry messageProperties(Map<String, Object> messageProperties) {
    this.messageProperties = messageProperties;
    return this;
  }

  public ChangeLogEntry putMessagePropertiesItem(String key, Object messagePropertiesItem) {
    if (this.messageProperties == null) {
      this.messageProperties = new HashMap<>();
    }
    this.messageProperties.put(key, messagePropertiesItem);
    return this;
  }

   /**
   * The values of the properties in the message. May be nested as object with a value field 
   * @return messageProperties
  **/
  @ApiModelProperty(example = "{\"user\":{\"value\":\"a.vratny\",\"type\":\"user\"},\"object\":\"nearly every object\"}", value = "The values of the properties in the message. May be nested as object with a value field ")
  public Map<String, Object> getMessageProperties() {
    return messageProperties;
  }

  public void setMessageProperties(Map<String, Object> messageProperties) {
    this.messageProperties = messageProperties;
  }

   /**
   * The UTC unix timestamp when this change occurred
   * @return timestamp
  **/
  @ApiModelProperty(example = "1517232722", value = "The UTC unix timestamp when this change occurred")
  public Long getTimestamp() {
    return timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeLogEntry changeLogEntry = (ChangeLogEntry) o;
    return Objects.equals(this.id, changeLogEntry.id) &&
        Objects.equals(this.message, changeLogEntry.message) &&
        Objects.equals(this.messageProperties, changeLogEntry.messageProperties) &&
        Objects.equals(this.timestamp, changeLogEntry.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, messageProperties, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeLogEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageProperties: ").append(toIndentedString(messageProperties)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

