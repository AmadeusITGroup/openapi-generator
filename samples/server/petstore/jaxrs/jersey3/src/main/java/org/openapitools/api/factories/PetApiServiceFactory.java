package org.openapitools.api.factories;

import org.openapitools.api.PetApiService;
import org.openapitools.api.impl.PetApiServiceImpl;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.4.0-amadeus")
public class PetApiServiceFactory {
    private static final PetApiService service = new PetApiServiceImpl();

    public static PetApiService getPetApi() {
        return service;
    }
}
