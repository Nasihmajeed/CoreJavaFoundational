package com.lxisoft.hotelapp;
import java.util.Scanner;
public class Hotel{

	
	
	
	public void printHotelDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.println();
    System.out.println("           **************************************************************");
    System.out.println("                                   Top Chicken                                                                                                                                    ");
    System.out.println("                             Multi cuisine resturant                                       ");   
    System.out.println("                       Melepattambi, palakkad road, pattambi                                             ");
    System.out.println("                                                                                                               ");
    System.out.println("                                                                                                               ");
    System.out.println("                                                                                                               ");
    System.out.println("           **************************************************************");

		Menu menu=new Menu();
		menu.printMenuDetails();

		Order order=new Order();
		order.getOrderDetails();



		
	}

	
}