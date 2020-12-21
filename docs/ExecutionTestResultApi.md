# ExecutionTestResultApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get2**](ExecutionTestResultApi.md#get2) | **GET** /api/v1/test-results/{id} | Returns an Execution Test Result detail.
[**getStdout**](ExecutionTestResultApi.md#getStdout) | **GET** /api/v1/test-results/logs/{id} | Downloads a test result&#39;s log. Returns the log file.
[**linkIncidents**](ExecutionTestResultApi.md#linkIncidents) | **POST** /api/v1/test-results/{id}/incidents | Link an Execution Test Result to a Task. Returns the created binding detail.
[**markAsRetested**](ExecutionTestResultApi.md#markAsRetested) | **POST** /api/v1/test-results/{id}/mask-as-retested | 
[**unlinkIncidents**](ExecutionTestResultApi.md#unlinkIncidents) | **DELETE** /api/v1/test-results/{id}/incidents | Unlink an Execution Test Result to a Task. Returns the deleted binding detail.



## get2

> ExecutionTestResultResource get2(id)

Returns an Execution Test Result detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionTestResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionTestResultApi apiInstance = new ExecutionTestResultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ExecutionTestResultResource result = apiInstance.get2(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionTestResultApi#get2");
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
 **id** | **String**|  |

### Return type

[**ExecutionTestResultResource**](ExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getStdout

> String getStdout(id)

Downloads a test result&#39;s log. Returns the log file.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionTestResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionTestResultApi apiInstance = new ExecutionTestResultApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            String result = apiInstance.getStdout(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionTestResultApi#getStdout");
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

**String**

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## linkIncidents

> IncidentExecutionTestResultResource linkIncidents(id, incidentExecutionTestResultResource)

Link an Execution Test Result to a Task. Returns the created binding detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionTestResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionTestResultApi apiInstance = new ExecutionTestResultApi(defaultClient);
        String id = "id_example"; // String | 
        IncidentExecutionTestResultResource incidentExecutionTestResultResource = new IncidentExecutionTestResultResource(); // IncidentExecutionTestResultResource | 
        try {
            IncidentExecutionTestResultResource result = apiInstance.linkIncidents(id, incidentExecutionTestResultResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionTestResultApi#linkIncidents");
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
 **id** | **String**|  |
 **incidentExecutionTestResultResource** | [**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)|  |

### Return type

[**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## markAsRetested

> ExecutionTestResultResource markAsRetested(id)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionTestResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionTestResultApi apiInstance = new ExecutionTestResultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ExecutionTestResultResource result = apiInstance.markAsRetested(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionTestResultApi#markAsRetested");
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
 **id** | **String**|  |

### Return type

[**ExecutionTestResultResource**](ExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## unlinkIncidents

> IncidentExecutionTestResultResource unlinkIncidents(id, incidentExecutionTestResultResource)

Unlink an Execution Test Result to a Task. Returns the deleted binding detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionTestResultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionTestResultApi apiInstance = new ExecutionTestResultApi(defaultClient);
        String id = "id_example"; // String | 
        IncidentExecutionTestResultResource incidentExecutionTestResultResource = new IncidentExecutionTestResultResource(); // IncidentExecutionTestResultResource | 
        try {
            IncidentExecutionTestResultResource result = apiInstance.unlinkIncidents(id, incidentExecutionTestResultResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionTestResultApi#unlinkIncidents");
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
 **id** | **String**|  |
 **incidentExecutionTestResultResource** | [**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)|  |

### Return type

[**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

