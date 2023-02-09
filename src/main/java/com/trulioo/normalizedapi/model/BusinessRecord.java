package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class BusinessRecord {
  @SerializedName("TransactionRecordID")
  private String transactionRecordID = null;

  @SerializedName("RecordStatus")
  private String recordStatus = null;

  @SerializedName("DatasourceResults")
  private List<BusinessResult> datasourceResults = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  public BusinessRecord transactionRecordID(String transactionRecordID) {
    this.transactionRecordID = transactionRecordID;
    return this;
  }

   /**
   * The TransactionRecordID, this is the ID you will use to fetch the transaction again.
   * @return transactionRecordID
  **/
  public String getTransactionRecordID() {
    return transactionRecordID;
  }

  public void setTransactionRecordID(String transactionRecordID) {
    this.transactionRecordID = transactionRecordID;
  }

  public BusinessRecord recordStatus(String recordStatus) {
    this.recordStatus = recordStatus;
    return this;
  }

   /**
   * &#39;match&#39; or &#39;nomatch&#39; if the verification passed the rules configured on your account this will be &#39;match&#39;.
   * @return recordStatus
  **/
  public String getRecordStatus() {
    return recordStatus;
  }

  public void setRecordStatus(String recordStatus) {
    this.recordStatus = recordStatus;
  }

  public BusinessRecord datasourceResults(List<BusinessResult> datasourceResults) {
    this.datasourceResults = datasourceResults;
    return this;
  }

  public BusinessRecord addDatasourceResultsItem(BusinessResult datasourceResultsItem) {
    if (this.datasourceResults == null) {
      this.datasourceResults = new ArrayList<BusinessResult>();
    }
    this.datasourceResults.add(datasourceResultsItem);
    return this;
  }

   /**
   * Results for each datasource that was queried
   * @return datasourceResults
  **/
  public List<BusinessResult> getDatasourceResults() {
    return datasourceResults;
  }

  public void setDatasourceResults(List<BusinessResult> datasourceResults) {
    this.datasourceResults = datasourceResults;
  }

  public BusinessRecord errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public BusinessRecord addErrorsItem(ServiceError errorsItem) {
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

