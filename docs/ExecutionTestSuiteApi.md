# ExecutionTestSuiteApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get3**](ExecutionTestSuiteApi.md#get3) | **GET** /api/v1/execution-test-suites/{id} | Returns an Execution Test Suite detail.

<a name="get3"></a>
# **get3**
> ExecutionTestSuiteResource get3(id)

Returns an Execution Test Suite detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionTestSuiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionTestSuiteApi apiInstance = new ExecutionTestSuiteApi();
String id = "id_example"; // String | 
try {
    ExecutionTestSuiteResource result = apiInstance.get3(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionTestSuiteApi#get3");
    e.printStackTrace();
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

