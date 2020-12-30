package com.LxiSoft.HotelDetails;
import java.util.*;
public class User{
	int order;
	int numberOfPlates;
	//int totalPrize = 0;
	Menu menu = new Menu();
	public void orderFood(){
		Scanner s = new Scanner(System.in);
		int repeat;
		menu.setMenu();
		menu.printMenu();
		do{			
			//menu.printMenu();
		    System.out.println("\nSelect your order with the serial number : ");
		    order = s.nextInt();
		    System.out.println("number of order ?");
		    numberOfPlates = s.nextInt();
		    menu.getOrder(order,numberOfPlates);
		    System.out.println("Do you like to order anything else ?\n1.Yes\n0.No");
		    repeat = s.nextInt();
		}while(repeat!=0);
	}
	public void payBill(){
		System.out.println("The total amount : ");
		System.out.println(menu.totalPrize);
	}
}