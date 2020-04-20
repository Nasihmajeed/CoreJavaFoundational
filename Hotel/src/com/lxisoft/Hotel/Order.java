package com.lxisoft.Hotel;
import com.lxisoft.Hotel.*;


public class Order
{
	public int total=0;
	public Item[] order = new Item[20];
	void setOrder()
	{
		for(int i=0;i<20;i++)
		{
			order[i]=new Item();
		}
	}
	
	
	public void setTotal(int index)
	{
		this.total=0;
		for(int i=0;i<index;i++)
		{
			order[i].setItemPrice();
			this.total=this.total+(order[i].itemTotAmount);
		}
	}
	
	public void printOrderDetails(int index)
	{
		
		System.out.println("---------------------Bill---------------------");
		System.out.println("\tItem Name \t Price\t\t Quantity");
		System.out.println("----------------------------------------------");
		for(int i=0;i<index;i++)
		{
			
			order[i].dispItem();
		}
		System.out.println("----------------------------------------------");
		System.out.println("TOTAL = "+this.total);
	}
	
	
}
