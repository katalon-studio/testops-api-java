# TestSuiteApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get9**](TestSuiteApi.md#get9) | **GET** /api/v1/test-suites/{id} | Returns a Test Suite detail.

<a name="get9"></a>
# **get9**
> TestSuiteResource get9(id)

Returns a Test Suite detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestSuiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestSuiteApi apiInstance = new TestSuiteApi();
String id = "id_example"; // String | 
try {
    TestSuiteResource result = apiInstance.get9(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuiteApi#get9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TestSuiteResource**](TestSuiteResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

