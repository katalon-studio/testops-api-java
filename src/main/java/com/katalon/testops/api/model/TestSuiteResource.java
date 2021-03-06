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
import com.katalon.testops.api.model.ExecutionTestSuiteResource;
import com.katalon.testops.api.model.ProjectResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TestSuiteResource
 */
@JsonPropertyOrder({
  TestSuiteResource.JSON_PROPERTY_ID,
  TestSuiteResource.JSON_PROPERTY_NAME,
  TestSuiteResource.JSON_PROPERTY_PATH,
  TestSuiteResource.JSON_PROPERTY_PROJECT,
  TestSuiteResource.JSON_PROPERTY_ALIAS,
  TestSuiteResource.JSON_PROPERTY_LAST_EXECUTION_TEST_SUITE,
  TestSuiteResource.JSON_PROPERTY_URL_ID
})
@JsonTypeName("TestSuiteResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestSuiteResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectResource project;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_LAST_EXECUTION_TEST_SUITE = "lastExecutionTestSuite";
  private ExecutionTestSuiteResource lastExecutionTestSuite;

  public static final String JSON_PROPERTY_URL_ID = "urlId";
  private String urlId;


  public TestSuiteResource id(Long id) {
    
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


  public TestSuiteResource name(String name) {
    
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


  public TestSuiteResource path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public TestSuiteResource project(ProjectResource project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProjectResource getProject() {
    return project;
  }


  public void setProject(ProjectResource project) {
    this.project = project;
  }


  public TestSuiteResource alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public TestSuiteResource lastExecutionTestSuite(ExecutionTestSuiteResource lastExecutionTestSuite) {
    
    this.lastExecutionTestSuite = lastExecutionTestSuite;
    return this;
  }

   /**
   * Get lastExecutionTestSuite
   * @return lastExecutionTestSuite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_EXECUTION_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExecutionTestSuiteResource getLastExecutionTestSuite() {
    return lastExecutionTestSuite;
  }


  public void setLastExecutionTestSuite(ExecutionTestSuiteResource lastExecutionTestSuite) {
    this.lastExecutionTestSuite = lastExecutionTestSuite;
  }


  public TestSuiteResource urlId(String urlId) {
    
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
    TestSuiteResource testSuiteResource = (TestSuiteResource) o;
    return Objects.equals(this.id, testSuiteResource.id) &&
        Objects.equals(this.name, testSuiteResource.name) &&
        Objects.equals(this.path, testSuiteResource.path) &&
        Objects.equals(this.project, testSuiteResource.project) &&
        Objects.equals(this.alias, testSuiteResource.alias) &&
        Objects.equals(this.lastExecutionTestSuite, testSuiteResource.lastExecutionTestSuite) &&
        Objects.equals(this.urlId, testSuiteResource.urlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, path, project, alias, lastExecutionTestSuite, urlId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSuiteResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    lastExecutionTestSuite: ").append(toIndentedString(lastExecutionTestSuite)).append("\n");
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

