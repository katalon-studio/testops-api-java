package com.katalon.testops.api;

import com.katalon.testops.ApiClient;

import com.katalon.testops.model.PageBaseResource;
import com.katalon.testops.model.SearchConfigResource;
import com.katalon.testops.model.SearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@Component("com.katalon.testops.api.SearchApi")
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
     * @param q The q parameter
     * @return PageBaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBaseResource search(String q) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling search");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<PageBaseResource> returnType = new ParameterizedTypeReference<PageBaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     * 
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return PageBaseResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBaseResource search1(SearchRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling search1");
        }
        String path = UriComponentsBuilder.fromPath("/api/v1/search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<PageBaseResource> returnType = new ParameterizedTypeReference<PageBaseResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns the search configuration.
     * 
     * <p><b>200</b> - OK
     * @return Map&lt;String, SearchConfigResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, SearchConfigResource> test() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/api/v1/search/info").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicScheme" };

        ParameterizedTypeReference<Map<String, SearchConfigResource>> returnType = new ParameterizedTypeReference<Map<String, SearchConfigResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
