package com.lxisoft.contactApp.domain;
public class Contact 
{
	private String name;
	private long number;
	private int id;

	public Contact(int id,String name,long number)
	{
		this.id=id;
		this.name=name;
		this.number=number;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setNumber(long number)
	{
		this.number=number;
	}
	public long getNumber()
	{
		return number;
	}

}