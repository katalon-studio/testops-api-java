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
import com.katalon.testops.model.ExecutionTestResultResource;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * TestResultAssertionResource
 */


public class TestResultAssertionResource {
  @JsonProperty("executionTestResultId")
  private Long executionTestResultId = null;

  @JsonProperty("executionTestResult")
  private ExecutionTestResultResource executionTestResult = null;

  @JsonProperty("totalAssertion")
  private Long totalAssertion = null;

  @JsonProperty("passedAssertion")
  private Long passedAssertion = null;

  @JsonProperty("failedAssertion")
  private Long failedAssertion = null;

  public TestResultAssertionResource executionTestResultId(Long executionTestResultId) {
    this.executionTestResultId = executionTestResultId;
    return this;
  }

   /**
   * Get executionTestResultId
   * @return executionTestResultId
  **/
  @Schema(description = "")
  public Long getExecutionTestResultId() {
    return executionTestResultId;
  }

  public void setExecutionTestResultId(Long executionTestResultId) {
    this.executionTestResultId = executionTestResultId;
  }

  public TestResultAssertionResource executionTestResult(ExecutionTestResultResource executionTestResult) {
    this.executionTestResult = executionTestResult;
    return this;
  }

   /**
   * Get executionTestResult
   * @return executionTestResult
  **/
  @Schema(description = "")
  public ExecutionTestResultResource getExecutionTestResult() {
    return executionTestResult;
  }

  public void setExecutionTestResult(ExecutionTestResultResource executionTestResult) {
    this.executionTestResult = executionTestResult;
  }

  public TestResultAssertionResource totalAssertion(Long totalAssertion) {
    this.totalAssertion = totalAssertion;
    return this;
  }

   /**
   * Get totalAssertion
   * @return totalAssertion
  **/
  @Schema(description = "")
  public Long getTotalAssertion() {
    return totalAssertion;
  }

  public void setTotalAssertion(Long totalAssertion) {
    this.totalAssertion = totalAssertion;
  }

  public TestResultAssertionResource passedAssertion(Long passedAssertion) {
    this.passedAssertion = passedAssertion;
    return this;
  }

   /**
   * Get passedAssertion
   * @return passedAssertion
  **/
  @Schema(description = "")
  public Long getPassedAssertion() {
    return passedAssertion;
  }

  public void setPassedAssertion(Long passedAssertion) {
    this.passedAssertion = passedAssertion;
  }

  public TestResultAssertionResource failedAssertion(Long failedAssertion) {
    this.failedAssertion = failedAssertion;
    return this;
  }

   /**
   * Get failedAssertion
   * @return failedAssertion
  **/
  @Schema(description = "")
  public Long getFailedAssertion() {
    return failedAssertion;
  }

  public void setFailedAssertion(Long failedAssertion) {
    this.failedAssertion = failedAssertion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultAssertionResource testResultAssertionResource = (TestResultAssertionResource) o;
    return Objects.equals(this.executionTestResultId, testResultAssertionResource.executionTestResultId) &&
        Objects.equals(this.executionTestResult, testResultAssertionResource.executionTestResult) &&
        Objects.equals(this.totalAssertion, testResultAssertionResource.totalAssertion) &&
        Objects.equals(this.passedAssertion, testResultAssertionResource.passedAssertion) &&
        Objects.equals(this.failedAssertion, testResultAssertionResource.failedAssertion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionTestResultId, executionTestResult, totalAssertion, passedAssertion, failedAssertion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultAssertionResource {\n");
    
    sb.append("    executionTestResultId: ").append(toIndentedString(executionTestResultId)).append("\n");
    sb.append("    executionTestResult: ").append(toIndentedString(executionTestResult)).append("\n");
    sb.append("    totalAssertion: ").append(toIndentedString(totalAssertion)).append("\n");
    sb.append("    passedAssertion: ").append(toIndentedString(passedAssertion)).append("\n");
    sb.append("    failedAssertion: ").append(toIndentedString(failedAssertion)).append("\n");
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
