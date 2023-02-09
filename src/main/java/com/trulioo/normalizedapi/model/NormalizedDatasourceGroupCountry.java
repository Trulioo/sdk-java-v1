package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Datasource group config for country
 */
public class NormalizedDatasourceGroupCountry {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("RequiredFields")
  private List<NormalizedDatasourceField> requiredFields = null;

  @SerializedName("OptionalFields")
  private List<NormalizedDatasourceField> optionalFields = null;

  @SerializedName("AppendedFields")
  private List<NormalizedDatasourceField> appendedFields = null;

  @SerializedName("OutputFields")
  private List<NormalizedDatasourceField> outputFields = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("UpdateFrequency")
  private String updateFrequency = null;

  @SerializedName("Coverage")
  private String coverage = null;

  public NormalizedDatasourceGroupCountry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NormalizedDatasourceGroupCountry description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NormalizedDatasourceGroupCountry requiredFields(List<NormalizedDatasourceField> requiredFields) {
    this.requiredFields = requiredFields;
    return this;
  }

  public NormalizedDatasourceGroupCountry addRequiredFieldsItem(NormalizedDatasourceField requiredFieldsItem) {
    if (this.requiredFields == null) {
      this.requiredFields = new ArrayList<NormalizedDatasourceField>();
    }
    this.requiredFields.add(requiredFieldsItem);
    return this;
  }

   /**
   * Required Fields
   * @return requiredFields
  **/
  public List<NormalizedDatasourceField> getRequiredFields() {
    return requiredFields;
  }

  public void setRequiredFields(List<NormalizedDatasourceField> requiredFields) {
    this.requiredFields = requiredFields;
  }

  public NormalizedDatasourceGroupCountry optionalFields(List<NormalizedDatasourceField> optionalFields) {
    this.optionalFields = optionalFields;
    return this;
  }

  public NormalizedDatasourceGroupCountry addOptionalFieldsItem(NormalizedDatasourceField optionalFieldsItem) {
    if (this.optionalFields == null) {
      this.optionalFields = new ArrayList<NormalizedDatasourceField>();
    }
    this.optionalFields.add(optionalFieldsItem);
    return this;
  }

   /**
   * Optional Fields
   * @return optionalFields
  **/
  public List<NormalizedDatasourceField> getOptionalFields() {
    return optionalFields;
  }

  public void setOptionalFields(List<NormalizedDatasourceField> optionalFields) {
    this.optionalFields = optionalFields;
  }

  public NormalizedDatasourceGroupCountry appendedFields(List<NormalizedDatasourceField> appendedFields) {
    this.appendedFields = appendedFields;
    return this;
  }

  public NormalizedDatasourceGroupCountry addAppendedFieldsItem(NormalizedDatasourceField appendedFieldsItem) {
    if (this.appendedFields == null) {
      this.appendedFields = new ArrayList<NormalizedDatasourceField>();
    }
    this.appendedFields.add(appendedFieldsItem);
    return this;
  }

   /**
   * Appended Fields
   * @return appendedFields
  **/
  public List<NormalizedDatasourceField> getAppendedFields() {
    return appendedFields;
  }

  public void setAppendedFields(List<NormalizedDatasourceField> appendedFields) {
    this.appendedFields = appendedFields;
  }

  public NormalizedDatasourceGroupCountry outputFields(List<NormalizedDatasourceField> outputFields) {
    this.outputFields = outputFields;
    return this;
  }

  public NormalizedDatasourceGroupCountry addOutputFieldsItem(NormalizedDatasourceField outputFieldsItem) {
    if (this.outputFields == null) {
      this.outputFields = new ArrayList<NormalizedDatasourceField>();
    }
    this.outputFields.add(outputFieldsItem);
    return this;
  }

   /**
   * Output Fields
   * @return outputFields
  **/
  public List<NormalizedDatasourceField> getOutputFields() {
    return outputFields;
  }

  public void setOutputFields(List<NormalizedDatasourceField> outputFields) {
    this.outputFields = outputFields;
  }

  public NormalizedDatasourceGroupCountry sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Source Type
   * @return sourceType
  **/
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public NormalizedDatasourceGroupCountry updateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
    return this;
  }

   /**
   * Update Frequency
   * @return updateFrequency
  **/
  public String getUpdateFrequency() {
    return updateFrequency;
  }

  public void setUpdateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
  }

  public NormalizedDatasourceGroupCountry coverage(String coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * Coverage
   * @return coverage
  **/
  public String getCoverage() {
    return coverage;
  }

  public void setCoverage(String coverage) {
    this.coverage = coverage;
  }

}

