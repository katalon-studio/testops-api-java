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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PlatformResource
 */
@JsonPropertyOrder({
  PlatformResource.JSON_PROPERTY_ID,
  PlatformResource.JSON_PROPERTY_OS_NAME,
  PlatformResource.JSON_PROPERTY_OS_VERSION,
  PlatformResource.JSON_PROPERTY_BROWSER_NAME,
  PlatformResource.JSON_PROPERTY_BROWSER_VERSION
})
@JsonTypeName("PlatformResource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatformResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_OS_NAME = "osName";
  private String osName;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_BROWSER_NAME = "browserName";
  private String browserName;

  public static final String JSON_PROPERTY_BROWSER_VERSION = "browserVersion";
  private String browserVersion;


  public PlatformResource id(Long id) {
    
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


  public PlatformResource osName(String osName) {
    
    this.osName = osName;
    return this;
  }

   /**
   * Get osName
   * @return osName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsName() {
    return osName;
  }


  public void setOsName(String osName) {
    this.osName = osName;
  }


  public PlatformResource osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public PlatformResource browserName(String browserName) {
    
    this.browserName = browserName;
    return this;
  }

   /**
   * Get browserName
   * @return browserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROWSER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserName() {
    return browserName;
  }


  public void setBrowserName(String browserName) {
    this.browserName = browserName;
  }


  public PlatformResource browserVersion(String browserVersion) {
    
    this.browserVersion = browserVersion;
    return this;
  }

   /**
   * Get browserVersion
   * @return browserVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserVersion() {
    return browserVersion;
  }


  public void setBrowserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformResource platformResource = (PlatformResource) o;
    return Objects.equals(this.id, platformResource.id) &&
        Objects.equals(this.osName, platformResource.osName) &&
        Objects.equals(this.osVersion, platformResource.osVersion) &&
        Objects.equals(this.browserName, platformResource.browserName) &&
        Objects.equals(this.browserVersion, platformResource.browserVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, osName, osVersion, browserName, browserVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    browserName: ").append(toIndentedString(browserName)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
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

