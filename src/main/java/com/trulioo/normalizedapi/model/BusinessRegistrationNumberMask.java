package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

public class BusinessRegistrationNumberMask {
	@SerializedName("Mask")
	private String mask = null;
	
	@SerializedName("IgnoreWhitespace")
	private Boolean ignoreWhitespace = null;
	
	@SerializedName("IgnoreSpecialCharacter")
	private Boolean ignoreSpecialCharacter = null;
	
	@SerializedName("PrependZeroes")
	private Boolean prependZeroes = null;
	
	@SerializedName("OverwriteRepeating")
	private Boolean overwriteRepeating = null;
	
	/**
	 * The mask used to validate the format of the business registration number
	 * @return mask
	 */
	public String getMask() {
		return mask;
	}
	
	public void setMask(String mask) {
		this.mask = mask;
	}
	
	public BusinessRegistrationNumberMask mask(String mask) {
		this.mask = mask;
		return this;
	}
	
	/**
	 * Flag showing whether we can ignore whitespace
	 * @return name
	 */
	public Boolean getIgnoreWhitespace() {
		return ignoreWhitespace;
	}
	
	public void setIgnoreWhitespace(Boolean ignoreWhitespace) {
		this.ignoreWhitespace = ignoreWhitespace;
	}
	
	public BusinessRegistrationNumberMask ignoreWhitespace(Boolean ignoreWhitespace) {
		this.ignoreWhitespace = ignoreWhitespace;
		return this;
	}
	
	/**
	 * Flag showing whether we can ignore special character
	 * @return name
	 */
	public Boolean getIgnoreSpecialCharacter() {
		return ignoreSpecialCharacter;
	}
	
	public void setIgnoreSpecialCharacter(Boolean ignoreSpecialCharacter) {
		this.ignoreSpecialCharacter = ignoreSpecialCharacter;
	}
	
	public BusinessRegistrationNumberMask ignoreSpecialCharacter(Boolean ignoreSpecialCharacter) {
		this.ignoreSpecialCharacter = ignoreSpecialCharacter;
		return this;
	}
	
	/**
	 * Flag showing if 0s should be prepended to meet Mask Length
	 * @return name
	 */
	public Boolean getPrependZeroes() {
		return prependZeroes;
	}
	
	public void setPrependZeroes(Boolean prependZeroes) {
		this.prependZeroes = prependZeroes;
	}
	
	public BusinessRegistrationNumberMask prependZeroes(Boolean prependZeroes) {
		this.prependZeroes = prependZeroes;
		return this;
	}
	
	/**
	 * Flag showing if repeating characters should be overwritten
	 * @return overwriteRepeating
	 */
	public Boolean getOverwriteRepeating() {
		return overwriteRepeating;
	}
	
	public void setOverwriteRepeating(Boolean overwriteRepeating) {
		this.overwriteRepeating = overwriteRepeating;
	}
	
	public BusinessRegistrationNumberMask overwriteRepeating(Boolean overwriteRepeating) {
		this.overwriteRepeating = overwriteRepeating;
		return this;
	}
}
