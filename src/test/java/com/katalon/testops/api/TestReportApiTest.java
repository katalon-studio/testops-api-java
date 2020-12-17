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

import com.katalon.testops.model.ExecutionResource;
import com.katalon.testops.model.TestRunResult;
import com.katalon.testops.model.UploadBatchFileResource;
import com.katalon.testops.model.UploadBatchResource;
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
        List<UploadBatchFileResource> body = null;
        Long projectId = null;
        String batch = null;
        List<UploadBatchResource> response = api.processMultipleS3File(body, projectId, batch);

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
        List<UploadBatchFileResource> body = null;
        Long projectId = null;
        String batch = null;
        api.processTestOpsReports(body, projectId, batch);

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
        TestRunResult body = null;
        Long projectId = null;
        ExecutionResource response = api.updateResult(body, projectId);

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
