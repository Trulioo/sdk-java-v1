package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class Address {
  @SerializedName("UnitNumber")
  private String unitNumber = null;

  @SerializedName("BuildingNumber")
  private String buildingNumber = null;

  @SerializedName("BuildingName")
  private String buildingName = null;

  @SerializedName("StreetName")
  private String streetName = null;

  @SerializedName("StreetType")
  private String streetType = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Suburb")
  private String suburb = null;

  @SerializedName("StateProvinceCode")
  private String stateProvinceCode = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("Address1")
  private String address1 = null;

  @SerializedName("AddressType")
  private String addressType = null;

  @SerializedName("StateProvince")
  private String stateProvince = null;
  
  @SerializedName("Country")
  private String country = null;
  
  @SerializedName("CountryCode")
  private String countryCode = null;

  public Address unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * Flat/Unit/Apartment number of address
   * @return unitNumber
  **/
  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * House / Civic / Building number of address
   * @return buildingNumber
  **/
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Address buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Name of building
   * @return buildingName
  **/
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Street name
   * @return streetName
  **/
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

   /**
   * Street type of address (Typically St, Rd etc)
   * @return streetType
  **/
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Suburb / Subdivision / Municipality
   * @return suburb
  **/
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address stateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

   /**
   * State or province of address. US sources expect 2 characters. Australian sources expect 2 or 3 characters.
   * @return stateProvinceCode
  **/
  public String getStateProvinceCode() {
    return stateProvinceCode;
  }

  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * ZIP Code or Postal Code
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address1
   * @return address1
  **/
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Address addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Address Type
   * @return addressType
  **/
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public Address stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * State Province
   * @return stateProvince
  **/
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }
  
  public Address country(String country) {
	  this.country = country;
	  return this;
  }
  
  public String getCountry() {
	  return country; 
  }
  
  public void setCountry(String country) {
	  this.country = country;
  }
  
  public Address countryCode(String countryCode) {
	  this.countryCode = countryCode;
	  return this;
  }
  
  public String getCountryCode(String countryCode) {
	  return countryCode; 
  }
  
  public void setCountryCode(String countryCode) {
	  this.countryCode = countryCode;
  }
}

