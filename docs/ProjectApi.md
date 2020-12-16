# ProjectApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create2**](ProjectApi.md#create2) | **POST** /api/v1/projects | Creates a new Project. Returns the created Project detail.
[**createOrUpdate**](ProjectApi.md#createOrUpdate) | **POST** /api/v1/project-settings | 
[**createSampleData**](ProjectApi.md#createSampleData) | **POST** /api/v1/projects/{id}/sample-data | Create sample data for project.
[**delete2**](ProjectApi.md#delete2) | **DELETE** /api/v1/projects/{id} | Deletes a Project. Returns the deleted Project detail.
[**get5**](ProjectApi.md#get5) | **GET** /api/v1/projects/{id} | Returns a Project detail.
[**get6**](ProjectApi.md#get6) | **GET** /api/v1/project-settings/{id} | 
[**list1**](ProjectApi.md#list1) | **GET** /api/v1/projects | Returns all Projects of a Team.
[**update2**](ProjectApi.md#update2) | **PUT** /api/v1/projects | Updates a Project detail. Returns the updated Project detail.

<a name="create2"></a>
# **create2**
> ProjectResource create2(body)

Creates a new Project. Returns the created Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
ProjectResource body = new ProjectResource(); // ProjectResource | 
try {
    ProjectResource result = apiInstance.create2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#create2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectResource**](ProjectResource.md)|  |

### Return type

[**ProjectResource**](ProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrUpdate"></a>
# **createOrUpdate**
> ProjectSettingResource createOrUpdate(body)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
ProjectSettingResource body = new ProjectSettingResource(); // ProjectSettingResource | 
try {
    ProjectSettingResource result = apiInstance.createOrUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createOrUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectSettingResource**](ProjectSettingResource.md)|  |

### Return type

[**ProjectSettingResource**](ProjectSettingResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSampleData"></a>
# **createSampleData**
> createSampleData(id)

Create sample data for project.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | 
try {
    apiInstance.createSampleData(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createSampleData");
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

<a name="delete2"></a>
# **delete2**
> ProjectResource delete2(id)

Deletes a Project. Returns the deleted Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | 
try {
    ProjectResource result = apiInstance.delete2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#delete2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ProjectResource**](ProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get5"></a>
# **get5**
> ProjectResource get5(id)

Returns a Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | 
try {
    ProjectResource result = apiInstance.get5(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#get5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ProjectResource**](ProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get6"></a>
# **get6**
> ProjectSettingResource get6(id)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
Long id = 789L; // Long | 
try {
    ProjectSettingResource result = apiInstance.get6(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#get6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ProjectSettingResource**](ProjectSettingResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="list1"></a>
# **list1**
> PageProjectResource list1(pageable, teamId)

Returns all Projects of a Team.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
Pageable pageable = new Pageable(); // Pageable | 
Long teamId = 789L; // Long | 
try {
    PageProjectResource result = apiInstance.list1(pageable, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#list1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **teamId** | **Long**|  | [optional]

### Return type

[**PageProjectResource**](PageProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update2"></a>
# **update2**
> ProjectResource update2(body)

Updates a Project detail. Returns the updated Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

ProjectApi apiInstance = new ProjectApi();
ProjectResource body = new ProjectResource(); // ProjectResource | 
try {
    ProjectResource result = apiInstance.update2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#update2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectResource**](ProjectResource.md)|  |

### Return type

[**ProjectResource**](ProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

