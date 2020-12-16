/*
 * Katalon TestOps API reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.katalon.testops.api;

import com.katalon.testops.model.PageBaseResource;
import com.katalon.testops.model.SearchConfigResource;
import com.katalon.testops.model.SearchRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() {
        String q = null;
        PageBaseResource response = api.search(q);

        // TODO: test validations
    }
    /**
     * Queries the resources of a specific type by multiple conditions. Returns the pageable resources satisfying the query.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void search1Test() {
        SearchRequest body = null;
        PageBaseResource response = api.search1(body);

        // TODO: test validations
    }
    /**
     * Returns the search configuration.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testTest() {
        Map<String, SearchConfigResource> response = api.test();

        // TODO: test validations
    }
}
