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
import com.katalon.testops.api.model.ExternalReleaseResource;
import com.katalon.testops.api.model.ReleaseStatisticsResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ReleaseResource
 */
@JsonPropertyOrder({
  ReleaseResource.JSON_PROPERTY_ID,
  ReleaseResource.JSON_PROPERTY_NAME,
  ReleaseResource.JSON_PROPERTY_START_TIME,
  ReleaseResource.JSON_PROPERTY_END_TIME,
  ReleaseResource.JSON_PROPERTY_DESCRIPTION,
  ReleaseResource.JSON_PROPERTY_PROJECT_ID,
  ReleaseResource.JSON_PROPERTY_CLOSED,
  ReleaseResource.JSON_PROPERTY_EXTERNAL_RELEASE,
  ReleaseResource.JSON_PROPERTY_RELEASE_STATISTICS
})
@JsonTypeName("ReleaseResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReleaseResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private LocalDate startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private LocalDate endTime;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private Long projectId;

  public static final String JSON_PROPERTY_CLOSED = "closed";
  private Boolean closed;

  public static final String JSON_PROPERTY_EXTERNAL_RELEASE = "externalRelease";
  private ExternalReleaseResource externalRelease;

  public static final String JSON_PROPERTY_RELEASE_STATISTICS = "releaseStatistics";
  private ReleaseStatisticsResource releaseStatistics;


  public ReleaseResource id(Long id) {
    
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


  public ReleaseResource name(String name) {
    
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


  public ReleaseResource startTime(LocalDate startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getStartTime() {
    return startTime;
  }


  public void setStartTime(LocalDate startTime) {
    this.startTime = startTime;
  }


  public ReleaseResource endTime(LocalDate endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEndTime() {
    return endTime;
  }


  public void setEndTime(LocalDate endTime) {
    this.endTime = endTime;
  }


  public ReleaseResource description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReleaseResource projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ReleaseResource closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public ReleaseResource externalRelease(ExternalReleaseResource externalRelease) {
    
    this.externalRelease = externalRelease;
    return this;
  }

   /**
   * Get externalRelease
   * @return externalRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_RELEASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalReleaseResource getExternalRelease() {
    return externalRelease;
  }


  public void setExternalRelease(ExternalReleaseResource externalRelease) {
    this.externalRelease = externalRelease;
  }


  public ReleaseResource releaseStatistics(ReleaseStatisticsResource releaseStatistics) {
    
    this.releaseStatistics = releaseStatistics;
    return this;
  }

   /**
   * Get releaseStatistics
   * @return releaseStatistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELEASE_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReleaseStatisticsResource getReleaseStatistics() {
    return releaseStatistics;
  }


  public void setReleaseStatistics(ReleaseStatisticsResource releaseStatistics) {
    this.releaseStatistics = releaseStatistics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseResource releaseResource = (ReleaseResource) o;
    return Objects.equals(this.id, releaseResource.id) &&
        Objects.equals(this.name, releaseResource.name) &&
        Objects.equals(this.startTime, releaseResource.startTime) &&
        Objects.equals(this.endTime, releaseResource.endTime) &&
        Objects.equals(this.description, releaseResource.description) &&
        Objects.equals(this.projectId, releaseResource.projectId) &&
        Objects.equals(this.closed, releaseResource.closed) &&
        Objects.equals(this.externalRelease, releaseResource.externalRelease) &&
        Objects.equals(this.releaseStatistics, releaseResource.releaseStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startTime, endTime, description, projectId, closed, externalRelease, releaseStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    externalRelease: ").append(toIndentedString(externalRelease)).append("\n");
    sb.append("    releaseStatistics: ").append(toIndentedString(releaseStatistics)).append("\n");
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

