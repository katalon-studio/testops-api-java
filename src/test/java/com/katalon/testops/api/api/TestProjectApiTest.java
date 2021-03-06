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

import com.katalon.testops.api.model.BuildInfo;
import com.katalon.testops.api.model.GitRepositoryResource;
import com.katalon.testops.api.model.SchedulerResource;
import com.katalon.testops.api.model.TestProjectResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestProjectApi
 */
@Ignore
public class TestProjectApiTest {

    private final TestProjectApi api = new TestProjectApi();

    
    /**
     * Creates a new schedule for a Test Plan. Returns the created schedule detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void create6Test() {
        Long id = null;
        SchedulerResource schedulerResource = null;
        SchedulerResource response = api.create6(id, schedulerResource);

        // TODO: test validations
    }
    
    /**
     * Creates a Git Test Project. Returns the Git Test Project detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGitRepoTest() {
        GitRepositoryResource gitRepositoryResource = null;
        GitRepositoryResource response = api.createGitRepo(gitRepositoryResource);

        // TODO: test validations
    }
    
    /**
     * Creates a new sample Test Project. Returns the created Test Project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSampleTest() {
        String name = null;
        String type = null;
        Long projectId = null;
        TestProjectResource response = api.createSample(name, type, projectId);

        // TODO: test validations
    }
    
    /**
     * Deletes a Test Project. Returns the deleted Test Project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delete6Test() {
        Long id = null;
        TestProjectResource response = api.delete6(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a schedule. Returns the deleted schedule detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delete7Test() {
        Long id = null;
        Long schedulerId = null;
        SchedulerResource response = api.delete7(id, schedulerId);

        // TODO: test validations
    }
    
    /**
     * Downloads a Test Project package. Returns the latest Test Project package file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void download4Test() {
        Long id = null;
        api.download4(id);

        // TODO: test validations
    }
    
    /**
     * Returns a Test Project detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void get17Test() {
        Long id = null;
        TestProjectResource response = api.get17(id);

        // TODO: test validations
    }
    
    /**
     * Returns a schedule detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchedulerTest() {
        Long id = null;
        Long schedulerId = null;
        SchedulerResource response = api.getScheduler(id, schedulerId);

        // TODO: test validations
    }
    
    /**
     * Returns a Git Test Project detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestProjectGitTest() {
        Long testProjectGitId = null;
        GitRepositoryResource response = api.getTestProjectGit(testProjectGitId);

        // TODO: test validations
    }
    
    /**
     * Refresh Test Suite Collection list of Git Test Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshTSCTest() {
        Long id = null;
        api.refreshTSC(id);

        // TODO: test validations
    }
    
    /**
     * Executes a Test Plan. Returns the build information.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runTest() {
        Long id = null;
        List<BuildInfo> response = api.run(id);

        // TODO: test validations
    }
    
    /**
     * Updates a Test Project detail. Returns the updated Test Project detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void update10Test() {
        Long id = null;
        TestProjectResource testProjectResource = null;
        TestProjectResource response = api.update10(id, testProjectResource);

        // TODO: test validations
    }
    
    /**
     * Updates a schedule detail. Returns the updated schedule detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void update9Test() {
        Long id = null;
        Long schedulerId = null;
        SchedulerResource schedulerResource = null;
        SchedulerResource response = api.update9(id, schedulerId, schedulerResource);

        // TODO: test validations
    }
    
    /**
     * Updates a Git Test Project detail. Returns the updated Git Test Project detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGitRepoTest() {
        GitRepositoryResource gitRepositoryResource = null;
        GitRepositoryResource response = api.updateGitRepo(gitRepositoryResource);

        // TODO: test validations
    }
    
    /**
     * Update a Test Project package. Returns the updated Test Project detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePackageTest() {
        Long id = null;
        String batch = null;
        String folderPath = null;
        String fileName = null;
        String uploadedPath = null;
        TestProjectResource response = api.updatePackage(id, batch, folderPath, fileName, uploadedPath);

        // TODO: test validations
    }
    
    /**
     * Creates a new Test Project. Returns the created Test Project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upload1Test() {
        String name = null;
        String projectId = null;
        String batch = null;
        String folderPath = null;
        String fileName = null;
        String uploadedPath = null;
        String description = null;
        TestProjectResource response = api.upload1(name, projectId, batch, folderPath, fileName, uploadedPath, description);

        // TODO: test validations
    }
    
}
