package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class FoodMenu
{
	
	static Scanner sc = new Scanner(System.in);
	Food[] foodStore = new Food[25];
	int count;
	public void addFood()
	{
		System.out.println("\tEnter How many food do you want to add:");
		System.out.print("\t");count  = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			foodStore[i] = new Food();
			foodStore[i].createFood();
		}

	}

	public void addFoodAgain()
	{
		System.out.println("\tEnter How many food do you want to add:");
		System.out.println("\t");int n = sc.nextInt();
		int temp = count + n;
		for(int i=count;i<temp;i++)
		{
			foodStore[i] = new Food();
			foodStore[i].createFood();
		}

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
		boolean flag = false;
		if(foodStore[0]==null)
		{
		flag = true;	
		System.out.println("\tStore Empty !!!");
		}
		if(flag!=true)
		{
		
		displayFoodMenu();
		
		System.out.print("\n\tEnter Id Food To be Deleted");
		System.out.println("\t");int id = sc.nextInt();
		foodStore[id] = null;
		System.out.println("\tSuccessfully Removed item from the list...");
		}	
	}


	public void displayFoodMenu()
	{	
		
			
			System.out.println("\tID\tNAME\tRATE");
			System.out.println("\t___________________");
		
			for(int i=0;i<count;i++)
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