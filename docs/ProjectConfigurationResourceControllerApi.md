# ProjectConfigurationResourceControllerApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get14**](ProjectConfigurationResourceControllerApi.md#get14) | **GET** /api/v1/project-configurations/{id} | 
[**listTimeZones**](ProjectConfigurationResourceControllerApi.md#listTimeZones) | **GET** /api/v1/time-zones | 
[**update8**](ProjectConfigurationResourceControllerApi.md#update8) | **POST** /api/v1/project-configurations/{id} | 



## get14

> ProjectConfigurationResource get14(id, name)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ProjectConfigurationResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ProjectConfigurationResourceControllerApi apiInstance = new ProjectConfigurationResourceControllerApi(defaultClient);
        Long id = 56L; // Long | 
        String name = "name_example"; // String | 
        try {
            ProjectConfigurationResource result = apiInstance.get14(id, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectConfigurationResourceControllerApi#get14");
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
 **name** | **String**|  | [enum: TIMEZONE, ASSERTION_PATTERN]

### Return type

[**ProjectConfigurationResource**](ProjectConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listTimeZones

> List&lt;TimeZoneResource&gt; listTimeZones()



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ProjectConfigurationResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ProjectConfigurationResourceControllerApi apiInstance = new ProjectConfigurationResourceControllerApi(defaultClient);
        try {
            List<TimeZoneResource> result = apiInstance.listTimeZones();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectConfigurationResourceControllerApi#listTimeZones");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;TimeZoneResource&gt;**](TimeZoneResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update8

> ProjectConfigurationResource update8(id, projectConfigurationResource)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ProjectConfigurationResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ProjectConfigurationResourceControllerApi apiInstance = new ProjectConfigurationResourceControllerApi(defaultClient);
        Long id = 56L; // Long | 
        ProjectConfigurationResource projectConfigurationResource = new ProjectConfigurationResource(); // ProjectConfigurationResource | 
        try {
            ProjectConfigurationResource result = apiInstance.update8(id, projectConfigurationResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectConfigurationResourceControllerApi#update8");
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
 **projectConfigurationResource** | [**ProjectConfigurationResource**](ProjectConfigurationResource.md)|  |

### Return type

[**ProjectConfigurationResource**](ProjectConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

