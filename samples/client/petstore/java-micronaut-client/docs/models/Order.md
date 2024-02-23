

# Order

The class is defined in **[Order.java](../../src/main/java/org/openapitools/model/Order.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` |  |  [optional property]
**petId** | `Long` |  |  [optional property]
**quantity** | `Integer` |  |  [optional property]
**shipDate** | `OffsetDateTime` |  |  [optional property]
**status** | [**Status**](#Status) | Order Status |  [optional property]
**complete** | `Boolean` |  |  [optional property]





## Status

Name | Value
---- | -----
PLACED | `"placed"`
APPROVED | `"approved"`
DELIVERED | `"delivered"`



