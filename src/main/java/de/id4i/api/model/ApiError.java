/*
 * ID4i API
 * HTTP API Documentation for ID4i
 *
 * OpenAPI spec version: 0.2.2-SNAPSHOT
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
import de.id4i.api.model.ApiError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T10:05:50.157Z")
public class ApiError {
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    REGISTRATION_VERIFICATION_NO_TOKEN("ERR_REGISTRATION_VERIFICATION_NO_TOKEN"),
    
    REGISTRATION_VERIFICATION_INVALID_TOKEN("ERR_REGISTRATION_VERIFICATION_INVALID_TOKEN"),
    
    REGISTRATION_VERIFICATION_EXPIRED_TOKEN("ERR_REGISTRATION_VERIFICATION_EXPIRED_TOKEN"),
    
    AUTHENTICATION_NO_TOKEN("ERR_AUTHENTICATION_NO_TOKEN"),
    
    AUTHENTICATION_INVALID_TOKEN("ERR_AUTHENTICATION_INVALID_TOKEN"),
    
    AUTHENTICATION_EXPIRED_TOKEN("ERR_AUTHENTICATION_EXPIRED_TOKEN"),
    
    AUTHENTICATION_FAILED("ERR_AUTHENTICATION_FAILED"),
    
    AUTHORIZATION_MISSING_PRIVILEGES("ERR_AUTHORIZATION_MISSING_PRIVILEGES"),
    
    AUTHORIZATION_FORBIDDEN("ERR_AUTHORIZATION_FORBIDDEN"),
    
    INPUT_VALIDATION_FAILED("ERR_INPUT_VALIDATION_FAILED"),
    
    FIELD_INPUT_VALIDATION_FAILED("ERR_FIELD_INPUT_VALIDATION_FAILED"),
    
    VALIDATION_CONSTRAINT_FAILED("ERR_VALIDATION_CONSTRAINT_FAILED"),
    
    INPUT_NOT_READABLE("ERR_INPUT_NOT_READABLE"),
    
    INVALID_INPUT_PARAMETER("ERR_INVALID_INPUT_PARAMETER"),
    
    GUID_CREATION("ERR_GUID_CREATION"),
    
    INVALID_ID4N_OBJECT_TYPE("ERR_INVALID_ID4N_OBJECT_TYPE"),
    
    COLLECTION_UPDATE_DENIED("ERR_COLLECTION_UPDATE_DENIED"),
    
    ENTITY_NOT_FOUND("ERR_ENTITY_NOT_FOUND"),
    
    ENTITY_TOO_BIG("ERR_ENTITY_TOO_BIG"),
    
    DUPLICATE("ERR_DUPLICATE"),
    
    INTERNAL("ERR_INTERNAL"),
    
    UNKNOWN("ERR_UNKNOWN"),
    
    INVALID_ORGANIZATION_USERROLE("ERR_INVALID_ORGANIZATION_USERROLE"),
    
    ORGANIZATION_ROLE_INCONSISTENCY("ERR_ORGANIZATION_ROLE_INCONSISTENCY"),
    
    ORGANIZATION_NOT_DELETABLE("ERR_ORGANIZATION_NOT_DELETABLE"),
    
    USER_ALREADY_IN_ORGANIZATION("ERR_USER_ALREADY_IN_ORGANIZATION"),
    
    USER_INVITATION_NEEDS_MINIMUM_ONE_ROLE("ERR_USER_INVITATION_NEEDS_MINIMUM_ONE_ROLE"),
    
    USER_INVITATION_SPECIFY_EMAIL_OR_USERNAME("ERR_USER_INVITATION_SPECIFY_EMAIL_OR_USERNAME"),
    
    LANGUAGE_NOT_SUPPORTED("ERR_LANGUAGE_NOT_SUPPORTED"),
    
    EMAIL_MISSING_TEMPLATE_PARAM("ERR_EMAIL_MISSING_TEMPLATE_PARAM"),
    
    EMAIL_TEMPLATE_NOT_AVAILABLE("ERR_EMAIL_TEMPLATE_NOT_AVAILABLE"),
    
    EMAIL_PREPARATION_FAILED("ERR_EMAIL_PREPARATION_FAILED"),
    
    IMAGE_CONVERSION("ERR_IMAGE_CONVERSION"),
    
    UPLOAD_TOO_LARGE("ERR_UPLOAD_TOO_LARGE"),
    
    INVALID_ALIAS_TYPE("ERR_INVALID_ALIAS_TYPE"),
    
    INVALID_URI_TEMPLATE("ERR_INVALID_URI_TEMPLATE"),
    
    INVALID_URI_TEMPLATE_VARIABLE("ERR_INVALID_URI_TEMPLATE_VARIABLE"),
    
    MODULE_NOT_ACTIVE("ERR_MODULE_NOT_ACTIVE");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("errorId")
  private String errorId = null;

  @SerializedName("errorList")
  private List<ApiError> errorList = null;

  @SerializedName("message")
  private String message = null;

  public ApiError code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ApiError errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

   /**
   * Get errorId
   * @return errorId
  **/
  @ApiModelProperty(value = "")
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public ApiError errorList(List<ApiError> errorList) {
    this.errorList = errorList;
    return this;
  }

  public ApiError addErrorListItem(ApiError errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<ApiError>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(value = "")
  public List<ApiError> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<ApiError> errorList) {
    this.errorList = errorList;
  }

  public ApiError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.code, apiError.code) &&
        Objects.equals(this.errorId, apiError.errorId) &&
        Objects.equals(this.errorList, apiError.errorList) &&
        Objects.equals(this.message, apiError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errorId, errorList, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

