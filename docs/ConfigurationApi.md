# ConfigurationApi

All URIs are relative to *https://api.trulioo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDatasources**](ConfigurationApi.md#getAllDatasources) | **GET** /configuration/v1/alldatasources/Identity Verification | Gets all the datasources available, for when a specific country is not provided.
[**getConsents**](ConfigurationApi.md#getConsents) | **GET** /configuration/v1/consents/{configurationName}/{countryCode} | This method retrieves the consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of strings that Verify method&#39;s ConsentForDataSources field expects to perform a verification using those data sources.   A failure to provide an element from the string collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
[**getCountryCodes**](ConfigurationApi.md#getCountryCodes) | **GET** /configuration/v1/countrycodes/{configurationName} | This method retrieves all the countries that are available to perform a verification.
[**getCountrySubdivisions**](ConfigurationApi.md#getCountrySubdivisions) | **GET** /configuration/v1/countrysubdivisions/{countryCode} | Gets the provinces states or other subdivisions for a country, mostly matches ISO 3166-2
[**getDatasources**](ConfigurationApi.md#getDatasources) | **GET** /configuration/v1/datasources/{configurationName}/{countryCode} | Gets datasource groups configured for your product and country.
[**getDetailedConsents**](ConfigurationApi.md#getDetailedConsents) | **GET** /configuration/v1/detailedConsents/{configurationName}/{countryCode} | This method retrieves details about consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of objects.  Each object contains the Name of the data source, Text outlining what the user is consenting to, and optionally a Url where the user can find more information about how their data will be used.    Failure to provide a Name from the object collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
[**getDocumentTypes**](ConfigurationApi.md#getDocumentTypes) | **GET** /configuration/v1/documentTypes/{countryCode} | Gets the document types available for a country.
[**getFields**](ConfigurationApi.md#getFields) | **GET** /configuration/v1/fields/{configurationName}/{countryCode} | Generates json schema for the API, the schema is dynamic based on the country and configuration you are using.  http://json-schema.org/documentation.html
[**getRecommendedFields**](ConfigurationApi.md#getRecommendedFields) | **GET** /configuration/v1/recommendedfields/{configurationName}/{countryCode} | Generates json schema for the API, the schema is dynamic based on the recommendedFields country and account you are using.  http://json-schema.org/documentation.html
[**getTestEntities**](ConfigurationApi.md#getTestEntities) | **GET** /configuration/v1/testentities/{configurationName}/{countryCode} | Gets the test entities configured for your product and country.

<a name="getAllDatasources"></a>
# **getAllDatasources**
> List&lt;NormalizedDatasourceGroupsWithCountry&gt; getAllDatasources()
### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;
ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");
ConfigurationApi apiInstance = new ConfigurationApi();
try {
    List<NormalizedDatasourceGroupsWithCountry> result = apiInstance.getAllDatasources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getAllDatasources");
    e.printStackTrace();
}
```
### Parameters
This endpoint does not need any parameter.
### Return type
[**List&lt;NormalizedDatasourceGroupsWithCountry&gt;**](NormalizedDatasourceGroupsWithCountry.md)
### Authorization
[basic](../README.md#basic)

<a name="getConsents"></a>
# **getConsents**
> List&lt;String&gt; getConsents(countryCode, configurationName)

This method retrieves the consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of strings that Verify method&#39;s ConsentForDataSources field expects to perform a verification using those data sources.   A failure to provide an element from the string collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
String configurationName = "configurationName_example"; // String | Identity Verification
try {
    List<String> result = apiInstance.getConsents(countryCode, configurationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |
 **configurationName** | **String**| Identity Verification |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getCountryCodes"></a>
# **getCountryCodes**
> List&lt;String&gt; getCountryCodes(configurationName)

This method retrieves all the countries that are available to perform a verification.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String configurationName = "configurationName_example"; // String | Identity Verification
try {
    List<String> result = apiInstance.getCountryCodes(configurationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getCountryCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationName** | **String**| Identity Verification |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getCountrySubdivisions"></a>
# **getCountrySubdivisions**
> List&lt;CountrySubdivision&gt; getCountrySubdivisions(countryCode)

Gets the provinces states or other subdivisions for a country, mostly matches ISO 3166-2

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String countryCode = "countryCode_example"; // String | Country alpha2 code, get the the call to countrycodes
try {
    List<CountrySubdivision> result = apiInstance.getCountrySubdivisions(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getCountrySubdivisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Country alpha2 code, get the the call to countrycodes |

### Return type

[**List&lt;CountrySubdivision&gt;**](CountrySubdivision.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getDatasources"></a>
# **getDatasources**
> List&lt;NormalizedDatasourceGroupCountry&gt; getDatasources(configurationName, countryCode)

Gets datasource groups configured for your product and country.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String configurationName = "configurationName_example"; // String | Identity Verification
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
try {
    List<NormalizedDatasourceGroupCountry> result = apiInstance.getDatasources(configurationName, countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getDatasources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationName** | **String**| Identity Verification |
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |

### Return type

[**List&lt;NormalizedDatasourceGroupCountry&gt;**](NormalizedDatasourceGroupCountry.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getDetailedConsents"></a>
# **getDetailedConsents**
> List&lt;Consent&gt; getDetailedConsents(countryCode, configurationName)

This method retrieves details about consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of objects.  Each object contains the Name of the data source, Text outlining what the user is consenting to, and optionally a Url where the user can find more information about how their data will be used.    Failure to provide a Name from the object collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
String configurationName = "configurationName_example"; // String | Identity Verification
try {
    List<Consent> result = apiInstance.getDetailedConsents(countryCode, configurationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getDetailedConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |
 **configurationName** | **String**| Identity Verification |

### Return type

[**List&lt;Consent&gt;**](Consent.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getDocumentTypes"></a>
# **getDocumentTypes**
> Map&lt;String, List&lt;String&gt;&gt; getDocumentTypes(countryCode)

Gets the document types available for a country.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
try {
    Map<String, List<String>> result = apiInstance.getDocumentTypes(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getDocumentTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |

### Return type

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getFields"></a>
# **getFields**
> Object getFields(countryCode, configurationName)

Generates json schema for the API, the schema is dynamic based on the country and configuration you are using.  http://json-schema.org/documentation.html

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
String configurationName = "configurationName_example"; // String | Identity Verification
try {
    Object result = apiInstance.getFields(countryCode, configurationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |
 **configurationName** | **String**| Identity Verification |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getRecommendedFields"></a>
# **getRecommendedFields**
> Object getRecommendedFields(countryCode, configurationName)

Generates json schema for the API, the schema is dynamic based on the recommendedFields country and account you are using.  http://json-schema.org/documentation.html

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
String configurationName = "configurationName_example"; // String | Identity Verification
try {
    Object result = apiInstance.getRecommendedFields(countryCode, configurationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getRecommendedFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |
 **configurationName** | **String**| Identity Verification |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="getTestEntities"></a>
# **getTestEntities**
> List&lt;DataFields&gt; getTestEntities(configurationName, countryCode)

Gets the test entities configured for your product and country.

### Example
```java
// Import classes:
//import com.trulioo.normalizedapi.ApiClient;
//import com.trulioo.normalizedapi.ApiException;
//import com.trulioo.normalizedapi.Configuration;
//import com.trulioo.normalizedapi.auth.*;
//import com.trulioo.normalizedapi.api.ConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ConfigurationApi apiInstance = new ConfigurationApi();
String configurationName = "configurationName_example"; // String | Identity Verification
String countryCode = "countryCode_example"; // String | Call CountryCodes to get the countries available to you.
try {
    List<DataFields> result = apiInstance.getTestEntities(configurationName, countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getTestEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationName** | **String**| Identity Verification |
 **countryCode** | **String**| Call CountryCodes to get the countries available to you. |

### Return type

[**List&lt;DataFields&gt;**](DataFields.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

