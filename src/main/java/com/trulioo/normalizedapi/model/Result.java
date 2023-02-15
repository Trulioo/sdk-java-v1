package com.trulioo.normalizedapi.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


/**
 * Result
 */
public class Result {
  @SerializedName("Index")
  private String index = null;

  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("MatchingScore")
  private String matchingScore = null;

  @SerializedName("BusinessRegistrationNumber")
  private String businessRegistrationNumber = null;

  @SerializedName("DUNSNumber")
  private String duNSNumber = null;

  @SerializedName("BusinessTaxIDNumber")
  private String businessTaxIDNumber = null;

  @SerializedName("BusinessLicenseNumber")
  private String businessLicenseNumber = null;

  @SerializedName("JurisdictionOfIncorporation")
  private String jurisdictionOfIncorporation = null;

  @SerializedName("FullAddress")
  private String fullAddress = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;
  
  @SerializedName("OriginalBusinessStatus")
  private String originalBusinessStatus = null;

  @SerializedName("TradeStyleName")
  private String tradeStyleName = null;

  @SerializedName("BusinessType")
  private String businessType = null;

  @SerializedName("Address")
  private Address address = null;
  
  @SerializedName("OtherBusinessNames")
  private List<String> otherBusinessNames = null;
  
  @SerializedName("Website")
  private String website = null;
  
  @SerializedName("Telephone")
  private String telephone = null;
  
  @SerializedName("TaxIDNumber")
  private String taxIDNumber = null;
  
  @SerializedName("TaxIDNumbers")
  private List<String> taxIDNumbers = null;
  
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  
  @SerializedName("WebDomain")
  private String webDomain = null;
  
  @SerializedName("WebDomains")
  private List<String> webDomains = null;
  
  @SerializedName("NAICS")
  private List<BusinessSearchResponseIndustryCode> northAmericanIndustryClassificationSystemCodes = null;
  
  @SerializedName("SIC")
  private List<BusinessSearchResponseIndustryCode> standardIndustrialClassificationCodes = null;

  public Result index(String index) {
    this.index = index;
    return this;
  }

   /**
   * 
   * @return index
  **/
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public Result businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * 
   * @return businessName
  **/
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Result matchingScore(String matchingScore) {
    this.matchingScore = matchingScore;
    return this;
  }

   /**
   * 
   * @return matchingScore
  **/
  public String getMatchingScore() {
    return matchingScore;
  }

  public void setMatchingScore(String matchingScore) {
    this.matchingScore = matchingScore;
  }

