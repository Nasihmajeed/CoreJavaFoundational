package com.lxisoft.OnlineShoping;
public class Item extends Product
{
	String name;
	String catogey;
	int price;
	int productNo;
	public void setName(String proName)
	{
		this.name=proName;
	}
	public String getName()
	{
		return this.name;
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