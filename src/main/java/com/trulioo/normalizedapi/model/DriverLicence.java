package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * 
 */
public class DriverLicence {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("State")
  private String state = null;

  @SerializedName("DayOfExpiry")
  private Integer dayOfExpiry = null;

  @SerializedName("MonthOfExpiry")
  private Integer monthOfExpiry = null;

  @SerializedName("YearOfExpiry")
  private Integer yearOfExpiry = null;

  public DriverLicence number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Driver&#39;s Licence Number of the individual to be verified
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public DriverLicence state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of issue for Driver&#39;s Licence
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DriverLicence dayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence day of expiry of the individual to be verified
   * @return dayOfExpiry
  **/
  public Integer getDayOfExpiry() {
    return dayOfExpiry;
  }

  public void setDayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
  }

  public DriverLicence monthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence month of expiry of the individual to be verified
   * @return monthOfExpiry
  **/
  public Integer getMonthOfExpiry() {
    return monthOfExpiry;
  }

  public void setMonthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
  }

  public DriverLicence yearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
    return this;
  }

   /**
   * Driver&#39;s Licence year of expiry of the individual to be verified
   * @return yearOfExpiry
  **/
  public Integer getYearOfExpiry() {
    return yearOfExpiry;
  }

  public void setYearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
  }

}

