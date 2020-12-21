package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.CommentResource;

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
@Component("com.katalon.testops.api.api.CommentApi")
public class CommentApi {
    private ApiClient apiClient;

    public CommentApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a Comment. Returns the created Comment detail.
     * 
     * <p><b>200</b> - OK
     * @param commentResource  (required)
     * @return CommentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentResource create1(CommentResource commentResource) throws RestClientException {
        return create1WithHttpInfo(commentResource).getBody();
    }

    /**
     * Creates a Comment. Returns the created Comment detail.
     * 
     * <p><b>200</b> - OK
     * @param commentResource  (required)
     * @return ResponseEntity&lt;CommentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentResource> create1WithHttpInfo(CommentResource commentResource) throws RestClientException {
        Object postBody = commentResource;
        
        // verify the required parameter 'commentResource' is set
        if (commentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentResource' when calling create1");
        }
        
        String path = apiClient.expandPath("/api/v1/comments", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CommentResource> returnType = new ParameterizedTypeReference<CommentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Comment detail. Returns the updated Comment detail.
     * 
     * <p><b>200</b> - OK
     * @param commentResource  (required)
     * @return CommentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentResource update(CommentResource commentResource) throws RestClientException {
        return updateWithHttpInfo(commentResource).getBody();
    }

    /**
     * Updates a Comment detail. Returns the updated Comment detail.
     * 
     * <p><b>200</b> - OK
     * @param commentResource  (required)
     * @return ResponseEntity&lt;CommentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentResource> updateWithHttpInfo(CommentResource commentResource) throws RestClientException {
        Object postBody = commentResource;
        
        // verify the required parameter 'commentResource' is set
        if (commentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentResource' when calling update");
        }
        
        String path = apiClient.expandPath("/api/v1/comments", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CommentResource> returnType = new ParameterizedTypeReference<CommentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
