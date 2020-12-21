# ReleaseApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activeRelease**](ReleaseApi.md#activeRelease) | **POST** /api/v1/releases/{id}/active | Open or close a Release. Returns the updated Release detail.
[**createOrUpdate1**](ReleaseApi.md#createOrUpdate1) | **POST** /api/v1/releases | Creates or updates a Release. Returns the Release details.
[**delete3**](ReleaseApi.md#delete3) | **DELETE** /api/v1/releases/{id} | Deletes a Release. Returns the Release details.
[**update3**](ReleaseApi.md#update3) | **PUT** /api/v1/releases | Updates a Release. Returns the Release details.



## activeRelease

> ReleaseResource activeRelease(id, closed)

Open or close a Release. Returns the updated Release detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ReleaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ReleaseApi apiInstance = new ReleaseApi(defaultClient);
        Long id = 56L; // Long | 
        Boolean closed = true; // Boolean | 
        try {
            ReleaseResource result = apiInstance.activeRelease(id, closed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseApi#activeRelease");
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
 **closed** | **Boolean**|  |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createOrUpdate1

> ReleaseResource createOrUpdate1(releaseResource)

Creates or updates a Release. Returns the Release details.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ReleaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ReleaseApi apiInstance = new ReleaseApi(defaultClient);
        ReleaseResource releaseResource = new ReleaseResource(); // ReleaseResource | 
        try {
            ReleaseResource result = apiInstance.createOrUpdate1(releaseResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseApi#createOrUpdate1");
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
 **releaseResource** | [**ReleaseResource**](ReleaseResource.md)|  |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete3

> ReleaseResource delete3(id)

Deletes a Release. Returns the Release details.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ReleaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ReleaseApi apiInstance = new ReleaseApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ReleaseResource result = apiInstance.delete3(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseApi#delete3");
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

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update3

> ReleaseResource update3(releaseResource)

Updates a Release. Returns the Release details.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ReleaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ReleaseApi apiInstance = new ReleaseApi(defaultClient);
        ReleaseResource releaseResource = new ReleaseResource(); // ReleaseResource | 
        try {
            ReleaseResource result = apiInstance.update3(releaseResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReleaseApi#update3");
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
 **releaseResource** | [**ReleaseResource**](ReleaseResource.md)|  |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

