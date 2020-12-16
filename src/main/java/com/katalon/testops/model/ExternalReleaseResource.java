/*
 * Katalon TestOps API reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.katalon.testops.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.katalon.testops.model.ExternalProjectResource;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ExternalReleaseResource
 */


public class ExternalReleaseResource {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("releaseId")
  private String releaseId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("archived")
  private Boolean archived = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("externalProject")
  private ExternalProjectResource externalProject = null;

  @JsonProperty("webUrl")
  private String webUrl = null;

  public ExternalReleaseResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ExternalReleaseResource releaseId(String releaseId) {
    this.releaseId = releaseId;
    return this;
  }

   /**
   * Get releaseId
   * @return releaseId
  **/
  @Schema(description = "")
  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) {
    this.releaseId = releaseId;
  }

  public ExternalReleaseResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExternalReleaseResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalReleaseResource archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @Schema(description = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public ExternalReleaseResource released(Boolean released) {
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @Schema(description = "")
  public Boolean isReleased() {
    return released;
  }

  public void setReleased(Boolean released) {
    this.released = released;
  }

  public ExternalReleaseResource externalProject(ExternalProjectResource externalProject) {
    this.externalProject = externalProject;
    return this;
  }

   /**
   * Get externalProject
   * @return externalProject
  **/
  @Schema(description = "")
  public ExternalProjectResource getExternalProject() {
    return externalProject;
  }

  public void setExternalProject(ExternalProjectResource externalProject) {
    this.externalProject = externalProject;
  }

  public ExternalReleaseResource webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @Schema(description = "")
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalReleaseResource externalReleaseResource = (ExternalReleaseResource) o;
    return Objects.equals(this.id, externalReleaseResource.id) &&
        Objects.equals(this.releaseId, externalReleaseResource.releaseId) &&
        Objects.equals(this.description, externalReleaseResource.description) &&
        Objects.equals(this.name, externalReleaseResource.name) &&
        Objects.equals(this.archived, externalReleaseResource.archived) &&
        Objects.equals(this.released, externalReleaseResource.released) &&
        Objects.equals(this.externalProject, externalReleaseResource.externalProject) &&
        Objects.equals(this.webUrl, externalReleaseResource.webUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, releaseId, description, name, archived, released, externalProject, webUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalReleaseResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    externalProject: ").append(toIndentedString(externalProject)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
