package com.lxisoft.hotel;
import java.util.Scanner;
public class Hotel{

	Admin[] admin;
	Menu[] menu;
	String hotelName;

	public void printHotelDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the hotel name");
		String hotelName=scanner.nextLine();
	}

	
}