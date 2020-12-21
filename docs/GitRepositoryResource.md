

# GitRepositoryResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**testProjectId** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**repository** | **String** |  |  [optional]
**branch** | **String** |  |  [optional]
**username** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**projectId** | **Long** |  |  [optional]
**teamId** | **Long** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**vcsType** | [**VcsTypeEnum**](#VcsTypeEnum) |  |  [optional]



## Enum: VcsTypeEnum

Name | Value
---- | -----
GITHUB | &quot;GITHUB&quot;
GITLAB | &quot;GITLAB&quot;
BITBUCKET | &quot;BITBUCKET&quot;
OTHERS | &quot;OTHERS&quot;


## Implemented Interfaces

* Serializable


