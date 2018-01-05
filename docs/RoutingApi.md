# RoutingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRoute**](RoutingApi.md#getRoute) | **GET** /api/v1/routingfiles/{id4n}/route/{type} | Retrieve current route of a GUID (or ID4N)
[**getRoutingFile**](RoutingApi.md#getRoutingFile) | **GET** /api/v1/routingfiles/{id4n} | Retrieve routing file
[**updateRoutingFile**](RoutingApi.md#updateRoutingFile) | **PUT** /api/v1/routingfiles/{id4n} | Store routing file


<a name="getRoute"></a>
# **getRoute**
> Route getRoute(id4n, type, authorization, acceptLanguage, privateRoutes, publicRoutes)

Retrieve current route of a GUID (or ID4N)

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.RoutingApi;


RoutingApi apiInstance = new RoutingApi();
String id4n = "id4n_example"; // String | id4n
String type = "type_example"; // String | The type of route you want to have
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Boolean privateRoutes = true; // Boolean | privateRoutes
Boolean publicRoutes = true; // Boolean | publicRoutes
try {
    Route result = apiInstance.getRoute(id4n, type, authorization, acceptLanguage, privateRoutes, publicRoutes);
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **privateRoutes** | **Boolean**| privateRoutes | [optional]
 **publicRoutes** | **Boolean**| publicRoutes | [optional]

### Return type

[**Route**](Route.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getRoutingFile"></a>
# **getRoutingFile**
> RoutingFile getRoutingFile(id4n, authorization, acceptLanguage, organizationId)

Retrieve routing file

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.RoutingApi;


RoutingApi apiInstance = new RoutingApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Long organizationId = 789L; // Long | organizationId
try {
    RoutingFile result = apiInstance.getRoutingFile(id4n, authorization, acceptLanguage, organizationId);
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **organizationId** | **Long**| organizationId | [optional]

### Return type

[**RoutingFile**](RoutingFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateRoutingFile"></a>
# **updateRoutingFile**
> ApiError updateRoutingFile(rfr, id4n, authorization, acceptLanguage)

Store routing file

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.RoutingApi;


RoutingApi apiInstance = new RoutingApi();
RoutingFileRequest rfr = new RoutingFileRequest(); // RoutingFileRequest | rfr
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.updateRoutingFile(rfr, id4n, authorization, acceptLanguage);
    System.out.println(result);
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
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

