package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.ExecutionTestResultResource;
import com.katalon.testops.api.model.IncidentExecutionTestResultResource;

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
@Component("com.katalon.testops.api.api.ExecutionTestResultApi")
public class ExecutionTestResultApi {
    private ApiClient apiClient;

    public ExecutionTestResultApi() {
        this(new ApiClient());
    }

    @Autowired
    public ExecutionTestResultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns an Execution Test Result detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ExecutionTestResultResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionTestResultResource get2(String id) throws RestClientException {
        return get2WithHttpInfo(id).getBody();
    }

    /**
     * Returns an Execution Test Result detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ExecutionTestResultResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionTestResultResource> get2WithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-results/{id}", uriVariables);

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

        ParameterizedTypeReference<ExecutionTestResultResource> returnType = new ParameterizedTypeReference<ExecutionTestResultResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Downloads a test result&#39;s log. Returns the log file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getStdout(Long id) throws RestClientException {
        return getStdoutWithHttpInfo(id).getBody();
    }

    /**
     * Downloads a test result&#39;s log. Returns the log file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getStdoutWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getStdout");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-results/logs/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain;charset=UTF-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Link an Execution Test Result to a Task. Returns the created binding detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param incidentExecutionTestResultResource  (required)
     * @return IncidentExecutionTestResultResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncidentExecutionTestResultResource linkIncidents(String id, IncidentExecutionTestResultResource incidentExecutionTestResultResource) throws RestClientException {
        return linkIncidentsWithHttpInfo(id, incidentExecutionTestResultResource).getBody();
    }

    /**
     * Link an Execution Test Result to a Task. Returns the created binding detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param incidentExecutionTestResultResource  (required)
     * @return ResponseEntity&lt;IncidentExecutionTestResultResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncidentExecutionTestResultResource> linkIncidentsWithHttpInfo(String id, IncidentExecutionTestResultResource incidentExecutionTestResultResource) throws RestClientException {
        Object postBody = incidentExecutionTestResultResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling linkIncidents");
        }
        
        // verify the required parameter 'incidentExecutionTestResultResource' is set
        if (incidentExecutionTestResultResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'incidentExecutionTestResultResource' when calling linkIncidents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-results/{id}/incidents", uriVariables);

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

        ParameterizedTypeReference<IncidentExecutionTestResultResource> returnType = new ParameterizedTypeReference<IncidentExecutionTestResultResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ExecutionTestResultResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionTestResultResource markAsRetested(String id) throws RestClientException {
        return markAsRetestedWithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ExecutionTestResultResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionTestResultResource> markAsRetestedWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling markAsRetested");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-results/{id}/mask-as-retested", uriVariables);

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

        ParameterizedTypeReference<ExecutionTestResultResource> returnType = new ParameterizedTypeReference<ExecutionTestResultResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Unlink an Execution Test Result to a Task. Returns the deleted binding detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param incidentExecutionTestResultResource  (required)
     * @return IncidentExecutionTestResultResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncidentExecutionTestResultResource unlinkIncidents(String id, IncidentExecutionTestResultResource incidentExecutionTestResultResource) throws RestClientException {
        return unlinkIncidentsWithHttpInfo(id, incidentExecutionTestResultResource).getBody();
    }

    /**
     * Unlink an Execution Test Result to a Task. Returns the deleted binding detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param incidentExecutionTestResultResource  (required)
     * @return ResponseEntity&lt;IncidentExecutionTestResultResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncidentExecutionTestResultResource> unlinkIncidentsWithHttpInfo(String id, IncidentExecutionTestResultResource incidentExecutionTestResultResource) throws RestClientException {
        Object postBody = incidentExecutionTestResultResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling unlinkIncidents");
        }
        
        // verify the required parameter 'incidentExecutionTestResultResource' is set
        if (incidentExecutionTestResultResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'incidentExecutionTestResultResource' when calling unlinkIncidents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-results/{id}/incidents", uriVariables);

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

        ParameterizedTypeReference<IncidentExecutionTestResultResource> returnType = new ParameterizedTypeReference<IncidentExecutionTestResultResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
