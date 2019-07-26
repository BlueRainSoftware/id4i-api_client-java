# HistoryApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItem**](HistoryApi.md#addItem) | **POST** /api/v1/history/{id4n} | Add history item
[**filteredList**](HistoryApi.md#filteredList) | **GET** /api/v1/history/{id4n} | List history
[**list**](HistoryApi.md#list) | **GET** /api/v1/history/{id4n}/{organizationId} | DEPRECATED - List history
[**retrieveItem**](HistoryApi.md#retrieveItem) | **GET** /api/v1/history/{id4n}/{organizationId}/{sequenceId} | Get history item
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

<a name="filteredList"></a>
# **filteredList**
> PaginatedResponseOfHistoryItem filteredList(id4n, includePrivate, organization, type, qualifier, fromDate, toDate, offset, limit)

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
String organization = "organization_example"; // String | Show only entries created by one of the given organizations. This parameter can be used multiple times.
List<String> type = Arrays.asList("type_example"); // List<String> | Show only entries matching one of the given history item types. This parameter can be used multiple times.
List<String> qualifier = Arrays.asList("qualifier_example"); // List<String> | Show only entries matching one of the given history item qualifiers (additional property de.id4i.history.item.qualifier). This parameter can be used multiple times.
LocalDateTime fromDate = new LocalDateTime(); // LocalDateTime | From date time as UTC Date-Time format
LocalDateTime toDate = new LocalDateTime(); // LocalDateTime | To date time as UTC Date-Time format
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfHistoryItem result = apiInstance.filteredList(id4n, includePrivate, organization, type, qualifier, fromDate, toDate, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#filteredList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| GUID to retrieve the history for |
 **includePrivate** | **Boolean**| Also return private history entries | [optional] [default to true]
 **organization** | **String**| Show only entries created by one of the given organizations. This parameter can be used multiple times. | [optional]
 **type** | [**List&lt;String&gt;**](String.md)| Show only entries matching one of the given history item types. This parameter can be used multiple times. | [optional] [enum: CREATED, DESTROYED, RECYCLED, SHIPMENT_PREPARED, STORED, RETRIEVED_FROM_STORAGE, PACKAGED, DISPATCHED, RECEIVED, DELIVERY_REFUSED, REPROCESSING_STARTED, REPROCESSING_STEP_STARTED, REPROCESSING_STEP_CANCELLED, REPROCESSING_STEP_FINISHED, REPROCESSING_CANCELLED, REPROCESSING_FINISHED, DISASSEMBLED, MAINTENANCE_STARTED, MAINTENANCE_STEP_STARTED, MAINTENANCE_STEP_CANCELLED, MAINTENANCE_STEP_FINISHED, MAINTENANCE_CANCELLED, MAINTENANCE_FINISHED, PRODUCTION_STARTED, PRODUCTION_CANCELLED, PRODUCTION_FINISHED, PRODUCTION_STEP_STARTED, PRODUCTION_STEP_CANCELLED, PRODUCTION_STEP_FINISHED, QUALITY_CHECK_PERFORMED]
 **qualifier** | [**List&lt;String&gt;**](String.md)| Show only entries matching one of the given history item qualifiers (additional property de.id4i.history.item.qualifier). This parameter can be used multiple times. | [optional]
 **fromDate** | **LocalDateTime**| From date time as UTC Date-Time format | [optional]
 **toDate** | **LocalDateTime**| To date time as UTC Date-Time format | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfHistoryItem**](PaginatedResponseOfHistoryItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="list"></a>
# **list**
> PaginatedResponseOfHistoryItem list(id4n, organizationId, includePrivate, offset, limit)

DEPRECATED - List history

DEPRECATED - please use filteredList with organization parameter to achieve the same functionality

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
String organizationId = "organizationId_example"; // String | organizationId
Boolean includePrivate = true; // Boolean | Also return private history entries
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfHistoryItem result = apiInstance.list(id4n, organizationId, includePrivate, offset, limit);
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
 **organizationId** | **String**| organizationId |
 **includePrivate** | **Boolean**| Also return private history entries | [optional] [default to true]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfHistoryItem**](PaginatedResponseOfHistoryItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="retrieveItem"></a>
# **retrieveItem**
> HistoryItem retrieveItem(id4n, organizationId, sequenceId)

Get history item

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
String organizationId = "organizationId_example"; // String | organizationId
Integer sequenceId = 56; // Integer | sequenceId
try {
    HistoryItem result = apiInstance.retrieveItem(id4n, organizationId, sequenceId);
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
 **organizationId** | **String**| organizationId |
 **sequenceId** | **Integer**| sequenceId |

### Return type

[**HistoryItem**](HistoryItem.md)

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
String organizationId = "organizationId_example"; // String | organizationId
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
 **organizationId** | **String**| organizationId |
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
String organizationId = "organizationId_example"; // String | organizationId
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
 **organizationId** | **String**| organizationId |
 **sequenceId** | **Integer**| sequenceId |
 **visibility** | [**Visibility**](Visibility.md)| History item visibility restrictions |

### Return type

[**HistoryItem**](HistoryItem.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

