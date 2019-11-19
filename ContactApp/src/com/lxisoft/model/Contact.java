package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.Scanner;
import com.lxisoft.test.*;

public class Contact
{
	private String name,number,id;

	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setNumber(String number)
	{
		this.number= number; 
	}
	public String getNumber()
	{
		return this.number;
	}
	public void setId(String id)
	{
		this.id= id;
	}
	public String getId()
	{
		return this.id;
	}
}
