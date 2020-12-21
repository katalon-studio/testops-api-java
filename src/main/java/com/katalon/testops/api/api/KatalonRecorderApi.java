package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;


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
@Component("com.katalon.testops.api.api.KatalonRecorderApi")
public class KatalonRecorderApi {
    private ApiClient apiClient;

    public KatalonRecorderApi() {
        this(new ApiClient());
    }

    @Autowired
    public KatalonRecorderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Saves a Katalon Recorder backup detail.
     * 
     * <p><b>200</b> - OK
     * @param uploadedPath  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void backup(String uploadedPath) throws RestClientException {
        backupWithHttpInfo(uploadedPath);
    }

    /**
     * Saves a Katalon Recorder backup detail.
     * 
     * <p><b>200</b> - OK
     * @param uploadedPath  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> backupWithHttpInfo(String uploadedPath) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling backup");
        }
        
        String path = apiClient.expandPath("/api/v1/katalon-recorder/backup", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Downloads a Katalon Recorder backup. Returns the backup file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void download3(Long id) throws RestClientException {
        download3WithHttpInfo(id);
    }

    /**
     * Downloads a Katalon Recorder backup. Returns the backup file.
     * 
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> download3WithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling download3");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/api/v1/katalon-recorder/backup/{id}/download", uriVariables);

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
     * Uploads and processes a Katalon Recorder report.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void upload(String projectId, String batch, String isEnd, String fileName, String uploadedPath) throws RestClientException {
        uploadWithHttpInfo(projectId, batch, isEnd, fileName, uploadedPath);
    }

    /**
     * Uploads and processes a Katalon Recorder report.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> uploadWithHttpInfo(String projectId, String batch, String isEnd, String fileName, String uploadedPath) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling upload");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling upload");
        }
        
        // verify the required parameter 'isEnd' is set
        if (isEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isEnd' when calling upload");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling upload");
        }
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling upload");
        }
        
        String path = apiClient.expandPath("/api/v1/katalon-recorder/test-reports", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isEnd", isEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
