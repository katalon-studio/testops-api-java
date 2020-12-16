# UserResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**email** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**invitingUrl** | **String** |  |  [optional]
**avatar** | **String** |  |  [optional]
**configs** | [**ConfigResource**](ConfigResource.md) |  |  [optional]
**projects** | [**List&lt;ProjectResource&gt;**](ProjectResource.md) |  |  [optional]
**teams** | [**List&lt;TeamResource&gt;**](TeamResource.md) |  |  [optional]
**organizations** | [**List&lt;OrganizationResource&gt;**](OrganizationResource.md) |  |  [optional]
**organizationFeature** | [**List&lt;UserOrganizationFeatureResource&gt;**](UserOrganizationFeatureResource.md) |  |  [optional]
**trialExpirationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**systemRole** | [**SystemRoleEnum**](#SystemRoleEnum) |  |  [optional]
**businessUser** | **Boolean** |  |  [optional]
**canCreateOfflineKSE** | **Boolean** |  |  [optional]
**canCreateOfflineRE** | **Boolean** |  |  [optional]
**samlSSO** | **Boolean** |  |  [optional]
**fullName** | **String** |  |  [optional]

<a name="SystemRoleEnum"></a>
## Enum: SystemRoleEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
KATALON_ADMIN | &quot;KATALON_ADMIN&quot;
