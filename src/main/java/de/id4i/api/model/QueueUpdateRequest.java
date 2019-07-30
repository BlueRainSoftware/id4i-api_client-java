/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.9.7-SNAPSHOT
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
 * QueueUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T14:00:07.557Z")
public class QueueUpdateRequest {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("purgeQueue")
  private Boolean purgeQueue = null;

  public QueueUpdateRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * If this value is set to false the queue will be deleted.
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "If this value is set to false the queue will be deleted.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public QueueUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "<default>", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QueueUpdateRequest purgeQueue(Boolean purgeQueue) {
    this.purgeQueue = purgeQueue;
    return this;
  }

   /**
   * Set this value to true if you want to purge the queue.
   * @return purgeQueue
  **/
  @ApiModelProperty(example = "false", value = "Set this value to true if you want to purge the queue.")
  public Boolean isPurgeQueue() {
    return purgeQueue;
  }

  public void setPurgeQueue(Boolean purgeQueue) {
    this.purgeQueue = purgeQueue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueUpdateRequest queueUpdateRequest = (QueueUpdateRequest) o;
    return Objects.equals(this.active, queueUpdateRequest.active) &&
        Objects.equals(this.id, queueUpdateRequest.id) &&
        Objects.equals(this.purgeQueue, queueUpdateRequest.purgeQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, purgeQueue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueUpdateRequest {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    purgeQueue: ").append(toIndentedString(purgeQueue)).append("\n");
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

