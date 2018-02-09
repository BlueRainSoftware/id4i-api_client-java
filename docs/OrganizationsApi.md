# OrganizationsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserRoles**](OrganizationsApi.md#addUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
[**createOrganization**](OrganizationsApi.md#createOrganization) | **POST** /api/v1/organizations | Create organization
[**deleteOrganization**](OrganizationsApi.md#deleteOrganization) | **DELETE** /api/v1/organizations/{organizationId} | Delete organization
[**deleteOrganizationBillingAddress**](OrganizationsApi.md#deleteOrganizationBillingAddress) | **DELETE** /api/v1/organizations/{organizationId}/addresses/billing | Remove billing address
[**deleteOrganizationLogo**](OrganizationsApi.md#deleteOrganizationLogo) | **DELETE** /api/v1/organizations/{organizationId}/logo | Delete organization logo
[**findOrganization**](OrganizationsApi.md#findOrganization) | **GET** /api/v1/organizations/{organizationId} | Find organization by id
[**findOrganizationAddress**](OrganizationsApi.md#findOrganizationAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/default | Retrieve address
[**findOrganizationBillingAddress**](OrganizationsApi.md#findOrganizationBillingAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/billing | Retrieve billing address
[**getAllCollectionsOfOrganization**](OrganizationsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
[**getAllOrganizationRoles**](OrganizationsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
[**getOrganizationsOfUser**](OrganizationsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
[**getUserRoles**](OrganizationsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
[**getUsersOfOrganization**](OrganizationsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
[**inviteUsers**](OrganizationsApi.md#inviteUsers) | **POST** /api/v1/organizations/{organizationId}/users/invite | Invite Users
[**listCountries**](OrganizationsApi.md#listCountries) | **GET** /api/v1/countries | List countries
[**removeUserRoles**](OrganizationsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
[**setOrganizationLogo**](OrganizationsApi.md#setOrganizationLogo) | **POST** /api/v1/organizations/{organizationId}/logo | Update organization logo
[**updateOrganization**](OrganizationsApi.md#updateOrganization) | **PUT** /api/v1/organizations/{organizationId} | Update organization
[**updateOrganizationAddress**](OrganizationsApi.md#updateOrganizationAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/default | Store address
[**updateOrganizationBillingAddress**](OrganizationsApi.md#updateOrganizationBillingAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/billing | Store billing address


<a name="addUserRoles"></a>
# **addUserRoles**
> ApiError addUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage)

Add role(s) to user

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String username = "username_example"; // String | username
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#addUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **username** | **String**| username |
 **changeRoleRequest** | [**ChangeRoleRequest**](ChangeRoleRequest.md)| changeRoleRequest |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="createOrganization"></a>
# **createOrganization**
> Organization createOrganization(organization, authorization, acceptLanguage)

Create organization

Creating a new organization.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Organization organization = new Organization(); // Organization | Organization to be created
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Organization result = apiInstance.createOrganization(organization, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#createOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**Organization**](Organization.md)| Organization to be created |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteOrganization"></a>
# **deleteOrganization**
> ApiError deleteOrganization(organizationId, authorization, acceptLanguage)

Delete organization

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | The id of the organization to be deleted.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteOrganization(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The id of the organization to be deleted. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteOrganizationBillingAddress"></a>
# **deleteOrganizationBillingAddress**
> ApiError deleteOrganizationBillingAddress(organizationId, authorization, acceptLanguage)

Remove billing address

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteOrganizationBillingAddress(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganizationBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="deleteOrganizationLogo"></a>
# **deleteOrganizationLogo**
> ApiError deleteOrganizationLogo(organizationId, authorization, acceptLanguage)

Delete organization logo

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | The id of the organization where the logo should be deleted.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.deleteOrganizationLogo(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganizationLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The id of the organization where the logo should be deleted. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findOrganization"></a>
# **findOrganization**
> Organization findOrganization(organizationId, authorization, acceptLanguage)

Find organization by id

Returns a single organization.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | The id of the organization to be retrieved.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Organization result = apiInstance.findOrganization(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The id of the organization to be retrieved. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findOrganizationAddress"></a>
# **findOrganizationAddress**
> OrganizationAddress findOrganizationAddress(organizationId, authorization, acceptLanguage)

Retrieve address

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    OrganizationAddress result = apiInstance.findOrganizationAddress(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findOrganizationBillingAddress"></a>
# **findOrganizationBillingAddress**
> OrganizationAddress findOrganizationBillingAddress(organizationId, authorization, acceptLanguage)

Retrieve billing address

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    OrganizationAddress result = apiInstance.findOrganizationBillingAddress(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

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
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
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
    System.err.println("Exception when calling OrganizationsApi#getAllCollectionsOfOrganization");
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

<a name="getAllOrganizationRoles"></a>
# **getAllOrganizationRoles**
> PaginatedUserRolesResponse getAllOrganizationRoles(organizationId, authorization, acceptLanguage, offset, limit)

List users and their roles

Listing users and their roles in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedUserRolesResponse result = apiInstance.getAllOrganizationRoles(organizationId, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getAllOrganizationRoles");
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

### Return type

[**PaginatedUserRolesResponse**](PaginatedUserRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getOrganizationsOfUser"></a>
# **getOrganizationsOfUser**
> PaginatedOrganizationResponse getOrganizationsOfUser(authorization, acceptLanguage, role, offset, limit)

Retrieve organizations of user

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
String role = "role_example"; // String | role
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOrganizationResponse result = apiInstance.getOrganizationsOfUser(authorization, acceptLanguage, role, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getOrganizationsOfUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **role** | **String**| role | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedOrganizationResponse**](PaginatedOrganizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getUserRoles"></a>
# **getUserRoles**
> PaginatedStringResponse getUserRoles(organizationId, username, authorization, acceptLanguage, offset, limit)

Get user roles by username

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String username = "username_example"; // String | username
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedStringResponse result = apiInstance.getUserRoles(organizationId, username, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **username** | **String**| username |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedStringResponse**](PaginatedStringResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="getUsersOfOrganization"></a>
# **getUsersOfOrganization**
> PaginatedUserPresentationResponse getUsersOfOrganization(organizationId, authorization, acceptLanguage, offset, limit)

Find users in organization

Finding users in the specified organization in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedUserPresentationResponse result = apiInstance.getUsersOfOrganization(organizationId, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getUsersOfOrganization");
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

### Return type

[**PaginatedUserPresentationResponse**](PaginatedUserPresentationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="inviteUsers"></a>
# **inviteUsers**
> ApiError inviteUsers(organizationId, invitationList, authorization, acceptLanguage)

Invite Users

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
OrganizationUserInvitationListRequest invitationList = new OrganizationUserInvitationListRequest(); // OrganizationUserInvitationListRequest | invitationList
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.inviteUsers(organizationId, invitationList, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#inviteUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **invitationList** | [**OrganizationUserInvitationListRequest**](OrganizationUserInvitationListRequest.md)| invitationList |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="listCountries"></a>
# **listCountries**
> PaginatedCountryResponse listCountries(authorization, acceptLanguage, offset, limit)

List countries

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedCountryResponse result = apiInstance.listCountries(authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#listCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedCountryResponse**](PaginatedCountryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="removeUserRoles"></a>
# **removeUserRoles**
> ApiError removeUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage)

Remove role(s) from user

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
String username = "username_example"; // String | username
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#removeUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **username** | **String**| username |
 **changeRoleRequest** | [**ChangeRoleRequest**](ChangeRoleRequest.md)| changeRoleRequest |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="setOrganizationLogo"></a>
# **setOrganizationLogo**
> PublicImagePresentation setOrganizationLogo(organizationId, file, authorization, acceptLanguage)

Update organization logo

Updating an organization logo using a multipart file upload.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | The id of the organization where the logo should be updated.
File file = new File("/path/to/file.txt"); // File | An image containing the new logo.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    PublicImagePresentation result = apiInstance.setOrganizationLogo(organizationId, file, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#setOrganizationLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The id of the organization where the logo should be updated. |
 **file** | **File**| An image containing the new logo. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**PublicImagePresentation**](PublicImagePresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateOrganization"></a>
# **updateOrganization**
> Organization updateOrganization(organizationId, organization, authorization, acceptLanguage)

Update organization

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | The id of the organization to be updated.
Organization organization = new Organization(); // Organization | Updated organization object
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    Organization result = apiInstance.updateOrganization(organizationId, organization, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The id of the organization to be updated. |
 **organization** | [**Organization**](Organization.md)| Updated organization object |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateOrganizationAddress"></a>
# **updateOrganizationAddress**
> OrganizationAddress updateOrganizationAddress(organizationId, addressResource, authorization, acceptLanguage)

Store address

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
OrganizationAddress addressResource = new OrganizationAddress(); // OrganizationAddress | addressResource
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    OrganizationAddress result = apiInstance.updateOrganizationAddress(organizationId, addressResource, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **addressResource** | [**OrganizationAddress**](OrganizationAddress.md)| addressResource |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="updateOrganizationBillingAddress"></a>
# **updateOrganizationBillingAddress**
> OrganizationAddress updateOrganizationBillingAddress(organizationId, addressResource, authorization, acceptLanguage)

Store billing address

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Long organizationId = 789L; // Long | organizationId
OrganizationAddress addressResource = new OrganizationAddress(); // OrganizationAddress | addressResource
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    OrganizationAddress result = apiInstance.updateOrganizationBillingAddress(organizationId, addressResource, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganizationBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **addressResource** | [**OrganizationAddress**](OrganizationAddress.md)| addressResource |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

