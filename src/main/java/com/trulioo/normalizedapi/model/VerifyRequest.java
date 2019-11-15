/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.DataFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The verification call for the Normalized API is a POST method call
 */
@ApiModel(description = "The verification call for the Normalized API is a POST method call")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T15:09:55.671-07:00")
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

  public VerifyRequest acceptTruliooTermsAndConditions(Boolean acceptTruliooTermsAndConditions) {
    this.acceptTruliooTermsAndConditions = acceptTruliooTermsAndConditions;
    return this;
  }

   /**
   * Indicate that Trulioo terms and conditions are accepted
   * @return acceptTruliooTermsAndConditions
  **/
  @ApiModelProperty(value = "Indicate that Trulioo terms and conditions are accepted")
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
  @ApiModelProperty(value = "This field is not used anymore.  If provided it must match the setting on your account or you will get an error.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Set to true if you want to receive address cleanse information,  This will only change the response if you have address cleansing enabled for the country you are querying for.")
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
  @ApiModelProperty(value = "Indicate the configuration used for the verification. Currently only  'Identity Verification' is supported.")
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
  @ApiModelProperty(value = "Some datasources required your customer provide consent to access them.  Set that the customer has provided consent for each  datasource that requires one.  If consent is not provided the datasource will not be queried.")
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
  @ApiModelProperty(required = true, value = "The country code for which the verification needs to be performed.")
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
  @ApiModelProperty(value = "Customer Reference Id")
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
  @ApiModelProperty(required = true, value = "The data field name-value pairs for the data elements on which the verification is to be performed")
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
  @ApiModelProperty(value = "Verbose Mode Output Flag.")
  public Boolean getVerboseMode() {
    return verboseMode;
  }

  public void setVerboseMode(Boolean verboseMode) {
    this.verboseMode = verboseMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyRequest verifyRequest = (VerifyRequest) o;
    return Objects.equals(this.acceptTruliooTermsAndConditions, verifyRequest.acceptTruliooTermsAndConditions) &&
        Objects.equals(this.demo, verifyRequest.demo) &&
        Objects.equals(this.callBackUrl, verifyRequest.callBackUrl) &&
        Objects.equals(this.timeout, verifyRequest.timeout) &&
        Objects.equals(this.cleansedAddress, verifyRequest.cleansedAddress) &&
        Objects.equals(this.configurationName, verifyRequest.configurationName) &&
        Objects.equals(this.consentForDataSources, verifyRequest.consentForDataSources) &&
        Objects.equals(this.countryCode, verifyRequest.countryCode) &&
        Objects.equals(this.customerReferenceID, verifyRequest.customerReferenceID) &&
        Objects.equals(this.dataFields, verifyRequest.dataFields) &&
        Objects.equals(this.verboseMode, verifyRequest.verboseMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptTruliooTermsAndConditions, demo, callBackUrl, timeout, cleansedAddress, configurationName, consentForDataSources, countryCode, customerReferenceID, dataFields, verboseMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyRequest {\n");
    
    sb.append("    acceptTruliooTermsAndConditions: ").append(toIndentedString(acceptTruliooTermsAndConditions)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    callBackUrl: ").append(toIndentedString(callBackUrl)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    cleansedAddress: ").append(toIndentedString(cleansedAddress)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    consentForDataSources: ").append(toIndentedString(consentForDataSources)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    customerReferenceID: ").append(toIndentedString(customerReferenceID)).append("\n");
    sb.append("    dataFields: ").append(toIndentedString(dataFields)).append("\n");
    sb.append("    verboseMode: ").append(toIndentedString(verboseMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

