# VerificationsApi

All URIs are relative to *https://api.globaldatacompany.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionRecord**](VerificationsApi.md#getTransactionRecord) | **GET** /verifications/v1/transactionrecord/{id} | This method is used to retrieve the request and results of a verification performed using the verify method.  The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request.
[**getTransactionRecordAddress**](VerificationsApi.md#getTransactionRecordAddress) | **GET** /verifications/v1/transactionrecord/{id}/withaddress | Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing.
[**getTransactionRecordVerbose**](VerificationsApi.md#getTransactionRecordVerbose) | **GET** /verifications/v1/transactionrecord/{id}/verbose | Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details.
[**getTransactionStatus**](VerificationsApi.md#getTransactionStatus) | **GET** /verifications/v1/transaction/{id}/status | This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
[**verify**](VerificationsApi.md#verify) | **POST** /verifications/v1/verify | Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal.

<a name="getTransactionRecord"></a>
# **getTransactionRecord**
> TransactionRecordResult getTransactionRecord(id)

This method is used to retrieve the request and results of a verification performed using the verify method.  The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request.

### Example
```java
// Import classes:
//import ApiClient;
//import ApiException;
//import Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import VerificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VerificationsApi apiInstance = new VerificationsApi();
String id = "id_example"; // String | id of the transactionrecord, this will be a GUID
try {
    TransactionRecordResult result = apiInstance.getTransactionRecord(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationsApi#getTransactionRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the transactionrecord, this will be a GUID |

### Return type

[**TransactionRecordResult**](TransactionRecordResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getTransactionRecordAddress"></a>
# **getTransactionRecordAddress**
> TransactionRecordResult getTransactionRecordAddress(id)

Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing.

### Example
```java
// Import classes:
//import ApiClient;
//import ApiException;
//import Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import VerificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VerificationsApi apiInstance = new VerificationsApi();
String id = "id_example"; // String | id of the transactionrecord, this will be a GUID
try {
    TransactionRecordResult result = apiInstance.getTransactionRecordAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationsApi#getTransactionRecordAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the transactionrecord, this will be a GUID |

### Return type

[**TransactionRecordResult**](TransactionRecordResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getTransactionRecordVerbose"></a>
# **getTransactionRecordVerbose**
> TransactionRecordResult getTransactionRecordVerbose(id)

Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details.

### Example
```java
// Import classes:
//import ApiClient;
//import ApiException;
//import Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import VerificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VerificationsApi apiInstance = new VerificationsApi();
String id = "id_example"; // String | id of the transactionrecord, this will be a GUID
try {
    TransactionRecordResult result = apiInstance.getTransactionRecordVerbose(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationsApi#getTransactionRecordVerbose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the transactionrecord, this will be a GUID |

### Return type

[**TransactionRecordResult**](TransactionRecordResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getTransactionStatus"></a>
# **getTransactionStatus**
> TransactionStatus getTransactionStatus(id)

This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.

### Example
```java
// Import classes:
//import ApiClient;
//import ApiException;
//import Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import VerificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VerificationsApi apiInstance = new VerificationsApi();
String id = "id_example"; // String | id of the asynchronous transaction, this will be a GUID
try {
    TransactionStatus result = apiInstance.getTransactionStatus(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationsApi#getTransactionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the asynchronous transaction, this will be a GUID |

### Return type

[**TransactionStatus**](TransactionStatus.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="verify"></a>
# **verify**
> VerifyResult verify(request)

Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal.

### Example
```java
// Import classes:
//import ApiClient;
//import ApiException;
//import Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import VerificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

VerificationsApi apiInstance = new VerificationsApi();
VerifyRequest request = new VerifyRequest(); // VerifyRequest | 
try {
    VerifyResult result = apiInstance.verify(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationsApi#verify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VerifyRequest**](VerifyRequest.md)|  |

### Return type

[**VerifyResult**](VerifyResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json

