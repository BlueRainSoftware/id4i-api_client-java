# AliasApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](AliasApi.md#addGuidAlias) | **POST** /api/v1/guids/{id4n}/alias/{aliasType} | Add alias for GUIDs
[**addGuidAlias1**](AliasApi.md#addGuidAlias1) | **DELETE** /api/v1/guids/{id4n}/alias/{aliasType} | Remove aliases from GUIDs
[**getGuidAliasTypes**](AliasApi.md#getGuidAliasTypes) | **GET** /api/v1/search/guids/aliases/types | List all supported alias types
[**getGuidAliases**](AliasApi.md#getGuidAliases) | **GET** /api/v1/guids/{id4n}/alias | Get all aliases for the given GUID
[**searchByAlias**](AliasApi.md#searchByAlias) | **GET** /api/v1/search/guids | Search for GUIDs by alias


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
String id4n = "id4n_example"; // String | The GUID to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
GuidAlias alias = new GuidAlias(); // GuidAlias | The alias to add or update
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
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
 **id4n** | **String**| The GUID to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid]
 **alias** | [**GuidAlias**](GuidAlias.md)| The alias to add or update |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
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
String id4n = "id4n_example"; // String | The GUID to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
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
 **id4n** | **String**| The GUID to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid]
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getGuidAliasTypes"></a>
# **getGuidAliasTypes**
> List&lt;String&gt; getGuidAliasTypes(authorization, acceptLanguage)

List all supported alias types

Retrieve this list to find out all alias types to use with alias search and change operations

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    List<String> result = apiInstance.getGuidAliasTypes(authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getGuidAliasTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getGuidAliases"></a>
# **getGuidAliases**
> Map&lt;String, String&gt; getGuidAliases(id4n, authorization, acceptLanguage)

Get all aliases for the given GUID

Looks up the alias for each alias type (group and single GUID) and returns all found ones

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String id4n = "id4n_example"; // String | The GUID to operate on
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Map<String, String> result = apiInstance.getGuidAliases(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getGuidAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID to operate on |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="searchByAlias"></a>
# **searchByAlias**
> PaginatedGuidResponse searchByAlias(alias, aliasType, authorization, acceptLanguage, offset, limit)

Search for GUIDs by alias

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AliasApi;


AliasApi apiInstance = new AliasApi();
String alias = "alias_example"; // String | The alias to search for
String aliasType = "aliasType_example"; // String | Alias type type to search for
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedGuidResponse result = apiInstance.searchByAlias(alias, aliasType, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#searchByAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**| The alias to search for |
 **aliasType** | **String**| Alias type type to search for | [enum: gtin, article, mapp, item, rfid]
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

### Return type

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

