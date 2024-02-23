/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.time.OffsetDateTime;
import org.openapitools.client.model.User;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/user")

public interface UserApi  {

    /**
     * Create user
     * This can only be done by the logged in user.
     */
    @POST
    
    @Consumes({ "application/json" })
    void createUser(User user) throws ApiException, ProcessingException;

    /**
     * Creates list of users with given input array
     * 
     */
    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    void createUsersWithArrayInput(List<User> user) throws ApiException, ProcessingException;

    /**
     * Creates list of users with given input array
     * 
     */
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    void createUsersWithListInput(List<User> user) throws ApiException, ProcessingException;

    /**
     * Delete user
     * This can only be done by the logged in user.
     */
    @DELETE
    @Path("/{username}")
    void deleteUser(@PathParam("username") String username) throws ApiException, ProcessingException;

    /**
     * Get user by user name
     * 
     */
    @GET
    @Path("/{username}")
    @Produces({ "application/xml", "application/json" })
    User getUserByName(@PathParam("username") String username) throws ApiException, ProcessingException;

    /**
     * Logs user into the system
     * 
     */
    @GET
    @Path("/login")
    @Produces({ "application/xml", "application/json" })
    String loginUser(@QueryParam("username") String username, @QueryParam("password") String password) throws ApiException, ProcessingException;

    /**
     * Logs out current logged in user session
     * 
     */
    @GET
    @Path("/logout")
    void logoutUser() throws ApiException, ProcessingException;

    /**
     * Updated user
     * This can only be done by the logged in user.
     */
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json" })
    void updateUser(@PathParam("username") String username, User user) throws ApiException, ProcessingException;
}
