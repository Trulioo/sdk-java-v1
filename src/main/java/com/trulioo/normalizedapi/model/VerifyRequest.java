package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * The verification call for the Normalized API is a POST method call
 */
public class VerifyRequest {
  @SerializedName("AcceptTruliooTermsAndConditions")
  private Boolean acceptTruliooTermsAndConditions = null;

  @SerializedName("Demo")
  private Boolean demo = null;

  @SerializedName("CallBackUrl")
  private String callBackUrl = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("CleansedAddress")
  private Boolean cleansedAddress = null;

  @SerializedName("ConfigurationName")
  private String configurationName = null;

  @SerializedName("ConsentForDataSources")
  private List<String> consentForDataSources = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CustomerReferenceID")
  private String customerReferenceID = null;

  @SerializedName("DataFields")
  private DataFields dataFields = null;

  @SerializedName("VerboseMode")
  private Boolean verboseMode = null;
  
  @SerializedName("BatchRecordID")
  private String batchRecordID = null;

  public VerifyRequest acceptTruliooTermsAndConditions(Boolean acceptTruliooTermsAndConditions) {
    this.acceptTruliooTermsAndConditions = acceptTruliooTermsAndConditions;
    return this;
  }

   /**
   * Indicate that Trulioo terms and conditions are accepted
   * @return acceptTruliooTermsAndConditions
  **/
  public Boolean getAcceptTruliooTermsAndConditions() {
    return acceptTruliooTermsAndConditions;
  }

  public void setAcceptTruliooTermsAndConditions(Boolean acceptTruliooTermsAndConditions) {
    this.acceptTruliooTermsAndConditions = acceptTruliooTermsAndConditions;
  }

  public VerifyRequest demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * This field is not used anymore.  If provided it must match the setting on your account or you will get an error.
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public VerifyRequest callBackUrl(String callBackUrl) {
    this.callBackUrl = callBackUrl;
    return this;
  }

   /**
   * Get callBackUrl
   * @return callBackUrl
  **/
  public String getCallBackUrl() {
    return callBackUrl;
  }

  public void setCallBackUrl(String callBackUrl) {
    this.callBackUrl = callBackUrl;
  }

  public VerifyRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public VerifyRequest cleansedAddress(Boolean cleansedAddress) {
    this.cleansedAddress = cleansedAddress;
    return this;
  }

   /**
   * Set to true if you want to receive address cleanse information,  This will only change the response if you have address cleansing enabled for the country you are querying for.
   * @return cleansedAddress
  **/
  public Boolean getCleansedAddress() {
    return cleansedAddress;
  }

  public void setCleansedAddress(Boolean cleansedAddress) {
    this.cleansedAddress = cleansedAddress;
  }

  public VerifyRequest configurationName(String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

   /**
   * Indicate the configuration used for the verification. Currently only  &#39;Identity Verification&#39; is supported.
   * @return configurationName
  **/
  public String getConfigurationName() {
    return configurationName;
  }

  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }

  public VerifyRequest consentForDataSources(List<String> consentForDataSources) {
    this.consentForDataSources = consentForDataSources;
    return this;
  }

  public VerifyRequest addConsentForDataSourcesItem(String consentForDataSourcesItem) {
    if (this.consentForDataSources == null) {
      this.consentForDataSources = new ArrayList<String>();
    }
    this.consentForDataSources.add(consentForDataSourcesItem);
    return this;
  }

   /**
   * Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried.
   * @return consentForDataSources
  **/
  public List<String> getConsentForDataSources() {
    return consentForDataSources;
  }

  public void setConsentForDataSources(List<String> consentForDataSources) {
    this.consentForDataSources = consentForDataSources;
  }

  public VerifyRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for which the verification needs to be performed.
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public VerifyRequest customerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
    return this;
  }

   /**
   * Customer Reference Id
   * @return customerReferenceID
  **/
  public String getCustomerReferenceID() {
    return customerReferenceID;
  }

  public void setCustomerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
  }

  public VerifyRequest dataFields(DataFields dataFields) {
    this.dataFields = dataFields;
    return this;
  }

   /**
   * The data field name-value pairs for the data elements on which the verification is to be performed
   * @return dataFields
  **/
  public DataFields getDataFields() {
    return dataFields;
  }

  public void setDataFields(DataFields dataFields) {
    this.dataFields = dataFields;
  }

  public VerifyRequest verboseMode(Boolean verboseMode) {
    this.verboseMode = verboseMode;
    return this;
  }

   /**
   * Verbose Mode Output Flag.
   * @return verboseMode
  **/
  public Boolean getVerboseMode() {
    return verboseMode;
  }

  public void setVerboseMode(Boolean verboseMode) {
    this.verboseMode = verboseMode;
  }
  
  public VerifyRequest batchRecordID(String batchRecordID) {
	  this.batchRecordID = batchRecordID;
	  return this;
  }
  
  public String getbatchRecordID() {
	  return batchRecordID;  
  }

  public void setbatchRecordID(String batchRecordID) {
	  this.batchRecordID = batchRecordID;
  }
  
}

