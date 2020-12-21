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
import com.katalon.testops.api.model.AgentResource;
import com.katalon.testops.api.model.CircleCIAgentResource;
import com.katalon.testops.api.model.ExecutionResource;
import com.katalon.testops.api.model.K8SAgentResource;
import com.katalon.testops.api.model.ProjectResource;
import com.katalon.testops.api.model.RunConfigurationResource;
import com.katalon.testops.api.model.SchedulerResource;
import com.katalon.testops.api.model.TestProjectResource;
import com.katalon.testops.api.model.TriggerBuildParameter;
import com.katalon.testops.api.model.UserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * JobResource
 */
@JsonPropertyOrder({
  JobResource.JSON_PROPERTY_ID,
  JobResource.JSON_PROPERTY_BUILD_NUMBER,
  JobResource.JSON_PROPERTY_STATUS,
  JobResource.JSON_PROPERTY_QUEUED_AT,
  JobResource.JSON_PROPERTY_START_TIME,
  JobResource.JSON_PROPERTY_STOP_TIME,
  JobResource.JSON_PROPERTY_TEST_PROJECT,
  JobResource.JSON_PROPERTY_EXECUTION,
  JobResource.JSON_PROPERTY_AGENT,
  JobResource.JSON_PROPERTY_K8S_AGENT,
  JobResource.JSON_PROPERTY_CIRCLE_CI_AGENT,
  JobResource.JSON_PROPERTY_RUN_CONFIGURATION,
  JobResource.JSON_PROPERTY_ORDER,
  JobResource.JSON_PROPERTY_PARAMETER,
  JobResource.JSON_PROPERTY_TRIGGER_BY,
  JobResource.JSON_PROPERTY_DURATION,
  JobResource.JSON_PROPERTY_TRIGGER_AT,
  JobResource.JSON_PROPERTY_USER,
  JobResource.JSON_PROPERTY_SCHEDULER,
  JobResource.JSON_PROPERTY_PROJECT,
  JobResource.JSON_PROPERTY_PROCESS_ID,
  JobResource.JSON_PROPERTY_NODE_STATUS
})
@JsonTypeName("JobResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_BUILD_NUMBER = "buildNumber";
  private Long buildNumber;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    FAILED("FAILED"),
    
    SUCCESS("SUCCESS"),
    
    CANCELED("CANCELED"),
    
    ERROR("ERROR"),
    
    WAIT_FOR_TRIGGER("WAIT_FOR_TRIGGER");

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

  public static final String JSON_PROPERTY_QUEUED_AT = "queuedAt";
  private OffsetDateTime queuedAt;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_STOP_TIME = "stopTime";
  private OffsetDateTime stopTime;

  public static final String JSON_PROPERTY_TEST_PROJECT = "testProject";
  private TestProjectResource testProject;

  public static final String JSON_PROPERTY_EXECUTION = "execution";
  private ExecutionResource execution;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private AgentResource agent;

  public static final String JSON_PROPERTY_K8S_AGENT = "k8sAgent";
  private K8SAgentResource k8sAgent;

  public static final String JSON_PROPERTY_CIRCLE_CI_AGENT = "circleCiAgent";
  private CircleCIAgentResource circleCiAgent;

  public static final String JSON_PROPERTY_RUN_CONFIGURATION = "runConfiguration";
  private RunConfigurationResource runConfiguration;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Long order;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private TriggerBuildParameter parameter;

  /**
   * Gets or Sets triggerBy
   */
  public enum TriggerByEnum {
    MANUAL("MANUAL"),
    
    SCHEDULE("SCHEDULE");

    private String value;

    TriggerByEnum(String value) {
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
    public static TriggerByEnum fromValue(String value) {
      for (TriggerByEnum b : TriggerByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRIGGER_BY = "triggerBy";
  private TriggerByEnum triggerBy;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_TRIGGER_AT = "triggerAt";
  private OffsetDateTime triggerAt;

  public static final String JSON_PROPERTY_USER = "user";
  private UserResource user;

  public static final String JSON_PROPERTY_SCHEDULER = "scheduler";
  private SchedulerResource scheduler;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectResource project;

  public static final String JSON_PROPERTY_PROCESS_ID = "processId";
  private Long processId;

  /**
   * Gets or Sets nodeStatus
   */
  public enum NodeStatusEnum {
    PENDING_CANCELED("PENDING_CANCELED"),
    
    CANCELED("CANCELED");

    private String value;

    NodeStatusEnum(String value) {
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
    public static NodeStatusEnum fromValue(String value) {
      for (NodeStatusEnum b : NodeStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NODE_STATUS = "nodeStatus";
  private NodeStatusEnum nodeStatus;


  public JobResource id(Long id) {
    
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


  public JobResource buildNumber(Long buildNumber) {
    
    this.buildNumber = buildNumber;
    return this;
  }

   /**
   * Get buildNumber
   * @return buildNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUILD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBuildNumber() {
    return buildNumber;
  }


  public void setBuildNumber(Long buildNumber) {
    this.buildNumber = buildNumber;
  }


  public JobResource status(StatusEnum status) {
    
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


  public JobResource queuedAt(OffsetDateTime queuedAt) {
    
    this.queuedAt = queuedAt;
    return this;
  }

   /**
   * Get queuedAt
   * @return queuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getQueuedAt() {
    return queuedAt;
  }


  public void setQueuedAt(OffsetDateTime queuedAt) {
    this.queuedAt = queuedAt;
  }


  public JobResource startTime(OffsetDateTime startTime) {
    
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


  public JobResource stopTime(OffsetDateTime stopTime) {
    
    this.stopTime = stopTime;
    return this;
  }

   /**
   * Get stopTime
   * @return stopTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STOP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStopTime() {
    return stopTime;
  }


  public void setStopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
  }


  public JobResource testProject(TestProjectResource testProject) {
    
    this.testProject = testProject;
    return this;
  }

   /**
   * Get testProject
   * @return testProject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProjectResource getTestProject() {
    return testProject;
  }


  public void setTestProject(TestProjectResource testProject) {
    this.testProject = testProject;
  }


  public JobResource execution(ExecutionResource execution) {
    
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


  public JobResource agent(AgentResource agent) {
    
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentResource getAgent() {
    return agent;
  }


  public void setAgent(AgentResource agent) {
    this.agent = agent;
  }


  public JobResource k8sAgent(K8SAgentResource k8sAgent) {
    
    this.k8sAgent = k8sAgent;
    return this;
  }

   /**
   * Get k8sAgent
   * @return k8sAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_K8S_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public K8SAgentResource getK8sAgent() {
    return k8sAgent;
  }


  public void setK8sAgent(K8SAgentResource k8sAgent) {
    this.k8sAgent = k8sAgent;
  }


  public JobResource circleCiAgent(CircleCIAgentResource circleCiAgent) {
    
    this.circleCiAgent = circleCiAgent;
    return this;
  }

   /**
   * Get circleCiAgent
   * @return circleCiAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CIRCLE_CI_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CircleCIAgentResource getCircleCiAgent() {
    return circleCiAgent;
  }


  public void setCircleCiAgent(CircleCIAgentResource circleCiAgent) {
    this.circleCiAgent = circleCiAgent;
  }


  public JobResource runConfiguration(RunConfigurationResource runConfiguration) {
    
    this.runConfiguration = runConfiguration;
    return this;
  }

   /**
   * Get runConfiguration
   * @return runConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUN_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RunConfigurationResource getRunConfiguration() {
    return runConfiguration;
  }


  public void setRunConfiguration(RunConfigurationResource runConfiguration) {
    this.runConfiguration = runConfiguration;
  }


  public JobResource order(Long order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOrder() {
    return order;
  }


  public void setOrder(Long order) {
    this.order = order;
  }


  public JobResource parameter(TriggerBuildParameter parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TriggerBuildParameter getParameter() {
    return parameter;
  }


  public void setParameter(TriggerBuildParameter parameter) {
    this.parameter = parameter;
  }


  public JobResource triggerBy(TriggerByEnum triggerBy) {
    
    this.triggerBy = triggerBy;
    return this;
  }

   /**
   * Get triggerBy
   * @return triggerBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TriggerByEnum getTriggerBy() {
    return triggerBy;
  }


  public void setTriggerBy(TriggerByEnum triggerBy) {
    this.triggerBy = triggerBy;
  }


  public JobResource duration(Long duration) {
    
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


  public JobResource triggerAt(OffsetDateTime triggerAt) {
    
    this.triggerAt = triggerAt;
    return this;
  }

   /**
   * Get triggerAt
   * @return triggerAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTriggerAt() {
    return triggerAt;
  }


  public void setTriggerAt(OffsetDateTime triggerAt) {
    this.triggerAt = triggerAt;
  }


  public JobResource user(UserResource user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserResource getUser() {
    return user;
  }


  public void setUser(UserResource user) {
    this.user = user;
  }


  public JobResource scheduler(SchedulerResource scheduler) {
    
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SchedulerResource getScheduler() {
    return scheduler;
  }


  public void setScheduler(SchedulerResource scheduler) {
    this.scheduler = scheduler;
  }


  public JobResource project(ProjectResource project) {
    
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


  public JobResource processId(Long processId) {
    
    this.processId = processId;
    return this;
  }

   /**
   * Get processId
   * @return processId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessId() {
    return processId;
  }


  public void setProcessId(Long processId) {
    this.processId = processId;
  }


  public JobResource nodeStatus(NodeStatusEnum nodeStatus) {
    
    this.nodeStatus = nodeStatus;
    return this;
  }

   /**
   * Get nodeStatus
   * @return nodeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NODE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NodeStatusEnum getNodeStatus() {
    return nodeStatus;
  }


  public void setNodeStatus(NodeStatusEnum nodeStatus) {
    this.nodeStatus = nodeStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResource jobResource = (JobResource) o;
    return Objects.equals(this.id, jobResource.id) &&
        Objects.equals(this.buildNumber, jobResource.buildNumber) &&
        Objects.equals(this.status, jobResource.status) &&
        Objects.equals(this.queuedAt, jobResource.queuedAt) &&
        Objects.equals(this.startTime, jobResource.startTime) &&
        Objects.equals(this.stopTime, jobResource.stopTime) &&
        Objects.equals(this.testProject, jobResource.testProject) &&
        Objects.equals(this.execution, jobResource.execution) &&
        Objects.equals(this.agent, jobResource.agent) &&
        Objects.equals(this.k8sAgent, jobResource.k8sAgent) &&
        Objects.equals(this.circleCiAgent, jobResource.circleCiAgent) &&
        Objects.equals(this.runConfiguration, jobResource.runConfiguration) &&
        Objects.equals(this.order, jobResource.order) &&
        Objects.equals(this.parameter, jobResource.parameter) &&
        Objects.equals(this.triggerBy, jobResource.triggerBy) &&
        Objects.equals(this.duration, jobResource.duration) &&
        Objects.equals(this.triggerAt, jobResource.triggerAt) &&
        Objects.equals(this.user, jobResource.user) &&
        Objects.equals(this.scheduler, jobResource.scheduler) &&
        Objects.equals(this.project, jobResource.project) &&
        Objects.equals(this.processId, jobResource.processId) &&
        Objects.equals(this.nodeStatus, jobResource.nodeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buildNumber, status, queuedAt, startTime, stopTime, testProject, execution, agent, k8sAgent, circleCiAgent, runConfiguration, order, parameter, triggerBy, duration, triggerAt, user, scheduler, project, processId, nodeStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    queuedAt: ").append(toIndentedString(queuedAt)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    testProject: ").append(toIndentedString(testProject)).append("\n");
    sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    k8sAgent: ").append(toIndentedString(k8sAgent)).append("\n");
    sb.append("    circleCiAgent: ").append(toIndentedString(circleCiAgent)).append("\n");
    sb.append("    runConfiguration: ").append(toIndentedString(runConfiguration)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    triggerBy: ").append(toIndentedString(triggerBy)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    triggerAt: ").append(toIndentedString(triggerAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
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
