# ExecutionRequestApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download**](ExecutionRequestApi.md#download) | **GET** /api/v1/requests/{id}/download | Downloads an Execution Request report. Returns the report file.
[**getExecutionRequest**](ExecutionRequestApi.md#getExecutionRequest) | **GET** /api/v1/requests/{id} | Returns an Execution Request detail.



## download

> download(id, fileType)

Downloads an Execution Request report. Returns the report file.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionRequestApi apiInstance = new ExecutionRequestApi(defaultClient);
        Long id = 56L; // Long | 
        String fileType = "\"har\""; // String | 
        try {
            apiInstance.download(id, fileType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionRequestApi#download");
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
 **fileType** | **String**|  | [optional] [default to &quot;har&quot;]

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


## getExecutionRequest

> ExecutionRequestResource getExecutionRequest(id)

Returns an Execution Request detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionRequestApi apiInstance = new ExecutionRequestApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ExecutionRequestResource result = apiInstance.getExecutionRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionRequestApi#getExecutionRequest");
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

[**ExecutionRequestResource**](ExecutionRequestResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

