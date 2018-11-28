# ID4i API Client Library - Java (de.id4i.api.id4i-api-client)

This library allows developers to interact with the http://id4i.de HTTP API.
Typically you won't have to build it yourselves, you can just pull in the dependency from maven central using Maven, Gradle
or the like.

Feel free to look at the sources and the documentation contained in this repository.

For additional information, please refer to

* http://id4i.de for high level information about the ID4i platform
* https://backend.id4i.de/docs/reference/en/reference.html for information about implementing your own solutions on top of ID4i
* https://backend.id4i.de/docs/reference/en/reference.html#_java for more about this library
* https://github.com/BlueRainSoftware/id4i-api_client-java for this libraries sources
* https://backend.id4i.de/docs/redoc/index.html for API documentation
* https://github.com/BlueRainSoftware/support for getting additional support

- API version: 0.9.3
- Package version: 
    - Build date: 2018-11-28T21:48:29.634Z
- Build package: io.swagger.codegen.languages.JavaClientCodegen

    For more information, please visit [http://bluerain.de](http://bluerain.de)

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>de.id4i.api</groupId>
    <artifactId>id4i-api-client</artifactId>
    <version>0.9.3</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "de.id4i.api:id4i-api-client:0.9.3"
```

### Others

Download the correct version of the library from Maven Central: http://search.maven.org/#search%7Cga%7C1%7Cde.id4i.
Put the Jar file into a library folder and make sure to configure the classpath to pick it up.

## Building the library for yourself

To build and install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

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
    }
    }

```

## Documentation for API Endpoints

All URIs are relative to *https://backend.id4i.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**addUserRoles**](docs/AccountsApi.md#addUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
*AccountsApi* | [**completeRegistration**](docs/AccountsApi.md#completeRegistration) | **PUT** /account/registration | Complete registration
*AccountsApi* | [**findUserByUsername**](docs/AccountsApi.md#findUserByUsername) | **GET** /api/v1/users/{username} | Find by username
*AccountsApi* | [**findUsers**](docs/AccountsApi.md#findUsers) | **GET** /api/v1/users | Find users
*AccountsApi* | [**getAllOrganizationRoles**](docs/AccountsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
*AccountsApi* | [**getOrganizationsOfUser**](docs/AccountsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
*AccountsApi* | [**getUserRoles**](docs/AccountsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
*AccountsApi* | [**getUsersOfOrganization**](docs/AccountsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
*AccountsApi* | [**inviteUsers**](docs/AccountsApi.md#inviteUsers) | **POST** /api/v1/organizations/{organizationId}/users/invite | Invite Users
*AccountsApi* | [**listAllRoles**](docs/AccountsApi.md#listAllRoles) | **GET** /api/v1/roles | List roles
*AccountsApi* | [**login**](docs/AccountsApi.md#login) | **POST** /login | 
*AccountsApi* | [**registerUser**](docs/AccountsApi.md#registerUser) | **POST** /account/registration | Register user
*AccountsApi* | [**removeUserRoles**](docs/AccountsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
*AccountsApi* | [**requestPasswordReset**](docs/AccountsApi.md#requestPasswordReset) | **POST** /account/password | Request password reset
*AccountsApi* | [**verifyPasswordReset**](docs/AccountsApi.md#verifyPasswordReset) | **PUT** /account/password | Verify password reset
*AccountsApi* | [**verifyUserRegistration**](docs/AccountsApi.md#verifyUserRegistration) | **POST** /account/verification | Verify registration
*AliasApi* | [**addGuidAlias**](docs/AliasApi.md#addGuidAlias) | **POST** /api/v1/id4ns/{id4n}/alias/{aliasType} | Add alias for GUID or Collection
*AliasApi* | [**getGuidAliasTypes**](docs/AliasApi.md#getGuidAliasTypes) | **GET** /api/v1/search/guids/aliases/types | List all supported alias types
*AliasApi* | [**getGuidAliases**](docs/AliasApi.md#getGuidAliases) | **GET** /api/v1/id4ns/{id4n}/alias | Get all aliases for the given GUID or Collection.
*AliasApi* | [**removeGuidAlias**](docs/AliasApi.md#removeGuidAlias) | **DELETE** /api/v1/id4ns/{id4n}/alias/{aliasType} | Remove aliases from GUID or Collection
*AliasApi* | [**searchByAlias**](docs/AliasApi.md#searchByAlias) | **GET** /api/v1/search/guids | Search for GUIDs by alias
*ApiKeysApi* | [**addApiKeyPrivilege**](docs/ApiKeysApi.md#addApiKeyPrivilege) | **POST** /api/v1/apikeys/{key}/privileges | Add privilege
*ApiKeysApi* | [**addApiKeyPrivilegeForId4ns**](docs/ApiKeysApi.md#addApiKeyPrivilegeForId4ns) | **POST** /api/v1/apikeys/{key}/privileges/{privilege}/id4ns | Add ID4ns of a privilege
*ApiKeysApi* | [**createNewApiKey**](docs/ApiKeysApi.md#createNewApiKey) | **POST** /api/v1/apikeys | Create API key
*ApiKeysApi* | [**deleteApiKey**](docs/ApiKeysApi.md#deleteApiKey) | **DELETE** /api/v1/apikeys/{key} | Delete API key
*ApiKeysApi* | [**getApiKey**](docs/ApiKeysApi.md#getApiKey) | **GET** /api/v1/apikeys/{key} | Show API key
*ApiKeysApi* | [**listAllApiKeyPrivileges**](docs/ApiKeysApi.md#listAllApiKeyPrivileges) | **GET** /api/v1/apikeys/privileges | List all privileges
*ApiKeysApi* | [**listAllApiKeysOfOrganization**](docs/ApiKeysApi.md#listAllApiKeysOfOrganization) | **GET** /api/v1/apikeys | Find API key by organization
*ApiKeysApi* | [**listApiKeyPrivileges**](docs/ApiKeysApi.md#listApiKeyPrivileges) | **GET** /api/v1/apikeys/{key}/privileges | List privileges
*ApiKeysApi* | [**listId4ns**](docs/ApiKeysApi.md#listId4ns) | **GET** /api/v1/apikeys/{key}/privileges/{privilege}/id4ns | ID4ns of a privilege
*ApiKeysApi* | [**removeApiKeyPrivilege**](docs/ApiKeysApi.md#removeApiKeyPrivilege) | **DELETE** /api/v1/apikeys/{key}/privileges | Remove privilege
*ApiKeysApi* | [**removeApiKeyPrivilegeForId4ns**](docs/ApiKeysApi.md#removeApiKeyPrivilegeForId4ns) | **DELETE** /api/v1/apikeys/{key}/privileges/{privilege}/id4ns | Remove id4ns of a privilege
*ApiKeysApi* | [**updateApiKey**](docs/ApiKeysApi.md#updateApiKey) | **PUT** /api/v1/apikeys/{key} | Update API keys
*AuditingApi* | [**listOrganizationChangeLog**](docs/AuditingApi.md#listOrganizationChangeLog) | **GET** /api/v1/changelog/organization/{organizationId}/ | List change log entries of an organization
*BillingApi* | [**getPositionsForOrganization**](docs/BillingApi.md#getPositionsForOrganization) | **GET** /api/v1/billing/{organizationId}/positions | Get billing positions for a given organization
*BillingApi* | [**getSumForOrganization**](docs/BillingApi.md#getSumForOrganization) | **GET** /api/v1/billing/{organizationId} | Get billing amount of services for a given organization
*CollectionsApi* | [**addElementsToCollection**](docs/CollectionsApi.md#addElementsToCollection) | **POST** /api/v1/collections/{id4n}/elements | Add elements to collection
*CollectionsApi* | [**createCollection**](docs/CollectionsApi.md#createCollection) | **POST** /api/v1/collections | Create collection
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /api/v1/collections/{id4n} | Delete collection
*CollectionsApi* | [**findCollection**](docs/CollectionsApi.md#findCollection) | **GET** /api/v1/collections/{id4n} | Find collection
*CollectionsApi* | [**getAllCollectionsOfOrganization**](docs/CollectionsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
*CollectionsApi* | [**listElementsOfCollection**](docs/CollectionsApi.md#listElementsOfCollection) | **GET** /api/v1/collections/{id4n}/elements | List contents of the collection
*CollectionsApi* | [**removeElementsFromCollection**](docs/CollectionsApi.md#removeElementsFromCollection) | **DELETE** /api/v1/collections/{id4n}/elements | Remove elements from collection
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PATCH** /api/v1/collections/{id4n} | Update collection
*GuidsApi* | [**addGuidAlias**](docs/GuidsApi.md#addGuidAlias) | **POST** /api/v1/id4ns/{id4n}/alias/{aliasType} | Add alias for GUID or Collection
*GuidsApi* | [**createGuid**](docs/GuidsApi.md#createGuid) | **POST** /api/v1/guids | Create GUID(s)
*GuidsApi* | [**getCollections**](docs/GuidsApi.md#getCollections) | **GET** /api/v1/id4ns/{id4n}/collections | Retrieve collections of an ID
*GuidsApi* | [**getGuid**](docs/GuidsApi.md#getGuid) | **GET** /api/v1/guids/{id4n} | Retrieve GUID information
*GuidsApi* | [**getGuidAliases**](docs/GuidsApi.md#getGuidAliases) | **GET** /api/v1/id4ns/{id4n}/alias | Get all aliases for the given GUID or Collection.
*GuidsApi* | [**getGuidsWithoutCollection**](docs/GuidsApi.md#getGuidsWithoutCollection) | **GET** /api/v1/guids/withoutCollection | Retrieve GUIDs not in any collection
*GuidsApi* | [**getId4n**](docs/GuidsApi.md#getId4n) | **GET** /api/v1/id4ns/{id4n} | Retrieve ID4n information
*GuidsApi* | [**removeGuidAlias**](docs/GuidsApi.md#removeGuidAlias) | **DELETE** /api/v1/id4ns/{id4n}/alias/{aliasType} | Remove aliases from GUID or Collection
*GuidsApi* | [**updateGuid**](docs/GuidsApi.md#updateGuid) | **PATCH** /api/v1/guids/{id4n} | Change GUID information.
*HistoryApi* | [**addItem**](docs/HistoryApi.md#addItem) | **POST** /api/v1/history/{id4n} | Add history item
*HistoryApi* | [**filteredList**](docs/HistoryApi.md#filteredList) | **GET** /api/v1/history/{id4n} | List history
*HistoryApi* | [**list**](docs/HistoryApi.md#list) | **GET** /api/v1/history/{id4n}/{organizationId} | DEPRECATED - List history
*HistoryApi* | [**retrieveItem**](docs/HistoryApi.md#retrieveItem) | **GET** /api/v1/history/{id4n}/{organizationId}/{sequenceId} | Get history item
*HistoryApi* | [**updateItem**](docs/HistoryApi.md#updateItem) | **PATCH** /api/v1/history/{id4n}/{organizationId}/{sequenceId} | Update history item
*HistoryApi* | [**updateItemVisibility**](docs/HistoryApi.md#updateItemVisibility) | **PUT** /api/v1/history/{id4n}/{organizationId}/{sequenceId}/visibility | Set history item visibility
*ImagesApi* | [**resolveImageUsingGET**](docs/ImagesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image
*MetaInformationApi* | [**applicationInfo**](docs/MetaInformationApi.md#applicationInfo) | **GET** /api/v1/info | Retrieve version information about ID4i
*OrganizationsApi* | [**addPartnerOrganization**](docs/OrganizationsApi.md#addPartnerOrganization) | **PUT** /api/v1/organizations/{organizationId}/partner | Add partner
*OrganizationsApi* | [**addUserRoles**](docs/OrganizationsApi.md#addUserRoles) | **POST** /api/v1/organizations/{organizationId}/users/{username}/roles | Add role(s) to user
*OrganizationsApi* | [**createOrganization**](docs/OrganizationsApi.md#createOrganization) | **POST** /api/v1/organizations | Create organization
*OrganizationsApi* | [**deleteOrganization**](docs/OrganizationsApi.md#deleteOrganization) | **DELETE** /api/v1/organizations/{organizationId} | Delete organization
*OrganizationsApi* | [**deleteOrganizationBillingAddress**](docs/OrganizationsApi.md#deleteOrganizationBillingAddress) | **DELETE** /api/v1/organizations/{organizationId}/addresses/billing | Remove billing address
*OrganizationsApi* | [**deleteOrganizationLogo**](docs/OrganizationsApi.md#deleteOrganizationLogo) | **DELETE** /api/v1/organizations/{organizationId}/logo | Delete organization logo
*OrganizationsApi* | [**findOrganization**](docs/OrganizationsApi.md#findOrganization) | **GET** /api/v1/organizations/{organizationId} | Find organization by id/namespace
*OrganizationsApi* | [**findOrganizationAddress**](docs/OrganizationsApi.md#findOrganizationAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/default | Retrieve address
*OrganizationsApi* | [**findOrganizationBillingAddress**](docs/OrganizationsApi.md#findOrganizationBillingAddress) | **GET** /api/v1/organizations/{organizationId}/addresses/billing | Retrieve billing address
*OrganizationsApi* | [**getAllCollectionsOfOrganization**](docs/OrganizationsApi.md#getAllCollectionsOfOrganization) | **GET** /api/v1/organizations/{organizationId}/collections | Get collections of organization
*OrganizationsApi* | [**getAllOrganizationRoles**](docs/OrganizationsApi.md#getAllOrganizationRoles) | **GET** /api/v1/organizations/{organizationId}/roles | List users and their roles
*OrganizationsApi* | [**getOrganizationPrivileges**](docs/OrganizationsApi.md#getOrganizationPrivileges) | **GET** /api/v1/organizations/{organizationId}/privileges | List my privileges
*OrganizationsApi* | [**getOrganizationsOfUser**](docs/OrganizationsApi.md#getOrganizationsOfUser) | **GET** /api/v1/user/organizations | Retrieve organizations of user
*OrganizationsApi* | [**getPartnerOrganizations**](docs/OrganizationsApi.md#getPartnerOrganizations) | **GET** /api/v1/organizations/{organizationId}/partner | Get partners of an organization
*OrganizationsApi* | [**getUserRoles**](docs/OrganizationsApi.md#getUserRoles) | **GET** /api/v1/organizations/{organizationId}/users/{username}/roles | Get user roles by username
*OrganizationsApi* | [**getUsersOfOrganization**](docs/OrganizationsApi.md#getUsersOfOrganization) | **GET** /api/v1/organizations/{organizationId}/users | Find users in organization
*OrganizationsApi* | [**inviteUsers**](docs/OrganizationsApi.md#inviteUsers) | **POST** /api/v1/organizations/{organizationId}/users/invite | Invite Users
*OrganizationsApi* | [**listCountries**](docs/OrganizationsApi.md#listCountries) | **GET** /api/v1/countries | List countries
*OrganizationsApi* | [**removePartnerOrganization**](docs/OrganizationsApi.md#removePartnerOrganization) | **DELETE** /api/v1/organizations/{organizationId}/partner | Remove partner
*OrganizationsApi* | [**removeUserRoles**](docs/OrganizationsApi.md#removeUserRoles) | **DELETE** /api/v1/organizations/{organizationId}/users/{username}/roles | Remove role(s) from user
*OrganizationsApi* | [**setOrganizationLogo**](docs/OrganizationsApi.md#setOrganizationLogo) | **POST** /api/v1/organizations/{organizationId}/logo | Update organization logo
*OrganizationsApi* | [**updateOrganization**](docs/OrganizationsApi.md#updateOrganization) | **PUT** /api/v1/organizations/{organizationId} | Update organization
*OrganizationsApi* | [**updateOrganizationAddress**](docs/OrganizationsApi.md#updateOrganizationAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/default | Store address
*OrganizationsApi* | [**updateOrganizationBillingAddress**](docs/OrganizationsApi.md#updateOrganizationBillingAddress) | **PUT** /api/v1/organizations/{organizationId}/addresses/billing | Store billing address
*PublicServicesApi* | [**getPublicDocument**](docs/PublicServicesApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a public document (meta-data only, no content)
*PublicServicesApi* | [**getRoutes**](docs/PublicServicesApi.md#getRoutes) | **GET** /api/v1/public/routes/{id4n} | Retrieve all public routes for a GUID
*PublicServicesApi* | [**go**](docs/PublicServicesApi.md#go) | **GET** /go/{guid} | Forward
*PublicServicesApi* | [**listAllPublicDocuments**](docs/PublicServicesApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List public documents
*PublicServicesApi* | [**listPublicHistory**](docs/PublicServicesApi.md#listPublicHistory) | **GET** /api/v1/public/history/{id4n} | Shows the public history of the given GUID
*PublicServicesApi* | [**readOrganizationInfo**](docs/PublicServicesApi.md#readOrganizationInfo) | **GET** /api/v1/public/organizations/{organizationId} | Read public organization information
*PublicServicesApi* | [**readPublicDocument**](docs/PublicServicesApi.md#readPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName} | Read public document contents
*PublicServicesApi* | [**resolveImageUsingGET**](docs/PublicServicesApi.md#resolveImageUsingGET) | **GET** /api/v1/public/image/{imageID} | Resolve image
*PublicServicesApi* | [**resolveWhoIsEntry**](docs/PublicServicesApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n
*RoutingApi* | [**getAllRoutes**](docs/RoutingApi.md#getAllRoutes) | **GET** /api/v1/routingfiles/{id4n}/routes/{type} | Retrieve all routes of a GUID (or ID4N)
*RoutingApi* | [**getRoute**](docs/RoutingApi.md#getRoute) | **GET** /api/v1/routingfiles/{id4n}/route/{type} | Retrieve current route of a GUID (or ID4N)
*RoutingApi* | [**getRoutingFile**](docs/RoutingApi.md#getRoutingFile) | **GET** /api/v1/routingfiles/{id4n} | Retrieve routing file
*RoutingApi* | [**updateRoutingFile**](docs/RoutingApi.md#updateRoutingFile) | **PUT** /api/v1/routingfiles/{id4n} | Store routing file
*StorageApi* | [**createDocument**](docs/StorageApi.md#createDocument) | **PUT** /api/v1/documents/{id4n}/{organizationId} | Create an empty document for an id4n
*StorageApi* | [**deleteDocument**](docs/StorageApi.md#deleteDocument) | **DELETE** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Delete a document
*StorageApi* | [**getDocument**](docs/StorageApi.md#getDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a document (meta-data only, no content)
*StorageApi* | [**getPublicDocument**](docs/StorageApi.md#getPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName}/metadata | Retrieve a public document (meta-data only, no content)
*StorageApi* | [**listAllDocuments**](docs/StorageApi.md#listAllDocuments) | **GET** /api/v1/documents/{id4n} | List documents
*StorageApi* | [**listAllPublicDocuments**](docs/StorageApi.md#listAllPublicDocuments) | **GET** /api/v1/public/documents/{id4n} | List public documents
*StorageApi* | [**listDocuments**](docs/StorageApi.md#listDocuments) | **GET** /api/v1/documents/{id4n}/{organizationId} | List organization specific documents
*StorageApi* | [**readDocument**](docs/StorageApi.md#readDocument) | **GET** /api/v1/documents/{id4n}/{organizationId}/{fileName} | Read document contents
*StorageApi* | [**readFromMicrostorage**](docs/StorageApi.md#readFromMicrostorage) | **GET** /api/v1/microstorage/{id4n}/{organization} | Read data from microstorage
*StorageApi* | [**readPublicDocument**](docs/StorageApi.md#readPublicDocument) | **GET** /api/v1/public/documents/{id4n}/{organizationId}/{fileName} | Read public document contents
*StorageApi* | [**updateDocumentMetadata**](docs/StorageApi.md#updateDocumentMetadata) | **PATCH** /api/v1/documents/{id4n}/{organizationId}/{fileName}/metadata | Update a document
*StorageApi* | [**writeToMicrostorage**](docs/StorageApi.md#writeToMicrostorage) | **PUT** /api/v1/microstorage/{id4n}/{organization} | Write data to microstorage
*TransferApi* | [**getReceiveInfo**](docs/TransferApi.md#getReceiveInfo) | **GET** /api/v1/transfers/{id4n}/receiveInfo | Show transfer information
*TransferApi* | [**getSendInfo**](docs/TransferApi.md#getSendInfo) | **GET** /api/v1/transfers/{id4n}/sendInfo | Show transfer preparation information
*TransferApi* | [**prepare**](docs/TransferApi.md#prepare) | **PUT** /api/v1/transfers/{id4n}/sendInfo | Prepare an object for transfer
*TransferApi* | [**receive**](docs/TransferApi.md#receive) | **PUT** /api/v1/transfers/{id4n}/receiveInfo | Transfer a GUID or collection, obtaining it (i.e. becoming the holder) and if allowed also taking ownership
*WhoIsApi* | [**resolveWhoIsEntry**](docs/WhoIsApi.md#resolveWhoIsEntry) | **GET** /whois/{id4n} | Resolve owner of id4n


## Documentation for Models

 - [AccountCredentials](docs/AccountCredentials.md)
 - [AddApiKeyPrivilegeRequest](docs/AddApiKeyPrivilegeRequest.md)
 - [AddPartnerRequest](docs/AddPartnerRequest.md)
 - [ApiError](docs/ApiError.md)
 - [ApiKeyChangeRequest](docs/ApiKeyChangeRequest.md)
 - [ApiKeyCreationRequest](docs/ApiKeyCreationRequest.md)
 - [ApiKeyPresentation](docs/ApiKeyPresentation.md)
 - [ApiKeyPrivilege](docs/ApiKeyPrivilege.md)
 - [ApiKeyPrivilegeInfo](docs/ApiKeyPrivilegeInfo.md)
 - [ApiKeyPrivilegeInfoResponse](docs/ApiKeyPrivilegeInfoResponse.md)
 - [ApiKeyPrivilegePaginatedResponse](docs/ApiKeyPrivilegePaginatedResponse.md)
 - [AppInfoPresentation](docs/AppInfoPresentation.md)
 - [BillingPosition](docs/BillingPosition.md)
 - [ChangeLogEntry](docs/ChangeLogEntry.md)
 - [ChangeRoleRequest](docs/ChangeRoleRequest.md)
 - [CompleteUserRegistrationRequest](docs/CompleteUserRegistrationRequest.md)
 - [Country](docs/Country.md)
 - [CreateCollectionRequest](docs/CreateCollectionRequest.md)
 - [CreateGuidRequest](docs/CreateGuidRequest.md)
 - [Document](docs/Document.md)
 - [DocumentUpdate](docs/DocumentUpdate.md)
 - [Guid](docs/Guid.md)
 - [GuidAlias](docs/GuidAlias.md)
 - [GuidCollection](docs/GuidCollection.md)
 - [HistoryItem](docs/HistoryItem.md)
 - [HistoryItemUpdate](docs/HistoryItemUpdate.md)
 - [Id4n](docs/Id4n.md)
 - [Id4nPresentation](docs/Id4nPresentation.md)
 - [Id4nPresentationPaginatedResponse](docs/Id4nPresentationPaginatedResponse.md)
 - [InputStream](docs/InputStream.md)
 - [InputStreamResource](docs/InputStreamResource.md)
 - [ListOfId4ns](docs/ListOfId4ns.md)
 - [Organization](docs/Organization.md)
 - [OrganizationAddress](docs/OrganizationAddress.md)
 - [OrganizationUpdate](docs/OrganizationUpdate.md)
 - [OrganizationUserInvitation](docs/OrganizationUserInvitation.md)
 - [OrganizationUserInvitationListRequest](docs/OrganizationUserInvitationListRequest.md)
 - [PaginatedApiKeyResponse](docs/PaginatedApiKeyResponse.md)
 - [PaginatedChangeLogEntryResponse](docs/PaginatedChangeLogEntryResponse.md)
 - [PaginatedCountryResponse](docs/PaginatedCountryResponse.md)
 - [PaginatedDocumentResponse](docs/PaginatedDocumentResponse.md)
 - [PaginatedGuidCollection](docs/PaginatedGuidCollection.md)
 - [PaginatedGuidCollectionResponse](docs/PaginatedGuidCollectionResponse.md)
 - [PaginatedGuidResponse](docs/PaginatedGuidResponse.md)
 - [PaginatedHistoryItemResponse](docs/PaginatedHistoryItemResponse.md)
 - [PaginatedOrganizationResponse](docs/PaginatedOrganizationResponse.md)
 - [PaginatedResponseApiKeyPresentation](docs/PaginatedResponseApiKeyPresentation.md)
 - [PaginatedResponseApiKeyPrivilege](docs/PaginatedResponseApiKeyPrivilege.md)
 - [PaginatedResponseApiKeyPrivilegeInfo](docs/PaginatedResponseApiKeyPrivilegeInfo.md)
 - [PaginatedResponseChangeLogEntry](docs/PaginatedResponseChangeLogEntry.md)
 - [PaginatedResponseCountry](docs/PaginatedResponseCountry.md)
 - [PaginatedResponseDocument](docs/PaginatedResponseDocument.md)
 - [PaginatedResponseGuid](docs/PaginatedResponseGuid.md)
 - [PaginatedResponseGuidCollection](docs/PaginatedResponseGuidCollection.md)
 - [PaginatedResponseHistoryItem](docs/PaginatedResponseHistoryItem.md)
 - [PaginatedResponseId4nPresentation](docs/PaginatedResponseId4nPresentation.md)
 - [PaginatedResponseOrganization](docs/PaginatedResponseOrganization.md)
 - [PaginatedResponsePartnerOrganization](docs/PaginatedResponsePartnerOrganization.md)
 - [PaginatedResponseRole](docs/PaginatedResponseRole.md)
 - [PaginatedResponseUserPresentation](docs/PaginatedResponseUserPresentation.md)
 - [PaginatedResponseUserRoles](docs/PaginatedResponseUserRoles.md)
 - [PaginatedResponsestring](docs/PaginatedResponsestring.md)
 - [PaginatedStringResponse](docs/PaginatedStringResponse.md)
 - [PaginatedUserPresentationResponse](docs/PaginatedUserPresentationResponse.md)
 - [PaginatedUserRolesResponse](docs/PaginatedUserRolesResponse.md)
 - [PartnerOrganization](docs/PartnerOrganization.md)
 - [PasswordResetRequest](docs/PasswordResetRequest.md)
 - [PasswordResetVerificationRequest](docs/PasswordResetVerificationRequest.md)
 - [PublicImagePresentation](docs/PublicImagePresentation.md)
 - [RegistrationVerificationTokenPresentation](docs/RegistrationVerificationTokenPresentation.md)
 - [RemoveApiKeyPrivilegeRequest](docs/RemoveApiKeyPrivilegeRequest.md)
 - [RemovePartnerRequest](docs/RemovePartnerRequest.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [Role](docs/Role.md)
 - [RoleResponse](docs/RoleResponse.md)
 - [Route](docs/Route.md)
 - [RoutingFile](docs/RoutingFile.md)
 - [RoutingFileRequest](docs/RoutingFileRequest.md)
 - [RoutingOptions](docs/RoutingOptions.md)
 - [ServiceCosts](docs/ServiceCosts.md)
 - [SimpleMessageResponse](docs/SimpleMessageResponse.md)
 - [TransferReceiveInfo](docs/TransferReceiveInfo.md)
 - [TransferSendInfo](docs/TransferSendInfo.md)
 - [URI](docs/URI.md)
 - [URL](docs/URL.md)
 - [UserPresentation](docs/UserPresentation.md)
 - [UserRegistrationRequest](docs/UserRegistrationRequest.md)
 - [UserRegistrationResponse](docs/UserRegistrationResponse.md)
 - [UserRoles](docs/UserRoles.md)
 - [Visibility](docs/Visibility.md)
 - [VisibilityUpdate](docs/VisibilityUpdate.md)
 - [WhoIsResponse](docs/WhoIsResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@bluerain.de
