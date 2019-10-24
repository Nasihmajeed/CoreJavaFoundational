package com.lxisoft.contactmodel;
import com.lxisoft.contactcontroller.*;
public class Contact
{
	private int contactId;
	private String contactName;
	private long contactNumber;
	public void setContactId(int contactId)
	{
		this.contactId=contactId;	
	}
	public int getContactId()
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
	public void setContactNumber(long contactNumber)
	{
		this.contactNumber=contactNumber;
	}
	public long getContactNumber()
	{
		return contactNumber;
	}


}