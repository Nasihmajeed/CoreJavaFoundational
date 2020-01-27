package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class User
{
public String name;
public Order order=new Order();

static Scanner input =new Scanner(System.in);
public void createUser(Menu menu)
	{
		
		System.out.println("name Of customer= ");
		name=input.next();
		menu.displayMenu();
		{
			
			order.creatOrder(menu);
			
		}

	}

void displayUser(Menu menu)
	{
		order.displayOrder(menu,name);				
	}
 }