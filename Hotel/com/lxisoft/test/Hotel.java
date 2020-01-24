package com.lxisoft.test;
import  com.lxisoft.user.*;
import  com.lxisoft.food.*;
import  com.lxisoft.order.*;
import java.util.*;
public class Hotel
{

	String hotelName;
	Manager manager;
	Menu menu = new Menu();
	static  Scanner sc = new Scanner(System.in);
	
	public void createHotel()
	{	
	System.out.println("Enter Hotel Name");
	hotelName  = sc.nextLine();
	System.out.println("\t\tHOTEL "+hotelName.toUpperCase()+"\n");
	
	menu.createMenu();


	}
	
	// int generateOrderId()
	// {
	// 	int randomNo;
	// 	final String alphabet = "0123456789ABCDE";
	// 	final int length = alphabet.length();
	// 	Random random = new Random();
	// 	for(int i=0;i<=5;i++)
	// 	{
	// 		randomNo = alphabet.charAt(random.nextInt(length));

	// 	}
	// 	return randomNo;
	// }


}
