# PublicServicesApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPublicDocument**](PublicServicesApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
[**getRoutes**](PublicServicesApi.md#getRoutes) | **GET** /api/v1/public/routes/{id4n} | Retrieve all public routes for a GUID
[**go**](PublicServicesApi.md#go) | **GET** /go/{guid} | Forward
[**listAllPublicDocuments**](PublicServicesApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List organization specific documents
[**listPublicDocuments**](PublicServicesApi.md#listPublicDocuments) | **GET** /api/v1/public/documents/{id4n}/{organizationId} | List organization specific documents
[**listPublicHistory**](PublicServicesApi.md#listPublicHistory) | **GET** /api/v1/public/history/{id4n} | Shows the public history of the given GUID
[**readOrganizationInfo**](PublicServicesApi.md#readOrganizationInfo) | **GET** /api/v1/public/organizations/{organizationId} | Read public organization information
[**readPublicDocument**](PublicServicesApi.md#readPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName} | Read document contents
[**resolveImageUsingGET**](PublicServicesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image
[**resolveWhoIsEntry**](PublicServicesApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n


<a name="getPublicDocument"></a>
# **getPublicDocument**
> Document getPublicDocument(organizationId, id4n, fileName)

Retrieve a document (meta-data only, no content)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String organizationId = "organizationId_example"; // String | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Document result = apiInstance.getPublicDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#getPublicDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getRoutes"></a>
# **getRoutes**
> List&lt;Route&gt; getRoutes(id4n, type, interpolate)

Retrieve all public routes for a GUID

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String id4n = "id4n_example"; // String | id4n
String type = "web"; // String | type
Boolean interpolate = true; // Boolean | interpolate
try {
    List<Route> result = apiInstance.getRoutes(id4n, type, interpolate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#getRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **type** | **String**| type | [default to web]
 **interpolate** | **Boolean**| interpolate | [optional] [default to true]

### Return type

[**List&lt;Route&gt;**](Route.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="go"></a>
# **go**
> go(guid)

Forward

Forwarding to the designated route defined in the routing,

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.PublicServicesApi;


PublicServicesApi apiInstance = new PublicServicesApi();
String guid = "guid_example"; // String | guid
try {
    apiInstance.go(guid);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#go");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| guid |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllPublicDocuments"></a>
# **listAllPublicDocuments**
> PaginatedOwnedDocumentResponse listAllPublicDocuments(id4n, organizationId, offset, limit)

List organization specific documents

Listing documents of an id4n owned by a specified organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOwnedDocumentResponse result = apiInstance.listAllPublicDocuments(id4n, organizationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#listAllPublicDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedOwnedDocumentResponse**](PaginatedOwnedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listPublicDocuments"></a>
# **listPublicDocuments**
> PaginatedDocumentResponse listPublicDocuments(organizationId, id4n, offset, limit)

List organization specific documents

Listing documents of an id4n owned by a specified organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String organizationId = "organizationId_example"; // String | organizationId
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedDocumentResponse result = apiInstance.listPublicDocuments(organizationId, id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#listPublicDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **id4n** | **String**| id4n |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedDocumentResponse**](PaginatedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listPublicHistory"></a>
# **listPublicHistory**
> PaginatedHistoryItemResponse listPublicHistory(id4n, offset, limit)

Shows the public history of the given GUID

Only contains public history items

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedHistoryItemResponse result = apiInstance.listPublicHistory(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#listPublicHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedHistoryItemResponse**](PaginatedHistoryItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readOrganizationInfo"></a>
# **readOrganizationInfo**
> Organization readOrganizationInfo(organizationId)

Read public organization information

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String organizationId = "organizationId_example"; // String | Organization ID
try {
    Organization result = apiInstance.readOrganizationInfo(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#readOrganizationInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization ID |

### Return type

[**Organization**](Organization.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readPublicDocument"></a>
# **readPublicDocument**
> byte[] readPublicDocument(organizationId, id4n, fileName)

Read document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String organizationId = "organizationId_example"; // String | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    byte[] result = apiInstance.readPublicDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#readPublicDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="resolveImageUsingGET"></a>
# **resolveImageUsingGET**
> byte[] resolveImageUsingGET(imageID)

Resolve image

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.PublicServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PublicServicesApi apiInstance = new PublicServicesApi();
String imageID = "imageID_example"; // String | The id of the image to be resolved.
try {
    byte[] result = apiInstance.resolveImageUsingGET(imageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#resolveImageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageID** | **String**| The id of the image to be resolved. |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="resolveWhoIsEntry"></a>
# **resolveWhoIsEntry**
> WhoIsResponse resolveWhoIsEntry(id4n)

Resolve owner of id4n

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.PublicServicesApi;


PublicServicesApi apiInstance = new PublicServicesApi();
String id4n = "id4n_example"; // String | id4n
try {
    WhoIsResponse result = apiInstance.resolveWhoIsEntry(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#resolveWhoIsEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |

### Return type

[**WhoIsResponse**](WhoIsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

