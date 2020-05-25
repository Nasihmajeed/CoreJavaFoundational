package com.lxisoft.hotel;
import java.util.Scanner;
public class Hotel{

	Admin[] admin;
	
	
	public void printHotelDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("**************************************************************************************************");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("**************************************************************************************************");

	System.out.println(" **************************HOTEL NOORJAHAN**************************************");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");

	System.out.println("*******************VEG  AND NONVEG**************************************");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");
		System.out.println("                                                                                                 ");


			System.out.println("*********************PALAKKAD****************************************");
		Menu menu=new Menu();
		menu.printMenuDetails();

		Order order=new Order();
		order.getOrderDetails();



		
	}

	
}