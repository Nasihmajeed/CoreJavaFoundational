package com.lxisoft.market;
import com.lxisoft.market.*;
import java.util.ArrayList; 
public class Item
{	
	private int id;
	private String itemType;
	private int itemPrice;	
	private  int itemQuantity;
	Stationary stationary;
	Toy toy;
	Fancy fancy;
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId()
	{
		return this.id;
	}
	public void setName(String itemType)
	{
		this.itemType=itemType;
	}
	public String getName()
	{
		return this.itemType;
	}
	public void setPrice(int itemPrice)
	{
		this.itemPrice=itemPrice;
	}
	public int getPrice()
	{
		return this.itemPrice;
	}
	public void setQuantity(int itemQuantity)
	{
		this.itemQuantity=itemQuantity;
	}
	public int getQuantity()
	{
		return this.itemQuantity;
	}
	
	
}
 