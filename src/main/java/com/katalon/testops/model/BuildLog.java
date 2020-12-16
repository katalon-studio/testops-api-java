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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * BuildLog
 */


public class BuildLog {
  @JsonProperty("logFileUrl")
  private String logFileUrl = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("actions")
  private List<Map<String, String>> actions = null;

  public BuildLog logFileUrl(String logFileUrl) {
    this.logFileUrl = logFileUrl;
    return this;
  }

   /**
   * Get logFileUrl
   * @return logFileUrl
  **/
  @Schema(description = "")
  public String getLogFileUrl() {
    return logFileUrl;
  }

  public void setLogFileUrl(String logFileUrl) {
    this.logFileUrl = logFileUrl;
  }

  public BuildLog content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public BuildLog name(String name) {
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

  public BuildLog actions(List<Map<String, String>> actions) {
    this.actions = actions;
    return this;
  }

  public BuildLog addActionsItem(Map<String, String> actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Map<String, String>>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public List<Map<String, String>> getActions() {
    return actions;
  }

  public void setActions(List<Map<String, String>> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildLog buildLog = (BuildLog) o;
    return Objects.equals(this.logFileUrl, buildLog.logFileUrl) &&
        Objects.equals(this.content, buildLog.content) &&
        Objects.equals(this.name, buildLog.name) &&
        Objects.equals(this.actions, buildLog.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logFileUrl, content, name, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildLog {\n");
    
    sb.append("    logFileUrl: ").append(toIndentedString(logFileUrl)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
