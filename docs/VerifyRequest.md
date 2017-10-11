
# VerifyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptTruliooTermsAndConditions** | **Boolean** | Indicate that Trulioo terms and conditions are accepted |  [optional]
**demo** | **Boolean** | This field is not used anymore.  If provided it must match the setting on your account or you will get an error. |  [optional]
**callBackUrl** | **String** |  |  [optional]
**timeout** | **Integer** |  |  [optional]
**cleansedAddress** | **Boolean** | Set to true if you want to receive address cleanse information,  This will only change the response if you have address cleansing enabled for the country you are querying for. |  [optional]
**configurationName** | **String** | Indicate the configuration used for the verification. Currently only  &#39;Identity Verification&#39; is supported. |  [optional]
**consentForDataSources** | **List&lt;String&gt;** | Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried. |  [optional]
**countryCode** | **String** | The country code for which the verification needs to be performed. | 
**dataFields** | [**DataFields**](DataFields.md) | The data field name-value pairs for the data elements on which the verification is to be performed | 
**verboseMode** | **Boolean** | Verbose Mode Output Flag. |  [optional]



