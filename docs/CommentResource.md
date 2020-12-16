# CommentResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**objectId** | **Long** |  |  [optional]
**projectId** | **Long** |  |  [optional]
**content** | **String** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**teamId** | **Long** |  |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) |  |  [optional]
**email** | **String** |  |  [optional]
**displayName** | **String** |  |  [optional]
**displayAvatar** | **String** |  |  [optional]
**bySystem** | **Boolean** |  |  [optional]

<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
EXECUTION_TEST_SUITE | &quot;EXECUTION_TEST_SUITE&quot;
EXECUTION_TEST_RESULT | &quot;EXECUTION_TEST_RESULT&quot;
TEST_CASE | &quot;TEST_CASE&quot;
INCIDENT | &quot;INCIDENT&quot;
KEYES_EXECUTION | &quot;KEYES_EXECUTION&quot;
