package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;

/**
 * Transaction Status
 */
public class TransactionStatus {
  @SerializedName("TransactionId")
  private String transactionId = null;

  @SerializedName("TransactionRecordId")
  private String transactionRecordId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UploadedDt")
  private DateTime uploadedDt = null;

  @SerializedName("IsTimedOut")
  private Boolean isTimedOut = null;

  public TransactionStatus transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction ID of the transaction
   * @return transactionId
  **/
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TransactionStatus transactionRecordId(String transactionRecordId) {
    this.transactionRecordId = transactionRecordId;
    return this;
  }

   /**
   * Transaction Record ID of the transaction available once the transaction has finished processing
   * @return transactionRecordId
  **/
  public String getTransactionRecordId() {
    return transactionRecordId;
  }

  public void setTransactionRecordId(String transactionRecordId) {
    this.transactionRecordId = transactionRecordId;
  }

  public TransactionStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the transaction. Possible Values: Uploading, Processing, Completed, InProgress, Failed, WaitAsync, ToBeResumed, Canceled, TimeoutCanceled. Call GetTransactionRecord when status changes to Completed, Failed, Canceled or TimeoutCanceled to get the verification results.
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransactionStatus uploadedDt(DateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
    return this;
  }

   /**
   * Uploaded date for transaction
   * @return uploadedDt
  **/
  public DateTime getUploadedDt() {
    return uploadedDt;
  }

  public void setUploadedDt(DateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
  }

  public TransactionStatus isTimedOut(Boolean isTimedOut) {
    this.isTimedOut = isTimedOut;
    return this;
  }

   /**
   * Set to true when transaction has timed out
   * @return isTimedOut
  **/
  public Boolean getIsTimedOut() {
    return isTimedOut;
  }

  public void setIsTimedOut(Boolean isTimedOut) {
    this.isTimedOut = isTimedOut;
  }

}

