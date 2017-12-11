# ApiKeysApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewApiKey**](ApiKeysApi.md#createNewApiKey) | **POST** /api/v1/apikeys | Create apiKey
[**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /api/v1/apikeys/{key} | Delete apiKey
[**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** /api/v1/apikeys/{key} | Show apiKey
[**listAllApiKeysOfOrganization**](ApiKeysApi.md#listAllApiKeysOfOrganization) | **GET** /api/v1/apikeys | Find apiKeys by organization
[**listApiKeyPrivileges**](ApiKeysApi.md#listApiKeyPrivileges) | **GET** /api/v1/apikeys/privileges | List ApiKey privileges
[**setApiKeyActivationStatus**](ApiKeysApi.md#setApiKeyActivationStatus) | **PUT** /api/v1/apikeys/{key} | Set apiKey activation state


<a name="createNewApiKey"></a>
# **createNewApiKey**
> ApiKeyPresentation createNewApiKey(creationRequest, authorization, acceptLanguage)

Create apiKey

Creation of a new apiKey.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
ApiKeyCreationRequest creationRequest = new ApiKeyCreationRequest(); // ApiKeyCreationRequest | ApiKey to be created.
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
 **creationRequest** | [**ApiKeyCreationRequest**](ApiKeyCreationRequest.md)| ApiKey to be created. |
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

Delete apiKey

Deletion of an apiKey.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The apiKey to delete.
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
 **key** | **String**| The apiKey to delete. |
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

Show apiKey

Showing the details of an apiKey.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The apiKey to show.
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
 **key** | **String**| The apiKey to show. |
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

Find apiKeys by organization

Finding all apiKeys assigned to the specified organization in a paginated manner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeysApi;


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

List ApiKey privileges

Listing api key privileges.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeysApi;


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

<a name="setApiKeyActivationStatus"></a>
# **setApiKeyActivationStatus**
> ApiError setApiKeyActivationStatus(key, apiKeyStatus, authorization, acceptLanguage)

Set apiKey activation state

Setting the apiKey activation state.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiKeysApi;


ApiKeysApi apiInstance = new ApiKeysApi();
String key = "key_example"; // String | The apiKey to change the activation state.
ApiKeyStatus apiKeyStatus = new ApiKeyStatus(); // ApiKeyStatus | Activation state to set.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.setApiKeyActivationStatus(key, apiKeyStatus, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#setApiKeyActivationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The apiKey to change the activation state. |
 **apiKeyStatus** | [**ApiKeyStatus**](ApiKeyStatus.md)| Activation state to set. |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

