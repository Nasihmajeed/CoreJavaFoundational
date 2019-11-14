package com.lxisoft.domain;
import com.lxisoft.contactcontroller.*;
public class Contact
{
	private String contactId;
	private String contactName;
	private String contactNumber;
	public void setContactId(String contactId)
	{
		this.contactId=contactId;
	}
	public String getContactId()
	{
		return contactId;
	}
	public void setContactName(String contactName)
	{
		this.contactName=contactName;
	}
	public String getContactName()
	{
		return contactName;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber=contactNumber;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
}