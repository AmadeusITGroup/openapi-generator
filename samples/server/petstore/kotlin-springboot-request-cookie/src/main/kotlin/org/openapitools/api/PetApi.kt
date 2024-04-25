/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0-amadeus).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.api

import org.openapitools.model.ModelApiResponse
import org.openapitools.model.Pet
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.http.server.reactive.ServerHttpRequest

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:/v2}")
interface PetApi {

    @Operation(
        tags = ["pet",],
        summary = "Add a new pet to the store",
        operationId = "addPet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful operation"),
            ApiResponse(responseCode = "405", description = "Invalid input")
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "write:pets", "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pet"],
            consumes = ["application/json", "application/xml"]
    )
    fun addPet(@Parameter(description = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody pet: Pet,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "Deletes a pet",
        operationId = "deletePet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful operation"),
            ApiResponse(responseCode = "400", description = "Invalid pet value")
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "write:pets", "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.DELETE],
            value = ["/pet/{petId}"]
    )
    fun deletePet(@Parameter(description = "Pet id to delete", required = true) @PathVariable("petId") petId: kotlin.Long,@Parameter(description = "", `in` = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) apiKey: kotlin.String?,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "Finds Pets by status",
        operationId = "findPetsByStatus",
        description = """Multiple status values can be provided with comma separated strings""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Pet::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid status value")
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "write:pets", "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/pet/findByStatus"],
            produces = ["application/xml", "application/json"]
    )
    fun findPetsByStatus(@NotNull @Parameter(description = "Status values that need to be considered for filter", required = true, schema = Schema(allowableValues = ["available", "pending", "sold"])) @Valid @RequestParam(value = "status", required = true) status: kotlin.collections.List<kotlin.String>,serverHttpRequest: ServerHttpRequest): ResponseEntity<List<Pet>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "Finds Pets by tags",
        operationId = "findPetsByTags",
        description = """Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Pet::class)))]),
            ApiResponse(responseCode = "400", description = "Invalid tag value")
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/pet/findByTags"],
            produces = ["application/xml", "application/json"]
    )
    fun findPetsByTags(@NotNull @Parameter(description = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) tags: kotlin.collections.List<kotlin.String>,serverHttpRequest: ServerHttpRequest): ResponseEntity<List<Pet>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "Find pet by ID",
        operationId = "getPetById",
        description = """Returns a single pet""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Pet::class))]),
            ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            ApiResponse(responseCode = "404", description = "Pet not found")
        ],
        security = [ SecurityRequirement(name = "api_key") ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/pet/{petId}"],
            produces = ["application/xml", "application/json"]
    )
    fun getPetById(@Parameter(description = "ID of pet to return", required = true) @PathVariable("petId") petId: kotlin.Long,serverHttpRequest: ServerHttpRequest): ResponseEntity<Pet> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "Update an existing pet",
        operationId = "updatePet",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful operation"),
            ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            ApiResponse(responseCode = "404", description = "Pet not found"),
            ApiResponse(responseCode = "405", description = "Validation exception")
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "write:pets", "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/pet"],
            consumes = ["application/json", "application/xml"]
    )
    fun updatePet(@Parameter(description = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody pet: Pet,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "Updates a pet in the store with form data",
        operationId = "updatePetWithForm",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful operation"),
            ApiResponse(responseCode = "405", description = "Invalid input")
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "write:pets", "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pet/{petId}"],
            consumes = ["application/x-www-form-urlencoded"]
    )
    fun updatePetWithForm(@Parameter(description = "ID of pet that needs to be updated", required = true) @PathVariable("petId") petId: kotlin.Long,@Parameter(description = "Updated name of the pet") @RequestParam(value = "name", required = false) name: kotlin.String? ,@Parameter(description = "Updated status of the pet") @RequestParam(value = "status", required = false) status: kotlin.String? ,serverHttpRequest: ServerHttpRequest): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        tags = ["pet",],
        summary = "uploads an image",
        operationId = "uploadFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ModelApiResponse::class))])
        ],
        security = [ SecurityRequirement(name = "petstore_auth", scopes = [ "write:pets", "read:pets" ]) ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pet/{petId}/uploadImage"],
            produces = ["application/json"],
            consumes = ["multipart/form-data"]
    )
    fun uploadFile(@Parameter(description = "ID of pet to update", required = true) @PathVariable("petId") petId: kotlin.Long,@Parameter(description = "Additional data to pass to server") @RequestParam(value = "additionalMetadata", required = false) additionalMetadata: kotlin.String? ,@Parameter(description = "file to upload") @Valid @RequestPart("file", required = false) file: org.springframework.core.io.Resource?,serverHttpRequest: ServerHttpRequest): ResponseEntity<ModelApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
