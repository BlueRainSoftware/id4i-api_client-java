# BillingApi

All URIs are relative to *https://backend.id4i.de*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCollection**](BillingApi.md#findCollection) | **GET** /api/v1/billing/{organizationId} | Get billing amount of services for a given organization


<a name="findCollection"></a>
# **findCollection**
> ServiceCosts findCollection(organizationId, authorization, acceptLanguage)

Get billing amount of services for a given organization

### Example
```java
// Import classes:
//import de.id4i.ApiException;
//import de.id4i.api.BillingApi;


BillingApi apiInstance = new BillingApi();
Long organizationId = 789L; // Long | The organization to compute the billing information for
String authorization = "authorization_example"; // String | Authorization JWT Bearer Token
String acceptLanguage = "acceptLanguage_example"; // String | Requested language
try {
    ServiceCosts result = apiInstance.findCollection(organizationId, authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingApi#findCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Long**| The organization to compute the billing information for |
 **authorization** | **String**| Authorization JWT Bearer Token | [optional]
 **acceptLanguage** | **String**| Requested language | [optional]

### Return type

[**ServiceCosts**](ServiceCosts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, application/json;charset=UTF-8
 - **Accept**: application/xml, application/json;charset=UTF-8

