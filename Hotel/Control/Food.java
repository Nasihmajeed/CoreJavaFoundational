package com.lxisoft.hotelproject;
import com.lxisoft.hotelproject.*;
import java.util.ArrayList; 
public class Food
{	
	private int id;
	private String foodType;
	private int foodPrice;	
	//private  int foodQuantity;
	Biriyani biriyani;
	Dosa dosa;
	Shake shake;	
	public void setName(String foodType)
	{
		this.foodType=foodType;
	}
	public String getName()
	{
		return this.foodType;
	}
	public void setPrice(int foodPrice)
	{
		this.foodPrice=foodPrice;
	}
	public int getPrice()
	{
		return this.foodPrice;
	}
	// public void setQuantity(int foodQuantity)
	// {
	// 	this.foodQuantity=foodQuantity;
	// }
	// public int getQuantity()
	// {
	// 	return this.foodQuantity;
	// }
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId()
	{
		return this.id;
	}
	/*public String toString()
	{
		String s="ammu";
		return s;
	}
	*/
}
 