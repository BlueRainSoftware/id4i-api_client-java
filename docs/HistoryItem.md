
# HistoryItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **String** | Originator of the history item | 
**sequenceId** | **Integer** | Forms the primary key of the history item together with the GUID and the organizationId |  [optional]
**timestamp** | **Long** | History item timestamp |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the history item | 
**visibility** | [**Visibility**](Visibility.md) | History item visibility restrictions |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
DESTROYED | &quot;DESTROYED&quot;
RECYCLED | &quot;RECYCLED&quot;
SHIPMENT_PREPARED | &quot;SHIPMENT_PREPARED&quot;
STORED | &quot;STORED&quot;
RETRIEVED_FROM_STORAGE | &quot;RETRIEVED_FROM_STORAGE&quot;
PACKAGED | &quot;PACKAGED&quot;
DISPATCHED | &quot;DISPATCHED&quot;
RECEIVED | &quot;RECEIVED&quot;
REPROCESSING_STARTED | &quot;REPROCESSING_STARTED&quot;
REPROCESSING_FINISHED | &quot;REPROCESSING_FINISHED&quot;
DISASSEMBLED | &quot;DISASSEMBLED&quot;
MAINTENANCE_STARTED | &quot;MAINTENANCE_STARTED&quot;
MAINTENANCE_FINISHED | &quot;MAINTENANCE_FINISHED&quot;



