/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices;

/**
 * The type Message.
*/
public class Message extends Item {
	private String Subject;

	/**
	* Gets the Subject.
	*
	* @return the String
	*/
	public String getSubject() {
		return this.Subject; 
	}

	/**
	* Sets the Subject.
	*
	* @param value the String
	*/
	public void setSubject(String value) { 
		Subject = value; 
	}
	private ItemBody Body;

	/**
	* Gets the Body.
	*
	* @return the ItemBody
	*/
	public ItemBody getBody() {
		return this.Body; 
	}

	/**
	* Sets the Body.
	*
	* @param value the ItemBody
	*/
	public void setBody(ItemBody value) { 
		Body = value; 
	}
	private String BodyPreview;

	/**
	* Gets the Body Preview.
	*
	* @return the String
	*/
	public String getBodyPreview() {
		return this.BodyPreview; 
	}

	/**
	* Sets the Body Preview.
	*
	* @param value the String
	*/
	public void setBodyPreview(String value) { 
		BodyPreview = value; 
	}
	private Importance Importance;

	/**
	* Gets the Importance.
	*
	* @return the Importance
	*/
	public Importance getImportance() {
		return this.Importance; 
	}

	/**
	* Sets the Importance.
	*
	* @param value the Importance
	*/
	public void setImportance(Importance value) { 
		Importance = value; 
	}
	private Boolean HasAttachments;

	/**
	* Gets the Has Attachments.
	*
	* @return the Boolean
	*/
	public Boolean getHasAttachments() {
		return this.HasAttachments; 
	}

	/**
	* Sets the Has Attachments.
	*
	* @param value the Boolean
	*/
	public void setHasAttachments(Boolean value) { 
		HasAttachments = value; 
	}
	private String ParentFolderId;

	/**
	* Gets the Parent Folder Id.
	*
	* @return the String
	*/
	public String getParentFolderId() {
		return this.ParentFolderId; 
	}

	/**
	* Sets the Parent Folder Id.
	*
	* @param value the String
	*/
	public void setParentFolderId(String value) { 
		ParentFolderId = value; 
	}
	private Recipient From;

	/**
	* Gets the From.
	*
	* @return the Recipient
	*/
	public Recipient getFrom() {
		return this.From; 
	}

	/**
	* Sets the From.
	*
	* @param value the Recipient
	*/
	public void setFrom(Recipient value) { 
		From = value; 
	}
	private Recipient Sender;

	/**
	* Gets the Sender.
	*
	* @return the Recipient
	*/
	public Recipient getSender() {
		return this.Sender; 
	}

	/**
	* Sets the Sender.
	*
	* @param value the Recipient
	*/
	public void setSender(Recipient value) { 
		Sender = value; 
	}
	private java.util.List<Recipient> ToRecipients;

	/**
	* Gets the To Recipients.
	*
	* @return the java.util.List<Recipient>
	*/
	public java.util.List<Recipient> getToRecipients() {
		return this.ToRecipients; 
	}

	/**
	* Sets the To Recipients.
	*
	* @param value the java.util.List<Recipient>
	*/
	public void setToRecipients(java.util.List<Recipient> value) { 
		ToRecipients = value; 
	}
	private java.util.List<Recipient> CcRecipients;

	/**
	* Gets the Cc Recipients.
	*
	* @return the java.util.List<Recipient>
	*/
	public java.util.List<Recipient> getCcRecipients() {
		return this.CcRecipients; 
	}

	/**
	* Sets the Cc Recipients.
	*
	* @param value the java.util.List<Recipient>
	*/
	public void setCcRecipients(java.util.List<Recipient> value) { 
		CcRecipients = value; 
	}
	private java.util.List<Recipient> BccRecipients;

	/**
	* Gets the Bcc Recipients.
	*
	* @return the java.util.List<Recipient>
	*/
	public java.util.List<Recipient> getBccRecipients() {
		return this.BccRecipients; 
	}

