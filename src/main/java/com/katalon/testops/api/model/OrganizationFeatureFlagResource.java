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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OrganizationFeatureFlagResource
 */
@JsonPropertyOrder({
  OrganizationFeatureFlagResource.JSON_PROPERTY_ORGANIZATION_ID,
  OrganizationFeatureFlagResource.JSON_PROPERTY_SUB_DOMAIN,
  OrganizationFeatureFlagResource.JSON_PROPERTY_STRICT_DOMAIN,
  OrganizationFeatureFlagResource.JSON_PROPERTY_SSO,
  OrganizationFeatureFlagResource.JSON_PROPERTY_CIRCLE_CI
})
@JsonTypeName("OrganizationFeatureFlagResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrganizationFeatureFlagResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  private Long organizationId;

  public static final String JSON_PROPERTY_SUB_DOMAIN = "subDomain";
  private Boolean subDomain;

  public static final String JSON_PROPERTY_STRICT_DOMAIN = "strictDomain";
  private Boolean strictDomain;

  public static final String JSON_PROPERTY_SSO = "sso";
  private Boolean sso;

  public static final String JSON_PROPERTY_CIRCLE_CI = "circleCi";
  private Boolean circleCi;


  public OrganizationFeatureFlagResource organizationId(Long organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public OrganizationFeatureFlagResource subDomain(Boolean subDomain) {
    
    this.subDomain = subDomain;
    return this;
  }

   /**
   * Get subDomain
   * @return subDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubDomain() {
    return subDomain;
  }


  public void setSubDomain(Boolean subDomain) {
    this.subDomain = subDomain;
  }


  public OrganizationFeatureFlagResource strictDomain(Boolean strictDomain) {
    
    this.strictDomain = strictDomain;
    return this;
  }

   /**
   * Get strictDomain
   * @return strictDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRICT_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStrictDomain() {
    return strictDomain;
  }


  public void setStrictDomain(Boolean strictDomain) {
    this.strictDomain = strictDomain;
  }


  public OrganizationFeatureFlagResource sso(Boolean sso) {
    
    this.sso = sso;
    return this;
  }

   /**
   * Get sso
   * @return sso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SSO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSso() {
    return sso;
  }


  public void setSso(Boolean sso) {
    this.sso = sso;
  }


  public OrganizationFeatureFlagResource circleCi(Boolean circleCi) {
    
    this.circleCi = circleCi;
    return this;
  }

   /**
   * Get circleCi
   * @return circleCi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CIRCLE_CI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCircleCi() {
    return circleCi;
  }


  public void setCircleCi(Boolean circleCi) {
    this.circleCi = circleCi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFeatureFlagResource organizationFeatureFlagResource = (OrganizationFeatureFlagResource) o;
    return Objects.equals(this.organizationId, organizationFeatureFlagResource.organizationId) &&
        Objects.equals(this.subDomain, organizationFeatureFlagResource.subDomain) &&
        Objects.equals(this.strictDomain, organizationFeatureFlagResource.strictDomain) &&
        Objects.equals(this.sso, organizationFeatureFlagResource.sso) &&
        Objects.equals(this.circleCi, organizationFeatureFlagResource.circleCi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, subDomain, strictDomain, sso, circleCi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationFeatureFlagResource {\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    subDomain: ").append(toIndentedString(subDomain)).append("\n");
    sb.append("    strictDomain: ").append(toIndentedString(strictDomain)).append("\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    circleCi: ").append(toIndentedString(circleCi)).append("\n");
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

