package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class Admin
{
	public String adminPassword="admin";

	
	public void createAdmin(FoodMenu foodmenu)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Password:");
		String setPass = sc.next();
		if(setPass.equals(adminPassword))
		{
			
			System.out.println("1.Add Food\n2.Edit food\n3.Delete Food\n4.View Order\nEnter Ur choice\n");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:foodmenu.addFood();break;
				case 2:foodmenu.editFood();break;
				case 3:foodmenu.deleteFood();break;
				case 4:foodmenu.viewOrder();break;

			}

		}
		else
		{
			System.out.println("Login failed");
			System.exit(0);
		}
		
	}

}