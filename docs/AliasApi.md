# AliasApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](AliasApi.md#addGuidAlias) | **POST** /api/v1/id4ns/{id4n}/alias/{aliasType} | Add alias for GUID or Collection
[**getGuidAliasTypes**](AliasApi.md#getGuidAliasTypes) | **GET** /api/v1/search/guids/aliases/types | List all supported alias types
[**getGuidAliases**](AliasApi.md#getGuidAliases) | **GET** /api/v1/id4ns/{id4n}/alias | Get all aliases for the given GUID or Collection.
[**removeGuidAlias**](AliasApi.md#removeGuidAlias) | **DELETE** /api/v1/id4ns/{id4n}/alias/{aliasType} | Remove aliases from GUID or Collection
[**searchByAlias**](AliasApi.md#searchByAlias) | **GET** /api/v1/search/guids | Search for GUIDs by alias


<a name="addGuidAlias"></a>
# **addGuidAlias**
> addGuidAlias(id4n, aliasType, alias)

Add alias for GUID or Collection

Adds or replaces aliases for single ID4ns (alias type item and mapp) or groups of ID4ns (alias types gtin, ean and article)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AliasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AliasApi apiInstance = new AliasApi();
String id4n = "id4n_example"; // String | The GUID or Collection to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
GuidAlias alias = new GuidAlias(); // GuidAlias | The alias to add or update
try {
    apiInstance.addGuidAlias(id4n, aliasType, alias);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#addGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID or Collection to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid, tracking, eclass, unspsc, product, material, reference]
 **alias** | [**GuidAlias**](GuidAlias.md)| The alias to add or update |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGuidAliasTypes"></a>
# **getGuidAliasTypes**
> List&lt;String&gt; getGuidAliasTypes()

List all supported alias types

Retrieve this list to find out all alias types to use with alias search and change operations

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AliasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AliasApi apiInstance = new AliasApi();
try {
    List<String> result = apiInstance.getGuidAliasTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getGuidAliasTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getGuidAliases"></a>
# **getGuidAliases**
> Map&lt;String, String&gt; getGuidAliases(id4n)

Get all aliases for the given GUID or Collection.

Looks up the alias for each alias type (group and single) and returns a map of all aliases found.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AliasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AliasApi apiInstance = new AliasApi();
String id4n = "id4n_example"; // String | The GUID or Collection to operate on
try {
    Map<String, String> result = apiInstance.getGuidAliases(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#getGuidAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID or Collection to operate on |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeGuidAlias"></a>
# **removeGuidAlias**
> removeGuidAlias(id4n, aliasType)

Remove aliases from GUID or Collection

Remove the alias of the given type

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AliasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AliasApi apiInstance = new AliasApi();
String id4n = "id4n_example"; // String | The GUID or Collection to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
try {
    apiInstance.removeGuidAlias(id4n, aliasType);
} catch (ApiException e) {
    System.err.println("Exception when calling AliasApi#removeGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID or Collection to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid, tracking, eclass, unspsc, product, material, reference]

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="searchByAlias"></a>
# **searchByAlias**
> PaginatedResponseOfGuid searchByAlias(alias, aliasType, offset, limit)

Search for GUIDs by alias

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AliasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AliasApi apiInstance = new AliasApi();
String alias = "alias_example"; // String | The alias to search for
String aliasType = "aliasType_example"; // String | Alias type type to search for
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseOfGuid result = apiInstance.searchByAlias(alias, aliasType, offset, limit);
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
 **aliasType** | **String**| Alias type type to search for | [enum: gtin, article, mapp, item, rfid, tracking, eclass, unspsc, product, material, reference]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseOfGuid**](PaginatedResponseOfGuid.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

