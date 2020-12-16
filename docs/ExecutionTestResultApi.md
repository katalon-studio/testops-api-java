# ExecutionTestResultApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get2**](ExecutionTestResultApi.md#get2) | **GET** /api/v1/test-results/{id} | Returns an Execution Test Result detail.
[**getStdout**](ExecutionTestResultApi.md#getStdout) | **GET** /api/v1/test-results/logs/{id} | Downloads a test result&#x27;s log. Returns the log file.
[**linkIncidents**](ExecutionTestResultApi.md#linkIncidents) | **POST** /api/v1/test-results/{id}/incidents | Link an Execution Test Result to a Task. Returns the created binding detail.
[**markAsRetested**](ExecutionTestResultApi.md#markAsRetested) | **POST** /api/v1/test-results/{id}/mask-as-retested | 
[**unlinkIncidents**](ExecutionTestResultApi.md#unlinkIncidents) | **DELETE** /api/v1/test-results/{id}/incidents | Unlink an Execution Test Result to a Task. Returns the deleted binding detail.

<a name="get2"></a>
# **get2**
> ExecutionTestResultResource get2(id)

Returns an Execution Test Result detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionTestResultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionTestResultApi apiInstance = new ExecutionTestResultApi();
String id = "id_example"; // String | 
try {
    ExecutionTestResultResource result = apiInstance.get2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionTestResultApi#get2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ExecutionTestResultResource**](ExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStdout"></a>
# **getStdout**
> String getStdout(id)

Downloads a test result&#x27;s log. Returns the log file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionTestResultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionTestResultApi apiInstance = new ExecutionTestResultApi();
Long id = 789L; // Long | 
try {
    String result = apiInstance.getStdout(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionTestResultApi#getStdout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

**String**

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain;charset=UTF-8

<a name="linkIncidents"></a>
# **linkIncidents**
> IncidentExecutionTestResultResource linkIncidents(body, id)

Link an Execution Test Result to a Task. Returns the created binding detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionTestResultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionTestResultApi apiInstance = new ExecutionTestResultApi();
IncidentExecutionTestResultResource body = new IncidentExecutionTestResultResource(); // IncidentExecutionTestResultResource | 
String id = "id_example"; // String | 
try {
    IncidentExecutionTestResultResource result = apiInstance.linkIncidents(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionTestResultApi#linkIncidents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)|  |
 **id** | **String**|  |

### Return type

[**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="markAsRetested"></a>
# **markAsRetested**
> ExecutionTestResultResource markAsRetested(id)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionTestResultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionTestResultApi apiInstance = new ExecutionTestResultApi();
String id = "id_example"; // String | 
try {
    ExecutionTestResultResource result = apiInstance.markAsRetested(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionTestResultApi#markAsRetested");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ExecutionTestResultResource**](ExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="unlinkIncidents"></a>
# **unlinkIncidents**
> IncidentExecutionTestResultResource unlinkIncidents(body, id)

Unlink an Execution Test Result to a Task. Returns the deleted binding detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionTestResultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionTestResultApi apiInstance = new ExecutionTestResultApi();
IncidentExecutionTestResultResource body = new IncidentExecutionTestResultResource(); // IncidentExecutionTestResultResource | 
String id = "id_example"; // String | 
try {
    IncidentExecutionTestResultResource result = apiInstance.unlinkIncidents(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionTestResultApi#unlinkIncidents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)|  |
 **id** | **String**|  |

### Return type

[**IncidentExecutionTestResultResource**](IncidentExecutionTestResultResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

