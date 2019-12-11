package com.lxisoft.hotelproject;
import com.lxisoft.hotelproject.*;
import java.util.*;
import java.io.*; 
public class Stock
{		
	Food food;	
	private  int foodQuantity;
	static Scanner sc=new Scanner(System.in);
	public void setQuantity(int foodQuantity)
	{
		this.foodQuantity=foodQuantity;
	}
	public int getQuantity()
	{
		return this.foodQuantity;
	}
	
}	