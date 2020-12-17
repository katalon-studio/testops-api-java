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
import com.katalon.testops.model.AgentResource;
import com.katalon.testops.model.CircleCIAgentResource;
import com.katalon.testops.model.JobResource;
import com.katalon.testops.model.K8SAgentResource;
import com.katalon.testops.model.ReleaseResource;
import com.katalon.testops.model.SchedulerResource;
import com.katalon.testops.model.TestProjectResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * RunConfigurationResource
 */


public class RunConfigurationResource {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("command")
  private String command = null;

  @JsonProperty("projectId")
  private Long projectId = null;

  @JsonProperty("teamId")
  private Long teamId = null;

  @JsonProperty("testProjectId")
  private Long testProjectId = null;

  @JsonProperty("testSuiteCollectionId")
  private Long testSuiteCollectionId = null;

  @JsonProperty("timeOut")
  private Long timeOut = null;

  /**
   * Gets or Sets configType
   */
  public enum ConfigTypeEnum {
    TSC("TSC"),
    COMMAND("COMMAND"),
    GENERIC_COMMAND("GENERIC_COMMAND");

    private String value;

    ConfigTypeEnum(String value) {
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
    public static ConfigTypeEnum fromValue(String text) {
      for (ConfigTypeEnum b : ConfigTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("configType")
  private ConfigTypeEnum configType = null;

  @JsonProperty("testProject")
  private TestProjectResource testProject = null;

  @JsonProperty("agents")
  private List<AgentResource> agents = null;

  @JsonProperty("k8sAgents")
  private List<K8SAgentResource> k8sAgents = null;

  @JsonProperty("circleCIAgents")
  private List<CircleCIAgentResource> circleCIAgents = null;

  /**
   * Gets or Sets cloudType
   */
  public enum CloudTypeEnum {
    K8S("K8S"),
    LOCAL_AGENT("LOCAL_AGENT"),
    K8S_AGENT("K8S_AGENT"),
    CIRCLE_CI_AGENT("CIRCLE_CI_AGENT");

    private String value;

    CloudTypeEnum(String value) {
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
    public static CloudTypeEnum fromValue(String text) {
      for (CloudTypeEnum b : CloudTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("cloudType")
  private CloudTypeEnum cloudType = null;

  @JsonProperty("latestJob")
  private JobResource latestJob = null;

  @JsonProperty("genericCommand")
  private String genericCommand = null;

  @JsonProperty("ksVersion")
  private String ksVersion = null;

  @JsonProperty("ksLocation")
  private String ksLocation = null;

  @JsonProperty("nextRunScheduler")
  private SchedulerResource nextRunScheduler = null;

  @JsonProperty("release")
  private ReleaseResource release = null;

  public RunConfigurationResource id(Long id) {
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

  public RunConfigurationResource name(String name) {
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

  public RunConfigurationResource command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @Schema(description = "")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public RunConfigurationResource projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public RunConfigurationResource teamId(Long teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @Schema(description = "")
  public Long getTeamId() {
    return teamId;
  }

  public void setTeamId(Long teamId) {
    this.teamId = teamId;
  }

  public RunConfigurationResource testProjectId(Long testProjectId) {
    this.testProjectId = testProjectId;
    return this;
  }

   /**
   * Get testProjectId
   * @return testProjectId
  **/
  @Schema(description = "")
  public Long getTestProjectId() {
    return testProjectId;
  }

  public void setTestProjectId(Long testProjectId) {
    this.testProjectId = testProjectId;
  }

  public RunConfigurationResource testSuiteCollectionId(Long testSuiteCollectionId) {
    this.testSuiteCollectionId = testSuiteCollectionId;
    return this;
  }

   /**
   * Get testSuiteCollectionId
   * @return testSuiteCollectionId
  **/
  @Schema(description = "")
  public Long getTestSuiteCollectionId() {
    return testSuiteCollectionId;
  }

  public void setTestSuiteCollectionId(Long testSuiteCollectionId) {
    this.testSuiteCollectionId = testSuiteCollectionId;
  }

  public RunConfigurationResource timeOut(Long timeOut) {
    this.timeOut = timeOut;
    return this;
  }

   /**
   * Get timeOut
   * @return timeOut
  **/
  @Schema(description = "")
  public Long getTimeOut() {
    return timeOut;
  }

  public void setTimeOut(Long timeOut) {
    this.timeOut = timeOut;
  }

  public RunConfigurationResource configType(ConfigTypeEnum configType) {
    this.configType = configType;
    return this;
  }

   /**
   * Get configType
   * @return configType
  **/
  @Schema(description = "")
  public ConfigTypeEnum getConfigType() {
    return configType;
  }

  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }

  public RunConfigurationResource testProject(TestProjectResource testProject) {
    this.testProject = testProject;
    return this;
  }

   /**
   * Get testProject
   * @return testProject
  **/
  @Schema(description = "")
  public TestProjectResource getTestProject() {
    return testProject;
  }

  public void setTestProject(TestProjectResource testProject) {
    this.testProject = testProject;
  }

  public RunConfigurationResource agents(List<AgentResource> agents) {
    this.agents = agents;
    return this;
  }

  public RunConfigurationResource addAgentsItem(AgentResource agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<AgentResource>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @Schema(description = "")
  public List<AgentResource> getAgents() {
    return agents;
  }

  public void setAgents(List<AgentResource> agents) {
    this.agents = agents;
  }

  public RunConfigurationResource k8sAgents(List<K8SAgentResource> k8sAgents) {
    this.k8sAgents = k8sAgents;
    return this;
  }

  public RunConfigurationResource addK8sAgentsItem(K8SAgentResource k8sAgentsItem) {
    if (this.k8sAgents == null) {
      this.k8sAgents = new ArrayList<K8SAgentResource>();
    }
    this.k8sAgents.add(k8sAgentsItem);
    return this;
  }

   /**
   * Get k8sAgents
   * @return k8sAgents
  **/
  @Schema(description = "")
  public List<K8SAgentResource> getK8sAgents() {
    return k8sAgents;
  }

  public void setK8sAgents(List<K8SAgentResource> k8sAgents) {
    this.k8sAgents = k8sAgents;
  }

  public RunConfigurationResource circleCIAgents(List<CircleCIAgentResource> circleCIAgents) {
    this.circleCIAgents = circleCIAgents;
    return this;
  }

  public RunConfigurationResource addCircleCIAgentsItem(CircleCIAgentResource circleCIAgentsItem) {
    if (this.circleCIAgents == null) {
      this.circleCIAgents = new ArrayList<CircleCIAgentResource>();
    }
    this.circleCIAgents.add(circleCIAgentsItem);
    return this;
  }

   /**
   * Get circleCIAgents
   * @return circleCIAgents
  **/
  @Schema(description = "")
  public List<CircleCIAgentResource> getCircleCIAgents() {
    return circleCIAgents;
  }

  public void setCircleCIAgents(List<CircleCIAgentResource> circleCIAgents) {
    this.circleCIAgents = circleCIAgents;
  }

  public RunConfigurationResource cloudType(CloudTypeEnum cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @Schema(description = "")
  public CloudTypeEnum getCloudType() {
    return cloudType;
  }

  public void setCloudType(CloudTypeEnum cloudType) {
    this.cloudType = cloudType;
  }

  public RunConfigurationResource latestJob(JobResource latestJob) {
    this.latestJob = latestJob;
    return this;
  }

   /**
   * Get latestJob
   * @return latestJob
  **/
  @Schema(description = "")
  public JobResource getLatestJob() {
    return latestJob;
  }

  public void setLatestJob(JobResource latestJob) {
    this.latestJob = latestJob;
  }

  public RunConfigurationResource genericCommand(String genericCommand) {
    this.genericCommand = genericCommand;
    return this;
  }

   /**
   * Get genericCommand
   * @return genericCommand
  **/
  @Schema(description = "")
  public String getGenericCommand() {
    return genericCommand;
  }

  public void setGenericCommand(String genericCommand) {
    this.genericCommand = genericCommand;
  }

  public RunConfigurationResource ksVersion(String ksVersion) {
    this.ksVersion = ksVersion;
    return this;
  }

   /**
   * Get ksVersion
   * @return ksVersion
  **/
  @Schema(description = "")
  public String getKsVersion() {
    return ksVersion;
  }

  public void setKsVersion(String ksVersion) {
    this.ksVersion = ksVersion;
  }

  public RunConfigurationResource ksLocation(String ksLocation) {
    this.ksLocation = ksLocation;
    return this;
  }

   /**
   * Get ksLocation
   * @return ksLocation
  **/
  @Schema(description = "")
  public String getKsLocation() {
    return ksLocation;
  }

  public void setKsLocation(String ksLocation) {
    this.ksLocation = ksLocation;
  }

  public RunConfigurationResource nextRunScheduler(SchedulerResource nextRunScheduler) {
    this.nextRunScheduler = nextRunScheduler;
    return this;
  }

   /**
   * Get nextRunScheduler
   * @return nextRunScheduler
  **/
  @Schema(description = "")
  public SchedulerResource getNextRunScheduler() {
    return nextRunScheduler;
  }

  public void setNextRunScheduler(SchedulerResource nextRunScheduler) {
    this.nextRunScheduler = nextRunScheduler;
  }

  public RunConfigurationResource release(ReleaseResource release) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunConfigurationResource runConfigurationResource = (RunConfigurationResource) o;
    return Objects.equals(this.id, runConfigurationResource.id) &&
        Objects.equals(this.name, runConfigurationResource.name) &&
        Objects.equals(this.command, runConfigurationResource.command) &&
        Objects.equals(this.projectId, runConfigurationResource.projectId) &&
        Objects.equals(this.teamId, runConfigurationResource.teamId) &&
        Objects.equals(this.testProjectId, runConfigurationResource.testProjectId) &&
        Objects.equals(this.testSuiteCollectionId, runConfigurationResource.testSuiteCollectionId) &&
        Objects.equals(this.timeOut, runConfigurationResource.timeOut) &&
        Objects.equals(this.configType, runConfigurationResource.configType) &&
        Objects.equals(this.testProject, runConfigurationResource.testProject) &&
        Objects.equals(this.agents, runConfigurationResource.agents) &&
        Objects.equals(this.k8sAgents, runConfigurationResource.k8sAgents) &&
        Objects.equals(this.circleCIAgents, runConfigurationResource.circleCIAgents) &&
        Objects.equals(this.cloudType, runConfigurationResource.cloudType) &&
        Objects.equals(this.latestJob, runConfigurationResource.latestJob) &&
        Objects.equals(this.genericCommand, runConfigurationResource.genericCommand) &&
        Objects.equals(this.ksVersion, runConfigurationResource.ksVersion) &&
        Objects.equals(this.ksLocation, runConfigurationResource.ksLocation) &&
        Objects.equals(this.nextRunScheduler, runConfigurationResource.nextRunScheduler) &&
        Objects.equals(this.release, runConfigurationResource.release);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, command, projectId, teamId, testProjectId, testSuiteCollectionId, timeOut, configType, testProject, agents, k8sAgents, circleCIAgents, cloudType, latestJob, genericCommand, ksVersion, ksLocation, nextRunScheduler, release);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunConfigurationResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    testProjectId: ").append(toIndentedString(testProjectId)).append("\n");
    sb.append("    testSuiteCollectionId: ").append(toIndentedString(testSuiteCollectionId)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    testProject: ").append(toIndentedString(testProject)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    k8sAgents: ").append(toIndentedString(k8sAgents)).append("\n");
    sb.append("    circleCIAgents: ").append(toIndentedString(circleCIAgents)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    latestJob: ").append(toIndentedString(latestJob)).append("\n");
    sb.append("    genericCommand: ").append(toIndentedString(genericCommand)).append("\n");
    sb.append("    ksVersion: ").append(toIndentedString(ksVersion)).append("\n");
    sb.append("    ksLocation: ").append(toIndentedString(ksLocation)).append("\n");
    sb.append("    nextRunScheduler: ").append(toIndentedString(nextRunScheduler)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
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
