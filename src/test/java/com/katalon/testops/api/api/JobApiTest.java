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

import com.katalon.testops.api.model.BuildLog;
import com.katalon.testops.api.model.JobResource;
import com.katalon.testops.api.model.PageJobResource;
import com.katalon.testops.api.model.Pageable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
@Ignore
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * Cancels a Job.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelTest() {
        String id = null;
        api.cancel(id);

        // TODO: test validations
    }
    
    /**
     * Returns a Job detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void get12Test() {
        Long id = null;
        JobResource response = api.get12(id);

        // TODO: test validations
    }
    
    /**
     * Returns the next queued Job of an Agent.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTest() {
        String uuid = null;
        Long teamId = null;
        JobResource response = api.getJob(uuid, teamId);

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
    public void getLatestJobsTest() {
        Long id = null;
        Pageable pageable = null;
        PageJobResource response = api.getLatestJobs(id, pageable);

        // TODO: test validations
    }
    
    /**
     * Returns a Job&#39;s log.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogTest() {
        String id = null;
        List<BuildLog> response = api.getLog(id);

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
    public void getRunningJobsTest() {
        Long id = null;
        Pageable pageable = null;
        PageJobResource response = api.getRunningJobs(id, pageable);

        // TODO: test validations
    }
    
    /**
     * Updates a Job detail. Returns the updated Job detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobTest() {
        JobResource jobResource = null;
        JobResource response = api.updateJob(jobResource);

        // TODO: test validations
    }
    
}
