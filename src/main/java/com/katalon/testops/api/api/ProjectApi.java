package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.PageProjectResource;
import com.katalon.testops.api.model.Pageable;
import com.katalon.testops.api.model.ProjectResource;
import com.katalon.testops.api.model.ProjectSettingResource;

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
@Component("com.katalon.testops.api.api.ProjectApi")
public class ProjectApi {
    private ApiClient apiClient;

    public ProjectApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new Project. Returns the created Project detail.
     * 
     * <p><b>200</b> - OK
     * @param projectResource  (required)
     * @return ProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectResource create2(ProjectResource projectResource) throws RestClientException {
        return create2WithHttpInfo(projectResource).getBody();
    }

    /**
     * Creates a new Project. Returns the created Project detail.
     * 
     * <p><b>200</b> - OK
     * @param projectResource  (required)
     * @return ResponseEntity&lt;ProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectResource> create2WithHttpInfo(ProjectResource projectResource) throws RestClientException {
        Object postBody = projectResource;
        
        // verify the required parameter 'projectResource' is set
        if (projectResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectResource' when calling create2");
        }
        
        String path = apiClient.expandPath("/api/v1/projects", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProjectResource> returnType = new ParameterizedTypeReference<ProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param projectSettingResource  (required)
     * @return ProjectSettingResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectSettingResource createOrUpdate(ProjectSettingResource projectSettingResource) throws RestClientException {
        return createOrUpdateWithHttpInfo(projectSettingResource).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param projectSettingResource  (required)
     * @return ResponseEntity&lt;ProjectSettingResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectSettingResource> createOrUpdateWithHttpInfo(ProjectSettingResource projectSettingResource) throws RestClientException {
        Object postBody = projectSettingResource;
        
        // verify the required parameter 'projectSettingResource' is set
        if (projectSettingResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectSettingResource' when calling createOrUpdate");
        }
        
        String path = apiClient.expandPath("/api/v1/project-settings", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProjectSettingResource> returnType = new ParameterizedTypeReference<ProjectSettingResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Create sample data for project.
     * 
     * <p><b>204</b> - No Content
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createSampleData(Long id) throws RestClientException {
        createSampleDataWithHttpInfo(id);
    }

    /**
     * Create sample data for project.
     * 
     * <p><b>204</b> - No Content
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createSampleDataWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createSampleData");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/projects/{id}/sample-data", uriVariables);

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
     * Deletes a Project. Returns the deleted Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectResource delete2(Long id) throws RestClientException {
        return delete2WithHttpInfo(id).getBody();
    }

    /**
     * Deletes a Project. Returns the deleted Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectResource> delete2WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling delete2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/projects/{id}", uriVariables);

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

        ParameterizedTypeReference<ProjectResource> returnType = new ParameterizedTypeReference<ProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns a Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectResource get5(Long id) throws RestClientException {
        return get5WithHttpInfo(id).getBody();
    }

    /**
     * Returns a Project detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectResource> get5WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get5");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/projects/{id}", uriVariables);

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

        ParameterizedTypeReference<ProjectResource> returnType = new ParameterizedTypeReference<ProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ProjectSettingResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectSettingResource get6(Long id) throws RestClientException {
        return get6WithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ProjectSettingResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectSettingResource> get6WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get6");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/project-settings/{id}", uriVariables);

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

        ParameterizedTypeReference<ProjectSettingResource> returnType = new ParameterizedTypeReference<ProjectSettingResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns all Projects of a Team.
     * 
     * <p><b>200</b> - OK
     * @param pageable  (required)
     * @param teamId  (optional)
     * @return PageProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageProjectResource list1(Pageable pageable, Long teamId) throws RestClientException {
        return list1WithHttpInfo(pageable, teamId).getBody();
    }

    /**
     * Returns all Projects of a Team.
     * 
     * <p><b>200</b> - OK
     * @param pageable  (required)
     * @param teamId  (optional)
     * @return ResponseEntity&lt;PageProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageProjectResource> list1WithHttpInfo(Pageable pageable, Long teamId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling list1");
        }
        
        String path = apiClient.expandPath("/api/v1/projects", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teamId", teamId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<PageProjectResource> returnType = new ParameterizedTypeReference<PageProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Project detail. Returns the updated Project detail.
     * 
     * <p><b>200</b> - OK
     * @param projectResource  (required)
     * @return ProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectResource update2(ProjectResource projectResource) throws RestClientException {
        return update2WithHttpInfo(projectResource).getBody();
    }

    /**
     * Updates a Project detail. Returns the updated Project detail.
     * 
     * <p><b>200</b> - OK
     * @param projectResource  (required)
     * @return ResponseEntity&lt;ProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectResource> update2WithHttpInfo(ProjectResource projectResource) throws RestClientException {
        Object postBody = projectResource;
        
        // verify the required parameter 'projectResource' is set
        if (projectResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectResource' when calling update2");
        }
        
        String path = apiClient.expandPath("/api/v1/projects", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProjectResource> returnType = new ParameterizedTypeReference<ProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Updates a Project status. Returns the updated Project detail.
     * 
     * <p><b>200</b> - OK
     * @param projectResource  (required)
     * @return ProjectResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectResource updateStatus(ProjectResource projectResource) throws RestClientException {
        return updateStatusWithHttpInfo(projectResource).getBody();
    }

    /**
     * Updates a Project status. Returns the updated Project detail.
     * 
     * <p><b>200</b> - OK
     * @param projectResource  (required)
     * @return ResponseEntity&lt;ProjectResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectResource> updateStatusWithHttpInfo(ProjectResource projectResource) throws RestClientException {
        Object postBody = projectResource;
        
        // verify the required parameter 'projectResource' is set
        if (projectResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectResource' when calling updateStatus");
        }
        
        String path = apiClient.expandPath("/api/v1/projects/update-status", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProjectResource> returnType = new ParameterizedTypeReference<ProjectResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
