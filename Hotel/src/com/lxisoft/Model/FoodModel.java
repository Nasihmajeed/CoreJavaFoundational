package com.lxisoft.Model;
public class FoodModel 
{	
	private int id;
	private String foodType;
	private int foodPrice;
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId()
	{
		return this.id;
	}	
	public void setFoodName(String foodType)
	{
		this.foodType=foodType;
	}
	public String getFoodName()
	{
		return this.foodType;
	}
	public void setFoodPrice(int foodPrice)
	{
		this.foodPrice=foodPrice;
	}
	public int getFoodPrice()
	{
		return this.foodPrice;
	}
	
	
}
 