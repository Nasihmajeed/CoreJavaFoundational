package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class FoodMenu
{
	
	static Scanner sc = new Scanner(System.in);
	Food[] foodStore = new Food[25];

	public void addFood()
	{
		System.out.println("Enter How many food do you want to add:");
		int count  = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			foodStore = new Food[count];
			foodStore[i] = new Food();
			foodStore[i].createFood();
		}

	}

	public void editFood()
	{
		System.out.println("Enter Id Food To be edited");
		int id = sc.nextInt();
		foodStore[id].createFood();
		System.out.println("Edited Successfully");
	}

	public void deleteFood()
	{
		System.out.println("Enter Id Food To be Deleted");
		int id = sc.nextInt();
		foodStore[id] = null;
			
	}
	public void viewOrder()
	{
		System.out.println("Enter Id Food To be Deleted");
		int id = sc.nextInt();
		foodStore[id] = null;
			
	}

	public void dispalyFoodMenu()
	{
		System.out.println("ID\tNAME\tRATE\n");
		System.out.println("___________________");
		for(int i=0;i<foodStore.length;i++)
		{
			System.out.print(i);
			foodStore[i].displayFoodDetails();
		}
	}






}