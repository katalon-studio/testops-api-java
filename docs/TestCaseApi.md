# TestCaseApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get8**](TestCaseApi.md#get8) | **GET** /api/v1/test-cases/{id} | Returns a Test Case detail.
[**update5**](TestCaseApi.md#update5) | **POST** /api/v1/test-cases/update | Update a Test Case.

<a name="get8"></a>
# **get8**
> TestCaseResource get8(id)

Returns a Test Case detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestCaseApi apiInstance = new TestCaseApi();
String id = "id_example"; // String | 
try {
    TestCaseResource result = apiInstance.get8(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestCaseApi#get8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TestCaseResource**](TestCaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update5"></a>
# **update5**
> TestCaseResource update5(body)

Update a Test Case.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestCaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestCaseApi apiInstance = new TestCaseApi();
TestCaseResource body = new TestCaseResource(); // TestCaseResource | 
try {
    TestCaseResource result = apiInstance.update5(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestCaseApi#update5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestCaseResource**](TestCaseResource.md)|  |

### Return type

[**TestCaseResource**](TestCaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

