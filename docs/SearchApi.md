# SearchApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchByAlias**](SearchApi.md#searchByAlias) | **GET** /api/v1/search/guids | Search for GUIDs by alias


<a name="searchByAlias"></a>
# **searchByAlias**
> PaginatedResponseGuid searchByAlias(alias, aliasType, authorization, acceptLanguage, offset, limit)

Search for GUIDs by alias

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String alias = "alias_example"; // String | The alias to search for
String aliasType = "aliasType_example"; // String | Alias type type to search for
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedResponseGuid result = apiInstance.searchByAlias(alias, aliasType, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**| The alias to search for |
 **aliasType** | **String**| Alias type type to search for | [enum: ean, gtin, article, mapp, item, rfid]
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

### Return type

[**PaginatedResponseGuid**](PaginatedResponseGuid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

