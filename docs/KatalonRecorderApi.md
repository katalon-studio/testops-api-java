# KatalonRecorderApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backup**](KatalonRecorderApi.md#backup) | **POST** /api/v1/katalon-recorder/backup | Saves a Katalon Recorder backup detail.
[**download3**](KatalonRecorderApi.md#download3) | **GET** /api/v1/katalon-recorder/backup/{id}/download | Downloads a Katalon Recorder backup. Returns the backup file.
[**upload**](KatalonRecorderApi.md#upload) | **POST** /api/v1/katalon-recorder/test-reports | Uploads and processes a Katalon Recorder report.



## backup

> backup(uploadedPath)

Saves a Katalon Recorder backup detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.KatalonRecorderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        KatalonRecorderApi apiInstance = new KatalonRecorderApi(defaultClient);
        String uploadedPath = "uploadedPath_example"; // String | 
        try {
            apiInstance.backup(uploadedPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling KatalonRecorderApi#backup");
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
| **200** | OK |  -  |


## download3

> download3(id)

Downloads a Katalon Recorder backup. Returns the backup file.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.KatalonRecorderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        KatalonRecorderApi apiInstance = new KatalonRecorderApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            apiInstance.download3(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling KatalonRecorderApi#download3");
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
 **id** | **Long**|  |

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
| **200** | OK |  -  |


## upload

> upload(projectId, batch, isEnd, fileName, uploadedPath)

Uploads and processes a Katalon Recorder report.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.KatalonRecorderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        KatalonRecorderApi apiInstance = new KatalonRecorderApi(defaultClient);
        String projectId = "projectId_example"; // String | 
        String batch = "batch_example"; // String | 
        String isEnd = "isEnd_example"; // String | 
        String fileName = "fileName_example"; // String | 
        String uploadedPath = "uploadedPath_example"; // String | 
        try {
            apiInstance.upload(projectId, batch, isEnd, fileName, uploadedPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling KatalonRecorderApi#upload");
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

