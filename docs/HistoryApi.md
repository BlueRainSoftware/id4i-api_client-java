# HistoryApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItem**](HistoryApi.md#addItem) | **POST** /api/v1/history/{id4n} | Add history item
[**list**](HistoryApi.md#list) | **GET** /api/v1/history/{id4n}/{organizationId} | List history
[**listAll**](HistoryApi.md#listAll) | **GET** /api/v1/history/{id4n} | List history
[**retrieveItem**](HistoryApi.md#retrieveItem) | **GET** /api/v1/history/{id4n}/{organizationId}/{sequenceId} | List history
[**updateItem**](HistoryApi.md#updateItem) | **PATCH** /api/v1/history/{id4n}/{organizationId}/{sequenceId} | Update history item
[**updateItemVisibility**](HistoryApi.md#updateItemVisibility) | **PUT** /api/v1/history/{id4n}/{organizationId}/{sequenceId}/visibility | Set history item visibility


<a name="addItem"></a>
# **addItem**
> addItem(id4n, historyItem)

Add history item

Add a new history item

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.HistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

HistoryApi apiInstance = new HistoryApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
HistoryItem historyItem = new HistoryItem(); // HistoryItem | The history item to publish
try {
    apiInstance.addItem(id4n, historyItem);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#addItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **historyItem** | [**HistoryItem**](HistoryItem.md)| The history item to publish |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="list"></a>
# **list**
> PaginatedHistoryItemResponse list(id4n, organizationId, includePrivate, offset, limit)

List history

Lists the history of a GUID

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.HistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

HistoryApi apiInstance = new HistoryApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
Long organizationId = 789L; // Long | organizationId
Boolean includePrivate = true; // Boolean | Also return private history entries
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedHistoryItemResponse result = apiInstance.list(id4n, organizationId, includePrivate, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **organizationId** | **Long**| organizationId |
 **includePrivate** | **Boolean**| Also return private history entries | [optional] [default to true]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedHistoryItemResponse**](PaginatedHistoryItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAll"></a>
# **listAll**
> PaginatedHistoryItemResponse listAll(id4n, includePrivate, offset, limit)

List history

Lists the history of a GUID

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.HistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

HistoryApi apiInstance = new HistoryApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
Boolean includePrivate = true; // Boolean | Also return private history entries
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedHistoryItemResponse result = apiInstance.listAll(id4n, includePrivate, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#listAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **includePrivate** | **Boolean**| Also return private history entries | [optional] [default to true]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedHistoryItemResponse**](PaginatedHistoryItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="retrieveItem"></a>
# **retrieveItem**
> PaginatedHistoryItemResponse retrieveItem(id4n, organizationId, sequenceId)

List history

Lists the history of a GUID

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.HistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

HistoryApi apiInstance = new HistoryApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
Long organizationId = 789L; // Long | organizationId
Integer sequenceId = 56; // Integer | sequenceId
try {
    PaginatedHistoryItemResponse result = apiInstance.retrieveItem(id4n, organizationId, sequenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#retrieveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **organizationId** | **Long**| organizationId |
 **sequenceId** | **Integer**| sequenceId |

### Return type

[**PaginatedHistoryItemResponse**](PaginatedHistoryItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateItem"></a>
# **updateItem**
> HistoryItem updateItem(id4n, organizationId, sequenceId, update)

Update history item

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.HistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

HistoryApi apiInstance = new HistoryApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
Long organizationId = 789L; // Long | organizationId
Integer sequenceId = 56; // Integer | sequenceId
HistoryItemUpdate update = new HistoryItemUpdate(); // HistoryItemUpdate | update
try {
    HistoryItem result = apiInstance.updateItem(id4n, organizationId, sequenceId, update);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#updateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **organizationId** | **Long**| organizationId |
 **sequenceId** | **Integer**| sequenceId |
 **update** | [**HistoryItemUpdate**](HistoryItemUpdate.md)| update |

### Return type

[**HistoryItem**](HistoryItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateItemVisibility"></a>
# **updateItemVisibility**
> HistoryItem updateItemVisibility(id4n, organizationId, sequenceId, visibility)

Set history item visibility

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.HistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

HistoryApi apiInstance = new HistoryApi();
String id4n = "id4n_example"; // String | GUID to retrieve the history for
Long organizationId = 789L; // Long | organizationId
Integer sequenceId = 56; // Integer | sequenceId
Visibility visibility = new Visibility(); // Visibility | History item visibility restrictions
try {
    HistoryItem result = apiInstance.updateItemVisibility(id4n, organizationId, sequenceId, visibility);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#updateItemVisibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **organizationId** | **Long**| organizationId |
 **sequenceId** | **Integer**| sequenceId |
 **visibility** | [**Visibility**](Visibility.md)| History item visibility restrictions |

### Return type

[**HistoryItem**](HistoryItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

