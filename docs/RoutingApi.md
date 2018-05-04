# RoutingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllWebRoutes**](RoutingApi.md#getAllWebRoutes) | **GET** /api/v1/routingfiles/{id4n}/routes | Retrieve all web routes
[**getRoute**](RoutingApi.md#getRoute) | **GET** /api/v1/routingfiles/{id4n}/routes/{type} | Retrieve current route of a GUID (or ID4N)
[**getRoutingFile**](RoutingApi.md#getRoutingFile) | **GET** /api/v1/routingfiles/{id4n} | Retrieve routing file
[**updateRoutingFile**](RoutingApi.md#updateRoutingFile) | **PUT** /api/v1/routingfiles/{id4n} | Store routing file


<a name="getAllWebRoutes"></a>
# **getAllWebRoutes**
> List&lt;Route&gt; getAllWebRoutes(id4n)

Retrieve all web routes

Retrieves public and private web routes and interpolates them

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
try {
    List<Route> result = apiInstance.getAllWebRoutes(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getAllWebRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |

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
 **privateRoutes** | **Boolean**| privateRoutes | [optional]
 **publicRoutes** | **Boolean**| publicRoutes | [optional]
 **interpolate** | **Boolean**| interpolate | [optional]

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

