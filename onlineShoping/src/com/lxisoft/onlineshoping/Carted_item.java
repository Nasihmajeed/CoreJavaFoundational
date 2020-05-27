package com.lxisoft.onlineshoping;
public class Carted_item
{
	private String name;
	private String product;
	public void setCustomer(String name)
	{
		this.name=name;
	}
	public String getCustomer()
	{
		return this.name;
	}
	public void setCartItem(String product)
	{
		this.product=product;
	}
	public String getCartItem()
	{
		return this.product;
	}
}