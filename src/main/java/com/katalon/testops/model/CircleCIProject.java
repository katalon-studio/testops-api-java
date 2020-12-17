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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * CircleCIProject
 */


public class CircleCIProject {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("branches")
  private Map<String, Object> branches = null;

  @JsonProperty("reponame")
  private String reponame = null;

  @JsonProperty("vcs_url")
  private String vcsUrl = null;

  @JsonProperty("vcs_type")
  private String vcsType = null;

  public CircleCIProject username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CircleCIProject branches(Map<String, Object> branches) {
    this.branches = branches;
    return this;
  }

  public CircleCIProject putBranchesItem(String key, Object branchesItem) {
    if (this.branches == null) {
      this.branches = new HashMap<String, Object>();
    }
    this.branches.put(key, branchesItem);
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
  @Schema(description = "")
  public Map<String, Object> getBranches() {
    return branches;
  }

  public void setBranches(Map<String, Object> branches) {
    this.branches = branches;
  }

  public CircleCIProject reponame(String reponame) {
    this.reponame = reponame;
    return this;
  }

   /**
   * Get reponame
   * @return reponame
  **/
  @Schema(description = "")
  public String getReponame() {
    return reponame;
  }

  public void setReponame(String reponame) {
    this.reponame = reponame;
  }

  public CircleCIProject vcsUrl(String vcsUrl) {
    this.vcsUrl = vcsUrl;
    return this;
  }

   /**
   * Get vcsUrl
   * @return vcsUrl
  **/
  @Schema(description = "")
  public String getVcsUrl() {
    return vcsUrl;
  }

  public void setVcsUrl(String vcsUrl) {
    this.vcsUrl = vcsUrl;
  }

  public CircleCIProject vcsType(String vcsType) {
    this.vcsType = vcsType;
    return this;
  }

   /**
   * Get vcsType
   * @return vcsType
  **/
  @Schema(description = "")
  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CircleCIProject circleCIProject = (CircleCIProject) o;
    return Objects.equals(this.username, circleCIProject.username) &&
        Objects.equals(this.branches, circleCIProject.branches) &&
        Objects.equals(this.reponame, circleCIProject.reponame) &&
        Objects.equals(this.vcsUrl, circleCIProject.vcsUrl) &&
        Objects.equals(this.vcsType, circleCIProject.vcsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, branches, reponame, vcsUrl, vcsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CircleCIProject {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    reponame: ").append(toIndentedString(reponame)).append("\n");
    sb.append("    vcsUrl: ").append(toIndentedString(vcsUrl)).append("\n");
    sb.append("    vcsType: ").append(toIndentedString(vcsType)).append("\n");
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
