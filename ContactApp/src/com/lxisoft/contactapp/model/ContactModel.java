package com.lxisoft.contactapp.model;
public class ContactModel
{
	private String name;
	private String id;
	public void setId(String id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public String getId()
	{
		return this.id;
	}
}