package com.lxisoft.OnlineShoping;
public abstract class Detail
{
	int productID;
	public abstract void buyProduct(Item product,User user);
	public abstract void buyDetails(Item product,User user);
	
}