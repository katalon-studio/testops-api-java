# TestPlanApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAndTriggerSample**](TestPlanApi.md#createAndTriggerSample) | **POST** /api/v1/run-configurations/sample | Creates and triggers a sample Test Plan. Returns the created Test Plan detail.
[**createOrUpdateConfiguration**](TestPlanApi.md#createOrUpdateConfiguration) | **POST** /api/v1/run-configurations | Creates or updates a Test Plan. Returns the Test Plan detail.
[**delete5**](TestPlanApi.md#delete5) | **DELETE** /api/v1/run-configurations/{id} | Deletes a Test Plan. Returns the deleted Test Plan detail.
[**linkRelease1**](TestPlanApi.md#linkRelease1) | **POST** /api/v1/run-configurations/{id}/link-release | Link an Run Configuration to a Release. Returns the updated Run Configuration detail.
[**unlinkRelease1**](TestPlanApi.md#unlinkRelease1) | **POST** /api/v1/run-configurations/{id}/unlink-release | Unlink an Run Configuration to a Release. Returns the updated Run Configuration detail.



## createAndTriggerSample

> RunConfigurationResource createAndTriggerSample(runConfigurationResource)

Creates and triggers a sample Test Plan. Returns the created Test Plan detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestPlanApi apiInstance = new TestPlanApi(defaultClient);
        RunConfigurationResource runConfigurationResource = new RunConfigurationResource(); // RunConfigurationResource | 
        try {
            RunConfigurationResource result = apiInstance.createAndTriggerSample(runConfigurationResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlanApi#createAndTriggerSample");
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
 **runConfigurationResource** | [**RunConfigurationResource**](RunConfigurationResource.md)|  |

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createOrUpdateConfiguration

> RunConfigurationResource createOrUpdateConfiguration(runConfigurationResource, verifyRunConfiguration)

Creates or updates a Test Plan. Returns the Test Plan detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestPlanApi apiInstance = new TestPlanApi(defaultClient);
        RunConfigurationResource runConfigurationResource = new RunConfigurationResource(); // RunConfigurationResource | 
        Boolean verifyRunConfiguration = false; // Boolean | 
        try {
            RunConfigurationResource result = apiInstance.createOrUpdateConfiguration(runConfigurationResource, verifyRunConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlanApi#createOrUpdateConfiguration");
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
 **runConfigurationResource** | [**RunConfigurationResource**](RunConfigurationResource.md)|  |
 **verifyRunConfiguration** | **Boolean**|  | [optional] [default to false]

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete5

> RunConfigurationResource delete5(id)

Deletes a Test Plan. Returns the deleted Test Plan detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestPlanApi apiInstance = new TestPlanApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            RunConfigurationResource result = apiInstance.delete5(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlanApi#delete5");
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

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## linkRelease1

> RunConfigurationResource linkRelease1(id, projectId, releaseId)

Link an Run Configuration to a Release. Returns the updated Run Configuration detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestPlanApi apiInstance = new TestPlanApi(defaultClient);
        Long id = 56L; // Long | 
        Long projectId = 56L; // Long | 
        Long releaseId = 56L; // Long | 
        try {
            RunConfigurationResource result = apiInstance.linkRelease1(id, projectId, releaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlanApi#linkRelease1");
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
 **projectId** | **Long**|  |
 **releaseId** | **Long**|  |

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## unlinkRelease1

> RunConfigurationResource unlinkRelease1(id)

Unlink an Run Configuration to a Release. Returns the updated Run Configuration detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.TestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        TestPlanApi apiInstance = new TestPlanApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            RunConfigurationResource result = apiInstance.unlinkRelease1(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlanApi#unlinkRelease1");
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

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

