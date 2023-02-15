package com.trulioo.normalizedapi.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BusinessRegistrationNumber {
	@SerializedName("Name")
	private String name = null;
	
	@SerializedName("Description")
	private String description = null;
	
	@SerializedName("Country")
	private String country = null;
	
	@SerializedName("Jurisdiction")
	private String jurisdiction = null;
	
	@SerializedName("Supported")
	private Boolean supported = null;
	
	@SerializedName("Type")
	private String type = null;
	
	@SerializedName("Masks")
	private List<BusinessRegistrationNumberMask> masks = null;
	
	/**
	 * The name of the business registration number
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BusinessRegistrationNumber name(String name) {
		this.name = name;
		return this;
	}
	
	/**
	 * Brief description of the business registration number
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public BusinessRegistrationNumber description(String description) {
		this.description = description;
		return this;
	}
	
	/**
	 * Country to which the business registration number applies
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public BusinessRegistrationNumber country(String country) {
		this.country = country;
		return this;
	}
	
	/**
	 * Optional jurisdiction to which the business registration number applies
	 * @return jurisdiction
	 */
	public String getJurisdiction() {
		return jurisdiction;
	}
	
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	
	public BusinessRegistrationNumber jurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
		return this;
	}
	
	/**
	 * Whether the business registration number is supported by Trulioo's systems
	 * @return supported
	 */
	public Boolean getSupported() {
		return supported;
	}
	
	public void setSupported(Boolean supported) {
		this.supported = supported;
	}
	
	public BusinessRegistrationNumber supported(Boolean supported) {
		this.supported = supported;
		return this;
	}
	
	/**
	 * The specified type of this business registration number
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public BusinessRegistrationNumber type(String type) {
		this.type = type;
		return this;
	}
	
	/**
	 * The mask(s) describing this business registration number
	 * @return description
	 */
	public List<BusinessRegistrationNumberMask> getMasks() {
		return masks;
	}
	
	public void setMasks(List<BusinessRegistrationNumberMask> masks) {
		this.masks = masks;
	}
	
	public BusinessRegistrationNumber addBusinessRegistrationNumberMaskItem(BusinessRegistrationNumberMask resultsItem) {
	    if (this.masks == null) {
	      this.masks = new ArrayList<BusinessRegistrationNumberMask>();
	    }
	    this.masks.add(resultsItem);
	    return this;
	  }
	
	public BusinessRegistrationNumber masks(List<BusinessRegistrationNumberMask> masks) {
		this.masks = masks;
		return this;
	}
}
