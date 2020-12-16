# ExecutionRequestApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download**](ExecutionRequestApi.md#download) | **GET** /api/v1/requests/{id}/download | Downloads an Execution Request report. Returns the report file.
[**getExecutionRequest**](ExecutionRequestApi.md#getExecutionRequest) | **GET** /api/v1/requests/{id} | Returns an Execution Request detail.

<a name="download"></a>
# **download**
> download(id, fileType)

Downloads an Execution Request report. Returns the report file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionRequestApi apiInstance = new ExecutionRequestApi();
Long id = 789L; // Long | 
String fileType = "har"; // String | 
try {
    apiInstance.download(id, fileType);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionRequestApi#download");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **fileType** | **String**|  | [optional] [default to har]

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getExecutionRequest"></a>
# **getExecutionRequest**
> ExecutionRequestResource getExecutionRequest(id)

Returns an Execution Request detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionRequestApi apiInstance = new ExecutionRequestApi();
Long id = 789L; // Long | 
try {
    ExecutionRequestResource result = apiInstance.getExecutionRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionRequestApi#getExecutionRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ExecutionRequestResource**](ExecutionRequestResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

