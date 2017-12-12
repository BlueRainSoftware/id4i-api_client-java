# MetaInformationApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationInfo**](MetaInformationApi.md#applicationInfo) | **GET** /api/v1/info | Retrieve version information about ID4i


<a name="applicationInfo"></a>
# **applicationInfo**
> AppInfoPresentation applicationInfo(authorization, acceptLanguage)

Retrieve version information about ID4i

Retrieving version information about ID4i.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.MetaInformationApi;


MetaInformationApi apiInstance = new MetaInformationApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    AppInfoPresentation result = apiInstance.applicationInfo(authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaInformationApi#applicationInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**AppInfoPresentation**](AppInfoPresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

