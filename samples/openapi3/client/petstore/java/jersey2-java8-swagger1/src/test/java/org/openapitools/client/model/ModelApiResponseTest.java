/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
<<<<<<<< HEAD:samples/client/petstore/java-helidon-client/se/src/test/java/org/openapitools/client/model/FooGetDefaultResponseTest.java
import org.openapitools.client.model.Foo;
========
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/openapi3/client/petstore/java/jersey2-java8-swagger1/src/test/java/org/openapitools/client/model/ModelApiResponseTest.java

import org.junit.jupiter.api.Test;


/**
<<<<<<<< HEAD:samples/client/petstore/java-helidon-client/se/src/test/java/org/openapitools/client/model/FooGetDefaultResponseTest.java
 * Model tests for FooGetDefaultResponse
 */
public class FooGetDefaultResponseTest {
    private final FooGetDefaultResponse model = new FooGetDefaultResponse();

    /**
     * Model tests for FooGetDefaultResponse
     */
    @Test
    public void testFooGetDefaultResponse() {
        // TODO: test FooGetDefaultResponse
========
 * Model tests for ModelApiResponse
 */
public class ModelApiResponseTest {
    private final ModelApiResponse model = new ModelApiResponse();

    /**
     * Model tests for ModelApiResponse
     */
    @Test
    public void testModelApiResponse() {
        // TODO: test ModelApiResponse
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/openapi3/client/petstore/java/jersey2-java8-swagger1/src/test/java/org/openapitools/client/model/ModelApiResponseTest.java
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        // TODO: test code
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        // TODO: test message
    }

}
