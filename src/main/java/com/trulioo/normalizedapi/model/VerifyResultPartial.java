package com.trulioo.normalizedapi.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class VerifyResultPartial extends VerifyResult {
	
	@SerializedName("DatasourcesAwaitingResult")
	private List<String> datasourcesAwaitingResult = null;
	
	@SerializedName("Status")
	private String status = null;
	
	public List<String> getDatasourcesAwaitingResult() {
		return datasourcesAwaitingResult;
	}
	
	public void setDatasourcesAwaitingResult(List<String> datasourcesAwaitingResult) {
		this.datasourcesAwaitingResult = datasourcesAwaitingResult;
	}
	
	public VerifyResultPartial datasourcesAwaitingResult(List<String> datasourcesAwaitingResult) {
		this.datasourcesAwaitingResult = datasourcesAwaitingResult;
		return this;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public VerifyResultPartial status(String status) {
		this.status = status;
		return this;
	}
}
