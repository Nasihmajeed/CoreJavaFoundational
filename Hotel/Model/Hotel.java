package com.lxisoft.hotelproject;
import com.lxisoft.hotelproject.*;
import java.util.*;
import java.io.*; 
public class Hotel 
{	
	String hotelName;
	int itemQuantity;
	static Scanner sc=new Scanner(System.in);
	public ArrayList<Food> food;
	public ArrayList<Stock> stock;
	FileRepository fr=new FileRepository();
	public void addFood()
	{
		try
		{
			System.out.println("\nWhich type of food you want to add");
			int d=1;	
			while(d<=5)
			{		
				System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n");
				int item=sc.nextInt();		
				switch(item)
				{
					case 1: addBiriyani(); break;
					case 2: addDosa(); break;
					case 3: addShake(); break;			
					default:				
				}d++;		
				System.out.println("Do you want to continue 1.No 2.Yes");
				int y=sc.nextInt();            			
				if (y==1)
				{
					break;
				}
				else
				{
					continue;
				}			
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error in input value");
		}			
	}	
	public void addBiriyani()
	{
		System.out.println("Which type biriyani you want to add");
		Food biriyani=new Biriyani();
		//System.out.println(biriyani);
		biriyani.setName(sc.next());
		System.out.println("food price");
		biriyani.setPrice(sc.nextInt());	
		System.out.println("Biriyani ID");
		biriyani.setId(sc.nextInt());	
		food.add(biriyani);
		fr.addwriter(food);
		fr.readFile();
				
	}
	public void addDosa()
	{
		System.out.println("Which type dosa you want to add");				
		Food dosa=new Dosa();
		dosa.setName(sc.next());
		System.out.println("food price");
		dosa.setPrice(sc.nextInt());
	 	System.out.println("Dosa ID");
		dosa.setId(sc.nextInt());						
		food.add(dosa);
		fr.addwriter(food);
 		fr.readFile();
	}
	public void addShake()
	{
		System.out.println("Which type shake you want to add");
		Food shake=new Shake();
		shake.setName(sc.next());
		System.out.println("food price");
		shake.setPrice(sc.nextInt());				
		System.out.println("Shake ID");
		shake.setId(sc.nextInt());			
		food.add(shake);
		fr.addwriter(food);
		fr.readFile();
		
	}    
	public void display()
	{
		System.out.println("\nDisplay the details of Food");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Food Type","Food Price");
		for(int i=0;i<food.size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",food.get(i).getId(),food.get(i).getName(),food.get(i).getPrice());
		}
	}	
	
	public void addStock(ArrayList<Food> food)
	{   
		display();
		System.out.println("\nIn which food you want add quantity");		
		String s=sc.next();
		stock=new ArrayList<Stock>();
		for(int j=0;j<food.size();j++)
		{
			if((food.get(j).getName()).equals(s))
		 	{
		 		System.out.println("How much food you want to add");
		 		stock.add(new Stock());
		 		stock.get(j).setQuantity(sc.nextInt());
		 	 	fr.addToStock(stock.get(j),food);
		 		fr.readStock(stock.get(j),food.get(j));
		 	}
		 	
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

 