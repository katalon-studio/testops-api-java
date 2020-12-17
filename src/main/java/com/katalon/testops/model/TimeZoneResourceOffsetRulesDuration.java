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
import com.katalon.testops.model.TimeZoneResourceOffsetRulesDurationUnits;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * TimeZoneResourceOffsetRulesDuration
 */


public class TimeZoneResourceOffsetRulesDuration {
  @JsonProperty("seconds")
  private Long seconds = null;

  @JsonProperty("zero")
  private Boolean zero = null;

  @JsonProperty("negative")
  private Boolean negative = null;

  @JsonProperty("nano")
  private Integer nano = null;

  @JsonProperty("units")
  private List<TimeZoneResourceOffsetRulesDurationUnits> units = null;

  public TimeZoneResourceOffsetRulesDuration seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @Schema(description = "")
  public Long getSeconds() {
    return seconds;
  }

  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }

  public TimeZoneResourceOffsetRulesDuration zero(Boolean zero) {
    this.zero = zero;
    return this;
  }

   /**
   * Get zero
   * @return zero
  **/
  @Schema(description = "")
  public Boolean isZero() {
    return zero;
  }

  public void setZero(Boolean zero) {
    this.zero = zero;
  }

  public TimeZoneResourceOffsetRulesDuration negative(Boolean negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Get negative
   * @return negative
  **/
  @Schema(description = "")
  public Boolean isNegative() {
    return negative;
  }

  public void setNegative(Boolean negative) {
    this.negative = negative;
  }

  public TimeZoneResourceOffsetRulesDuration nano(Integer nano) {
    this.nano = nano;
    return this;
  }

   /**
   * Get nano
   * @return nano
  **/
  @Schema(description = "")
  public Integer getNano() {
    return nano;
  }

  public void setNano(Integer nano) {
    this.nano = nano;
  }

  public TimeZoneResourceOffsetRulesDuration units(List<TimeZoneResourceOffsetRulesDurationUnits> units) {
    this.units = units;
    return this;
  }

  public TimeZoneResourceOffsetRulesDuration addUnitsItem(TimeZoneResourceOffsetRulesDurationUnits unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<TimeZoneResourceOffsetRulesDurationUnits>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @Schema(description = "")
  public List<TimeZoneResourceOffsetRulesDurationUnits> getUnits() {
    return units;
  }

  public void setUnits(List<TimeZoneResourceOffsetRulesDurationUnits> units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeZoneResourceOffsetRulesDuration timeZoneResourceOffsetRulesDuration = (TimeZoneResourceOffsetRulesDuration) o;
    return Objects.equals(this.seconds, timeZoneResourceOffsetRulesDuration.seconds) &&
        Objects.equals(this.zero, timeZoneResourceOffsetRulesDuration.zero) &&
        Objects.equals(this.negative, timeZoneResourceOffsetRulesDuration.negative) &&
        Objects.equals(this.nano, timeZoneResourceOffsetRulesDuration.nano) &&
        Objects.equals(this.units, timeZoneResourceOffsetRulesDuration.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, zero, negative, nano, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneResourceOffsetRulesDuration {\n");
    
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    zero: ").append(toIndentedString(zero)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
