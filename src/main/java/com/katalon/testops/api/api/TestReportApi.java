package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.ExecutionResource;
import com.katalon.testops.api.model.TestRunResult;
import com.katalon.testops.api.model.UploadBatchFileResource;
import com.katalon.testops.api.model.UploadBatchResource;

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
@Component("com.katalon.testops.api.api.TestReportApi")
public class TestReportApi {
    private ApiClient apiClient;

    public TestReportApi() {
        this(new ApiClient());
    }

    @Autowired
    public TestReportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Saves and processes multiple uploaded Katalon reports.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param uploadBatchFileResource  (required)
     * @return List&lt;UploadBatchResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UploadBatchResource> processMultipleS3File(Long projectId, String batch, List<UploadBatchFileResource> uploadBatchFileResource) throws RestClientException {
        return processMultipleS3FileWithHttpInfo(projectId, batch, uploadBatchFileResource).getBody();
    }

    /**
     * Saves and processes multiple uploaded Katalon reports.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param uploadBatchFileResource  (required)
     * @return ResponseEntity&lt;List&lt;UploadBatchResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UploadBatchResource>> processMultipleS3FileWithHttpInfo(Long projectId, String batch, List<UploadBatchFileResource> uploadBatchFileResource) throws RestClientException {
        Object postBody = uploadBatchFileResource;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling processMultipleS3File");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling processMultipleS3File");
        }
        
        // verify the required parameter 'uploadBatchFileResource' is set
        if (uploadBatchFileResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadBatchFileResource' when calling processMultipleS3File");
        }
        
        String path = apiClient.expandPath("/api/v1/katalon/test-reports/multiple", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<List<UploadBatchResource>> returnType = new ParameterizedTypeReference<List<UploadBatchResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Saves and processes the uploaded Katalon reports.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @return List&lt;UploadBatchResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UploadBatchResource> processS3File(String projectId, String batch, String folderPath, String isEnd, String fileName, String uploadedPath) throws RestClientException {
        return processS3FileWithHttpInfo(projectId, batch, folderPath, isEnd, fileName, uploadedPath).getBody();
    }

    /**
     * Saves and processes the uploaded Katalon reports.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @return ResponseEntity&lt;List&lt;UploadBatchResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UploadBatchResource>> processS3FileWithHttpInfo(String projectId, String batch, String folderPath, String isEnd, String fileName, String uploadedPath) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling processS3File");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling processS3File");
        }
        
        // verify the required parameter 'folderPath' is set
        if (folderPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderPath' when calling processS3File");
        }
        
        // verify the required parameter 'isEnd' is set
        if (isEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isEnd' when calling processS3File");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling processS3File");
        }
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling processS3File");
        }
        
        String path = apiClient.expandPath("/api/v1/katalon/test-reports", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderPath", folderPath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isEnd", isEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<List<UploadBatchResource>> returnType = new ParameterizedTypeReference<List<UploadBatchResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Saves and processes multiple uploaded TestOps reports.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param uploadBatchFileResource  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processTestOpsReports(Long projectId, String batch, List<UploadBatchFileResource> uploadBatchFileResource) throws RestClientException {
        processTestOpsReportsWithHttpInfo(projectId, batch, uploadBatchFileResource);
    }

    /**
     * Saves and processes multiple uploaded TestOps reports.
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param batch  (required)
     * @param uploadBatchFileResource  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processTestOpsReportsWithHttpInfo(Long projectId, String batch, List<UploadBatchFileResource> uploadBatchFileResource) throws RestClientException {
        Object postBody = uploadBatchFileResource;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling processTestOpsReports");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling processTestOpsReports");
        }
        
        // verify the required parameter 'uploadBatchFileResource' is set
        if (uploadBatchFileResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadBatchFileResource' when calling processTestOpsReports");
        }
        
        String path = apiClient.expandPath("/api/v1/testops-reports", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param testRunResult  (required)
     * @return ExecutionResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecutionResource updateResult(Long projectId, TestRunResult testRunResult) throws RestClientException {
        return updateResultWithHttpInfo(projectId, testRunResult).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param projectId  (required)
     * @param testRunResult  (required)
     * @return ResponseEntity&lt;ExecutionResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecutionResource> updateResultWithHttpInfo(Long projectId, TestRunResult testRunResult) throws RestClientException {
        Object postBody = testRunResult;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateResult");
        }
        
        // verify the required parameter 'testRunResult' is set
        if (testRunResult == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testRunResult' when calling updateResult");
        }
        
        String path = apiClient.expandPath("/api/v1/katalon/test-reports/update-result", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<ExecutionResource> returnType = new ParameterizedTypeReference<ExecutionResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Uploads and processes the JUnit reports to an Execution.
     * 
     * <p><b>204</b> - No Content
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @param sessionId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void uploadJUnitReports(String projectId, String batch, String folderPath, String isEnd, String fileName, String uploadedPath, String sessionId) throws RestClientException {
        uploadJUnitReportsWithHttpInfo(projectId, batch, folderPath, isEnd, fileName, uploadedPath, sessionId);
    }

    /**
     * Uploads and processes the JUnit reports to an Execution.
     * 
     * <p><b>204</b> - No Content
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @param sessionId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> uploadJUnitReportsWithHttpInfo(String projectId, String batch, String folderPath, String isEnd, String fileName, String uploadedPath, String sessionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling uploadJUnitReports");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling uploadJUnitReports");
        }
        
        // verify the required parameter 'folderPath' is set
        if (folderPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderPath' when calling uploadJUnitReports");
        }
        
        // verify the required parameter 'isEnd' is set
        if (isEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isEnd' when calling uploadJUnitReports");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling uploadJUnitReports");
        }
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling uploadJUnitReports");
        }
        
        String path = apiClient.expandPath("/api/v1/junit/test-reports", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderPath", folderPath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isEnd", isEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uploadedPath", uploadedPath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sessionId", sessionId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Uploads and processes the TestNG reports to an execution.
     * 
     * <p><b>204</b> - No Content
     * @param executionId  (required)
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void uploadTestNGReports(Long executionId, Long projectId, String batch, String folderPath, Boolean isEnd, String fileName, String uploadedPath) throws RestClientException {
        uploadTestNGReportsWithHttpInfo(executionId, projectId, batch, folderPath, isEnd, fileName, uploadedPath);
    }

    /**
     * Uploads and processes the TestNG reports to an execution.
     * 
     * <p><b>204</b> - No Content
     * @param executionId  (required)
     * @param projectId  (required)
     * @param batch  (required)
     * @param folderPath  (required)
     * @param isEnd  (required)
     * @param fileName  (required)
     * @param uploadedPath  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> uploadTestNGReportsWithHttpInfo(Long executionId, Long projectId, String batch, String folderPath, Boolean isEnd, String fileName, String uploadedPath) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'executionId' when calling uploadTestNGReports");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling uploadTestNGReports");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batch' when calling uploadTestNGReports");
        }
        
        // verify the required parameter 'folderPath' is set
        if (folderPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folderPath' when calling uploadTestNGReports");
        }
        
        // verify the required parameter 'isEnd' is set
        if (isEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isEnd' when calling uploadTestNGReports");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling uploadTestNGReports");
        }
        
        // verify the required parameter 'uploadedPath' is set
        if (uploadedPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadedPath' when calling uploadTestNGReports");
        }
        
        String path = apiClient.expandPath("/api/v1/testng/test-reports", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "executionId", executionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "batch", batch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "folderPath", folderPath));
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
