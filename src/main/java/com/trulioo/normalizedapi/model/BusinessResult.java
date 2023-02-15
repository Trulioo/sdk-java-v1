package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class BusinessResult {
  @SerializedName("Results")
  private List<Result> results = null;

  @SerializedName("DatasourceName")
  private String datasourceName = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  public BusinessResult results(List<Result> results) {
    this.results = results;
    return this;
  }

  public BusinessResult addResultsItem(Result resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Result>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * 
   * @return results
  **/
  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }

  public BusinessResult datasourceName(String datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

   /**
   * 
   * @return datasourceName
  **/
  public String getDatasourceName() {
    return datasourceName;
  }

  public void setDatasourceName(String datasourceName) {
    this.datasourceName = datasourceName;
  }

  public BusinessResult errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public BusinessResult addErrorsItem(ServiceError errorsItem) {
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

