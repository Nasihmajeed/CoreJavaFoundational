package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.Scanner;

public class Contact
{
	private String name,number;

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
}