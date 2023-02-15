# BusinessApi

All URIs are relative to *https://api.trulioo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBusinessSearchResult**](BusinessApi.md#getBusinessSearchResult) | **GET** /business/v1/search/transactionrecord/{id} | returns the a business search result.
[**search**](BusinessApi.md#search) | **POST** /business/v1/search | Calling this method will perform a business search.


<a name="getBusinessSearchResult"></a>
# **getBusinessSearchResult**
> BusinessSearchResponse getBusinessSearchResult(id)

returns the a business search result.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

BusinessApi apiInstance = new BusinessApi();
String id = "id_example"; // String | transaction record id
try {
    BusinessSearchResponse result = apiInstance.getBusinessSearchResult(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#getBusinessSearchResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| transaction record id |

### Return type

[**BusinessSearchResponse**](BusinessSearchResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="search"></a>
# **search**
> BusinessSearchResponse search(request)

Calling this method will perform a business search.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.BusinessApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

BusinessApi apiInstance = new BusinessApi();
BusinessSearchRequest request = new BusinessSearchRequest(); // BusinessSearchRequest | 
try {
    BusinessSearchResponse result = apiInstance.search(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**BusinessSearchRequest**](BusinessSearchRequest.md)|  |

### Return type

[**BusinessSearchResponse**](BusinessSearchResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json

