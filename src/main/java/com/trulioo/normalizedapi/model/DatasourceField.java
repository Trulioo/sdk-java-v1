package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class DatasourceField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("FieldGroup")
  private String fieldGroup = null;

  public DatasourceField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 
   * @return fieldName
  **/
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DatasourceField status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DatasourceField fieldGroup(String fieldGroup) {
    this.fieldGroup = fieldGroup;
    return this;
  }

   /**
   * 
   * @return fieldGroup
  **/
  public String getFieldGroup() {
    return fieldGroup;
  }

  public void setFieldGroup(String fieldGroup) {
    this.fieldGroup = fieldGroup;
  }

}

