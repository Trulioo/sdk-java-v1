package com.trulioo.normalizedapi.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * 
 */
public class Business {
  @SerializedName("BusinessName")
  private String businessName = null;
  
  @SerializedName("TradestyleName")
  private String tradestyleName = null;
  
  @SerializedName("TaxIDNumber")
  private String taxIDNumber = null; 

  @SerializedName("BusinessRegistrationNumber")
  private String businessRegistrationNumber = null;

  @SerializedName("DayOfIncorporation")
  private Integer dayOfIncorporation = null;

  @SerializedName("MonthOfIncorporation")
  private Integer monthOfIncorporation = null;

  @SerializedName("YearOfIncorporation")
  private Integer yearOfIncorporation = null;

  @SerializedName("JurisdictionOfIncorporation")
  private String jurisdictionOfIncorporation = null;

  @SerializedName("ShareholderListDocument")
  private Boolean shareholderListDocument = null;

  @SerializedName("EnhancedProfile")
  private Boolean enhancedProfile = null;

  @SerializedName("FinancialInformationDocument")
  private Boolean financialInformationDocument = null;

  @SerializedName("DunsNumber")
  private String dunsNumber = null;

  @SerializedName("Entities")
  private Boolean entities = null;
  
  @SerializedName("PeopleOfSignificantControl")
  private List<PersonOfSignificantControl> peopleOfSignificantControl = null;
  
  @SerializedName("Filings")
  private Boolean filings = null;
  
  @SerializedName("ArticleOfAssociation")
  private Boolean articleOfAssociation = null;
  
  @SerializedName("RegistrationDetails")
  private Boolean registrationDetails = null;
  
  @SerializedName("AnnualReport")
  private Boolean annualReport = null;

