# PublicServicesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**go**](PublicServicesApi.md#go) | **GET** /go/{guid} | Forward
[**resolveImageUsingGET**](PublicServicesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image
[**resolveWhoIsEntry**](PublicServicesApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n


<a name="go"></a>
# **go**
> ApiError go(guid, authorization, acceptLanguage)

Forward

Forwarding to the designated route defined in the routing,

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.PublicServicesApi;


PublicServicesApi apiInstance = new PublicServicesApi();
String guid = "guid_example"; // String | guid
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.go(guid, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#go");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| guid |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="resolveImageUsingGET"></a>
# **resolveImageUsingGET**
> byte[] resolveImageUsingGET(imageID, authorization, acceptLanguage)

Resolve image

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.PublicServicesApi;


PublicServicesApi apiInstance = new PublicServicesApi();
String imageID = "imageID_example"; // String | The id of the image to be resolved.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    byte[] result = apiInstance.resolveImageUsingGET(imageID, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#resolveImageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageID** | **String**| The id of the image to be resolved. |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="resolveWhoIsEntry"></a>
# **resolveWhoIsEntry**
> WhoIsResponse resolveWhoIsEntry(id4n, authorization, acceptLanguage)

Resolve owner of id4n

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.PublicServicesApi;


PublicServicesApi apiInstance = new PublicServicesApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    WhoIsResponse result = apiInstance.resolveWhoIsEntry(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicServicesApi#resolveWhoIsEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**WhoIsResponse**](WhoIsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

