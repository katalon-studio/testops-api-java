# ReleaseApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activeRelease**](ReleaseApi.md#activeRelease) | **POST** /api/v1/releases/{id}/active | Open or close a Release. Returns the updated Release detail.
[**createOrUpdate1**](ReleaseApi.md#createOrUpdate1) | **POST** /api/v1/releases | Creates or updates a Release. Returns the Release details.
[**delete3**](ReleaseApi.md#delete3) | **DELETE** /api/v1/releases/{id} | Deletes a Release. Returns the Release details.
[**update3**](ReleaseApi.md#update3) | **PUT** /api/v1/releases | Updates a Release. Returns the Release details.

<a name="activeRelease"></a>
# **activeRelease**
> ReleaseResource activeRelease(id, closed)

Open or close a Release. Returns the updated Release detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ReleaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ReleaseApi apiInstance = new ReleaseApi();
Long id = 789L; // Long | 
Boolean closed = true; // Boolean | 
try {
    ReleaseResource result = apiInstance.activeRelease(id, closed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleaseApi#activeRelease");
    e.printStackTrace();
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

<a name="createOrUpdate1"></a>
# **createOrUpdate1**
> ReleaseResource createOrUpdate1(body)

Creates or updates a Release. Returns the Release details.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ReleaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ReleaseApi apiInstance = new ReleaseApi();
ReleaseResource body = new ReleaseResource(); // ReleaseResource | 
try {
    ReleaseResource result = apiInstance.createOrUpdate1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleaseApi#createOrUpdate1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReleaseResource**](ReleaseResource.md)|  |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete3"></a>
# **delete3**
> ReleaseResource delete3(id)

Deletes a Release. Returns the Release details.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ReleaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ReleaseApi apiInstance = new ReleaseApi();
Long id = 789L; // Long | 
try {
    ReleaseResource result = apiInstance.delete3(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleaseApi#delete3");
    e.printStackTrace();
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

<a name="update3"></a>
# **update3**
> ReleaseResource update3(body)

Updates a Release. Returns the Release details.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ReleaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ReleaseApi apiInstance = new ReleaseApi();
ReleaseResource body = new ReleaseResource(); // ReleaseResource | 
try {
    ReleaseResource result = apiInstance.update3(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleaseApi#update3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReleaseResource**](ReleaseResource.md)|  |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

