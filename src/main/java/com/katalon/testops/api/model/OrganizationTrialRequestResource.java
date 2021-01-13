/*
 * Katalon TestOps API reference
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.katalon.testops.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.katalon.testops.api.model.OrganizationResource;
import com.katalon.testops.api.model.UserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OrganizationTrialRequestResource
 */
@JsonPropertyOrder({
  OrganizationTrialRequestResource.JSON_PROPERTY_ORGANIZATION,
  OrganizationTrialRequestResource.JSON_PROPERTY_USER_REQUEST,
  OrganizationTrialRequestResource.JSON_PROPERTY_STATUS,
  OrganizationTrialRequestResource.JSON_PROPERTY_UPDATED_AT,
  OrganizationTrialRequestResource.JSON_PROPERTY_FORM_REQUEST
})
@JsonTypeName("OrganizationTrialRequestResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrganizationTrialRequestResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private OrganizationResource organization;

  public static final String JSON_PROPERTY_USER_REQUEST = "userRequest";
  private UserResource userRequest;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_FORM_REQUEST = "formRequest";
  private String formRequest;


  public OrganizationTrialRequestResource organization(OrganizationResource organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizationResource getOrganization() {
    return organization;
  }


  public void setOrganization(OrganizationResource organization) {
    this.organization = organization;
  }


  public OrganizationTrialRequestResource userRequest(UserResource userRequest) {
    
    this.userRequest = userRequest;
    return this;
  }

   /**
   * Get userRequest
   * @return userRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserResource getUserRequest() {
    return userRequest;
  }


  public void setUserRequest(UserResource userRequest) {
    this.userRequest = userRequest;
  }


  public OrganizationTrialRequestResource status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OrganizationTrialRequestResource updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public OrganizationTrialRequestResource formRequest(String formRequest) {
    
    this.formRequest = formRequest;
    return this;
  }

   /**
   * Get formRequest
   * @return formRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORM_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormRequest() {
    return formRequest;
  }


  public void setFormRequest(String formRequest) {
    this.formRequest = formRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationTrialRequestResource organizationTrialRequestResource = (OrganizationTrialRequestResource) o;
    return Objects.equals(this.organization, organizationTrialRequestResource.organization) &&
        Objects.equals(this.userRequest, organizationTrialRequestResource.userRequest) &&
        Objects.equals(this.status, organizationTrialRequestResource.status) &&
        Objects.equals(this.updatedAt, organizationTrialRequestResource.updatedAt) &&
        Objects.equals(this.formRequest, organizationTrialRequestResource.formRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, userRequest, status, updatedAt, formRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationTrialRequestResource {\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    userRequest: ").append(toIndentedString(userRequest)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    formRequest: ").append(toIndentedString(formRequest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
