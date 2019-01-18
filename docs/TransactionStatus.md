
# TransactionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Transaction ID of the transaction |  [optional]
**transactionRecordId** | **String** | Transaction Record ID of the transaction available once the transaction has finished processing |  [optional]
**status** | **String** | Status of the transaction. Possible Values: Uploading, Processing, Completed, InProgress, Failed, WaitAsync, ToBeResumed, Canceled, TimeoutCanceled. Call GetTransactionRecord when status changes to Completed, Failed, Canceled or TimeoutCanceled to get the verification results. |  [optional]
**uploadedDt** | [**DateTime**](DateTime.md) | Uploaded date for transaction |  [optional]
**isTimedOut** | **Boolean** | Set to true when transaction has timed out |  [optional]



