package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.IncidentResource;

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
@Component("com.katalon.testops.api.api.TaskApi")
public class TaskApi {
    private ApiClient apiClient;

    public TaskApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a Task for the test results. Returns the created Task detail.
     * 
     * <p><b>200</b> - OK
     * @param incidentResource  (required)
     * @return IncidentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncidentResource createIncident(IncidentResource incidentResource) throws RestClientException {
        return createIncidentWithHttpInfo(incidentResource).getBody();
    }

    /**
     * Creates a Task for the test results. Returns the created Task detail.
     * 
     * <p><b>200</b> - OK
     * @param incidentResource  (required)
     * @return ResponseEntity&lt;IncidentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncidentResource> createIncidentWithHttpInfo(IncidentResource incidentResource) throws RestClientException {
        Object postBody = incidentResource;
        
        // verify the required parameter 'incidentResource' is set
        if (incidentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'incidentResource' when calling createIncident");
        }
        
        String path = apiClient.expandPath("/api/v1/incidents", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<IncidentResource> returnType = new ParameterizedTypeReference<IncidentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a Task detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return IncidentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncidentResource get4(Long id) throws RestClientException {
        return get4WithHttpInfo(id).getBody();
    }

    /**
     * Returns a Task detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;IncidentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncidentResource> get4WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get4");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/incidents/{id}", uriVariables);

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

        ParameterizedTypeReference<IncidentResource> returnType = new ParameterizedTypeReference<IncidentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Task detail. Returns the updated Task detail.
     * 
     * <p><b>200</b> - OK
     * @param incidentResource  (required)
     * @return IncidentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncidentResource update1(IncidentResource incidentResource) throws RestClientException {
        return update1WithHttpInfo(incidentResource).getBody();
    }

    /**
     * Updates a Task detail. Returns the updated Task detail.
     * 
     * <p><b>200</b> - OK
     * @param incidentResource  (required)
     * @return ResponseEntity&lt;IncidentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncidentResource> update1WithHttpInfo(IncidentResource incidentResource) throws RestClientException {
        Object postBody = incidentResource;
        
        // verify the required parameter 'incidentResource' is set
        if (incidentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'incidentResource' when calling update1");
        }
        
        String path = apiClient.expandPath("/api/v1/incidents", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<IncidentResource> returnType = new ParameterizedTypeReference<IncidentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
