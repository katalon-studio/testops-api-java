package com.katalon.testops.api.api;

import com.katalon.testops.api.ApiClient;

import com.katalon.testops.api.model.PageBaseResource;
import com.katalon.testops.api.model.SearchConfigResource;
import com.katalon.testops.api.model.SearchRequest;

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
@Component("com.katalon.testops.api.api.SearchApi")
public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(new ApiClient());
    }

    @Autowired
    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     * 
     * <p><b>200</b> - OK
     * @param q  (required)
     * @return PageBaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBaseResource search(String q) throws RestClientException {
        return searchWithHttpInfo(q).getBody();
    }

    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     * 
     * <p><b>200</b> - OK
     * @param q  (required)
     * @return ResponseEntity&lt;PageBaseResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageBaseResource> searchWithHttpInfo(String q) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling search");
        }
        
        String path = apiClient.expandPath("/api/v1/search", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<PageBaseResource> returnType = new ParameterizedTypeReference<PageBaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     * 
     * <p><b>200</b> - OK
     * @param searchRequest  (required)
     * @return PageBaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBaseResource search1(SearchRequest searchRequest) throws RestClientException {
        return search1WithHttpInfo(searchRequest).getBody();
    }

    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     * 
     * <p><b>200</b> - OK
     * @param searchRequest  (required)
     * @return ResponseEntity&lt;PageBaseResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageBaseResource> search1WithHttpInfo(SearchRequest searchRequest) throws RestClientException {
        Object postBody = searchRequest;
        
        // verify the required parameter 'searchRequest' is set
        if (searchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchRequest' when calling search1");
        }
        
        String path = apiClient.expandPath("/api/v1/search", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PageBaseResource> returnType = new ParameterizedTypeReference<PageBaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Returns the search configuration.
     * 
     * <p><b>200</b> - OK
     * @return Map&lt;String, SearchConfigResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, SearchConfigResource> test() throws RestClientException {
        return testWithHttpInfo().getBody();
    }

    /**
     * Returns the search configuration.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;Map&lt;String, SearchConfigResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, SearchConfigResource>> testWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/api/v1/search/info", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<Map<String, SearchConfigResource>> returnType = new ParameterizedTypeReference<Map<String, SearchConfigResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
