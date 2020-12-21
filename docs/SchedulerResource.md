

# SchedulerResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**nextTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**active** | **Boolean** |  |  [optional]
**interval** | **Integer** |  |  [optional]
**intervalUnit** | [**IntervalUnitEnum**](#IntervalUnitEnum) |  |  [optional]
**runConfigurationId** | **Long** |  |  [optional]
**runConfiguration** | [**RunConfigurationResource**](RunConfigurationResource.md) |  |  [optional]



## Enum: IntervalUnitEnum

Name | Value
---- | -----
MINUTE | &quot;MINUTE&quot;
HOUR | &quot;HOUR&quot;
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;


## Implemented Interfaces

* Serializable


