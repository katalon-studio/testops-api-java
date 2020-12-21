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
import com.katalon.testops.api.model.EnvironmentVariable;
import com.katalon.testops.api.model.GitRepositoryResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TriggerBuildParameter
 */
@JsonPropertyOrder({
  TriggerBuildParameter.JSON_PROPERTY_DOWNLOAD_URL,
  TriggerBuildParameter.JSON_PROPERTY_COMMAND,
  TriggerBuildParameter.JSON_PROPERTY_ENVIRONMENT_VARIABLES,
  TriggerBuildParameter.JSON_PROPERTY_SESSION_ID,
  TriggerBuildParameter.JSON_PROPERTY_KS_VERSION,
  TriggerBuildParameter.JSON_PROPERTY_KS_LOCATION,
  TriggerBuildParameter.JSON_PROPERTY_CONFIG_TYPE,
  TriggerBuildParameter.JSON_PROPERTY_TYPE,
  TriggerBuildParameter.JSON_PROPERTY_GIT_REPOSITORY_RESOURCE
})
@JsonTypeName("TriggerBuildParameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TriggerBuildParameter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DOWNLOAD_URL = "downloadUrl";
  private String downloadUrl;

  public static final String JSON_PROPERTY_COMMAND = "command";
  private String command;

  public static final String JSON_PROPERTY_ENVIRONMENT_VARIABLES = "environmentVariables";
  private List<EnvironmentVariable> environmentVariables = null;

  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private String sessionId;

  public static final String JSON_PROPERTY_KS_VERSION = "ksVersion";
  private String ksVersion;

  public static final String JSON_PROPERTY_KS_LOCATION = "ksLocation";
  private String ksLocation;

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
    public static ConfigTypeEnum fromValue(String value) {
      for (ConfigTypeEnum b : ConfigTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONFIG_TYPE = "configType";
  private ConfigTypeEnum configType;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    KS("KS"),
    
    GIT("GIT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_GIT_REPOSITORY_RESOURCE = "gitRepositoryResource";
  private GitRepositoryResource gitRepositoryResource;


  public TriggerBuildParameter downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public TriggerBuildParameter command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  public TriggerBuildParameter environmentVariables(List<EnvironmentVariable> environmentVariables) {
    
    this.environmentVariables = environmentVariables;
    return this;
  }

  public TriggerBuildParameter addEnvironmentVariablesItem(EnvironmentVariable environmentVariablesItem) {
    if (this.environmentVariables == null) {
      this.environmentVariables = new ArrayList<>();
    }
    this.environmentVariables.add(environmentVariablesItem);
    return this;
  }

   /**
   * Get environmentVariables
   * @return environmentVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EnvironmentVariable> getEnvironmentVariables() {
    return environmentVariables;
  }


  public void setEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
    this.environmentVariables = environmentVariables;
  }


  public TriggerBuildParameter sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public TriggerBuildParameter ksVersion(String ksVersion) {
    
    this.ksVersion = ksVersion;
    return this;
  }

   /**
   * Get ksVersion
   * @return ksVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKsVersion() {
    return ksVersion;
  }


  public void setKsVersion(String ksVersion) {
    this.ksVersion = ksVersion;
  }


  public TriggerBuildParameter ksLocation(String ksLocation) {
    
    this.ksLocation = ksLocation;
    return this;
  }

   /**
   * Get ksLocation
   * @return ksLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KS_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKsLocation() {
    return ksLocation;
  }


  public void setKsLocation(String ksLocation) {
    this.ksLocation = ksLocation;
  }


  public TriggerBuildParameter configType(ConfigTypeEnum configType) {
    
    this.configType = configType;
    return this;
  }

   /**
   * Get configType
   * @return configType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigTypeEnum getConfigType() {
    return configType;
  }


  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }


  public TriggerBuildParameter type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TriggerBuildParameter gitRepositoryResource(GitRepositoryResource gitRepositoryResource) {
    
    this.gitRepositoryResource = gitRepositoryResource;
    return this;
  }

   /**
   * Get gitRepositoryResource
   * @return gitRepositoryResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIT_REPOSITORY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GitRepositoryResource getGitRepositoryResource() {
    return gitRepositoryResource;
  }


  public void setGitRepositoryResource(GitRepositoryResource gitRepositoryResource) {
    this.gitRepositoryResource = gitRepositoryResource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerBuildParameter triggerBuildParameter = (TriggerBuildParameter) o;
    return Objects.equals(this.downloadUrl, triggerBuildParameter.downloadUrl) &&
        Objects.equals(this.command, triggerBuildParameter.command) &&
        Objects.equals(this.environmentVariables, triggerBuildParameter.environmentVariables) &&
        Objects.equals(this.sessionId, triggerBuildParameter.sessionId) &&
        Objects.equals(this.ksVersion, triggerBuildParameter.ksVersion) &&
        Objects.equals(this.ksLocation, triggerBuildParameter.ksLocation) &&
        Objects.equals(this.configType, triggerBuildParameter.configType) &&
        Objects.equals(this.type, triggerBuildParameter.type) &&
        Objects.equals(this.gitRepositoryResource, triggerBuildParameter.gitRepositoryResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, command, environmentVariables, sessionId, ksVersion, ksLocation, configType, type, gitRepositoryResource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerBuildParameter {\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    ksVersion: ").append(toIndentedString(ksVersion)).append("\n");
    sb.append("    ksLocation: ").append(toIndentedString(ksLocation)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gitRepositoryResource: ").append(toIndentedString(gitRepositoryResource)).append("\n");
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

