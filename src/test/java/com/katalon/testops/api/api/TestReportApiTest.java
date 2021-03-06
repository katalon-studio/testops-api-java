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

import com.katalon.testops.api.model.ExecutionResource;
import com.katalon.testops.api.model.TestRunResult;
import com.katalon.testops.api.model.UploadBatchFileResource;
import com.katalon.testops.api.model.UploadBatchResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestReportApi
 */
@Ignore
public class TestReportApiTest {

    private final TestReportApi api = new TestReportApi();

    
    /**
     * Saves and processes multiple uploaded Katalon reports.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processMultipleS3FileTest() {
        Long projectId = null;
        String batch = null;
        List<UploadBatchFileResource> uploadBatchFileResource = null;
        List<UploadBatchResource> response = api.processMultipleS3File(projectId, batch, uploadBatchFileResource);

        // TODO: test validations
    }
    
    /**
     * Saves and processes the uploaded Katalon reports.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processS3FileTest() {
        String projectId = null;
        String batch = null;
        String folderPath = null;
        String isEnd = null;
        String fileName = null;
        String uploadedPath = null;
        List<UploadBatchResource> response = api.processS3File(projectId, batch, folderPath, isEnd, fileName, uploadedPath);

        // TODO: test validations
    }
    
    /**
     * Saves and processes multiple uploaded TestOps reports.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processTestOpsReportsTest() {
        Long projectId = null;
        String batch = null;
        List<UploadBatchFileResource> uploadBatchFileResource = null;
        api.processTestOpsReports(projectId, batch, uploadBatchFileResource);

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
    public void updateResultTest() {
        Long projectId = null;
        TestRunResult testRunResult = null;
        ExecutionResource response = api.updateResult(projectId, testRunResult);

        // TODO: test validations
    }
    
    /**
     * Uploads and processes the JUnit reports to an Execution.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadJUnitReportsTest() {
        String projectId = null;
        String batch = null;
        String folderPath = null;
        String isEnd = null;
        String fileName = null;
        String uploadedPath = null;
        String sessionId = null;
        api.uploadJUnitReports(projectId, batch, folderPath, isEnd, fileName, uploadedPath, sessionId);

        // TODO: test validations
    }
    
    /**
     * Uploads and processes the TestNG reports to an execution.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadTestNGReportsTest() {
        Long executionId = null;
        Long projectId = null;
        String batch = null;
        String folderPath = null;
        Boolean isEnd = null;
        String fileName = null;
        String uploadedPath = null;
        api.uploadTestNGReports(executionId, projectId, batch, folderPath, isEnd, fileName, uploadedPath);

        // TODO: test validations
    }
    
}
