# StorageApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocument**](StorageApi.md#createDocument) | **PUT** /api/v1/documents/{id4n}/{organizationId} | Create an empty document for an id4n
[**deleteDocument**](StorageApi.md#deleteDocument) | **DELETE** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Delete a document
[**getDocument**](StorageApi.md#getDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
[**getPublicDocument**](StorageApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a public document (meta-data only, no content)
[**listAllDocuments**](StorageApi.md#listAllDocuments) | **GET** /api/v1/documents/{id4n} | List documents
[**listAllPublicDocuments**](StorageApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List public documents
[**listDocuments**](StorageApi.md#listDocuments) | **GET** /api/v1/documents/{id4n}/{organizationId} | List organization specific documents
[**readDocument**](StorageApi.md#readDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Read document contents
[**readFromMicrostorage**](StorageApi.md#readFromMicrostorage) | **GET** /api/v1/microstorage/{id4n}/{organization} | Read data from microstorage
[**readPublicDocument**](StorageApi.md#readPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName} | Read public document contents
[**updateDocumentMetadata**](StorageApi.md#updateDocumentMetadata) | **PATCH** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Update a document
[**writeToMicrostorage**](StorageApi.md#writeToMicrostorage) | **PUT** /api/v1/microstorage/{id4n}/{organization} | Write data to microstorage


<a name="createDocument"></a>
# **createDocument**
> Document createDocument(content, id4n, organizationId)

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
File content = new File("/path/to/file.txt"); // File | content
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    Document result = apiInstance.createDocument(content, id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **File**| content |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> deleteDocument(fileName, id4n, organizationId)

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
String fileName = "fileName_example"; // String | fileName
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    apiInstance.deleteDocument(fileName, id4n, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| fileName |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDocument"></a>
# **getDocument**
> Document getDocument(fileName, id4n, organizationId)

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
String fileName = "fileName_example"; // String | fileName
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    Document result = apiInstance.getDocument(fileName, id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| fileName |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getPublicDocument"></a>
# **getPublicDocument**
> Document getPublicDocument(fileName, id4n, organizationId)

Retrieve a public document (meta-data only, no content)

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
String fileName = "fileName_example"; // String | fileName
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    Document result = apiInstance.getPublicDocument(fileName, id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getPublicDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| fileName |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllDocuments"></a>
# **listAllDocuments**
> PaginatedDocumentResponse listAllDocuments(id4n, limit, offset, owner)

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
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String owner = "owner_example"; // String | Filter by owner organization
try {
    PaginatedDocumentResponse result = apiInstance.listAllDocuments(id4n, limit, offset, owner);
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
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **owner** | **String**| Filter by owner organization | [optional]

### Return type

[**PaginatedDocumentResponse**](PaginatedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllPublicDocuments"></a>
# **listAllPublicDocuments**
> PaginatedDocumentResponse listAllPublicDocuments(id4n, limit, offset, organizationId, owner)

List public documents

Listing all public documents of an id4n

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
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String organizationId = "organizationId_example"; // String | organizationId
String owner = "owner_example"; // String | Filter by owner organization
try {
    PaginatedDocumentResponse result = apiInstance.listAllPublicDocuments(id4n, limit, offset, organizationId, owner);
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
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **organizationId** | **String**| organizationId | [optional]
 **owner** | **String**| Filter by owner organization | [optional]

### Return type

[**PaginatedDocumentResponse**](PaginatedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listDocuments"></a>
# **listDocuments**
> PaginatedDocumentResponse listDocuments(id4n, organizationId, limit, offset, owner)

List organization specific documents

Listing documents of an id4n seen by a specified organization

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
String organizationId = "organizationId_example"; // String | organizationId
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String owner = "owner_example"; // String | Filter by owner organization
try {
    PaginatedDocumentResponse result = apiInstance.listDocuments(id4n, organizationId, limit, offset, owner);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **owner** | **String**| Filter by owner organization | [optional]

### Return type

[**PaginatedDocumentResponse**](PaginatedDocumentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readDocument"></a>
# **readDocument**
> byte[] readDocument(fileName, id4n, organizationId)

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
String fileName = "fileName_example"; // String | fileName
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    byte[] result = apiInstance.readDocument(fileName, id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| fileName |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readFromMicrostorage"></a>
# **readFromMicrostorage**
> byte[] readFromMicrostorage(id4n, organization)

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
String id4n = "id4n_example"; // String | id4n
String organization = "organization_example"; // String | organization
try {
    byte[] result = apiInstance.readFromMicrostorage(id4n, organization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readFromMicrostorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organization** | **String**| organization |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readPublicDocument"></a>
# **readPublicDocument**
> byte[] readPublicDocument(fileName, id4n, organizationId)

Read public document contents

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
String fileName = "fileName_example"; // String | fileName
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    byte[] result = apiInstance.readPublicDocument(fileName, id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readPublicDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| fileName |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateDocumentMetadata"></a>
# **updateDocumentMetadata**
> Document updateDocumentMetadata(document, fileName, id4n, organizationId)

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
DocumentUpdate document = new DocumentUpdate(); // DocumentUpdate | document
String fileName = "fileName_example"; // String | fileName
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    Document result = apiInstance.updateDocumentMetadata(document, fileName, id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateDocumentMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | [**DocumentUpdate**](DocumentUpdate.md)| document |
 **fileName** | **String**| fileName |
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="writeToMicrostorage"></a>
# **writeToMicrostorage**
> Object writeToMicrostorage(id4n, organization, contentLength, contentType, body)

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
String id4n = "id4n_example"; // String | id4n
String organization = "organization_example"; // String | organization
Long contentLength = 789L; // Long | Content-Length
String contentType = "contentType_example"; // String | Content-Type
byte[] body = BINARY_DATA_HERE; // byte[] | body
try {
    Object result = apiInstance.writeToMicrostorage(id4n, organization, contentLength, contentType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#writeToMicrostorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organization** | **String**| organization |
 **contentLength** | **Long**| Content-Length | [optional]
 **contentType** | **String**| Content-Type | [optional]
 **body** | **byte[]**| body | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

