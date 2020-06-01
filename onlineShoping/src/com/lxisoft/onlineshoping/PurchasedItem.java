package com.lxisoft.onlineshoping;
public class PurchasedItem
{
	private String name;
	private String product;
	private String catogery;
	private String feature;
	private int price;
	private int itemNumber;
	public void setCustomer(String name)
	{
		this.name=name;
	}
	public String getCustomer()
	{
		return this.name;
	}
	public void setPurchasedItem(String product)
	{
		this.product=product;
	}
	public String getPurchasedItem()
	{
		return this.product;
	}
	public void setCatogery(String catogery)
	{
		this.catogery=catogery;
	}
	public String getCatogery()
	{
		return this.catogery;
	}
	public void setFeature(String feature)
	{
		this.feature=feature;
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
	public void setItemNumber(int itemNumber)
	{
		this.itemNumber=itemNumber;
	}
	public int getItemNumber()
	{
		return this.itemNumber;
	}
}