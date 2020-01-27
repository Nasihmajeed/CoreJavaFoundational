package com.lxisoft.hotel;
import com.lxisoft.user.Admin;
import java.util.*;
public class Hotel
{
	String hotelName;

	Adress adress = new Adress();

	Menu menu = new Menu();
	static Scanner sc = new Scanner(System.in);
	public void createHotel()
	{

		System.out.println("Hotel Name:");
		String hotelName = sc.nextLine();
		System.out.println("Adress:");
		String adr = sc.nextLine();
		adress.setAdress(adr);
		System.out.println("\n\t*****HOTEL " +hotelName.toUpperCase() + "*****");
		displayHotel();
		System.out.println("\n");
		menu.createMenu();

	}



	public void displayHotel()
	{	
		System.out.println("\t"+adress.getAdress().toUpperCase());		

	}
}