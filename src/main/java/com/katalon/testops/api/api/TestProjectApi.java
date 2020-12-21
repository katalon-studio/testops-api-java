package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.BuildInfo;
import com.katalon.testops.api.model.GitRepositoryResource;
import com.katalon.testops.api.model.SchedulerResource;
import com.katalon.testops.api.model.TestProjectResource;

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
@Component("com.katalon.testops.api.api.TestProjectApi")
public class TestProjectApi {
    private ApiClient apiClient;

    public TestProjectApi() {
        this(new ApiClient());
    }

    @Autowired
    public TestProjectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new schedule for a Test Plan. Returns the created schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerResource  (required)
     * @return SchedulerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulerResource create6(Long id, SchedulerResource schedulerResource) throws RestClientException {
        return create6WithHttpInfo(id, schedulerResource).getBody();
    }

    /**
     * Creates a new schedule for a Test Plan. Returns the created schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerResource  (required)
     * @return ResponseEntity&lt;SchedulerResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulerResource> create6WithHttpInfo(Long id, SchedulerResource schedulerResource) throws RestClientException {
        Object postBody = schedulerResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling create6");
        }
        
        // verify the required parameter 'schedulerResource' is set
        if (schedulerResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulerResource' when calling create6");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/schedulers", uriVariables);

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

        ParameterizedTypeReference<SchedulerResource> returnType = new ParameterizedTypeReference<SchedulerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a Git Test Project. Returns the Git Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param gitRepositoryResource  (required)
     * @return GitRepositoryResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GitRepositoryResource createGitRepo(GitRepositoryResource gitRepositoryResource) throws RestClientException {
        return createGitRepoWithHttpInfo(gitRepositoryResource).getBody();
    }

    /**
     * Creates a Git Test Project. Returns the Git Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param gitRepositoryResource  (required)
     * @return ResponseEntity&lt;GitRepositoryResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GitRepositoryResource> createGitRepoWithHttpInfo(GitRepositoryResource gitRepositoryResource) throws RestClientException {
        Object postBody = gitRepositoryResource;
        
        // verify the required parameter 'gitRepositoryResource' is set
        if (gitRepositoryResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gitRepositoryResource' when calling createGitRepo");
        }
        
        String path = apiClient.expandPath("/api/v1/git/create", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<GitRepositoryResource> returnType = new ParameterizedTypeReference<GitRepositoryResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a new sample Test Project. Returns the created Test Project.
     * 
     * <p><b>200</b> - OK
     * @param name  (required)
     * @param type  (required)
     * @param projectId  (required)
     * @return TestProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestProjectResource createSample(String name, String type, Long projectId) throws RestClientException {
        return createSampleWithHttpInfo(name, type, projectId).getBody();
    }

    /**
     * Creates a new sample Test Project. Returns the created Test Project.
     * 
     * <p><b>200</b> - OK
     * @param name  (required)
     * @param type  (required)
     * @param projectId  (required)
     * @return ResponseEntity&lt;TestProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TestProjectResource> createSampleWithHttpInfo(String name, String type, Long projectId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createSample");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling createSample");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling createSample");
        }
        
        String path = apiClient.expandPath("/api/v1/test-projects/sample", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<TestProjectResource> returnType = new ParameterizedTypeReference<TestProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes a Test Project. Returns the deleted Test Project.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return TestProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestProjectResource delete6(Long id) throws RestClientException {
        return delete6WithHttpInfo(id).getBody();
    }

    /**
     * Deletes a Test Project. Returns the deleted Test Project.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;TestProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TestProjectResource> delete6WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete6");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}", uriVariables);

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

        ParameterizedTypeReference<TestProjectResource> returnType = new ParameterizedTypeReference<TestProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes a schedule. Returns the deleted schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerId  (required)
     * @return SchedulerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulerResource delete7(Long id, Long schedulerId) throws RestClientException {
        return delete7WithHttpInfo(id, schedulerId).getBody();
    }

    /**
     * Deletes a schedule. Returns the deleted schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerId  (required)
     * @return ResponseEntity&lt;SchedulerResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulerResource> delete7WithHttpInfo(Long id, Long schedulerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete7");
        }
        
        // verify the required parameter 'schedulerId' is set
        if (schedulerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulerId' when calling delete7");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("schedulerId", schedulerId);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/schedulers/{schedulerId}", uriVariables);

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

        ParameterizedTypeReference<SchedulerResource> returnType = new ParameterizedTypeReference<SchedulerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Downloads a Test Project package. Returns the latest Test Project package file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void download4(Long id) throws RestClientException {
        download4WithHttpInfo(id);
    }

    /**
     * Downloads a Test Project package. Returns the latest Test Project package file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> download4WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling download4");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/download", uriVariables);

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
     * Returns a Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return TestProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestProjectResource get17(Long id) throws RestClientException {
        return get17WithHttpInfo(id).getBody();
    }

    /**
     * Returns a Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;TestProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TestProjectResource> get17WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get17");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}", uriVariables);

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

        ParameterizedTypeReference<TestProjectResource> returnType = new ParameterizedTypeReference<TestProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerId  (required)
     * @return SchedulerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulerResource getScheduler(Long id, Long schedulerId) throws RestClientException {
        return getSchedulerWithHttpInfo(id, schedulerId).getBody();
    }

    /**
     * Returns a schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerId  (required)
     * @return ResponseEntity&lt;SchedulerResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulerResource> getSchedulerWithHttpInfo(Long id, Long schedulerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScheduler");
        }
        
        // verify the required parameter 'schedulerId' is set
        if (schedulerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulerId' when calling getScheduler");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("schedulerId", schedulerId);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/schedulers/{schedulerId}", uriVariables);

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

        ParameterizedTypeReference<SchedulerResource> returnType = new ParameterizedTypeReference<SchedulerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a Git Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param testProjectGitId  (required)
     * @return GitRepositoryResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GitRepositoryResource getTestProjectGit(Long testProjectGitId) throws RestClientException {
        return getTestProjectGitWithHttpInfo(testProjectGitId).getBody();
    }

    /**
     * Returns a Git Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param testProjectGitId  (required)
     * @return ResponseEntity&lt;GitRepositoryResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GitRepositoryResource> getTestProjectGitWithHttpInfo(Long testProjectGitId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'testProjectGitId' is set
        if (testProjectGitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testProjectGitId' when calling getTestProjectGit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("testProjectGitId", testProjectGitId);
        String path = apiClient.expandPath("/api/v1/git/{testProjectGitId}", uriVariables);

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

        ParameterizedTypeReference<GitRepositoryResource> returnType = new ParameterizedTypeReference<GitRepositoryResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Refresh Test Suite Collection list of Git Test Project
     * 
     * <p><b>204</b> - No Content
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void refreshTSC(Long id) throws RestClientException {
        refreshTSCWithHttpInfo(id);
    }

    /**
     * Refresh Test Suite Collection list of Git Test Project
     * 
     * <p><b>204</b> - No Content
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> refreshTSCWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling refreshTSC");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/refresh-tsc", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Executes a Test Plan. Returns the build information.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return List&lt;BuildInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BuildInfo> run(Long id) throws RestClientException {
        return runWithHttpInfo(id).getBody();
    }

    /**
     * Executes a Test Plan. Returns the build information.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;BuildInfo&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BuildInfo>> runWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling run");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/run-configurations/{id}/execute", uriVariables);

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

        ParameterizedTypeReference<List<BuildInfo>> returnType = new ParameterizedTypeReference<List<BuildInfo>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Test Project detail. Returns the updated Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param testProjectResource  (required)
     * @return TestProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestProjectResource update10(Long id, TestProjectResource testProjectResource) throws RestClientException {
        return update10WithHttpInfo(id, testProjectResource).getBody();
    }

    /**
     * Updates a Test Project detail. Returns the updated Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param testProjectResource  (required)
     * @return ResponseEntity&lt;TestProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TestProjectResource> update10WithHttpInfo(Long id, TestProjectResource testProjectResource) throws RestClientException {
        Object postBody = testProjectResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling update10");
        }
        
        // verify the required parameter 'testProjectResource' is set
        if (testProjectResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testProjectResource' when calling update10");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}", uriVariables);

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

        ParameterizedTypeReference<TestProjectResource> returnType = new ParameterizedTypeReference<TestProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a schedule detail. Returns the updated schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerId  (required)
     * @param schedulerResource  (required)
     * @return SchedulerResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulerResource update9(Long id, Long schedulerId, SchedulerResource schedulerResource) throws RestClientException {
        return update9WithHttpInfo(id, schedulerId, schedulerResource).getBody();
    }

    /**
     * Updates a schedule detail. Returns the updated schedule detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param schedulerId  (required)
     * @param schedulerResource  (required)
     * @return ResponseEntity&lt;SchedulerResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchedulerResource> update9WithHttpInfo(Long id, Long schedulerId, SchedulerResource schedulerResource) throws RestClientException {
        Object postBody = schedulerResource;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling update9");
        }
        
        // verify the required parameter 'schedulerId' is set
        if (schedulerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulerId' when calling update9");
        }
        
        // verify the required parameter 'schedulerResource' is set
        if (schedulerResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulerResource' when calling update9");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("schedulerId", schedulerId);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/schedulers/{schedulerId}", uriVariables);

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

        ParameterizedTypeReference<SchedulerResource> returnType = new ParameterizedTypeReference<SchedulerResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Git Test Project detail. Returns the updated Git Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param gitRepositoryResource  (required)
     * @return GitRepositoryResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GitRepositoryResource updateGitRepo(GitRepositoryResource gitRepositoryResource) throws RestClientException {
        return updateGitRepoWithHttpInfo(gitRepositoryResource).getBody();
    }

    /**
     * Updates a Git Test Project detail. Returns the updated Git Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param gitRepositoryResource  (required)
     * @return ResponseEntity&lt;GitRepositoryResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GitRepositoryResource> updateGitRepoWithHttpInfo(GitRepositoryResource gitRepositoryResource) throws RestClientException {
        Object postBody = gitRepositoryResource;
        
        // verify the required parameter 'gitRepositoryResource' is set
        if (gitRepositoryResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gitRepositoryResource' when calling updateGitRepo");
        }
        
        String path = apiClient.expandPath("/api/v1/git/update", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<GitRepositoryResource> returnType = new ParameterizedTypeReference<GitRepositoryResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update a Test Project package. Returns the updated Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @return TestProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestProjectResource updatePackage(Long id, String batch, String folderPath, String fileName, String uploadedPath) throws RestClientException {
        return updatePackageWithHttpInfo(id, batch, folderPath, fileName, uploadedPath).getBody();
    }

    /**
     * Update a Test Project package. Returns the updated Test Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @return ResponseEntity&lt;TestProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TestProjectResource> updatePackageWithHttpInfo(Long id, String batch, String folderPath, String fileName, String uploadedPath) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updatePackage");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling updatePackage");
        }
        
        // verify the required parameter 'folderPath' is set
        if (folderPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderPath' when calling updatePackage");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling updatePackage");
        }
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling updatePackage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/test-projects/{id}/update-package", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderPath", folderPath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<TestProjectResource> returnType = new ParameterizedTypeReference<TestProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Creates a new Test Project. Returns the created Test Project.
     * 
     * <p><b>200</b> - OK
     * @param name  (required)
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @param description  (optional)
     * @return TestProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestProjectResource upload1(String name, String projectId, String batch, String folderPath, String fileName, String uploadedPath, String description) throws RestClientException {
        return upload1WithHttpInfo(name, projectId, batch, folderPath, fileName, uploadedPath, description).getBody();
    }

    /**
     * Creates a new Test Project. Returns the created Test Project.
     * 
     * <p><b>200</b> - OK
     * @param name  (required)
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @param description  (optional)
     * @return ResponseEntity&lt;TestProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TestProjectResource> upload1WithHttpInfo(String name, String projectId, String batch, String folderPath, String fileName, String uploadedPath, String description) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling upload1");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling upload1");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling upload1");
        }
        
        // verify the required parameter 'folderPath' is set
        if (folderPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderPath' when calling upload1");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling upload1");
        }
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling upload1");
        }
        
        String path = apiClient.expandPath("/api/v1/test-projects/upload", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderPath", folderPath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<TestProjectResource> returnType = new ParameterizedTypeReference<TestProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
