package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.UserResource;
import com.katalon.testops.api.model.UserSettingResource;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("com.katalon.testops.api.api.UserApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Adds users to a Team. Returns the added User detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param teamId  (required)
     * @param newUserIds  (required)
     * @return List&lt;UserResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserResource> assignUserTeam(Long teamId, List<Long> newUserIds) throws RestClientException {
        return assignUserTeamWithHttpInfo(teamId, newUserIds).getBody();
    }

    /**
     * Adds users to a Team. Returns the added User detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param teamId  (required)
     * @param newUserIds  (required)
     * @return ResponseEntity&lt;List&lt;UserResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UserResource>> assignUserTeamWithHttpInfo(Long teamId, List<Long> newUserIds) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling assignUserTeam");
        }
        
        // verify the required parameter 'newUserIds' is set
        if (newUserIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newUserIds' when calling assignUserTeam");
        }
        
        String path = apiClient.expandPath("/api/v1/users/add", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teamId", teamId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "newUserIds", newUserIds));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<List<UserResource>> returnType = new ParameterizedTypeReference<List<UserResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Change the avatar of the current User. Returns the updated User detail.
     * 
     * <p><b>200</b> - OK
     * @param uploadedPath  (required)
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource changeAvatar(String uploadedPath) throws RestClientException {
        return changeAvatarWithHttpInfo(uploadedPath).getBody();
    }

    /**
     * Change the avatar of the current User. Returns the updated User detail.
     * 
     * <p><b>200</b> - OK
     * @param uploadedPath  (required)
     * @return ResponseEntity&lt;UserResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserResource> changeAvatarWithHttpInfo(String uploadedPath) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling changeAvatar");
        }
        
        String path = apiClient.expandPath("/api/v1/users/avatar", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Change name for current user.
     * 
     * <p><b>200</b> - OK
     * @param firstName  (required)
     * @param lastName  (required)
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource changeName(String firstName, String lastName) throws RestClientException {
        return changeNameWithHttpInfo(firstName, lastName).getBody();
    }

    /**
     * Change name for current user.
     * 
     * <p><b>200</b> - OK
     * @param firstName  (required)
     * @param lastName  (required)
     * @return ResponseEntity&lt;UserResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserResource> changeNameWithHttpInfo(String firstName, String lastName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'firstName' when calling changeName");
        }
        
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lastName' when calling changeName");
        }
        
        String path = apiClient.expandPath("/api/v1/users", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates the User Settings detail. Returns the updated User Settings detail.
     * 
     * <p><b>200</b> - OK
     * @param userSettingResource  (required)
     * @return UserSettingResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserSettingResource createOrUpdate2(UserSettingResource userSettingResource) throws RestClientException {
        return createOrUpdate2WithHttpInfo(userSettingResource).getBody();
    }

    /**
     * Updates the User Settings detail. Returns the updated User Settings detail.
     * 
     * <p><b>200</b> - OK
     * @param userSettingResource  (required)
     * @return ResponseEntity&lt;UserSettingResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserSettingResource> createOrUpdate2WithHttpInfo(UserSettingResource userSettingResource) throws RestClientException {
        Object postBody = userSettingResource;
        
        // verify the required parameter 'userSettingResource' is set
        if (userSettingResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userSettingResource' when calling createOrUpdate2");
        }
        
        String path = apiClient.expandPath("/api/v1/user-settings", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserSettingResource> returnType = new ParameterizedTypeReference<UserSettingResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Downloads the avatar of the current User. Returns the current avatar file.
     * 
     * <p><b>200</b> - OK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void downloadAvatar() throws RestClientException {
        downloadAvatarWithHttpInfo();
    }

    /**
     * Downloads the avatar of the current User. Returns the current avatar file.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> downloadAvatarWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/v1/users/avatar", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns the User Settings detail.
     * 
     * <p><b>200</b> - OK
     * @return UserSettingResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserSettingResource get10() throws RestClientException {
        return get10WithHttpInfo().getBody();
    }

    /**
     * Returns the User Settings detail.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;UserSettingResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserSettingResource> get10WithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/v1/user-settings", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserSettingResource> returnType = new ParameterizedTypeReference<UserSettingResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns the current User detail.
     * 
     * <p><b>200</b> - OK
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource getMe() throws RestClientException {
        return getMeWithHttpInfo().getBody();
    }

    /**
     * Returns the current User detail.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;UserResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserResource> getMeWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/v1/users/me", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Removes a User from a Team. Returns the removed User detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param teamId  (required)
     * @param userId  (required)
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource removeUser(Long teamId, Long userId) throws RestClientException {
        return removeUserWithHttpInfo(teamId, userId).getBody();
    }

    /**
     * Removes a User from a Team. Returns the removed User detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param teamId  (required)
     * @param userId  (required)
     * @return ResponseEntity&lt;UserResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserResource> removeUserWithHttpInfo(Long teamId, Long userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling removeUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling removeUser");
        }
        
        String path = apiClient.expandPath("/api/v1/users/remove", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teamId", teamId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
