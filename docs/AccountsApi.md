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
> ApiError addUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage)

Add role(s) to user

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Long organizationId = 789L; // Long | organizationId
String username = "username_example"; // String | username
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.addUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#addUserRoles");
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

<a name="completeRegistration"></a>
# **completeRegistration**
> ApiError completeRegistration(completeRegistration, authorization, acceptLanguage)

Complete registration

Completing a registration e.g. for invited users. Finish registration with a username and a password.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
CompleteUserRegistrationRequest completeRegistration = new CompleteUserRegistrationRequest(); // CompleteUserRegistrationRequest | Contains the verification token, the username and the initial password.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.completeRegistration(completeRegistration, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#completeRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **completeRegistration** | [**CompleteUserRegistrationRequest**](CompleteUserRegistrationRequest.md)| Contains the verification token, the username and the initial password. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findUserByUsername"></a>
# **findUserByUsername**
> UserPresentation findUserByUsername(username, authorization, acceptLanguage)

Find by username

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String username = "username_example"; // String | username
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    UserPresentation result = apiInstance.findUserByUsername(username, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**UserPresentation**](UserPresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="findUsers"></a>
# **findUsers**
> PaginatedUserPresentationResponse findUsers(usernamePrefix, authorization, acceptLanguage, offset, limit)

Find users

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String usernamePrefix = "usernamePrefix_example"; // String | Find users starting with this prefix.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedUserPresentationResponse result = apiInstance.findUsers(usernamePrefix, authorization, acceptLanguage, offset, limit);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

### Return type

[**PaginatedUserPresentationResponse**](PaginatedUserPresentationResponse.md)

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
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedUserRolesResponse result = apiInstance.getAllOrganizationRoles(organizationId, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAllOrganizationRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

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
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
String role = "role_example"; // String | role
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedOrganizationResponse result = apiInstance.getOrganizationsOfUser(authorization, acceptLanguage, role, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getOrganizationsOfUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **role** | **String**| role | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

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
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Long organizationId = 789L; // Long | organizationId
String username = "username_example"; // String | username
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedStringResponse result = apiInstance.getUserRoles(organizationId, username, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getUserRoles");
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
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

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
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Long organizationId = 789L; // Long | organizationId
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    PaginatedUserPresentationResponse result = apiInstance.getUsersOfOrganization(organizationId, authorization, acceptLanguage, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getUsersOfOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| organizationId |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

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
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Long organizationId = 789L; // Long | organizationId
OrganizationUserInvitationListRequest invitationList = new OrganizationUserInvitationListRequest(); // OrganizationUserInvitationListRequest | invitationList
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.inviteUsers(organizationId, invitationList, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#inviteUsers");
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

<a name="listAllRoles"></a>
# **listAllRoles**
> RoleResponse listAllRoles(authorization, acceptLanguage, privilege, offset, limit)

List roles

Listing of roles.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
String privilege = "privilege_example"; // String | If specified the roles will be filtered containing that privilege.
Integer offset = 56; // Integer | Start with the n-th element. 
Integer limit = 56; // Integer | The maximum count of returned elements.
try {
    RoleResponse result = apiInstance.listAllRoles(authorization, acceptLanguage, privilege, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAllRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]
 **privilege** | **String**| If specified the roles will be filtered containing that privilege. | [optional]
 **offset** | **Integer**| Start with the n-th element.  | [optional]
 **limit** | **Integer**| The maximum count of returned elements. | [optional]

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

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

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="registerUser"></a>
# **registerUser**
> UserRegistrationResponse registerUser(userRegistration, authorization, acceptLanguage)

Register user

Registering a new user.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
UserRegistrationRequest userRegistration = new UserRegistrationRequest(); // UserRegistrationRequest | The user information about the new created user.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    UserRegistrationResponse result = apiInstance.registerUser(userRegistration, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**UserRegistrationResponse**](UserRegistrationResponse.md)

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
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Long organizationId = 789L; // Long | organizationId
String username = "username_example"; // String | username
ChangeRoleRequest changeRoleRequest = new ChangeRoleRequest(); // ChangeRoleRequest | changeRoleRequest
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.removeUserRoles(organizationId, username, changeRoleRequest, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#removeUserRoles");
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

<a name="requestPasswordReset"></a>
# **requestPasswordReset**
> SimpleMessageResponse requestPasswordReset(resetRequest, authorization, acceptLanguage)

Request password reset

Requesting a reset for a new password. 

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
PasswordResetRequest resetRequest = new PasswordResetRequest(); // PasswordResetRequest | Contains the required information to request a new password.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    SimpleMessageResponse result = apiInstance.requestPasswordReset(resetRequest, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**SimpleMessageResponse**](SimpleMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="verifyPasswordReset"></a>
# **verifyPasswordReset**
> SimpleMessageResponse verifyPasswordReset(verificationRequest, authorization, acceptLanguage)

Verify password reset

Setting a new password and verifying the request to set the password.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
PasswordResetVerificationRequest verificationRequest = new PasswordResetVerificationRequest(); // PasswordResetVerificationRequest | Contains the new password and the verification token to set the new password.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    SimpleMessageResponse result = apiInstance.verifyPasswordReset(verificationRequest, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**SimpleMessageResponse**](SimpleMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

<a name="verifyUserRegistration"></a>
# **verifyUserRegistration**
> ApiError verifyUserRegistration(token, authorization, acceptLanguage)

Verify registration

Verifies a new user registration.

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
RegistrationVerificationTokenPresentation token = new RegistrationVerificationTokenPresentation(); // RegistrationVerificationTokenPresentation | The token for user verification.
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ApiError result = apiInstance.verifyUserRegistration(token, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#verifyUserRegistration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**RegistrationVerificationTokenPresentation**](RegistrationVerificationTokenPresentation.md)| The token for user verification. |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ApiError**](ApiError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

