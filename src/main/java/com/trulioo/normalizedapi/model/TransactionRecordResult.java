package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class TransactionRecordResult extends VerifyResult {
	  @SerializedName("InputFields")
	  private List<DataField> inputFields = null;

	  public TransactionRecordResult inputFields(List<DataField> inputFields) {
	    this.inputFields = inputFields;
	    return this;
	  }

	  public TransactionRecordResult addInputFieldsItem(DataField inputFieldsItem) {
	    if (this.inputFields == null) {
	      this.inputFields = new ArrayList<DataField>();
	    }
	    this.inputFields.add(inputFieldsItem);
	    return this;
	  }

	   /**
	   * 
	   * @return inputFields
	  **/
	  public List<DataField> getInputFields() {
	    return inputFields;
	  }

	  public void setInputFields(List<DataField> inputFields) {
	    this.inputFields = inputFields;
	  }
	}