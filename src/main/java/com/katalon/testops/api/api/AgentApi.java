package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.AgentConfigResource;
import com.katalon.testops.api.model.AgentResource;
import com.katalon.testops.api.model.CircleCIAgentResource;
import com.katalon.testops.api.model.CircleCIConnectionResource;
import com.katalon.testops.api.model.CircleCIProject;
import com.katalon.testops.api.model.K8SAgentResource;

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
@Component("com.katalon.testops.api.api.AgentApi")
public class AgentApi {
    private ApiClient apiClient;

    public AgentApi() {
        this(new ApiClient());
    }

    @Autowired
    public AgentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates or updates a Local agent. Returns the agent detail.
     * 
     * <p><b>200</b> - OK
     * @param agentResource  (required)
     * @return AgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgentResource create(AgentResource agentResource) throws RestClientException {
        return createWithHttpInfo(agentResource).getBody();
    }

    /**
     * Creates or updates a Local agent. Returns the agent detail.
     * 
     * <p><b>200</b> - OK
     * @param agentResource  (required)
     * @return ResponseEntity&lt;AgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgentResource> createWithHttpInfo(AgentResource agentResource) throws RestClientException {
        Object postBody = agentResource;
        
        // verify the required parameter 'agentResource' is set
        if (agentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agentResource' when calling create");
        }
        
        String path = apiClient.expandPath("/api/v1/agent", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AgentResource> returnType = new ParameterizedTypeReference<AgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a new CircleCI agent. Returns the created agent detail.
     * 
     * <p><b>200</b> - OK
     * @param circleCIAgentResource  (required)
     * @return CircleCIAgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CircleCIAgentResource create4(CircleCIAgentResource circleCIAgentResource) throws RestClientException {
        return create4WithHttpInfo(circleCIAgentResource).getBody();
    }

    /**
     * Creates a new CircleCI agent. Returns the created agent detail.
     * 
     * <p><b>200</b> - OK
     * @param circleCIAgentResource  (required)
     * @return ResponseEntity&lt;CircleCIAgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CircleCIAgentResource> create4WithHttpInfo(CircleCIAgentResource circleCIAgentResource) throws RestClientException {
        Object postBody = circleCIAgentResource;
        
        // verify the required parameter 'circleCIAgentResource' is set
        if (circleCIAgentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'circleCIAgentResource' when calling create4");
        }
        
        String path = apiClient.expandPath("/api/v1/circle-ci-agent", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CircleCIAgentResource> returnType = new ParameterizedTypeReference<CircleCIAgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a K8S agent. Returns the created agent detail.
     * 
     * <p><b>200</b> - OK
     * @param k8SAgentResource  (required)
     * @return K8SAgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public K8SAgentResource create5(K8SAgentResource k8SAgentResource) throws RestClientException {
        return create5WithHttpInfo(k8SAgentResource).getBody();
    }

    /**
     * Creates a K8S agent. Returns the created agent detail.
     * 
     * <p><b>200</b> - OK
     * @param k8SAgentResource  (required)
     * @return ResponseEntity&lt;K8SAgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<K8SAgentResource> create5WithHttpInfo(K8SAgentResource k8SAgentResource) throws RestClientException {
        Object postBody = k8SAgentResource;
        
        // verify the required parameter 'k8SAgentResource' is set
        if (k8SAgentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'k8SAgentResource' when calling create5");
        }
        
        String path = apiClient.expandPath("/api/v1/k8s-agent", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<K8SAgentResource> returnType = new ParameterizedTypeReference<K8SAgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes a Local agent. Returns the deleted agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return AgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgentResource delete(Long id) throws RestClientException {
        return deleteWithHttpInfo(id).getBody();
    }

    /**
     * Deletes a Local agent. Returns the deleted agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;AgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgentResource> deleteWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/agent/{id}", uriVariables);

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

        ParameterizedTypeReference<AgentResource> returnType = new ParameterizedTypeReference<AgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Generates the configuration file for the Local agent. Returns the configuration file.
     * 
     * <p><b>200</b> - OK
     * @param agentConfigResource  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void generateAgent(AgentConfigResource agentConfigResource) throws RestClientException {
        generateAgentWithHttpInfo(agentConfigResource);
    }

    /**
     * Generates the configuration file for the Local agent. Returns the configuration file.
     * 
     * <p><b>200</b> - OK
     * @param agentConfigResource  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> generateAgentWithHttpInfo(AgentConfigResource agentConfigResource) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'agentConfigResource' is set
        if (agentConfigResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agentConfigResource' when calling generateAgent");
        }
        
        String path = apiClient.expandPath("/api/v1/agent", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "agentConfigResource", agentConfigResource));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a Local agent. Returns the agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return AgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgentResource get(Long id) throws RestClientException {
        return getWithHttpInfo(id).getBody();
    }

    /**
     * Get a Local agent. Returns the agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;AgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgentResource> getWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/agent/{id}", uriVariables);

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

        ParameterizedTypeReference<AgentResource> returnType = new ParameterizedTypeReference<AgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a CircleCI agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return CircleCIAgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CircleCIAgentResource get11(Long id) throws RestClientException {
        return get11WithHttpInfo(id).getBody();
    }

    /**
     * Returns a CircleCI agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;CircleCIAgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CircleCIAgentResource> get11WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get11");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/circle-ci-agent/{id}", uriVariables);

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

        ParameterizedTypeReference<CircleCIAgentResource> returnType = new ParameterizedTypeReference<CircleCIAgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a K8S agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return K8SAgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public K8SAgentResource get13(Long id) throws RestClientException {
        return get13WithHttpInfo(id).getBody();
    }

    /**
     * Returns a K8S agent detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;K8SAgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<K8SAgentResource> get13WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get13");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/k8s-agent/{id}", uriVariables);

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

        ParameterizedTypeReference<K8SAgentResource> returnType = new ParameterizedTypeReference<K8SAgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param circleCIConnectionResource  (required)
     * @return List&lt;CircleCIProject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CircleCIProject> getFollowedProjects(CircleCIConnectionResource circleCIConnectionResource) throws RestClientException {
        return getFollowedProjectsWithHttpInfo(circleCIConnectionResource).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param circleCIConnectionResource  (required)
     * @return ResponseEntity&lt;List&lt;CircleCIProject&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CircleCIProject>> getFollowedProjectsWithHttpInfo(CircleCIConnectionResource circleCIConnectionResource) throws RestClientException {
        Object postBody = circleCIConnectionResource;
        
        // verify the required parameter 'circleCIConnectionResource' is set
        if (circleCIConnectionResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'circleCIConnectionResource' when calling getFollowedProjects");
        }
        
        String path = apiClient.expandPath("/api/v1/circle-ci-agent/projects", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<List<CircleCIProject>> returnType = new ParameterizedTypeReference<List<CircleCIProject>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a CircleCI agent detail. Returns the updated agent detail.
     * 
     * <p><b>200</b> - OK
     * @param circleCIAgentResource  (required)
     * @return CircleCIAgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CircleCIAgentResource update6(CircleCIAgentResource circleCIAgentResource) throws RestClientException {
        return update6WithHttpInfo(circleCIAgentResource).getBody();
    }

    /**
     * Updates a CircleCI agent detail. Returns the updated agent detail.
     * 
     * <p><b>200</b> - OK
     * @param circleCIAgentResource  (required)
     * @return ResponseEntity&lt;CircleCIAgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CircleCIAgentResource> update6WithHttpInfo(CircleCIAgentResource circleCIAgentResource) throws RestClientException {
        Object postBody = circleCIAgentResource;
        
        // verify the required parameter 'circleCIAgentResource' is set
        if (circleCIAgentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'circleCIAgentResource' when calling update6");
        }
        
        String path = apiClient.expandPath("/api/v1/circle-ci-agent", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CircleCIAgentResource> returnType = new ParameterizedTypeReference<CircleCIAgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a K8S agent detail. Returns the updated agent detail.
     * 
     * <p><b>200</b> - OK
     * @param k8SAgentResource  (required)
     * @return K8SAgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public K8SAgentResource update7(K8SAgentResource k8SAgentResource) throws RestClientException {
        return update7WithHttpInfo(k8SAgentResource).getBody();
    }

    /**
     * Updates a K8S agent detail. Returns the updated agent detail.
     * 
     * <p><b>200</b> - OK
     * @param k8SAgentResource  (required)
     * @return ResponseEntity&lt;K8SAgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<K8SAgentResource> update7WithHttpInfo(K8SAgentResource k8SAgentResource) throws RestClientException {
        Object postBody = k8SAgentResource;
        
        // verify the required parameter 'k8SAgentResource' is set
        if (k8SAgentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'k8SAgentResource' when calling update7");
        }
        
        String path = apiClient.expandPath("/api/v1/k8s-agent", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<K8SAgentResource> returnType = new ParameterizedTypeReference<K8SAgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates the threshold for Local agent. Returns the agent detail.
     * 
     * <p><b>200</b> - OK
     * @param agentResource  (required)
     * @return AgentResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgentResource updateThreshold(AgentResource agentResource) throws RestClientException {
        return updateThresholdWithHttpInfo(agentResource).getBody();
    }

    /**
     * Updates the threshold for Local agent. Returns the agent detail.
     * 
     * <p><b>200</b> - OK
     * @param agentResource  (required)
     * @return ResponseEntity&lt;AgentResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgentResource> updateThresholdWithHttpInfo(AgentResource agentResource) throws RestClientException {
        Object postBody = agentResource;
        
        // verify the required parameter 'agentResource' is set
        if (agentResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agentResource' when calling updateThreshold");
        }
        
        String path = apiClient.expandPath("/api/v1/agent/threshold", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AgentResource> returnType = new ParameterizedTypeReference<AgentResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
