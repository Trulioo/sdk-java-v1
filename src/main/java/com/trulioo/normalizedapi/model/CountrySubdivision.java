package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * ISO 3166-2 break down of the country
 */
public class CountrySubdivision {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("ParentCode")
  private String parentCode = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  public CountrySubdivision name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the area, in english or one of the languages of the country
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountrySubdivision code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code for the area
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CountrySubdivision parentCode(String parentCode) {
    this.parentCode = parentCode;
    return this;
  }

   /**
   * Code of the parent entity
   * @return parentCode
  **/
  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }

  /**
   * Code for the country
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }
  public CountrySubdivision countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }


}

