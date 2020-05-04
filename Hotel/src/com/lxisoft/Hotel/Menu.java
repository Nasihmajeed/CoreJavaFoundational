package com.lxisoft.Hotel;
import com.lxisoft.Hotel.*;
import com.lxisoft.File.*;
import java.io.*;

import java.util.*;
public class Menu
{
	Drinks dr = new Drinks();
	public ItemFileManager file = new ItemFileManager();
	public Item[] item;
	private int iNum=-1,index=0;
	private int ind;
	public Order ord = new Order();
	public void setFood()
	{
		
		item = new Item[20];
		for(int i=0;i<20;i++)
		{
			item[i] = new Item();
			
		}	
		ind=file.readFromFile(item,ind);
	}
	

	public void printMenu()
	{
		System.out.println("-----------------------------------------------------------------------"); 
		System.out.println("\t\t \t Menu \t");
		System.out.println("-----------------------------------------------------------------------");                                      
		System.out.println("ITEM NUMBER \t ITEM NAME \t       PRICE(Rs)         QUANTITY LEFT");
		System.out.println("-----------------------------------------------------------------------");
		for(int i=0;this.item[i].getItemName()!=null;i++)
		{
		item[i].printToAdmin(i);
		}
		System.out.println("-----------------------------------------------------------------------\n-----------------------------------------------------------------------");
		
	}
	
	public void ordering(int ind)
	{
		String ch;
		this.index=0;
		this.ord.setOrder();
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println(" =:> Select your Dish(Please enter the Item Number And press 0 to Submit) -> \n\t");
			try
			{
				iNum=in.nextInt();

			}
			catch(Exception e)
			{
				in.nextLine();
				System.err.println("Please Enter an item NUmber");
				iNum=-10;


			}
			if(iNum<=(ind) && iNum >0)
			{
				this.selectOrder((iNum-1));			
			}
			else if(iNum==0)
			{
				System.out.println(" =:> Do you Placed your orders Completely (yes/no)");
				in.nextLine();
				ch=in.nextLine();
				if(ch.equals("yes"))
				{
					System.out.println("\n\t THANK YOU : ORDER PLACED \t");
					file.updateFile(item,ind);
				}
				else
				{
					iNum=1;
				}
			}
			else if(iNum==-10)
			{
				System.out.println("Sorry Retry");
			}
			else
			{
				System.out.println("\n ****INVALID ITEM NUMBER*******\n");
				iNum=1;
			}
			
		}while(iNum!=0);
		ord.setTotal(index);
		ord.printOrderDetails(index);
	}	


	public void selectOrder(int itemNumber)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quantity Required\n\t");
		int q= in.nextInt();
		this.ord.order[index].setItemQuantity(q);
		int ch = item[itemNumber].checkQuantity(this.ord.order[index].getItemQuantity());
		if(ch==1)
		{
			this.ord.order[index].setItemName(this.item[itemNumber].getItemName());
			this.ord.order[index].setItemPrice(this.item[itemNumber].getItemPrice());
			index++;
		}
		
	}
	public void setIndex(int index)
	{
		ind = index;
	}
	public int getIndex()
	{
		return ind;
	}
	public void swapItem(int iNum)
	{
		int r=1111;
		for(int j=(iNum-1);(item[j].getItemName())!=null;j++)
		{
			item[j].setItemName(item[j+1].getItemName());
			item[j].setItemPrice(item[j+1].getItemPrice());
			item[j].setItemQuantity(item[j+1].getItemQuantity());
			System.out.println(item[j+1].getItemQuantity());
			r=j;
		}
		item[r+1].setItemName(null);
		
	}

	
}