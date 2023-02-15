package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class Communication {
  @SerializedName("MobileNumber")
  private String mobileNumber = null;

  @SerializedName("Telephone")
  private String telephone = null;

  @SerializedName("Telephone2")
  private String telephone2 = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  public Communication mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile phone number
   * @return mobileNumber
  **/
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Communication telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Telephone number of the individual to be verified
   * @return telephone
  **/
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Communication telephone2(String telephone2) {
    this.telephone2 = telephone2;
    return this;
  }

   /**
   * Additional Phone/Mobile Number of the individual to be verified
   * @return telephone2
  **/
  public String getTelephone2() {
    return telephone2;
  }

  public void setTelephone2(String telephone2) {
    this.telephone2 = telephone2;
  }

  public Communication emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of the individual to be verified
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

}

