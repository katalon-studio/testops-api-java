# TeamApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create3**](TeamApi.md#create3) | **POST** /api/v1/teams | Creates a new Team. Returns the created Team detail.
[**delete4**](TeamApi.md#delete4) | **DELETE** /api/v1/teams/{id} | Delete a Team. Returns the delete Team detail.
[**get7**](TeamApi.md#get7) | **GET** /api/v1/teams/{id} | Returns a Team detail.
[**list2**](TeamApi.md#list2) | **GET** /api/v1/teams | Returns all Teams of the current User.
[**update4**](TeamApi.md#update4) | **PUT** /api/v1/teams | Updates a Team detail. Returns the updated Team detail.
[**updateUserTeam**](TeamApi.md#updateUserTeam) | **PUT** /api/v1/permission/team/user | Updates the role of a User in a Team. Returns the updated detail.

<a name="create3"></a>
# **create3**
> TeamResource create3(body)

Creates a new Team. Returns the created Team detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TeamApi apiInstance = new TeamApi();
TeamResource body = new TeamResource(); // TeamResource | 
try {
    TeamResource result = apiInstance.create3(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#create3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TeamResource**](TeamResource.md)|  |

### Return type

[**TeamResource**](TeamResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete4"></a>
# **delete4**
> TeamResource delete4(id)

Delete a Team. Returns the delete Team detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | 
try {
    TeamResource result = apiInstance.delete4(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#delete4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TeamResource**](TeamResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get7"></a>
# **get7**
> TeamResource get7(id)

Returns a Team detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TeamApi apiInstance = new TeamApi();
Long id = 789L; // Long | 
try {
    TeamResource result = apiInstance.get7(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#get7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TeamResource**](TeamResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="list2"></a>
# **list2**
> PageTeamResource list2(pageable)

Returns all Teams of the current User.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TeamApi apiInstance = new TeamApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageTeamResource result = apiInstance.list2(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#list2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageTeamResource**](PageTeamResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="update4"></a>
# **update4**
> TeamResource update4(body)

Updates a Team detail. Returns the updated Team detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TeamApi apiInstance = new TeamApi();
TeamResource body = new TeamResource(); // TeamResource | 
try {
    TeamResource result = apiInstance.update4(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#update4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TeamResource**](TeamResource.md)|  |

### Return type

[**TeamResource**](TeamResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserTeam"></a>
# **updateUserTeam**
> UserTeamResource updateUserTeam(body)

Updates the role of a User in a Team. Returns the updated detail.

The user issuing this request must be the Admin of the team.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.TeamApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

TeamApi apiInstance = new TeamApi();
UserTeamResource body = new UserTeamResource(); // UserTeamResource | 
try {
    UserTeamResource result = apiInstance.updateUserTeam(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#updateUserTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTeamResource**](UserTeamResource.md)|  |

### Return type

[**UserTeamResource**](UserTeamResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

