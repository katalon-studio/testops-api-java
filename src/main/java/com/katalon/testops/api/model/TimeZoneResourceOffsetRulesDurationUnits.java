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
 * TimeZoneResourceOffsetRulesDurationUnits
 */
@JsonPropertyOrder({
  TimeZoneResourceOffsetRulesDurationUnits.JSON_PROPERTY_DATE_BASED,
  TimeZoneResourceOffsetRulesDurationUnits.JSON_PROPERTY_TIME_BASED,
  TimeZoneResourceOffsetRulesDurationUnits.JSON_PROPERTY_DURATION_ESTIMATED
})
@JsonTypeName("TimeZoneResource_offset_rules_duration_units")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TimeZoneResourceOffsetRulesDurationUnits implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE_BASED = "dateBased";
  private Boolean dateBased;

  public static final String JSON_PROPERTY_TIME_BASED = "timeBased";
  private Boolean timeBased;

  public static final String JSON_PROPERTY_DURATION_ESTIMATED = "durationEstimated";
  private Boolean durationEstimated;


  public TimeZoneResourceOffsetRulesDurationUnits dateBased(Boolean dateBased) {
    
    this.dateBased = dateBased;
    return this;
  }

   /**
   * Get dateBased
   * @return dateBased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_BASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDateBased() {
    return dateBased;
  }


  public void setDateBased(Boolean dateBased) {
    this.dateBased = dateBased;
  }


  public TimeZoneResourceOffsetRulesDurationUnits timeBased(Boolean timeBased) {
    
    this.timeBased = timeBased;
    return this;
  }

   /**
   * Get timeBased
   * @return timeBased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_BASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTimeBased() {
    return timeBased;
  }


  public void setTimeBased(Boolean timeBased) {
    this.timeBased = timeBased;
  }


  public TimeZoneResourceOffsetRulesDurationUnits durationEstimated(Boolean durationEstimated) {
    
    this.durationEstimated = durationEstimated;
    return this;
  }

   /**
   * Get durationEstimated
   * @return durationEstimated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION_ESTIMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDurationEstimated() {
    return durationEstimated;
  }


  public void setDurationEstimated(Boolean durationEstimated) {
    this.durationEstimated = durationEstimated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZoneResourceOffsetRulesDurationUnits timeZoneResourceOffsetRulesDurationUnits = (TimeZoneResourceOffsetRulesDurationUnits) o;
    return Objects.equals(this.dateBased, timeZoneResourceOffsetRulesDurationUnits.dateBased) &&
        Objects.equals(this.timeBased, timeZoneResourceOffsetRulesDurationUnits.timeBased) &&
        Objects.equals(this.durationEstimated, timeZoneResourceOffsetRulesDurationUnits.durationEstimated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateBased, timeBased, durationEstimated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneResourceOffsetRulesDurationUnits {\n");
    sb.append("    dateBased: ").append(toIndentedString(dateBased)).append("\n");
    sb.append("    timeBased: ").append(toIndentedString(timeBased)).append("\n");
    sb.append("    durationEstimated: ").append(toIndentedString(durationEstimated)).append("\n");
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

