# ExecutionTestSuiteApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get3**](ExecutionTestSuiteApi.md#get3) | **GET** /api/v1/execution-test-suites/{id} | Returns an Execution Test Suite detail.



## get3

> ExecutionTestSuiteResource get3(id)

Returns an Execution Test Suite detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionTestSuiteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionTestSuiteApi apiInstance = new ExecutionTestSuiteApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ExecutionTestSuiteResource result = apiInstance.get3(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionTestSuiteApi#get3");
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

[**ExecutionTestSuiteResource**](ExecutionTestSuiteResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

