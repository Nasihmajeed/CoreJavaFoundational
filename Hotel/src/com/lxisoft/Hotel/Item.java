package com.lxisoft.Hotel;
import java.util.*;
import java.io.*;

public class Item implements inter
{
	private String itemName;
	private int itemPrice,itemTotAmount=0;
	private int itemQuantity,totalAvailable;
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
		System.out.format("%5d %15s %12d \n",(i+1),itemName,itemPrice);
	}


	public void dispItem()
	{
		System.out.format("%15s %12d %18d \n",itemName,itemPrice,itemQuantity);
	}


	public void printToAdmin(int i)
	{
		System.out.format("%6d %18s %20d %15d\n",(i+1),itemName,itemPrice,totalAvailable);
	}


	public void itemAdd()
	{
		Scanner in = new Scanner(System.in);
		String iName;
		int price,quantity;
		System.out.println(" =:> ENTER THE ITEM NAME");
		iName = in.nextLine();
		System.out.println(" =:> ENTER THE ITEM PRICE");
		price = in.nextInt();
		System.out.println(" =:> ENTER THE ITEM QUANTITY");
		quantity = in.nextInt();
		this.setItem(iName,price,quantity);
		
	}
	public String getItemName()
	{
		return itemName;
	}
	
	public int getItemPrice()
	{
		return itemPrice;
	}
	public int getitemTotAmount()
	{
		return itemTotAmount;
	}
	public int getTotalAvailable()
	{
		return totalAvailable;
	}
	public void setItemName(String name)
	{
		this.itemName=name;
	}
	public void setItemPrice(int price)
	{
		this.itemPrice=price;
	}
	public void setItemQuantity(int quantity)
	{
		this.itemQuantity=quantity;
	}
	public int getItemQuantity()
	{
		return itemQuantity;
	}

}

