

# TestCaseResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**path** | **String** |  |  [optional]
**previousStatus** | [**PreviousStatusEnum**](#PreviousStatusEnum) |  |  [optional]
**alias** | **String** |  |  [optional]
**testModuleId** | **Long** |  |  [optional]
**webUrl** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**project** | [**ProjectResource**](ProjectResource.md) |  |  [optional]
**lastExecutionTestCase** | [**ExecutionTestCaseResource**](ExecutionTestCaseResource.md) |  |  [optional]
**externalIssues** | [**List&lt;ExternalIssueResource&gt;**](ExternalIssueResource.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**averageDuration** | **Double** |  |  [optional]
**maxDuration** | **Long** |  |  [optional]
**minDuration** | **Long** |  |  [optional]
**executionTestResults** | [**List&lt;ExecutionTestResultResource&gt;**](ExecutionTestResultResource.md) |  |  [optional]
**flakiness** | **Double** |  |  [optional]
**platformStatistics** | [**Map&lt;String, TestCasePlatformStatisticsResource&gt;**](TestCasePlatformStatisticsResource.md) |  |  [optional]
**maintainer** | [**UserResource**](UserResource.md) |  |  [optional]
**testResultAssertion** | [**TestResultAssertionResource**](TestResultAssertionResource.md) |  |  [optional]
**urlId** | **String** |  |  [optional]



## Enum: PreviousStatusEnum

Name | Value
---- | -----
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;
ERROR | &quot;ERROR&quot;
INCOMPLETE | &quot;INCOMPLETE&quot;
RUNNING | &quot;RUNNING&quot;
SKIPPED | &quot;SKIPPED&quot;
NOT_RUN | &quot;NOT_RUN&quot;



## Enum: TypeEnum

Name | Value
---- | -----
TEST_CASE | &quot;TEST_CASE&quot;
SCENARIO | &quot;SCENARIO&quot;


## Implemented Interfaces

* Serializable


