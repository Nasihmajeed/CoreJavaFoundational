package com.lxisoft.hotelproject;
import com.lxisoft.hotelproject.*;
import java.util.*;
import java.io.*; 
public class HotelView 
{	
	String hotelName;
	int itemQuantity;
	static Scanner sc=new Scanner(System.in);
	public ArrayList<Food> food;
	public ArrayList<Stock> stock;
	FileRepository fr=new FileRepository();
	public void display()
	{
		System.out.println("\nDisplay the details of Food");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Food Type","Food Price");
		for(int i=0;i<food.size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",food.get(i).getId(),food.get(i).getName(),food.get(i).getPrice());
		}
	}		
	
	public void displayStock()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food ID","Food Name","Quantity");
		for(int k=0;k<stock.size();k++)
		{			

			System.out.printf("%-20.30s %-20.30s %-20.30s%n",food.get(k).getId(),food.get(k).getName(),stock.get(k).getQuantity());	
		}	 		      	                                          	
	}
	
	public void printBill()
	{	
		boolean sample=false;	
		do{
			sample=false;
			displayStock();
			System.out.println("\nWhich food you want");
			curentStock();
			System.out.println("Do you want More 1.No 2.Yes");
			int n=sc.nextInt();
			if (n==1)
			{
				break;
			}
			else
			{
				continue;
			}	
		}
		while(sample);		
	}	
	public void curentStock()
	{
		for(int q=0;q<food.size();q++)
		{
			String d=sc.next();
			if((food.get(q).getName()).equals(d))				
			{
				System.out.println("How much food do you want");
				itemQuantity=sc.nextInt();	
                int val=(stock.get(q).getQuantity()-itemQuantity);
                stock.get(q).setQuantity(val);
                System.out.println("Current stock"+(stock.get(q).getQuantity()));				
				if(stock.get(q).getQuantity()>=itemQuantity)
				{
					
					System.out.println("\nAvailable Stocks");
					System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food Type","Food Price","Quantity");
					System.out.printf("%-20.30s %-20.30s %-20.30s%n",food.get(q).getName(),food.get(q).getPrice(),itemQuantity);
					System.out.println("Total Bill Amount="+((food.get(q).getPrice())*(itemQuantity)));
				}			
				else if(stock.get(q).getQuantity()<itemQuantity)
				{	
					System.out.println("- Stock");
					break;
				}					
			}		
		}			
						
	}
}	

 