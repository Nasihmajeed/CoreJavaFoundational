package com.LxiSoft.HotelDetails;
import java.util.*;
public class Admin{
	Menu menu = new Menu();
	public void viewMenu(){
		menu.printMenu();
	}
	public void addToMenu(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many items need to be added");
		int numOfFood = s.nextInt();
		s.nextLine();
		menu.getMenu(numOfFood);
		menu.printMenu();
	}
}