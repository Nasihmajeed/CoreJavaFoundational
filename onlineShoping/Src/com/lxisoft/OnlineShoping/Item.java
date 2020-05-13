package com.lxisoft.OnlineShoping;
import java.util.*;
public class Item 
{
	String itemName;
	String catogey;
	int price;
	int productNo;
	String feature;
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
}