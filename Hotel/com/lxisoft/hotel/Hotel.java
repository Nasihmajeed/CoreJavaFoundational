package com.lxisoft.hotel;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Hotel
{
public String name;
Manager manager;
User[] user=new User[20];
public int noOfuser;
public Menu menu;
static Scanner input =new Scanner(System.in);
public void CreateHotel()
	{
		//HotelDetails();
		DisplayHotel();
	}

public void HotelDetails()
	{
		System.out.println("\n\n   Hotel RUCHI");
		System.out.println("Place : Palakkad");
		System.out.println("Cherpualssery");
		System.out.println("Ph :9876543211");
		
	}

public void DisplayHotel()
	{
		int choi;
		
		manager=new Manager();
		menu=new Menu();
		menu.createMenu();
		
	do
	{	
		//System.out.println("\n\tHOTEL "+this.name.toUpperCase());
		HotelDetails();
		System.out.println("\n________________________");
		System.out.println("\n\n1. User Menu \n\n2. Manager \n\n Press 0 for Exit \n");
		choi=input.nextInt();
		if(choi==2)
		{
			
			manager.createManager(menu,user,noOfuser);
		}
		else if(choi==1)
		{
			user[noOfuser]=new User();
			user[noOfuser].createUser(menu);
			noOfuser++;
		}
		else if(choi==0)
		{
			System.out.println(" Exited");
		}
		else
		{
			System.out.println(" WrOnG ChOiSe");
		}
		
		cls();
	}
		while(choi!=0); 

	}
public static void cls()
{
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E)
		{
			System.out.println(E);
		}
}
}