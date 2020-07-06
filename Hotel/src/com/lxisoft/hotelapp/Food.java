package com.lxisoft.hotelapp;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
public class Food
{
	
	private String name;
	private int price;
	private String code;
	Food food=new Food();
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}


	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}



	public void setCode(String code)
	{
		this.code=code;
	}
	public String getCode()
	{
		return code;
	}

	
}