package com.lxisoft.models;
import com.lxisoft.controllers.*;
public class Contact
{
	private String name;
	private String contactNo;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setContactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	public String getContactNo()
	{
		return contactNo;
	}
}