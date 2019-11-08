package com.lxisoft.contactmodel;
import com.lxisoft.contactcontroller.*;
public class Contact
{
	private String contactName;
	private String contactNumber;
	
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