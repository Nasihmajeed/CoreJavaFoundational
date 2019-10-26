package com.lxisoft.model;
public class Contact
{
	private String contactName;
	private long phno;
	
	public void setName(String name)
	{
		contactName=name;
	}
	public void setNo(long ph)
	{
		phno=ph;
	}
	public String getName()
	{
		return contactName;
	}
	public long getNo()
	{
		return phno;
	}
}