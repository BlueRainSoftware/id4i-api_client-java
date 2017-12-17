# ApiKeysApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewApiKey**](ApiKeysApi.md#createNewApiKey) | **POST** /api/v1/apikeys | Create API key
[**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /api/v1/apikeys/{key} | Delete API key
[**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** /api/v1/apikeys/{key} | Show API key
[**listAllApiKeysOfOrganization**](ApiKeysApi.md#listAllApiKeysOfOrganization) | **GET** /api/v1/apikeys | Find API key by organization
[**listApiKeyPrivileges**](ApiKeysApi.md#listApiKeyPrivileges) | **GET** /api/v1/apikeys/privileges | List API key privileges
[**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** /api/v1/apikeys/{key} | Update API keys


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
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
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
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
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
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiKeyPresentation**](ApiKeyPresentation.md)

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
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

### Return type

[**PaginatedApiKeyResponse**](PaginatedApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listApiKeyPrivileges"></a>
# **listApiKeyPrivileges**
> ApiKeyPrivilegeResponse listApiKeyPrivileges(authorization, acceptLanguage, id4nConcerning, offset, limit)

List API key privileges

Listing API key privileges.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Boolean id4nConcerning = true; // Boolean | id4nConcerning
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    ApiKeyPrivilegeResponse result = apiInstance.listApiKeyPrivileges(authorization, acceptLanguage, id4nConcerning, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#listApiKeyPrivileges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **id4nConcerning** | **Boolean**| id4nConcerning | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

### Return type

[**ApiKeyPrivilegeResponse**](ApiKeyPrivilegeResponse.md)

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
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

