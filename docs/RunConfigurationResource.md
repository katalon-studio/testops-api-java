# RunConfigurationResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**command** | **String** |  |  [optional]
**projectId** | **Long** |  |  [optional]
**teamId** | **Long** |  |  [optional]
**testProjectId** | **Long** |  |  [optional]
**testSuiteCollectionId** | **Long** |  |  [optional]
**timeOut** | **Long** |  |  [optional]
**configType** | [**ConfigTypeEnum**](#ConfigTypeEnum) |  |  [optional]
**testProject** | [**TestProjectResource**](TestProjectResource.md) |  |  [optional]
**agents** | [**List&lt;AgentResource&gt;**](AgentResource.md) |  |  [optional]
**k8sAgents** | [**List&lt;K8SAgentResource&gt;**](K8SAgentResource.md) |  |  [optional]
**circleCIAgents** | [**List&lt;CircleCIAgentResource&gt;**](CircleCIAgentResource.md) |  |  [optional]
**cloudType** | [**CloudTypeEnum**](#CloudTypeEnum) |  |  [optional]
**latestJob** | [**JobResource**](JobResource.md) |  |  [optional]
**genericCommand** | **String** |  |  [optional]
**ksVersion** | **String** |  |  [optional]
**ksLocation** | **String** |  |  [optional]
**nextRunScheduler** | [**SchedulerResource**](SchedulerResource.md) |  |  [optional]
**release** | [**ReleaseResource**](ReleaseResource.md) |  |  [optional]

<a name="ConfigTypeEnum"></a>
## Enum: ConfigTypeEnum
Name | Value
---- | -----
TSC | &quot;TSC&quot;
COMMAND | &quot;COMMAND&quot;
GENERIC_COMMAND | &quot;GENERIC_COMMAND&quot;

<a name="CloudTypeEnum"></a>
## Enum: CloudTypeEnum
Name | Value
---- | -----
K8S | &quot;K8S&quot;
LOCAL_AGENT | &quot;LOCAL_AGENT&quot;
K8S_AGENT | &quot;K8S_AGENT&quot;
CIRCLE_CI_AGENT | &quot;CIRCLE_CI_AGENT&quot;
