package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class ServiceError {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Message")
  private String message = null;

  public ServiceError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServiceError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}

