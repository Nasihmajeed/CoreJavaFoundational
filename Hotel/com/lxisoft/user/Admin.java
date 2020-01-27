package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class Admin
{
	public String adminPassword = "admin";

	static Scanner sc = new Scanner(System.in);
	Food food = new Food();
	Menu menu ;

	public void adminMenu()
	{
		System.out.println("Enter admin Password:");
		String pass = sc.next();
		menu = new Menu();
		if(pass.equals(adminPassword))
		{
				boolean flag = true;
				System.out.println("\tLogin Successfull.......");
				System.out.println("\t\t*****Admin UI*****\n");
				System.out.println("\t\t*****ADMIN MENU*****\n");
				System.out.println("\t\t1.Add Food\n\t\t2.Delete Food\n\t\t3.Update Food\n\t\t4.View Order\n\t\t5.Delete Order");
				System.out.print("\tEnter Ur Choice:\t");
				int ch1 = sc.nextInt();
				switch(ch1)
				{
					case 1:menu.createFood();break;
					case 2:food.displayFood();break;
					default :System.out.println("Enter valid choice");break;
				}
		}
	
		else		
		{
			System.out.println("Welcome");

		}
		
	}
}
