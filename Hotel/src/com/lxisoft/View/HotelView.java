package com.lxisoft.View;
import com.lxisoft.Model.*;
import java.util.Scanner;
public class HotelView 
{		
	static Scanner sc=new Scanner(System.in);
	public HotelModel mhotel=new HotelModel();	
	public int menu()
	{
		System.out.println("\n\tMENU  \n1.Add Food \n2.Add Stock \n3.Display Food \n4.Display Stock \n5.Print Bill \n6.Exit \n ");
		int menu=sc.nextInt();	
		return menu;
	}		
	public void addFood()
	{		
		int d=1;	
		while(d<=5)
		{	
			System.out.println("\nWhich type of food you want to add");
	 		System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n 4.Exit ");
			int item=sc.nextInt();
			switch(item)
			{
		 		case 1: addBiriyani(); break;
				case 2: addDosa(); break;
				case 3: addShake(); break;	
				case 4: System.exit(0); break;
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
	public void addBiriyani()
	{
		System.out.println("Which type biriyani you want to add");
		FoodModel biriyani=new Biriyani();
		biriyani.setFoodType(sc.next());
		System.out.println("food price");
		biriyani.setFoodPrice(sc.nextInt());	
		System.out.println("Biriyani ID");
		biriyani.setId(sc.nextInt());
		mhotel.setFoodList(biriyani);
						
	}
	public void addDosa()
	{
		System.out.println("Which type dosa you want to add");				
		FoodModel dosa=new Dosa();
		dosa.setFoodType(sc.next());
		System.out.println("food price");
		dosa.setFoodPrice(sc.nextInt());
	 	System.out.println("Dosa ID");
		dosa.setId(sc.nextInt());						
		mhotel.setFoodList(dosa);
		
	}
	public void addShake()
	{
		System.out.println("Which type shake you want to add");
		FoodModel shake=new Shake();
		shake.setFoodType(sc.next());
		System.out.println("food price");
		shake.setFoodPrice(sc.nextInt());				
		System.out.println("Shake ID");
		shake.setId(sc.nextInt());			
		mhotel.setFoodList(shake);
		
	} 
	public void displayFood()
	{
		System.out.println("\nDisplay the details of Food");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Food Type","Food Price");
		for(int i=0;i<mhotel.getFoodList().size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(i).getId(),mhotel.getFoodList().get(i).getFoodType(),mhotel.getFoodList().get(i).getFoodPrice());
		}
		
	}
	public void addStock()
	{   
		displayFood();
		System.out.println("\nIn which food you want add quantity");		
		String s=sc.next();
		StockModel stock=new StockModel();
		mhotel.getStockList();
		for(int j=0;j<mhotel.getFoodList().size();j++)
		{
			 if((mhotel.getFoodList().get(j).getFoodType()).equals(s))
		 	{
		 		System.out.println("How much food you want to add");
		 		mhotel.setStockList(stock);		
		 		stock.setQuantity(sc.nextInt());
		 	}		 	
		}
	}


	public void displayStock()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Food ID","Food Name","Quantity");
		for(int k=0;k<mhotel.getStockList().size();k++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",mhotel.getFoodList().get(k).getId(),mhotel.getFoodList().get(k).getFoodType(),mhotel.getStockList().get(k).getQuantity());
		}	 		      	                                          	
	}
}	

 