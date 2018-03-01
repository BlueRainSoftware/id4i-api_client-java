/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.2
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
 * Id4nPresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-01T22:01:36.606Z")
public class Id4nPresentation {
  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("id4n")
  private String id4n = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("nextScanOwnership")
  private Boolean nextScanOwnership = null;

  /**
   * The type of ID
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GUID("GUID"),
    
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
   * The UTC unix timestamp of when this ID has been created
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "1517232722", required = true, value = "The UTC unix timestamp of when this ID has been created")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

   /**
   * The ID
   * @return id4n
  **/
  @ApiModelProperty(example = "3THvgrWxqgTFC4", required = true, value = "The ID")
  public String getId4n() {
    return id4n;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

   /**
   * Indicates if next scan ownership is active or not. If privileges are missing or the type of object doesn&#39;t support NSO this value is null.
   * @return nextScanOwnership
  **/
  @ApiModelProperty(example = "false", value = "Indicates if next scan ownership is active or not. If privileges are missing or the type of object doesn't support NSO this value is null.")
  public Boolean getNextScanOwnership() {
    return nextScanOwnership;
  }

   /**
   * The type of ID
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of ID")
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
    Id4nPresentation id4nPresentation = (Id4nPresentation) o;
    return Objects.equals(this.createdTimestamp, id4nPresentation.createdTimestamp) &&
        Objects.equals(this.id4n, id4nPresentation.id4n) &&
        Objects.equals(this.label, id4nPresentation.label) &&
        Objects.equals(this.nextScanOwnership, id4nPresentation.nextScanOwnership) &&
        Objects.equals(this.type, id4nPresentation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTimestamp, id4n, label, nextScanOwnership, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Id4nPresentation {\n");
    
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    id4n: ").append(toIndentedString(id4n)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    nextScanOwnership: ").append(toIndentedString(nextScanOwnership)).append("\n");
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

