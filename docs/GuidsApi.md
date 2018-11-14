# GuidsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](GuidsApi.md#addGuidAlias) | **POST** /api/v1/id4ns/{id4n}/alias/{aliasType} | Add alias for GUID or Collection
[**createGuid**](GuidsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
[**getCollections**](GuidsApi.md#getCollections) | **GET** /api/v1/id4ns/{id4n}/collections | Retrieve collections of an ID
[**getGuid**](GuidsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
[**getGuidAliases**](GuidsApi.md#getGuidAliases) | **GET** /api/v1/id4ns/{id4n}/alias | Get all aliases for the given GUID or Collection.
[**getGuidsWithoutCollection**](GuidsApi.md#getGuidsWithoutCollection) | **GET** /api/v1/guids/withoutCollection | Retrieve GUIDs not in any collection
[**getId4n**](GuidsApi.md#getId4n) | **GET** /api/v1/id4ns/{id4n} | Retrieve ID4n information
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

<a name="getCollections"></a>
# **getCollections**
> PaginatedGuidCollectionResponse getCollections(id4n, organizationId, offset, limit)

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
    PaginatedGuidCollectionResponse result = apiInstance.getCollections(id4n, organizationId, offset, limit);
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

[**PaginatedGuidCollectionResponse**](PaginatedGuidCollectionResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGuid"></a>
# **getGuid**
> Guid getGuid(id4n)

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
try {
    Guid result = apiInstance.getGuid(id4n);
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
> Id4nPresentation getId4n(id4n)

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
try {
    Id4nPresentation result = apiInstance.getId4n(id4n);
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

### Return type

[**Id4nPresentation**](Id4nPresentation.md)

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

