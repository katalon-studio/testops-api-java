package com.katalon.testops.api;

import com.katalon.testops.ApiClient;

import com.katalon.testops.model.UserResource;
import com.katalon.testops.model.UserSettingResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@Component("com.katalon.testops.api.UserApi")
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
     * @param teamId The teamId parameter
     * @param newUserIds The newUserIds parameter
     * @return List&lt;UserResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UserResource> assignUserTeam(Long teamId, List<Long> newUserIds) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling assignUserTeam");
        }
        // verify the required parameter 'newUserIds' is set
        if (newUserIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newUserIds' when calling assignUserTeam");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/users/add").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teamId", teamId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "newUserIds", newUserIds));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<List<UserResource>> returnType = new ParameterizedTypeReference<List<UserResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Change the avatar of the current User. Returns the updated User detail.
     * 
     * <p><b>200</b> - OK
     * @param uploadedPath The uploadedPath parameter
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource changeAvatar(String uploadedPath) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling changeAvatar");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/users/avatar").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Change name for current user.
     * 
     * <p><b>200</b> - OK
     * @param firstName The firstName parameter
     * @param lastName The lastName parameter
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource changeName(String firstName, String lastName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'firstName' when calling changeName");
        }
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lastName' when calling changeName");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/users").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Updates the User Settings detail. Returns the updated User Settings detail.
     * 
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return UserSettingResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserSettingResource createOrUpdate2(UserSettingResource body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createOrUpdate2");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/user-settings").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserSettingResource> returnType = new ParameterizedTypeReference<UserSettingResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Downloads the avatar of the current User. Returns the current avatar file.
     * 
     * <p><b>200</b> - OK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void downloadAvatar() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/api/v1/users/avatar").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns the User Settings detail.
     * 
     * <p><b>200</b> - OK
     * @return UserSettingResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserSettingResource get10() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/api/v1/user-settings").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserSettingResource> returnType = new ParameterizedTypeReference<UserSettingResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns the current User detail.
     * 
     * <p><b>200</b> - OK
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource getMe() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/api/v1/users/me").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Removes a User from a Team. Returns the removed User detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param teamId The teamId parameter
     * @param userId The userId parameter
     * @return UserResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResource removeUser(Long teamId, Long userId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling removeUser");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling removeUser");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/users/remove").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teamId", teamId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<UserResource> returnType = new ParameterizedTypeReference<UserResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
