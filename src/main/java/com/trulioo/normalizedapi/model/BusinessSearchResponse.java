package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
public class BusinessSearchResponse {
  @SerializedName("TransactionID")
  private String transactionID = null;

  @SerializedName("UploadedDt")
  private DateTime uploadedDt = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("ProductName")
  private String productName = null;

  @SerializedName("Record")
  private BusinessRecord record = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  public BusinessSearchResponse transactionID(String transactionID) {
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

  public BusinessSearchResponse uploadedDt(DateTime uploadedDt) {
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

  public BusinessSearchResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for which the verification was performed.
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public BusinessSearchResponse productName(String productName) {
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

  public BusinessSearchResponse record(BusinessRecord record) {
    this.record = record;
    return this;
  }

   /**
   * 
   * @return record
  **/
  public BusinessRecord getRecord() {
    return record;
  }

  public void setRecord(BusinessRecord record) {
    this.record = record;
  }

  public BusinessSearchResponse errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public BusinessSearchResponse addErrorsItem(ServiceError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ServiceError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Collection of record errors
   * @return errors
  **/
  public List<ServiceError> getErrors() {
    return errors;
  }

  public void setErrors(List<ServiceError> errors) {
    this.errors = errors;
  }

}

