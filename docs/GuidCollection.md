
# GuidCollection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** | The UTC unix timestamp of when this collection has been created |  [optional]
**holderOrganizationId** | **String** | Organization namespace of the holder of the collection |  [optional]
**id4n** | **String** | The ID |  [optional]
**label** | **String** |  |  [optional]
**ownerOrganizationId** | **String** | Organization namespace of the collection owner |  [optional]
**physicalState** | [**PhysicalStateEnum**](#PhysicalStateEnum) | Physical attachment state of the collection |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="PhysicalStateEnum"></a>
## Enum: PhysicalStateEnum
Name | Value
---- | -----
UNATTACHED | &quot;UNATTACHED&quot;
ATTACHED | &quot;ATTACHED&quot;
DETACHED | &quot;DETACHED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ROUTING_COLLECTION | &quot;ROUTING_COLLECTION&quot;
LOGISTIC_COLLECTION | &quot;LOGISTIC_COLLECTION&quot;
LABELLED_COLLECTION | &quot;LABELLED_COLLECTION&quot;



