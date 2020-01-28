package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class FoodMenu
{
	
	static Scanner sc = new Scanner(System.in);
	Food[] foodStore = new Food[25];
	int count,n;
	public void addFood()
	{
		System.out.println("Enter How many food do you want to add:");
		n  = sc.nextInt();
		count = count+n;
		for(int i=0;i<count;i++)
		{
			foodStore[i] = new Food();
			foodStore[i].createFood();
		}

	}

	public void editFood()
	{
		displayFoodMenu();

		System.out.println("Enter Id Food To be edited");
		int id = sc.nextInt();
		foodStore[id].createFood();
		System.out.println("Edited Successfully");
	}

	public void deleteFood()
	{
		
		displayFoodMenu();	
		
		System.out.println("\nEnter Id Food To be Deleted");
		int id = sc.nextInt();
		foodStore[id] = null;
		System.out.println("Successfully Removed item from the list...");
			
	}
	public void viewOrder()
	{
		
	}

	public void displayFoodMenu()
	{
		System.out.println("ID\tNAME\tRATE");
		System.out.println("___________________");
		
		for(int i=0;i<count;i++)
		{
			if(foodStore[i]!=null)
			{
				System.out.print(i);
				foodStore[i].displayFoodDetails();	
			}
			
		}
		System.out.println("\n");
	}






}