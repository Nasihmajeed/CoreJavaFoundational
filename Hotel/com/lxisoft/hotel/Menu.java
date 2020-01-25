package com.lxisoft.hotel;
import  com.lxisoft.user.*;
import java.util.*;


public class Menu
{
	Food food = new Food();
	Order order = new Order();
	Admin admin = new Admin();
	Buyer buyer = new Buyer();
	public void createMenu()
	{
	int choice1;	
	Scanner sc = new Scanner(System.in);
	do
	{

	System.out.println("\t\t*****MENU*****\n");
	System.out.println("\t\t1.Admin\n\t\t2.Buyer");
	System.out.print("Enter Ur Choice:\t");
	choice1 = sc.nextInt();
	if(choice1 == 1)
	{
		
		System.out.println("\t\t*****Admin UI*****\n");
		System.out.println("\t\t*****ADMIN MENU*****\n");
		System.out.println("\t\t1.Add Food\n\t\t2.Delete Food\n\t\t3.Update Food\n\t\t4.View Order\n\t\t5.Delete Order");
		System.out.print("\tEnter Ur Choice:\t");
		int choice2 = sc.nextInt();
		switch(choice2)
		{
			case 1 : admin.addFood();break;
			case 2 : //admin.deleteFood();break;
			case 3 : //admin.viewOrder();break;
			case 4 : //admin.deleteOrder();break;
			default: System.out.println("Enter valid choice!!!");
		}
	}
	else if(choice1 == 2)
	{
		System.out.println("\t\t*****User UI*****\n");
		System.out.println("\tFood Menu");
		System.out.println("\t_________");
		buyer.viewFoodMenu();
		System.out.println("\t\t*****MENU*****\n");
		System.out.println("\t\t1.Order Food\n\t\t2.View Order\n\t\t3.Delete Order");
		System.out.print("Enter Ur Choice:\t");
		int choice3 = sc.nextInt();
		switch(choice3)
		{
			case 1 : //buyer.orderFood();break;
			case 2 : //buyer.viewOrder();break;
			case 3 : //buyer.deleteOrder();break;
			default: System.out.println("Enter valid choice!!!");break;
		}
	}
	else if(choice1 == 0)
	{
		System.exit(0);
	}
	}while(choice1 != 0);

	}
}
