# TestReportApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processMultipleS3File**](TestReportApi.md#processMultipleS3File) | **POST** /api/v1/katalon/test-reports/multiple | Saves and processes multiple uploaded Katalon reports.
[**processS3File**](TestReportApi.md#processS3File) | **POST** /api/v1/katalon/test-reports | Saves and processes the uploaded Katalon reports.
[**processTestOpsReports**](TestReportApi.md#processTestOpsReports) | **POST** /api/v1/testops-reports | Saves and processes multiple uploaded TestOps reports.
[**updateResult**](TestReportApi.md#updateResult) | **POST** /api/v1/katalon/test-reports/update-result | 
[**uploadJUnitReports**](TestReportApi.md#uploadJUnitReports) | **POST** /api/v1/junit/test-reports | Uploads and processes the JUnit reports to an Execution.
[**uploadTestNGReports**](TestReportApi.md#uploadTestNGReports) | **POST** /api/v1/testng/test-reports | Uploads and processes the TestNG reports to an execution.



## processMultipleS3File

> List&lt;UploadBatchResource&gt; processMultipleS3File(projectId, batch, uploadBatchFileResource)

Saves and processes multiple uploaded Katalon reports.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestReportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestReportApi apiInstance = new TestReportApi(defaultClient);
        Long projectId = 56L; // Long | 
        String batch = "batch_example"; // String | 
        List<UploadBatchFileResource> uploadBatchFileResource = Arrays.asList(); // List<UploadBatchFileResource> | 
        try {
            List<UploadBatchResource> result = apiInstance.processMultipleS3File(projectId, batch, uploadBatchFileResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestReportApi#processMultipleS3File");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**|  |
 **batch** | **String**|  |
 **uploadBatchFileResource** | [**List&lt;UploadBatchFileResource&gt;**](UploadBatchFileResource.md)|  |

### Return type

[**List&lt;UploadBatchResource&gt;**](UploadBatchResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## processS3File

> List&lt;UploadBatchResource&gt; processS3File(projectId, batch, folderPath, isEnd, fileName, uploadedPath)

Saves and processes the uploaded Katalon reports.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestReportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestReportApi apiInstance = new TestReportApi(defaultClient);
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
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## processTestOpsReports

> UploadBatchResource processTestOpsReports(projectId, batch, uploadBatchFileResource)

Saves and processes multiple uploaded TestOps reports.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestReportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestReportApi apiInstance = new TestReportApi(defaultClient);
        Long projectId = 56L; // Long | 
        String batch = "batch_example"; // String | 
        List<UploadBatchFileResource> uploadBatchFileResource = Arrays.asList(); // List<UploadBatchFileResource> | 
        try {
            UploadBatchResource result = apiInstance.processTestOpsReports(projectId, batch, uploadBatchFileResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestReportApi#processTestOpsReports");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**|  |
 **batch** | **String**|  |
 **uploadBatchFileResource** | [**List&lt;UploadBatchFileResource&gt;**](UploadBatchFileResource.md)|  |

### Return type

[**UploadBatchResource**](UploadBatchResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateResult

> ExecutionResource updateResult(projectId, testRunResult)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestReportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestReportApi apiInstance = new TestReportApi(defaultClient);
        Long projectId = 56L; // Long | 
        TestRunResult testRunResult = new TestRunResult(); // TestRunResult | 
        try {
            ExecutionResource result = apiInstance.updateResult(projectId, testRunResult);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestReportApi#updateResult");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**|  |
 **testRunResult** | [**TestRunResult**](TestRunResult.md)|  |

### Return type

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## uploadJUnitReports

> uploadJUnitReports(projectId, batch, folderPath, isEnd, fileName, uploadedPath, sessionId)

Uploads and processes the JUnit reports to an Execution.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestReportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestReportApi apiInstance = new TestReportApi(defaultClient);
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
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## uploadTestNGReports

> uploadTestNGReports(executionId, projectId, batch, folderPath, isEnd, fileName, uploadedPath)

Uploads and processes the TestNG reports to an execution.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestReportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestReportApi apiInstance = new TestReportApi(defaultClient);
        Long executionId = 56L; // Long | 
        Long projectId = 56L; // Long | 
        String batch = "batch_example"; // String | 
        String folderPath = "folderPath_example"; // String | 
        Boolean isEnd = true; // Boolean | 
        String fileName = "fileName_example"; // String | 
        String uploadedPath = "uploadedPath_example"; // String | 
        try {
            apiInstance.uploadTestNGReports(executionId, projectId, batch, folderPath, isEnd, fileName, uploadedPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestReportApi#uploadTestNGReports");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