  public Result businessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
    return this;
  }

   /**
   * 
   * @return businessRegistrationNumber
  **/
  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }

  public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
  }

  public Result duNSNumber(String duNSNumber) {
    this.duNSNumber = duNSNumber;
    return this;
  }

   /**
   * 
   * @return duNSNumber
  **/
  public String getDuNSNumber() {
    return duNSNumber;
  }

  public void setDuNSNumber(String duNSNumber) {
    this.duNSNumber = duNSNumber;
  }

  public Result businessTaxIDNumber(String businessTaxIDNumber) {
    this.businessTaxIDNumber = businessTaxIDNumber;
    return this;
  }

   /**
   * 
   * @return businessTaxIDNumber
  **/
  public String getBusinessTaxIDNumber() {
    return businessTaxIDNumber;
  }

  public void setBusinessTaxIDNumber(String businessTaxIDNumber) {
    this.businessTaxIDNumber = businessTaxIDNumber;
  }

  public Result businessLicenseNumber(String businessLicenseNumber) {
    this.businessLicenseNumber = businessLicenseNumber;
    return this;
  }

   /**
   * 
   * @return businessLicenseNumber
  **/
  public String getBusinessLicenseNumber() {
    return businessLicenseNumber;
  }

  public void setBusinessLicenseNumber(String businessLicenseNumber) {
    this.businessLicenseNumber = businessLicenseNumber;
  }

  public Result jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
    return this;
  }

   /**
   * 
   * @return jurisdictionOfIncorporation
  **/
  public String getJurisdictionOfIncorporation() {
    return jurisdictionOfIncorporation;
  }

  public void setJurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
  }

  public Result fullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

   /**
   * 
   * @return fullAddress
  **/
  public String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }

  public Result businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Business Status
   * @return businessStatus
  **/
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }
  
  public Result originalBusinessStatus(String originalBusinessStatus) {
	  this.originalBusinessStatus = originalBusinessStatus;
	  return this;
  }
  
  public String getOriginalBusinessStatus(String originalBusinessStatus) {
	  return originalBusinessStatus;
  }
  
  public void setOriginalBusinessStatus(String originalBusinessStatus) {
	  this.originalBusinessStatus = originalBusinessStatus;
  }

  public Result tradeStyleName(String tradeStyleName) {
    this.tradeStyleName = tradeStyleName;
    return this;
  }

   /**
   * Trade Style Name
   * @return tradeStyleName
  **/
  public String getTradeStyleName() {
    return tradeStyleName;
  }

  public void setTradeStyleName(String tradeStyleName) {
    this.tradeStyleName = tradeStyleName;
  }

  public Result businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }

   /**
   * Business Type
   * @return businessType
  **/
  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public Result address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  
  public Result otherBusinessNames(List<String> otherBusinessNames) {
	  this.otherBusinessNames = otherBusinessNames;
	  return this;
  }
  
  public Result addOtherBusinessNames(String otherBusinessName) {
	  if(this.otherBusinessNames == null) {
		  this.otherBusinessNames = new ArrayList<String>();
	  }
	  
	  this.otherBusinessNames.add(otherBusinessName);
	  return this;
  }
  
  public List<String> getOtherBusinessNames() {
	  return otherBusinessNames;
  }
  
  public void setOtherBusinessNames(List<String> otherBusinessNames) {
	  this.otherBusinessNames = otherBusinessNames;
  }
  
  public Result website(String website) {
	  this.website = website;
	  return this;
  }

  public String getWebsite() {
	  return website;
  }
 
  public void setWebsite(String website) {
	  this.website = website;
  }
  
  public Result telephone(String telephone) {
	  this.telephone = telephone;
	  return this;
  }
  
  public void setTelephone(String telephone) {
	  this.telephone = telephone;
  }
  
  public Result taxIDNumber(String taxIDNumber) {
	  this.taxIDNumber = taxIDNumber;
	  return this;
  }
  
  public void setTaxIDNumber(String taxIDNumber) {
	  this.taxIDNumber = taxIDNumber;
  }
  
  public Result TaxIDNumbers(List<String> taxIDNumbers) {
	  this.taxIDNumbers = taxIDNumbers;
	  return this;
  }
  
  public Result addTaxIDNumbers(String taxIDNumber) {
	  if(taxIDNumbers == null) {
		  taxIDNumbers = new ArrayList<String>();
	  }
	  this.taxIDNumbers.add(taxIDNumber);
	  return this;
  }
  
  public List<String> getTaxIDNumbers() {
	  return taxIDNumbers;
  }
  
  public void setTaxIDNumbers(List<String> taxIDNumbers) {
	  this.taxIDNumbers = taxIDNumbers;
  }
  
  public Result emailAddress(String emailAddress) {
	  this.emailAddress = emailAddress;
	  return this;
  }
  
  public String getEmailAddress() {
	  return emailAddress;
  }
  
  public void setEmailAddress(String emailAddress) {
	  this.emailAddress = emailAddress;
  }
  
  public Result webDomain(String webDomain) {
	  this.webDomain = webDomain;
	  return this;
  }
  
  public String getWebDomain() {
	  return webDomain;
  }
  
  public void setWebDomain(String webDomain) {
	  this.webDomain = webDomain; 
  }
  
  public Result WebDomains(List<String> webDomains) {
	  this.webDomains = webDomains;
	  return this;
  }
  
  public Result addWebDomains(String webDomain) {
	  if(webDomains == null) {
		  webDomains = new ArrayList<String>();
	  }
	  this.webDomains.add(webDomain);
	  return this;
  }
  
  public List<String> getWebDomains() {
	  return webDomains;
  }
  
  public void setWebDomains(List<String> webDomains) {
	  this.webDomains = webDomains;
  }
  
  public Result NorthAmericanIndustryClassificationSystemCodes(List<BusinessSearchResponseIndustryCode> naics) {
	  this.northAmericanIndustryClassificationSystemCodes = naics;
	  return this;
  }
  
  public Result addNorthAmericanIndustryClassificationSystemCodes(BusinessSearchResponseIndustryCode naic) {
	  if(northAmericanIndustryClassificationSystemCodes == null) {
		  northAmericanIndustryClassificationSystemCodes = new ArrayList<BusinessSearchResponseIndustryCode>();
	  }
	  this.northAmericanIndustryClassificationSystemCodes.add(naic);
	  return this;
  }
    
  public List<BusinessSearchResponseIndustryCode> getNorthAmericanIndustryClassificationSystemCodes() {
	  return northAmericanIndustryClassificationSystemCodes;
  }
  
  public void setNorthAmericanIndustryClassificationSystemCodes(List<BusinessSearchResponseIndustryCode> naic) {
	  this.northAmericanIndustryClassificationSystemCodes = naic;
  }
  
  public Result standardIndustrialClassificationCodes(List<BusinessSearchResponseIndustryCode> sics) {
	  this.standardIndustrialClassificationCodes = sics;
	  return this;
  }
  
  public Result addStandardIndustrialClassificationCodes(BusinessSearchResponseIndustryCode sic) {
	  if(standardIndustrialClassificationCodes == null) {
		  standardIndustrialClassificationCodes = new ArrayList<BusinessSearchResponseIndustryCode>();
	  }
	  this.standardIndustrialClassificationCodes.add(sic);
	  return this;
  }
    
  public List<BusinessSearchResponseIndustryCode> getStandardIndustrialClassificationCodes() {
	  return standardIndustrialClassificationCodes;
  }
  
  public void setStandardIndustrialClassificationCodes(List<BusinessSearchResponseIndustryCode> sic) {
	  this.standardIndustrialClassificationCodes = sic;
  }
}

