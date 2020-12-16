# TestReportApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processMultipleS3File**](TestReportApi.md#processMultipleS3File) | **POST** /api/v1/katalon/test-reports/multiple | Saves and processes multiple uploaded Katalon reports.
[**processS3File**](TestReportApi.md#processS3File) | **POST** /api/v1/katalon/test-reports | Saves and processes the uploaded Katalon reports.
[**updateResult**](TestReportApi.md#updateResult) | **POST** /api/v1/katalon/test-reports/update-result | 
[**uploadJUnitReports**](TestReportApi.md#uploadJUnitReports) | **POST** /api/v1/junit/test-reports | Uploads and processes the JUnit reports to an Execution.
[**uploadTestNGReports**](TestReportApi.md#uploadTestNGReports) | **POST** /api/v1/testng/test-reports | Uploads and processes the TestNG reports to an execution.

<a name="processMultipleS3File"></a>
# **processMultipleS3File**
> List&lt;UploadBatchResource&gt; processMultipleS3File(body, projectId, batch)

Saves and processes multiple uploaded Katalon reports.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestReportApi apiInstance = new TestReportApi();
List<UploadBatchFileResource> body = Arrays.asList(new UploadBatchFileResource()); // List<UploadBatchFileResource> | 
Long projectId = 789L; // Long | 
String batch = "batch_example"; // String | 
try {
    List<UploadBatchResource> result = apiInstance.processMultipleS3File(body, projectId, batch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestReportApi#processMultipleS3File");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UploadBatchFileResource&gt;**](UploadBatchFileResource.md)|  |
 **projectId** | **Long**|  |
 **batch** | **String**|  |

### Return type

[**List&lt;UploadBatchResource&gt;**](UploadBatchResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="processS3File"></a>
# **processS3File**
> List&lt;UploadBatchResource&gt; processS3File(projectId, batch, folderPath, isEnd, fileName, uploadedPath)

Saves and processes the uploaded Katalon reports.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestReportApi apiInstance = new TestReportApi();
String projectId = "projectId_example"; // String | 
String batch = "batch_example"; // String | 
String folderPath = "folderPath_example"; // String | 
String isEnd = "isEnd_example"; // String | 
String fileName = "fileName_example"; // String | 
String uploadedPath = "uploadedPath_example"; // String | 
try {
    List<UploadBatchResource> result = apiInstance.processS3File(projectId, batch, folderPath, isEnd, fileName, uploadedPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestReportApi#processS3File");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **batch** | **String**|  |
 **folderPath** | **String**|  |
 **isEnd** | **String**|  |
 **fileName** | **String**|  |
 **uploadedPath** | **String**|  |

### Return type

[**List&lt;UploadBatchResource&gt;**](UploadBatchResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateResult"></a>
# **updateResult**
> ExecutionResource updateResult(body, projectId)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestReportApi apiInstance = new TestReportApi();
TestRunResult body = new TestRunResult(); // TestRunResult | 
Long projectId = 789L; // Long | 
try {
    ExecutionResource result = apiInstance.updateResult(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestReportApi#updateResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestRunResult**](TestRunResult.md)|  |
 **projectId** | **Long**|  |

### Return type

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadJUnitReports"></a>
# **uploadJUnitReports**
> uploadJUnitReports(projectId, batch, folderPath, isEnd, fileName, uploadedPath, sessionId)

Uploads and processes the JUnit reports to an Execution.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestReportApi apiInstance = new TestReportApi();
String projectId = "projectId_example"; // String | 
String batch = "batch_example"; // String | 
String folderPath = "folderPath_example"; // String | 
String isEnd = "isEnd_example"; // String | 
String fileName = "fileName_example"; // String | 
String uploadedPath = "uploadedPath_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    apiInstance.uploadJUnitReports(projectId, batch, folderPath, isEnd, fileName, uploadedPath, sessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestReportApi#uploadJUnitReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **batch** | **String**|  |
 **folderPath** | **String**|  |
 **isEnd** | **String**|  |
 **fileName** | **String**|  |
 **uploadedPath** | **String**|  |
 **sessionId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadTestNGReports"></a>
# **uploadTestNGReports**
> uploadTestNGReports(executionId, projectId, batch, folderPath, isEnd, fileName, uploadedPath)

Uploads and processes the TestNG reports to an execution.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestReportApi apiInstance = new TestReportApi();
Long executionId = 789L; // Long | 
Long projectId = 789L; // Long | 
String batch = "batch_example"; // String | 
String folderPath = "folderPath_example"; // String | 
Boolean isEnd = true; // Boolean | 
String fileName = "fileName_example"; // String | 
String uploadedPath = "uploadedPath_example"; // String | 
try {
    apiInstance.uploadTestNGReports(executionId, projectId, batch, folderPath, isEnd, fileName, uploadedPath);
} catch (ApiException e) {
    System.err.println("Exception when calling TestReportApi#uploadTestNGReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionId** | **Long**|  |
 **projectId** | **Long**|  |
 **batch** | **String**|  |
 **folderPath** | **String**|  |
 **isEnd** | **Boolean**|  |
 **fileName** | **String**|  |
 **uploadedPath** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

