package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Additional Fields for Location
 */
public class LocationAdditionalFields {
  @SerializedName("Address1")
  private String address1 = null;

  public LocationAdditionalFields address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address1 is available in certain countries. It can be used to pass a compiled address field instead of sending individual address attributes (such as UnitNumber, BuidlingNumber, BuildingName, StreetName and StreetType).   GlobalGateway will provide a pass through of Address1 directly to connected datasources for the selected country.   Please note: each datasource requires the address fields to be configured in a certain manner, implementing and sending Address1 instead of individual address fields may affect your ability to verify this address.
   * @return address1
  **/
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

}

