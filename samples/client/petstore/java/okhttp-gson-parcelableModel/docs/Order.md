

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**petId** | **Long** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**shipDate** | **OffsetDateTime** |  |  [optional] |
|**status** | [**Status**](#Status) | Order Status |  [optional] |
|**complete** | **Boolean** |  |  [optional] |



## Enum: Status

| Name | Value |
|---- | -----|
| PLACED | &quot;placed&quot; |
| APPROVED | &quot;approved&quot; |
| DELIVERED | &quot;delivered&quot; |


## Implemented Interfaces

* Parcelable


