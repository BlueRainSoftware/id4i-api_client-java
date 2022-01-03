# GuidsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](GuidsApi.md#addGuidAlias) | **POST** /api/v1/id4ns/{id4n}/alias/{aliasType} | Add alias for GUID or Collection
[**createGuid**](GuidsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
[**deleteProperties**](GuidsApi.md#deleteProperties) | **DELETE** /api/v1/id4ns/{id4n}/properties | Delete ID4n properties
[**getCollections**](GuidsApi.md#getCollections) | **GET** /api/v1/id4ns/{id4n}/collections | Retrieve collections of an ID
[**getGuid**](GuidsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
[**getGuidAliases**](GuidsApi.md#getGuidAliases) | **GET** /api/v1/id4ns/{id4n}/alias | Get all aliases for the given GUID or Collection.
[**getGuidsWithoutCollection**](GuidsApi.md#getGuidsWithoutCollection) | **GET** /api/v1/guids/withoutCollection | Retrieve GUIDs not in any collection
[**getId4n**](GuidsApi.md#getId4n) | **GET** /api/v1/id4ns/{id4n} | Retrieve ID4n information
[**getProperties**](GuidsApi.md#getProperties) | **GET** /api/v1/id4ns/{id4n}/properties | Retrieve ID4n properties
[**importGS1Codes**](GuidsApi.md#importGS1Codes) | **POST** /api/v1/import/gs1 | Import GS1/MAPP codes
[**patchProperties**](GuidsApi.md#patchProperties) | **PATCH** /api/v1/id4ns/{id4n}/properties | Patch ID4n properties
[**removeGuidAlias**](GuidsApi.md#removeGuidAlias) | **DELETE** /api/v1/id4ns/{id4n}/alias/{aliasType} | Remove aliases from GUID or Collection
[**updateGuid**](GuidsApi.md#updateGuid) | **PATCH** /api/v1/guids/{id4n} | Change GUID information.


<a name="addGuidAlias"></a>
# **addGuidAlias**
> addGuidAlias(id4n, aliasType, alias)

Add alias for GUID or Collection

Adds or replaces aliases for single ID4ns (alias type item and mapp) or groups of ID4ns (alias types gtin, ean and article)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The GUID or Collection to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
GuidAlias alias = new GuidAlias(); // GuidAlias | The alias to add or update
try {
    apiInstance.addGuidAlias(id4n, aliasType, alias);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#addGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID or Collection to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid, tracking, eclass, unspsc, product, material, reference]
 **alias** | [**GuidAlias**](GuidAlias.md)| The alias to add or update |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createGuid"></a>
# **createGuid**
> ListOfId4ns createGuid(createGUIDInfo)

Create GUID(s)

Creating one or more GUIDs with a specified length.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
CreateGuidRequest createGUIDInfo = new CreateGuidRequest(); // CreateGuidRequest | GUID creation model
try {
    ListOfId4ns result = apiInstance.createGuid(createGUIDInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#createGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGUIDInfo** | [**CreateGuidRequest**](CreateGuidRequest.md)| GUID creation model |

### Return type

[**ListOfId4ns**](ListOfId4ns.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteProperties"></a>
# **deleteProperties**
> deleteProperties(id4n, organizationId, properties)

Delete ID4n properties

Partial deletion of id4n properties. If the property does not exist, it will be ignored.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The id4n
String organizationId = "organizationId_example"; // String | The organization namespace to work on while deleting the properties.
List<String> properties = Arrays.asList(new List<String>()); // List<String> | A set of property keys to delete.
try {
    apiInstance.deleteProperties(id4n, organizationId, properties);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#deleteProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The id4n |
 **organizationId** | **String**| The organization namespace to work on while deleting the properties. |
 **properties** | **List&lt;String&gt;**| A set of property keys to delete. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getCollections"></a>
# **getCollections**
> PaginatedResponseOfGuidCollection getCollections(id4n, organizationId, offset, limit)

Retrieve collections of an ID

Retrieving all owned or holding collections the specified id4n is assigned to.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The ID which the collections should contain
String organizationId = "organizationId_example"; // String | The organization holding the collections.
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfGuidCollection result = apiInstance.getCollections(id4n, organizationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#getCollections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The ID which the collections should contain |
 **organizationId** | **String**| The organization holding the collections. | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfGuidCollection**](PaginatedResponseOfGuidCollection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGuid"></a>
# **getGuid**
> Guid getGuid(id4n, organizationId)

Retrieve GUID information

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The GUID number
String organizationId = "organizationId_example"; // String | The organization namespace to resolve.
try {
    Guid result = apiInstance.getGuid(id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#getGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID number |
 **organizationId** | **String**| The organization namespace to resolve. | [optional]

### Return type

[**Guid**](Guid.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGuidAliases"></a>
# **getGuidAliases**
> Map&lt;String, String&gt; getGuidAliases(id4n)

Get all aliases for the given GUID or Collection.

Looks up the alias for each alias type (group and single) and returns a map of all aliases found.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The GUID or Collection to operate on
try {
    Map<String, String> result = apiInstance.getGuidAliases(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#getGuidAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID or Collection to operate on |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGuidsWithoutCollection"></a>
# **getGuidsWithoutCollection**
> PaginatedResponseOfGuid getGuidsWithoutCollection(organizationId, offset, limit)

Retrieve GUIDs not in any collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization to search GUIDs for
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfGuid result = apiInstance.getGuidsWithoutCollection(organizationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#getGuidsWithoutCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization to search GUIDs for |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfGuid**](PaginatedResponseOfGuid.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getId4n"></a>
# **getId4n**
> Id4nPresentation getId4n(id4n, organizationId)

Retrieve ID4n information

Retrieving basic information about an ID like the type and the creation time.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The ID to resolve to
String organizationId = "organizationId_example"; // String | The organization namespace to resolve.
try {
    Id4nPresentation result = apiInstance.getId4n(id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#getId4n");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The ID to resolve to |
 **organizationId** | **String**| The organization namespace to resolve. | [optional]

### Return type

[**Id4nPresentation**](Id4nPresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getProperties"></a>
# **getProperties**
> Map&lt;String, String&gt; getProperties(id4n, organizationId)

Retrieve ID4n properties

List all properties of an id4n.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The id4n
String organizationId = "organizationId_example"; // String | The organization namespace.
try {
    Map<String, String> result = apiInstance.getProperties(id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#getProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The id4n |
 **organizationId** | **String**| The organization namespace. | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="importGS1Codes"></a>
# **importGS1Codes**
> importGS1Codes(importGS1CodesRequest)

Import GS1/MAPP codes

Importing GS1/MAPP codes that contain unique components.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
ImportGS1CodesRequest importGS1CodesRequest = new ImportGS1CodesRequest(); // ImportGS1CodesRequest | The information how the MAPP codes should be imported and the list of MAPP codes
try {
    apiInstance.importGS1Codes(importGS1CodesRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#importGS1Codes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importGS1CodesRequest** | [**ImportGS1CodesRequest**](ImportGS1CodesRequest.md)| The information how the MAPP codes should be imported and the list of MAPP codes |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="patchProperties"></a>
# **patchProperties**
> patchProperties(id4n, organizationId, properties)

Patch ID4n properties

Partial updating of id4n properties. If a property contains a null value the property will be deleted other values will be saved and overwritten if they already exist.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The id4n
String organizationId = "organizationId_example"; // String | The organization namespace to work on while patching the properties.
Object properties = null; // Object | The properties to update.
try {
    apiInstance.patchProperties(id4n, organizationId, properties);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#patchProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The id4n |
 **organizationId** | **String**| The organization namespace to work on while patching the properties. |
 **properties** | **Object**| The properties to update. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeGuidAlias"></a>
# **removeGuidAlias**
> removeGuidAlias(id4n, aliasType)

Remove aliases from GUID or Collection

Remove the alias of the given type

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The GUID or Collection to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
try {
    apiInstance.removeGuidAlias(id4n, aliasType);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#removeGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID or Collection to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid, tracking, eclass, unspsc, product, material, reference]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateGuid"></a>
# **updateGuid**
> Object updateGuid(id4n, request)

Change GUID information.

Allows ownership transfer.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GuidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GuidsApi apiInstance = new GuidsApi();
String id4n = "id4n_example"; // String | The GUID number
Guid request = new Guid(); // Guid | request
try {
    Object result = apiInstance.updateGuid(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GuidsApi#updateGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID number |
 **request** | [**Guid**](Guid.md)| request |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

