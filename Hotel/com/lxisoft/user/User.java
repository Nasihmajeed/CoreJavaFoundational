package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class User
{

	

	public int itemNo;
	Scanner sc= new Scanner(System.in);
	
	public void createUser(FoodMenu foodmenu,int noOfUser,Food food,Order[] order)
	{
		System.out.println("How many items do U want to Buy");
		itemNo = sc.nextInt();

		for(int i=0;i<=noOfUser;i++)
		{
			order[i] = new Order();
			order[i].createOrder(foodmenu,noOfUser,food,order,itemNo);	
		}
		


	}

	public void displayUser(FoodMenu foodmenu,int noOfUser,Order[] order,int itemNo)

	{
		for(int i=0;i<noOfUser;i++)
		{
			order[i].displayOrder(foodmenu,noOfUser,itemNo);	
		}
		

		
	}


}