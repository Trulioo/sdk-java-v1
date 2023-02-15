package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class NationalId {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("DistrictOfIssue")
  private String districtOfIssue = null;

  @SerializedName("CityOfIssue")
  private String cityOfIssue = null;

  @SerializedName("ProvinceOfIssue")
  private String provinceOfIssue = null;

  @SerializedName("CountyOfIssue")
  private String countyOfIssue = null;

  public NationalId number(String number) {
    this.number = number;
    return this;
  }

   /**
   * 
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public NationalId type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Supported Types: NationalID, Health, SocialService, TaxIDNumber
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NationalId districtOfIssue(String districtOfIssue) {
    this.districtOfIssue = districtOfIssue;
    return this;
  }

   /**
   * District that issued the ID
   * @return districtOfIssue
  **/
  public String getDistrictOfIssue() {
    return districtOfIssue;
  }

  public void setDistrictOfIssue(String districtOfIssue) {
    this.districtOfIssue = districtOfIssue;
  }

  public NationalId cityOfIssue(String cityOfIssue) {
    this.cityOfIssue = cityOfIssue;
    return this;
  }

   /**
   * City that issued the ID
   * @return cityOfIssue
  **/
  public String getCityOfIssue() {
    return cityOfIssue;
  }

  public void setCityOfIssue(String cityOfIssue) {
    this.cityOfIssue = cityOfIssue;
  }

  public NationalId provinceOfIssue(String provinceOfIssue) {
    this.provinceOfIssue = provinceOfIssue;
    return this;
  }

   /**
   * Province that issued the ID
   * @return provinceOfIssue
  **/
  public String getProvinceOfIssue() {
    return provinceOfIssue;
  }

  public void setProvinceOfIssue(String provinceOfIssue) {
    this.provinceOfIssue = provinceOfIssue;
  }

  public NationalId countyOfIssue(String countyOfIssue) {
    this.countyOfIssue = countyOfIssue;
    return this;
  }

   /**
   * County that issued the ID
   * @return countyOfIssue
  **/
  public String getCountyOfIssue() {
    return countyOfIssue;
  }

  public void setCountyOfIssue(String countyOfIssue) {
    this.countyOfIssue = countyOfIssue;
  }

}

