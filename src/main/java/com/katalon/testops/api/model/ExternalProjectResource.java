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
 * ExternalProjectResource
 */
@JsonPropertyOrder({
  ExternalProjectResource.JSON_PROPERTY_ID,
  ExternalProjectResource.JSON_PROPERTY_EXTERNAL_PROJECT_ID,
  ExternalProjectResource.JSON_PROPERTY_EXTERNAL_PROJECT_KEY,
  ExternalProjectResource.JSON_PROPERTY_NAME
})
@JsonTypeName("ExternalProjectResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalProjectResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_EXTERNAL_PROJECT_ID = "externalProjectId";
  private String externalProjectId;

  public static final String JSON_PROPERTY_EXTERNAL_PROJECT_KEY = "externalProjectKey";
  private String externalProjectKey;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public ExternalProjectResource id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ExternalProjectResource externalProjectId(String externalProjectId) {
    
    this.externalProjectId = externalProjectId;
    return this;
  }

   /**
   * Get externalProjectId
   * @return externalProjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalProjectId() {
    return externalProjectId;
  }


  public void setExternalProjectId(String externalProjectId) {
    this.externalProjectId = externalProjectId;
  }


  public ExternalProjectResource externalProjectKey(String externalProjectKey) {
    
    this.externalProjectKey = externalProjectKey;
    return this;
  }

   /**
   * Get externalProjectKey
   * @return externalProjectKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalProjectKey() {
    return externalProjectKey;
  }


  public void setExternalProjectKey(String externalProjectKey) {
    this.externalProjectKey = externalProjectKey;
  }


  public ExternalProjectResource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalProjectResource externalProjectResource = (ExternalProjectResource) o;
    return Objects.equals(this.id, externalProjectResource.id) &&
        Objects.equals(this.externalProjectId, externalProjectResource.externalProjectId) &&
        Objects.equals(this.externalProjectKey, externalProjectResource.externalProjectKey) &&
        Objects.equals(this.name, externalProjectResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalProjectId, externalProjectKey, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProjectResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalProjectId: ").append(toIndentedString(externalProjectId)).append("\n");
    sb.append("    externalProjectKey: ").append(toIndentedString(externalProjectKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

