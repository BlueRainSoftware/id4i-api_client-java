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
[**isContractRequired**](AccountsApi.md#isContractRequired) | **GET** /account/contractRequired | Tells you whether your company needs to have a contract with BlueRain to be able to sign up
[**listAllRoles**](AccountsApi.md#listAllRoles) | **GET** /api/v1/roles | List roles
[**login**](AccountsApi.md#login) | **POST** /login | 
[**registerUser**](AccountsApi.md#registerUser) | **POST** /account/registration | Register user
[**removeUserRoles**](AccountsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
[**requestPasswordReset**](AccountsApi.md#requestPasswordReset) | **POST** /account/password | Request password reset
[**verifyPasswordReset**](AccountsApi.md#verifyPasswordReset) | **PUT** /account/password | Verify password reset
[**verifyUserRegistration**](AccountsApi.md#verifyUserRegistration) | **POST** /account/verification | Verify registration


<a name="addUserRoles"></a>
# **addUserRoles**
> addUserRoles(organizationId, username, changeRoleRequest)

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
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
try {
    apiInstance.addUserRoles(organizationId, username, changeRoleRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#addUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **username** | **String**| username |
 **changeRoleRequest** | [**ChangeRoleRequest**](ChangeRoleRequest.md)| changeRoleRequest |

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
> PaginatedUserPresentationResponse findUsers(usernamePrefix, offset, limit)

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
String usernamePrefix = "usernamePrefix_example"; // String | 
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedUserPresentationResponse result = apiInstance.findUsers(usernamePrefix, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#findUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePrefix** | **String**|  | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedUserPresentationResponse**](PaginatedUserPresentationResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getAllOrganizationRoles"></a>
# **getAllOrganizationRoles**
> PaginatedUserRolesResponse getAllOrganizationRoles(organizationId, offset, limit)

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
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedUserRolesResponse result = apiInstance.getAllOrganizationRoles(organizationId, offset, limit);
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
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedUserRolesResponse**](PaginatedUserRolesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getOrganizationsOfUser"></a>
# **getOrganizationsOfUser**
> PaginatedOrganizationResponse getOrganizationsOfUser(role, offset, limit)

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
String role = "role_example"; // String | role
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedOrganizationResponse result = apiInstance.getOrganizationsOfUser(role, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getOrganizationsOfUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| role | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedOrganizationResponse**](PaginatedOrganizationResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getUserRoles"></a>
# **getUserRoles**
> PaginatedStringResponse getUserRoles(organizationId, username, offset, limit)

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
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedStringResponse result = apiInstance.getUserRoles(organizationId, username, offset, limit);
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
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedStringResponse**](PaginatedStringResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getUsersOfOrganization"></a>
# **getUsersOfOrganization**
> PaginatedUserPresentationResponse getUsersOfOrganization(organizationId, offset, limit)

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
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    PaginatedUserPresentationResponse result = apiInstance.getUsersOfOrganization(organizationId, offset, limit);
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
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

### Return type

[**PaginatedUserPresentationResponse**](PaginatedUserPresentationResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="inviteUsers"></a>
# **inviteUsers**
> inviteUsers(organizationId, invitationList)

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
String organizationId = "organizationId_example"; // String | The namespace of the organization where users should be invited
OrganizationUserInvitationListRequest invitationList = new OrganizationUserInvitationListRequest(); // OrganizationUserInvitationListRequest | invitationList
try {
    apiInstance.inviteUsers(organizationId, invitationList);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#inviteUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization where users should be invited |
 **invitationList** | [**OrganizationUserInvitationListRequest**](OrganizationUserInvitationListRequest.md)| invitationList |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="isContractRequired"></a>
# **isContractRequired**
> Boolean isContractRequired()

Tells you whether your company needs to have a contract with BlueRain to be able to sign up

On production systems, users must confirm that their organization has a valid contract for ID4i usage. It is not required on test and sandbox systems. 

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    Boolean result = apiInstance.isContractRequired();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#isContractRequired");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="listAllRoles"></a>
# **listAllRoles**
> RoleResponse listAllRoles(privilege, offset, limit)

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
String privilege = "privilege_example"; // String | If specified the roles will be filtered containing that privilege.
Integer offset = 56; // Integer | Start with the n-th element
Integer limit = 56; // Integer | The maximum count of returned elements
try {
    RoleResponse result = apiInstance.listAllRoles(privilege, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAllRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilege** | **String**| If specified the roles will be filtered containing that privilege. | [optional]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]

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
> removeUserRoles(organizationId, username, changeRoleRequest)

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
String organizationId = "organizationId_example"; // String | The namespace of the organization
String username = "username_example"; // String | username
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
try {
    apiInstance.removeUserRoles(organizationId, username, changeRoleRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#removeUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace of the organization |
 **username** | **String**| username |
 **changeRoleRequest** | [**ChangeRoleRequest**](ChangeRoleRequest.md)| changeRoleRequest |

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

