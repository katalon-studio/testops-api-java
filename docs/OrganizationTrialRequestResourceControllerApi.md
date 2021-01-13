# OrganizationTrialRequestResourceControllerApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrialRequest**](OrganizationTrialRequestResourceControllerApi.md#getTrialRequest) | **GET** /api/v1/organizations/{id}/trial-request | Get organization trial request data
[**submitTrialRequest**](OrganizationTrialRequestResourceControllerApi.md#submitTrialRequest) | **POST** /api/v1/organizations/{id}/trial-request | Submit organization trial request



## getTrialRequest

> OrganizationTrialRequestResource getTrialRequest(id)

Get organization trial request data

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.OrganizationTrialRequestResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        OrganizationTrialRequestResourceControllerApi apiInstance = new OrganizationTrialRequestResourceControllerApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            OrganizationTrialRequestResource result = apiInstance.getTrialRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationTrialRequestResourceControllerApi#getTrialRequest");
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

[**OrganizationTrialRequestResource**](OrganizationTrialRequestResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## submitTrialRequest

> OrganizationTrialRequestResource submitTrialRequest(id, organizationTrialRequestResource)

Submit organization trial request

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.OrganizationTrialRequestResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        OrganizationTrialRequestResourceControllerApi apiInstance = new OrganizationTrialRequestResourceControllerApi(defaultClient);
        Long id = 56L; // Long | 
        OrganizationTrialRequestResource organizationTrialRequestResource = new OrganizationTrialRequestResource(); // OrganizationTrialRequestResource | 
        try {
            OrganizationTrialRequestResource result = apiInstance.submitTrialRequest(id, organizationTrialRequestResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationTrialRequestResourceControllerApi#submitTrialRequest");
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
 **organizationTrialRequestResource** | [**OrganizationTrialRequestResource**](OrganizationTrialRequestResource.md)|  |

### Return type

[**OrganizationTrialRequestResource**](OrganizationTrialRequestResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

