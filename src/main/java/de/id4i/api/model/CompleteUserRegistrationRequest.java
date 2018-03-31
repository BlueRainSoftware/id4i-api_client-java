/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.4.0
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
 * CompleteUserRegistrationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-31T12:19:47.051Z")
public class CompleteUserRegistrationRequest {
  @SerializedName("password")
  private String password = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("verificationToken")
  private String verificationToken = null;

  public CompleteUserRegistrationRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CompleteUserRegistrationRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CompleteUserRegistrationRequest verificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

   /**
   * Get verificationToken
   * @return verificationToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVerificationToken() {
    return verificationToken;
  }

  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteUserRegistrationRequest completeUserRegistrationRequest = (CompleteUserRegistrationRequest) o;
    return Objects.equals(this.password, completeUserRegistrationRequest.password) &&
        Objects.equals(this.username, completeUserRegistrationRequest.username) &&
        Objects.equals(this.verificationToken, completeUserRegistrationRequest.verificationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username, verificationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteUserRegistrationRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    verificationToken: ").append(toIndentedString(verificationToken)).append("\n");
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

