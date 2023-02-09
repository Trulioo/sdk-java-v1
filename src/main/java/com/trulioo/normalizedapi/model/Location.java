package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class Location {
  @SerializedName("BuildingNumber")
  private String buildingNumber = null;

  @SerializedName("BuildingName")
  private String buildingName = null;

  @SerializedName("UnitNumber")
  private String unitNumber = null;

  @SerializedName("StreetName")
  private String streetName = null;

  @SerializedName("StreetType")
  private String streetType = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Suburb")
  private String suburb = null;

  @SerializedName("County")
  private String county = null;

  @SerializedName("StateProvinceCode")
  private String stateProvinceCode = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("POBox")
  private String poBox = null;

  @SerializedName("AdditionalFields")
  private LocationAdditionalFields additionalFields = null;

  public Location buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * House / Civic / Building number of home address
   * @return buildingNumber
  **/
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Location buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Name of building of home address
   * @return buildingName
  **/
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Location unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * Flat/Unit/Apartment number of home address
   * @return unitNumber
  **/
  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public Location streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Street name of primary residence
   * @return streetName
  **/
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Location streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

   /**
   * Street type of primary residence (e.g. St, Rd etc)
   * @return streetType
  **/
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of home address
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Suburb / Subdivision / Municipality of home address
   * @return suburb
  **/
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Location county(String county) {
    this.county = county;
    return this;
  }

   /**
   * County / District of home address
   * @return county
  **/
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Location stateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

   /**
   * State of primary residence. US sources expect 2 characters. Australian sources expect 2 or 3 characters.
   * @return stateProvinceCode
  **/
  public String getStateProvinceCode() {
    return stateProvinceCode;
  }

  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }

  public Location country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of physical address (ISO 3166-1 alpha-2)
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Location postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * ZIP Code or Postal Code of home address
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Location poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

   /**
   * Post Office Box
   * @return poBox
  **/
  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public Location additionalFields(LocationAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

   /**
   * Fields not normally used
   * @return additionalFields
  **/
  public LocationAdditionalFields getAdditionalFields() {
    return additionalFields;
  }

  public void setAdditionalFields(LocationAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
  }

}

