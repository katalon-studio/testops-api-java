# TestProjectApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create6**](TestProjectApi.md#create6) | **POST** /api/v1/test-projects/{id}/schedulers | Creates a new schedule for a Test Plan. Returns the created schedule detail.
[**createGitRepo**](TestProjectApi.md#createGitRepo) | **POST** /api/v1/git/create | Creates a Git Test Project. Returns the Git Test Project detail.
[**createSample**](TestProjectApi.md#createSample) | **POST** /api/v1/test-projects/sample | Creates a new sample Test Project. Returns the created Test Project.
[**delete6**](TestProjectApi.md#delete6) | **DELETE** /api/v1/test-projects/{id} | Deletes a Test Project. Returns the deleted Test Project.
[**delete7**](TestProjectApi.md#delete7) | **DELETE** /api/v1/test-projects/{id}/schedulers/{schedulerId} | Deletes a schedule. Returns the deleted schedule detail.
[**download4**](TestProjectApi.md#download4) | **GET** /api/v1/test-projects/{id}/download | Downloads a Test Project package. Returns the latest Test Project package file.
[**get17**](TestProjectApi.md#get17) | **GET** /api/v1/test-projects/{id} | Returns a Test Project detail.
[**getScheduler**](TestProjectApi.md#getScheduler) | **GET** /api/v1/test-projects/{id}/schedulers/{schedulerId} | Returns a schedule detail.
[**getTestProjectGit**](TestProjectApi.md#getTestProjectGit) | **GET** /api/v1/git/{testProjectGitId} | Returns a Git Test Project detail.
[**refreshTSC**](TestProjectApi.md#refreshTSC) | **POST** /api/v1/test-projects/{id}/refresh-tsc | Refresh Test Suite Collection list of Git Test Project
[**run**](TestProjectApi.md#run) | **PUT** /api/v1/run-configurations/{id}/execute | Executes a Test Plan. Returns the build information.
[**update10**](TestProjectApi.md#update10) | **PUT** /api/v1/test-projects/{id} | Updates a Test Project detail. Returns the updated Test Project detail.
[**update9**](TestProjectApi.md#update9) | **PUT** /api/v1/test-projects/{id}/schedulers/{schedulerId} | Updates a schedule detail. Returns the updated schedule detail.
[**updateGitRepo**](TestProjectApi.md#updateGitRepo) | **POST** /api/v1/git/update | Updates a Git Test Project detail. Returns the updated Git Test Project detail.
[**updatePackage**](TestProjectApi.md#updatePackage) | **POST** /api/v1/test-projects/{id}/update-package | Update a Test Project package. Returns the updated Test Project detail.
[**upload1**](TestProjectApi.md#upload1) | **POST** /api/v1/test-projects/upload | Creates a new Test Project. Returns the created Test Project.

<a name="create6"></a>
# **create6**
> SchedulerResource create6(body, id)

Creates a new schedule for a Test Plan. Returns the created schedule detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
SchedulerResource body = new SchedulerResource(); // SchedulerResource | 
Long id = 789L; // Long | 
try {
    SchedulerResource result = apiInstance.create6(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#create6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchedulerResource**](SchedulerResource.md)|  |
 **id** | **Long**|  |

### Return type

[**SchedulerResource**](SchedulerResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createGitRepo"></a>
# **createGitRepo**
> GitRepositoryResource createGitRepo(body)

Creates a Git Test Project. Returns the Git Test Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
GitRepositoryResource body = new GitRepositoryResource(); // GitRepositoryResource | 
try {
    GitRepositoryResource result = apiInstance.createGitRepo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#createGitRepo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitRepositoryResource**](GitRepositoryResource.md)|  |

### Return type

[**GitRepositoryResource**](GitRepositoryResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSample"></a>
# **createSample**
> TestProjectResource createSample(name, type, projectId)

Creates a new sample Test Project. Returns the created Test Project.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
String name = "name_example"; // String | 
String type = "type_example"; // String | 
Long projectId = 789L; // Long | 
try {
    TestProjectResource result = apiInstance.createSample(name, type, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#createSample");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **type** | **String**|  | [enum: KS, GIT]
 **projectId** | **Long**|  |

### Return type

[**TestProjectResource**](TestProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="delete6"></a>
# **delete6**
> TestProjectResource delete6(id)

Deletes a Test Project. Returns the deleted Test Project.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
try {
    TestProjectResource result = apiInstance.delete6(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#delete6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TestProjectResource**](TestProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="delete7"></a>
# **delete7**
> SchedulerResource delete7(id, schedulerId)

Deletes a schedule. Returns the deleted schedule detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
Long schedulerId = 789L; // Long | 
try {
    SchedulerResource result = apiInstance.delete7(id, schedulerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#delete7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **schedulerId** | **Long**|  |

### Return type

[**SchedulerResource**](SchedulerResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="download4"></a>
# **download4**
> download4(id)

Downloads a Test Project package. Returns the latest Test Project package file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
try {
    apiInstance.download4(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#download4");
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

<a name="get17"></a>
# **get17**
> TestProjectResource get17(id)

Returns a Test Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
try {
    TestProjectResource result = apiInstance.get17(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#get17");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TestProjectResource**](TestProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getScheduler"></a>
# **getScheduler**
> SchedulerResource getScheduler(id, schedulerId)

Returns a schedule detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
Long schedulerId = 789L; // Long | 
try {
    SchedulerResource result = apiInstance.getScheduler(id, schedulerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#getScheduler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **schedulerId** | **Long**|  |

### Return type

[**SchedulerResource**](SchedulerResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTestProjectGit"></a>
# **getTestProjectGit**
> GitRepositoryResource getTestProjectGit(testProjectGitId)

Returns a Git Test Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long testProjectGitId = 789L; // Long | 
try {
    GitRepositoryResource result = apiInstance.getTestProjectGit(testProjectGitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#getTestProjectGit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testProjectGitId** | **Long**|  |

### Return type

[**GitRepositoryResource**](GitRepositoryResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="refreshTSC"></a>
# **refreshTSC**
> refreshTSC(id)

Refresh Test Suite Collection list of Git Test Project

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
try {
    apiInstance.refreshTSC(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#refreshTSC");
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

<a name="run"></a>
# **run**
> List&lt;BuildInfo&gt; run(id)

Executes a Test Plan. Returns the build information.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
try {
    List<BuildInfo> result = apiInstance.run(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#run");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;BuildInfo&gt;**](BuildInfo.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update10"></a>
# **update10**
> TestProjectResource update10(body, id)

Updates a Test Project detail. Returns the updated Test Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
TestProjectResource body = new TestProjectResource(); // TestProjectResource | 
Long id = 789L; // Long | 
try {
    TestProjectResource result = apiInstance.update10(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#update10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestProjectResource**](TestProjectResource.md)|  |
 **id** | **Long**|  |

### Return type

[**TestProjectResource**](TestProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="update9"></a>
# **update9**
> SchedulerResource update9(body, id, schedulerId)

Updates a schedule detail. Returns the updated schedule detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
SchedulerResource body = new SchedulerResource(); // SchedulerResource | 
Long id = 789L; // Long | 
Long schedulerId = 789L; // Long | 
try {
    SchedulerResource result = apiInstance.update9(body, id, schedulerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#update9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchedulerResource**](SchedulerResource.md)|  |
 **id** | **Long**|  |
 **schedulerId** | **Long**|  |

### Return type

[**SchedulerResource**](SchedulerResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateGitRepo"></a>
# **updateGitRepo**
> GitRepositoryResource updateGitRepo(body)

Updates a Git Test Project detail. Returns the updated Git Test Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
GitRepositoryResource body = new GitRepositoryResource(); // GitRepositoryResource | 
try {
    GitRepositoryResource result = apiInstance.updateGitRepo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#updateGitRepo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitRepositoryResource**](GitRepositoryResource.md)|  |

### Return type

[**GitRepositoryResource**](GitRepositoryResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePackage"></a>
# **updatePackage**
> TestProjectResource updatePackage(id, batch, folderPath, fileName, uploadedPath)

Update a Test Project package. Returns the updated Test Project detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
Long id = 789L; // Long | 
String batch = "batch_example"; // String | 
String folderPath = "folderPath_example"; // String | 
String fileName = "fileName_example"; // String | 
String uploadedPath = "uploadedPath_example"; // String | 
try {
    TestProjectResource result = apiInstance.updatePackage(id, batch, folderPath, fileName, uploadedPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#updatePackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **batch** | **String**|  |
 **folderPath** | **String**|  |
 **fileName** | **String**|  |
 **uploadedPath** | **String**|  |

### Return type

[**TestProjectResource**](TestProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="upload1"></a>
# **upload1**
> TestProjectResource upload1(name, projectId, batch, folderPath, fileName, uploadedPath, description)

Creates a new Test Project. Returns the created Test Project.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TestProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TestProjectApi apiInstance = new TestProjectApi();
String name = "name_example"; // String | 
String projectId = "projectId_example"; // String | 
String batch = "batch_example"; // String | 
String folderPath = "folderPath_example"; // String | 
String fileName = "fileName_example"; // String | 
String uploadedPath = "uploadedPath_example"; // String | 
String description = "description_example"; // String | 
try {
    TestProjectResource result = apiInstance.upload1(name, projectId, batch, folderPath, fileName, uploadedPath, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestProjectApi#upload1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **projectId** | **String**|  |
 **batch** | **String**|  |
 **folderPath** | **String**|  |
 **fileName** | **String**|  |
 **uploadedPath** | **String**|  |
 **description** | **String**|  | [optional]

### Return type

[**TestProjectResource**](TestProjectResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

