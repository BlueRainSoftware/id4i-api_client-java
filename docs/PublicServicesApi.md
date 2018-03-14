# PublicServicesApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPublicDocument**](PublicServicesApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
[**go**](PublicServicesApi.md#go) | **GET** /go/{guid} | Forward
[**listAllPublicDocuments**](PublicServicesApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List organization specific documents
[**listPublicDocuments**](PublicServicesApi.md#listPublicDocuments) | **GET** /api/v1/public/documents/{id4n}/{organizationId} | List organization specific documents
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
Long organizationId = 789L; // Long | organizationId
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
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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
Long organizationId = 789L; // Long | organizationId
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
 **organizationId** | **Long**| organizationId | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedOwnedDocumentResponse**](PaginatedOwnedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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
Long organizationId = 789L; // Long | organizationId
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
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedDocumentResponse**](PaginatedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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
Long organizationId = 789L; // Long | organizationId
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
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

