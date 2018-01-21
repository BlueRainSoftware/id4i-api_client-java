# MicrostorageApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**read**](MicrostorageApi.md#read) | **GET** /api/v1/microstorage/{id4n}/{organization} | Read data from microstorage
[**write**](MicrostorageApi.md#write) | **PUT** /api/v1/microstorage/{id4n}/{organization} | Write data to microstorage


<a name="read"></a>
# **read**
> InputStreamResource read(organization, id4n, authorization, acceptLanguage)

Read data from microstorage

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.MicrostorageApi;


MicrostorageApi apiInstance = new MicrostorageApi();
Long organization = 789L; // Long | organization
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    InputStreamResource result = apiInstance.read(organization, id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MicrostorageApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**InputStreamResource**](InputStreamResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="write"></a>
# **write**
> Object write(organization, id4n, authorization, acceptLanguage, contentType, contentLength)

Write data to microstorage

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.MicrostorageApi;


MicrostorageApi apiInstance = new MicrostorageApi();
Long organization = 789L; // Long | organization
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
String contentType = "contentType_example"; // String | Content-Type
Long contentLength = 789L; // Long | Content-Length
try {
    Object result = apiInstance.write(organization, id4n, authorization, acceptLanguage, contentType, contentLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MicrostorageApi#write");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **Long**| organization |
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **contentType** | **String**| Content-Type | [optional]
 **contentLength** | **Long**| Content-Length | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json;charset=UTF-8

