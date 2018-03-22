# StorageApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocument**](StorageApi.md#createDocument) | **PUT** /api/v1/documents/{id4n}/{organizationId} | Create an empty document for an id4n
[**deleteDocument**](StorageApi.md#deleteDocument) | **DELETE** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Delete a document
[**getDocument**](StorageApi.md#getDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
[**getPublicDocument**](StorageApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
[**listAllDocuments**](StorageApi.md#listAllDocuments) | **GET** /api/v1/documents/{id4n} | List documents
[**listAllPublicDocuments**](StorageApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List organization specific documents
[**listDocuments**](StorageApi.md#listDocuments) | **GET** /api/v1/documents/{id4n}/{organizationId} | List organization specific documents
[**listPublicDocuments**](StorageApi.md#listPublicDocuments) | **GET** /api/v1/public/documents/{id4n}/{organizationId} | List organization specific documents
[**readDocument**](StorageApi.md#readDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Read document contents
[**readFromMicrostorage**](StorageApi.md#readFromMicrostorage) | **GET** /api/v1/microstorage/{id4n}/{organization} | Read data from microstorage
[**readPublicDocument**](StorageApi.md#readPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName} | Read document contents
[**updateDocumentMetadata**](StorageApi.md#updateDocumentMetadata) | **PATCH** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Update a document
[**writeToMicrostorage**](StorageApi.md#writeToMicrostorage) | **PUT** /api/v1/microstorage/{id4n}/{organization} | Write data to microstorage


<a name="createDocument"></a>
# **createDocument**
> Document createDocument(organizationId, id4n, content)

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
Long organizationId = 789L; // Long | organizationId
String id4n = "id4n_example"; // String | id4n
File content = new File("/path/to/file.txt"); // File | content
try {
    Document result = apiInstance.createDocument(organizationId, id4n, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **id4n** | **String**| id4n |
 **content** | **File**| content |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> ResponseEntity deleteDocument(organizationId, id4n, fileName)

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
    ResponseEntity result = apiInstance.deleteDocument(organizationId, id4n, fileName);
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

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

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

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

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

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

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

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

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

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readDocument"></a>
# **readDocument**
> byte[] readDocument(organizationId, id4n, fileName)

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
    byte[] result = apiInstance.readDocument(organizationId, id4n, fileName);
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

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="readFromMicrostorage"></a>
# **readFromMicrostorage**
> byte[] readFromMicrostorage(organization, id4n)

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
    byte[] result = apiInstance.readFromMicrostorage(organization, id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#readFromMicrostorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |

### Return type

**byte[]**

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
    byte[] result = apiInstance.readPublicDocument(organizationId, id4n, fileName);
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

**byte[]**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateDocumentMetadata"></a>
# **updateDocumentMetadata**
> Document updateDocumentMetadata(organizationId, id4n, fileName, document)

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
    Document result = apiInstance.updateDocumentMetadata(organizationId, id4n, fileName, document);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateDocumentMetadata");
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

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="writeToMicrostorage"></a>
# **writeToMicrostorage**
> Object writeToMicrostorage(organization, id4n, body, contentType, contentLength)

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
String body = "body_example"; // String | 
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
try {
    Object result = apiInstance.writeToMicrostorage(organization, id4n, body, contentType, contentLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#writeToMicrostorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |
 **body** | **String**|  |
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

