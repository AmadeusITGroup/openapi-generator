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

package org.openapitools.client.models.room

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import org.openapitools.client.models.*


@Entity(tableName = "ModelApiResponse")
/**
* Room model for Describes the result of uploading an image resource
* @param code 
* @param type 
* @param message 
*/
data class ModelApiResponseRoomModel (
    @PrimaryKey(autoGenerate = true) var roomTableId: Int,
    
    var code: kotlin.Int? = null,
    var type: kotlin.String? = null,
    var message: kotlin.String? = null,
    
    ) {

    companion object { }

        fun toApiModel(): ModelApiResponse = ModelApiResponse(
        code = this.code,
        type = this.type,
        message = this.message,
        )
}
