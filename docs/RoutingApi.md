# RoutingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllRoutes**](RoutingApi.md#getAllRoutes) | **GET** /api/v1/routingfiles/{id4n}/routes/{type} | Retrieve all routes of a GUID (or ID4N)
[**getRoute**](RoutingApi.md#getRoute) | **GET** /api/v1/routingfiles/{id4n}/route/{type} | Retrieve current route of a GUID (or ID4N)
[**getRoutingFile**](RoutingApi.md#getRoutingFile) | **GET** /api/v1/routingfiles/{id4n} | Retrieve routing file
[**updateRoutingFile**](RoutingApi.md#updateRoutingFile) | **PUT** /api/v1/routingfiles/{id4n} | Store routing file


<a name="getAllRoutes"></a>
# **getAllRoutes**
> List&lt;Route&gt; getAllRoutes(id4n, type, organizationId, interpolate)

Retrieve all routes of a GUID (or ID4N)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
String id4n = "id4n_example"; // String | id4n
String type = "type_example"; // String | The type of route you want to have
String organizationId = "organizationId_example"; // String | organizationId
Boolean interpolate = true; // Boolean | interpolate
try {
    List<Route> result = apiInstance.getAllRoutes(id4n, type, organizationId, interpolate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getAllRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **type** | **String**| The type of route you want to have |
 **organizationId** | **String**| organizationId | [optional]
 **interpolate** | **Boolean**| interpolate | [optional] [default to true]

### Return type

[**List&lt;Route&gt;**](Route.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getRoute"></a>
# **getRoute**
> Route getRoute(id4n, type, privateRoutes, publicRoutes, interpolate)

Retrieve current route of a GUID (or ID4N)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
String id4n = "id4n_example"; // String | id4n
String type = "type_example"; // String | The type of route you want to have
Boolean privateRoutes = true; // Boolean | privateRoutes
Boolean publicRoutes = true; // Boolean | publicRoutes
Boolean interpolate = true; // Boolean | interpolate
try {
    Route result = apiInstance.getRoute(id4n, type, privateRoutes, publicRoutes, interpolate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **type** | **String**| The type of route you want to have |
 **privateRoutes** | **Boolean**| privateRoutes | [optional] [default to true]
 **publicRoutes** | **Boolean**| publicRoutes | [optional] [default to true]
 **interpolate** | **Boolean**| interpolate | [optional] [default to true]

### Return type

[**Route**](Route.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getRoutingFile"></a>
# **getRoutingFile**
> RoutingFile getRoutingFile(id4n, organizationId)

Retrieve routing file

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
String id4n = "id4n_example"; // String | id4n
String organizationId = "organizationId_example"; // String | organizationId
try {
    RoutingFile result = apiInstance.getRoutingFile(id4n, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **organizationId** | **String**| organizationId | [optional]

### Return type

[**RoutingFile**](RoutingFile.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateRoutingFile"></a>
# **updateRoutingFile**
> updateRoutingFile(rfr, id4n)

Store routing file

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

RoutingApi apiInstance = new RoutingApi();
RoutingFileRequest rfr = new RoutingFileRequest(); // RoutingFileRequest | rfr
String id4n = "id4n_example"; // String | id4n
try {
    apiInstance.updateRoutingFile(rfr, id4n);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#updateRoutingFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rfr** | [**RoutingFileRequest**](RoutingFileRequest.md)| rfr |
 **id4n** | **String**| id4n |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

