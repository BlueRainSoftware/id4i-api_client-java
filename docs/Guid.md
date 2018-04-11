
# Guid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** | The UTC unix timestamp of when this GUID has been created |  [optional]
**holderOrganizationId** | **Long** | Organization ID of the GUID holder |  [optional]
**id4n** | **String** | The ID |  [optional]
**ownerOrganizationId** | **Long** | Organization ID of the GUID owner |  [optional]
**physicalState** | [**PhysicalStateEnum**](#PhysicalStateEnum) | Physical attachment state of the GUID |  [optional]


<a name="PhysicalStateEnum"></a>
## Enum: PhysicalStateEnum
Name | Value
---- | -----
UNATTACHED | &quot;UNATTACHED&quot;
ATTACHED | &quot;ATTACHED&quot;
DETACHED | &quot;DETACHED&quot;



