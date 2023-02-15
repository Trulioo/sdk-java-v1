package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class NormalizedDatasourceField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("Type")
  private String type = null;

  public NormalizedDatasourceField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Field Name
   * @return fieldName
  **/
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public NormalizedDatasourceField type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}

