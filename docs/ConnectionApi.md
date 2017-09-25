# ConnectionApi

All URIs are relative to *https://api.globaldatacompany.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sayHello**](ConnectionApi.md#sayHello) | **GET** /connection/v1/sayhello/{name} | This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.
[**testAuthentication**](ConnectionApi.md#testAuthentication) | **GET** /connection/v1/testauthentication | This method enables you to check if your credentials are valid. You will need to use basic authentication to ensure a successful response.


<a name="sayHello"></a>
# **sayHello**
> String sayHello(name)

This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String name = "name_example"; // String | Name to be returned in the response
try {
    String result = apiInstance.sayHello(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#sayHello");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name to be returned in the response |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="testAuthentication"></a>
# **testAuthentication**
> String testAuthentication()

This method enables you to check if your credentials are valid. You will need to use basic authentication to ensure a successful response.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConnectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConnectionApi apiInstance = new ConnectionApi();
try {
    String result = apiInstance.testAuthentication();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#testAuthentication");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

