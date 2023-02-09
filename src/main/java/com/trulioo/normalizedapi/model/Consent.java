package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Consents required from datasource
 */
public class Consent {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Url")
  private String url = null;

  public Consent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the datasource requiring consent
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Consent text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text outlining how the user is consenting for their data to be used
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Consent url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL where the user can find more information about how the datasource will use their data
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}

