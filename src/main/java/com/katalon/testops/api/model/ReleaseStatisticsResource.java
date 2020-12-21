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
import com.katalon.testops.api.model.ReleaseResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ReleaseStatisticsResource
 */
@JsonPropertyOrder({
  ReleaseStatisticsResource.JSON_PROPERTY_ID,
  ReleaseStatisticsResource.JSON_PROPERTY_RELEASE,
  ReleaseStatisticsResource.JSON_PROPERTY_TOTAL_PASSED,
  ReleaseStatisticsResource.JSON_PROPERTY_TOTAL_FAILED,
  ReleaseStatisticsResource.JSON_PROPERTY_TOTAL_EXECUTION
})
@JsonTypeName("ReleaseStatisticsResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReleaseStatisticsResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_RELEASE = "release";
  private ReleaseResource release;

  public static final String JSON_PROPERTY_TOTAL_PASSED = "totalPassed";
  private Long totalPassed;

  public static final String JSON_PROPERTY_TOTAL_FAILED = "totalFailed";
  private Long totalFailed;

  public static final String JSON_PROPERTY_TOTAL_EXECUTION = "totalExecution";
  private Long totalExecution;


  public ReleaseStatisticsResource id(Long id) {
    
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


  public ReleaseStatisticsResource release(ReleaseResource release) {
    
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELEASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
