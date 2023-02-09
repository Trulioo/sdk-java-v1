package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

public class BusinessSearchResponseIndustryCode {
	@SerializedName("Code")
	private String code = null;
	
	@SerializedName("Description")
	private String description = null;
	
	public BusinessSearchResponseIndustryCode code(String code) {
		this.code = code;
		return this;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public BusinessSearchResponseIndustryCode description(String description) {
		this.description = description;
		return this;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}