package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

public class PersonOfSignificantControl {
	@SerializedName("FirstGivenName")
	private String firstGivenName = null;
	
	@SerializedName("MiddleName")
	private String middleName = null;
	
	@SerializedName("FirstSurName")
	private String firstSurName = null;
	
	@SerializedName("SecondSurname")
	private String secondSurname = null;
	
	@SerializedName("FullName")
	private String fullName = null;
	
	@SerializedName("BusinessName")
	private String businessName = null;
	
	@SerializedName("YearOfBirth")
	private String yearOfBirth = null;
	
	@SerializedName("MonthOfBirth")
	private String monthOfBirth = null;
	
	@SerializedName("DayOfBirth")
	private String dayOfBirth = null;
	
	public PersonOfSignificantControl firstGivenName(String firstGivenName) {
		this.firstGivenName = firstGivenName;
		return this;
	}
	
	public String getFirstGivenName() {
		return firstGivenName;
	}
	
	public void setFirstGivenName(String firstGivenName) {
		this.firstGivenName = firstGivenName;
	}
	
	public PersonOfSignificantControl middleName(String middleName) {
		this.middleName = middleName;
		return this;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public PersonOfSignificantControl firstSurName(String firstSurName) {
		this.firstSurName = firstSurName;
		return this;
	}
	
	public String getFirstSurName() {
		return firstSurName;
	}
	
	public void setFirstSurName(String firstSurName) {
		this.firstSurName = firstSurName;
	}
	
	public PersonOfSignificantControl secondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
		return this;
	}
	
	public String getSecondSurname() {
		return secondSurname;
	}
	
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	
	public PersonOfSignificantControl fullName(String fullName) {
		this.fullName = fullName;
		return this;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public PersonOfSignificantControl businessName(String businessName) {
		this.businessName = businessName;
		return this;
	}
	
	public String getBusinessName() {
		return businessName;
	}
	
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public PersonOfSignificantControl yearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
		return this;
	}
	
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public PersonOfSignificantControl monthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
		return this;
	}
	
	public String getMonthOfBirth() {
		return monthOfBirth;
	}
	
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	
	public PersonOfSignificantControl dayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
		return this;
	}
	
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
}