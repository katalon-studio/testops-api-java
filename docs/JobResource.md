# JobResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**buildNumber** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**queuedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**stopTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**testProject** | [**TestProjectResource**](TestProjectResource.md) |  |  [optional]
**execution** | [**ExecutionResource**](ExecutionResource.md) |  |  [optional]
**agent** | [**AgentResource**](AgentResource.md) |  |  [optional]
**k8sAgent** | [**K8SAgentResource**](K8SAgentResource.md) |  |  [optional]
**circleCiAgent** | [**CircleCIAgentResource**](CircleCIAgentResource.md) |  |  [optional]
**runConfiguration** | [**RunConfigurationResource**](RunConfigurationResource.md) |  |  [optional]
**order** | **Long** |  |  [optional]
**parameter** | [**TriggerBuildParameter**](TriggerBuildParameter.md) |  |  [optional]
**triggerBy** | [**TriggerByEnum**](#TriggerByEnum) |  |  [optional]
**duration** | **Long** |  |  [optional]
**triggerAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**user** | [**UserResource**](UserResource.md) |  |  [optional]
**scheduler** | [**SchedulerResource**](SchedulerResource.md) |  |  [optional]
**project** | [**ProjectResource**](ProjectResource.md) |  |  [optional]
**processId** | **Long** |  |  [optional]
**nodeStatus** | [**NodeStatusEnum**](#NodeStatusEnum) |  |  [optional]
**runConfigurationId** | **Long** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
QUEUED | &quot;QUEUED&quot;
RUNNING | &quot;RUNNING&quot;
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
CANCELED | &quot;CANCELED&quot;
ERROR | &quot;ERROR&quot;
WAIT_FOR_TRIGGER | &quot;WAIT_FOR_TRIGGER&quot;

<a name="TriggerByEnum"></a>
## Enum: TriggerByEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
SCHEDULE | &quot;SCHEDULE&quot;

<a name="NodeStatusEnum"></a>
## Enum: NodeStatusEnum
Name | Value
---- | -----
PENDING_CANCELED | &quot;PENDING_CANCELED&quot;
CANCELED | &quot;CANCELED&quot;
