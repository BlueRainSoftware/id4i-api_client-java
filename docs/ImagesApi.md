# ImagesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resolveImageUsingGET**](ImagesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image


<a name="resolveImageUsingGET"></a>
# **resolveImageUsingGET**
> byte[] resolveImageUsingGET(imageID, authorization, acceptLanguage)

Resolve image

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.ImagesApi;


ImagesApi apiInstance = new ImagesApi();
String imageID = "imageID_example"; // String | The id of the image to be resolved.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    byte[] result = apiInstance.resolveImageUsingGET(imageID, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImagesApi#resolveImageUsingGET");
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

