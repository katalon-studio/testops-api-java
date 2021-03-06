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

import com.katalon.testops.api.model.PageTeamResource;
import com.katalon.testops.api.model.Pageable;
import com.katalon.testops.api.model.TeamResource;
import com.katalon.testops.api.model.UserTeamResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamApi
 */
@Ignore
public class TeamApiTest {

    private final TeamApi api = new TeamApi();

    
    /**
     * Creates a new Team. Returns the created Team detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void create3Test() {
        TeamResource teamResource = null;
        TeamResource response = api.create3(teamResource);

        // TODO: test validations
    }
    
    /**
     * Delete a Team. Returns the delete Team detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delete4Test() {
        Long id = null;
        TeamResource response = api.delete4(id);

        // TODO: test validations
    }
    
    /**
     * Returns a Team detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void get7Test() {
        Long id = null;
        TeamResource response = api.get7(id);

        // TODO: test validations
    }
    
    /**
     * Returns all Teams of the current User.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void list2Test() {
        Pageable pageable = null;
        PageTeamResource response = api.list2(pageable);

        // TODO: test validations
    }
    
    /**
     * Updates a Team detail. Returns the updated Team detail.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void update4Test() {
        TeamResource teamResource = null;
        TeamResource response = api.update4(teamResource);

        // TODO: test validations
    }
    
    /**
     * Updates the role of a User in a Team. Returns the updated detail.
     *
     * The user issuing this request must be the Admin of the team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTeamTest() {
        UserTeamResource userTeamResource = null;
        UserTeamResource response = api.updateUserTeam(userTeamResource);

        // TODO: test validations
    }
    
}
