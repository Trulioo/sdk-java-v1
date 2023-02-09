package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

public class RiskMonitorSettings {
	@SerializedName("Frequency")
	private String frequency = null;
	
	@SerializedName("CallbackUrl")
	private String callbackUrl = null;
	
	@SerializedName("IP")
	private String ip = null;
	
	@SerializedName("Email")
	private String email = null;
	
	@SerializedName("Action")
	private String action = null;
	
	@SerializedName("UserAgent")
	private String userAgent = null;
	
	@SerializedName("DeviceID")
	private String deviceID = null;
	
	@SerializedName("Phone")
	private String phone = null;
	
	public RiskMonitorSettings frequency(String frequency) {
		this.frequency = frequency;
		return this;
	}
	
	public String getFrequency() {
		return frequency;
	}
	
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public RiskMonitorSettings callbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		return this;
	}
	
	public String getCallbackUrl() {
		return callbackUrl;
	}
	
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
	public RiskMonitorSettings ip(String ip) {
		this.ip = ip;
		return this;
	}
	
	public String getIP() {
		return ip;
	}
	
	public void setIP(String ip) {
		this.ip = ip;
	}
	
	public RiskMonitorSettings email(String email) {
		this.email = email;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public RiskMonitorSettings action(String action) {
		this.action = action;
		return this;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public RiskMonitorSettings userAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}
	
	public String getUserAgent() {
		return userAgent;
	}
	
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	
	public RiskMonitorSettings DeviceID(String deviceID) {
		this.deviceID = deviceID;
		return this;
	}
	
	public String getDeviceID() {
		return deviceID;
	}
	
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	
	public RiskMonitorSettings Phone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
