package com.lxisoft.View;
import com.lxisoft.Model.*;
import java.util.Scanner;
public class HotelView 
{		
	static Scanner sc=new Scanner(System.in);
	public HotelModel hotel=new HotelModel();	
	public int addFood()
	{
		System.out.println("\nWhich type of food you want to add");
		System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n");
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
		hotel.setFoodList(biriyani);
						
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
		hotel.setFoodList(dosa);
		
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
		hotel.setFoodList(shake);
		
	} 
}	

 