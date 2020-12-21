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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConfigResource
 */
@JsonPropertyOrder({
  ConfigResource.JSON_PROPERTY_WEB_SOCKET_URL,
  ConfigResource.JSON_PROPERTY_STORE_URL,
  ConfigResource.JSON_PROPERTY_PROFILES,
  ConfigResource.JSON_PROPERTY_STRIPE_PUBLIC_API,
  ConfigResource.JSON_PROPERTY_BUILD_VERSION,
  ConfigResource.JSON_PROPERTY_COMMIT_ID,
  ConfigResource.JSON_PROPERTY_SENTRY_DSN,
  ConfigResource.JSON_PROPERTY_SENTRY_ENV,
  ConfigResource.JSON_PROPERTY_SERVER_URL,
  ConfigResource.JSON_PROPERTY_MAX_EXECUTION_COMPARISON,
  ConfigResource.JSON_PROPERTY_MAX_EXECUTION_DOWNLOAD,
  ConfigResource.JSON_PROPERTY_AGENT_DOWNLOAD_URLS,
  ConfigResource.JSON_PROPERTY_SUB_DOMAIN_PATTERN,
  ConfigResource.JSON_PROPERTY_CANCELLATION_SURVEY_URL,
  ConfigResource.JSON_PROPERTY_ADVANCED_FEATURE_ENABLED,
  ConfigResource.JSON_PROPERTY_USING_SUB_DOMAIN
})
@JsonTypeName("ConfigResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WEB_SOCKET_URL = "webSocketUrl";
  private String webSocketUrl;

  public static final String JSON_PROPERTY_STORE_URL = "storeUrl";
  private String storeUrl;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private List<String> profiles = null;

  public static final String JSON_PROPERTY_STRIPE_PUBLIC_API = "stripePublicApi";
  private String stripePublicApi;

  public static final String JSON_PROPERTY_BUILD_VERSION = "buildVersion";
  private String buildVersion;

  public static final String JSON_PROPERTY_COMMIT_ID = "commitId";
  private String commitId;

  public static final String JSON_PROPERTY_SENTRY_DSN = "sentryDsn";
  private String sentryDsn;

  public static final String JSON_PROPERTY_SENTRY_ENV = "sentryEnv";
  private String sentryEnv;

  public static final String JSON_PROPERTY_SERVER_URL = "serverUrl";
  private String serverUrl;

  public static final String JSON_PROPERTY_MAX_EXECUTION_COMPARISON = "maxExecutionComparison";
  private Long maxExecutionComparison;

  public static final String JSON_PROPERTY_MAX_EXECUTION_DOWNLOAD = "maxExecutionDownload";
  private Long maxExecutionDownload;

  public static final String JSON_PROPERTY_AGENT_DOWNLOAD_URLS = "agentDownloadUrls";
  private Map<String, String> agentDownloadUrls = null;

  public static final String JSON_PROPERTY_SUB_DOMAIN_PATTERN = "subDomainPattern";
  private String subDomainPattern;

  public static final String JSON_PROPERTY_CANCELLATION_SURVEY_URL = "cancellationSurveyUrl";
  private String cancellationSurveyUrl;

  public static final String JSON_PROPERTY_ADVANCED_FEATURE_ENABLED = "advancedFeatureEnabled";
  private Boolean advancedFeatureEnabled;

  public static final String JSON_PROPERTY_USING_SUB_DOMAIN = "usingSubDomain";
  private Boolean usingSubDomain;


  public ConfigResource webSocketUrl(String webSocketUrl) {
    
    this.webSocketUrl = webSocketUrl;
    return this;
  }

   /**
   * Get webSocketUrl
   * @return webSocketUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_SOCKET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebSocketUrl() {
    return webSocketUrl;
  }


  public void setWebSocketUrl(String webSocketUrl) {
    this.webSocketUrl = webSocketUrl;
  }


  public ConfigResource storeUrl(String storeUrl) {
    
    this.storeUrl = storeUrl;
    return this;
  }

   /**
   * Get storeUrl
   * @return storeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreUrl() {
    return storeUrl;
  }


  public void setStoreUrl(String storeUrl) {
    this.storeUrl = storeUrl;
  }


  public ConfigResource profiles(List<String> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public ConfigResource addProfilesItem(String profilesItem) {
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


  public ConfigResource stripePublicApi(String stripePublicApi) {
    
    this.stripePublicApi = stripePublicApi;
    return this;
  }

   /**
   * Get stripePublicApi
   * @return stripePublicApi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRIPE_PUBLIC_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStripePublicApi() {
    return stripePublicApi;
  }


  public void setStripePublicApi(String stripePublicApi) {
    this.stripePublicApi = stripePublicApi;
  }


  public ConfigResource buildVersion(String buildVersion) {
    
    this.buildVersion = buildVersion;
    return this;
  }

   /**
   * Get buildVersion
   * @return buildVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUILD_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildVersion() {
    return buildVersion;
  }


  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }


  public ConfigResource commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public ConfigResource sentryDsn(String sentryDsn) {
    
    this.sentryDsn = sentryDsn;
    return this;
  }

   /**
   * Get sentryDsn
   * @return sentryDsn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENTRY_DSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentryDsn() {
    return sentryDsn;
  }


  public void setSentryDsn(String sentryDsn) {
    this.sentryDsn = sentryDsn;
  }


  public ConfigResource sentryEnv(String sentryEnv) {
    
    this.sentryEnv = sentryEnv;
    return this;
  }

   /**
   * Get sentryEnv
   * @return sentryEnv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENTRY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentryEnv() {
    return sentryEnv;
  }


  public void setSentryEnv(String sentryEnv) {
    this.sentryEnv = sentryEnv;
  }


  public ConfigResource serverUrl(String serverUrl) {
    
    this.serverUrl = serverUrl;
    return this;
  }

   /**
   * Get serverUrl
   * @return serverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerUrl() {
    return serverUrl;
  }


  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }


  public ConfigResource maxExecutionComparison(Long maxExecutionComparison) {
    
    this.maxExecutionComparison = maxExecutionComparison;
    return this;
  }

   /**
   * Get maxExecutionComparison
   * @return maxExecutionComparison
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_EXECUTION_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxExecutionComparison() {
    return maxExecutionComparison;
  }


  public void setMaxExecutionComparison(Long maxExecutionComparison) {
    this.maxExecutionComparison = maxExecutionComparison;
  }


  public ConfigResource maxExecutionDownload(Long maxExecutionDownload) {
    
    this.maxExecutionDownload = maxExecutionDownload;
    return this;
  }

   /**
   * Get maxExecutionDownload
   * @return maxExecutionDownload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_EXECUTION_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxExecutionDownload() {
    return maxExecutionDownload;
  }


  public void setMaxExecutionDownload(Long maxExecutionDownload) {
    this.maxExecutionDownload = maxExecutionDownload;
  }


  public ConfigResource agentDownloadUrls(Map<String, String> agentDownloadUrls) {
    
    this.agentDownloadUrls = agentDownloadUrls;
    return this;
  }

  public ConfigResource putAgentDownloadUrlsItem(String key, String agentDownloadUrlsItem) {
    if (this.agentDownloadUrls == null) {
      this.agentDownloadUrls = new HashMap<>();
    }
    this.agentDownloadUrls.put(key, agentDownloadUrlsItem);
    return this;
  }

   /**
   * Get agentDownloadUrls
   * @return agentDownloadUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGENT_DOWNLOAD_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAgentDownloadUrls() {
    return agentDownloadUrls;
  }


  public void setAgentDownloadUrls(Map<String, String> agentDownloadUrls) {
    this.agentDownloadUrls = agentDownloadUrls;
  }


  public ConfigResource subDomainPattern(String subDomainPattern) {
    
    this.subDomainPattern = subDomainPattern;
    return this;
  }

   /**
   * Get subDomainPattern
   * @return subDomainPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_DOMAIN_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubDomainPattern() {
    return subDomainPattern;
  }


  public void setSubDomainPattern(String subDomainPattern) {
    this.subDomainPattern = subDomainPattern;
  }


  public ConfigResource cancellationSurveyUrl(String cancellationSurveyUrl) {
    
    this.cancellationSurveyUrl = cancellationSurveyUrl;
    return this;
  }

   /**
   * Get cancellationSurveyUrl
   * @return cancellationSurveyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CANCELLATION_SURVEY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCancellationSurveyUrl() {
    return cancellationSurveyUrl;
  }


  public void setCancellationSurveyUrl(String cancellationSurveyUrl) {
    this.cancellationSurveyUrl = cancellationSurveyUrl;
  }


  public ConfigResource advancedFeatureEnabled(Boolean advancedFeatureEnabled) {
    
    this.advancedFeatureEnabled = advancedFeatureEnabled;
    return this;
  }

   /**
   * Get advancedFeatureEnabled
   * @return advancedFeatureEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADVANCED_FEATURE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdvancedFeatureEnabled() {
    return advancedFeatureEnabled;
  }


  public void setAdvancedFeatureEnabled(Boolean advancedFeatureEnabled) {
    this.advancedFeatureEnabled = advancedFeatureEnabled;
  }


  public ConfigResource usingSubDomain(Boolean usingSubDomain) {
    
    this.usingSubDomain = usingSubDomain;
    return this;
  }

   /**
   * Get usingSubDomain
   * @return usingSubDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USING_SUB_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsingSubDomain() {
    return usingSubDomain;
  }


  public void setUsingSubDomain(Boolean usingSubDomain) {
    this.usingSubDomain = usingSubDomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigResource configResource = (ConfigResource) o;
    return Objects.equals(this.webSocketUrl, configResource.webSocketUrl) &&
        Objects.equals(this.storeUrl, configResource.storeUrl) &&
        Objects.equals(this.profiles, configResource.profiles) &&
        Objects.equals(this.stripePublicApi, configResource.stripePublicApi) &&
        Objects.equals(this.buildVersion, configResource.buildVersion) &&
        Objects.equals(this.commitId, configResource.commitId) &&
        Objects.equals(this.sentryDsn, configResource.sentryDsn) &&
        Objects.equals(this.sentryEnv, configResource.sentryEnv) &&
        Objects.equals(this.serverUrl, configResource.serverUrl) &&
        Objects.equals(this.maxExecutionComparison, configResource.maxExecutionComparison) &&
        Objects.equals(this.maxExecutionDownload, configResource.maxExecutionDownload) &&
        Objects.equals(this.agentDownloadUrls, configResource.agentDownloadUrls) &&
        Objects.equals(this.subDomainPattern, configResource.subDomainPattern) &&
        Objects.equals(this.cancellationSurveyUrl, configResource.cancellationSurveyUrl) &&
        Objects.equals(this.advancedFeatureEnabled, configResource.advancedFeatureEnabled) &&
        Objects.equals(this.usingSubDomain, configResource.usingSubDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webSocketUrl, storeUrl, profiles, stripePublicApi, buildVersion, commitId, sentryDsn, sentryEnv, serverUrl, maxExecutionComparison, maxExecutionDownload, agentDownloadUrls, subDomainPattern, cancellationSurveyUrl, advancedFeatureEnabled, usingSubDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigResource {\n");
    sb.append("    webSocketUrl: ").append(toIndentedString(webSocketUrl)).append("\n");
    sb.append("    storeUrl: ").append(toIndentedString(storeUrl)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    stripePublicApi: ").append(toIndentedString(stripePublicApi)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    sentryDsn: ").append(toIndentedString(sentryDsn)).append("\n");
    sb.append("    sentryEnv: ").append(toIndentedString(sentryEnv)).append("\n");
    sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
    sb.append("    maxExecutionComparison: ").append(toIndentedString(maxExecutionComparison)).append("\n");
    sb.append("    maxExecutionDownload: ").append(toIndentedString(maxExecutionDownload)).append("\n");
    sb.append("    agentDownloadUrls: ").append(toIndentedString(agentDownloadUrls)).append("\n");
    sb.append("    subDomainPattern: ").append(toIndentedString(subDomainPattern)).append("\n");
    sb.append("    cancellationSurveyUrl: ").append(toIndentedString(cancellationSurveyUrl)).append("\n");
    sb.append("    advancedFeatureEnabled: ").append(toIndentedString(advancedFeatureEnabled)).append("\n");
    sb.append("    usingSubDomain: ").append(toIndentedString(usingSubDomain)).append("\n");
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

