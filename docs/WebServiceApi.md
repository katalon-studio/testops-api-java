# WebServiceApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get16**](WebServiceApi.md#get16) | **GET** /api/v1/test-objects/{id} | Returns a Web Service detail.

<a name="get16"></a>
# **get16**
> TestObjectResource get16(id)

Returns a Web Service detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.WebServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

WebServiceApi apiInstance = new WebServiceApi();
String id = "id_example"; // String | 
try {
    TestObjectResource result = apiInstance.get16(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebServiceApi#get16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TestObjectResource**](TestObjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

