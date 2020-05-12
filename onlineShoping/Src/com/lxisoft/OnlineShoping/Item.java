package com.lxisoft.OnlineShoping;
public class Item 
{
	String itemName;
	String catogey;
	int price;
	int productNo;
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
	public String setCatogery()
	{
		return this.catogey;
	}
}