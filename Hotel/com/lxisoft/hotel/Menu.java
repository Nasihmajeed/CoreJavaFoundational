package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class Menu
{
	Admin admin  = new Admin();
	User user = new User();
	Food food;
	Food[] foodStore;
	static Scanner sc = new Scanner(System.in);
	
	public void createFood()
	{
		System.out.println("Enter How many food do you want to add:");
		int count  = sc.nextInt();
		for(int i=0;i<count;i++)
		{
			foodStore = new Food[count];
			foodStore[i] = new Food();
			foodStore[i].addFood();
		}

	}	




}