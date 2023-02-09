package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class DataField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("FieldGroup")
  private String fieldGroup = null;

  public DataField fieldName(String fieldName) {
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

  public DataField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DataField fieldGroup(String fieldGroup) {
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

