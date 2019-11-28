package com.lxisoft.hotel;
public class FoodItem
{
	private String name;
	private int price;

	public void setName(String foodName)
	{
		this.name = foodName;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int foodPrice)
	{
		this.price = foodPrice;
	}
	public int getPrice()
	{
		return price;
	}
}