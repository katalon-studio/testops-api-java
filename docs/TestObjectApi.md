# TestObjectApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get15**](TestObjectApi.md#get15) | **GET** /api/v1/test-object-entities/{id} | Returns a Test Object detail.

<a name="get15"></a>
# **get15**
> TestObjectEntityResource get15(id)

Returns a Test Object detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestObjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestObjectApi apiInstance = new TestObjectApi();
Long id = 789L; // Long | 
try {
    TestObjectEntityResource result = apiInstance.get15(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestObjectApi#get15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TestObjectEntityResource**](TestObjectEntityResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

