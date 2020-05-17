package com.lxisoft.OnlineShoping;
import java.util.*;
public class Item 
{
	private String itemName;
	private String catogey;
	private int productNo;
	private String feature;
	private int price;
	public void setItemName(String proName)
	{
		this.itemName=proName;
	}
	public String getItemName()
	{
		return this.itemName;
	}
	public void setCatogery(String proCatogery)
	{
		this.catogey=proCatogery;
	}
	public String getCatogery()
	{
		return this.catogey;
	}
	public void setFeature(String proFeature)
	{
		this.feature=proFeature;
	}
	public String getFeature()
	{
		return this.feature;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return this.price;
	}
}