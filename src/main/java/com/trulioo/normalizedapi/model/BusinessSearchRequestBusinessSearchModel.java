package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Business Object
 */
public class BusinessSearchRequestBusinessSearchModel {
  @SerializedName("BusinessName")
  private String businessName = null;
  
  @SerializedName("Website")
  private String website = null;

  @SerializedName("JurisdictionOfIncorporation")
  private String jurisdictionOfIncorporation = null;

  @SerializedName("DUNSNumber")
  private String duNSNumber = null;

  @SerializedName("Location")
  private Location location = null;

  public BusinessSearchRequestBusinessSearchModel businessName(String businessName) {
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
  
  public BusinessSearchRequestBusinessSearchModel website(String website) {
	  this.website = website;
	  return this;
  }
  
  /**
   * Website of the business
   * @return website
   */
  public String getWebsite() {
	  return website;
  }
  
  public void setWebsite(String website) {
	  this.website = website;
  }

  public BusinessSearchRequestBusinessSearchModel jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
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

  public BusinessSearchRequestBusinessSearchModel duNSNumber(String duNSNumber) {
    this.duNSNumber = duNSNumber;
    return this;
  }

   /**
   * DUNS number of the business to be verified
   * @return duNSNumber
  **/
  public String getDuNSNumber() {
    return duNSNumber;
  }

  public void setDuNSNumber(String duNSNumber) {
    this.duNSNumber = duNSNumber;
  }

  public BusinessSearchRequestBusinessSearchModel location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Location of business to be verified
   * @return location
  **/
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

}

