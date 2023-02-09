package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class PersonInfoAdditionalFields {
  @SerializedName("FullName")
  private String fullName = null;

  public PersonInfoAdditionalFields fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of of the individual to be verified
   * @return fullName
  **/
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

}

