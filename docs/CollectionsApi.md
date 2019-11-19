# CollectionsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addElementsToCollection**](CollectionsApi.md#addElementsToCollection) | **POST** /api/v1/collections/{id4n}/elements | Add elements to collection
[**createCollection**](CollectionsApi.md#createCollection) | **POST** /api/v1/collections | Create collection
[**deleteCollection**](CollectionsApi.md#deleteCollection) | **DELETE** /api/v1/collections/{id4n} | Delete collection
[**deleteProperties**](CollectionsApi.md#deleteProperties) | **DELETE** /api/v1/id4ns/{id4n}/properties | Delete ID4n properties
[**findCollection**](CollectionsApi.md#findCollection) | **GET** /api/v1/collections/{id4n} | Find collection
[**getAllCollectionsOfOrganization**](CollectionsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
[**getProperties**](CollectionsApi.md#getProperties) | **GET** /api/v1/id4ns/{id4n}/properties | Retrieve ID4n properties
[**listElementsOfCollection**](CollectionsApi.md#listElementsOfCollection) | **GET** /api/v1/collections/{id4n}/elements | List contents of the collection
[**patchProperties**](CollectionsApi.md#patchProperties) | **PATCH** /api/v1/id4ns/{id4n}/properties | Patch ID4n properties
[**removeElementsFromCollection**](CollectionsApi.md#removeElementsFromCollection) | **DELETE** /api/v1/collections/{id4n}/elements | Remove elements from collection
[**updateCollection**](CollectionsApi.md#updateCollection) | **PATCH** /api/v1/collections/{id4n} | Update collection


<a name="addElementsToCollection"></a>
# **addElementsToCollection**
> addElementsToCollection(id4n, listOfGuids)

Add elements to collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.addElementsToCollection(id4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createCollection"></a>
# **createCollection**
> Id4n createCollection(createInfo)

Create collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
CreateCollectionRequest createInfo = new CreateCollectionRequest(); // CreateCollectionRequest | createInfo
try {
    Id4n result = apiInstance.createCollection(createInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateCollectionRequest**](CreateCollectionRequest.md)| createInfo |

### Return type

[**Id4n**](Id4n.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(id4n)

Delete collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
try {
    apiInstance.deleteCollection(id4n);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |

### Return type

null (empty response body)

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
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | The id4n
String organizationId = "organizationId_example"; // String | The organization namespace to work on while deleting the properties.
List<String> properties = Arrays.asList(new List<String>()); // List<String> | A set of property keys to delete.
try {
    apiInstance.deleteProperties(id4n, organizationId, properties);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteProperties");
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

<a name="findCollection"></a>
# **findCollection**
> GuidCollection findCollection(id4n)

Find collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
try {
    GuidCollection result = apiInstance.findCollection(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |

### Return type

[**GuidCollection**](GuidCollection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAllCollectionsOfOrganization"></a>
# **getAllCollectionsOfOrganization**
> PaginatedResponseOfGuidCollection getAllCollectionsOfOrganization(organizationId, offset, limit, type, label, labelPrefix)

Get collections of organization

Retrieving all collections of an organization in a paginated manner. You may filter the results by specifying id4n properties with filter operations (eq, in, ne) in the query parameters. e.g. &#x60;com.yourcompany.orderId.eq&#x3D;1234&#x60;  

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
String type = "type_example"; // String | Filter by this type
String label = "label_example"; // String | Filter by this label
String labelPrefix = "labelPrefix_example"; // String | Filter by this label prefix
try {
    PaginatedResponseOfGuidCollection result = apiInstance.getAllCollectionsOfOrganization(organizationId, offset, limit, type, label, labelPrefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#getAllCollectionsOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **type** | **String**| Filter by this type | [optional] [enum: ROUTING_COLLECTION, LOGISTIC_COLLECTION, LABELLED_COLLECTION]
 **label** | **String**| Filter by this label | [optional]
 **labelPrefix** | **String**| Filter by this label prefix | [optional]

### Return type

[**PaginatedResponseOfGuidCollection**](PaginatedResponseOfGuidCollection.md)

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
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | The id4n
String organizationId = "organizationId_example"; // String | The organization namespace.
try {
    Map<String, String> result = apiInstance.getProperties(id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#getProperties");
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

<a name="listElementsOfCollection"></a>
# **listElementsOfCollection**
> PaginatedResponseOfGuid listElementsOfCollection(id4n, offset, limit)

List contents of the collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfGuid result = apiInstance.listElementsOfCollection(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfGuid**](PaginatedResponseOfGuid.md)

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
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | The id4n
String organizationId = "organizationId_example"; // String | The organization namespace to work on while patching the properties.
Object properties = null; // Object | The properties to update.
try {
    apiInstance.patchProperties(id4n, organizationId, properties);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#patchProperties");
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

<a name="removeElementsFromCollection"></a>
# **removeElementsFromCollection**
> removeElementsFromCollection(id4n, listOfGuids)

Remove elements from collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.removeElementsFromCollection(id4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateCollection"></a>
# **updateCollection**
> Object updateCollection(id4n, request)

Update collection

Update collection changing only the given values

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
try {
    Object result = apiInstance.updateCollection(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

