# AccountsApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserRoles**](AccountsApi.md#addUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
[**completeRegistration**](AccountsApi.md#completeRegistration) | **PUT** /account/registration | Complete registration
[**findUserByUsername**](AccountsApi.md#findUserByUsername) | **GET** /api/v1/users/{username} | Find by username
[**findUsers**](AccountsApi.md#findUsers) | **GET** /api/v1/users | Find users
[**getAllOrganizationRoles**](AccountsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
[**getOrganizationsOfUser**](AccountsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
[**getUserRoles**](AccountsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
[**getUsersOfOrganization**](AccountsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
[**inviteUsers**](AccountsApi.md#inviteUsers) | **POST** /api/v1/organizations/{organizationId}/users/invite | Invite Users
[**listAllRoles**](AccountsApi.md#listAllRoles) | **GET** /api/v1/roles | List roles
[**login**](AccountsApi.md#login) | **POST** /login | 
[**registerUser**](AccountsApi.md#registerUser) | **POST** /account/registration | Register user
[**removeUserRoles**](AccountsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
[**requestPasswordReset**](AccountsApi.md#requestPasswordReset) | **POST** /account/password | Request password reset
[**verifyPasswordReset**](AccountsApi.md#verifyPasswordReset) | **PUT** /account/password | Verify password reset
[**verifyUserRegistration**](AccountsApi.md#verifyUserRegistration) | **POST** /account/verification | Verify registration


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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
try {
    apiInstance.addUserRoles(changeRoleRequest, organizationId, username);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#addUserRoles");
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

<a name="completeRegistration"></a>
# **completeRegistration**
> completeRegistration(completeRegistration)

Complete registration

Completing a registration e.g. for invited users. Finish registration with a username and a password.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
CompleteUserRegistrationRequest completeRegistration = new CompleteUserRegistrationRequest(); // CompleteUserRegistrationRequest | Contains the verification token, the username and the initial password.
try {
    apiInstance.completeRegistration(completeRegistration);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#completeRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **completeRegistration** | [**CompleteUserRegistrationRequest**](CompleteUserRegistrationRequest.md)| Contains the verification token, the username and the initial password. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="findUserByUsername"></a>
# **findUserByUsername**
> UserPresentation findUserByUsername(username)

Find by username

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String username = "username_example"; // String | username
try {
    UserPresentation result = apiInstance.findUserByUsername(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#findUserByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**UserPresentation**](UserPresentation.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="findUsers"></a>
# **findUsers**
> PaginatedUserPresentationResponse findUsers(usernamePrefix, limit, offset)

Find users

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String usernamePrefix = "\"a.v\""; // String | Find users starting with this prefix.
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedUserPresentationResponse result = apiInstance.findUsers(usernamePrefix, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#findUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePrefix** | **String**| Find users starting with this prefix. |
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]

### Return type

[**PaginatedUserPresentationResponse**](PaginatedUserPresentationResponse.md)

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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String organizationId = "organizationId_example"; // String | organizationId
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedUserRolesResponse result = apiInstance.getAllOrganizationRoles(organizationId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAllOrganizationRoles");
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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String role = "role_example"; // String | role
try {
    PaginatedOrganizationResponse result = apiInstance.getOrganizationsOfUser(limit, offset, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getOrganizationsOfUser");
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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedStringResponse result = apiInstance.getUserRoles(organizationId, username, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getUserRoles");
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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String organizationId = "organizationId_example"; // String | organizationId
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
try {
    PaginatedUserPresentationResponse result = apiInstance.getUsersOfOrganization(organizationId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getUsersOfOrganization");
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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
OrganizationUserInvitationListRequest invitationList = new OrganizationUserInvitationListRequest(); // OrganizationUserInvitationListRequest | invitationList
String organizationId = "organizationId_example"; // String | The namespace of the organization where users should be invited
try {
    apiInstance.inviteUsers(invitationList, organizationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#inviteUsers");
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

<a name="listAllRoles"></a>
# **listAllRoles**
> RoleResponse listAllRoles(limit, offset, privilege)

List roles

Listing of roles.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
Integer limit = 100; // Integer | The maximum count of returned elements
Integer offset = 0; // Integer | Start with the n-th element
String privilege = "privilege_example"; // String | If specified the roles will be filtered containing that privilege.
try {
    RoleResponse result = apiInstance.listAllRoles(limit, offset, privilege);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAllRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **privilege** | **String**| If specified the roles will be filtered containing that privilege. | [optional]

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="login"></a>
# **login**
> login(accountCredentials)



ID4i API Login

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
AccountCredentials accountCredentials = new AccountCredentials(); // AccountCredentials | 
try {
    apiInstance.login(accountCredentials);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountCredentials** | [**AccountCredentials**](AccountCredentials.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="registerUser"></a>
# **registerUser**
> UserRegistrationResponse registerUser(userRegistration)

Register user

Registering a new user.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
UserRegistrationRequest userRegistration = new UserRegistrationRequest(); // UserRegistrationRequest | The user information about the new created user.
try {
    UserRegistrationResponse result = apiInstance.registerUser(userRegistration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#registerUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRegistration** | [**UserRegistrationRequest**](UserRegistrationRequest.md)| The user information about the new created user. |

### Return type

[**UserRegistrationResponse**](UserRegistrationResponse.md)

### Authorization

No authorization required

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
//import de.id4i.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
try {
    apiInstance.removeUserRoles(changeRoleRequest, organizationId, username);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#removeUserRoles");
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

<a name="requestPasswordReset"></a>
# **requestPasswordReset**
> SimpleMessageResponse requestPasswordReset(resetRequest)

Request password reset

Requesting a reset for a new password. 

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
PasswordResetRequest resetRequest = new PasswordResetRequest(); // PasswordResetRequest | Contains the required information to request a new password.
try {
    SimpleMessageResponse result = apiInstance.requestPasswordReset(resetRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#requestPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resetRequest** | [**PasswordResetRequest**](PasswordResetRequest.md)| Contains the required information to request a new password. |

### Return type

[**SimpleMessageResponse**](SimpleMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="verifyPasswordReset"></a>
# **verifyPasswordReset**
> SimpleMessageResponse verifyPasswordReset(verificationRequest)

Verify password reset

Setting a new password and verifying the request to set the password.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
PasswordResetVerificationRequest verificationRequest = new PasswordResetVerificationRequest(); // PasswordResetVerificationRequest | Contains the new password and the verification token to set the new password.
try {
    SimpleMessageResponse result = apiInstance.verifyPasswordReset(verificationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#verifyPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verificationRequest** | [**PasswordResetVerificationRequest**](PasswordResetVerificationRequest.md)| Contains the new password and the verification token to set the new password. |

### Return type

[**SimpleMessageResponse**](SimpleMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="verifyUserRegistration"></a>
# **verifyUserRegistration**
> verifyUserRegistration(token)

Verify registration

Verifies a new user registration.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
RegistrationVerificationTokenPresentation token = new RegistrationVerificationTokenPresentation(); // RegistrationVerificationTokenPresentation | The token for user verification.
try {
    apiInstance.verifyUserRegistration(token);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#verifyUserRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**RegistrationVerificationTokenPresentation**](RegistrationVerificationTokenPresentation.md)| The token for user verification. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

