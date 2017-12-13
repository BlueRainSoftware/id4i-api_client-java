# id4i-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>de.id4i.api</groupId>
    <artifactId>id4i-api-client</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "de.id4i.api:id4i-api-client:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/id4i-api-client-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import de.id4i.*;
import de.id4i.auth.*;
import de.id4i.api.model.*;
import de.id4i.api.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
        
        AccountsApi apiInstance = new AccountsApi();
        String username = "username_example"; // String | username
        String authorization = "authorization_example"; // String | Authorization JWT Bearer Token as returned from /login
        String acceptLanguage = "acceptLanguage_example"; // String | Requested language
        try {
            UserPresentation result = apiInstance.findUserByUsername(username, authorization, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#findUserByUsername");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**findUserByUsername**](docs/AccountsApi.md#findUserByUsername) | **GET** /api/v1/users/{username} | Find by username
*AccountsApi* | [**getAllOrganizationRoles**](docs/AccountsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
*AccountsApi* | [**getOrganizationsOfUser**](docs/AccountsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
*AccountsApi* | [**getUserRoles**](docs/AccountsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
*AccountsApi* | [**getUsersOfOrganization**](docs/AccountsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
*AccountsApi* | [**listAllRoles**](docs/AccountsApi.md#listAllRoles) | **GET** /api/v1/roles | List roles
*AccountsApi* | [**login**](docs/AccountsApi.md#login) | **POST** /login | 
*AccountsApi* | [**registerUser**](docs/AccountsApi.md#registerUser) | **POST** /account/registration | Register user
*AccountsApi* | [**removeUserRoles**](docs/AccountsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
*AccountsApi* | [**requestPasswordReset**](docs/AccountsApi.md#requestPasswordReset) | **POST** /account/password | Request password reset
*AccountsApi* | [**updateUserRoles**](docs/AccountsApi.md#updateUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
*AccountsApi* | [**verifyPasswordReset**](docs/AccountsApi.md#verifyPasswordReset) | **PUT** /account/password | Verify password reset
*AccountsApi* | [**verifyUserRegistration**](docs/AccountsApi.md#verifyUserRegistration) | **POST** /account/verification | Verify registration
*ApiKeysApi* | [**createNewApiKey**](docs/ApiKeysApi.md#createNewApiKey) | **POST** /api/v1/apikeys | Create apiKey
*ApiKeysApi* | [**deleteApiKey**](docs/ApiKeysApi.md#deleteApiKey) | **DELETE** /api/v1/apikeys/{key} | Delete apiKey
*ApiKeysApi* | [**getApiKey**](docs/ApiKeysApi.md#getApiKey) | **GET** /api/v1/apikeys/{key} | Show apiKey
*ApiKeysApi* | [**listAllApiKeysOfOrganization**](docs/ApiKeysApi.md#listAllApiKeysOfOrganization) | **GET** /api/v1/apikeys | Find apiKeys by organization
*ApiKeysApi* | [**listApiKeyPrivileges**](docs/ApiKeysApi.md#listApiKeyPrivileges) | **GET** /api/v1/apikeys/privileges | List ApiKey privileges
*ApiKeysApi* | [**setApiKeyActivationStatus**](docs/ApiKeysApi.md#setApiKeyActivationStatus) | **PUT** /api/v1/apikeys/{key} | Set apiKey activation state
*CollectionsApi* | [**addElementToCollection**](docs/CollectionsApi.md#addElementToCollection) | **PUT** /api/v1/collections/{id4n}/elements/{elementGuid} | Add element to collection
*CollectionsApi* | [**addElementToLabelledCollection**](docs/CollectionsApi.md#addElementToLabelledCollection) | **PUT** /api/v1/collections/labelled/{collectionId4n}/elements/{elementGuid} | Add element to labelled collection
*CollectionsApi* | [**addElementToLogisticCollection**](docs/CollectionsApi.md#addElementToLogisticCollection) | **PUT** /api/v1/collections/logistic/{collectionId4n}/elements/{guid} | Add element to logistic collection
*CollectionsApi* | [**addElementToRoutingCollection**](docs/CollectionsApi.md#addElementToRoutingCollection) | **PUT** /api/v1/collections/routing/{collectionId4n}/elements/{guid} | Add element to routing collection
*CollectionsApi* | [**addElementsToCollection**](docs/CollectionsApi.md#addElementsToCollection) | **PUT** /api/v1/collections/{id4n}/elements | Add elements to collection
*CollectionsApi* | [**addElementsToLabelledCollection**](docs/CollectionsApi.md#addElementsToLabelledCollection) | **PUT** /api/v1/collections/labelled/{collectionId4n}/elements | Add elements to labelled collection
*CollectionsApi* | [**addElementsToLogisticCollection**](docs/CollectionsApi.md#addElementsToLogisticCollection) | **PUT** /api/v1/collections/logistic/{collectionId4n}/elements | Add elements to logistic collection
*CollectionsApi* | [**addElementsToRoutingCollection**](docs/CollectionsApi.md#addElementsToRoutingCollection) | **PUT** /api/v1/collections/routing/{collectionId4n}/elements | Add element to routing collection
*CollectionsApi* | [**createLabelledCollection**](docs/CollectionsApi.md#createLabelledCollection) | **POST** /api/v1/collections/labelled | Create labelled collection
*CollectionsApi* | [**createLogisticCollection**](docs/CollectionsApi.md#createLogisticCollection) | **POST** /api/v1/collections/logistic | Create logistic collection
*CollectionsApi* | [**createRoutingCollection**](docs/CollectionsApi.md#createRoutingCollection) | **POST** /api/v1/collections/routing | Create routing collecton
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /api/v1/collections/{id4n} | Delete collection
*CollectionsApi* | [**deleteLabelledCollection**](docs/CollectionsApi.md#deleteLabelledCollection) | **DELETE** /api/v1/collections/labelled/{id4n} | Delete labelled collection
*CollectionsApi* | [**deleteLogisticCollection**](docs/CollectionsApi.md#deleteLogisticCollection) | **DELETE** /api/v1/collections/logistic/{id4n} | Delete logistic collection
*CollectionsApi* | [**deleteRoutingCollection**](docs/CollectionsApi.md#deleteRoutingCollection) | **DELETE** /api/v1/collections/routing/{id4n} | Delete routing collection
*CollectionsApi* | [**findCollection**](docs/CollectionsApi.md#findCollection) | **GET** /api/v1/collections/{id4n} | Find collection
*CollectionsApi* | [**findLabelledCollection**](docs/CollectionsApi.md#findLabelledCollection) | **GET** /api/v1/collections/labelled/{id4n} | Find labelled collection
*CollectionsApi* | [**findLogisticCollection**](docs/CollectionsApi.md#findLogisticCollection) | **GET** /api/v1/collections/logistic/{id4n} | Find logistic collection
*CollectionsApi* | [**findRoutingCollection**](docs/CollectionsApi.md#findRoutingCollection) | **GET** /api/v1/collections/routing/{id4n} | Find routing collection
*CollectionsApi* | [**getAllCollectionsOfOrganization**](docs/CollectionsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
*CollectionsApi* | [**listElementsOfCollection**](docs/CollectionsApi.md#listElementsOfCollection) | **GET** /api/v1/collections/{id4n}/elements | List contents of the collection
*CollectionsApi* | [**listElementsOfLabelledCollection**](docs/CollectionsApi.md#listElementsOfLabelledCollection) | **GET** /api/v1/collections/labelled/{id4n}/elements | List contents of the collection
*CollectionsApi* | [**listElementsOfLogisticCollection**](docs/CollectionsApi.md#listElementsOfLogisticCollection) | **GET** /api/v1/collections/logistic/{id4n}/elements | List contents of the collection
*CollectionsApi* | [**listElementsOfRoutingCollection**](docs/CollectionsApi.md#listElementsOfRoutingCollection) | **GET** /api/v1/collections/routing/{id4n}/elements | List contents of the collection
*CollectionsApi* | [**removeElementFromCollection**](docs/CollectionsApi.md#removeElementFromCollection) | **DELETE** /api/v1/collections/{id4n}/elements/{elementGuid} | Remove element from collection
*CollectionsApi* | [**removeElementFromLabelledCollection**](docs/CollectionsApi.md#removeElementFromLabelledCollection) | **DELETE** /api/v1/collections/labelled/{collectionId4n}/elements/{elementGuid} | Remove element from labelled collection
*CollectionsApi* | [**removeElementFromLogisticCollection**](docs/CollectionsApi.md#removeElementFromLogisticCollection) | **DELETE** /api/v1/collections/logistic/{collectionId4n}/elements/{elementId4n} | Remove element from logistic collection
*CollectionsApi* | [**removeElementFromRoutingCollection**](docs/CollectionsApi.md#removeElementFromRoutingCollection) | **DELETE** /api/v1/collections/routing/{collectionId4n}/elements/{guid} | Remove element from routing collection
*CollectionsApi* | [**removeElementsFromCollection**](docs/CollectionsApi.md#removeElementsFromCollection) | **DELETE** /api/v1/collections/{id4n}/elements | Remove elements from collection
*CollectionsApi* | [**removeElementsFromLabelledCollection**](docs/CollectionsApi.md#removeElementsFromLabelledCollection) | **DELETE** /api/v1/collections/labelled/{collectionId4n}/elements | Remove elements from labelled collection
*CollectionsApi* | [**removeElementsFromLogisticCollection**](docs/CollectionsApi.md#removeElementsFromLogisticCollection) | **DELETE** /api/v1/collections/logistic/{collectionId4n}/elements | Remove elements from logistic collection
*CollectionsApi* | [**removeElementsFromRoutingCollection**](docs/CollectionsApi.md#removeElementsFromRoutingCollection) | **DELETE** /api/v1/collections/routing/{collectionId4n}/elements | Remove elements from routing collection
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PUT** /api/v1/collections/{id4n} | Alter collection
*CollectionsApi* | [**updateLabelledCollection**](docs/CollectionsApi.md#updateLabelledCollection) | **PUT** /api/v1/collections/labelled/{id4n} | Rename labelled collection
*CollectionsApi* | [**updateLogisticCollection**](docs/CollectionsApi.md#updateLogisticCollection) | **PUT** /api/v1/collections/logistic/{id4n} | Update logistic collection
*CollectionsApi* | [**updateRoutingCollection**](docs/CollectionsApi.md#updateRoutingCollection) | **PUT** /api/v1/collections/routing/{id4n} | Update routing collection
*GUIDsApi* | [**createGuid**](docs/GUIDsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
*GUIDsApi* | [**getGuid**](docs/GUIDsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
*GUIDsApi* | [**getGuidsWithoutCollection**](docs/GUIDsApi.md#getGuidsWithoutCollection) | **GET** /api/v1/guids/withoutCollection | Retrieve GUIDs not in any collection
*GUIDsApi* | [**updateGuid**](docs/GUIDsApi.md#updateGuid) | **PUT** /api/v1/guids/{id4n} | Change GUID information.
*ImagesApi* | [**resolveImageUsingGET**](docs/ImagesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image
*MetaInformationApi* | [**applicationInfo**](docs/MetaInformationApi.md#applicationInfo) | **GET** /api/v1/info | Retrieve version information about ID4i
*OrganizationsApi* | [**createOrganization**](docs/OrganizationsApi.md#createOrganization) | **POST** /api/v1/organizations | Create organization
*OrganizationsApi* | [**deleteOrganization**](docs/OrganizationsApi.md#deleteOrganization) | **DELETE** /api/v1/organizations/{organizationId} | Delete organization
*OrganizationsApi* | [**deleteOrganizationBillingAddress**](docs/OrganizationsApi.md#deleteOrganizationBillingAddress) | **DELETE** /api/v1/organizations/{organizationId}/addresses/billing | Remove billing address
*OrganizationsApi* | [**deleteOrganizationLogo**](docs/OrganizationsApi.md#deleteOrganizationLogo) | **DELETE** /api/v1/organizations/{organizationId}/logo | Delete organization logo
*OrganizationsApi* | [**findOrganization**](docs/OrganizationsApi.md#findOrganization) | **GET** /api/v1/organizations/{organizationId} | Find organization by id
*OrganizationsApi* | [**findOrganizationAddress**](docs/OrganizationsApi.md#findOrganizationAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/default | Retrieve address
*OrganizationsApi* | [**findOrganizationBillingAddress**](docs/OrganizationsApi.md#findOrganizationBillingAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/billing | Retrieve billing address
*OrganizationsApi* | [**getAllCollectionsOfOrganization**](docs/OrganizationsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
*OrganizationsApi* | [**getAllOrganizationRoles**](docs/OrganizationsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
*OrganizationsApi* | [**getOrganizationsOfUser**](docs/OrganizationsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
*OrganizationsApi* | [**getUserRoles**](docs/OrganizationsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
*OrganizationsApi* | [**getUsersOfOrganization**](docs/OrganizationsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
*OrganizationsApi* | [**removeUserRoles**](docs/OrganizationsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
*OrganizationsApi* | [**updateOrganization**](docs/OrganizationsApi.md#updateOrganization) | **PUT** /api/v1/organizations/{organizationId} | Update organization
*OrganizationsApi* | [**updateOrganizationAddress**](docs/OrganizationsApi.md#updateOrganizationAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/default | Store address
*OrganizationsApi* | [**updateOrganizationBillingAddress**](docs/OrganizationsApi.md#updateOrganizationBillingAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/billing | Store billing address
*OrganizationsApi* | [**updateOrganizationLogo**](docs/OrganizationsApi.md#updateOrganizationLogo) | **POST** /api/v1/organizations/{organizationId}/logo | Update organization logo
*OrganizationsApi* | [**updateUserRoles**](docs/OrganizationsApi.md#updateUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
*PublicServicesApi* | [**go**](docs/PublicServicesApi.md#go) | **GET** /go/{guid} | Forward
*PublicServicesApi* | [**resolveImageUsingGET**](docs/PublicServicesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image
*PublicServicesApi* | [**resolveWhoIsEntry**](docs/PublicServicesApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n
*RoutingApi* | [**getRoute**](docs/RoutingApi.md#getRoute) | **GET** /api/v1/routingfiles/{id4n}/route/{type} | Retrieve current route of a GUID (or ID4N)
*RoutingApi* | [**getRoutingFile**](docs/RoutingApi.md#getRoutingFile) | **GET** /api/v1/routingfiles/{id4n} | Retrieve routing file
*RoutingApi* | [**updateRoutingFile**](docs/RoutingApi.md#updateRoutingFile) | **PUT** /api/v1/routingfiles/{id4n} | Store routing file
*WhoIsApi* | [**resolveWhoIsEntry**](docs/WhoIsApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n


## Documentation for Models

 - [AccountCredentials](docs/AccountCredentials.md)
 - [ApiError](docs/ApiError.md)
 - [ApiKeyCreationRequest](docs/ApiKeyCreationRequest.md)
 - [ApiKeyPresentation](docs/ApiKeyPresentation.md)
 - [ApiKeyPrivilegeInfo](docs/ApiKeyPrivilegeInfo.md)
 - [ApiKeyPrivilegeResponse](docs/ApiKeyPrivilegeResponse.md)
 - [ApiKeyStatus](docs/ApiKeyStatus.md)
 - [AppInfoPresentation](docs/AppInfoPresentation.md)
 - [ChangeRoleRequest](docs/ChangeRoleRequest.md)
 - [CreateGuidRequest](docs/CreateGuidRequest.md)
 - [CreateLabelledCollectionRequest](docs/CreateLabelledCollectionRequest.md)
 - [CreateLogisticCollectionRequest](docs/CreateLogisticCollectionRequest.md)
 - [CreateRoutingCollectionRequest](docs/CreateRoutingCollectionRequest.md)
 - [Guid](docs/Guid.md)
 - [GuidCollection](docs/GuidCollection.md)
 - [Id4n](docs/Id4n.md)
 - [ListOfId4ns](docs/ListOfId4ns.md)
 - [Organization](docs/Organization.md)
 - [OrganizationAddress](docs/OrganizationAddress.md)
 - [PaginatedApiKeyResponse](docs/PaginatedApiKeyResponse.md)
 - [PaginatedGuidCollection](docs/PaginatedGuidCollection.md)
 - [PaginatedGuidResponse](docs/PaginatedGuidResponse.md)
 - [PaginatedOrganizationResponse](docs/PaginatedOrganizationResponse.md)
 - [PaginatedResponseApiKeyPresentation](docs/PaginatedResponseApiKeyPresentation.md)
 - [PaginatedResponseApiKeyPrivilegeInfo](docs/PaginatedResponseApiKeyPrivilegeInfo.md)
 - [PaginatedResponseGuid](docs/PaginatedResponseGuid.md)
 - [PaginatedResponseGuidCollection](docs/PaginatedResponseGuidCollection.md)
 - [PaginatedResponseOrganization](docs/PaginatedResponseOrganization.md)
 - [PaginatedResponseRole](docs/PaginatedResponseRole.md)
 - [PaginatedResponseUserPresentation](docs/PaginatedResponseUserPresentation.md)
 - [PaginatedResponseUserRoles](docs/PaginatedResponseUserRoles.md)
 - [PaginatedResponsestring](docs/PaginatedResponsestring.md)
 - [PaginatedStringResponse](docs/PaginatedStringResponse.md)
 - [PaginatedUserPresentationResponse](docs/PaginatedUserPresentationResponse.md)
 - [PaginatedUserRolesResponse](docs/PaginatedUserRolesResponse.md)
 - [PasswordResetRequest](docs/PasswordResetRequest.md)
 - [PasswordResetVerificationRequest](docs/PasswordResetVerificationRequest.md)
 - [RegistrationVerificationTokenPresentation](docs/RegistrationVerificationTokenPresentation.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [Role](docs/Role.md)
 - [RoleResponse](docs/RoleResponse.md)
 - [Route](docs/Route.md)
 - [RoutingFile](docs/RoutingFile.md)
 - [RoutingFileRequest](docs/RoutingFileRequest.md)
 - [RoutingOptions](docs/RoutingOptions.md)
 - [SimpleMessageResponse](docs/SimpleMessageResponse.md)
 - [UserPresentation](docs/UserPresentation.md)
 - [UserRegistrationRequest](docs/UserRegistrationRequest.md)
 - [UserRegistrationResponse](docs/UserRegistrationResponse.md)
 - [UserRoles](docs/UserRoles.md)
 - [WhoIsResponse](docs/WhoIsResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@bluerain.de

