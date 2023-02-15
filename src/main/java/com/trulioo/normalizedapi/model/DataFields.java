package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The data field name-value pairs for the data elements on which the verification is to be performed
 */
public class DataFields {
  @SerializedName("PersonInfo")
  private PersonInfo personInfo = null;

  @SerializedName("Location")
  private Location location = null;

  @SerializedName("Communication")
  private Communication communication = null;

  @SerializedName("DriverLicence")
  private DriverLicence driverLicence = null;

  @SerializedName("NationalIds")
  private List<NationalId> nationalIds = null;

  @SerializedName("Passport")
  private Passport passport = null;

  @SerializedName("Document")
  private Document document = null;

  @SerializedName("Business")
  private Business business = null;
  
  @SerializedName("Risk")
  private RiskMonitorSettings riskMonitorSettings = null;

  @SerializedName("CountrySpecific")
  private Map<String, Map<String, String>> countrySpecific = null;

  public DataFields personInfo(PersonInfo personInfo) {
    this.personInfo = personInfo;
    return this;
  }

   /**
   * Personal Information
   * @return personInfo
  **/
  public PersonInfo getPersonInfo() {
    return personInfo;
  }

  public void setPersonInfo(PersonInfo personInfo) {
    this.personInfo = personInfo;
  }

  public DataFields location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Location Information
   * @return location
  **/
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public DataFields communication(Communication communication) {
    this.communication = communication;
    return this;
  }

   /**
   * Communication Information
   * @return communication
  **/
  public Communication getCommunication() {
    return communication;
  }

  public void setCommunication(Communication communication) {
    this.communication = communication;
  }

  public DataFields driverLicence(DriverLicence driverLicence) {
    this.driverLicence = driverLicence;
    return this;
  }

   /**
   * Driver Licence Information
   * @return driverLicence
  **/
  public DriverLicence getDriverLicence() {
    return driverLicence;
  }

  public void setDriverLicence(DriverLicence driverLicence) {
    this.driverLicence = driverLicence;
  }

  public DataFields nationalIds(List<NationalId> nationalIds) {
    this.nationalIds = nationalIds;
    return this;
  }

  public DataFields addNationalIdsItem(NationalId nationalIdsItem) {
    if (this.nationalIds == null) {
      this.nationalIds = new ArrayList<NationalId>();
    }
    this.nationalIds.add(nationalIdsItem);
    return this;
  }

   /**
   * National Identification Information
   * @return nationalIds
  **/
  public List<NationalId> getNationalIds() {
    return nationalIds;
  }

  public void setNationalIds(List<NationalId> nationalIds) {
    this.nationalIds = nationalIds;
  }

  public DataFields passport(Passport passport) {
    this.passport = passport;
    return this;
  }

   /**
   * Passport information
   * @return passport
  **/
  public Passport getPassport() {
    return passport;
  }

  public void setPassport(Passport passport) {
    this.passport = passport;
  }

  public DataFields document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Document information
   * @return document
  **/
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public DataFields business(Business business) {
    this.business = business;
    return this;
  }

   /**
   * Business information
   * @return business
  **/
  public Business getBusiness() {
    return business;
  }

  public void setBusiness(Business business) {
    this.business = business;
  }
  
  public DataFields riskMonitorSettings(RiskMonitorSettings riskMonitorSettings) {
	  this.riskMonitorSettings = riskMonitorSettings;
	  return this;
  }
  
  public RiskMonitorSettings getRiskMonitorSettings() {
	  return riskMonitorSettings;
  }
  
  public void setRiskMonitorSettings(RiskMonitorSettings riskMonitorSettings) {
	  this.riskMonitorSettings = riskMonitorSettings;
  }

  public DataFields countrySpecific(Map<String, Map<String, String>> countrySpecific) {
    this.countrySpecific = countrySpecific;
    return this;
  }

  public DataFields putCountrySpecificItem(String key, Map<String, String> countrySpecificItem) {
    if (this.countrySpecific == null) {
      this.countrySpecific = new HashMap<String, Map<String, String>>();
    }
    this.countrySpecific.put(key, countrySpecificItem);
    return this;
  }

   /**
   * CountrySpecific fields  {\&quot;CountryCode\&quot; : {\&quot;Field1\&quot; : \&quot;Value\&quot;,  \&quot;Field2\&quot; : \&quot;Value\&quot;  }}
   * @return countrySpecific
  **/
  public Map<String, Map<String, String>> getCountrySpecific() {
    return countrySpecific;
  }

  public void setCountrySpecific(Map<String, Map<String, String>> countrySpecific) {
    this.countrySpecific = countrySpecific;
  }

}

