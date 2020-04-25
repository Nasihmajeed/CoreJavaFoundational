package com.lxisoft.Hotel;
import com.lxisoft.Hotel.*;
import com.lxisoft.File.*;
import java.io.*;

import java.util.*;
public class Menu
{
	Drinks dr = new Drinks();
	public FileManager file = new FileManager();
	public Item[] item;
	public int iNum=-1,index=0;
	public int ind;
	//int i;
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
		for(int i=0;this.item[i].itemName!=null;i++)
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
		//System.out.println("ind = "+ind);
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
				// ordering(ind);
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
		this.ord.order[index].itemQuantity = in.nextInt();
		int ch = item[itemNumber].checkQuantity(this.ord.order[index].itemQuantity);
		if(ch==1)
		{
			this.ord.order[index].itemName=this.item[itemNumber].itemName;
			this.ord.order[index].itemPrice=this.item[itemNumber].itemPrice;
			index++;
		}
		
	}

	
}