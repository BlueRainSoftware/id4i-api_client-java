
# Id4nPresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** | The UTC unix timestamp of when this ID has been created |  [optional]
**holderOrganizationId** | **String** | Organization namespace of the holder of the ID |  [optional]
**id4n** | **String** | The ID |  [optional]
**label** | **String** |  |  [optional]
**ownerOrganizationId** | **String** | Organization namespace of the ID owner |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the organization |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of ID |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GUID | &quot;GUID&quot;
ROUTING_COLLECTION | &quot;ROUTING_COLLECTION&quot;
LOGISTIC_COLLECTION | &quot;LOGISTIC_COLLECTION&quot;
LABELLED_COLLECTION | &quot;LABELLED_COLLECTION&quot;



