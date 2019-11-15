package com.lxisoft.domain;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import java.util.*;
public class Contact
{
	private String id;
	private String name;
	private String contactNo;

	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
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
	public void setContactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	public String getContactNo()
	{
		return contactNo;
	}
}