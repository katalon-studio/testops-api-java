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



## create

> AgentResource create(agentResource)

Creates or updates a Local agent. Returns the agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        AgentResource agentResource = new AgentResource(); // AgentResource | 
        try {
            AgentResource result = apiInstance.create(agentResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#create");
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
 **agentResource** | [**AgentResource**](AgentResource.md)|  |

### Return type

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## create4

> CircleCIAgentResource create4(circleCIAgentResource)

Creates a new CircleCI agent. Returns the created agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        CircleCIAgentResource circleCIAgentResource = new CircleCIAgentResource(); // CircleCIAgentResource | 
        try {
            CircleCIAgentResource result = apiInstance.create4(circleCIAgentResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#create4");
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
 **circleCIAgentResource** | [**CircleCIAgentResource**](CircleCIAgentResource.md)|  |

### Return type

[**CircleCIAgentResource**](CircleCIAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## create5

> K8SAgentResource create5(k8SAgentResource)

Creates a K8S agent. Returns the created agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        K8SAgentResource k8SAgentResource = new K8SAgentResource(); // K8SAgentResource | 
        try {
            K8SAgentResource result = apiInstance.create5(k8SAgentResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#create5");
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
 **k8SAgentResource** | [**K8SAgentResource**](K8SAgentResource.md)|  |

### Return type

[**K8SAgentResource**](K8SAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete

> AgentResource delete(id)

Deletes a Local agent. Returns the deleted agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            AgentResource result = apiInstance.delete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#delete");
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

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## generateAgent

> generateAgent(agentConfigResource)

Generates the configuration file for the Local agent. Returns the configuration file.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        AgentConfigResource agentConfigResource = new AgentConfigResource(); // AgentConfigResource | 
        try {
            apiInstance.generateAgent(agentConfigResource);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#generateAgent");
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
 **agentConfigResource** | [**AgentConfigResource**](.md)|  |

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


## get

> AgentResource get(id)

Get a Local agent. Returns the agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            AgentResource result = apiInstance.get(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#get");
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

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## get11

> CircleCIAgentResource get11(id)

Returns a CircleCI agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            CircleCIAgentResource result = apiInstance.get11(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#get11");
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

[**CircleCIAgentResource**](CircleCIAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## get13

> K8SAgentResource get13(id)

Returns a K8S agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            K8SAgentResource result = apiInstance.get13(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#get13");
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

[**K8SAgentResource**](K8SAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getFollowedProjects

> List&lt;CircleCIProject&gt; getFollowedProjects(circleCIConnectionResource)



### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        CircleCIConnectionResource circleCIConnectionResource = new CircleCIConnectionResource(); // CircleCIConnectionResource | 
        try {
            List<CircleCIProject> result = apiInstance.getFollowedProjects(circleCIConnectionResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#getFollowedProjects");
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
 **circleCIConnectionResource** | [**CircleCIConnectionResource**](CircleCIConnectionResource.md)|  |

### Return type

[**List&lt;CircleCIProject&gt;**](CircleCIProject.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update6

> CircleCIAgentResource update6(circleCIAgentResource)

Updates a CircleCI agent detail. Returns the updated agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        CircleCIAgentResource circleCIAgentResource = new CircleCIAgentResource(); // CircleCIAgentResource | 
        try {
            CircleCIAgentResource result = apiInstance.update6(circleCIAgentResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#update6");
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
 **circleCIAgentResource** | [**CircleCIAgentResource**](CircleCIAgentResource.md)|  |

### Return type

[**CircleCIAgentResource**](CircleCIAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update7

> K8SAgentResource update7(k8SAgentResource)

Updates a K8S agent detail. Returns the updated agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        K8SAgentResource k8SAgentResource = new K8SAgentResource(); // K8SAgentResource | 
        try {
            K8SAgentResource result = apiInstance.update7(k8SAgentResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#update7");
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
 **k8SAgentResource** | [**K8SAgentResource**](K8SAgentResource.md)|  |

### Return type

[**K8SAgentResource**](K8SAgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateThreshold

> AgentResource updateThreshold(agentResource)

Updates the threshold for Local agent. Returns the agent detail.

### Example

```java
// Import classes:
import com.katalon.testops.api.ApiClient;
import com.katalon.testops.api.ApiException;
import com.katalon.testops.api.Configuration;
import com.katalon.testops.api.auth.*;
import com.katalon.testops.api.models.*;
import com.katalon.testops.api.api.AgentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8443");
        
        // Configure HTTP basic authorization: basicScheme
        HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
        basicScheme.setUsername("YOUR USERNAME");
        basicScheme.setPassword("YOUR PASSWORD");

        AgentApi apiInstance = new AgentApi(defaultClient);
        AgentResource agentResource = new AgentResource(); // AgentResource | 
        try {
            AgentResource result = apiInstance.updateThreshold(agentResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentApi#updateThreshold");
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
 **agentResource** | [**AgentResource**](AgentResource.md)|  |

### Return type

[**AgentResource**](AgentResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

