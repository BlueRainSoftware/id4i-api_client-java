/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 1.0.0
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
 * QueuePresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-03T14:52:13.099+01:00")
public class QueuePresentation {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("waitingMessages")
  private Long waitingMessages = null;

  public QueuePresentation active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public QueuePresentation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "<default>", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QueuePresentation waitingMessages(Long waitingMessages) {
    this.waitingMessages = waitingMessages;
    return this;
  }

   /**
   * The count of queued messages
   * @return waitingMessages
  **/
  @ApiModelProperty(example = "true", value = "The count of queued messages")
  public Long getWaitingMessages() {
    return waitingMessages;
  }

  public void setWaitingMessages(Long waitingMessages) {
    this.waitingMessages = waitingMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueuePresentation queuePresentation = (QueuePresentation) o;
    return Objects.equals(this.active, queuePresentation.active) &&
        Objects.equals(this.id, queuePresentation.id) &&
        Objects.equals(this.waitingMessages, queuePresentation.waitingMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, waitingMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueuePresentation {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    waitingMessages: ").append(toIndentedString(waitingMessages)).append("\n");
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

