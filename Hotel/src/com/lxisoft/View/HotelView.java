package com.lxisoft.View;
import java.util.Scanner;
public class HotelView 
{		
	static Scanner sc=new Scanner(System.in);
	public int addFood()
	{
		System.out.println("\nWhich type of food you want to add");
		System.out.println("\n 1.Biriyani \n 2.Dosa \n 3.Shake \n");
		int item=sc.nextInt();
		addBiriyani();
		return item;
	}	
	public void addBiriyani()
	{
		System.out.println("Which type biriyani you want to add");
		Food biriyani=new Biriyani();
		biriyani.setName(sc.next());
		System.out.println("food price");
		biriyani.setPrice(sc.nextInt());	
		System.out.println("Biriyani ID");
		biriyani.setId(sc.nextInt());	
		foodList.add(biriyani);
						
	}
	
}	

 