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
import de.id4i.api.model.ApiError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-03T14:52:13.099+01:00")
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
    
    AUTHORIZATION_REQUIRE_USER("ERR_AUTHORIZATION_REQUIRE_USER"),
    
    INPUT_VALIDATION_FAILED("ERR_INPUT_VALIDATION_FAILED"),
    
    FIELD_INPUT_VALIDATION_FAILED("ERR_FIELD_INPUT_VALIDATION_FAILED"),
    
    VALIDATION_CONSTRAINT_FAILED("ERR_VALIDATION_CONSTRAINT_FAILED"),
    
    INPUT_NOT_READABLE("ERR_INPUT_NOT_READABLE"),
    
    INVALID_INPUT_PARAMETER("ERR_INVALID_INPUT_PARAMETER"),
    
    GUID_CREATION("ERR_GUID_CREATION"),
    
    INVALID_ID4N_OBJECT_TYPE("ERR_INVALID_ID4N_OBJECT_TYPE"),
    
    MISSING_BILLING_INFORMATION("ERR_MISSING_BILLING_INFORMATION"),
    
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
    
    USER_DEACTIVATED("ERR_USER_DEACTIVATED"),
    
    LANGUAGE_NOT_SUPPORTED("ERR_LANGUAGE_NOT_SUPPORTED"),
    
    EMAIL_MISSING_TEMPLATE_PARAM("ERR_EMAIL_MISSING_TEMPLATE_PARAM"),
    
    EMAIL_TEMPLATE_NOT_AVAILABLE("ERR_EMAIL_TEMPLATE_NOT_AVAILABLE"),
    
    EMAIL_PREPARATION_FAILED("ERR_EMAIL_PREPARATION_FAILED"),
    
    IMAGE_CONVERSION("ERR_IMAGE_CONVERSION"),
    
    UPLOAD_TOO_LARGE("ERR_UPLOAD_TOO_LARGE"),
    
    INVALID_ALIAS_TYPE("ERR_INVALID_ALIAS_TYPE"),
    
    INVALID_URI_TEMPLATE("ERR_INVALID_URI_TEMPLATE"),
    
    INVALID_URI_TEMPLATE_VARIABLE("ERR_INVALID_URI_TEMPLATE_VARIABLE"),
    
    INVALID_NAMESPACE("ERR_INVALID_NAMESPACE"),
    
    INVALID_PROPERTY_KEY("ERR_INVALID_PROPERTY_KEY"),
    
    INVALID_FILTER("ERR_INVALID_FILTER"),
    
    NAMESPACE_ALREADY_EXISTS("ERR_NAMESPACE_ALREADY_EXISTS"),
    
    INSECURE_PASSWORD("ERR_INSECURE_PASSWORD"),
    
    TRANSFER_DENIED("ERR_TRANSFER_DENIED"),
    
    INVALID_PHYSICAL_STATE("ERR_INVALID_PHYSICAL_STATE"),
    
    INVALID_HISTORY_PROPERTY_NAMESPACE("ERR_INVALID_HISTORY_PROPERTY_NAMESPACE"),
    
    INVALID_HISTORY_PROPERTY_VALUE("ERR_INVALID_HISTORY_PROPERTY_VALUE"),
    
    ORGA_CANNOT_BE_OWN_PARTNER("ERR_ORGA_CANNOT_BE_OWN_PARTNER"),
    
    INVALID_GS1_CODE("ERR_INVALID_GS1_CODE"),
    
    INVALID_GS1_CHAR_IN_CODE("ERR_INVALID_GS1_CHAR_IN_CODE"),
    
    INVALID_GS1_CODE_NOT_UNIQUE("ERR_INVALID_GS1_CODE_NOT_UNIQUE"),
    
    INVALID_GS1_GTIN("ERR_INVALID_GS1_GTIN"),
    
    GS1_CODE_CURRENTLY_UNSUPPORTED("ERR_GS1_CODE_CURRENTLY_UNSUPPORTED");

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

  @SerializedName("errorList")
  private List<ApiError> errorList = new ArrayList<>();

  @SerializedName("message")
  private String message = null;

  @SerializedName("errorId")
  private String errorId = null;

  public ApiError code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ApiError errorList(List<ApiError> errorList) {
    this.errorList = errorList;
    return this;
  }

  public ApiError addErrorListItem(ApiError errorListItem) {
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiError errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

   /**
   * Get errorId
   * @return errorId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
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
        Objects.equals(this.errorList, apiError.errorList) &&
        Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.errorId, apiError.errorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errorList, message, errorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
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

