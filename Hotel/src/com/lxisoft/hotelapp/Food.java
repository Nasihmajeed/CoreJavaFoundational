package com.lxisoft.hotelapp;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
public class Food
{
	
	private String name; //item name
	private int price; //item price

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
}
