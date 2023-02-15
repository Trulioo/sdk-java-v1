package com.trulioo.normalizedapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 */
public class Document {
  @SerializedName("DocumentFrontImage")
  private byte[] documentFrontImage = null;

  @SerializedName("DocumentBackImage")
  private byte[] documentBackImage = null;

  @SerializedName("LivePhoto")
  private byte[] livePhoto = null;

  @SerializedName("DocumentType")
  private String documentType = null;

  @SerializedName("AcceptIncompleteDocument")
  private Boolean acceptIncompleteDocument = null;

  @SerializedName("ValidateDocumentImageQuality")
  private Boolean validateDocumentImageQuality = null;

  public Document documentFrontImage(byte[] documentFrontImage) {
    this.documentFrontImage = documentFrontImage;
    return this;
  }

   /**
   * Front of the document
   * @return documentFrontImage
  **/
  public byte[] getDocumentFrontImage() {
    return documentFrontImage;
  }

  public void setDocumentFrontImage(byte[] documentFrontImage) {
    this.documentFrontImage = documentFrontImage;
  }

  public Document documentBackImage(byte[] documentBackImage) {
    this.documentBackImage = documentBackImage;
    return this;
  }

   /**
   * Back of the document
   * @return documentBackImage
  **/
  public byte[] getDocumentBackImage() {
    return documentBackImage;
  }

  public void setDocumentBackImage(byte[] documentBackImage) {
    this.documentBackImage = documentBackImage;
  }

  public Document livePhoto(byte[] livePhoto) {
    this.livePhoto = livePhoto;
    return this;
  }

   /**
   * Selfie image
   * @return livePhoto
  **/
  public byte[] getLivePhoto() {
    return livePhoto;
  }

  public void setLivePhoto(byte[] livePhoto) {
    this.livePhoto = livePhoto;
  }

  public Document documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Document type
   * @return documentType
  **/
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Document acceptIncompleteDocument(Boolean acceptIncompleteDocument) {
    this.acceptIncompleteDocument = acceptIncompleteDocument;
    return this;
  }

   /**
   * Accept Incomplete Document
   * @return acceptIncompleteDocument
  **/
  public Boolean getAcceptIncompleteDocument() {
    return acceptIncompleteDocument;
  }

  public void setAcceptIncompleteDocument(Boolean acceptIncompleteDocument) {
    this.acceptIncompleteDocument = acceptIncompleteDocument;
  }

  public Document validateDocumentImageQuality(Boolean validateDocumentImageQuality) {
    this.validateDocumentImageQuality = validateDocumentImageQuality;
    return this;
  }

   /**
   * Validate Document Image Quality
   * @return validateDocumentImageQuality
  **/
  public Boolean getValidateDocumentImageQuality() {
    return validateDocumentImageQuality;
  }

  public void setValidateDocumentImageQuality(Boolean validateDocumentImageQuality) {
    this.validateDocumentImageQuality = validateDocumentImageQuality;
  }

}

