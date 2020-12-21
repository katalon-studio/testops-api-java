package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.ReleaseResource;

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
@Component("com.katalon.testops.api.api.ReleaseApi")
public class ReleaseApi {
    private ApiClient apiClient;

    public ReleaseApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReleaseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Open or close a Release. Returns the updated Release detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param closed  (required)
     * @return ReleaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseResource activeRelease(Long id, Boolean closed) throws RestClientException {
        return activeReleaseWithHttpInfo(id, closed).getBody();
    }

    /**
     * Open or close a Release. Returns the updated Release detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param closed  (required)
     * @return ResponseEntity&lt;ReleaseResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseResource> activeReleaseWithHttpInfo(Long id, Boolean closed) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling activeRelease");
        }
        
        // verify the required parameter 'closed' is set
        if (closed == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'closed' when calling activeRelease");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/releases/{id}/active", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "closed", closed));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<ReleaseResource> returnType = new ParameterizedTypeReference<ReleaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates or updates a Release. Returns the Release details.
     * 
     * <p><b>200</b> - OK
     * @param releaseResource  (required)
     * @return ReleaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseResource createOrUpdate1(ReleaseResource releaseResource) throws RestClientException {
        return createOrUpdate1WithHttpInfo(releaseResource).getBody();
    }

    /**
     * Creates or updates a Release. Returns the Release details.
     * 
     * <p><b>200</b> - OK
     * @param releaseResource  (required)
     * @return ResponseEntity&lt;ReleaseResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseResource> createOrUpdate1WithHttpInfo(ReleaseResource releaseResource) throws RestClientException {
        Object postBody = releaseResource;
        
        // verify the required parameter 'releaseResource' is set
        if (releaseResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'releaseResource' when calling createOrUpdate1");
        }
        
        String path = apiClient.expandPath("/api/v1/releases", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ReleaseResource> returnType = new ParameterizedTypeReference<ReleaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes a Release. Returns the Release details.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ReleaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseResource delete3(Long id) throws RestClientException {
        return delete3WithHttpInfo(id).getBody();
    }

    /**
     * Deletes a Release. Returns the Release details.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ReleaseResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseResource> delete3WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete3");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/releases/{id}", uriVariables);

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

        ParameterizedTypeReference<ReleaseResource> returnType = new ParameterizedTypeReference<ReleaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Release. Returns the Release details.
     * 
     * <p><b>200</b> - OK
     * @param releaseResource  (required)
     * @return ReleaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseResource update3(ReleaseResource releaseResource) throws RestClientException {
        return update3WithHttpInfo(releaseResource).getBody();
    }

    /**
     * Updates a Release. Returns the Release details.
     * 
     * <p><b>200</b> - OK
     * @param releaseResource  (required)
     * @return ResponseEntity&lt;ReleaseResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReleaseResource> update3WithHttpInfo(ReleaseResource releaseResource) throws RestClientException {
        Object postBody = releaseResource;
        
        // verify the required parameter 'releaseResource' is set
        if (releaseResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'releaseResource' when calling update3");
        }
        
        String path = apiClient.expandPath("/api/v1/releases", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ReleaseResource> returnType = new ParameterizedTypeReference<ReleaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
