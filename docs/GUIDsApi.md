# GUIDsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGuidAlias**](GUIDsApi.md#addGuidAlias) | **POST** /api/v1/guids/{id4n}/alias/{aliasType} | Add alias for GUIDs
[**addGuidAlias1**](GUIDsApi.md#addGuidAlias1) | **DELETE** /api/v1/guids/{id4n}/alias/{aliasType} | Remove aliases from GUIDs
[**createGuid**](GUIDsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
[**getGuid**](GUIDsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
[**getGuidsWithoutCollection**](GUIDsApi.md#getGuidsWithoutCollection) | **GET** /api/v1/guids/withoutCollection | Retrieve GUIDs not in any collection
[**updateGuid**](GUIDsApi.md#updateGuid) | **PUT** /api/v1/guids/{id4n} | Change GUID information.


<a name="addGuidAlias"></a>
# **addGuidAlias**
> ApiError addGuidAlias(id4n, aliasType, alias, authorization, acceptLanguage)

Add alias for GUIDs

Adds or replaces aliases for single GUIDs (alias type item and mapp) or groups of GUIDs (alias types gtin, ean and article)

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID for which to add the alias
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
GuidAlias alias = new GuidAlias(); // GuidAlias | The alias to add or update
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addGuidAlias(id4n, aliasType, alias, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#addGuidAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID for which to add the alias |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: ean, gtin, article, mapp, item]
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
//import de.id4i.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID for which to add the alias
String aliasType = "aliasType_example"; // String | Alias type, see the corresponding API model
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addGuidAlias1(id4n, aliasType, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GUIDsApi#addGuidAlias1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| The GUID for which to add the alias |
 **aliasType** | **String**| Alias type, see the corresponding API model | [enum: ean, gtin, article, mapp, item]
 **authorization** | **String**| Authorization JWT Bearer Token as returned from /login | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createGuid"></a>
# **createGuid**
> ListOfId4ns createGuid(createGUIDInfo, authorization, acceptLanguage)

Create GUID(s)

Creating one or more GUIDs with a specified length.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.GUIDsApi;


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
//import de.id4i.ApiException;
//import de.id4i.api.GUIDsApi;


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

<a name="getGuidsWithoutCollection"></a>
# **getGuidsWithoutCollection**
> PaginatedResponseGuid getGuidsWithoutCollection(organizationId, authorization, acceptLanguage, offset, limit)

Retrieve GUIDs not in any collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
Long organizationId = 789L; // Long | Organization to search GUIDs for (required).
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedResponseGuid result = apiInstance.getGuidsWithoutCollection(organizationId, authorization, acceptLanguage, offset, limit);
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

<a name="updateGuid"></a>
# **updateGuid**
> Object updateGuid(id4n, request, authorization, acceptLanguage)

Change GUID information.

Allows ownership transfer.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.GUIDsApi;


GUIDsApi apiInstance = new GUIDsApi();
String id4n = "id4n_example"; // String | The GUID number
Guid request = new Guid(); // Guid | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.updateGuid(id4n, request, authorization, acceptLanguage);
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

