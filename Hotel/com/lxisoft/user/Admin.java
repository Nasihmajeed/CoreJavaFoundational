package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class Admin
{
	public String adminPassword="admin";

	
	public void createAdmin(FoodMenu foodmenu,User user)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("\tEnter Password:");
		System.out.print("\t");String setPass = sc.next();
		if(setPass.equals(adminPassword))
		{
			System.out.println("\tLogin Successfull");
			System.out.println("\t****Admin UI****");
			System.out.println("\t-----------------");
			System.out.print("\n\t1.Add Food\n\t2.Modify Food Menu\n\t3.View Food\n\t4.View Order\n\tEnter Ur choice");
			System.out.print("\t\t");int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:foodmenu.addFood();break;
				case 2:System.out.println("\n\t*****MODIFY FOOD*****");
					   System.out.println("\t___________________");
					   System.out.println("\n\t1.Add Food\n\t2.Delete Food\n\t3.Edit Food\n\tEnter Ur Choice\t");
					   System.out.print("\t");int c = sc.nextInt();
					   if(c ==1) 
					   	{
					   		foodmenu.addFoodAgain();
					   	}
					   	else if(c == 2)
					   	{
					   		foodmenu.deleteFood();
					   	}
					   	else if(c == 3)
					   	{
					   		foodmenu.editFood();
					   	}
					   	else
					   	{
					   		System.out.println("Please give valid input!!!!");	
					   	}

					   	break;
				case 3:foodmenu.displayFoodMenu();break;	   	
				case 4:user.displayUser(foodmenu);break;
				default:System.out.println("Please give valid input!!!!");break;

			}

		}
		else
		{
			System.out.println("Login failed");
			System.exit(0);
		}
		
	}

}