package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * &lt;p&gt;Types of fields you will see here include&lt;/p&gt;  &lt;table class&#x3D;\&quot;help-page-table\&quot;&gt;    &lt;thead&gt;      &lt;tr&gt;        &lt;td&gt;          &lt;b&gt;FieldName&lt;/b&gt;        &lt;/td&gt;        &lt;td&gt;          &lt;b&gt;Data&lt;/b&gt;        &lt;/td&gt;        &lt;td&gt;          &lt;b&gt;Comments&lt;/b&gt;        &lt;/td&gt;      &lt;/tr&gt;    &lt;/thead&gt;    &lt;tbody&gt;      &lt;tr&gt;        &lt;td&gt;WatchlistState&lt;/td&gt;        &lt;td&gt;Clear&lt;/td&gt;        &lt;td&gt;If the submitted individual did not match any watchlist checks, the appended field data will appear as clear&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;WatchlistState&lt;/td&gt;        &lt;td&gt;Hit&lt;/td&gt;        &lt;td&gt;If the submitted individual triggered a watchlist hit, the watchlistdata field also be included as below:&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;WatchlistData&lt;/td&gt;        &lt;td&gt;Name|URL\\tName2|URL&lt;/td&gt;        &lt;td&gt; Name of the source a pipe (|) the url of the source each source is separated with a tab (\\t )&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;CanadaSixMonthResidency&lt;/td&gt;        &lt;td&gt;YES&lt;/td&gt;        &lt;td&gt;The Canadian Credit Agency provides a flag to indicate that an individual has been at the specified              residence for at least six months.The canadasixmonthresidency field is returned with a value of either YES or NO.&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;IsDeceased&lt;/td&gt;        &lt;td&gt;False&lt;/td&gt;        &lt;td&gt;The IsDeceased field is returned by various datasources to indicate whether the input information was screened against an available death file.              Check with your Trulioo Technical Account Manager to see which datasources support this option.&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;IsDeceased&lt;/td&gt;        &lt;td&gt;True&lt;/td&gt;        &lt;td&gt;&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;FraudFlag&lt;/td&gt;        &lt;td&gt;True&lt;/td&gt;        &lt;td&gt;&lt;/td&gt;      &lt;/tr&gt;      &lt;tr&gt;        &lt;td&gt;FraudFlag&lt;/td&gt;        &lt;td&gt;False&lt;/td&gt;        &lt;td&gt;&lt;/td&gt;      &lt;/tr&gt;    &lt;/tbody&gt;  &lt;/table&gt;  &lt;p&gt;If you are retrieving transaction with address corrected values you will also see address fields in appended data&lt;/p&gt;
 */
public class AppendedField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("Data")
  private Object data = null;

  public AppendedField fieldName(String fieldName) {
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

  public AppendedField data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * 
   * @return data
  **/
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

}

