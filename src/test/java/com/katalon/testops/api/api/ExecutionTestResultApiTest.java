/*
 * Katalon TestOps API reference
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.katalon.testops.api.api;

import com.katalon.testops.api.model.ExecutionTestResultResource;
import com.katalon.testops.api.model.IncidentExecutionTestResultResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExecutionTestResultApi
 */
@Ignore
public class ExecutionTestResultApiTest {

    private final ExecutionTestResultApi api = new ExecutionTestResultApi();

    
    /**
     * Returns an Execution Test Result detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void get2Test() {
        String id = null;
        ExecutionTestResultResource response = api.get2(id);

        // TODO: test validations
    }
    
    /**
     * Downloads a test result&#39;s log. Returns the log file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStdoutTest() {
        Long id = null;
        String response = api.getStdout(id);

        // TODO: test validations
    }
    
    /**
     * Link an Execution Test Result to a Task. Returns the created binding detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkIncidentsTest() {
        String id = null;
        IncidentExecutionTestResultResource incidentExecutionTestResultResource = null;
        IncidentExecutionTestResultResource response = api.linkIncidents(id, incidentExecutionTestResultResource);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void markAsRetestedTest() {
        String id = null;
        ExecutionTestResultResource response = api.markAsRetested(id);

        // TODO: test validations
    }
    
    /**
     * Unlink an Execution Test Result to a Task. Returns the deleted binding detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unlinkIncidentsTest() {
        String id = null;
        IncidentExecutionTestResultResource incidentExecutionTestResultResource = null;
        IncidentExecutionTestResultResource response = api.unlinkIncidents(id, incidentExecutionTestResultResource);

        // TODO: test validations
    }
    
}