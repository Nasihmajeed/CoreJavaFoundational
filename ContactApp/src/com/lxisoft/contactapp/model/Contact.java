package com.lxisoft.contactapp.model;
public class Contact
{
	private String contactName;
	private String phno;
	
	public void setName(String name)
	{
		contactName=name;
	}
	public void setNo(String ph)
	{
		phno=ph;
	}
	public String getName()
	{
		return contactName;
	}
	public String getNo()
	{
		return phno;
	}
}