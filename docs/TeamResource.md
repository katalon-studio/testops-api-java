# TeamResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**users** | [**List&lt;UserResource&gt;**](UserResource.md) |  |  [optional]
**organization** | [**OrganizationResource**](OrganizationResource.md) |  |  [optional]
**organizationId** | **Long** |  |  [optional]

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
OWNER | &quot;OWNER&quot;
ADMIN | &quot;ADMIN&quot;
USER | &quot;USER&quot;
