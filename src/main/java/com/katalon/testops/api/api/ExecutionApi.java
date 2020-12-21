package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.ExecutionResource;
import com.katalon.testops.api.model.PageExecutionResource;
import com.katalon.testops.api.model.Pageable;

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
@Component("com.katalon.testops.api.api.ExecutionApi")
public class ExecutionApi {
    private ApiClient apiClient;

    public ExecutionApi() {
        this(new ApiClient());
    }

    @Autowired
    public ExecutionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Exports and downloads multiple Executions. Returns the archive file comprising the Execution summaries.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param projectId  (required)
     * @param fileType  (optional, default to &quot;csv&quot;)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void bulkDownload(List<Long> id, Long projectId, String fileType) throws RestClientException {
        bulkDownloadWithHttpInfo(id, projectId, fileType);
    }

    /**
     * Exports and downloads multiple Executions. Returns the archive file comprising the Execution summaries.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param projectId  (required)
     * @param fileType  (optional, default to &quot;csv&quot;)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> bulkDownloadWithHttpInfo(List<Long> id, Long projectId, String fileType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling bulkDownload");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling bulkDownload");
        }
        
        String path = apiClient.expandPath("/api/v1/executions/download", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileType", fileType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Deletes multiple Executions. Returns the deleted Execution details.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param order  (required)
     * @return List&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ExecutionResource> delete1(Long projectId, List<Long> order) throws RestClientException {
        return delete1WithHttpInfo(projectId, order).getBody();
    }

    /**
     * Deletes multiple Executions. Returns the deleted Execution details.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param order  (required)
     * @return ResponseEntity&lt;List&lt;ExecutionResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ExecutionResource>> delete1WithHttpInfo(Long projectId, List<Long> order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling delete1");
        }
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'order' when calling delete1");
        }
        
        String path = apiClient.expandPath("/api/v1/executions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "order", order));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<List<ExecutionResource>> returnType = new ParameterizedTypeReference<List<ExecutionResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Exports and downloads an Execution. Returns the Execution summary file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param fileType  (optional, default to &quot;csv&quot;)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void download1(Long id, String fileType) throws RestClientException {
        download1WithHttpInfo(id, fileType);
    }

    /**
     * Exports and downloads an Execution. Returns the Execution summary file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param fileType  (optional, default to &quot;csv&quot;)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> download1WithHttpInfo(Long id, String fileType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling download1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/executions/{id}/download", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileType", fileType));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Downloads all uploaded files of an Execution. Returns the archive file comprising all Execution&#39;s files.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void downloadFile(Long id) throws RestClientException {
        downloadFileWithHttpInfo(id);
    }

    /**
     * Downloads all uploaded files of an Execution. Returns the archive file comprising all Execution&#39;s files.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> downloadFileWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling downloadFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/executions/{id}/download-file", uriVariables);

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
     * Returns an Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionResource get1(Long id) throws RestClientException {
        return get1WithHttpInfo(id).getBody();
    }

    /**
     * Returns an Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionResource> get1WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling get1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/executions/{id}", uriVariables);

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

        ParameterizedTypeReference<ExecutionResource> returnType = new ParameterizedTypeReference<ExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param pageable  (required)
     * @return PageExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageExecutionResource getLatestExecutions(Long id, Pageable pageable) throws RestClientException {
        return getLatestExecutionsWithHttpInfo(id, pageable).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param pageable  (required)
     * @return ResponseEntity&lt;PageExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageExecutionResource> getLatestExecutionsWithHttpInfo(Long id, Pageable pageable) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLatestExecutions");
        }
        
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling getLatestExecutions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/organizations/{id}/latest-executions", uriVariables);

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

        ParameterizedTypeReference<PageExecutionResource> returnType = new ParameterizedTypeReference<PageExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Link an Execution to a Release. Returns the updated Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param projectId  (required)
     * @param releaseId  (required)
     * @return ExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionResource linkRelease(Long id, Long projectId, Long releaseId) throws RestClientException {
        return linkReleaseWithHttpInfo(id, projectId, releaseId).getBody();
    }

    /**
     * Link an Execution to a Release. Returns the updated Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param projectId  (required)
     * @param releaseId  (required)
     * @return ResponseEntity&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionResource> linkReleaseWithHttpInfo(Long id, Long projectId, Long releaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling linkRelease");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling linkRelease");
        }
        
        // verify the required parameter 'releaseId' is set
        if (releaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'releaseId' when calling linkRelease");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/executions/{id}/link-release", uriVariables);

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

        ParameterizedTypeReference<ExecutionResource> returnType = new ParameterizedTypeReference<ExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param pageable  (required)
     * @param batch  (optional)
     * @param projectId  (optional)
     * @param order  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object list(Pageable pageable, String batch, Long projectId, Long order) throws RestClientException {
        return listWithHttpInfo(pageable, batch, projectId, order).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param pageable  (required)
     * @param batch  (optional)
     * @param projectId  (optional)
     * @param order  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> listWithHttpInfo(Pageable pageable, String batch, Long projectId, Long order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling list");
        }
        
        String path = apiClient.expandPath("/api/v1/executions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Re-imports an Execution. Returns the newly imported Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionResource reImportExecution(Long id) throws RestClientException {
        return reImportExecutionWithHttpInfo(id).getBody();
    }

    /**
     * Re-imports an Execution. Returns the newly imported Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionResource> reImportExecutionWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling reImportExecution");
        }
        
        String path = apiClient.expandPath("/api/v1/executions/reimport", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<ExecutionResource> returnType = new ParameterizedTypeReference<ExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Terminates a running Execution. Returns the terminated Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param order  (required)
     * @return ExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionResource terminatedExecution(Long projectId, Long order) throws RestClientException {
        return terminatedExecutionWithHttpInfo(projectId, order).getBody();
    }

    /**
     * Terminates a running Execution. Returns the terminated Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param order  (required)
     * @return ResponseEntity&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionResource> terminatedExecutionWithHttpInfo(Long projectId, Long order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling terminatedExecution");
        }
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'order' when calling terminatedExecution");
        }
        
        String path = apiClient.expandPath("/api/v1/executions/terminate", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<ExecutionResource> returnType = new ParameterizedTypeReference<ExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Unlink an Execution to a Release. Returns the updated Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionResource unlinkRelease(Long id) throws RestClientException {
        return unlinkReleaseWithHttpInfo(id).getBody();
    }

    /**
     * Unlink an Execution to a Release. Returns the updated Execution detail.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionResource> unlinkReleaseWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling unlinkRelease");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/executions/{id}/unlink-release", uriVariables);

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

        ParameterizedTypeReference<ExecutionResource> returnType = new ParameterizedTypeReference<ExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
