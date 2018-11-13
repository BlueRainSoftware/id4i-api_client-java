# OrganizationsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPartnerOrganization**](OrganizationsApi.md#addPartnerOrganization) | **PUT** /api/v1/organizations/{organizationId}/partner | Add partner
[**addUserRoles**](OrganizationsApi.md#addUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
[**createOrganization**](OrganizationsApi.md#createOrganization) | **POST** /api/v1/organizations | Create organization
[**deleteOrganization**](OrganizationsApi.md#deleteOrganization) | **DELETE** /api/v1/organizations/{organizationId} | Delete organization
[**deleteOrganizationBillingAddress**](OrganizationsApi.md#deleteOrganizationBillingAddress) | **DELETE** /api/v1/organizations/{organizationId}/addresses/billing | Remove billing address
[**deleteOrganizationLogo**](OrganizationsApi.md#deleteOrganizationLogo) | **DELETE** /api/v1/organizations/{organizationId}/logo | Delete organization logo
[**findOrganization**](OrganizationsApi.md#findOrganization) | **GET** /api/v1/organizations/{organizationId} | Find organization by id/namespace
[**findOrganizationAddress**](OrganizationsApi.md#findOrganizationAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/default | Retrieve address
[**findOrganizationBillingAddress**](OrganizationsApi.md#findOrganizationBillingAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/billing | Retrieve billing address
[**getAllCollectionsOfOrganization**](OrganizationsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
[**getAllOrganizationRoles**](OrganizationsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
[**getOrganizationPrivileges**](OrganizationsApi.md#getOrganizationPrivileges) | **GET** /api/v1/organizations/{organizationId}/privileges | List my privileges
[**getOrganizationsOfUser**](OrganizationsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
[**getPartnerOrganizations**](OrganizationsApi.md#getPartnerOrganizations) | **GET** /api/v1/organizations/{organizationId}/partner | Get partners of an organization
[**getUserRoles**](OrganizationsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
[**getUsersOfOrganization**](OrganizationsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
[**inviteUsers**](OrganizationsApi.md#inviteUsers) | **POST** /api/v1/organizations/{organizationId}/users/invite | Invite Users
[**listCountries**](OrganizationsApi.md#listCountries) | **GET** /api/v1/countries | List countries
[**removePartnerOrganization**](OrganizationsApi.md#removePartnerOrganization) | **DELETE** /api/v1/organizations/{organizationId}/partner | Remove partner
[**removeUserRoles**](OrganizationsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
[**setOrganizationLogo**](OrganizationsApi.md#setOrganizationLogo) | **POST** /api/v1/organizations/{organizationId}/logo | Update organization logo
[**updateOrganization**](OrganizationsApi.md#updateOrganization) | **PUT** /api/v1/organizations/{organizationId} | Update organization
[**updateOrganizationAddress**](OrganizationsApi.md#updateOrganizationAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/default | Store address
[**updateOrganizationBillingAddress**](OrganizationsApi.md#updateOrganizationBillingAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/billing | Store billing address


<a name="addPartnerOrganization"></a>
# **addPartnerOrganization**
> addPartnerOrganization(organizationId, request)

Add partner

Adding a partner organization. If the given organization is already a partner the result will be state 200 too.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
AddPartnerRequest request = new AddPartnerRequest(); // AddPartnerRequest | request
try {
    apiInstance.addPartnerOrganization(organizationId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#addPartnerOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **request** | [**AddPartnerRequest**](AddPartnerRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="addUserRoles"></a>
# **addUserRoles**
> addUserRoles(changeRoleRequest, organizationId, username)

Add role(s) to user

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
try {
    apiInstance.addUserRoles(changeRoleRequest, organizationId, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#addUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeRoleRequest** | [**ChangeRoleRequest**](ChangeRoleRequest.md)| changeRoleRequest |
 **organizationId** | **String**| The namespace of the organization |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="createOrganization"></a>
# **createOrganization**
> Organization createOrganization(organization)

Create organization

Creating a new organization.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
Organization organization = new Organization(); // Organization | Organization to be created
try {
    Organization result = apiInstance.createOrganization(organization);
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

### Return type

[**Organization**](Organization.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(organizationId)

Delete organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization to be deleted.
try {
    apiInstance.deleteOrganization(organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization to be deleted. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteOrganizationBillingAddress"></a>
# **deleteOrganizationBillingAddress**
> deleteOrganizationBillingAddress(organizationId)

Remove billing address

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | organizationId
try {
    apiInstance.deleteOrganizationBillingAddress(organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganizationBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="deleteOrganizationLogo"></a>
# **deleteOrganizationLogo**
> deleteOrganizationLogo(organizationId)

Delete organization logo

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization where the logo should be deleted.
try {
    apiInstance.deleteOrganizationLogo(organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#deleteOrganizationLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization where the logo should be deleted. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="findOrganization"></a>
# **findOrganization**
> Organization findOrganization(organizationId)

Find organization by id/namespace

Returns a single organization.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization to be retrieved.
try {
    Organization result = apiInstance.findOrganization(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization to be retrieved. |

### Return type

[**Organization**](Organization.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="findOrganizationAddress"></a>
# **findOrganizationAddress**
> OrganizationAddress findOrganizationAddress(organizationId)

Retrieve address

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | organizationId
try {
    OrganizationAddress result = apiInstance.findOrganizationAddress(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="findOrganizationBillingAddress"></a>
# **findOrganizationBillingAddress**
> OrganizationAddress findOrganizationBillingAddress(organizationId)

Retrieve billing address

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | organizationId
try {
    OrganizationAddress result = apiInstance.findOrganizationBillingAddress(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#findOrganizationBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAllCollectionsOfOrganization"></a>
# **getAllCollectionsOfOrganization**
> PaginatedGuidCollection getAllCollectionsOfOrganization(organizationId, label, labelPrefix, limit, offset, type)

Get collections of organization

Retrieving all collections of an organization in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
String label = "label_example"; // String | Filter by this label
String labelPrefix = "labelPrefix_example"; // String | Filter by this label prefix
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String type = "type_example"; // String | Filter by this type
try {
    PaginatedGuidCollection result = apiInstance.getAllCollectionsOfOrganization(organizationId, label, labelPrefix, limit, offset, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getAllCollectionsOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **label** | **String**| Filter by this label | [optional]
 **labelPrefix** | **String**| Filter by this label prefix | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **type** | **String**| Filter by this type | [optional] [enum: ROUTING_COLLECTION, LOGISTIC_COLLECTION, LABELLED_COLLECTION]

### Return type

[**PaginatedGuidCollection**](PaginatedGuidCollection.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAllOrganizationRoles"></a>
# **getAllOrganizationRoles**
> PaginatedUserRolesResponse getAllOrganizationRoles(organizationId, limit, offset)

List users and their roles

Listing users and their roles in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | organizationId
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedUserRolesResponse result = apiInstance.getAllOrganizationRoles(organizationId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getAllOrganizationRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**PaginatedUserRolesResponse**](PaginatedUserRolesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getOrganizationPrivileges"></a>
# **getOrganizationPrivileges**
> List&lt;String&gt; getOrganizationPrivileges(organizationId)

List my privileges

Listing all privileges of the current user/APIKey of the specified organization.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
try {
    List<String> result = apiInstance.getOrganizationPrivileges(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getOrganizationPrivileges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |

### Return type

**List&lt;String&gt;**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getOrganizationsOfUser"></a>
# **getOrganizationsOfUser**
> PaginatedOrganizationResponse getOrganizationsOfUser(limit, offset, role)

Retrieve organizations of user

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String role = "role_example"; // String | role
try {
    PaginatedOrganizationResponse result = apiInstance.getOrganizationsOfUser(limit, offset, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getOrganizationsOfUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **role** | **String**| role | [optional]

### Return type

[**PaginatedOrganizationResponse**](PaginatedOrganizationResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getPartnerOrganizations"></a>
# **getPartnerOrganizations**
> PaginatedResponseOfPartnerOrganization getPartnerOrganizations(organizationId, limit, offset)

Get partners of an organization

Listing partners in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization to query partner organizations
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedResponseOfPartnerOrganization result = apiInstance.getPartnerOrganizations(organizationId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getPartnerOrganizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization to query partner organizations |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**PaginatedResponseOfPartnerOrganization**](PaginatedResponseOfPartnerOrganization.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getUserRoles"></a>
# **getUserRoles**
> PaginatedStringResponse getUserRoles(organizationId, username, limit, offset)

Get user roles by username

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedStringResponse result = apiInstance.getUserRoles(organizationId, username, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **username** | **String**| username |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**PaginatedStringResponse**](PaginatedStringResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getUsersOfOrganization"></a>
# **getUsersOfOrganization**
> PaginatedUserPresentationResponse getUsersOfOrganization(organizationId, limit, offset)

Find users in organization

Finding users in the specified organization in a paginated manner.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | organizationId
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedUserPresentationResponse result = apiInstance.getUsersOfOrganization(organizationId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#getUsersOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organizationId |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**PaginatedUserPresentationResponse**](PaginatedUserPresentationResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="inviteUsers"></a>
# **inviteUsers**
> inviteUsers(invitationList, organizationId)

Invite Users

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
OrganizationUserInvitationListRequest invitationList = new OrganizationUserInvitationListRequest(); // OrganizationUserInvitationListRequest | invitationList
String organizationId = "organizationId_example"; // String | The namespace of the organization where users should be invited
try {
    apiInstance.inviteUsers(invitationList, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#inviteUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationList** | [**OrganizationUserInvitationListRequest**](OrganizationUserInvitationListRequest.md)| invitationList |
 **organizationId** | **String**| The namespace of the organization where users should be invited |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listCountries"></a>
# **listCountries**
> PaginatedCountryResponse listCountries(limit, offset)

List countries

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedCountryResponse result = apiInstance.listCountries(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#listCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**PaginatedCountryResponse**](PaginatedCountryResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removePartnerOrganization"></a>
# **removePartnerOrganization**
> removePartnerOrganization(organizationId, request)

Remove partner

Removing a partner organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
RemovePartnerRequest request = new RemovePartnerRequest(); // RemovePartnerRequest | request
try {
    apiInstance.removePartnerOrganization(organizationId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#removePartnerOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **request** | [**RemovePartnerRequest**](RemovePartnerRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="removeUserRoles"></a>
# **removeUserRoles**
> removeUserRoles(changeRoleRequest, organizationId, username)

Remove role(s) from user

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
try {
    apiInstance.removeUserRoles(changeRoleRequest, organizationId, username);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#removeUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeRoleRequest** | [**ChangeRoleRequest**](ChangeRoleRequest.md)| changeRoleRequest |
 **organizationId** | **String**| The namespace of the organization |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="setOrganizationLogo"></a>
# **setOrganizationLogo**
> PublicImagePresentation setOrganizationLogo(file, organizationId)

Update organization logo

Updating an organization logo using a multipart file upload.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
File file = new File("/path/to/file.txt"); // File | An image containing the new logo.
String organizationId = "organizationId_example"; // String | The namespace of the organization where the logo should be updated.
try {
    PublicImagePresentation result = apiInstance.setOrganizationLogo(file, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#setOrganizationLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| An image containing the new logo. |
 **organizationId** | **String**| The namespace of the organization where the logo should be updated. |

### Return type

[**PublicImagePresentation**](PublicImagePresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml, application/json

<a name="updateOrganization"></a>
# **updateOrganization**
> Organization updateOrganization(organizationId, organizationUpdate)

Update organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization to be updated.
OrganizationUpdate organizationUpdate = new OrganizationUpdate(); // OrganizationUpdate | Updated organization object
try {
    Organization result = apiInstance.updateOrganization(organizationId, organizationUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization to be updated. |
 **organizationUpdate** | [**OrganizationUpdate**](OrganizationUpdate.md)| Updated organization object |

### Return type

[**Organization**](Organization.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateOrganizationAddress"></a>
# **updateOrganizationAddress**
> OrganizationAddress updateOrganizationAddress(addressResource, organizationId)

Store address

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
OrganizationAddress addressResource = new OrganizationAddress(); // OrganizationAddress | addressResource
String organizationId = "organizationId_example"; // String | organizationId
try {
    OrganizationAddress result = apiInstance.updateOrganizationAddress(addressResource, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganizationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressResource** | [**OrganizationAddress**](OrganizationAddress.md)| addressResource |
 **organizationId** | **String**| organizationId |

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="updateOrganizationBillingAddress"></a>
# **updateOrganizationBillingAddress**
> OrganizationAddress updateOrganizationBillingAddress(addressResource, organizationId)

Store billing address

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.OrganizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

OrganizationsApi apiInstance = new OrganizationsApi();
OrganizationAddress addressResource = new OrganizationAddress(); // OrganizationAddress | addressResource
String organizationId = "organizationId_example"; // String | organizationId
try {
    OrganizationAddress result = apiInstance.updateOrganizationBillingAddress(addressResource, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#updateOrganizationBillingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressResource** | [**OrganizationAddress**](OrganizationAddress.md)| addressResource |
 **organizationId** | **String**| organizationId |

### Return type

[**OrganizationAddress**](OrganizationAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

