package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class User
{

	

	public Order order = new Order();

	Scanner sc= new Scanner(System.in);

	public void createUser(FoodMenu foodmenu)
	{
		

		order.createOrder(foodmenu);


	}

	public void displayUser(FoodMenu foodmenu)
	{
		
		order.displayOrder(foodmenu);
	}


}