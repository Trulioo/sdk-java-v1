# Trulioo SDK for Java Changelog

## Version 1.0.9
Added RecordRule SecondaryRuleName and SecondaryRuleNote properties

## Version 1.0.8
Added method from Napi (GetAllDatasources) to get all datasources through one call for all countries.

## Version 1.0.7

Updated methods from Napi (GetCountryJOI, GetBusinessRegistrationNumbersAsync) to get configurations for all countries through one call.
Updated CountrySubdivision model to include CountryCode field.

## Version 1.0.6

Removed Swagger Generated Code
Added following methods which are currently supported by Trulioo's Normalized API:
	- GetBusinessRegistrationNumbers
	- GetCountryJOI
	- GetTransactionRecordDocument
	- GetPartialResults
	
Updated/Added the following Models for Trulioo's Normalized API:
	- Address
	- Business
	- BusinessRegistrationNumber
	- BusinessRegistrationNumberMask
	- BusinessSearchRequestBusinessSearchModel
	- BusinessSearchResponseIndustryCode
	- DataFields
	- PersonOfSignificantControl
	- Record
	- Result
	- RiskMonitorSettings
	- TestEntityDataFields
	- TransactionRecordResult
	- VerifyRequest
	- VerifyResult
	- VerifyResultPartial

## Version 1.0.5

Added support for EnhancedProfile for KYB Verification Requests.

## Version 1.0.4

Support application/pdf in documentDownload

## Version 1.0.3

Changed type of Model/AppendedField's Data from string to Object in order to allow WatchListDetails, returned as Map, parsable.

## Version 1.0.2.0

Updated writeTimeOut to 60 seconds based on PR#5
Added following methods which are currently supported by Trulioo's Normalized API:
    -GetDatasources
    -GetTransactionStatus
    -BusinessSearch
    -BusinessSearchResult
Updated Json serializer to properly encode image in byte[] to String(base64)

## Version 1.0.0.1

Upgraded okhttp to 3.9.1

## Version 1.0.0.0

## In Private 

Initial Trulioo SDK for Java in private testing.
