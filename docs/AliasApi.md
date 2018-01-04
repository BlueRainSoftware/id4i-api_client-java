# AliasApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](AliasApi.md#addGuidAlias) | **POST** /api/v1/guids/{id4n}/alias/{aliasType} | Add alias for GUIDs
[**addGuidAlias1**](AliasApi.md#addGuidAlias1) | **DELETE** /api/v1/guids/{id4n}/alias/{aliasType} | Remove aliases from GUIDs


<a name="addGuidAlias"></a>
# **addGuidAlias**
> ApiError addGuidAlias(id4n, aliasType, alias, authorization, acceptLanguage)

Add alias for GUIDs

Adds or replaces aliases for single GUIDs (alias type item and mapp) or groups of GUIDs (alias types gtin, ean and article)

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String id4n = "id4n_example"; // String | The GUID for which to add the alias
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
GuidAlias alias = new GuidAlias(); // GuidAlias | The alias to add or update
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addGuidAlias(id4n, aliasType, alias, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#addGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID for which to add the alias |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: ean, gtin, article, mapp, item, rfid]
 **alias** | [**GuidAlias**](GuidAlias.md)| The alias to add or update |
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="addGuidAlias1"></a>
# **addGuidAlias1**
> ApiError addGuidAlias1(id4n, aliasType, authorization, acceptLanguage)

Remove aliases from GUIDs

Remove the alias of the given type

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String id4n = "id4n_example"; // String | The GUID for which to add the alias
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addGuidAlias1(id4n, aliasType, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#addGuidAlias1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID for which to add the alias |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: ean, gtin, article, mapp, item, rfid]
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

