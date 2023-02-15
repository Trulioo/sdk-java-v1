package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Personal Information
 */
public class PersonInfo {
  @SerializedName("FirstGivenName")
  private String firstGivenName = null;

  @SerializedName("MiddleName")
  private String middleName = null;

  @SerializedName("FirstSurName")
  private String firstSurName = null;

  @SerializedName("SecondSurname")
  private String secondSurname = null;

  @SerializedName("ISOLatin1Name")
  private String isOLatin1Name = null;

  @SerializedName("DayOfBirth")
  private Integer dayOfBirth = null;

  @SerializedName("MonthOfBirth")
  private Integer monthOfBirth = null;

  @SerializedName("YearOfBirth")
  private Integer yearOfBirth = null;

  @SerializedName("MinimumAge")
  private Integer minimumAge = null;

  @SerializedName("Gender")
  private String gender = null;

  @SerializedName("AdditionalFields")
  private PersonInfoAdditionalFields additionalFields = null;

  public PersonInfo firstGivenName(String firstGivenName) {
    this.firstGivenName = firstGivenName;
    return this;
  }

   /**
   * First name of the individual to be verified
   * @return firstGivenName
  **/
  public String getFirstGivenName() {
    return firstGivenName;
  }

  public void setFirstGivenName(String firstGivenName) {
    this.firstGivenName = firstGivenName;
  }

  public PersonInfo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Second given name of the individual to be verified
   * @return middleName
  **/
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PersonInfo firstSurName(String firstSurName) {
    this.firstSurName = firstSurName;
    return this;
  }

   /**
   * First (paternal) family name of the individual to be verified
   * @return firstSurName
  **/
  public String getFirstSurName() {
    return firstSurName;
  }

  public void setFirstSurName(String firstSurName) {
    this.firstSurName = firstSurName;
  }

  public PersonInfo secondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
    return this;
  }

   /**
   * second family name of the individual to be verified
   * @return secondSurname
  **/
  public String getSecondSurname() {
    return secondSurname;
  }

  public void setSecondSurname(String secondSurname) {
    this.secondSurname = secondSurname;
  }

  public PersonInfo isOLatin1Name(String isOLatin1Name) {
    this.isOLatin1Name = isOLatin1Name;
    return this;
  }

   /**
   * Enter full name in ISO Latin-1 character set
   * @return isOLatin1Name
  **/
  public String getIsOLatin1Name() {
    return isOLatin1Name;
  }

  public void setIsOLatin1Name(String isOLatin1Name) {
    this.isOLatin1Name = isOLatin1Name;
  }

  public PersonInfo dayOfBirth(Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
    return this;
  }

   /**
   * Day of birth date (e.g. 23 for a date of birth of 23/11/1975)
   * @return dayOfBirth
  **/
  public Integer getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public PersonInfo monthOfBirth(Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
    return this;
  }

   /**
   * Month of birth date (e.g. 11 for a date of birth of 23/11/1975)
   * @return monthOfBirth
  **/
  public Integer getMonthOfBirth() {
    return monthOfBirth;
  }

  public void setMonthOfBirth(Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
  }

  public PersonInfo yearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
    return this;
  }

   /**
   * Year of birth date (e.g. 1975 for a date of birth of 23/11/1975)
   * @return yearOfBirth
  **/
  public Integer getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public PersonInfo minimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

   /**
   * Minimum permitted age of the individual
   * @return minimumAge
  **/
  public Integer getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }

  public PersonInfo gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Single character M / F (M &#x3D; Male, F &#x3D; Female)
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PersonInfo additionalFields(PersonInfoAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

   /**
   * 
   * @return additionalFields
  **/
  public PersonInfoAdditionalFields getAdditionalFields() {
    return additionalFields;
  }

  public void setAdditionalFields(PersonInfoAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
  }

}

