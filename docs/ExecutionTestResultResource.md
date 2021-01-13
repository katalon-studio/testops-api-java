

# ExecutionTestResultResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**testCase** | [**TestCaseResource**](TestCaseResource.md) |  |  [optional]
**execution** | [**ExecutionResource**](ExecutionResource.md) |  |  [optional]
**platform** | [**PlatformResource**](PlatformResource.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**sameStatusPeriod** | **Long** |  |  [optional]
**errorDetailsId** | **Long** |  |  [optional]
**stdoutId** | **Long** |  |  [optional]
**descriptionId** | **Long** |  |  [optional]
**logId** | **Long** |  |  [optional]
**attachments** | [**List&lt;FileResource&gt;**](FileResource.md) |  |  [optional]
**testResultAssertionsFailed** | [**List&lt;TestResultAssertionFailedResource&gt;**](TestResultAssertionFailedResource.md) |  |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**duration** | **Long** |  |  [optional]
**sameFailureResults** | [**List&lt;ExecutionTestResultIdentifyResource&gt;**](ExecutionTestResultIdentifyResource.md) |  |  [optional]
**testSuite** | [**TestSuiteResource**](TestSuiteResource.md) |  |  [optional]
**executionTestSuite** | [**ExecutionTestSuiteResource**](ExecutionTestSuiteResource.md) |  |  [optional]
**incidents** | [**List&lt;IncidentResource&gt;**](IncidentResource.md) |  |  [optional]
**profile** | **String** |  |  [optional]
**hasComment** | **Boolean** |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**errorDetail** | **String** |  |  [optional]
**webUrl** | **String** |  |  [optional]
**externalIssues** | [**List&lt;ExternalIssueResource&gt;**](ExternalIssueResource.md) |  |  [optional]
**failedTestResultCategory** | [**FailedTestResultCategoryEnum**](#FailedTestResultCategoryEnum) |  |  [optional]
**totalTestObject** | **Long** |  |  [optional]
**totalDefects** | **Integer** |  |  [optional]
**totalAssertion** | **Long** |  |  [optional]
**passedAssertion** | **Long** |  |  [optional]
**failedAssertion** | **Long** |  |  [optional]
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



## Enum: FailedTestResultCategoryEnum

Name | Value
---- | -----
APPLICATION | &quot;APPLICATION&quot;
AUTOMATION | &quot;AUTOMATION&quot;
ENVIRONMENT | &quot;ENVIRONMENT&quot;
UNKNOWN | &quot;UNKNOWN&quot;


## Implemented Interfaces

* Serializable


