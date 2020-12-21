

# ExecutionResource

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
**projectId** | **Long** |  |  [optional]
**project** | [**ProjectResource**](ProjectResource.md) |  |  [optional]
**buildId** | **Long** |  |  [optional]
**order** | **Long** |  |  [optional]
**executionStage** | [**ExecutionStageEnum**](#ExecutionStageEnum) |  |  [optional]
**webUrl** | **String** |  |  [optional]
**testSuiteCollections** | [**List&lt;TestSuiteCollectionEntityResource&gt;**](TestSuiteCollectionEntityResource.md) |  |  [optional]
**executionTestSuiteResources** | [**List&lt;ExecutionTestSuiteResource&gt;**](ExecutionTestSuiteResource.md) |  |  [optional]
**release** | [**ReleaseResource**](ReleaseResource.md) |  |  [optional]
**hasComment** | **Boolean** |  |  [optional]
**user** | [**UserResource**](UserResource.md) |  |  [optional]
**sessionId** | **String** |  |  [optional]
**buildLabel** | **String** |  |  [optional]
**buildUrl** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]



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



## Enum: ExecutionStageEnum

Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
COMPLETED | &quot;COMPLETED&quot;
TERMINATE | &quot;TERMINATE&quot;
ANALYZING | &quot;ANALYZING&quot;
ANALYZED | &quot;ANALYZED&quot;
IMPORTING | &quot;IMPORTING&quot;
ERROR | &quot;ERROR&quot;



## Enum: TypeEnum

Name | Value
---- | -----
KATALON | &quot;KATALON&quot;
BDD | &quot;BDD&quot;


## Implemented Interfaces

* Serializable


