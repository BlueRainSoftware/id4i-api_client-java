
# Id4nPresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** | The UTC unix timestamp of when this ID has been created | 
**id4n** | **String** | The ID | 
**label** | **String** |  |  [optional]
**nextScanOwnership** | **Boolean** | Indicates if next scan ownership is active or not. If privileges are missing or the type of object doesn&#39;t support NSO this value is null. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of ID | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GUID | &quot;GUID&quot;
ROUTING_COLLECTION | &quot;ROUTING_COLLECTION&quot;
LOGISTIC_COLLECTION | &quot;LOGISTIC_COLLECTION&quot;
LABELLED_COLLECTION | &quot;LABELLED_COLLECTION&quot;



