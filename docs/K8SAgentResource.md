# K8SAgentResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**certificateAuthority** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**namespace** | **String** |  |  [optional]
**username** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**token** | **String** |  |  [optional]
**cluster** | **String** |  |  [optional]
**region** | **String** |  |  [optional]
**accessKey** | **String** |  |  [optional]
**privateAccessKey** | **String** |  |  [optional]
**teamId** | **Long** |  |  [optional]
**apiKey** | **String** |  |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  [optional]

<a name="AuthenticationTypeEnum"></a>
## Enum: AuthenticationTypeEnum
Name | Value
---- | -----
BASIC_AUTH | &quot;BASIC_AUTH&quot;
BEARER_TOKEN | &quot;BEARER_TOKEN&quot;
EKS_AUTH | &quot;EKS_AUTH&quot;
