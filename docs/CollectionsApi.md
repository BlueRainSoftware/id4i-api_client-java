# CollectionsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addElementsToCollection**](CollectionsApi.md#addElementsToCollection) | **POST** /api/v1/collections/{id4n}/elements | Add elements to collection
[**addElementsToLabelledCollection**](CollectionsApi.md#addElementsToLabelledCollection) | **POST** /api/v1/collections/labelled/{collectionId4n}/elements | Add elements to labelled collection
[**addElementsToLogisticCollection**](CollectionsApi.md#addElementsToLogisticCollection) | **POST** /api/v1/collections/logistic/{collectionId4n}/elements | Add elements to logistic collection
[**addElementsToRoutingCollection**](CollectionsApi.md#addElementsToRoutingCollection) | **POST** /api/v1/collections/routing/{collectionId4n}/elements | Add element to routing collection
[**createLabelledCollection**](CollectionsApi.md#createLabelledCollection) | **POST** /api/v1/collections/labelled | Create labelled collection
[**createLogisticCollection**](CollectionsApi.md#createLogisticCollection) | **POST** /api/v1/collections/logistic | Create logistic collection
[**createRoutingCollection**](CollectionsApi.md#createRoutingCollection) | **POST** /api/v1/collections/routing | Create routing collecton
[**deleteCollection**](CollectionsApi.md#deleteCollection) | **DELETE** /api/v1/collections/{id4n} | Delete collection
[**deleteLabelledCollection**](CollectionsApi.md#deleteLabelledCollection) | **DELETE** /api/v1/collections/labelled/{id4n} | Delete labelled collection
[**deleteLogisticCollection**](CollectionsApi.md#deleteLogisticCollection) | **DELETE** /api/v1/collections/logistic/{id4n} | Delete logistic collection
[**deleteRoutingCollection**](CollectionsApi.md#deleteRoutingCollection) | **DELETE** /api/v1/collections/routing/{id4n} | Delete routing collection
[**findCollection**](CollectionsApi.md#findCollection) | **GET** /api/v1/collections/{id4n} | Find collection
[**findLabelledCollection**](CollectionsApi.md#findLabelledCollection) | **GET** /api/v1/collections/labelled/{id4n} | Find labelled collection
[**findLogisticCollection**](CollectionsApi.md#findLogisticCollection) | **GET** /api/v1/collections/logistic/{id4n} | Find logistic collection
[**findRoutingCollection**](CollectionsApi.md#findRoutingCollection) | **GET** /api/v1/collections/routing/{id4n} | Find routing collection
[**getAllCollectionsOfOrganization**](CollectionsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
[**listElementsOfCollection**](CollectionsApi.md#listElementsOfCollection) | **GET** /api/v1/collections/{id4n}/elements | List contents of the collection
[**listElementsOfLabelledCollection**](CollectionsApi.md#listElementsOfLabelledCollection) | **GET** /api/v1/collections/labelled/{id4n}/elements | List contents of the collection
[**listElementsOfLogisticCollection**](CollectionsApi.md#listElementsOfLogisticCollection) | **GET** /api/v1/collections/logistic/{id4n}/elements | List contents of the collection
[**listElementsOfRoutingCollection**](CollectionsApi.md#listElementsOfRoutingCollection) | **GET** /api/v1/collections/routing/{id4n}/elements | List contents of the collection
[**removeElementsFromCollection**](CollectionsApi.md#removeElementsFromCollection) | **DELETE** /api/v1/collections/{id4n}/elements | Remove elements from collection
[**removeElementsFromLabelledCollection**](CollectionsApi.md#removeElementsFromLabelledCollection) | **DELETE** /api/v1/collections/labelled/{collectionId4n}/elements | Remove elements from labelled collection
[**removeElementsFromLogisticCollection**](CollectionsApi.md#removeElementsFromLogisticCollection) | **DELETE** /api/v1/collections/logistic/{collectionId4n}/elements | Remove elements from logistic collection
[**removeElementsFromRoutingCollection**](CollectionsApi.md#removeElementsFromRoutingCollection) | **DELETE** /api/v1/collections/routing/{collectionId4n}/elements | Remove elements from routing collection
[**updateCollection**](CollectionsApi.md#updateCollection) | **PATCH** /api/v1/collections/{id4n} | Update collection
[**updateLabelledCollection**](CollectionsApi.md#updateLabelledCollection) | **PATCH** /api/v1/collections/labelled/{id4n} | Update labelled collection
[**updateLogisticCollection**](CollectionsApi.md#updateLogisticCollection) | **PATCH** /api/v1/collections/logistic/{id4n} | Update logistic collection
[**updateRoutingCollection**](CollectionsApi.md#updateRoutingCollection) | **PATCH** /api/v1/collections/routing/{id4n} | Update routing collection


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

<a name="addElementsToLabelledCollection"></a>
# **addElementsToLabelledCollection**
> addElementsToLabelledCollection(collectionId4n, listOfGuids)

Add elements to labelled collection

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
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.addElementsToLabelledCollection(collectionId4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addElementsToLogisticCollection"></a>
# **addElementsToLogisticCollection**
> addElementsToLogisticCollection(collectionId4n, listOfGuids)

Add elements to logistic collection

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
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.addElementsToLogisticCollection(collectionId4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addElementsToRoutingCollection"></a>
# **addElementsToRoutingCollection**
> addElementsToRoutingCollection(collectionId4n, listOfGuids)

Add element to routing collection

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
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.addElementsToRoutingCollection(collectionId4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createLabelledCollection"></a>
# **createLabelledCollection**
> Id4n createLabelledCollection(createInfo)

Create labelled collection

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
CreateLabelledCollectionRequest createInfo = new CreateLabelledCollectionRequest(); // CreateLabelledCollectionRequest | createInfo
try {
    Id4n result = apiInstance.createLabelledCollection(createInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateLabelledCollectionRequest**](CreateLabelledCollectionRequest.md)| createInfo |

### Return type

[**Id4n**](Id4n.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createLogisticCollection"></a>
# **createLogisticCollection**
> Id4n createLogisticCollection(createInfo)

Create logistic collection

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
CreateLogisticCollectionRequest createInfo = new CreateLogisticCollectionRequest(); // CreateLogisticCollectionRequest | createInfo
try {
    Id4n result = apiInstance.createLogisticCollection(createInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateLogisticCollectionRequest**](CreateLogisticCollectionRequest.md)| createInfo |

### Return type

[**Id4n**](Id4n.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createRoutingCollection"></a>
# **createRoutingCollection**
> Id4n createRoutingCollection(createInfo)

Create routing collecton

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
CreateRoutingCollectionRequest createInfo = new CreateRoutingCollectionRequest(); // CreateRoutingCollectionRequest | createInfo
try {
    Id4n result = apiInstance.createRoutingCollection(createInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateRoutingCollectionRequest**](CreateRoutingCollectionRequest.md)| createInfo |

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

<a name="deleteLabelledCollection"></a>
# **deleteLabelledCollection**
> deleteLabelledCollection(id4n)

Delete labelled collection

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
    apiInstance.deleteLabelledCollection(id4n);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteLabelledCollection");
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

<a name="deleteLogisticCollection"></a>
# **deleteLogisticCollection**
> Object deleteLogisticCollection(id4n)

Delete logistic collection

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
    Object result = apiInstance.deleteLogisticCollection(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteRoutingCollection"></a>
# **deleteRoutingCollection**
> deleteRoutingCollection(id4n)

Delete routing collection

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
    apiInstance.deleteRoutingCollection(id4n);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteRoutingCollection");
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

<a name="findLabelledCollection"></a>
# **findLabelledCollection**
> GuidCollection findLabelledCollection(id4n)

Find labelled collection

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
    GuidCollection result = apiInstance.findLabelledCollection(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findLabelledCollection");
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

<a name="findLogisticCollection"></a>
# **findLogisticCollection**
> GuidCollection findLogisticCollection(id4n)

Find logistic collection

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
    GuidCollection result = apiInstance.findLogisticCollection(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findLogisticCollection");
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

<a name="findRoutingCollection"></a>
# **findRoutingCollection**
> GuidCollection findRoutingCollection(id4n)

Find routing collection

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
    GuidCollection result = apiInstance.findRoutingCollection(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findRoutingCollection");
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
> PaginatedGuidCollection getAllCollectionsOfOrganization(organizationId, offset, limit, type, label, labelPrefix)

Get collections of organization

Retrieving all collections of an organization in a paginated manner.

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
Long organizationId = 789L; // Long | organizationId
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
String type = "type_example"; // String | Filter by this type
String label = "label_example"; // String | Filter by this label
String labelPrefix = "labelPrefix_example"; // String | Filter by this label prefix
try {
    PaginatedGuidCollection result = apiInstance.getAllCollectionsOfOrganization(organizationId, offset, limit, type, label, labelPrefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#getAllCollectionsOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **type** | **String**| Filter by this type | [optional] [enum: ROUTING_COLLECTION, LOGISTIC_COLLECTION, LABELLED_COLLECTION]
 **label** | **String**| Filter by this label | [optional]
 **labelPrefix** | **String**| Filter by this label prefix | [optional]

### Return type

[**PaginatedGuidCollection**](PaginatedGuidCollection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listElementsOfCollection"></a>
# **listElementsOfCollection**
> PaginatedGuidResponse listElementsOfCollection(id4n, offset, limit)

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
    PaginatedGuidResponse result = apiInstance.listElementsOfCollection(id4n, offset, limit);
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

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listElementsOfLabelledCollection"></a>
# **listElementsOfLabelledCollection**
> PaginatedGuidResponse listElementsOfLabelledCollection(id4n, offset, limit)

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
    PaginatedGuidResponse result = apiInstance.listElementsOfLabelledCollection(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfLabelledCollection");
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

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listElementsOfLogisticCollection"></a>
# **listElementsOfLogisticCollection**
> PaginatedGuidResponse listElementsOfLogisticCollection(id4n, offset, limit)

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
    PaginatedGuidResponse result = apiInstance.listElementsOfLogisticCollection(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfLogisticCollection");
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

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listElementsOfRoutingCollection"></a>
# **listElementsOfRoutingCollection**
> PaginatedGuidResponse listElementsOfRoutingCollection(id4n, offset, limit)

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
    PaginatedGuidResponse result = apiInstance.listElementsOfRoutingCollection(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfRoutingCollection");
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

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

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

<a name="removeElementsFromLabelledCollection"></a>
# **removeElementsFromLabelledCollection**
> removeElementsFromLabelledCollection(collectionId4n, listOfGuids)

Remove elements from labelled collection

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
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.removeElementsFromLabelledCollection(collectionId4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeElementsFromLogisticCollection"></a>
# **removeElementsFromLogisticCollection**
> removeElementsFromLogisticCollection(collectionId4n, listOfGuids)

Remove elements from logistic collection

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
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.removeElementsFromLogisticCollection(collectionId4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeElementsFromRoutingCollection"></a>
# **removeElementsFromRoutingCollection**
> removeElementsFromRoutingCollection(collectionId4n, listOfGuids)

Remove elements from routing collection

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
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
try {
    apiInstance.removeElementsFromRoutingCollection(collectionId4n, listOfGuids);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
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

<a name="updateLabelledCollection"></a>
# **updateLabelledCollection**
> Object updateLabelledCollection(id4n, request)

Update labelled collection

Update labelled collection updating only the given values

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
    Object result = apiInstance.updateLabelledCollection(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateLabelledCollection");
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

<a name="updateLogisticCollection"></a>
# **updateLogisticCollection**
> Object updateLogisticCollection(id4n, request)

Update logistic collection

Update logistic collection updating only the given values

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
    Object result = apiInstance.updateLogisticCollection(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateLogisticCollection");
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

<a name="updateRoutingCollection"></a>
# **updateRoutingCollection**
> Object updateRoutingCollection(id4n, request)

Update routing collection

Update routing collection updating only the given values

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
    Object result = apiInstance.updateRoutingCollection(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateRoutingCollection");
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

