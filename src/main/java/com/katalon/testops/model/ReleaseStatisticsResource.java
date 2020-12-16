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
import com.katalon.testops.model.ReleaseResource;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ReleaseStatisticsResource
 */


public class ReleaseStatisticsResource {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("release")
  private ReleaseResource release = null;

  @JsonProperty("totalPassed")
  private Long totalPassed = null;

  @JsonProperty("totalFailed")
  private Long totalFailed = null;

  @JsonProperty("totalExecution")
  private Long totalExecution = null;

  public ReleaseStatisticsResource id(Long id) {
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

  public ReleaseStatisticsResource release(ReleaseResource release) {
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @Schema(description = "")
  public ReleaseResource getRelease() {
    return release;
  }

  public void setRelease(ReleaseResource release) {
    this.release = release;
  }

  public ReleaseStatisticsResource totalPassed(Long totalPassed) {
    this.totalPassed = totalPassed;
    return this;
  }

   /**
   * Get totalPassed
   * @return totalPassed
  **/
  @Schema(description = "")
  public Long getTotalPassed() {
    return totalPassed;
  }

  public void setTotalPassed(Long totalPassed) {
    this.totalPassed = totalPassed;
  }

  public ReleaseStatisticsResource totalFailed(Long totalFailed) {
    this.totalFailed = totalFailed;
    return this;
  }

   /**
   * Get totalFailed
   * @return totalFailed
  **/
  @Schema(description = "")
  public Long getTotalFailed() {
    return totalFailed;
  }

  public void setTotalFailed(Long totalFailed) {
    this.totalFailed = totalFailed;
  }

  public ReleaseStatisticsResource totalExecution(Long totalExecution) {
    this.totalExecution = totalExecution;
    return this;
  }

   /**
   * Get totalExecution
   * @return totalExecution
  **/
  @Schema(description = "")
  public Long getTotalExecution() {
    return totalExecution;
  }

  public void setTotalExecution(Long totalExecution) {
    this.totalExecution = totalExecution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseStatisticsResource releaseStatisticsResource = (ReleaseStatisticsResource) o;
    return Objects.equals(this.id, releaseStatisticsResource.id) &&
        Objects.equals(this.release, releaseStatisticsResource.release) &&
        Objects.equals(this.totalPassed, releaseStatisticsResource.totalPassed) &&
        Objects.equals(this.totalFailed, releaseStatisticsResource.totalFailed) &&
        Objects.equals(this.totalExecution, releaseStatisticsResource.totalExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, release, totalPassed, totalFailed, totalExecution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseStatisticsResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    totalPassed: ").append(toIndentedString(totalPassed)).append("\n");
    sb.append("    totalFailed: ").append(toIndentedString(totalFailed)).append("\n");
    sb.append("    totalExecution: ").append(toIndentedString(totalExecution)).append("\n");
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