  public Business businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business to be verified
   * @return businessName
  **/
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }
  
  public Business tradestyleName(String tradestyleName) {
	  this.tradestyleName = tradestyleName;
	  return this;
  }
  
  /**
   * TradestyleName of the business to be verified
   * @return tradestyleName
  **/
  public String getTradestyleName() {
    return tradestyleName;
  }
  
  public void setTradestyleName(String tradestyleName) {
	  this.tradestyleName = tradestyleName;
  }
  
  public Business taxIDNumber(String taxIDNumber) {
	  this.taxIDNumber = taxIDNumber;
	  return this;
  }
  
  /**
   * TradestyleName of the business to be verified
   * @return tradestyleName
  **/
  public String getTaxIDNumber() {
    return taxIDNumber;
  }
  
  public void setTaxIDNumber(String taxIDNumber) {
	  this.taxIDNumber = taxIDNumber;
  }

  public Business businessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
    return this;
  }

   /**
   * Registration number of business to be verified
   * @return businessRegistrationNumber
  **/
  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }

  public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
  }

  public Business dayOfIncorporation(Integer dayOfIncorporation) {
    this.dayOfIncorporation = dayOfIncorporation;
    return this;
  }

   /**
   * Day of incorporation of the business to be verified
   * @return dayOfIncorporation
  **/
  public Integer getDayOfIncorporation() {
    return dayOfIncorporation;
  }

  public void setDayOfIncorporation(Integer dayOfIncorporation) {
    this.dayOfIncorporation = dayOfIncorporation;
  }

  public Business monthOfIncorporation(Integer monthOfIncorporation) {
    this.monthOfIncorporation = monthOfIncorporation;
    return this;
  }

   /**
   * Month of incorporation of the business to be verified
   * @return monthOfIncorporation
  **/
  public Integer getMonthOfIncorporation() {
    return monthOfIncorporation;
  }

  public void setMonthOfIncorporation(Integer monthOfIncorporation) {
    this.monthOfIncorporation = monthOfIncorporation;
  }

  public Business yearOfIncorporation(Integer yearOfIncorporation) {
    this.yearOfIncorporation = yearOfIncorporation;
    return this;
  }

   /**
   * Year of incorporation of the business to be verified
   * @return yearOfIncorporation
  **/
  public Integer getYearOfIncorporation() {
    return yearOfIncorporation;
  }

  public void setYearOfIncorporation(Integer yearOfIncorporation) {
    this.yearOfIncorporation = yearOfIncorporation;
  }

  public Business jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
    return this;
  }

   /**
   * Jurisdiction Of Incorporation of the business to be verified
   * @return jurisdictionOfIncorporation
  **/
  public String getJurisdictionOfIncorporation() {
    return jurisdictionOfIncorporation;
  }

  public void setJurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
  }

  public Business shareholderListDocument(Boolean shareholderListDocument) {
    this.shareholderListDocument = shareholderListDocument;
    return this;
  }

   /**
   * Whether or not to retrieve shareholderList document
   * @return shareholderListDocument
  **/
  public Boolean getShareholderListDocument() {
    return shareholderListDocument;
  }

  public void setShareholderListDocument(Boolean shareholderListDocument) {
    this.shareholderListDocument = shareholderListDocument;
  }

  public Business financialInformationDocument(Boolean financialInformationDocument) {
    this.financialInformationDocument = financialInformationDocument;
    return this;
  }

   /**
   * Whether or not to retrieve financial information document
   * @return financialInformationDocument
  **/
  public Boolean getFinancialInformationDocument() {
    return financialInformationDocument;
  }

  public void setFinancialInformationDocument(Boolean financialInformationDocument) {
    this.financialInformationDocument = financialInformationDocument;
  }

  public Business enhancedProfile(Boolean enhancedProfile) {
    this.enhancedProfile = enhancedProfile;
    return this;
  }

  /**
   * Whether or not to call for Enhanced Profile Information
   * @return enhancedProfile
   */
  public Boolean getEnhancedProfile() {
    return enhancedProfile;
  }

  public void setEnhancedProfile(Boolean enhancedProfile) {
    this.enhancedProfile = enhancedProfile;
  }

  public Business dunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
    return this;
  }

   /**
   * Duns Number
   * @return dunsNumber
  **/
  public String getDunsNumber() {
    return dunsNumber;
  }

  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }

  public Business entities(Boolean entities) {
    this.entities = entities;
    return this;
  }

   /**
   * Whether or not to retrieve entity detail
   * @return entities
  **/
  public Boolean getEntities() {
    return entities;
  }

  public void setEntities(Boolean entities) {
    this.entities = entities;
  }
  
  public Business peopleOfSignificantControl(List<PersonOfSignificantControl> peopleOfSignificantControl) {
	  this.peopleOfSignificantControl = peopleOfSignificantControl;
	  return this;
  }
  
  public Business addPeopleOfSignificantControlItem(PersonOfSignificantControl personOfSignificantControl) {
	  if(this.peopleOfSignificantControl == null) {
		  this.peopleOfSignificantControl = new ArrayList<PersonOfSignificantControl>();
	  }
	  
	  this.peopleOfSignificantControl.add(personOfSignificantControl);
	  return this;
  }
  
  /**
   * A list of people to check for their matchstatus
   * @return peopleOfSignificantControl
   */
  public List<PersonOfSignificantControl> getPeopleOfSignificantControl() {
	  return peopleOfSignificantControl;
  }
  
  public void setPeopleOfSignificantControl(List<PersonOfSignificantControl> peopleOfSignificantControl) {
	  this.peopleOfSignificantControl = peopleOfSignificantControl;
  }
  
  public Business filings(Boolean filings) {
	  this.filings = filings;
	  return this;
  }

  /**
   * Whether or not to retrieve filing detail
   * @return filings
   */
  public Boolean getFilings() {
	  return filings;
  }
  
  public void setFilings(Boolean filings) {
	  this.filings = filings;
  }
  
  public Business articleOfAssociation(Boolean articleOfAssociation) {
	  this.articleOfAssociation = articleOfAssociation;
	  return this;
  }
  
  /**
   * Whether or not to retrieve article of association document
   * @return articleOfAssociation
   */
  public Boolean getArticleOfAssociation() {
	  return articleOfAssociation;
  }
  
  public void setArticleOfAssociation(Boolean articleOfAssociation ) {
	  this.articleOfAssociation = articleOfAssociation;
  }
  
  public Business registrationDetails(Boolean registrationDetails) {
	  this.registrationDetails = registrationDetails;
	  return this;
  }
  
  /**
   * Whether or not to retrieve registration detail document
   * @return registrationDetails
   */
  public Boolean getRegistrationDetails() {
	  return registrationDetails;
  }
  
  public void setRegistrationDetails(Boolean registrationDetails) {
	  this.registrationDetails = registrationDetails;
  }
  
  public Business annualReport(Boolean annualReport) {
	  this.annualReport = annualReport;
	  return this;
  }
  
  /**
   * Whether or not to retrieve annual report document
   * @return annualReport
   */
  public Boolean getAnnualReport() {
	  return annualReport;
  }
  
  public void setAnnualReport(Boolean annualReport) {
	  this.annualReport = annualReport;
  }
}

