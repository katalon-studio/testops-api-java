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

import com.katalon.testops.model.ExecutionTestSuiteResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExecutionTestSuiteApi
 */
@Ignore
public class ExecutionTestSuiteApiTest {

    private final ExecutionTestSuiteApi api = new ExecutionTestSuiteApi();

    /**
     * Returns an Execution Test Suite detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void get3Test() {
        String id = null;
        ExecutionTestSuiteResource response = api.get3(id);

        // TODO: test validations
    }
}
