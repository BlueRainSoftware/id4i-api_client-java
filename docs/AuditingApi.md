# AuditingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOrganizationChangeLog**](AuditingApi.md#listOrganizationChangeLog) | **GET** /api/v1/changelog/organization/{organizationId}/ | List change log entries of an organization


<a name="listOrganizationChangeLog"></a>
# **listOrganizationChangeLog**
> PaginatedChangeLogEntryResponse listOrganizationChangeLog(organizationId, fromDate, limit, messageMimeType, offset, toDate)

List change log entries of an organization

Listing change log entries of the specified organization id.

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.AuditingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

AuditingApi apiInstance = new AuditingApi();
String organizationId = "organizationId_example"; // String | The namespace identifying the organization whose change log entries are to be listed
LocalDateTime fromDate = new LocalDateTime(); // LocalDateTime | From date time as UTC Date-Time format
Integer limit = 100; // Integer | The maximum count of returned elements
String messageMimeType = "text/mustache"; // String | The Mime-type for the message format that should be returned. e.g. 'text/plain' or 'text/mustache' 
Integer offset = 0; // Integer | Start with the n-th element
LocalDateTime toDate = new LocalDateTime(); // LocalDateTime | To date time as UTC Date-Time format
try {
    PaginatedChangeLogEntryResponse result = apiInstance.listOrganizationChangeLog(organizationId, fromDate, limit, messageMimeType, offset, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditingApi#listOrganizationChangeLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| The namespace identifying the organization whose change log entries are to be listed |
 **fromDate** | **LocalDateTime**| From date time as UTC Date-Time format | [optional]
 **limit** | **Integer**| The maximum count of returned elements | [optional]
 **messageMimeType** | **String**| The Mime-type for the message format that should be returned. e.g. &#39;text/plain&#39; or &#39;text/mustache&#39;  | [optional] [default to text/mustache]
 **offset** | **Integer**| Start with the n-th element | [optional]
 **toDate** | **LocalDateTime**| To date time as UTC Date-Time format | [optional]

### Return type

[**PaginatedChangeLogEntryResponse**](PaginatedChangeLogEntryResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

