# CommentApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create1**](CommentApi.md#create1) | **POST** /api/v1/comments | Creates a Comment. Returns the created Comment detail.
[**update**](CommentApi.md#update) | **PUT** /api/v1/comments | Updates a Comment detail. Returns the updated Comment detail.

<a name="create1"></a>
# **create1**
> CommentResource create1(body)

Creates a Comment. Returns the created Comment detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.CommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

CommentApi apiInstance = new CommentApi();
CommentResource body = new CommentResource(); // CommentResource | 
try {
    CommentResource result = apiInstance.create1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentResource**](CommentResource.md)|  |

### Return type

[**CommentResource**](CommentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="update"></a>
# **update**
> CommentResource update(body)

Updates a Comment detail. Returns the updated Comment detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.CommentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

CommentApi apiInstance = new CommentApi();
CommentResource body = new CommentResource(); // CommentResource | 
try {
    CommentResource result = apiInstance.update(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommentResource**](CommentResource.md)|  |

### Return type

[**CommentResource**](CommentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

