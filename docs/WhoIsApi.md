# WhoIsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resolveWhoIsEntry**](WhoIsApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n


<a name="resolveWhoIsEntry"></a>
# **resolveWhoIsEntry**
> WhoIsResponse resolveWhoIsEntry(id4n)

Resolve owner of id4n

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.WhoIsApi;


WhoIsApi apiInstance = new WhoIsApi();
String id4n = "id4n_example"; // String | id4n
try {
    WhoIsResponse result = apiInstance.resolveWhoIsEntry(id4n);
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

### Return type

[**WhoIsResponse**](WhoIsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

