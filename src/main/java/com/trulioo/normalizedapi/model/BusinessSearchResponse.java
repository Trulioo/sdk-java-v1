/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.BusinessRecord;
import com.trulioo.normalizedapi.model.ServiceError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T15:09:55.671-07:00")
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
  @ApiModelProperty(value = "The id for the transaction it will be a GUID")
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
  @ApiModelProperty(value = "Time in UTC")
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
  @ApiModelProperty(value = "The country code for which the verification was performed.")
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
  @ApiModelProperty(value = "Product Name")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Collection of record errors")
  public List<ServiceError> getErrors() {
    return errors;
  }

  public void setErrors(List<ServiceError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSearchResponse businessSearchResponse = (BusinessSearchResponse) o;
    return Objects.equals(this.transactionID, businessSearchResponse.transactionID) &&
        Objects.equals(this.uploadedDt, businessSearchResponse.uploadedDt) &&
        Objects.equals(this.countryCode, businessSearchResponse.countryCode) &&
        Objects.equals(this.productName, businessSearchResponse.productName) &&
        Objects.equals(this.record, businessSearchResponse.record) &&
        Objects.equals(this.errors, businessSearchResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, uploadedDt, countryCode, productName, record, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSearchResponse {\n");
    
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    uploadedDt: ").append(toIndentedString(uploadedDt)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

