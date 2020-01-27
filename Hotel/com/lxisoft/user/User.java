package com.lxisoft.user;
import com.lxisoft.hotel.*;
public class user
{

	public String userId;

	public Order order = new Order();

	Scanner sc= new Scanner(System.in);

	public void createUser(FoodMenu foodmenu)
	{
		System.out.println("Enter User ID:");
		String userId = sc.nextInt();
		foodmenu.dispalyFoodMenu();

		order.createOrder();


	}


}