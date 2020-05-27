package com.lxisoft.onlineshoping;
public abstract class Detail
{
	private int productID;
	public abstract void buyProduct(Item product,User user);
	public abstract void buyDetails(Item product,User user);
	
}