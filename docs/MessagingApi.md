# MessagingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enqueueCustomMessage**](MessagingApi.md#enqueueCustomMessage) | **POST** /api/v1/organizations/{organizationId}/messaging/enqueueCustomMessage | Enqueue a custom message
[**getDefaultQueue**](MessagingApi.md#getDefaultQueue) | **GET** /api/v1/organizations/{organizationId}/messaging | 
[**patchDefaultQueue**](MessagingApi.md#patchDefaultQueue) | **PATCH** /api/v1/organizations/{organizationId}/messaging | 


<a name="enqueueCustomMessage"></a>
# **enqueueCustomMessage**
> enqueueCustomMessage(organizationId, request)

Enqueue a custom message

Enqueue a custom organisation message with custom data.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MessagingApi apiInstance = new MessagingApi();
String organizationId = "organizationId_example"; // String | The organisation namespace
SendCustomMessage request = new SendCustomMessage(); // SendCustomMessage | request
try {
    apiInstance.enqueueCustomMessage(organizationId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#enqueueCustomMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The organisation namespace |
 **request** | [**SendCustomMessage**](SendCustomMessage.md)| request |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getDefaultQueue"></a>
# **getDefaultQueue**
> QueuePresentation getDefaultQueue(organizationId)



### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MessagingApi apiInstance = new MessagingApi();
String organizationId = "organizationId_example"; // String | organizationId
try {
    QueuePresentation result = apiInstance.getDefaultQueue(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#getDefaultQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |

### Return type

[**QueuePresentation**](QueuePresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="patchDefaultQueue"></a>
# **patchDefaultQueue**
> patchDefaultQueue(organizationId, request)



### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.MessagingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MessagingApi apiInstance = new MessagingApi();
String organizationId = "organizationId_example"; // String | organizationId
QueueUpdateRequest request = new QueueUpdateRequest(); // QueueUpdateRequest | request
try {
    apiInstance.patchDefaultQueue(organizationId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingApi#patchDefaultQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **request** | [**QueueUpdateRequest**](QueueUpdateRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

