# Trulioo SDK for Java #

## Version 1.0.8

### Introduction

Trulioo provides a collection of API methods to help you build business processes powered by the GlobalGateway Normalized API. The Normalized API is a loosely coupled API; fields may be added to our services and responses as the API evolves, and a client must be able to safely ignore fields and data that are not expected. The GlobalGateway Normalized API can help automate your business processes by performing the following tasks:

#### Identity Verification

Electronic identity verification (eIDV) was created specifically to help your business comply with Anti-Money Laundering (AML) and Know Your Customer (KYC) rules and has since evolved to support a diverse range of international electronic identity verification requirements.

#### Document Verification

ID Document Verification analyzes, verifies, and authenticates 3,500 different types of identity documents from nearly every country in the world. The combination of eIDV and ID Document Verification during the Customer Due Diligence check can assist your business in meeting your AML, KYC and Counter Terrorist Financing (CTF) compliance requirements.

#### Business Verification

Business Verification analyzes, verifies and provides data intelligence for business entities in 83 countries. During Customer Due Diligence, Business Verification assists clients to automate compliance workflows, reduce manual front-to- back office operations, take advantage of digital processes, decrease the risk of fraud, and allow staff to focus on key compliance considerations.

#### AML Watchlist

Global AML Watchlist helps your business comply with domestic and international AML, CTF and sanctions enforcement regulations. The watchlist covers sanction lists, law enforcements lists and governing regulatory bodies from around the world.
## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.trulioo</groupId>
  <artifactId>normalizedapi</artifactId>
  <version>1.0.8</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.trulioo:normalizedapi:1.0.8"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/normalizedapi-1.0.8.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.trulioo.normalizedapi.*;
import com.trulioo.normalizedapi.api.*;
import com.trulioo.normalizedapi.model.*;

//Set client here
ApiClient apiClient = new ApiClient();
apiClient.setUsername("-- USER NAME --");
apiClient.setPassword("-- PASSWORD --");

//ConnectionApi
ConnectionApi connectionClient = new ConnectionApi(apiClient);

//testAuthentication
String testResult = connectionClient.testAuthentication();
System.out.println(testResult);

//testAuthenticationAsync
connectionClient.testAuthenticationAsync(new ApiCallback<String>() {
	@Override
	public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
		Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
	}

	@Override
	public void onSuccess(String t, int i, Map<String, List<String>> map) {
		System.out.println(t);
	}

	@Override
	public void onUploadProgress(long l, long l1, boolean bln) {
		//To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void onDownloadProgress(long l, long l1, boolean bln) {
		//To change body of generated methods, choose Tools | Templates.
	}
});

