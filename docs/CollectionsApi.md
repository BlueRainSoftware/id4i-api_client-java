# CollectionsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addElementsToCollection**](CollectionsApi.md#addElementsToCollection) | **POST** /api/v1/collections/{id4n}/elements | Add elements to collection
[**addElementsToLabelledCollection**](CollectionsApi.md#addElementsToLabelledCollection) | **POST** /api/v1/collections/labelled/{collectionId4n}/elements | Add elements to labelled collection
[**addElementsToLogisticCollection**](CollectionsApi.md#addElementsToLogisticCollection) | **POST** /api/v1/collections/logistic/{collectionId4n}/elements | Add elements to logistic collection
[**addElementsToRoutingCollection**](CollectionsApi.md#addElementsToRoutingCollection) | **POST** /api/v1/collections/routing/{collectionId4n}/elements | Add element to routing collection
[**createLabelledCollection**](CollectionsApi.md#createLabelledCollection) | **POST** /api/v1/collections/labelled | Create labelled collection
[**createLogisticCollection**](CollectionsApi.md#createLogisticCollection) | **POST** /api/v1/collections/logistic | Create logistic collection
[**createRoutingCollection**](CollectionsApi.md#createRoutingCollection) | **POST** /api/v1/collections/routing | Create routing collecton
[**deleteCollection**](CollectionsApi.md#deleteCollection) | **DELETE** /api/v1/collections/{id4n} | Delete collection
[**deleteLabelledCollection**](CollectionsApi.md#deleteLabelledCollection) | **DELETE** /api/v1/collections/labelled/{id4n} | Delete labelled collection
[**deleteLogisticCollection**](CollectionsApi.md#deleteLogisticCollection) | **DELETE** /api/v1/collections/logistic/{id4n} | Delete logistic collection
[**deleteRoutingCollection**](CollectionsApi.md#deleteRoutingCollection) | **DELETE** /api/v1/collections/routing/{id4n} | Delete routing collection
[**findCollection**](CollectionsApi.md#findCollection) | **GET** /api/v1/collections/{id4n} | Find collection
[**findLabelledCollection**](CollectionsApi.md#findLabelledCollection) | **GET** /api/v1/collections/labelled/{id4n} | Find labelled collection
[**findLogisticCollection**](CollectionsApi.md#findLogisticCollection) | **GET** /api/v1/collections/logistic/{id4n} | Find logistic collection
[**findRoutingCollection**](CollectionsApi.md#findRoutingCollection) | **GET** /api/v1/collections/routing/{id4n} | Find routing collection
[**getAllCollectionsOfOrganization**](CollectionsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
[**listElementsOfCollection**](CollectionsApi.md#listElementsOfCollection) | **GET** /api/v1/collections/{id4n}/elements | List contents of the collection
[**listElementsOfLabelledCollection**](CollectionsApi.md#listElementsOfLabelledCollection) | **GET** /api/v1/collections/labelled/{id4n}/elements | List contents of the collection
[**listElementsOfLogisticCollection**](CollectionsApi.md#listElementsOfLogisticCollection) | **GET** /api/v1/collections/logistic/{id4n}/elements | List contents of the collection
[**listElementsOfRoutingCollection**](CollectionsApi.md#listElementsOfRoutingCollection) | **GET** /api/v1/collections/routing/{id4n}/elements | List contents of the collection
[**removeElementsFromCollection**](CollectionsApi.md#removeElementsFromCollection) | **DELETE** /api/v1/collections/{id4n}/elements | Remove elements from collection
[**removeElementsFromLabelledCollection**](CollectionsApi.md#removeElementsFromLabelledCollection) | **DELETE** /api/v1/collections/labelled/{collectionId4n}/elements | Remove elements from labelled collection
[**removeElementsFromLogisticCollection**](CollectionsApi.md#removeElementsFromLogisticCollection) | **DELETE** /api/v1/collections/logistic/{collectionId4n}/elements | Remove elements from logistic collection
[**removeElementsFromRoutingCollection**](CollectionsApi.md#removeElementsFromRoutingCollection) | **DELETE** /api/v1/collections/routing/{collectionId4n}/elements | Remove elements from routing collection
[**setCollection**](CollectionsApi.md#setCollection) | **PUT** /api/v1/collections/{id4n} | Set collection
[**setLabelledCollection**](CollectionsApi.md#setLabelledCollection) | **PUT** /api/v1/collections/labelled/{id4n} | Set labelled collection values
[**setLogisticCollection**](CollectionsApi.md#setLogisticCollection) | **PUT** /api/v1/collections/logistic/{id4n} | Replace logistic collection
[**setRoutingCollection**](CollectionsApi.md#setRoutingCollection) | **PUT** /api/v1/collections/routing/{id4n} | Update routing collection
[**updateCollection**](CollectionsApi.md#updateCollection) | **PATCH** /api/v1/collections/{id4n} | Update collection
[**updateLabelledCollection**](CollectionsApi.md#updateLabelledCollection) | **PATCH** /api/v1/collections/labelled/{id4n} | Update labelled collection
[**updateLogisticCollection**](CollectionsApi.md#updateLogisticCollection) | **PATCH** /api/v1/collections/logistic/{id4n} | Update logistic collection
[**updateRoutingCollection**](CollectionsApi.md#updateRoutingCollection) | **PATCH** /api/v1/collections/routing/{id4n} | Update routing collection


<a name="addElementsToCollection"></a>
# **addElementsToCollection**
> ApiError addElementsToCollection(id4n, listOfGuids, authorization, acceptLanguage)

Add elements to collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addElementsToCollection(id4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="addElementsToLabelledCollection"></a>
# **addElementsToLabelledCollection**
> ApiError addElementsToLabelledCollection(collectionId4n, listOfGuids, authorization, acceptLanguage)

Add elements to labelled collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addElementsToLabelledCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="addElementsToLogisticCollection"></a>
# **addElementsToLogisticCollection**
> ApiError addElementsToLogisticCollection(collectionId4n, listOfGuids, authorization, acceptLanguage)

Add elements to logistic collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addElementsToLogisticCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="addElementsToRoutingCollection"></a>
# **addElementsToRoutingCollection**
> ApiError addElementsToRoutingCollection(collectionId4n, listOfGuids, authorization, acceptLanguage)

Add element to routing collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addElementsToRoutingCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#addElementsToRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createLabelledCollection"></a>
# **createLabelledCollection**
> Id4n createLabelledCollection(createInfo, authorization, acceptLanguage)

Create labelled collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
CreateLabelledCollectionRequest createInfo = new CreateLabelledCollectionRequest(); // CreateLabelledCollectionRequest | createInfo
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Id4n result = apiInstance.createLabelledCollection(createInfo, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateLabelledCollectionRequest**](CreateLabelledCollectionRequest.md)| createInfo |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Id4n**](Id4n.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createLogisticCollection"></a>
# **createLogisticCollection**
> Id4n createLogisticCollection(createInfo, authorization, acceptLanguage)

Create logistic collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
CreateLogisticCollectionRequest createInfo = new CreateLogisticCollectionRequest(); // CreateLogisticCollectionRequest | createInfo
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Id4n result = apiInstance.createLogisticCollection(createInfo, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateLogisticCollectionRequest**](CreateLogisticCollectionRequest.md)| createInfo |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Id4n**](Id4n.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createRoutingCollection"></a>
# **createRoutingCollection**
> Id4n createRoutingCollection(createInfo, authorization, acceptLanguage)

Create routing collecton

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
CreateRoutingCollectionRequest createInfo = new CreateRoutingCollectionRequest(); // CreateRoutingCollectionRequest | createInfo
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Id4n result = apiInstance.createRoutingCollection(createInfo, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#createRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInfo** | [**CreateRoutingCollectionRequest**](CreateRoutingCollectionRequest.md)| createInfo |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Id4n**](Id4n.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteCollection"></a>
# **deleteCollection**
> ApiError deleteCollection(id4n, authorization, acceptLanguage)

Delete collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteLabelledCollection"></a>
# **deleteLabelledCollection**
> ApiError deleteLabelledCollection(id4n, authorization, acceptLanguage)

Delete labelled collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteLabelledCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteLogisticCollection"></a>
# **deleteLogisticCollection**
> Object deleteLogisticCollection(id4n, authorization, acceptLanguage)

Delete logistic collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.deleteLogisticCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteRoutingCollection"></a>
# **deleteRoutingCollection**
> ApiError deleteRoutingCollection(id4n, authorization, acceptLanguage)

Delete routing collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteRoutingCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#deleteRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findCollection"></a>
# **findCollection**
> GuidCollection findCollection(id4n, authorization, acceptLanguage)

Find collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    GuidCollection result = apiInstance.findCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**GuidCollection**](GuidCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findLabelledCollection"></a>
# **findLabelledCollection**
> GuidCollection findLabelledCollection(id4n, authorization, acceptLanguage)

Find labelled collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    GuidCollection result = apiInstance.findLabelledCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**GuidCollection**](GuidCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findLogisticCollection"></a>
# **findLogisticCollection**
> GuidCollection findLogisticCollection(id4n, authorization, acceptLanguage)

Find logistic collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    GuidCollection result = apiInstance.findLogisticCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**GuidCollection**](GuidCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findRoutingCollection"></a>
# **findRoutingCollection**
> GuidCollection findRoutingCollection(id4n, authorization, acceptLanguage)

Find routing collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    GuidCollection result = apiInstance.findRoutingCollection(id4n, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#findRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**GuidCollection**](GuidCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getAllCollectionsOfOrganization"></a>
# **getAllCollectionsOfOrganization**
> PaginatedGuidCollection getAllCollectionsOfOrganization(organizationId, authorization, acceptLanguage, offset, limit, type, label, labelPrefix)

Get collections of organization

Retrieving all collections of an organization in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
String type = "type_example"; // String | Filter by this type
String label = "label_example"; // String | Filter by this label
String labelPrefix = "labelPrefix_example"; // String | Filter by this label prefix
try {
    PaginatedGuidCollection result = apiInstance.getAllCollectionsOfOrganization(organizationId, authorization, acceptLanguage, offset, limit, type, label, labelPrefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#getAllCollectionsOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **type** | **String**| Filter by this type | [optional] [enum: ROUTING_COLLECTION, LOGISTIC_COLLECTION, LABELLED_COLLECTION]
 **label** | **String**| Filter by this label | [optional]
 **labelPrefix** | **String**| Filter by this label prefix | [optional]

### Return type

[**PaginatedGuidCollection**](PaginatedGuidCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listElementsOfCollection"></a>
# **listElementsOfCollection**
> PaginatedGuidResponse listElementsOfCollection(id4n, authorization, acceptLanguage, offset, limit)

List contents of the collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedGuidResponse result = apiInstance.listElementsOfCollection(id4n, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listElementsOfLabelledCollection"></a>
# **listElementsOfLabelledCollection**
> PaginatedGuidResponse listElementsOfLabelledCollection(id4n, authorization, acceptLanguage, offset, limit)

List contents of the collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedGuidResponse result = apiInstance.listElementsOfLabelledCollection(id4n, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listElementsOfLogisticCollection"></a>
# **listElementsOfLogisticCollection**
> PaginatedGuidResponse listElementsOfLogisticCollection(id4n, authorization, acceptLanguage, offset, limit)

List contents of the collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedGuidResponse result = apiInstance.listElementsOfLogisticCollection(id4n, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listElementsOfRoutingCollection"></a>
# **listElementsOfRoutingCollection**
> PaginatedGuidResponse listElementsOfRoutingCollection(id4n, authorization, acceptLanguage, offset, limit)

List contents of the collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedGuidResponse result = apiInstance.listElementsOfRoutingCollection(id4n, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#listElementsOfRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedGuidResponse**](PaginatedGuidResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeElementsFromCollection"></a>
# **removeElementsFromCollection**
> ApiError removeElementsFromCollection(id4n, listOfGuids, authorization, acceptLanguage)

Remove elements from collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeElementsFromCollection(id4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeElementsFromLabelledCollection"></a>
# **removeElementsFromLabelledCollection**
> ApiError removeElementsFromLabelledCollection(collectionId4n, listOfGuids, authorization, acceptLanguage)

Remove elements from labelled collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeElementsFromLabelledCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeElementsFromLogisticCollection"></a>
# **removeElementsFromLogisticCollection**
> ApiError removeElementsFromLogisticCollection(collectionId4n, listOfGuids, authorization, acceptLanguage)

Remove elements from logistic collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeElementsFromLogisticCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeElementsFromRoutingCollection"></a>
# **removeElementsFromRoutingCollection**
> ApiError removeElementsFromRoutingCollection(collectionId4n, listOfGuids, authorization, acceptLanguage)

Remove elements from routing collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String collectionId4n = "collectionId4n_example"; // String | collectionId4n
ListOfId4ns listOfGuids = new ListOfId4ns(); // ListOfId4ns | listOfGuids
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeElementsFromRoutingCollection(collectionId4n, listOfGuids, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#removeElementsFromRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId4n** | **String**| collectionId4n |
 **listOfGuids** | [**ListOfId4ns**](ListOfId4ns.md)| listOfGuids |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setCollection"></a>
# **setCollection**
> Object setCollection(id4n, request, authorization, acceptLanguage)

Set collection

Update collection replacing all values but the ID

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.setCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#setCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setLabelledCollection"></a>
# **setLabelledCollection**
> Object setLabelledCollection(id4n, request, authorization, acceptLanguage)

Set labelled collection values

Update labelled collection replacing all values but the ID

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.setLabelledCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#setLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setLogisticCollection"></a>
# **setLogisticCollection**
> Object setLogisticCollection(id4n, request, authorization, acceptLanguage)

Replace logistic collection

Update logistic collection replacing all values but the ID

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.setLogisticCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#setLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setRoutingCollection"></a>
# **setRoutingCollection**
> Object setRoutingCollection(id4n, request, authorization, acceptLanguage)

Update routing collection

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.setRoutingCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#setRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateCollection"></a>
# **updateCollection**
> Object updateCollection(id4n, request, authorization, acceptLanguage)

Update collection

Update collection changing only the given values

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.updateCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateLabelledCollection"></a>
# **updateLabelledCollection**
> Object updateLabelledCollection(id4n, request, authorization, acceptLanguage)

Update labelled collection

Update labelled collection updating only the given values

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.updateLabelledCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateLabelledCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateLogisticCollection"></a>
# **updateLogisticCollection**
> Object updateLogisticCollection(id4n, request, authorization, acceptLanguage)

Update logistic collection

Update logistic collection updating only the given values

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.updateLogisticCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateLogisticCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateRoutingCollection"></a>
# **updateRoutingCollection**
> Object updateRoutingCollection(id4n, request, authorization, acceptLanguage)

Update routing collection

Update routing collection updating only the given values

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
String id4n = "id4n_example"; // String | id4n
GuidCollection request = new GuidCollection(); // GuidCollection | request
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Object result = apiInstance.updateRoutingCollection(id4n, request, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#updateRoutingCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id4n** | **String**| id4n |
 **request** | [**GuidCollection**](GuidCollection.md)| request |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

