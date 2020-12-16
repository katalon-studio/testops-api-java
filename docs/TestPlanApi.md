# TestPlanApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAndTriggerSample**](TestPlanApi.md#createAndTriggerSample) | **POST** /api/v1/run-configurations/sample | Creates and triggers a sample Test Plan. Returns the created Test Plan detail.
[**createOrUpdateConfiguration**](TestPlanApi.md#createOrUpdateConfiguration) | **POST** /api/v1/run-configurations | Creates or updates a Test Plan. Returns the Test Plan detail.
[**delete5**](TestPlanApi.md#delete5) | **DELETE** /api/v1/run-configurations/{id} | Deletes a Test Plan. Returns the deleted Test Plan detail.
[**linkRelease1**](TestPlanApi.md#linkRelease1) | **POST** /api/v1/run-configurations/{id}/link-release | Link an Run Configuration to a Release. Returns the updated Run Configuration detail.
[**unlinkRelease1**](TestPlanApi.md#unlinkRelease1) | **POST** /api/v1/run-configurations/{id}/unlink-release | Unlink an Run Configuration to a Release. Returns the updated Run Configuration detail.

<a name="createAndTriggerSample"></a>
# **createAndTriggerSample**
> RunConfigurationResource createAndTriggerSample(body)

Creates and triggers a sample Test Plan. Returns the created Test Plan detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestPlanApi apiInstance = new TestPlanApi();
RunConfigurationResource body = new RunConfigurationResource(); // RunConfigurationResource | 
try {
    RunConfigurationResource result = apiInstance.createAndTriggerSample(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlanApi#createAndTriggerSample");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunConfigurationResource**](RunConfigurationResource.md)|  |

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrUpdateConfiguration"></a>
# **createOrUpdateConfiguration**
> RunConfigurationResource createOrUpdateConfiguration(body, verifyRunConfiguration)

Creates or updates a Test Plan. Returns the Test Plan detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestPlanApi apiInstance = new TestPlanApi();
RunConfigurationResource body = new RunConfigurationResource(); // RunConfigurationResource | 
Boolean verifyRunConfiguration = false; // Boolean | 
try {
    RunConfigurationResource result = apiInstance.createOrUpdateConfiguration(body, verifyRunConfiguration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlanApi#createOrUpdateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunConfigurationResource**](RunConfigurationResource.md)|  |
 **verifyRunConfiguration** | **Boolean**|  | [optional] [default to false]

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete5"></a>
# **delete5**
> RunConfigurationResource delete5(id)

Deletes a Test Plan. Returns the deleted Test Plan detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestPlanApi apiInstance = new TestPlanApi();
Long id = 789L; // Long | 
try {
    RunConfigurationResource result = apiInstance.delete5(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlanApi#delete5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="linkRelease1"></a>
# **linkRelease1**
> RunConfigurationResource linkRelease1(id, projectId, releaseId)

Link an Run Configuration to a Release. Returns the updated Run Configuration detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestPlanApi apiInstance = new TestPlanApi();
Long id = 789L; // Long | 
Long projectId = 789L; // Long | 
Long releaseId = 789L; // Long | 
try {
    RunConfigurationResource result = apiInstance.linkRelease1(id, projectId, releaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlanApi#linkRelease1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **projectId** | **Long**|  |
 **releaseId** | **Long**|  |

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="unlinkRelease1"></a>
# **unlinkRelease1**
> RunConfigurationResource unlinkRelease1(id)

Unlink an Run Configuration to a Release. Returns the updated Run Configuration detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestPlanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestPlanApi apiInstance = new TestPlanApi();
Long id = 789L; // Long | 
try {
    RunConfigurationResource result = apiInstance.unlinkRelease1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlanApi#unlinkRelease1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**RunConfigurationResource**](RunConfigurationResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

