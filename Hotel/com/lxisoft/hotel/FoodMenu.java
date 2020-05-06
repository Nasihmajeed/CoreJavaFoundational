package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class FoodMenu
{

	
	static Scanner sc = new Scanner(System.in);
	public Food[] foodStore = new Food[25];
	int count;

	public void addFood()
	{
		
		System.out.println("\tEnter How many food do you want to add:");
		System.out.print("\t");count  = sc.nextInt();
		count = count + 3;
		for(int i=3;i<count;i++)
		{
			foodStore[i] = new Food();
			foodStore[i].createFood();
		}

	}

	public void createMenu()
	{
		foodStore[0] = new Food();
		foodStore[0].foodName = "pups";
	 	foodStore[0].foodRate = 120;
		foodStore[0].foodQuantity = 25 ;
		foodStore[1] = new Food();
		foodStore[1].foodName = "Beef";
		foodStore[1].foodRate = 60 ;
		foodStore[1].foodQuantity = 30 ;
		foodStore[2] = new Food();
		foodStore[2].foodName = "Snacks";
		foodStore[2].foodRate = 15;
		foodStore[2].foodQuantity = 50;
		

	}


	public void editFood()
	{
		boolean flag = false;
		if(foodStore[0]==null)
		{
		flag = true;	
		System.out.println("\tStore Empty !!!please contact hotel manager to add Food to the store......");
		}
		if(flag!=true)
		{
			displayFoodMenu();

			System.out.print("\tEnter Id Food To be edited");
			System.out.println("\t");int id = sc.nextInt();
			if(id<foodStore.length)
			{
			foodStore[id].createFood();	
			System.out.println("\tEdited Successfully");
			}
			else if(id >foodStore.length)
			{
			System.out.println("\tEnter valid id");
			}
		}
		
		
		
	}

	public void deleteFood()
	{
		displayFoodMenu();

		boolean flag = false;
		if(foodStore[0]==null)
		{
		flag = true;	
		System.out.println("\tStore Empty !!!");
		}
		if(flag!=true)
		{
		
		System.out.print("\n\tEnter Id Food To be Deleted");
		System.out.println("\t");int id = sc.nextInt();
		foodStore[id] = null;
		System.out.println("\tSuccessfully Removed item from the list...");
		}	
	}


	public void displayFoodMenu()
	{	
		
			
			System.out.println("\tID\tNAME\tQTY\tRATE");
			System.out.println("\t___________________________________");
			for(int i=0;i<foodStore.length;i++)
			{
				if(foodStore[i] != null)
				{
				System.out.print("\t"+i);
				foodStore[i].displayFoodDetails();	
				}
			
			}
		System.out.println("\n");
	
		



}
}