	/**
	* Sets the Bcc Recipients.
	*
	* @param value the java.util.List<Recipient>
	*/
	public void setBccRecipients(java.util.List<Recipient> value) { 
		BccRecipients = value; 
	}
	private java.util.List<Recipient> ReplyTo;

	/**
	* Gets the Reply To.
	*
	* @return the java.util.List<Recipient>
	*/
	public java.util.List<Recipient> getReplyTo() {
		return this.ReplyTo; 
	}

	/**
	* Sets the Reply To.
	*
	* @param value the java.util.List<Recipient>
	*/
	public void setReplyTo(java.util.List<Recipient> value) { 
		ReplyTo = value; 
	}
	private String ConversationId;

	/**
	* Gets the Conversation Id.
	*
	* @return the String
	*/
	public String getConversationId() {
		return this.ConversationId; 
	}

	/**
	* Sets the Conversation Id.
	*
	* @param value the String
	*/
	public void setConversationId(String value) { 
		ConversationId = value; 
	}
	private ItemBody UniqueBody;

	/**
	* Gets the Unique Body.
	*
	* @return the ItemBody
	*/
	public ItemBody getUniqueBody() {
		return this.UniqueBody; 
	}

	/**
	* Sets the Unique Body.
	*
	* @param value the ItemBody
	*/
	public void setUniqueBody(ItemBody value) { 
		UniqueBody = value; 
	}
	private java.util.Calendar DateTimeReceived;

	/**
	* Gets the Date Time Received.
	*
	* @return the java.util.Calendar
	*/
	public java.util.Calendar getDateTimeReceived() {
		return this.DateTimeReceived; 
	}

	/**
	* Sets the Date Time Received.
	*
	* @param value the java.util.Calendar
	*/
	public void setDateTimeReceived(java.util.Calendar value) { 
		DateTimeReceived = value; 
	}
	private java.util.Calendar DateTimeSent;

	/**
	* Gets the Date Time Sent.
	*
	* @return the java.util.Calendar
	*/
	public java.util.Calendar getDateTimeSent() {
		return this.DateTimeSent; 
	}

	/**
	* Sets the Date Time Sent.
	*
	* @param value the java.util.Calendar
	*/
	public void setDateTimeSent(java.util.Calendar value) { 
		DateTimeSent = value; 
	}
	private Boolean IsDeliveryReceiptRequested;

	/**
	* Gets the Is Delivery Receipt Requested.
	*
	* @return the Boolean
	*/
	public Boolean getIsDeliveryReceiptRequested() {
		return this.IsDeliveryReceiptRequested; 
	}

	/**
	* Sets the Is Delivery Receipt Requested.
	*
	* @param value the Boolean
	*/
	public void setIsDeliveryReceiptRequested(Boolean value) { 
		IsDeliveryReceiptRequested = value; 
	}
	private Boolean IsReadReceiptRequested;

	/**
	* Gets the Is Read Receipt Requested.
	*
	* @return the Boolean
	*/
	public Boolean getIsReadReceiptRequested() {
		return this.IsReadReceiptRequested; 
	}

	/**
	* Sets the Is Read Receipt Requested.
	*
	* @param value the Boolean
	*/
	public void setIsReadReceiptRequested(Boolean value) { 
		IsReadReceiptRequested = value; 
	}
	private Boolean IsDraft;

	/**
	* Gets the Is Draft.
	*
	* @return the Boolean
	*/
	public Boolean getIsDraft() {
		return this.IsDraft; 
	}

	/**
	* Sets the Is Draft.
	*
	* @param value the Boolean
	*/
	public void setIsDraft(Boolean value) { 
		IsDraft = value; 
	}
	private Boolean IsRead;

	/**
	* Gets the Is Read.
	*
	* @return the Boolean
	*/
	public Boolean getIsRead() {
		return this.IsRead; 
	}

	/**
	* Sets the Is Read.
	*
	* @param value the Boolean
	*/
	public void setIsRead(Boolean value) { 
		IsRead = value; 
	}
}