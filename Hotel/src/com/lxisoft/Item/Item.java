package com.lxisoft.Item ;

import java.util.* ;

public class Item
{

	private String itemName ;
	private int itemPrice,itemNo,stock ;	

	public String getItemName()
	{
		return itemName ;
	}

	public void setItemName(String name)
	{
		itemName = name ;
	}

	public int getItemPrice()
	{
		return itemPrice ;
	}

	public void setItemPrice(int price)
	{
		itemPrice = price ;
	}

	public int getItemNo()
	{
		return itemNo ;
	}

	public void setItemNo(int no)
	{
		itemNo = no ;
	}

	public int getItemStock()
	{
		return stock ;
	}

	public void setItemStock(int st)
	{
		stock = st ;
	}

	public void setWholeItem(int itNo,String itName,int itPrice,int itStock)
	{
		setItemNo(itNo) ;
		setItemName(itName) ;
		setItemPrice(itPrice) ;
		setItemStock(itStock) ;
	}
}