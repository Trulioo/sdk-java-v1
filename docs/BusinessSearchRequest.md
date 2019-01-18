
# BusinessSearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptTruliooTermsAndConditions** | **Boolean** | Indicate that Trulioo terms and conditions are accepted |  [optional]
**callBackUrl** | **String** |  |  [optional]
**timeout** | **Integer** |  |  [optional]
**consentForDataSources** | **List&lt;String&gt;** | Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried. |  [optional]
**business** | [**BusinessSearchRequestBusinessSearchModel**](BusinessSearchRequestBusinessSearchModel.md) |  |  [optional]
**countryCode** | **String** | The country code for which the verification needs to be performed. | 



