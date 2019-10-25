package com.lxisoft.contactmodel;
import com.lxisoft.contactcontroller.*;
public class Contact
{
	private String contactName;
	private long contactNumber;
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