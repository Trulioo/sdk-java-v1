package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

public class TestEntityDataFields extends DataFields {
	@SerializedName("TestEntityName")
	private String testEntityName = null;
	
	public TestEntityDataFields testEntityName(String testEntityName) {
		this.testEntityName = testEntityName;
		return this;
	}
	
	public String getTestEntityName(String testEntityName) {
		return testEntityName;
	}
	
	public void setTestEntityName(String testEntityName) {
		this.testEntityName = testEntityName;
	}
}
