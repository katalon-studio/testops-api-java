package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.OrganizationTrialRequestResource;

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
@Component("com.katalon.testops.api.api.OrganizationTrialRequestResourceControllerApi")
public class OrganizationTrialRequestResourceControllerApi {
    private ApiClient apiClient;

    public OrganizationTrialRequestResourceControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrganizationTrialRequestResourceControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get organization trial request data
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return OrganizationTrialRequestResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrganizationTrialRequestResource getTrialRequest(Long id) throws RestClientException {
        return getTrialRequestWithHttpInfo(id).getBody();
    }

    /**
     * Get organization trial request data
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;OrganizationTrialRequestResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrganizationTrialRequestResource> getTrialRequestWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTrialRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/organizations/{id}/trial-request", uriVariables);

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

        ParameterizedTypeReference<OrganizationTrialRequestResource> returnType = new ParameterizedTypeReference<OrganizationTrialRequestResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Submit organization trial request
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param organizationTrialRequestResource  (required)
     * @return OrganizationTrialRequestResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrganizationTrialRequestResource submitTrialRequest(Long id, OrganizationTrialRequestResource organizationTrialRequestResource) throws RestClientException {
        return submitTrialRequestWithHttpInfo(id, organizationTrialRequestResource).getBody();
    }

    /**
     * Submit organization trial request
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param organizationTrialRequestResource  (required)
     * @return ResponseEntity&lt;OrganizationTrialRequestResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OrganizationTrialRequestResource> submitTrialRequestWithHttpInfo(Long id, OrganizationTrialRequestResource organizationTrialRequestResource) throws RestClientException {
        Object postBody = organizationTrialRequestResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling submitTrialRequest");
        }
        
        // verify the required parameter 'organizationTrialRequestResource' is set
        if (organizationTrialRequestResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationTrialRequestResource' when calling submitTrialRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/organizations/{id}/trial-request", uriVariables);

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

        ParameterizedTypeReference<OrganizationTrialRequestResource> returnType = new ParameterizedTypeReference<OrganizationTrialRequestResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
