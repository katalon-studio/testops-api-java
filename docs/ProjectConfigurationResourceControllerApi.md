# ProjectConfigurationResourceControllerApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get14**](ProjectConfigurationResourceControllerApi.md#get14) | **GET** /api/v1/project-configurations/{id} | 
[**listTimeZones**](ProjectConfigurationResourceControllerApi.md#listTimeZones) | **GET** /api/v1/time-zones | 
[**update8**](ProjectConfigurationResourceControllerApi.md#update8) | **POST** /api/v1/project-configurations/{id} | 

<a name="get14"></a>
# **get14**
> ProjectConfigurationResource get14(id, name)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectConfigurationResourceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectConfigurationResourceControllerApi apiInstance = new ProjectConfigurationResourceControllerApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
try {
    ProjectConfigurationResource result = apiInstance.get14(id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectConfigurationResourceControllerApi#get14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  | [enum: TIMEZONE, ASSERTION_PATTERN]

### Return type

[**ProjectConfigurationResource**](ProjectConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listTimeZones"></a>
# **listTimeZones**
> List&lt;TimeZoneResource&gt; listTimeZones()



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectConfigurationResourceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectConfigurationResourceControllerApi apiInstance = new ProjectConfigurationResourceControllerApi();
try {
    List<TimeZoneResource> result = apiInstance.listTimeZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectConfigurationResourceControllerApi#listTimeZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TimeZoneResource&gt;**](TimeZoneResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update8"></a>
# **update8**
> ProjectConfigurationResource update8(body, id)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectConfigurationResourceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectConfigurationResourceControllerApi apiInstance = new ProjectConfigurationResourceControllerApi();
ProjectConfigurationResource body = new ProjectConfigurationResource(); // ProjectConfigurationResource | 
Long id = 789L; // Long | 
try {
    ProjectConfigurationResource result = apiInstance.update8(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectConfigurationResourceControllerApi#update8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectConfigurationResource**](ProjectConfigurationResource.md)|  |
 **id** | **Long**|  |

### Return type

[**ProjectConfigurationResource**](ProjectConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

