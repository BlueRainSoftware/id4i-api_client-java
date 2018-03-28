
# Id4nPresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** | The UTC unix timestamp of when this ID has been created | 
**holderOrganizationId** | **Long** | ${Id4nPresentation.Guid.holderOrganizationId} |  [optional]
**id4n** | **String** | The ID | 
**label** | **String** |  |  [optional]
**ownerOrganizationId** | **Long** | ${Id4nPresentation.Guid.ownerOrganizationId} |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of ID | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GUID | &quot;GUID&quot;
ROUTING_COLLECTION | &quot;ROUTING_COLLECTION&quot;
LOGISTIC_COLLECTION | &quot;LOGISTIC_COLLECTION&quot;
LABELLED_COLLECTION | &quot;LABELLED_COLLECTION&quot;



