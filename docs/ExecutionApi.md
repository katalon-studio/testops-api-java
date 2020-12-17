# ExecutionApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownload**](ExecutionApi.md#bulkDownload) | **GET** /api/v1/executions/download | Exports and downloads multiple Executions. Returns the archive file comprising the Execution summaries.
[**delete1**](ExecutionApi.md#delete1) | **DELETE** /api/v1/executions | Deletes multiple Executions. Returns the deleted Execution details.
[**download1**](ExecutionApi.md#download1) | **GET** /api/v1/executions/{id}/download | Exports and downloads an Execution. Returns the Execution summary file.
[**downloadFile**](ExecutionApi.md#downloadFile) | **GET** /api/v1/executions/{id}/download-file | Downloads all uploaded files of an Execution. Returns the archive file comprising all Execution&#x27;s files.
[**get1**](ExecutionApi.md#get1) | **GET** /api/v1/executions/{id} | Returns an Execution detail.
[**getLatestExecutions**](ExecutionApi.md#getLatestExecutions) | **GET** /api/v1/organizations/{id}/latest-executions | 
[**linkRelease**](ExecutionApi.md#linkRelease) | **POST** /api/v1/executions/{id}/link-release | Link an Execution to a Release. Returns the updated Execution detail.
[**list**](ExecutionApi.md#list) | **GET** /api/v1/executions | 
[**reImportExecution**](ExecutionApi.md#reImportExecution) | **POST** /api/v1/executions/reimport | Re-imports an Execution. Returns the newly imported Execution detail.
[**terminatedExecution**](ExecutionApi.md#terminatedExecution) | **POST** /api/v1/executions/terminate | Terminates a running Execution. Returns the terminated Execution detail.
[**unlinkRelease**](ExecutionApi.md#unlinkRelease) | **POST** /api/v1/executions/{id}/unlink-release | Unlink an Execution to a Release. Returns the updated Execution detail.

<a name="bulkDownload"></a>
# **bulkDownload**
> bulkDownload(id, projectId, fileType)

Exports and downloads multiple Executions. Returns the archive file comprising the Execution summaries.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
List<Long> id = Arrays.asList(56L); // List<Long> | 
Long projectId = 789L; // Long | 
String fileType = "csv"; // String | 
try {
    apiInstance.bulkDownload(id, projectId, fileType);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#bulkDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)|  |
 **projectId** | **Long**|  |
 **fileType** | **String**|  | [optional] [default to csv]

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete1"></a>
# **delete1**
> List&lt;ExecutionResource&gt; delete1(projectId, order)

Deletes multiple Executions. Returns the deleted Execution details.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long projectId = 789L; // Long | 
List<Long> order = Arrays.asList(56L); // List<Long> | 
try {
    List<ExecutionResource> result = apiInstance.delete1(projectId, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#delete1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**|  |
 **order** | [**List&lt;Long&gt;**](Long.md)|  |

### Return type

[**List&lt;ExecutionResource&gt;**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="download1"></a>
# **download1**
> download1(id, fileType)

Exports and downloads an Execution. Returns the Execution summary file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
String fileType = "csv"; // String | 
try {
    apiInstance.download1(id, fileType);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#download1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **fileType** | **String**|  | [optional] [default to csv]

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(id)

Downloads all uploaded files of an Execution. Returns the archive file comprising all Execution&#x27;s files.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
try {
    apiInstance.downloadFile(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get1"></a>
# **get1**
> ExecutionResource get1(id)

Returns an Execution detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
try {
    ExecutionResource result = apiInstance.get1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#get1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestExecutions"></a>
# **getLatestExecutions**
> PageExecutionResource getLatestExecutions(id, pageable)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageExecutionResource result = apiInstance.getLatestExecutions(id, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#getLatestExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageExecutionResource**](PageExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="linkRelease"></a>
# **linkRelease**
> ExecutionResource linkRelease(id, projectId, releaseId)

Link an Execution to a Release. Returns the updated Execution detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
Long projectId = 789L; // Long | 
Long releaseId = 789L; // Long | 
try {
    ExecutionResource result = apiInstance.linkRelease(id, projectId, releaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#linkRelease");
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

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="list"></a>
# **list**
> Object list(pageable, batch, projectId, order)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Pageable pageable = new Pageable(); // Pageable | 
String batch = "batch_example"; // String | 
Long projectId = 789L; // Long | 
Long order = 789L; // Long | 
try {
    Object result = apiInstance.list(pageable, batch, projectId, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **batch** | **String**|  | [optional]
 **projectId** | **Long**|  | [optional]
 **order** | **Long**|  | [optional]

### Return type

**Object**

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reImportExecution"></a>
# **reImportExecution**
> ExecutionResource reImportExecution(id)

Re-imports an Execution. Returns the newly imported Execution detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
try {
    ExecutionResource result = apiInstance.reImportExecution(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#reImportExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="terminatedExecution"></a>
# **terminatedExecution**
> ExecutionResource terminatedExecution(projectId, order)

Terminates a running Execution. Returns the terminated Execution detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long projectId = 789L; // Long | 
Long order = 789L; // Long | 
try {
    ExecutionResource result = apiInstance.terminatedExecution(projectId, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#terminatedExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**|  |
 **order** | **Long**|  |

### Return type

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="unlinkRelease"></a>
# **unlinkRelease**
> ExecutionResource unlinkRelease(id)

Unlink an Execution to a Release. Returns the updated Execution detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ExecutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ExecutionApi apiInstance = new ExecutionApi();
Long id = 789L; // Long | 
try {
    ExecutionResource result = apiInstance.unlinkRelease(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionApi#unlinkRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ExecutionResource**](ExecutionResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

