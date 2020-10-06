package com.lxisoft.Item;

public class Item 
{
private String name;
private int price;
	public void setName(String food)
	{
		this.name=food;
	}
	public String getName()
	{
		return name;
	}
	public void setRate(int rate)
	{	
		this.price=rate;
	}
	public int getRate()
	{
		return price;
	}
}
