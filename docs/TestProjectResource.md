# TestProjectResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**uploadFileId** | **Long** |  |  [optional]
**projectId** | **Long** |  |  [optional]
**teamId** | **Long** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**latestJob** | [**JobResource**](JobResource.md) |  |  [optional]
**uploadFileName** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**gitRepository** | [**GitRepositoryResource**](GitRepositoryResource.md) |  |  [optional]
**testSuiteCollections** | [**List&lt;TestSuiteCollectionResource&gt;**](TestSuiteCollectionResource.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
KS | &quot;KS&quot;
GIT | &quot;GIT&quot;
