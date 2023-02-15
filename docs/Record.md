
# Record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionRecordID** | **String** | The TransactionRecordID, this is the ID you will use to fetch the transaction again. |  [optional]
**recordStatus** | **String** | &#39;match&#39; or &#39;nomatch&#39; if the verification passed the rules configured on your account this will be &#39;match&#39;. |  [optional]
**secondaryRecordStatus** | **String** | &#39;match&#39; or &#39;nomatch&#39; if the secondary verification was run and passed the rules configured on your account this will be &#39;match&#39;. |  [optional]
**datasourceResults** | [**List&lt;DatasourceResult&gt;**](DatasourceResult.md) | Results for each datasource that was queried |  [optional]
**errors** | [**List&lt;ServiceError&gt;**](ServiceError.md) |  |  [optional]
**rule** | [**RecordRule**](RecordRule.md) | Rule used for record |  [optional]