```

## Documentation for API Endpoints

All URIs are relative to *https://api.trulioo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BusinessApi* | [**getBusinessSearchResult**](docs/BusinessApi.md#getBusinessSearchResult) | **GET** /business/v1/search/transactionrecord/{id} | returns the a business search result.
*BusinessApi* | [**search**](docs/BusinessApi.md#search) | **POST** /business/v1/search | Calling this method will perform a business search.
*ConfigurationApi* | [**getAllDatasources**](docs/ConfigurationApi.md#getAllDatasources) | **GET** /configuration/v1/alldatasources/Identity Verification | 
*ConfigurationApi* | [**getConsents**](docs/ConfigurationApi.md#getConsents) | **GET** /configuration/v1/consents/{configurationName}/{countryCode} | This method retrieves the consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of strings that Verify method&#39;s ConsentForDataSources field expects to perform a verification using those data sources.   A failure to provide an element from the string collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
*ConfigurationApi* | [**getCountryCodes**](docs/ConfigurationApi.md#getCountryCodes) | **GET** /configuration/v1/countrycodes/{configurationName} | This method retrieves all the countries that are available to perform a verification.
*ConfigurationApi* | [**getCountrySubdivisions**](docs/ConfigurationApi.md#getCountrySubdivisions) | **GET** /configuration/v1/countrysubdivisions/{countryCode} | Gets the provinces states or other subdivisions for a country, mostly matches ISO 3166-2
*ConfigurationApi* | [**getDatasources**](docs/ConfigurationApi.md#getDatasources) | **GET** /configuration/v1/datasources/{configurationName}/{countryCode} | Gets datasource groups configured for your product and country.
*ConfigurationApi* | [**getDetailedConsents**](docs/ConfigurationApi.md#getDetailedConsents) | **GET** /configuration/v1/detailedConsents/{configurationName}/{countryCode} | This method retrieves details about consents required for data sources currently configured in your account configuration.   The response for this method contains a collection of objects.  Each object contains the Name of the data source, Text outlining what the user is consenting to, and optionally a Url where the user can find more information about how their data will be used.    Failure to provide a Name from the object collection will lead to a &lt;a class&#x3D;\&quot;link-to-api\&quot; href&#x3D;\&quot;#errors\&quot;&gt;1005&lt;/a&gt; service error.
*ConfigurationApi* | [**getDocumentTypes**](docs/ConfigurationApi.md#getDocumentTypes) | **GET** /configuration/v1/documentTypes/{countryCode} | Gets the document types available for a country.
*ConfigurationApi* | [**getFields**](docs/ConfigurationApi.md#getFields) | **GET** /configuration/v1/fields/{configurationName}/{countryCode} | Generates json schema for the API, the schema is dynamic based on the country and configuration you are using.  http://json-schema.org/documentation.html
*ConfigurationApi* | [**getRecommendedFields**](docs/ConfigurationApi.md#getRecommendedFields) | **GET** /configuration/v1/recommendedfields/{configurationName}/{countryCode} | Generates json schema for the API, the schema is dynamic based on the recommendedFields country and account you are using.  http://json-schema.org/documentation.html
*ConfigurationApi* | [**getTestEntities**](docs/ConfigurationApi.md#getTestEntities) | **GET** /configuration/v1/testentities/{configurationName}/{countryCode} | Gets the test entities configured for your product and country.
*ConnectionApi* | [**connectionAsyncCallbackUrl**](docs/ConnectionApi.md#connectionAsyncCallbackUrl) | **POST** /connection/v1/async-callback | If set, the transaction will run asynchronously and Trulioo will try to update the client with transaction state updates until completed. If callback is not desired but the client wants to initiate an asynchronous transaction, provide https://api.trulioo.com/connection/v1/async-callback as the Callback URL.
*ConnectionApi* | [**sayHello**](docs/ConnectionApi.md#sayHello) | **GET** /connection/v1/sayhello/{name} | This method enables you to check if your system can connect to our system. You can even use a web browser to verify a connection to our system.
*ConnectionApi* | [**testAuthentication**](docs/ConnectionApi.md#testAuthentication) | **GET** /connection/v1/testauthentication | This method enables you to check if your credentials are valid. You will need to use basic authentication to ensure a successful response.
*VerificationsApi* | [**documentDownload**](docs/VerificationsApi.md#documentDownload) | **GET** /verifications/v1/documentdownload/{transactionRecordId}/{fieldName} | Download Document
*VerificationsApi* | [**getTransactionRecord**](docs/VerificationsApi.md#getTransactionRecord) | **GET** /verifications/v1/transactionrecord/{id} | This method is used to retrieve the request and results of a verification performed using the verify method.  The response for this method includes the same information as verify method&#39;s response, along with data present in the input fields of the verify request.
*VerificationsApi* | [**getTransactionRecordAddress**](docs/VerificationsApi.md#getTransactionRecordAddress) | **GET** /verifications/v1/transactionrecord/{id}/withaddress | Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing.
*VerificationsApi* | [**getTransactionRecordVerbose**](docs/VerificationsApi.md#getTransactionRecordVerbose) | **GET** /verifications/v1/transactionrecord/{id}/verbose | Fetch the results of a verification with the TransactionRecordId for the transaction this will include additional information if your account  includes address cleansing and watchlist details.
*VerificationsApi* | [**getTransactionStatus**](docs/VerificationsApi.md#getTransactionStatus) | **GET** /verifications/v1/transaction/{id}/status | This method is used to retrieve the processing status of an asynchronous transaction. The response for this method includes the processing status of the verification, the TransactionID, the TransactionRecordID as well as whether the verification request has timed out.
*VerificationsApi* | [**verify**](docs/VerificationsApi.md#verify) | **POST** /verifications/v1/verify | Calling this method will perform a verification. If your account includes address cleansing set the CleansedAddress flag to get  additional address information in the result.  You can query configuration to get what fields are available to you in each each country.  It is also possible to get sample requests from the customer portal.


## Documentation for Models

 - [Address](docs/Address.md)
 - [AppendedField](docs/AppendedField.md)
 - [Business](docs/Business.md)
 - [BusinessRecord](docs/BusinessRecord.md)
 - [BusinessResult](docs/BusinessResult.md)
 - [BusinessSearchRequest](docs/BusinessSearchRequest.md)
 - [BusinessSearchRequestBusinessSearchModel](docs/BusinessSearchRequestBusinessSearchModel.md)
 - [BusinessSearchResponse](docs/BusinessSearchResponse.md)
 - [Communication](docs/Communication.md)
 - [Consent](docs/Consent.md)
 - [CountrySubdivision](docs/CountrySubdivision.md)
 - [DataField](docs/DataField.md)
 - [DataFields](docs/DataFields.md)
 - [DatasourceField](docs/DatasourceField.md)
 - [DatasourceResult](docs/DatasourceResult.md)
 - [Document](docs/Document.md)
 - [DriverLicence](docs/DriverLicence.md)
 - [Location](docs/Location.md)
 - [LocationAdditionalFields](docs/LocationAdditionalFields.md)
 - [NationalId](docs/NationalId.md)
 - [NormalizedDatasourceField](docs/NormalizedDatasourceField.md)
 - [NormalizedDatasourceGroupCountry](docs/NormalizedDatasourceGroupCountry.md)
 - [Passport](docs/Passport.md)
 - [PersonInfo](docs/PersonInfo.md)
 - [PersonInfoAdditionalFields](docs/PersonInfoAdditionalFields.md)
 - [Record](docs/Record.md)
 - [RecordRule](docs/RecordRule.md)
 - [Result](docs/Result.md)
 - [ServiceError](docs/ServiceError.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [VerifyRequest](docs/VerifyRequest.md)
 - [VerifyResult](docs/VerifyResult.md)
 - [TransactionRecordResult](docs/TransactionRecordResult.md)
 - [NormalizedDatasourceGroupsWithCountry](docs/NormalizedDatasourceGroupsWithCountry.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

### Changelog

The [CHANGELOG.md](https://github.com/Trulioo/sdk-java-v1/blob/master/CHANGELOG.md) file in the root of the repository contains a description of changes for each version of the SDK.

### Documentation and resources

If you need to know more:

* For more about the Trulioo REST API V1, see the [REST API Reference](https://developer.trulioo.com/v1.0/reference).

* For starter guides, product information and best practices see the [Documentation](https://developer.trulioo.com/docs).

* For more about Trulioo in general, see [Trulioo Website](https://www.trulioo.com/).

### Support


1. You will be granted support if you or your company are already covered under an existing maintenance/support agreement. Send an email to _support@trulioo.com_ and include "Trulioo SDK for Java V1" in the subject line.

2. Trulioo will NOT provide support for the extension if the core library has been modified. We would also like to know why you modified the code please send feedback to _support@trulioo.com_

### Contact Us

You can reach via channels listed on [Trulioo website](https://www.trulioo.com/company/contact-us/)

## License

The Trulioo SDK for Java is licensed under the Apache License 2.0. Details about the license can be found in the LICENSE file. Copyright 2017 Trulioo Information Services Inc. Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.



