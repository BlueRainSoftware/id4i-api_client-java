
# Guid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTimestamp** | **Long** | The UTC unix timestamp of when this GUID has been created |  [optional]
**holderOrganizationId** | **String** | Organization namespace of the GUID holder |  [optional]
**id4n** | **String** | The ID |  [optional]
**ownerOrganizationId** | **String** | Organization namespace of the GUID owner |  [optional]
**physicalState** | [**PhysicalStateEnum**](#PhysicalStateEnum) | Physical attachment state of the GUID |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the organization |  [optional]


<a name="PhysicalStateEnum"></a>
## Enum: PhysicalStateEnum
Name | Value
---- | -----
UNATTACHED | &quot;UNATTACHED&quot;
ATTACHED | &quot;ATTACHED&quot;
DETACHED | &quot;DETACHED&quot;



