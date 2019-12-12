package com.lxisoft.Model;
import com.lxisoft.Model.*;
import java.util.*;
public class HotelModel 
{	
	private String hotelName;
	private int itemQuantity;
	private ArrayList<FoodModel> foodList=new ArrayList<FoodModel>();
	//private ArrayList<StockModel> stockList;
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
	public void setFoodList(FoodModel food)
	{
		this.foodList.add(food);
	}
	public ArrayList<FoodModel> getFoodList()
	{
		return this.foodList;
	}
	/*public void setStockList(ArrayList<Stock> stockList)
	{
		this.stockList=stockList;
	}
	public ArrayList<Stock> getStockList()
	{
		return this.stockList;
	}*/
}	

 