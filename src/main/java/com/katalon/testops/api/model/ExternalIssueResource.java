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
import com.katalon.testops.api.model.ExecutionTestResultResource;
import com.katalon.testops.api.model.TestCaseResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ExternalIssueResource
 */
@JsonPropertyOrder({
  ExternalIssueResource.JSON_PROPERTY_ID,
  ExternalIssueResource.JSON_PROPERTY_ISSUE_ID,
  ExternalIssueResource.JSON_PROPERTY_SUMMARY,
  ExternalIssueResource.JSON_PROPERTY_STATUS,
  ExternalIssueResource.JSON_PROPERTY_ISSUE_TYPE_ICON,
  ExternalIssueResource.JSON_PROPERTY_ISSUE_TYPE_NAME,
  ExternalIssueResource.JSON_PROPERTY_URL,
  ExternalIssueResource.JSON_PROPERTY_FEATURE_NAME,
  ExternalIssueResource.JSON_PROPERTY_TEST_CASES,
  ExternalIssueResource.JSON_PROPERTY_TEST_RESULTS
})
@JsonTypeName("ExternalIssueResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalIssueResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_ISSUE_ID = "issueId";
  private String issueId;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ISSUE_TYPE_ICON = "issueTypeIcon";
  private String issueTypeIcon;

  public static final String JSON_PROPERTY_ISSUE_TYPE_NAME = "issueTypeName";
  private String issueTypeName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FEATURE_NAME = "featureName";
  private String featureName;

  public static final String JSON_PROPERTY_TEST_CASES = "testCases";
  private List<TestCaseResource> testCases = null;

  public static final String JSON_PROPERTY_TEST_RESULTS = "testResults";
  private List<ExecutionTestResultResource> testResults = null;


  public ExternalIssueResource id(Long id) {
    
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


  public ExternalIssueResource issueId(String issueId) {
    
    this.issueId = issueId;
    return this;
  }

   /**
   * Get issueId
   * @return issueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueId() {
    return issueId;
  }


  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }


  public ExternalIssueResource summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public ExternalIssueResource status(String status) {
    
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

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ExternalIssueResource issueTypeIcon(String issueTypeIcon) {
    
    this.issueTypeIcon = issueTypeIcon;
    return this;
  }

   /**
   * Get issueTypeIcon
   * @return issueTypeIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueTypeIcon() {
    return issueTypeIcon;
  }


  public void setIssueTypeIcon(String issueTypeIcon) {
    this.issueTypeIcon = issueTypeIcon;
  }


  public ExternalIssueResource issueTypeName(String issueTypeName) {
    
    this.issueTypeName = issueTypeName;
    return this;
  }

   /**
   * Get issueTypeName
   * @return issueTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueTypeName() {
    return issueTypeName;
  }


  public void setIssueTypeName(String issueTypeName) {
    this.issueTypeName = issueTypeName;
  }


  public ExternalIssueResource url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ExternalIssueResource featureName(String featureName) {
    
    this.featureName = featureName;
    return this;
  }

   /**
   * Get featureName
   * @return featureName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEATURE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeatureName() {
    return featureName;
  }


  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }


  public ExternalIssueResource testCases(List<TestCaseResource> testCases) {
    
    this.testCases = testCases;
    return this;
  }

  public ExternalIssueResource addTestCasesItem(TestCaseResource testCasesItem) {
    if (this.testCases == null) {
      this.testCases = new ArrayList<>();
    }
    this.testCases.add(testCasesItem);
    return this;
  }

   /**
   * Get testCases
   * @return testCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestCaseResource> getTestCases() {
    return testCases;
  }


  public void setTestCases(List<TestCaseResource> testCases) {
    this.testCases = testCases;
  }


  public ExternalIssueResource testResults(List<ExecutionTestResultResource> testResults) {
    
    this.testResults = testResults;
    return this;
  }

  public ExternalIssueResource addTestResultsItem(ExecutionTestResultResource testResultsItem) {
    if (this.testResults == null) {
      this.testResults = new ArrayList<>();
    }
    this.testResults.add(testResultsItem);
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExecutionTestResultResource> getTestResults() {
    return testResults;
  }


  public void setTestResults(List<ExecutionTestResultResource> testResults) {
    this.testResults = testResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIssueResource externalIssueResource = (ExternalIssueResource) o;
    return Objects.equals(this.id, externalIssueResource.id) &&
        Objects.equals(this.issueId, externalIssueResource.issueId) &&
        Objects.equals(this.summary, externalIssueResource.summary) &&
        Objects.equals(this.status, externalIssueResource.status) &&
        Objects.equals(this.issueTypeIcon, externalIssueResource.issueTypeIcon) &&
        Objects.equals(this.issueTypeName, externalIssueResource.issueTypeName) &&
        Objects.equals(this.url, externalIssueResource.url) &&
        Objects.equals(this.featureName, externalIssueResource.featureName) &&
        Objects.equals(this.testCases, externalIssueResource.testCases) &&
        Objects.equals(this.testResults, externalIssueResource.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issueId, summary, status, issueTypeIcon, issueTypeName, url, featureName, testCases, testResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIssueResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    issueTypeIcon: ").append(toIndentedString(issueTypeIcon)).append("\n");
    sb.append("    issueTypeName: ").append(toIndentedString(issueTypeName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
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

