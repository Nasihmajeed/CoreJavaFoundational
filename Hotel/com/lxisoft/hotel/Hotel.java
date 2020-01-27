package com.lxisoft.hotel;
import com.lxisoft.user.*;
import java.util.*;
public class Hotel
{
	String hotelName;
	String hotelAdress;

	Admin admin;
	User user;
	Menu menu;

	static Scanner sc = new Scanner(System.in);
	
	public void createHotel()
	{
		System.out.println("Hotel Name::");
		hotelName = sc.next();
		System.out.println("Hotel Address::");
		hotelAdress = sc.next();


		displayHotelMenu();

	}

	public void displayHotelMenu()
	{
		user= new User();
	    admin = new Admin();
		menu=new Menu();
		int choice;
		do
		{	
		System.out.println("\n\tHOTEL "+hotelName.toUpperCase());
		System.out.println("\n________________________");
		System.out.println("\t"+hotelAdress.toUpperCase());
		System.out.println("\n\n1. Admin \n\n2. User \n");
		choice=sc.nextInt();
		if(choice==1)
		{
			admin.adminMenu();
		}
		else if(choice==2)
		{
			
			user.userMenu();
		}
		else if(choice==0)
		{
			System.exit(0);
		}
		else
		{
			System.out.println(" WrOnG ChOiSe");
		}
	}while(choice!=0);
	
	}
}
