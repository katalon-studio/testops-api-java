# JobApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](JobApi.md#cancel) | **DELETE** /api/v1/jobs/{id} | Cancels a Job.
[**get12**](JobApi.md#get12) | **GET** /api/v1/jobs/{id} | Returns a Job detail.
[**getJob**](JobApi.md#getJob) | **GET** /api/v1/jobs/get-job | Returns the next queued Job of an Agent.
[**getLatestJobs**](JobApi.md#getLatestJobs) | **GET** /api/v1/organizations/{id}/latest-jobs | 
[**getLog**](JobApi.md#getLog) | **GET** /api/v1/jobs/{id}/get-log | Returns a Job&#x27;s log.
[**getRunningJobs**](JobApi.md#getRunningJobs) | **GET** /api/v1/organizations/{id}/running-jobs | 
[**updateJob**](JobApi.md#updateJob) | **POST** /api/v1/jobs/update-job | Updates a Job detail. Returns the updated Job detail.

<a name="cancel"></a>
# **cancel**
> cancel(id)

Cancels a Job.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | 
try {
    apiInstance.cancel(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#cancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get12"></a>
# **get12**
> JobResource get12(id)

Returns a Job detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Long id = 789L; // Long | 
try {
    JobResource result = apiInstance.get12(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#get12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JobResource**](JobResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getJob"></a>
# **getJob**
> JobResource getJob(uuid, teamId)

Returns the next queued Job of an Agent.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String uuid = "uuid_example"; // String | 
Long teamId = 789L; // Long | 
try {
    JobResource result = apiInstance.getJob(uuid, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |
 **teamId** | **Long**|  |

### Return type

[**JobResource**](JobResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestJobs"></a>
# **getLatestJobs**
> PageJobResource getLatestJobs(id, pageable)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Long id = 789L; // Long | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageJobResource result = apiInstance.getLatestJobs(id, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getLatestJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageJobResource**](PageJobResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLog"></a>
# **getLog**
> List&lt;BuildLog&gt; getLog(id)

Returns a Job&#x27;s log.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String id = "id_example"; // String | 
try {
    List<BuildLog> result = apiInstance.getLog(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;BuildLog&gt;**](BuildLog.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRunningJobs"></a>
# **getRunningJobs**
> PageJobResource getRunningJobs(id, pageable)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Long id = 789L; // Long | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageJobResource result = apiInstance.getRunningJobs(id, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getRunningJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageJobResource**](PageJobResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateJob"></a>
# **updateJob**
> JobResource updateJob(body)

Updates a Job detail. Returns the updated Job detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
JobResource body = new JobResource(); // JobResource | 
try {
    JobResource result = apiInstance.updateJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobResource**](JobResource.md)|  |

### Return type

[**JobResource**](JobResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

