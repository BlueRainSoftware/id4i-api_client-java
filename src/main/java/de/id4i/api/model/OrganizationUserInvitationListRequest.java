/*
 * ID4i API
 * ID4i HTTP API
 *
 * OpenAPI spec version: 0.7.4-SNAPSHOT
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
import de.id4i.api.model.OrganizationUserInvitation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrganizationUserInvitationListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-11T22:04:45.911Z")
public class OrganizationUserInvitationListRequest {
  @SerializedName("invitations")
  private List<OrganizationUserInvitation> invitations = new ArrayList<>();

  public OrganizationUserInvitationListRequest invitations(List<OrganizationUserInvitation> invitations) {
    this.invitations = invitations;
    return this;
  }

  public OrganizationUserInvitationListRequest addInvitationsItem(OrganizationUserInvitation invitationsItem) {
    this.invitations.add(invitationsItem);
    return this;
  }

   /**
   * Get invitations
   * @return invitations
  **/
  @ApiModelProperty(required = true, value = "")
  public List<OrganizationUserInvitation> getInvitations() {
    return invitations;
  }

  public void setInvitations(List<OrganizationUserInvitation> invitations) {
    this.invitations = invitations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUserInvitationListRequest organizationUserInvitationListRequest = (OrganizationUserInvitationListRequest) o;
    return Objects.equals(this.invitations, organizationUserInvitationListRequest.invitations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserInvitationListRequest {\n");
    
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
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

