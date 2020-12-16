# TaskApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIncident**](TaskApi.md#createIncident) | **POST** /api/v1/incidents | Creates a Task for the test results. Returns the created Task detail.
[**get4**](TaskApi.md#get4) | **GET** /api/v1/incidents/{id} | Returns a Task detail.
[**update1**](TaskApi.md#update1) | **PUT** /api/v1/incidents | Updates a Task detail. Returns the updated Task detail.

<a name="createIncident"></a>
# **createIncident**
> IncidentResource createIncident(body)

Creates a Task for the test results. Returns the created Task detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TaskApi apiInstance = new TaskApi();
IncidentResource body = new IncidentResource(); // IncidentResource | 
try {
    IncidentResource result = apiInstance.createIncident(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#createIncident");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IncidentResource**](IncidentResource.md)|  |

### Return type

[**IncidentResource**](IncidentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="get4"></a>
# **get4**
> IncidentResource get4(id)

Returns a Task detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TaskApi apiInstance = new TaskApi();
Long id = 789L; // Long | 
try {
    IncidentResource result = apiInstance.get4(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#get4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**IncidentResource**](IncidentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update1"></a>
# **update1**
> IncidentResource update1(body)

Updates a Task detail. Returns the updated Task detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TaskApi apiInstance = new TaskApi();
IncidentResource body = new IncidentResource(); // IncidentResource | 
try {
    IncidentResource result = apiInstance.update1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#update1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IncidentResource**](IncidentResource.md)|  |

### Return type

[**IncidentResource**](IncidentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

