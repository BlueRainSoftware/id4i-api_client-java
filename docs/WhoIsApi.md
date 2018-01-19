# WhoIsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resolveWhoIsEntry**](WhoIsApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n


<a name="resolveWhoIsEntry"></a>
# **resolveWhoIsEntry**
> WhoIsResponse resolveWhoIsEntry(id4n, authorization, acceptLanguage)

Resolve owner of id4n

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.WhoIsApi;


WhoIsApi apiInstance = new WhoIsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    WhoIsResponse result = apiInstance.resolveWhoIsEntry(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhoIsApi#resolveWhoIsEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**WhoIsResponse**](WhoIsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

