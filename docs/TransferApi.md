# TransferApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReceiveInfo**](TransferApi.md#getReceiveInfo) | **GET** /api/v1/transfers/{id4n}/receiveInfo | Show transfer information
[**getSendInfo**](TransferApi.md#getSendInfo) | **GET** /api/v1/transfers/{id4n}/sendInfo | Show transfer preparation information
[**prepare**](TransferApi.md#prepare) | **PUT** /api/v1/transfers/{id4n}/sendInfo | Prepare an object for transfer
[**receive**](TransferApi.md#receive) | **PUT** /api/v1/transfers/{id4n}/receiveInfo | Transfer a GUID or collection, obtaining it (i.e. becoming the holder) and if allowed also taking ownership


<a name="getReceiveInfo"></a>
# **getReceiveInfo**
> TransferReceiveInfo getReceiveInfo(id4n)

Show transfer information

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
String id4n = "id4n_example"; // String | The ID4N to retrieve information about
try {
    TransferReceiveInfo result = apiInstance.getReceiveInfo(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#getReceiveInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The ID4N to retrieve information about |

### Return type

[**TransferReceiveInfo**](TransferReceiveInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getSendInfo"></a>
# **getSendInfo**
> TransferSendInfo getSendInfo(id4n)

Show transfer preparation information

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
String id4n = "id4n_example"; // String | The ID4N to retrieve information about
try {
    TransferSendInfo result = apiInstance.getSendInfo(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#getSendInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The ID4N to retrieve information about |

### Return type

[**TransferSendInfo**](TransferSendInfo.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="prepare"></a>
# **prepare**
> Object prepare(id4n, request)

Prepare an object for transfer

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
String id4n = "id4n_example"; // String | The ID4N to prepare for transfer
TransferSendInfo request = new TransferSendInfo(); // TransferSendInfo | Transfer preparation status
try {
    Object result = apiInstance.prepare(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#prepare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The ID4N to prepare for transfer |
 **request** | [**TransferSendInfo**](TransferSendInfo.md)| Transfer preparation status |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="receive"></a>
# **receive**
> receive(id4n, request)

Transfer a GUID or collection, obtaining it (i.e. becoming the holder) and if allowed also taking ownership

Taking ownership can be forbidden by a previous owner. See methods prepare and getInfo

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.TransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

TransferApi apiInstance = new TransferApi();
String id4n = "id4n_example"; // String | This ID4N identifies the object to take hold of
TransferReceiveInfo request = new TransferReceiveInfo(); // TransferReceiveInfo | Required information to receive an id4n object
try {
    apiInstance.receive(id4n, request);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#receive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| This ID4N identifies the object to take hold of |
 **request** | [**TransferReceiveInfo**](TransferReceiveInfo.md)| Required information to receive an id4n object |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

