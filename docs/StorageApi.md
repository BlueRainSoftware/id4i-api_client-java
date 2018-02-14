# StorageApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocument**](StorageApi.md#createDocument) | **PUT** /api/v1/collections/{id4n}/documents/{organizationId} | Create an empty document for an id4n
[**createDocument1**](StorageApi.md#createDocument1) | **PUT** /api/v1/guids/{id4n}/documents/{organizationId} | Create an empty document for an id4n
[**deleteDocument**](StorageApi.md#deleteDocument) | **DELETE** /api/v1/collections/{id4n}/documents/{organizationId}/{fileName} | Delete a document
[**deleteDocument1**](StorageApi.md#deleteDocument1) | **DELETE** /api/v1/guids/{id4n}/documents/{organizationId}/{fileName} | Delete a document
[**getDocument**](StorageApi.md#getDocument) | **GET** /api/v1/collections/{id4n}/documents/{organizationId}/{fileName} | Retrieve a document (meta-data only, no content)
[**getDocument1**](StorageApi.md#getDocument1) | **GET** /api/v1/guids/{id4n}/documents/{organizationId}/{fileName} | Retrieve a document (meta-data only, no content)
[**getPublicDocument**](StorageApi.md#getPublicDocument) | **GET** /api/v1/public/collections/{id4n}/documents/{organizationId}/{fileName} | Retrieve a document (meta-data only, no content)
[**getPublicDocument1**](StorageApi.md#getPublicDocument1) | **GET** /api/v1/public/guids/{id4n}/documents/{organizationId}/{fileName} | Retrieve a document (meta-data only, no content)
[**listAllDocuments**](StorageApi.md#listAllDocuments) | **GET** /api/v1/collections/{id4n}/documents | List documents
[**listAllDocuments1**](StorageApi.md#listAllDocuments1) | **GET** /api/v1/guids/{id4n}/documents | List documents
[**listAllPublicDocuments**](StorageApi.md#listAllPublicDocuments) | **GET** /api/v1/public/collections/{id4n}/documents | List organization specific documents
[**listAllPublicDocuments1**](StorageApi.md#listAllPublicDocuments1) | **GET** /api/v1/public/guids/{id4n}/documents | List organization specific documents
[**listDocuments**](StorageApi.md#listDocuments) | **GET** /api/v1/collections/{id4n}/documents/{organizationId} | List organization specific documents
[**listDocuments1**](StorageApi.md#listDocuments1) | **GET** /api/v1/guids/{id4n}/documents/{organizationId} | List organization specific documents
[**listPublicDocuments**](StorageApi.md#listPublicDocuments) | **GET** /api/v1/public/collections/{id4n}/documents/{organizationId} | List organization specific documents
[**listPublicDocuments1**](StorageApi.md#listPublicDocuments1) | **GET** /api/v1/public/guids/{id4n}/documents/{organizationId} | List organization specific documents
[**read**](StorageApi.md#read) | **GET** /api/v1/collections/{id4n}/micro/{organization} | Read data from microstorage
[**read1**](StorageApi.md#read1) | **GET** /api/v1/guids/{id4n}/micro/{organization} | Read data from microstorage
[**readDocument**](StorageApi.md#readDocument) | **GET** /api/v1/collections/{id4n}/documents/{organizationId}/{fileName}/content | Read document contents
[**readDocument1**](StorageApi.md#readDocument1) | **GET** /api/v1/guids/{id4n}/documents/{organizationId}/{fileName}/content | Read document contents
[**readPublicDocument**](StorageApi.md#readPublicDocument) | **GET** /api/v1/public/collections/{id4n}/documents/{organizationId}/{fileName}/content | Read document contents
[**readPublicDocument1**](StorageApi.md#readPublicDocument1) | **GET** /api/v1/public/guids/{id4n}/documents/{organizationId}/{fileName}/content | Read document contents
[**updateDocument**](StorageApi.md#updateDocument) | **PATCH** /api/v1/collections/{id4n}/documents/{organizationId}/{fileName} | Update a document
[**updateDocument1**](StorageApi.md#updateDocument1) | **PATCH** /api/v1/guids/{id4n}/documents/{organizationId}/{fileName} | Update a document
[**write**](StorageApi.md#write) | **PUT** /api/v1/collections/{id4n}/micro/{organization} | Write data to microstorage
[**write1**](StorageApi.md#write1) | **PUT** /api/v1/guids/{id4n}/micro/{organization} | Write data to microstorage
[**writeDocument**](StorageApi.md#writeDocument) | **PUT** /api/v1/collections/{id4n}/documents/{organizationId}/{fileName}/content | Write document contents
[**writeDocument1**](StorageApi.md#writeDocument1) | **PUT** /api/v1/guids/{id4n}/documents/{organizationId}/{fileName}/content | Write document contents


<a name="createDocument"></a>
# **createDocument**
> Object createDocument(id4n, organizationId, document, mimeType)

Create an empty document for an id4n

The document is created empty, mime-type defaults to text/plain

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
String id4n = "id4n_example"; // String | id4n
Long organizationId = 789L; // Long | organizationId
Document document = new Document(); // Document | document
String mimeType = "mimeType_example"; // String | mimeType
try {
    Object result = apiInstance.createDocument(id4n, organizationId, document, mimeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organizationId** | **Long**| organizationId |
 **document** | [**Document**](Document.md)| document |
 **mimeType** | **String**| mimeType | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createDocument1"></a>
# **createDocument1**
> Object createDocument1(id4n, organizationId, document, mimeType)

Create an empty document for an id4n

The document is created empty, mime-type defaults to text/plain

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
String id4n = "id4n_example"; // String | id4n
Long organizationId = 789L; // Long | organizationId
Document document = new Document(); // Document | document
String mimeType = "mimeType_example"; // String | mimeType
try {
    Object result = apiInstance.createDocument1(id4n, organizationId, document, mimeType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createDocument1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organizationId** | **Long**| organizationId |
 **document** | [**Document**](Document.md)| document |
 **mimeType** | **String**| mimeType | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteDocument"></a>
# **deleteDocument**
> Object deleteDocument(organizationId, id4n, fileName)

Delete a document

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Object result = apiInstance.deleteDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteDocument");
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

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteDocument1"></a>
# **deleteDocument1**
> Object deleteDocument1(organizationId, id4n, fileName)

Delete a document

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Object result = apiInstance.deleteDocument1(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteDocument1");
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

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getDocument"></a>
# **getDocument**
> Document getDocument(organizationId, id4n, fileName)

Retrieve a document (meta-data only, no content)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Document result = apiInstance.getDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getDocument");
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

<a name="getDocument1"></a>
# **getDocument1**
> Document getDocument1(organizationId, id4n, fileName)

Retrieve a document (meta-data only, no content)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Document result = apiInstance.getDocument1(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getDocument1");
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
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Document result = apiInstance.getPublicDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getPublicDocument");
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

<a name="getPublicDocument1"></a>
# **getPublicDocument1**
> Document getPublicDocument1(organizationId, id4n, fileName)

Retrieve a document (meta-data only, no content)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    Document result = apiInstance.getPublicDocument1(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getPublicDocument1");
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

<a name="listAllDocuments"></a>
# **listAllDocuments**
> PaginatedOwnedDocumentResponse listAllDocuments(id4n, offset, limit)

List documents

Listing all documents of an id4n

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOwnedDocumentResponse result = apiInstance.listAllDocuments(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listAllDocuments");
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

[**PaginatedOwnedDocumentResponse**](PaginatedOwnedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listAllDocuments1"></a>
# **listAllDocuments1**
> PaginatedOwnedDocumentResponse listAllDocuments1(id4n, offset, limit)

List documents

Listing all documents of an id4n

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOwnedDocumentResponse result = apiInstance.listAllDocuments1(id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listAllDocuments1");
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

[**PaginatedOwnedDocumentResponse**](PaginatedOwnedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

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
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
String id4n = "id4n_example"; // String | id4n
Long organizationId = 789L; // Long | organizationId
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOwnedDocumentResponse result = apiInstance.listAllPublicDocuments(id4n, organizationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listAllPublicDocuments");
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

<a name="listAllPublicDocuments1"></a>
# **listAllPublicDocuments1**
> PaginatedOwnedDocumentResponse listAllPublicDocuments1(id4n, organizationId, offset, limit)

List organization specific documents

Listing documents of an id4n owned by a specified organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
String id4n = "id4n_example"; // String | id4n
Long organizationId = 789L; // Long | organizationId
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOwnedDocumentResponse result = apiInstance.listAllPublicDocuments1(id4n, organizationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listAllPublicDocuments1");
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

<a name="listDocuments"></a>
# **listDocuments**
> PaginatedDocumentResponse listDocuments(organizationId, id4n, offset, limit)

List organization specific documents

Listing documents of an id4n owned by a specified organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedDocumentResponse result = apiInstance.listDocuments(organizationId, id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listDocuments");
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

<a name="listDocuments1"></a>
# **listDocuments1**
> PaginatedDocumentResponse listDocuments1(organizationId, id4n, offset, limit)

List organization specific documents

Listing documents of an id4n owned by a specified organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedDocumentResponse result = apiInstance.listDocuments1(organizationId, id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listDocuments1");
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
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedDocumentResponse result = apiInstance.listPublicDocuments(organizationId, id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listPublicDocuments");
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

<a name="listPublicDocuments1"></a>
# **listPublicDocuments1**
> PaginatedDocumentResponse listPublicDocuments1(organizationId, id4n, offset, limit)

List organization specific documents

Listing documents of an id4n owned by a specified organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedDocumentResponse result = apiInstance.listPublicDocuments1(organizationId, id4n, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listPublicDocuments1");
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

<a name="read"></a>
# **read**
> InputStreamResource read(organization, id4n)

Read data from microstorage

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organization = 789L; // Long | organization
String id4n = "id4n_example"; // String | id4n
try {
    InputStreamResource result = apiInstance.read(organization, id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |

### Return type

[**InputStreamResource**](InputStreamResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="read1"></a>
# **read1**
> InputStreamResource read1(organization, id4n)

Read data from microstorage

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organization = 789L; // Long | organization
String id4n = "id4n_example"; // String | id4n
try {
    InputStreamResource result = apiInstance.read1(organization, id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#read1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |

### Return type

[**InputStreamResource**](InputStreamResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="readDocument"></a>
# **readDocument**
> InputStreamResource readDocument(organizationId, id4n, fileName)

Read document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    InputStreamResource result = apiInstance.readDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readDocument");
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

[**InputStreamResource**](InputStreamResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="readDocument1"></a>
# **readDocument1**
> InputStreamResource readDocument1(organizationId, id4n, fileName)

Read document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    InputStreamResource result = apiInstance.readDocument1(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readDocument1");
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

[**InputStreamResource**](InputStreamResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="readPublicDocument"></a>
# **readPublicDocument**
> InputStreamResource readPublicDocument(organizationId, id4n, fileName)

Read document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    InputStreamResource result = apiInstance.readPublicDocument(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readPublicDocument");
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

[**InputStreamResource**](InputStreamResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="readPublicDocument1"></a>
# **readPublicDocument1**
> InputStreamResource readPublicDocument1(organizationId, id4n, fileName)

Read document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    InputStreamResource result = apiInstance.readPublicDocument1(organizationId, id4n, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readPublicDocument1");
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

[**InputStreamResource**](InputStreamResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateDocument"></a>
# **updateDocument**
> Document updateDocument(organizationId, id4n, fileName, document)

Update a document

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
DocumentUpdate document = new DocumentUpdate(); // DocumentUpdate | document
try {
    Document result = apiInstance.updateDocument(organizationId, id4n, fileName, document);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |
 **document** | [**DocumentUpdate**](DocumentUpdate.md)| document |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateDocument1"></a>
# **updateDocument1**
> Document updateDocument1(organizationId, id4n, fileName, document)

Update a document

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
DocumentUpdate document = new DocumentUpdate(); // DocumentUpdate | document
try {
    Document result = apiInstance.updateDocument1(organizationId, id4n, fileName, document);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateDocument1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |
 **document** | [**DocumentUpdate**](DocumentUpdate.md)| document |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="write"></a>
# **write**
> Object write(organization, id4n, contentType, contentLength)

Write data to microstorage

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organization = 789L; // Long | organization
String id4n = "id4n_example"; // String | id4n
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
try {
    Object result = apiInstance.write(organization, id4n, contentType, contentLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#write");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="write1"></a>
# **write1**
> Object write1(organization, id4n, contentType, contentLength)

Write data to microstorage

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organization = 789L; // Long | organization
String id4n = "id4n_example"; // String | id4n
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
try {
    Object result = apiInstance.write1(organization, id4n, contentType, contentLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#write1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="writeDocument"></a>
# **writeDocument**
> Object writeDocument(organizationId, id4n, fileName, contentType, contentLength)

Write document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
try {
    Object result = apiInstance.writeDocument(organizationId, id4n, fileName, contentType, contentLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#writeDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="writeDocument1"></a>
# **writeDocument1**
> Object writeDocument1(organizationId, id4n, fileName, contentType, contentLength)

Write document contents

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

StorageApi apiInstance = new StorageApi();
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
try {
    Object result = apiInstance.writeDocument1(organizationId, id4n, fileName, contentType, contentLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#writeDocument1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **fileName** | **String**| fileName |
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json;charset=UTF-8

