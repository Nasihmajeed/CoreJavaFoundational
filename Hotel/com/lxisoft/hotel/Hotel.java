package com.lxisoft.hotel;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Hotel
{
public String name;
Manager manager;
User user;
public Menu menu;
static Scanner input =new Scanner(System.in);
public void CreateHotel()
	{
		System.out.println("Enter The Name of Hotel= ");
		name=input.next();

		DisplayHotel();
	}


public void DisplayHotel()
	{
		int choi;
		user=new User();
		manager=new Manager();
		menu=new Menu();
		
	do
	{	
		System.out.println("\n\tHOTEL "+this.name.toUpperCase());
		System.out.println("\n________________________");
		System.out.println("\n\n1. User Menu \n\n2. Manager \n\n Press 0 for Exit \n");
		choi=input.nextInt();
		if(choi==2)
		{
			
			manager.createManager(menu,user);
		}
		else if(choi==1)
		{
			user.createUser(menu);
		}
		else if(choi==0)
		{
			System.out.println(" Exited");
		}
		else
		{
			System.out.println(" WrOnG ChOiSe");
		}
	}
		while(choi!=0); 

	}
}