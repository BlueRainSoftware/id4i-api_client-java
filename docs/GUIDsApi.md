# GUIDsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](GUIDsApi.md#addGuidAlias) | **POST** /api/v1/guids/{id4n}/alias/{aliasType} | Add alias for GUIDs
[**addGuidAlias1**](GUIDsApi.md#addGuidAlias1) | **DELETE** /api/v1/guids/{id4n}/alias/{aliasType} | Remove aliases from GUIDs
[**createGuid**](GUIDsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
[**getGuid**](GUIDsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
[**getGuidAliases**](GUIDsApi.md#getGuidAliases) | **GET** /api/v1/guids/{id4n}/alias | Get all aliases for the given GUID
[**getGuidsWithoutCollection**](GUIDsApi.md#getGuidsWithoutCollection) | **GET** /api/v1/guids/withoutCollection | Retrieve GUIDs not in any collection
[**getId4n**](GUIDsApi.md#getId4n) | **GET** /api/v1/id4ns/{id4n} | Retrieve ID4n information
[**setGuid**](GUIDsApi.md#setGuid) | **PUT** /api/v1/guids/{id4n} | Change GUID information.
[**setGuid1**](GUIDsApi.md#setGuid1) | **PATCH** /api/v1/guids/{id4n} | Change GUID information.


<a name="addGuidAlias"></a>
# **addGuidAlias**
> ApiError addGuidAlias(id4n, aliasType, alias)

Add alias for GUIDs

Adds or replaces aliases for single GUIDs (alias type item and mapp) or groups of GUIDs (alias types gtin, ean and article)

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
GuidAlias alias = new GuidAlias(); // GuidAlias | The alias to add or update
try {
    ApiError result = apiInstance.addGuidAlias(id4n, aliasType, alias);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#addGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid, tracking]
 **alias** | [**GuidAlias**](GuidAlias.md)| The alias to add or update |

### Return type

[**ApiError**](ApiError.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="addGuidAlias1"></a>
# **addGuidAlias1**
> ApiError addGuidAlias1(id4n, aliasType)

Remove aliases from GUIDs

Remove the alias of the given type

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID to operate on
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
try {
    ApiError result = apiInstance.addGuidAlias1(id4n, aliasType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#addGuidAlias1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID to operate on |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: gtin, article, mapp, item, rfid, tracking]

### Return type

[**ApiError**](ApiError.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createGuid"></a>
# **createGuid**
> ListOfId4ns createGuid(createGUIDInfo)

Create GUID(s)

Creating one or more GUIDs with a specified length.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
CreateGuidRequest createGUIDInfo = new CreateGuidRequest(); // CreateGuidRequest | createGUIDInfo
try {
    ListOfId4ns result = apiInstance.createGuid(createGUIDInfo);
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

### Return type

[**ListOfId4ns**](ListOfId4ns.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getGuid"></a>
# **getGuid**
> Guid getGuid(id4n)

Retrieve GUID information

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID number
try {
    Guid result = apiInstance.getGuid(id4n);
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

### Return type

[**Guid**](Guid.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getGuidAliases"></a>
# **getGuidAliases**
> Map&lt;String, String&gt; getGuidAliases(id4n)

Get all aliases for the given GUID

Looks up the alias for each alias type (group and single GUID) and returns all found ones

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID to operate on
try {
    Map<String, String> result = apiInstance.getGuidAliases(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#getGuidAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID to operate on |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getGuidsWithoutCollection"></a>
# **getGuidsWithoutCollection**
> PaginatedResponseGuid getGuidsWithoutCollection(organizationId, offset, limit)

Retrieve GUIDs not in any collection

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
Long organizationId = 789L; // Long | Organization to search GUIDs for (required).
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedResponseGuid result = apiInstance.getGuidsWithoutCollection(organizationId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#getGuidsWithoutCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| Organization to search GUIDs for (required). |
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedResponseGuid**](PaginatedResponseGuid.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getId4n"></a>
# **getId4n**
> Id4nPresentation getId4n(id4n)

Retrieve ID4n information

Retrieving basic information about an ID like the type and the creation time.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The ID to resolve to
try {
    Id4nPresentation result = apiInstance.getId4n(id4n);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#getId4n");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The ID to resolve to |

### Return type

[**Id4nPresentation**](Id4nPresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setGuid"></a>
# **setGuid**
> Object setGuid(id4n, request)

Change GUID information.

Allows ownership transfer.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID number
Guid request = new Guid(); // Guid | request
try {
    Object result = apiInstance.setGuid(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#setGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID number |
 **request** | [**Guid**](Guid.md)| request |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setGuid1"></a>
# **setGuid1**
> Object setGuid1(id4n, request)

Change GUID information.

Allows ownership transfer.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.GUIDsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID number
Guid request = new Guid(); // Guid | request
try {
    Object result = apiInstance.setGuid1(id4n, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#setGuid1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID number |
 **request** | [**Guid**](Guid.md)| request |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

