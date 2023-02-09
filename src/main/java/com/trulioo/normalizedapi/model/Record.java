package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Record {
  @SerializedName("TransactionRecordID")
  private String transactionRecordID = null;

  @SerializedName("RecordStatus")
  private String recordStatus = null;
  
  @SerializedName("SecondaryRecordStatus")
  private String secondaryRecordStatus = null;

  @SerializedName("DatasourceResults")
  private List<DatasourceResult> datasourceResults = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  @SerializedName("Rule")
  private RecordRule rule = null;

  public Record transactionRecordID(String transactionRecordID) {
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

  public Record recordStatus(String recordStatus) {
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
  
  public Record secondaryRecordStatus(String secondaryRecordStatus) {
	  this.secondaryRecordStatus = secondaryRecordStatus;
	  return this;
  }
  
  public String getSecondaryRecordStatus() {
	  return secondaryRecordStatus;
  }
  
  public void setSecondaryRecordStatus(String secondaryRecordStatus) {
	  this.secondaryRecordStatus = secondaryRecordStatus;
  }

  public Record datasourceResults(List<DatasourceResult> datasourceResults) {
    this.datasourceResults = datasourceResults;
    return this;
  }

  public Record addDatasourceResultsItem(DatasourceResult datasourceResultsItem) {
    if (this.datasourceResults == null) {
      this.datasourceResults = new ArrayList<DatasourceResult>();
    }
    this.datasourceResults.add(datasourceResultsItem);
    return this;
  }

   /**
   * Results for each datasource that was queried
   * @return datasourceResults
  **/
  public List<DatasourceResult> getDatasourceResults() {
    return datasourceResults;
  }

  public void setDatasourceResults(List<DatasourceResult> datasourceResults) {
    this.datasourceResults = datasourceResults;
  }

  public Record errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public Record addErrorsItem(ServiceError errorsItem) {
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

  public Record rule(RecordRule rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Rule used for record
   * @return rule
  **/
  public RecordRule getRule() {
    return rule;
  }

  public void setRule(RecordRule rule) {
    this.rule = rule;
  }

}

