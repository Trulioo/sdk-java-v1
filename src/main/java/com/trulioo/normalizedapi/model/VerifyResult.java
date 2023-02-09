package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
public class VerifyResult {
  @SerializedName("TransactionID")
  private String transactionID = null;

  @SerializedName("UploadedDt")
  private DateTime uploadedDt = null;
  
  @SerializedName("CompletedDt")
  private DateTime completedDt = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("ProductName")
  private String productName = null;

  @SerializedName("Record")
  private Record record = null;

  @SerializedName("CustomerReferenceID")
  private String customerReferenceID = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  public VerifyResult transactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

   /**
   * The id for the transaction it will be a GUID
   * @return transactionID
  **/
  public String getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  public VerifyResult uploadedDt(DateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
    return this;
  }

   /**
   * Time in UTC
   * @return uploadedDt
  **/
  public DateTime getUploadedDt() {
    return uploadedDt;
  }

  public void setUploadedDt(DateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
  }
  
  public VerifyResult completedDt(DateTime completedDt) {
	  this.completedDt = completedDt;
	  return this;
  }
  
  /**
   * Time in UTC
   * @return completedDt
  **/
  public DateTime getCompletedDt(DateTime completedDt) {
    return completedDt;
  }
  
  public void setCompletedDt(DateTime completedDt) {
	  this.completedDt = completedDt;
  }

  public VerifyResult countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public VerifyResult productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Product Name
   * @return productName
  **/
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public VerifyResult record(Record record) {
    this.record = record;
    return this;
  }

   /**
   * 
   * @return record
  **/
  public Record getRecord() {
    return record;
  }

  public void setRecord(Record record) {
    this.record = record;
  }

  public VerifyResult customerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
    return this;
  }

   /**
   * Customer Reference Id
   * @return customerReferenceID
  **/
  public String getCustomerReferenceID() {
    return customerReferenceID;
  }

  public void setCustomerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
  }

  public VerifyResult errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public VerifyResult addErrorsItem(ServiceError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ServiceError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  public List<ServiceError> getErrors() {
    return errors;
  }

  public void setErrors(List<ServiceError> errors) {
    this.errors = errors;
  }

}

