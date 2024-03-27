/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0-amadeus).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.model.rest.RestBindingMode;

@Component
public class RestConfiguration extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
            .scheme("http")
            .host("petstore.swagger.io")
            .component("servlet")
            .bindingMode(RestBindingMode.auto)
                .dataFormatProperty("json.out.disableFeatures", "WRITE_DATES_AS_TIMESTAMPS")
            .clientRequestValidation(true)
            .apiProperty("api.title", "OpenAPI Petstore")
            .apiProperty("api.version", "1.0.0");
    }
}
