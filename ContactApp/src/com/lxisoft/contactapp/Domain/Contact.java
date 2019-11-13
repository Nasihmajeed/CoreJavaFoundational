package com.lxisoft.contactapp.Domain;
public class Contact
{
	private String id;
	private String name;
	private String phno;
	
	public void setId(String id)
	{
		this.id=id;
	}
	public void setName(String name)
	{ 
		this.name=name;
	}
	public void setNo(String phno)
	{
		this.phno=phno;
	}
	public String getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getNo()
	{
		return this.phno;
	}
}