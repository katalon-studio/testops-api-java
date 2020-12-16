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

<a name="ConfigTypeEnum"></a>
## Enum: ConfigTypeEnum
Name | Value
---- | -----
TSC | &quot;TSC&quot;
COMMAND | &quot;COMMAND&quot;
GENERIC_COMMAND | &quot;GENERIC_COMMAND&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
KS | &quot;KS&quot;
GIT | &quot;GIT&quot;
