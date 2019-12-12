package com.lxisoft.View;
import com.lxisoft.Model.*;
import java.util.Scanner;
public class HotelView 
{		
	static Scanner sc=new Scanner(System.in);
	public HotelModel mhotel=new HotelModel();	
	public int addFood()
	{
		System.out.println("\nWhich type of food you want to add");
		System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n 4.Exit \n 5.Display");
		int item=sc.nextInt();
		return item;
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
}	

 