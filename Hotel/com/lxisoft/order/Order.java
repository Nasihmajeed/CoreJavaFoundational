package com.lxisoft.order;
public class Order
{
	int orderId;
	String itemName;
	public void	setOrderId(int id)
	{
		this.orderId = id;
	}
	public int getOrderId()
	{
		return orderId;
	}
	public void	setItemName(String str)
	{
		this.itemName = str;
	}
	public String getItemName()
	{
		return itemName;
	}
	
}