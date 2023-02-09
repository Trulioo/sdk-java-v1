package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class BusinessSearchRequest {
  @SerializedName("AcceptTruliooTermsAndConditions")
  private Boolean acceptTruliooTermsAndConditions = null;

  @SerializedName("CallBackUrl")
  private String callBackUrl = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("ConsentForDataSources")
  private List<String> consentForDataSources = null;

  @SerializedName("Business")
  private BusinessSearchRequestBusinessSearchModel business = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  public BusinessSearchRequest acceptTruliooTermsAndConditions(Boolean acceptTruliooTermsAndConditions) {
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

  public BusinessSearchRequest callBackUrl(String callBackUrl) {
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

  public BusinessSearchRequest timeout(Integer timeout) {
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

  public BusinessSearchRequest consentForDataSources(List<String> consentForDataSources) {
    this.consentForDataSources = consentForDataSources;
    return this;
  }

  public BusinessSearchRequest addConsentForDataSourcesItem(String consentForDataSourcesItem) {
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

  public BusinessSearchRequest business(BusinessSearchRequestBusinessSearchModel business) {
    this.business = business;
    return this;
  }

   /**
   * 
   * @return business
  **/
  public BusinessSearchRequestBusinessSearchModel getBusiness() {
    return business;
  }

  public void setBusiness(BusinessSearchRequestBusinessSearchModel business) {
    this.business = business;
  }

  public BusinessSearchRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for which the verification needs to be performed.
   * Two-letter alpha code for the country for which the verification needs to be performed. 
   * Call configuration/v1/countrycodes/{configurationname} to get the countries that are valid for you.
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

}

