package com.lxisoft.hotel;
import com.lxisoft.user.Admin;
import java.util.*;
public class Menu
{
	Admin admin  = new Admin();
	Food food = new Food();
	
	public void createMenu()
	{
		int choice;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t*****MENU*****\n");
		System.out.println("\t\t1.Admin\n\t\t2.Buyer");
		System.out.print("\tEnter Ur Choice:\t");
		choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("\tEnter Admin Password:");
			System.out.print("\t");String adminpass = sc.next();
			// System.out.println(this.getPassWord());
			if(adminpass.equals(admin.adminPassword))
			{
				System.out.println("\tLogin Successfull.......");
				System.out.println("\t\t*****Admin UI*****\n");
				System.out.println("\t\t*****ADMIN MENU*****\n");
				System.out.println("\t\t1.Add Food\n\t\t2.Delete Food\n\t\t3.Update Food\n\t\t4.View Order\n\t\t5.Delete Order");
				System.out.print("\tEnter Ur Choice:\t");
				int ch1 = sc.nextInt();
				switch(ch1)
				{
					case 1:food.createFood();break;
					case 2:	for(int i=0;i<food.foodStore.length;i++)
							{
							food.displayFood();break;
							}
					default :System.out.println("Enter valid choice");break;
				}
			}
			else
			{
				System.out.println("\tLogin Unsuccessfull");
				System.exit(0);
			}
	}

	else if(choice == 2)
	{
			System.out.println("\t\t*****User UI*****\n");
			System.out.println("\t\tFood Menu");
			System.out.println("\t\t_________");
			System.out.println("\t\t*****MENU*****\n");
			System.out.println("\t\t1.Order Food\n\t\t2.View Order\n\t\t3.Delete Order");
			System.out.print("Enter Ur Choice:\t");
			int ch2 = sc.nextInt();
			switch (ch2) 
			{
				case 1:System.out.println("foo");break;
				case 2:System.out.println("fooooo");break;
				case 3:System.out.println("foooooooo");break;
				default :System.out.println("Enter valid choice");break;

						
			}
					
	}
	else if(choice == 0)
	{
		System.exit(0);
	}
			
	}while(choice!=0);
		
	
	}
}