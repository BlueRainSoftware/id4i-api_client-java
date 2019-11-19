# StorageApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocument**](StorageApi.md#createDocument) | **POST** /api/v1/documents/{id4n}/{organizationId} | Create an document for an id4n
[**deleteDocument**](StorageApi.md#deleteDocument) | **DELETE** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Delete a document
[**getDocument**](StorageApi.md#getDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
[**getPublicDocument**](StorageApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a public document (meta-data only, no content)
[**listAllDocuments**](StorageApi.md#listAllDocuments) | **GET** /api/v1/documents/{id4n} | List documents
[**listAllPublicDocuments**](StorageApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List public documents
[**listDocuments**](StorageApi.md#listDocuments) | **GET** /api/v1/documents/{id4n}/{organizationId} | List organization specific documents
[**putDocument**](StorageApi.md#putDocument) | **PUT** /api/v1/documents/{id4n}/{organizationId} | Put an document for an id4n
[**readDocument**](StorageApi.md#readDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Read document contents
[**readFromMicrostorage**](StorageApi.md#readFromMicrostorage) | **GET** /api/v1/microstorage/{id4n}/{organization} | Read data from microstorage
[**readPublicDocument**](StorageApi.md#readPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName} | Read public document contents
[**updateDocumentMetadata**](StorageApi.md#updateDocumentMetadata) | **PATCH** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Update a document
[**writeToMicrostorage**](StorageApi.md#writeToMicrostorage) | **PUT** /api/v1/microstorage/{id4n}/{organization} | Write data to microstorage


<a name="createDocument"></a>
# **createDocument**
> Document createDocument(organizationId, id4n, content)

Create an document for an id4n

The documents&#39; mime type is suggested on octet-stream data. Otherwise the specified content mime type is used.

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
String organizationId = "organizationId_example"; // String | organizationId
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
 **organizationId** | **String**| organizationId |
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
> deleteDocument(organizationId, id4n, fileName)

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
String organizationId = "organizationId_example"; // String | organizationId
String id4n = "id4n_example"; // String | id4n
String fileName = "fileName_example"; // String | fileName
try {
    apiInstance.deleteDocument(organizationId, id4n, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteDocument");
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

null (empty response body)

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
String organizationId = "organizationId_example"; // String | organizationId
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

<a name="getPublicDocument"></a>
# **getPublicDocument**
> Document getPublicDocument(organizationId, id4n, fileName)

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
String organizationId = "organizationId_example"; // String | organizationId
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

<a name="listAllDocuments"></a>
# **listAllDocuments**
> PaginatedResponseOfDocument listAllDocuments(id4n, owner, offset, limit)

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
String owner = "owner_example"; // String | Filter by owner organization
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfDocument result = apiInstance.listAllDocuments(id4n, owner, offset, limit);
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
 **owner** | **String**| Filter by owner organization | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfDocument**](PaginatedResponseOfDocument.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllPublicDocuments"></a>
# **listAllPublicDocuments**
> PaginatedResponseOfDocument listAllPublicDocuments(id4n, organizationId, owner, offset, limit)

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
String organizationId = "organizationId_example"; // String | organizationId
String owner = "owner_example"; // String | Filter by owner organization
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfDocument result = apiInstance.listAllPublicDocuments(id4n, organizationId, owner, offset, limit);
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
 **organizationId** | **String**| organizationId | [optional]
 **owner** | **String**| Filter by owner organization | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfDocument**](PaginatedResponseOfDocument.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listDocuments"></a>
# **listDocuments**
> PaginatedResponseOfDocument listDocuments(organizationId, id4n, owner, offset, limit)

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
String organizationId = "organizationId_example"; // String | organizationId
String id4n = "id4n_example"; // String | id4n
String owner = "owner_example"; // String | Filter by owner organization
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfDocument result = apiInstance.listDocuments(organizationId, id4n, owner, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#listDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **id4n** | **String**| id4n |
 **owner** | **String**| Filter by owner organization | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfDocument**](PaginatedResponseOfDocument.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="putDocument"></a>
# **putDocument**
> Document putDocument(organizationId, id4n, content)

Put an document for an id4n

Creating or overwriting an existing document 

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
String organizationId = "organizationId_example"; // String | organizationId
String id4n = "id4n_example"; // String | id4n
File content = new File("/path/to/file.txt"); // File | content
try {
    Document result = apiInstance.putDocument(organizationId, id4n, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#putDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **id4n** | **String**| id4n |
 **content** | **File**| content |

### Return type

[**Document**](Document.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
String organizationId = "organizationId_example"; // String | organizationId
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
String organization = "organization_example"; // String | organization
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
 **organization** | **String**| organization |
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
String organizationId = "organizationId_example"; // String | organizationId
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
String organizationId = "organizationId_example"; // String | organizationId
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
 **organizationId** | **String**| organizationId |
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
> Object writeToMicrostorage(organization, id4n, contentType, contentLength, body)

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
String organization = "organization_example"; // String | organization
String id4n = "id4n_example"; // String | id4n
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
byte[] body = BINARY_DATA_HERE; // byte[] | body
try {
    Object result = apiInstance.writeToMicrostorage(organization, id4n, contentType, contentLength, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#writeToMicrostorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| organization |
 **id4n** | **String**| id4n |
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]
 **body** | **byte[]**| body | [optional]

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

