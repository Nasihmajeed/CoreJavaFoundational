package com.lxisoft.user;
import com.lxisoft.hotel.*;
import java.util.*;
public class User
{
	public String userName;
	Food food = new Food();
	static Scanner sc = new Scanner(System.in);
	public void userMenu()
	{
			System.out.println("\t\t*****User UI*****\n");
			System.out.println("\t\tFood Menu");
			System.out.println("\t\t_________");
			food.displayFood();
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

}