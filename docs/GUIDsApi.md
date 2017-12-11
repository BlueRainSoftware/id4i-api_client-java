# GUIDsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGuid**](GUIDsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
[**getGuid**](GUIDsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
[**updateGuid**](GUIDsApi.md#updateGuid) | **PUT** /api/v1/guids/{id4n} | Change GUID information.


<a name="createGuid"></a>
# **createGuid**
> ListOfId4ns createGuid(createGUIDInfo, authorization, acceptLanguage)

Create GUID(s)

Creating one or more GUIDs with a specified length.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
CreateGuidRequest createGUIDInfo = new CreateGuidRequest(); // CreateGuidRequest | createGUIDInfo
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ListOfId4ns result = apiInstance.createGuid(createGUIDInfo, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#createGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGUIDInfo** | [**CreateGuidRequest**](CreateGuidRequest.md)| createGUIDInfo |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ListOfId4ns**](ListOfId4ns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getGuid"></a>
# **getGuid**
> Guid getGuid(id4n, authorization, acceptLanguage)

Retrieve GUID information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID number
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Guid result = apiInstance.getGuid(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#getGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID number |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Guid**](Guid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateGuid"></a>
# **updateGuid**
> ResponseEntity updateGuid(id4n, request, authorization, acceptLanguage)

Change GUID information.

Allows ownership transfer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID number
Guid request = new Guid(); // Guid | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ResponseEntity result = apiInstance.updateGuid(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#updateGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID number |
 **request** | [**Guid**](Guid.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

