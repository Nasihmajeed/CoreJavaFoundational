package com.lxisoft.onlineshoping;
import java.util.Objects;

public class Carted_item
{
	private int id;
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
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public boolean equals(Object obj)
	{
		if((((Carted_item)obj).name==this.name) && (((Carted_item)obj).product==this.product))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int hashCode() 
    { 
		return Objects.hash(id);
	}
}