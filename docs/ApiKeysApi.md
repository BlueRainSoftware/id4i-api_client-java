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
> ApiError addApiKeyPrivilege(key, addApiKeyPrivilegeRequest, authorization, acceptLanguage)

Add privilege

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
AddApiKeyPrivilegeRequest addApiKeyPrivilegeRequest = new AddApiKeyPrivilegeRequest(); // AddApiKeyPrivilegeRequest | addApiKeyPrivilegeRequest
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addApiKeyPrivilege(key, addApiKeyPrivilegeRequest, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#addApiKeyPrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **addApiKeyPrivilegeRequest** | [**AddApiKeyPrivilegeRequest**](AddApiKeyPrivilegeRequest.md)| addApiKeyPrivilegeRequest |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="addApiKeyPrivilegeForId4ns"></a>
# **addApiKeyPrivilegeForId4ns**
> ApiError addApiKeyPrivilegeForId4ns(key, privilege, id4ns, authorization, acceptLanguage)

Add ID4ns of a privilege

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
String privilege = "privilege_example"; // String | privilege
ListOfId4ns id4ns = new ListOfId4ns(); // ListOfId4ns | id4ns
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addApiKeyPrivilegeForId4ns(key, privilege, id4ns, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#addApiKeyPrivilegeForId4ns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **privilege** | **String**| privilege |
 **id4ns** | [**ListOfId4ns**](ListOfId4ns.md)| id4ns |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createNewApiKey"></a>
# **createNewApiKey**
> ApiKeyPresentation createNewApiKey(creationRequest, authorization, acceptLanguage)

Create API key

Creation of a new API key.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
ApiKeyCreationRequest creationRequest = new ApiKeyCreationRequest(); // ApiKeyCreationRequest | API key to be created.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiKeyPresentation result = apiInstance.createNewApiKey(creationRequest, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiKeyPresentation**](ApiKeyPresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteApiKey"></a>
# **deleteApiKey**
> ApiError deleteApiKey(key, authorization, acceptLanguage)

Delete API key

Deletion of an API key.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The API key to delete.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteApiKey(key, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The API key to delete. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getApiKey"></a>
# **getApiKey**
> ApiKeyPresentation getApiKey(key, authorization, acceptLanguage)

Show API key

Showing the details of an API key.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The API key to show.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiKeyPresentation result = apiInstance.getApiKey(key, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiKeyPresentation**](ApiKeyPresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listAllApiKeyPrivileges"></a>
# **listAllApiKeyPrivileges**
> ApiKeyPrivilegeInfoResponse listAllApiKeyPrivileges(authorization, acceptLanguage, id4nConcerning, offset, limit)

List all privileges

Listing all possible API key privileges.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Boolean id4nConcerning = true; // Boolean | id4nConcerning
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    ApiKeyPrivilegeInfoResponse result = apiInstance.listAllApiKeyPrivileges(authorization, acceptLanguage, id4nConcerning, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listAllApiKeyPrivileges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **id4nConcerning** | **Boolean**| id4nConcerning | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**ApiKeyPrivilegeInfoResponse**](ApiKeyPrivilegeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listAllApiKeysOfOrganization"></a>
# **listAllApiKeysOfOrganization**
> PaginatedApiKeyResponse listAllApiKeysOfOrganization(organizationId, authorization, acceptLanguage, offset, limit)

Find API key by organization

Finding all API key assigned to the specified organization in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
Long organizationId = 789L; // Long | The id of the organization to search in.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedApiKeyResponse result = apiInstance.listAllApiKeysOfOrganization(organizationId, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listAllApiKeysOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The id of the organization to search in. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedApiKeyResponse**](PaginatedApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listApiKeyPrivileges"></a>
# **listApiKeyPrivileges**
> ApiKeyPrivilegePaginatedResponse listApiKeyPrivileges(key, authorization, acceptLanguage, offset, limit)

List privileges

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    ApiKeyPrivilegePaginatedResponse result = apiInstance.listApiKeyPrivileges(key, authorization, acceptLanguage, offset, limit);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**ApiKeyPrivilegePaginatedResponse**](ApiKeyPrivilegePaginatedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listId4ns"></a>
# **listId4ns**
> Id4nPresentationPaginatedResponse listId4ns(key, privilege, authorization, acceptLanguage, offset, limit)

ID4ns of a privilege

Listing ID4ns of a id4n concerning privilege

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
String privilege = "privilege_example"; // String | privilege
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    Id4nPresentationPaginatedResponse result = apiInstance.listId4ns(key, privilege, authorization, acceptLanguage, offset, limit);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**Id4nPresentationPaginatedResponse**](Id4nPresentationPaginatedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeApiKeyPrivilege"></a>
# **removeApiKeyPrivilege**
> ApiError removeApiKeyPrivilege(key, removeApiKeyPrivilegeRequest, authorization, acceptLanguage)

Remove privilege

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
RemoveApiKeyPrivilegeRequest removeApiKeyPrivilegeRequest = new RemoveApiKeyPrivilegeRequest(); // RemoveApiKeyPrivilegeRequest | removeApiKeyPrivilegeRequest
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeApiKeyPrivilege(key, removeApiKeyPrivilegeRequest, authorization, acceptLanguage);
    System.out.println(result);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeApiKeyPrivilegeForId4ns"></a>
# **removeApiKeyPrivilegeForId4ns**
> ApiError removeApiKeyPrivilegeForId4ns(key, privilege, id4ns, authorization, acceptLanguage)

Remove id4ns of a privilege

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | key
String privilege = "privilege_example"; // String | privilege
ListOfId4ns id4ns = new ListOfId4ns(); // ListOfId4ns | id4ns
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeApiKeyPrivilegeForId4ns(key, privilege, id4ns, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#removeApiKeyPrivilegeForId4ns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key |
 **privilege** | **String**| privilege |
 **id4ns** | [**ListOfId4ns**](ListOfId4ns.md)| id4ns |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateApiKey"></a>
# **updateApiKey**
> ApiError updateApiKey(key, apiKeyChange, authorization, acceptLanguage)

Update API keys

API keys can be updated with new labels, and be activated and deactivated. The secret or UUID cannot be changed.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The API key to be updated.
ApiKeyChangeRequest apiKeyChange = new ApiKeyChangeRequest(); // ApiKeyChangeRequest | The new values to apply.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.updateApiKey(key, apiKeyChange, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#updateApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The API key to be updated. |
 **apiKeyChange** | [**ApiKeyChangeRequest**](ApiKeyChangeRequest.md)| The new values to apply. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

