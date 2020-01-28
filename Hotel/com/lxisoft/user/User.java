package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class User
{

	public String userId;

	public Order order = new Order();

	Scanner sc= new Scanner(System.in);

	public void createUser(FoodMenu foodmenu,Adress adress,User user)
	{
		System.out.println("Enter User ID:");
		String userId = sc.next();

		order.createOrder(foodmenu,adress);


	}


}