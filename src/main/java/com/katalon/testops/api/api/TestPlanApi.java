package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.RunConfigurationResource;

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
@Component("com.katalon.testops.api.api.TestPlanApi")
public class TestPlanApi {
    private ApiClient apiClient;

    public TestPlanApi() {
        this(new ApiClient());
    }

    @Autowired
    public TestPlanApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates and triggers a sample Test Plan. Returns the created Test Plan detail.
     * 
     * <p><b>200</b> - OK
     * @param runConfigurationResource  (required)
     * @return RunConfigurationResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunConfigurationResource createAndTriggerSample(RunConfigurationResource runConfigurationResource) throws RestClientException {
        return createAndTriggerSampleWithHttpInfo(runConfigurationResource).getBody();
    }

    /**
     * Creates and triggers a sample Test Plan. Returns the created Test Plan detail.
     * 
     * <p><b>200</b> - OK
     * @param runConfigurationResource  (required)
     * @return ResponseEntity&lt;RunConfigurationResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunConfigurationResource> createAndTriggerSampleWithHttpInfo(RunConfigurationResource runConfigurationResource) throws RestClientException {
        Object postBody = runConfigurationResource;
        
        // verify the required parameter 'runConfigurationResource' is set
        if (runConfigurationResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runConfigurationResource' when calling createAndTriggerSample");
        }
        
        String path = apiClient.expandPath("/api/v1/run-configurations/sample", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<RunConfigurationResource> returnType = new ParameterizedTypeReference<RunConfigurationResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates or updates a Test Plan. Returns the Test Plan detail.
     * 
     * <p><b>200</b> - OK
     * @param runConfigurationResource  (required)
     * @param verifyRunConfiguration  (optional, default to false)
     * @return RunConfigurationResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunConfigurationResource createOrUpdateConfiguration(RunConfigurationResource runConfigurationResource, Boolean verifyRunConfiguration) throws RestClientException {
        return createOrUpdateConfigurationWithHttpInfo(runConfigurationResource, verifyRunConfiguration).getBody();
    }

    /**
     * Creates or updates a Test Plan. Returns the Test Plan detail.
     * 
     * <p><b>200</b> - OK
     * @param runConfigurationResource  (required)
     * @param verifyRunConfiguration  (optional, default to false)
     * @return ResponseEntity&lt;RunConfigurationResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunConfigurationResource> createOrUpdateConfigurationWithHttpInfo(RunConfigurationResource runConfigurationResource, Boolean verifyRunConfiguration) throws RestClientException {
        Object postBody = runConfigurationResource;
        
        // verify the required parameter 'runConfigurationResource' is set
        if (runConfigurationResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runConfigurationResource' when calling createOrUpdateConfiguration");
        }
        
        String path = apiClient.expandPath("/api/v1/run-configurations", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "verifyRunConfiguration", verifyRunConfiguration));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<RunConfigurationResource> returnType = new ParameterizedTypeReference<RunConfigurationResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes a Test Plan. Returns the deleted Test Plan detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return RunConfigurationResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunConfigurationResource delete5(Long id) throws RestClientException {
        return delete5WithHttpInfo(id).getBody();
    }

    /**
     * Deletes a Test Plan. Returns the deleted Test Plan detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;RunConfigurationResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunConfigurationResource> delete5WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete5");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/run-configurations/{id}", uriVariables);

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

        ParameterizedTypeReference<RunConfigurationResource> returnType = new ParameterizedTypeReference<RunConfigurationResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Link an Run Configuration to a Release. Returns the updated Run Configuration detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param projectId  (required)
     * @param releaseId  (required)
     * @return RunConfigurationResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunConfigurationResource linkRelease1(Long id, Long projectId, Long releaseId) throws RestClientException {
        return linkRelease1WithHttpInfo(id, projectId, releaseId).getBody();
    }

    /**
     * Link an Run Configuration to a Release. Returns the updated Run Configuration detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param projectId  (required)
     * @param releaseId  (required)
     * @return ResponseEntity&lt;RunConfigurationResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunConfigurationResource> linkRelease1WithHttpInfo(Long id, Long projectId, Long releaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling linkRelease1");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling linkRelease1");
        }
        
        // verify the required parameter 'releaseId' is set
        if (releaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'releaseId' when calling linkRelease1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/run-configurations/{id}/link-release", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "releaseId", releaseId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<RunConfigurationResource> returnType = new ParameterizedTypeReference<RunConfigurationResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Unlink an Run Configuration to a Release. Returns the updated Run Configuration detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return RunConfigurationResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunConfigurationResource unlinkRelease1(Long id) throws RestClientException {
        return unlinkRelease1WithHttpInfo(id).getBody();
    }

    /**
     * Unlink an Run Configuration to a Release. Returns the updated Run Configuration detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;RunConfigurationResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunConfigurationResource> unlinkRelease1WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling unlinkRelease1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/run-configurations/{id}/unlink-release", uriVariables);

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

        ParameterizedTypeReference<RunConfigurationResource> returnType = new ParameterizedTypeReference<RunConfigurationResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
