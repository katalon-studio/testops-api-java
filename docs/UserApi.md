# UserApi

All URIs are relative to *http://localhost:8443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignUserTeam**](UserApi.md#assignUserTeam) | **POST** /api/v1/users/add | Adds users to a Team. Returns the added User detail.
[**changeAvatar**](UserApi.md#changeAvatar) | **POST** /api/v1/users/avatar | Change the avatar of the current User. Returns the updated User detail.
[**changeName**](UserApi.md#changeName) | **POST** /api/v1/users | Change name for current user.
[**createOrUpdate2**](UserApi.md#createOrUpdate2) | **POST** /api/v1/user-settings | Updates the User Settings detail. Returns the updated User Settings detail.
[**downloadAvatar**](UserApi.md#downloadAvatar) | **GET** /api/v1/users/avatar | Downloads the avatar of the current User. Returns the current avatar file.
[**get10**](UserApi.md#get10) | **GET** /api/v1/user-settings | Returns the User Settings detail.
[**getMe**](UserApi.md#getMe) | **GET** /api/v1/users/me | Returns the current User detail.
[**removeUser**](UserApi.md#removeUser) | **DELETE** /api/v1/users/remove | Removes a User from a Team. Returns the removed User detail.

<a name="assignUserTeam"></a>
# **assignUserTeam**
> List&lt;UserResource&gt; assignUserTeam(teamId, newUserIds)

Adds users to a Team. Returns the added User detail.

The user issuing this request must be the Admin of the team.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
Long teamId = 789L; // Long | 
List<Long> newUserIds = Arrays.asList(56L); // List<Long> | 
try {
    List<UserResource> result = apiInstance.assignUserTeam(teamId, newUserIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#assignUserTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**|  |
 **newUserIds** | [**List&lt;Long&gt;**](Long.md)|  |

### Return type

[**List&lt;UserResource&gt;**](UserResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="changeAvatar"></a>
# **changeAvatar**
> UserResource changeAvatar(uploadedPath)

Change the avatar of the current User. Returns the updated User detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
String uploadedPath = "uploadedPath_example"; // String | 
try {
    UserResource result = apiInstance.changeAvatar(uploadedPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changeAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadedPath** | **String**|  |

### Return type

[**UserResource**](UserResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="changeName"></a>
# **changeName**
> UserResource changeName(firstName, lastName)

Change name for current user.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    UserResource result = apiInstance.changeName(firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changeName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**UserResource**](UserResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createOrUpdate2"></a>
# **createOrUpdate2**
> UserSettingResource createOrUpdate2(body)

Updates the User Settings detail. Returns the updated User Settings detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
UserSettingResource body = new UserSettingResource(); // UserSettingResource | 
try {
    UserSettingResource result = apiInstance.createOrUpdate2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createOrUpdate2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserSettingResource**](UserSettingResource.md)|  |

### Return type

[**UserSettingResource**](UserSettingResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="downloadAvatar"></a>
# **downloadAvatar**
> downloadAvatar()

Downloads the avatar of the current User. Returns the current avatar file.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
try {
    apiInstance.downloadAvatar();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#downloadAvatar");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get10"></a>
# **get10**
> UserSettingResource get10()

Returns the User Settings detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
try {
    UserSettingResource result = apiInstance.get10();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#get10");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserSettingResource**](UserSettingResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMe"></a>
# **getMe**
> UserResource getMe()

Returns the current User detail.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
try {
    UserResource result = apiInstance.getMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getMe");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResource**](UserResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="removeUser"></a>
# **removeUser**
> UserResource removeUser(teamId, userId)

Removes a User from a Team. Returns the removed User detail.

The user issuing this request must be the Admin of the team.

### Example
```java
// Import classes:
//import com.katalon.testops.ApiClient;
//import com.katalon.testops.ApiException;
//import com.katalon.testops.Configuration;
//import com.katalon.testops.auth.*;
//import com.katalon.testops.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicScheme
HttpBasicAuth basicScheme = (HttpBasicAuth) defaultClient.getAuthentication("basicScheme");
basicScheme.setUsername("YOUR USERNAME");
basicScheme.setPassword("YOUR PASSWORD");

UserApi apiInstance = new UserApi();
Long teamId = 789L; // Long | 
Long userId = 789L; // Long | 
try {
    UserResource result = apiInstance.removeUser(teamId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**|  |
 **userId** | **Long**|  |

### Return type

[**UserResource**](UserResource.md)

### Authorization

[basicScheme](../README.md#basicScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

