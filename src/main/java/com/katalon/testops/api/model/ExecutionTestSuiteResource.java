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
import com.katalon.testops.api.model.ExecutionResource;
import com.katalon.testops.api.model.PlatformResource;
import com.katalon.testops.api.model.TestSuiteResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ExecutionTestSuiteResource
 */
@JsonPropertyOrder({
  ExecutionTestSuiteResource.JSON_PROPERTY_STATUS,
  ExecutionTestSuiteResource.JSON_PROPERTY_START_TIME,
  ExecutionTestSuiteResource.JSON_PROPERTY_END_TIME,
  ExecutionTestSuiteResource.JSON_PROPERTY_DURATION,
  ExecutionTestSuiteResource.JSON_PROPERTY_ELAPSED_DURATION,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_PASSED_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_FAILED_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_ERROR_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_INCOMPLETE_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_DIFF_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_DIFF_PASSED_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_DIFF_FAILED_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_DIFF_ERROR_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_TOTAL_DIFF_INCOMPLETE_TESTS,
  ExecutionTestSuiteResource.JSON_PROPERTY_ID,
  ExecutionTestSuiteResource.JSON_PROPERTY_EXECUTION,
  ExecutionTestSuiteResource.JSON_PROPERTY_TEST_SUITE,
  ExecutionTestSuiteResource.JSON_PROPERTY_PLATFORM,
  ExecutionTestSuiteResource.JSON_PROPERTY_EXECUTION_ID,
  ExecutionTestSuiteResource.JSON_PROPERTY_PROFILES,
  ExecutionTestSuiteResource.JSON_PROPERTY_HAS_COMMENT,
  ExecutionTestSuiteResource.JSON_PROPERTY_URL_ID
})
@JsonTypeName("ExecutionTestSuiteResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecutionTestSuiteResource implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PASSED("PASSED"),
    
    FAILED("FAILED"),
    
    ERROR("ERROR"),
    
    INCOMPLETE("INCOMPLETE"),
    
    RUNNING("RUNNING"),
    
    SKIPPED("SKIPPED"),
    
    NOT_RUN("NOT_RUN");

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

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_ELAPSED_DURATION = "elapsedDuration";
  private Long elapsedDuration;

  public static final String JSON_PROPERTY_TOTAL_TESTS = "totalTests";
  private Long totalTests;

  public static final String JSON_PROPERTY_TOTAL_PASSED_TESTS = "totalPassedTests";
  private Long totalPassedTests;

  public static final String JSON_PROPERTY_TOTAL_FAILED_TESTS = "totalFailedTests";
  private Long totalFailedTests;

  public static final String JSON_PROPERTY_TOTAL_ERROR_TESTS = "totalErrorTests";
  private Long totalErrorTests;

  public static final String JSON_PROPERTY_TOTAL_INCOMPLETE_TESTS = "totalIncompleteTests";
  private Long totalIncompleteTests;

  public static final String JSON_PROPERTY_TOTAL_DIFF_TESTS = "totalDiffTests";
  private Long totalDiffTests;

  public static final String JSON_PROPERTY_TOTAL_DIFF_PASSED_TESTS = "totalDiffPassedTests";
  private Long totalDiffPassedTests;

  public static final String JSON_PROPERTY_TOTAL_DIFF_FAILED_TESTS = "totalDiffFailedTests";
  private Long totalDiffFailedTests;

  public static final String JSON_PROPERTY_TOTAL_DIFF_ERROR_TESTS = "totalDiffErrorTests";
  private Long totalDiffErrorTests;

  public static final String JSON_PROPERTY_TOTAL_DIFF_INCOMPLETE_TESTS = "totalDiffIncompleteTests";
  private Long totalDiffIncompleteTests;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_EXECUTION = "execution";
  private ExecutionResource execution;

  public static final String JSON_PROPERTY_TEST_SUITE = "testSuite";
  private TestSuiteResource testSuite;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private PlatformResource platform;

  public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
  private Long executionId;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private List<String> profiles = null;

  public static final String JSON_PROPERTY_HAS_COMMENT = "hasComment";
  private Boolean hasComment;

  public static final String JSON_PROPERTY_URL_ID = "urlId";
  private String urlId;


  public ExecutionTestSuiteResource status(StatusEnum status) {
    
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


  public ExecutionTestSuiteResource startTime(OffsetDateTime startTime) {
    
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

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ExecutionTestSuiteResource endTime(OffsetDateTime endTime) {
    
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

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ExecutionTestSuiteResource duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ExecutionTestSuiteResource elapsedDuration(Long elapsedDuration) {
    
    this.elapsedDuration = elapsedDuration;
    return this;
  }

   /**
   * Get elapsedDuration
   * @return elapsedDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELAPSED_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getElapsedDuration() {
    return elapsedDuration;
  }


  public void setElapsedDuration(Long elapsedDuration) {
    this.elapsedDuration = elapsedDuration;
  }


  public ExecutionTestSuiteResource totalTests(Long totalTests) {
    
    this.totalTests = totalTests;
    return this;
  }

   /**
   * Get totalTests
   * @return totalTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalTests() {
    return totalTests;
  }


  public void setTotalTests(Long totalTests) {
    this.totalTests = totalTests;
  }


  public ExecutionTestSuiteResource totalPassedTests(Long totalPassedTests) {
    
    this.totalPassedTests = totalPassedTests;
    return this;
  }

   /**
   * Get totalPassedTests
   * @return totalPassedTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PASSED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalPassedTests() {
    return totalPassedTests;
  }


  public void setTotalPassedTests(Long totalPassedTests) {
    this.totalPassedTests = totalPassedTests;
  }


  public ExecutionTestSuiteResource totalFailedTests(Long totalFailedTests) {
    
    this.totalFailedTests = totalFailedTests;
    return this;
  }

   /**
   * Get totalFailedTests
   * @return totalFailedTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_FAILED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalFailedTests() {
    return totalFailedTests;
  }


  public void setTotalFailedTests(Long totalFailedTests) {
    this.totalFailedTests = totalFailedTests;
  }


  public ExecutionTestSuiteResource totalErrorTests(Long totalErrorTests) {
    
    this.totalErrorTests = totalErrorTests;
    return this;
  }

   /**
   * Get totalErrorTests
   * @return totalErrorTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ERROR_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalErrorTests() {
    return totalErrorTests;
  }


  public void setTotalErrorTests(Long totalErrorTests) {
    this.totalErrorTests = totalErrorTests;
  }


  public ExecutionTestSuiteResource totalIncompleteTests(Long totalIncompleteTests) {
    
    this.totalIncompleteTests = totalIncompleteTests;
    return this;
  }

   /**
   * Get totalIncompleteTests
   * @return totalIncompleteTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_INCOMPLETE_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalIncompleteTests() {
    return totalIncompleteTests;
  }


  public void setTotalIncompleteTests(Long totalIncompleteTests) {
    this.totalIncompleteTests = totalIncompleteTests;
  }


  public ExecutionTestSuiteResource totalDiffTests(Long totalDiffTests) {
    
    this.totalDiffTests = totalDiffTests;
    return this;
  }

   /**
   * Get totalDiffTests
   * @return totalDiffTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DIFF_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalDiffTests() {
    return totalDiffTests;
  }


  public void setTotalDiffTests(Long totalDiffTests) {
    this.totalDiffTests = totalDiffTests;
  }


  public ExecutionTestSuiteResource totalDiffPassedTests(Long totalDiffPassedTests) {
    
    this.totalDiffPassedTests = totalDiffPassedTests;
    return this;
  }

   /**
   * Get totalDiffPassedTests
   * @return totalDiffPassedTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DIFF_PASSED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalDiffPassedTests() {
    return totalDiffPassedTests;
  }


  public void setTotalDiffPassedTests(Long totalDiffPassedTests) {
    this.totalDiffPassedTests = totalDiffPassedTests;
  }


  public ExecutionTestSuiteResource totalDiffFailedTests(Long totalDiffFailedTests) {
    
    this.totalDiffFailedTests = totalDiffFailedTests;
    return this;
  }

   /**
   * Get totalDiffFailedTests
   * @return totalDiffFailedTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DIFF_FAILED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalDiffFailedTests() {
    return totalDiffFailedTests;
  }


  public void setTotalDiffFailedTests(Long totalDiffFailedTests) {
    this.totalDiffFailedTests = totalDiffFailedTests;
  }


  public ExecutionTestSuiteResource totalDiffErrorTests(Long totalDiffErrorTests) {
    
    this.totalDiffErrorTests = totalDiffErrorTests;
    return this;
  }

   /**
   * Get totalDiffErrorTests
   * @return totalDiffErrorTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DIFF_ERROR_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalDiffErrorTests() {
    return totalDiffErrorTests;
  }


  public void setTotalDiffErrorTests(Long totalDiffErrorTests) {
    this.totalDiffErrorTests = totalDiffErrorTests;
  }


  public ExecutionTestSuiteResource totalDiffIncompleteTests(Long totalDiffIncompleteTests) {
    
    this.totalDiffIncompleteTests = totalDiffIncompleteTests;
    return this;
  }

   /**
   * Get totalDiffIncompleteTests
   * @return totalDiffIncompleteTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DIFF_INCOMPLETE_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalDiffIncompleteTests() {
    return totalDiffIncompleteTests;
  }


  public void setTotalDiffIncompleteTests(Long totalDiffIncompleteTests) {
    this.totalDiffIncompleteTests = totalDiffIncompleteTests;
  }


  public ExecutionTestSuiteResource id(Long id) {
    
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


  public ExecutionTestSuiteResource execution(ExecutionResource execution) {
    
    this.execution = execution;
    return this;
  }

   /**
   * Get execution
   * @return execution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExecutionResource getExecution() {
    return execution;
  }


  public void setExecution(ExecutionResource execution) {
    this.execution = execution;
  }


  public ExecutionTestSuiteResource testSuite(TestSuiteResource testSuite) {
    
    this.testSuite = testSuite;
    return this;
  }

   /**
   * Get testSuite
   * @return testSuite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestSuiteResource getTestSuite() {
    return testSuite;
  }


  public void setTestSuite(TestSuiteResource testSuite) {
    this.testSuite = testSuite;
  }


  public ExecutionTestSuiteResource platform(PlatformResource platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatformResource getPlatform() {
    return platform;
  }


  public void setPlatform(PlatformResource platform) {
    this.platform = platform;
  }


  public ExecutionTestSuiteResource executionId(Long executionId) {
    
    this.executionId = executionId;
    return this;
  }

   /**
   * Get executionId
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExecutionId() {
    return executionId;
  }


  public void setExecutionId(Long executionId) {
    this.executionId = executionId;
  }


  public ExecutionTestSuiteResource profiles(List<String> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public ExecutionTestSuiteResource addProfilesItem(String profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProfiles() {
    return profiles;
  }


  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }


  public ExecutionTestSuiteResource hasComment(Boolean hasComment) {
    
    this.hasComment = hasComment;
    return this;
  }

   /**
   * Get hasComment
   * @return hasComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasComment() {
    return hasComment;
  }


  public void setHasComment(Boolean hasComment) {
    this.hasComment = hasComment;
  }


  public ExecutionTestSuiteResource urlId(String urlId) {
    
    this.urlId = urlId;
    return this;
  }

   /**
   * Get urlId
   * @return urlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlId() {
    return urlId;
  }


  public void setUrlId(String urlId) {
    this.urlId = urlId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionTestSuiteResource executionTestSuiteResource = (ExecutionTestSuiteResource) o;
    return Objects.equals(this.status, executionTestSuiteResource.status) &&
        Objects.equals(this.startTime, executionTestSuiteResource.startTime) &&
        Objects.equals(this.endTime, executionTestSuiteResource.endTime) &&
        Objects.equals(this.duration, executionTestSuiteResource.duration) &&
        Objects.equals(this.elapsedDuration, executionTestSuiteResource.elapsedDuration) &&
        Objects.equals(this.totalTests, executionTestSuiteResource.totalTests) &&
        Objects.equals(this.totalPassedTests, executionTestSuiteResource.totalPassedTests) &&
        Objects.equals(this.totalFailedTests, executionTestSuiteResource.totalFailedTests) &&
        Objects.equals(this.totalErrorTests, executionTestSuiteResource.totalErrorTests) &&
        Objects.equals(this.totalIncompleteTests, executionTestSuiteResource.totalIncompleteTests) &&
        Objects.equals(this.totalDiffTests, executionTestSuiteResource.totalDiffTests) &&
        Objects.equals(this.totalDiffPassedTests, executionTestSuiteResource.totalDiffPassedTests) &&
        Objects.equals(this.totalDiffFailedTests, executionTestSuiteResource.totalDiffFailedTests) &&
        Objects.equals(this.totalDiffErrorTests, executionTestSuiteResource.totalDiffErrorTests) &&
        Objects.equals(this.totalDiffIncompleteTests, executionTestSuiteResource.totalDiffIncompleteTests) &&
        Objects.equals(this.id, executionTestSuiteResource.id) &&
        Objects.equals(this.execution, executionTestSuiteResource.execution) &&
        Objects.equals(this.testSuite, executionTestSuiteResource.testSuite) &&
        Objects.equals(this.platform, executionTestSuiteResource.platform) &&
        Objects.equals(this.executionId, executionTestSuiteResource.executionId) &&
        Objects.equals(this.profiles, executionTestSuiteResource.profiles) &&
        Objects.equals(this.hasComment, executionTestSuiteResource.hasComment) &&
        Objects.equals(this.urlId, executionTestSuiteResource.urlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startTime, endTime, duration, elapsedDuration, totalTests, totalPassedTests, totalFailedTests, totalErrorTests, totalIncompleteTests, totalDiffTests, totalDiffPassedTests, totalDiffFailedTests, totalDiffErrorTests, totalDiffIncompleteTests, id, execution, testSuite, platform, executionId, profiles, hasComment, urlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionTestSuiteResource {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    elapsedDuration: ").append(toIndentedString(elapsedDuration)).append("\n");
    sb.append("    totalTests: ").append(toIndentedString(totalTests)).append("\n");
    sb.append("    totalPassedTests: ").append(toIndentedString(totalPassedTests)).append("\n");
    sb.append("    totalFailedTests: ").append(toIndentedString(totalFailedTests)).append("\n");
    sb.append("    totalErrorTests: ").append(toIndentedString(totalErrorTests)).append("\n");
    sb.append("    totalIncompleteTests: ").append(toIndentedString(totalIncompleteTests)).append("\n");
    sb.append("    totalDiffTests: ").append(toIndentedString(totalDiffTests)).append("\n");
    sb.append("    totalDiffPassedTests: ").append(toIndentedString(totalDiffPassedTests)).append("\n");
    sb.append("    totalDiffFailedTests: ").append(toIndentedString(totalDiffFailedTests)).append("\n");
    sb.append("    totalDiffErrorTests: ").append(toIndentedString(totalDiffErrorTests)).append("\n");
    sb.append("    totalDiffIncompleteTests: ").append(toIndentedString(totalDiffIncompleteTests)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    hasComment: ").append(toIndentedString(hasComment)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
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
