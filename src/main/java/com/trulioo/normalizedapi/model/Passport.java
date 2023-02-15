package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class Passport {
  @SerializedName("Mrz1")
  private String mrz1 = null;

  @SerializedName("Mrz2")
  private String mrz2 = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("DayOfExpiry")
  private Integer dayOfExpiry = null;

  @SerializedName("MonthOfExpiry")
  private Integer monthOfExpiry = null;

  @SerializedName("YearOfExpiry")
  private Integer yearOfExpiry = null;

  public Passport mrz1(String mrz1) {
    this.mrz1 = mrz1;
    return this;
  }

   /**
   * Line 1 of the passport MRZ
   * @return mrz1
  **/
  public String getMrz1() {
    return mrz1;
  }

  public void setMrz1(String mrz1) {
    this.mrz1 = mrz1;
  }

  public Passport mrz2(String mrz2) {
    this.mrz2 = mrz2;
    return this;
  }

   /**
   * line 2 of the passport MRZ
   * @return mrz2
  **/
  public String getMrz2() {
    return mrz2;
  }

  public void setMrz2(String mrz2) {
    this.mrz2 = mrz2;
  }

  public Passport number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Passport Number
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Passport dayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence day of expiry of the individual to be verified
   * @return dayOfExpiry
  **/
  public Integer getDayOfExpiry() {
    return dayOfExpiry;
  }

  public void setDayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
  }

  public Passport monthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence month of expiry of the individual to be verified
   * @return monthOfExpiry
  **/
  public Integer getMonthOfExpiry() {
    return monthOfExpiry;
  }

  public void setMonthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
  }

  public Passport yearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence year of expiry of the individual to be verified
   * @return yearOfExpiry
  **/
  public Integer getYearOfExpiry() {
    return yearOfExpiry;
  }

  public void setYearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
  }

}

