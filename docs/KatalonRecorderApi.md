# KatalonRecorderApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup**](KatalonRecorderApi.md#backup) | **POST** /api/v1/katalon-recorder/backup | Saves a Katalon Recorder backup detail.
[**download3**](KatalonRecorderApi.md#download3) | **GET** /api/v1/katalon-recorder/backup/{id}/download | Downloads a Katalon Recorder backup. Returns the backup file.
[**upload**](KatalonRecorderApi.md#upload) | **POST** /api/v1/katalon-recorder/test-reports | Uploads and processes a Katalon Recorder report.

<a name="backup"></a>
# **backup**
> backup(uploadedPath)

Saves a Katalon Recorder backup detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.KatalonRecorderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

KatalonRecorderApi apiInstance = new KatalonRecorderApi();
String uploadedPath = "uploadedPath_example"; // String | 
try {
    apiInstance.backup(uploadedPath);
} catch (ApiException e) {
    System.err.println("Exception when calling KatalonRecorderApi#backup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadedPath** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="download3"></a>
# **download3**
> download3(id)

Downloads a Katalon Recorder backup. Returns the backup file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.KatalonRecorderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

KatalonRecorderApi apiInstance = new KatalonRecorderApi();
Long id = 789L; // Long | 
try {
    apiInstance.download3(id);
} catch (ApiException e) {
    System.err.println("Exception when calling KatalonRecorderApi#download3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="upload"></a>
# **upload**
> upload(projectId, batch, isEnd, fileName, uploadedPath)

Uploads and processes a Katalon Recorder report.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.KatalonRecorderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

KatalonRecorderApi apiInstance = new KatalonRecorderApi();
String projectId = "projectId_example"; // String | 
String batch = "batch_example"; // String | 
String isEnd = "isEnd_example"; // String | 
String fileName = "fileName_example"; // String | 
String uploadedPath = "uploadedPath_example"; // String | 
try {
    apiInstance.upload(projectId, batch, isEnd, fileName, uploadedPath);
} catch (ApiException e) {
    System.err.println("Exception when calling KatalonRecorderApi#upload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **batch** | **String**|  |
 **isEnd** | **String**|  |
 **fileName** | **String**|  |
 **uploadedPath** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

