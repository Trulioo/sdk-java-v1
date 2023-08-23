package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * RecordRule used for the transaction.
 */
public class RecordRule {
  @SerializedName("RuleName")
  private String ruleName = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("SecondaryRuleName")
  private String secondaryRuleName = null;

  @SerializedName("SecondaryRuleNote")
  private String secondaryRuleNote = null;

  public RecordRule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of RecordRule.
   * @return ruleName
  **/
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public RecordRule note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Rule Description.
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getSecondaryRuleName() {
    return secondaryRuleName;
  }

  public void setSecondaryRuleName(String secondaryRuleName) {
    this.secondaryRuleName = secondaryRuleName;
  }

  public RecordRule secondaryRuleName(String secondaryRuleName) {
    this.secondaryRuleName = secondaryRuleName;
    return this;
  }

  public String getSecondaryRuleNote() {
    return secondaryRuleNote;
  }

  public void setSecondaryRuleNote(String secondaryRuleNote) {
    this.secondaryRuleNote = secondaryRuleNote;
  }

  public RecordRule secondaryRuleNote(String secondaryRuleNote) {
    this.secondaryRuleNote = secondaryRuleNote;
    return this;
  }
}