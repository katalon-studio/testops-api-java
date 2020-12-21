

# TriggerBuildParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloadUrl** | **String** |  |  [optional]
**command** | **String** |  |  [optional]
**environmentVariables** | [**List&lt;EnvironmentVariable&gt;**](EnvironmentVariable.md) |  |  [optional]
**sessionId** | **String** |  |  [optional]
**ksVersion** | **String** |  |  [optional]
**ksLocation** | **String** |  |  [optional]
**configType** | [**ConfigTypeEnum**](#ConfigTypeEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**gitRepositoryResource** | [**GitRepositoryResource**](GitRepositoryResource.md) |  |  [optional]



## Enum: ConfigTypeEnum

Name | Value
---- | -----
TSC | &quot;TSC&quot;
COMMAND | &quot;COMMAND&quot;
GENERIC_COMMAND | &quot;GENERIC_COMMAND&quot;



## Enum: TypeEnum

Name | Value
---- | -----
KS | &quot;KS&quot;
GIT | &quot;GIT&quot;


## Implemented Interfaces

* Serializable


