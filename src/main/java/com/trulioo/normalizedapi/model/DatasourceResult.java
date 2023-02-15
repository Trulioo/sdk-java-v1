package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * A result from a particular datasource
 */
public class DatasourceResult {
  @SerializedName("DatasourceStatus")
  private String datasourceStatus = null;

  @SerializedName("DatasourceName")
  private String datasourceName = null;

  @SerializedName("DatasourceFields")
  private List<DatasourceField> datasourceFields = null;

  @SerializedName("AppendedFields")
  private List<AppendedField> appendedFields = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  @SerializedName("FieldGroups")
  private List<String> fieldGroups = null;

  public DatasourceResult datasourceStatus(String datasourceStatus) {
    this.datasourceStatus = datasourceStatus;
    return this;
  }

   /**
   * 
   * @return datasourceStatus
  **/
  public String getDatasourceStatus() {
    return datasourceStatus;
  }

  public void setDatasourceStatus(String datasourceStatus) {
    this.datasourceStatus = datasourceStatus;
  }

  public DatasourceResult datasourceName(String datasourceName) {
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

  public DatasourceResult datasourceFields(List<DatasourceField> datasourceFields) {
    this.datasourceFields = datasourceFields;
    return this;
  }

  public DatasourceResult addDatasourceFieldsItem(DatasourceField datasourceFieldsItem) {
    if (this.datasourceFields == null) {
      this.datasourceFields = new ArrayList<DatasourceField>();
    }
    this.datasourceFields.add(datasourceFieldsItem);
    return this;
  }

   /**
   * 
   * @return datasourceFields
  **/
  public List<DatasourceField> getDatasourceFields() {
    return datasourceFields;
  }

  public void setDatasourceFields(List<DatasourceField> datasourceFields) {
    this.datasourceFields = datasourceFields;
  }

  public DatasourceResult appendedFields(List<AppendedField> appendedFields) {
    this.appendedFields = appendedFields;
    return this;
  }

  public DatasourceResult addAppendedFieldsItem(AppendedField appendedFieldsItem) {
    if (this.appendedFields == null) {
      this.appendedFields = new ArrayList<AppendedField>();
    }
    this.appendedFields.add(appendedFieldsItem);
    return this;
  }

   /**
   * 
   * @return appendedFields
  **/
  public List<AppendedField> getAppendedFields() {
    return appendedFields;
  }

  public void setAppendedFields(List<AppendedField> appendedFields) {
    this.appendedFields = appendedFields;
  }

  public DatasourceResult errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public DatasourceResult addErrorsItem(ServiceError errorsItem) {
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

  public DatasourceResult fieldGroups(List<String> fieldGroups) {
    this.fieldGroups = fieldGroups;
    return this;
  }

  public DatasourceResult addFieldGroupsItem(String fieldGroupsItem) {
    if (this.fieldGroups == null) {
      this.fieldGroups = new ArrayList<String>();
    }
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

   /**
   * 
   * @return fieldGroups
  **/
  public List<String> getFieldGroups() {
    return fieldGroups;
  }

  public void setFieldGroups(List<String> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }

}

