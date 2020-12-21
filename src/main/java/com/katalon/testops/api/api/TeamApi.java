package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.PageTeamResource;
import com.katalon.testops.api.model.Pageable;
import com.katalon.testops.api.model.TeamResource;
import com.katalon.testops.api.model.UserTeamResource;

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
@Component("com.katalon.testops.api.api.TeamApi")
public class TeamApi {
    private ApiClient apiClient;

    public TeamApi() {
        this(new ApiClient());
    }

    @Autowired
    public TeamApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new Team. Returns the created Team detail.
     * 
     * <p><b>200</b> - OK
     * @param teamResource  (required)
     * @return TeamResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamResource create3(TeamResource teamResource) throws RestClientException {
        return create3WithHttpInfo(teamResource).getBody();
    }

    /**
     * Creates a new Team. Returns the created Team detail.
     * 
     * <p><b>200</b> - OK
     * @param teamResource  (required)
     * @return ResponseEntity&lt;TeamResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamResource> create3WithHttpInfo(TeamResource teamResource) throws RestClientException {
        Object postBody = teamResource;
        
        // verify the required parameter 'teamResource' is set
        if (teamResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamResource' when calling create3");
        }
        
        String path = apiClient.expandPath("/api/v1/teams", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<TeamResource> returnType = new ParameterizedTypeReference<TeamResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Delete a Team. Returns the delete Team detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return TeamResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamResource delete4(Long id) throws RestClientException {
        return delete4WithHttpInfo(id).getBody();
    }

    /**
     * Delete a Team. Returns the delete Team detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;TeamResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamResource> delete4WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete4");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/teams/{id}", uriVariables);

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

        ParameterizedTypeReference<TeamResource> returnType = new ParameterizedTypeReference<TeamResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a Team detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return TeamResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamResource get7(Long id) throws RestClientException {
        return get7WithHttpInfo(id).getBody();
    }

    /**
     * Returns a Team detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;TeamResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamResource> get7WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get7");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/teams/{id}", uriVariables);

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

        ParameterizedTypeReference<TeamResource> returnType = new ParameterizedTypeReference<TeamResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns all Teams of the current User.
     * 
     * <p><b>200</b> - OK
     * @param pageable  (required)
     * @return PageTeamResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageTeamResource list2(Pageable pageable) throws RestClientException {
        return list2WithHttpInfo(pageable).getBody();
    }

    /**
     * Returns all Teams of the current User.
     * 
     * <p><b>200</b> - OK
     * @param pageable  (required)
     * @return ResponseEntity&lt;PageTeamResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageTeamResource> list2WithHttpInfo(Pageable pageable) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling list2");
        }
        
        String path = apiClient.expandPath("/api/v1/teams", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<PageTeamResource> returnType = new ParameterizedTypeReference<PageTeamResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Team detail. Returns the updated Team detail.
     * 
     * <p><b>200</b> - OK
     * @param teamResource  (required)
     * @return TeamResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamResource update4(TeamResource teamResource) throws RestClientException {
        return update4WithHttpInfo(teamResource).getBody();
    }

    /**
     * Updates a Team detail. Returns the updated Team detail.
     * 
     * <p><b>200</b> - OK
     * @param teamResource  (required)
     * @return ResponseEntity&lt;TeamResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamResource> update4WithHttpInfo(TeamResource teamResource) throws RestClientException {
        Object postBody = teamResource;
        
        // verify the required parameter 'teamResource' is set
        if (teamResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamResource' when calling update4");
        }
        
        String path = apiClient.expandPath("/api/v1/teams", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<TeamResource> returnType = new ParameterizedTypeReference<TeamResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates the role of a User in a Team. Returns the updated detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param userTeamResource  (required)
     * @return UserTeamResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserTeamResource updateUserTeam(UserTeamResource userTeamResource) throws RestClientException {
        return updateUserTeamWithHttpInfo(userTeamResource).getBody();
    }

    /**
     * Updates the role of a User in a Team. Returns the updated detail.
     * The user issuing this request must be the Admin of the team.
     * <p><b>200</b> - OK
     * @param userTeamResource  (required)
     * @return ResponseEntity&lt;UserTeamResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserTeamResource> updateUserTeamWithHttpInfo(UserTeamResource userTeamResource) throws RestClientException {
        Object postBody = userTeamResource;
        
        // verify the required parameter 'userTeamResource' is set
        if (userTeamResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userTeamResource' when calling updateUserTeam");
        }
        
        String path = apiClient.expandPath("/api/v1/permission/team/user", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<UserTeamResource> returnType = new ParameterizedTypeReference<UserTeamResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
