# BillingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPositionsForOrganization**](BillingApi.md#getPositionsForOrganization) | **GET** /api/v1/billing/{organizationId}/positions | Get billing positions for a given organization
[**getSumForOrganization**](BillingApi.md#getSumForOrganization) | **GET** /api/v1/billing/{organizationId} | Get billing amount of services for a given organization


<a name="getPositionsForOrganization"></a>
# **getPositionsForOrganization**
> List&lt;BillingPosition&gt; getPositionsForOrganization(organizationId, fromDate, toDate)

Get billing positions for a given organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BillingApi apiInstance = new BillingApi();
Long organizationId = 789L; // Long | The organization to compute the billing information for
LocalDateTime fromDate = new LocalDateTime(); // LocalDateTime | Billing start date
LocalDateTime toDate = new LocalDateTime(); // LocalDateTime | Billing end date
try {
    List<BillingPosition> result = apiInstance.getPositionsForOrganization(organizationId, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getPositionsForOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The organization to compute the billing information for |
 **fromDate** | **LocalDateTime**| Billing start date | [optional]
 **toDate** | **LocalDateTime**| Billing end date | [optional]

### Return type

[**List&lt;BillingPosition&gt;**](BillingPosition.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getSumForOrganization"></a>
# **getSumForOrganization**
> ServiceCosts getSumForOrganization(organizationId, fromDate, toDate)

Get billing amount of services for a given organization

### Example
```java
// Import classes:
//import de.id4i.ApiClient;
//import de.id4i.ApiException;
//import de.id4i.Configuration;
//import de.id4i.auth.*;
//import de.id4i.api.BillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

BillingApi apiInstance = new BillingApi();
Long organizationId = 789L; // Long | The organization to compute the billing information for
LocalDateTime fromDate = new LocalDateTime(); // LocalDateTime | Billing start date
LocalDateTime toDate = new LocalDateTime(); // LocalDateTime | Billing end date
try {
    ServiceCosts result = apiInstance.getSumForOrganization(organizationId, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#getSumForOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The organization to compute the billing information for |
 **fromDate** | **LocalDateTime**| Billing start date | [optional]
 **toDate** | **LocalDateTime**| Billing end date | [optional]

### Return type

[**ServiceCosts**](ServiceCosts.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

