

# OrganizationTrialRequestResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organization** | [**OrganizationResource**](OrganizationResource.md) |  |  [optional]
**userRequest** | [**UserResource**](UserResource.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**formRequest** | **String** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;


## Implemented Interfaces

* Serializable


