

# OrganizationResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**orgFeatureFlag** | [**OrganizationFeatureFlagResource**](OrganizationFeatureFlagResource.md) |  |  [optional]
**quotaKSE** | **Long** |  |  [optional]
**machineQuotaKSE** | **Long** |  |  [optional]
**quotaEngine** | **Long** |  |  [optional]
**machineQuotaEngine** | **Long** |  |  [optional]
**usedKSE** | **Long** |  |  [optional]
**usedEngine** | **Long** |  |  [optional]
**quotaTestOps** | **Long** |  |  [optional]
**usedTestOps** | **Long** |  |  [optional]
**numberUser** | **Long** |  |  [optional]
**quotaFloatingEngine** | **Long** |  |  [optional]
**usedFloatingEngine** | **Long** |  |  [optional]
**canCreateOfflineKSE** | **Boolean** |  |  [optional]
**canCreateOfflineRE** | **Boolean** |  |  [optional]
**subscriptionExpiryDateEngine** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subscriptionExpiryDateKSE** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subscriptionExpiryDateFloatingEngine** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subscriptionExpiryDateTestOps** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**subscribed** | **Boolean** |  |  [optional]
**ksePaygo** | **Boolean** |  |  [optional]
**krePaygo** | **Boolean** |  |  [optional]
**paygoQuota** | **Long** |  |  [optional]
**domain** | **String** |  |  [optional]
**subdomainUrl** | **String** |  |  [optional]
**strictDomain** | **Boolean** |  |  [optional]
**logoUrl** | **String** |  |  [optional]
**samlSSO** | **Boolean** |  |  [optional]
**kreLicense** | **Boolean** |  |  [optional]
**testOpsPackage** | [**TestOpsPackageEnum**](#TestOpsPackageEnum) |  |  [optional]
**mostRecentProjectAccessedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: RoleEnum

Name | Value
---- | -----
OWNER | &quot;OWNER&quot;
ADMIN | &quot;ADMIN&quot;
USER | &quot;USER&quot;
BILLING_MANAGER | &quot;BILLING_MANAGER&quot;



## Enum: TestOpsPackageEnum

Name | Value
---- | -----
BASIC | &quot;BASIC&quot;
ADVANCED | &quot;ADVANCED&quot;
ENTERPRISE | &quot;ENTERPRISE&quot;


## Implemented Interfaces

* Serializable


