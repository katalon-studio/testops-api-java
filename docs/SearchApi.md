# SearchApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /api/v1/search | Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
[**search1**](SearchApi.md#search1) | **POST** /api/v1/search | Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
[**test**](SearchApi.md#test) | **GET** /api/v1/search/info | Returns the search configuration.

<a name="search"></a>
# **search**
> PageBaseResource search(q)

Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
String q = "q_example"; // String | 
try {
    PageBaseResource result = apiInstance.search(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  |

### Return type

[**PageBaseResource**](PageBaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="search1"></a>
# **search1**
> PageBaseResource search1(body)

Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
SearchRequest body = new SearchRequest(); // SearchRequest | 
try {
    PageBaseResource result = apiInstance.search1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)|  |

### Return type

[**PageBaseResource**](PageBaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="test"></a>
# **test**
> Map&lt;String, SearchConfigResource&gt; test()

Returns the search configuration.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

SearchApi apiInstance = new SearchApi();
try {
    Map<String, SearchConfigResource> result = apiInstance.test();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#test");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, SearchConfigResource&gt;**](SearchConfigResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

