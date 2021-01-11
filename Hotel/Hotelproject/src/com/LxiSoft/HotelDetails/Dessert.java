package com.LxiSoft.HotelDetails;
// import java.util.*;

public class Dessert implements Food
{
    String foodName;
	  String foodType;
    int price;
    
    public void setName(String food)
    {
		this.foodName = food;
    }
    
    public String getName()
    {
		return foodName;
	}
	
    public void setPrice(int price)
    {
		this.price = price;
    }
    
    public int getPrice()
    {
		return price;
	}
}
