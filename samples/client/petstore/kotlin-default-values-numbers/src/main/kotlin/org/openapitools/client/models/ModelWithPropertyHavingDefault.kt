/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param propertyInt 
 * @param propertyLong 
 * @param propertyFloat1 
 * @param propertyFloat2 
 * @param propertyFloat3 
 * @param propertyDouble1 
 * @param propertyDouble2 
 * @param propertyDouble3 
 */


data class ModelWithPropertyHavingDefault (

    @SerializedName("propertyInt")
    val propertyInt: kotlin.Int? = 0,

    @SerializedName("propertyLong")
    val propertyLong: kotlin.Long? = 0L,

    @SerializedName("propertyFloat1")
    val propertyFloat1: kotlin.Float? = 0f,

    @SerializedName("propertyFloat2")
    val propertyFloat2: kotlin.Float? = 0.0f,

    @SerializedName("propertyFloat3")
    val propertyFloat3: kotlin.Float? = 0.01f,

    @SerializedName("propertyDouble1")
    val propertyDouble1: kotlin.Double? = 0.0,

    @SerializedName("propertyDouble2")
    val propertyDouble2: kotlin.Double? = 0.0,

    @SerializedName("propertyDouble3")
    val propertyDouble3: kotlin.Double? = 0.01

)

