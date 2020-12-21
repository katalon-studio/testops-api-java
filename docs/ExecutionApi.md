# ExecutionApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownload**](ExecutionApi.md#bulkDownload) | **GET** /api/v1/executions/download | Exports and downloads multiple Executions. Returns the archive file comprising the Execution summaries.
[**delete1**](ExecutionApi.md#delete1) | **DELETE** /api/v1/executions | Deletes multiple Executions. Returns the deleted Execution details.
[**download1**](ExecutionApi.md#download1) | **GET** /api/v1/executions/{id}/download | Exports and downloads an Execution. Returns the Execution summary file.
[**downloadFile**](ExecutionApi.md#downloadFile) | **GET** /api/v1/executions/{id}/download-file | Downloads all uploaded files of an Execution. Returns the archive file comprising all Execution&#39;s files.
[**get1**](ExecutionApi.md#get1) | **GET** /api/v1/executions/{id} | Returns an Execution detail.
[**getLatestExecutions**](ExecutionApi.md#getLatestExecutions) | **GET** /api/v1/organizations/{id}/latest-executions | 
[**linkRelease**](ExecutionApi.md#linkRelease) | **POST** /api/v1/executions/{id}/link-release | Link an Execution to a Release. Returns the updated Execution detail.
[**list**](ExecutionApi.md#list) | **GET** /api/v1/executions | 
[**reImportExecution**](ExecutionApi.md#reImportExecution) | **POST** /api/v1/executions/reimport | Re-imports an Execution. Returns the newly imported Execution detail.
[**terminatedExecution**](ExecutionApi.md#terminatedExecution) | **POST** /api/v1/executions/terminate | Terminates a running Execution. Returns the terminated Execution detail.
[**unlinkRelease**](ExecutionApi.md#unlinkRelease) | **POST** /api/v1/executions/{id}/unlink-release | Unlink an Execution to a Release. Returns the updated Execution detail.



## bulkDownload

> bulkDownload(id, projectId, fileType)

Exports and downloads multiple Executions. Returns the archive file comprising the Execution summaries.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        List<Long> id = Arrays.asList(); // List<Long> | 
        Long projectId = 56L; // Long | 
        String fileType = "\"csv\""; // String | 
        try {
            apiInstance.bulkDownload(id, projectId, fileType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#bulkDownload");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)|  |
 **projectId** | **Long**|  |
 **fileType** | **String**|  | [optional] [default to &quot;csv&quot;]

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete1

> List&lt;ExecutionResource&gt; delete1(projectId, order)

Deletes multiple Executions. Returns the deleted Execution details.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long projectId = 56L; // Long | 
        List<Long> order = Arrays.asList(); // List<Long> | 
        try {
            List<ExecutionResource> result = apiInstance.delete1(projectId, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#delete1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## download1

> download1(id, fileType)

Exports and downloads an Execution. Returns the Execution summary file.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        String fileType = "\"csv\""; // String | 
        try {
            apiInstance.download1(id, fileType);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#download1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **fileType** | **String**|  | [optional] [default to &quot;csv&quot;]

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## downloadFile

> downloadFile(id)

Downloads all uploaded files of an Execution. Returns the archive file comprising all Execution&#39;s files.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            apiInstance.downloadFile(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#downloadFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## get1

> ExecutionResource get1(id)

Returns an Execution detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ExecutionResource result = apiInstance.get1(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#get1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getLatestExecutions

> PageExecutionResource getLatestExecutions(id, pageable)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        Pageable pageable = new Pageable(); // Pageable | 
        try {
            PageExecutionResource result = apiInstance.getLatestExecutions(id, pageable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#getLatestExecutions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## linkRelease

> ExecutionResource linkRelease(id, projectId, releaseId)

Link an Execution to a Release. Returns the updated Execution detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        Long projectId = 56L; // Long | 
        Long releaseId = 56L; // Long | 
        try {
            ExecutionResource result = apiInstance.linkRelease(id, projectId, releaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#linkRelease");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## list

> Object list(pageable, batch, projectId, order)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Pageable pageable = new Pageable(); // Pageable | 
        String batch = "batch_example"; // String | 
        Long projectId = 56L; // Long | 
        Long order = 56L; // Long | 
        try {
            Object result = apiInstance.list(pageable, batch, projectId, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#list");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## reImportExecution

> ExecutionResource reImportExecution(id)

Re-imports an Execution. Returns the newly imported Execution detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ExecutionResource result = apiInstance.reImportExecution(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#reImportExecution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## terminatedExecution

> ExecutionResource terminatedExecution(projectId, order)

Terminates a running Execution. Returns the terminated Execution detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long projectId = 56L; // Long | 
        Long order = 56L; // Long | 
        try {
            ExecutionResource result = apiInstance.terminatedExecution(projectId, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#terminatedExecution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## unlinkRelease

> ExecutionResource unlinkRelease(id)

Unlink an Execution to a Release. Returns the updated Execution detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.ExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        ExecutionApi apiInstance = new ExecutionApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            ExecutionResource result = apiInstance.unlinkRelease(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExecutionApi#unlinkRelease");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

