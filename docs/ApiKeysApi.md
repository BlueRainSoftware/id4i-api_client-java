# ApiKeysApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addApiKeyPrivilege**](ApiKeysApi.md#addApiKeyPrivilege) | **POST** /api/v1/apikeys/{key}/privileges | Add privilege
[**addApiKeyPrivilegeForId4ns**](ApiKeysApi.md#addApiKeyPrivilegeForId4ns) | **POST** /api/v1/apikeys/{key}/privileges/{privilege}/id4ns | Add ID4ns of a privilege
[**createNewApiKey**](ApiKeysApi.md#createNewApiKey) | **POST** /api/v1/apikeys | Create API key
[**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /api/v1/apikeys/{key} | Delete API key
[**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** /api/v1/apikeys/{key} | Show API key
[**listAllApiKeyPrivileges**](ApiKeysApi.md#listAllApiKeyPrivileges) | **GET** /api/v1/apikeys/privileges | List all privileges
[**listAllApiKeysOfOrganization**](ApiKeysApi.md#listAllApiKeysOfOrganization) | **GET** /api/v1/apikeys | Find API key by organization
[**listApiKeyPrivileges**](ApiKeysApi.md#listApiKeyPrivileges) | **GET** /api/v1/apikeys/{key}/privileges | List privileges
[**listId4ns**](ApiKeysApi.md#listId4ns) | **GET** /api/v1/apikeys/{key}/privileges/{privilege}/id4ns | ID4ns of a privilege
[**removeApiKeyPrivilege**](ApiKeysApi.md#removeApiKeyPrivilege) | **DELETE** /api/v1/apikeys/{key}/privileges | Remove privilege
[**removeApiKeyPrivilegeForId4ns**](ApiKeysApi.md#removeApiKeyPrivilegeForId4ns) | **DELETE** /api/v1/apikeys/{key}/privileges/{privilege}/id4ns | Remove id4ns of a privilege
[**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** /api/v1/apikeys/{key} | Update API keys


<a name="addApiKeyPrivilege"></a>
# **addApiKeyPrivilege**
> addApiKeyPrivilege(addApiKeyPrivilegeRequest, key)

Add privilege

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
AddApiKeyPrivilegeRequest addApiKeyPrivilegeRequest = new AddApiKeyPrivilegeRequest(); // AddApiKeyPrivilegeRequest | addApiKeyPrivilegeRequest
String key = "key_example"; // String | key
try {
    apiInstance.addApiKeyPrivilege(addApiKeyPrivilegeRequest, key);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#addApiKeyPrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addApiKeyPrivilegeRequest** | [**AddApiKeyPrivilegeRequest**](AddApiKeyPrivilegeRequest.md)| addApiKeyPrivilegeRequest |
 **key** | **String**| key |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addApiKeyPrivilegeForId4ns"></a>
# **addApiKeyPrivilegeForId4ns**
> addApiKeyPrivilegeForId4ns(id4ns, key, privilege)

Add ID4ns of a privilege

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
ListOfId4ns id4ns = new ListOfId4ns(); // ListOfId4ns | id4ns
String key = "key_example"; // String | key
String privilege = "privilege_example"; // String | privilege
try {
    apiInstance.addApiKeyPrivilegeForId4ns(id4ns, key, privilege);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#addApiKeyPrivilegeForId4ns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4ns** | [**ListOfId4ns**](ListOfId4ns.md)| id4ns |
 **key** | **String**| key |
 **privilege** | **String**| privilege |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createNewApiKey"></a>
# **createNewApiKey**
> ApiKeyPresentation createNewApiKey(creationRequest)

Create API key

Creation of a new API key.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
ApiKeyCreationRequest creationRequest = new ApiKeyCreationRequest(); // ApiKeyCreationRequest | API key to be created.
try {
    ApiKeyPresentation result = apiInstance.createNewApiKey(creationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#createNewApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creationRequest** | [**ApiKeyCreationRequest**](ApiKeyCreationRequest.md)| API key to be created. |

### Return type

[**ApiKeyPresentation**](ApiKeyPresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteApiKey"></a>
# **deleteApiKey**
> deleteApiKey(key)

Delete API key

Deletion of an API key.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The API key to delete.
try {
    apiInstance.deleteApiKey(key);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The API key to delete. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getApiKey"></a>
# **getApiKey**
> ApiKeyPresentation getApiKey(key)

Show API key

Showing the details of an API key.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The API key to show.
try {
    ApiKeyPresentation result = apiInstance.getApiKey(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#getApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The API key to show. |

### Return type

[**ApiKeyPresentation**](ApiKeyPresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllApiKeyPrivileges"></a>
# **listAllApiKeyPrivileges**
> ApiKeyPrivilegeInfoResponse listAllApiKeyPrivileges(id4nConcerning, limit, offset)

List all privileges

Listing all possible API key privileges.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
Boolean id4nConcerning = true; // Boolean | id4nConcerning
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    ApiKeyPrivilegeInfoResponse result = apiInstance.listAllApiKeyPrivileges(id4nConcerning, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listAllApiKeyPrivileges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4nConcerning** | **Boolean**| id4nConcerning | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**ApiKeyPrivilegeInfoResponse**](ApiKeyPrivilegeInfoResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllApiKeysOfOrganization"></a>
# **listAllApiKeysOfOrganization**
> PaginatedApiKeyResponse listAllApiKeysOfOrganization(limit, offset, organizationId)

Find API key by organization

Finding all API key assigned to the specified organization in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String organizationId = "organizationId_example"; // String | The namespace of the organization to search in.
try {
    PaginatedApiKeyResponse result = apiInstance.listAllApiKeysOfOrganization(limit, offset, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listAllApiKeysOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **organizationId** | **String**| The namespace of the organization to search in. | [optional]

### Return type

[**PaginatedApiKeyResponse**](PaginatedApiKeyResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listApiKeyPrivileges"></a>
# **listApiKeyPrivileges**
> ApiKeyPrivilegePaginatedResponse listApiKeyPrivileges(key, limit, offset)

List privileges

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    ApiKeyPrivilegePaginatedResponse result = apiInstance.listApiKeyPrivileges(key, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listApiKeyPrivileges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**ApiKeyPrivilegePaginatedResponse**](ApiKeyPrivilegePaginatedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listId4ns"></a>
# **listId4ns**
> Id4nPresentationPaginatedResponse listId4ns(key, privilege, limit, offset)

ID4ns of a privilege

Listing ID4ns of a id4n concerning privilege

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
String privilege = "privilege_example"; // String | privilege
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    Id4nPresentationPaginatedResponse result = apiInstance.listId4ns(key, privilege, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listId4ns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **privilege** | **String**| privilege |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**Id4nPresentationPaginatedResponse**](Id4nPresentationPaginatedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeApiKeyPrivilege"></a>
# **removeApiKeyPrivilege**
> removeApiKeyPrivilege(key, removeApiKeyPrivilegeRequest)

Remove privilege

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
RemoveApiKeyPrivilegeRequest removeApiKeyPrivilegeRequest = new RemoveApiKeyPrivilegeRequest(); // RemoveApiKeyPrivilegeRequest | removeApiKeyPrivilegeRequest
try {
    apiInstance.removeApiKeyPrivilege(key, removeApiKeyPrivilegeRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#removeApiKeyPrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **removeApiKeyPrivilegeRequest** | [**RemoveApiKeyPrivilegeRequest**](RemoveApiKeyPrivilegeRequest.md)| removeApiKeyPrivilegeRequest |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeApiKeyPrivilegeForId4ns"></a>
# **removeApiKeyPrivilegeForId4ns**
> removeApiKeyPrivilegeForId4ns(id4ns, key, privilege)

Remove id4ns of a privilege

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
ListOfId4ns id4ns = new ListOfId4ns(); // ListOfId4ns | id4ns
String key = "key_example"; // String | key
String privilege = "privilege_example"; // String | privilege
try {
    apiInstance.removeApiKeyPrivilegeForId4ns(id4ns, key, privilege);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#removeApiKeyPrivilegeForId4ns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4ns** | [**ListOfId4ns**](ListOfId4ns.md)| id4ns |
 **key** | **String**| key |
 **privilege** | **String**| privilege |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateApiKey"></a>
# **updateApiKey**
> updateApiKey(apiKeyChange, key)

Update API keys

API keys can be updated with new labels, and be activated and deactivated. The secret or UUID cannot be changed.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
ApiKeyChangeRequest apiKeyChange = new ApiKeyChangeRequest(); // ApiKeyChangeRequest | The new values to apply.
String key = "key_example"; // String | The API key to be updated.
try {
    apiInstance.updateApiKey(apiKeyChange, key);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#updateApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyChange** | [**ApiKeyChangeRequest**](ApiKeyChangeRequest.md)| The new values to apply. |
 **key** | **String**| The API key to be updated. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

