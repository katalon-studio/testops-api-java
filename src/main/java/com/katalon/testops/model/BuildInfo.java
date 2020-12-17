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
import com.katalon.testops.model.BuildLog;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * BuildInfo
 */


public class BuildInfo {
  @JsonProperty("build_num")
  private Long buildNum = null;

  @JsonProperty("job_id")
  private Long jobId = null;

  @JsonProperty("build_time_millis")
  private Long buildTimeMillis = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("usage_queued_at")
  private OffsetDateTime usageQueuedAt = null;

  @JsonProperty("start_time")
  private OffsetDateTime startTime = null;

  @JsonProperty("stop_time")
  private OffsetDateTime stopTime = null;

  @JsonProperty("steps")
  private List<BuildLog> steps = null;

  public BuildInfo buildNum(Long buildNum) {
    this.buildNum = buildNum;
    return this;
  }

   /**
   * Get buildNum
   * @return buildNum
  **/
  @Schema(description = "")
  public Long getBuildNum() {
    return buildNum;
  }

  public void setBuildNum(Long buildNum) {
    this.buildNum = buildNum;
  }

  public BuildInfo jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @Schema(description = "")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public BuildInfo buildTimeMillis(Long buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
    return this;
  }

   /**
   * Get buildTimeMillis
   * @return buildTimeMillis
  **/
  @Schema(description = "")
  public Long getBuildTimeMillis() {
    return buildTimeMillis;
  }

  public void setBuildTimeMillis(Long buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
  }

  public BuildInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BuildInfo usageQueuedAt(OffsetDateTime usageQueuedAt) {
    this.usageQueuedAt = usageQueuedAt;
    return this;
  }

   /**
   * Get usageQueuedAt
   * @return usageQueuedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUsageQueuedAt() {
    return usageQueuedAt;
  }

  public void setUsageQueuedAt(OffsetDateTime usageQueuedAt) {
    this.usageQueuedAt = usageQueuedAt;
  }

  public BuildInfo startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public BuildInfo stopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
    return this;
  }

   /**
   * Get stopTime
   * @return stopTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStopTime() {
    return stopTime;
  }

  public void setStopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
  }

  public BuildInfo steps(List<BuildLog> steps) {
    this.steps = steps;
    return this;
  }

  public BuildInfo addStepsItem(BuildLog stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<BuildLog>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @Schema(description = "")
  public List<BuildLog> getSteps() {
    return steps;
  }

  public void setSteps(List<BuildLog> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildInfo buildInfo = (BuildInfo) o;
    return Objects.equals(this.buildNum, buildInfo.buildNum) &&
        Objects.equals(this.jobId, buildInfo.jobId) &&
        Objects.equals(this.buildTimeMillis, buildInfo.buildTimeMillis) &&
        Objects.equals(this.status, buildInfo.status) &&
        Objects.equals(this.usageQueuedAt, buildInfo.usageQueuedAt) &&
        Objects.equals(this.startTime, buildInfo.startTime) &&
        Objects.equals(this.stopTime, buildInfo.stopTime) &&
        Objects.equals(this.steps, buildInfo.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildNum, jobId, buildTimeMillis, status, usageQueuedAt, startTime, stopTime, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildInfo {\n");
    
    sb.append("    buildNum: ").append(toIndentedString(buildNum)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    buildTimeMillis: ").append(toIndentedString(buildTimeMillis)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usageQueuedAt: ").append(toIndentedString(usageQueuedAt)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
