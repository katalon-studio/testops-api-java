

# ExecutionTestSuiteResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**duration** | **Long** |  |  [optional]
**elapsedDuration** | **Long** |  |  [optional]
**totalTests** | **Long** |  |  [optional]
**totalPassedTests** | **Long** |  |  [optional]
**totalFailedTests** | **Long** |  |  [optional]
**totalErrorTests** | **Long** |  |  [optional]
**totalIncompleteTests** | **Long** |  |  [optional]
**totalDiffTests** | **Long** |  |  [optional]
**totalDiffPassedTests** | **Long** |  |  [optional]
**totalDiffFailedTests** | **Long** |  |  [optional]
**totalDiffErrorTests** | **Long** |  |  [optional]
**totalDiffIncompleteTests** | **Long** |  |  [optional]
**id** | **Long** |  |  [optional]
**execution** | [**ExecutionResource**](ExecutionResource.md) |  |  [optional]
**testSuite** | [**TestSuiteResource**](TestSuiteResource.md) |  |  [optional]
**platform** | [**PlatformResource**](PlatformResource.md) |  |  [optional]
**executionId** | **Long** |  |  [optional]
**profiles** | **List&lt;String&gt;** |  |  [optional]
**hasComment** | **Boolean** |  |  [optional]
**urlId** | **String** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;
ERROR | &quot;ERROR&quot;
INCOMPLETE | &quot;INCOMPLETE&quot;
RUNNING | &quot;RUNNING&quot;
SKIPPED | &quot;SKIPPED&quot;
NOT_RUN | &quot;NOT_RUN&quot;


## Implemented Interfaces

* Serializable


