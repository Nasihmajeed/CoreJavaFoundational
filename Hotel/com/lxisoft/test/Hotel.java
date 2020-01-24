package com.lxisoft.test;
import  com.lxisoft.user.*;
import  com.lxisoft.food.*;
import  com.lxisoft.order.*;
import java.util.*;
public class Hotel
{

	String hotelName;
	Manager manager;
	Food food = new Food();
	Order order = new Order();
	static  Scanner sc = new Scanner(System.in);
	
	public void createHotel()
	{	
	System.out.println("Enter Hotel Name");
	hotelName  = sc.nextLine();
	System.out.println("HOTEL "+hotelName.toUpperCase()+"\n");
	System.out.println("\t\t*****MENU*****\n");	
	System.out.println("\t\t1.Manager\n\t\t2.Buyer");
	System.out.print("Enter Ur Choice:\t");
	int choice1 = sc.nextInt();
	if(choice1 == 1)
	{
		System.out.println("\t\t*****Manager Console*****\n");
		System.out.println("\t\t*****MENU*****\n");
		System.out.println("\t\t1.Add Food\n\t\t2.Delete Food\n\t\t3.Update Food\n\t\t4.View Order\n\t\t5.Delete Order");
		System.out.print("Enter Ur Choice:\t");
		int choice2 = sc.nextInt();
		switch(choice2)
		{
			case 1 : food.addFood();break;
			case 2 : food.deleteFood();break;
			case 3 : order.viewOrder();break;
			case 4 : order.deleteOrder();break;
		}			
	}
	else if(choice1 == 2)
	{
		System.out.println("\t\t*****User Console*****\n");
		System.out.println("\t\t*****MENU*****\n");
		System.out.println("\t\t1.Order Food\n\t\t2.View Order\n\t\t3.Delete Order");
		System.out.print("Enter Ur Choice:\t");
		int choice2 = sc.nextInt();

	}

	}

}