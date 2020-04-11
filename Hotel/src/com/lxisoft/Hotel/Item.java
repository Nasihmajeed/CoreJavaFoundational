package com.lxisoft.Hotel;

public class Item implements inter
{
	public String itemName;
	public int itemPrice,itemTotAmount=0;
	public int itemQuantity,totalAvailable;
	public void setItem(String iName,int iPrice,int totalAva)
	{
		this.itemName=iName;
		this.itemPrice=iPrice;
		this.totalAvailable=totalAva;
	}
	public void setItemPrice()
	{
		this.itemTotAmount=(this.itemPrice * this.itemQuantity);
	}
	public int checkQuantity(int quantity)
	{
		int avail;
		avail=this.totalAvailable;
		this.totalAvailable=this.totalAvailable-quantity;
		if(this.totalAvailable<0)
		{
			System.out.println("Sorry only : " + avail +" : Left");
			this.totalAvailable=avail;
			return 0;
		}
		else
			return 1;
	}
	public void dispItem(int i)
	{
		System.out.println("  "+(i+1)+"\t\t"+itemName +" \t --->    " +itemPrice);
	}
	public void dispItem()
	{
		System.out.println(itemName +" \t --->    "+ itemPrice+ "\t           " +itemQuantity);
	}
	public void printToAdmin(int i)
	{
		System.out.println("  "+(i+1)+"\t\t"+itemName +" \t --->    " +itemPrice+" \t --->     "+ totalAvailable);
	}
}

