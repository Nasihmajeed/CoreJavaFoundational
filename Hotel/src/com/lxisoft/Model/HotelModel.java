package com.lxisoft.Model;
public class HotelModel 
{	
	private String hotelName;
	private int itemQuantity;
	private ArrayList<Food> foodList;
	private ArrayList<Stock> stockList;
	public void setItemQuantity(int itemQuantity)
	{
		this.itemQuantity=itemQuantity;
	}
	public int getItemQuantity()
	{
		return this.itemQuantity;
	}
	public void setHotelName(String hotelName)
	{
		this.hotelName=hotelName;
	}
	public String getHotelName()
	{
		return this.hotelName;
	}
	public void setFoodList(ArrayList<Food> foodList)
	{
		this.foodList=foodList;
	}
	public ArrayList<Food> getFoodList()
	{
		return this.foodList;
	}
	public void setStockList(ArrayList<Stock> stockList)
	{
		this.stockList=stockList;
	}
	public ArrayList<Stock> getStockList()
	{
		return this.stockList;
	}
}	

 