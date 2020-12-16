# AgentApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AgentApi.md#create) | **POST** /api/v1/agent | Creates or updates a Local agent. Returns the agent detail.
[**create4**](AgentApi.md#create4) | **POST** /api/v1/circle-ci-agent | Creates a new CircleCI agent. Returns the created agent detail.
[**create5**](AgentApi.md#create5) | **POST** /api/v1/k8s-agent | Creates a K8S agent. Returns the created agent detail.
[**delete**](AgentApi.md#delete) | **DELETE** /api/v1/agent/{id} | Deletes a Local agent. Returns the deleted agent detail.
[**generateAgent**](AgentApi.md#generateAgent) | **GET** /api/v1/agent | Generates the configuration file for the Local agent. Returns the configuration file.
[**get**](AgentApi.md#get) | **GET** /api/v1/agent/{id} | Get a Local agent. Returns the agent detail.
[**get11**](AgentApi.md#get11) | **GET** /api/v1/circle-ci-agent/{id} | Returns a CircleCI agent detail.
[**get13**](AgentApi.md#get13) | **GET** /api/v1/k8s-agent/{id} | Returns a K8S agent detail.
[**getFollowedProjects**](AgentApi.md#getFollowedProjects) | **POST** /api/v1/circle-ci-agent/projects | 
[**update6**](AgentApi.md#update6) | **PUT** /api/v1/circle-ci-agent | Updates a CircleCI agent detail. Returns the updated agent detail.
[**update7**](AgentApi.md#update7) | **PUT** /api/v1/k8s-agent | Updates a K8S agent detail. Returns the updated agent detail.
[**updateThreshold**](AgentApi.md#updateThreshold) | **PUT** /api/v1/agent/threshold | Updates the threshold for Local agent. Returns the agent detail.

<a name="create"></a>
# **create**
> AgentResource create(body)

Creates or updates a Local agent. Returns the agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
AgentResource body = new AgentResource(); // AgentResource | 
try {
    AgentResource result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AgentResource**](AgentResource.md)|  |

### Return type

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="create4"></a>
# **create4**
> CircleCIAgentResource create4(body)

Creates a new CircleCI agent. Returns the created agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
CircleCIAgentResource body = new CircleCIAgentResource(); // CircleCIAgentResource | 
try {
    CircleCIAgentResource result = apiInstance.create4(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#create4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CircleCIAgentResource**](CircleCIAgentResource.md)|  |

### Return type

[**CircleCIAgentResource**](CircleCIAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="create5"></a>
# **create5**
> K8SAgentResource create5(body)

Creates a K8S agent. Returns the created agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
K8SAgentResource body = new K8SAgentResource(); // K8SAgentResource | 
try {
    K8SAgentResource result = apiInstance.create5(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#create5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**K8SAgentResource**](K8SAgentResource.md)|  |

### Return type

[**K8SAgentResource**](K8SAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete"></a>
# **delete**
> AgentResource delete(id)

Deletes a Local agent. Returns the deleted agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
Long id = 789L; // Long | 
try {
    AgentResource result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="generateAgent"></a>
# **generateAgent**
> generateAgent(agentConfigResource)

Generates the configuration file for the Local agent. Returns the configuration file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
AgentConfigResource agentConfigResource = new AgentConfigResource(); // AgentConfigResource | 
try {
    apiInstance.generateAgent(agentConfigResource);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#generateAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agentConfigResource** | [**AgentConfigResource**](.md)|  |

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> AgentResource get(id)

Get a Local agent. Returns the agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
Long id = 789L; // Long | 
try {
    AgentResource result = apiInstance.get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get11"></a>
# **get11**
> CircleCIAgentResource get11(id)

Returns a CircleCI agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
Long id = 789L; // Long | 
try {
    CircleCIAgentResource result = apiInstance.get11(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#get11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**CircleCIAgentResource**](CircleCIAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get13"></a>
# **get13**
> K8SAgentResource get13(id)

Returns a K8S agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
Long id = 789L; // Long | 
try {
    K8SAgentResource result = apiInstance.get13(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#get13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**K8SAgentResource**](K8SAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFollowedProjects"></a>
# **getFollowedProjects**
> List&lt;CircleCIProject&gt; getFollowedProjects(body)



### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
CircleCIConnectionResource body = new CircleCIConnectionResource(); // CircleCIConnectionResource | 
try {
    List<CircleCIProject> result = apiInstance.getFollowedProjects(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getFollowedProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CircleCIConnectionResource**](CircleCIConnectionResource.md)|  |

### Return type

[**List&lt;CircleCIProject&gt;**](CircleCIProject.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="update6"></a>
# **update6**
> CircleCIAgentResource update6(body)

Updates a CircleCI agent detail. Returns the updated agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
CircleCIAgentResource body = new CircleCIAgentResource(); // CircleCIAgentResource | 
try {
    CircleCIAgentResource result = apiInstance.update6(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#update6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CircleCIAgentResource**](CircleCIAgentResource.md)|  |

### Return type

[**CircleCIAgentResource**](CircleCIAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="update7"></a>
# **update7**
> K8SAgentResource update7(body)

Updates a K8S agent detail. Returns the updated agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
K8SAgentResource body = new K8SAgentResource(); // K8SAgentResource | 
try {
    K8SAgentResource result = apiInstance.update7(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#update7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**K8SAgentResource**](K8SAgentResource.md)|  |

### Return type

[**K8SAgentResource**](K8SAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateThreshold"></a>
# **updateThreshold**
> AgentResource updateThreshold(body)

Updates the threshold for Local agent. Returns the agent detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.AgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

AgentApi apiInstance = new AgentApi();
AgentResource body = new AgentResource(); // AgentResource | 
try {
    AgentResource result = apiInstance.updateThreshold(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#updateThreshold");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AgentResource**](AgentResource.md)|  |

### Return type

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

