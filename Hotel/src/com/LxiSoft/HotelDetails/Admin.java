package com.LxiSoft.HotelDetails;
import java.util.*;
public class Admin{
	Menu menu = new Menu();
	public void viewMenu(){
		System.out.println("Under Construction");
		//menu.setMenu();
	}
	public void addToMenu(){
		int repeat;
		do{
			Scanner s = new Scanner(System.in);
		    System.out.println("How many items need to be added");
		    int numOfFood = s.nextInt();
		    menu.getMenu(numOfFood);
		    menu.printMenu();
		    System.out.println("Do you need to add anything else ?\n1.Yes\n0.No");
		    repeat = s.nextInt();
		}while(repeat!=0);
	}
	public void editTheMenu(){
		menu.printMenu();
		int back;
		do{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Serial number of the food to be editted");
			int num = s.nextInt();
			menu.editMenu(num);
			System.out.println("Do you need to edit anything else ?\n1.Yes\n0.No");
			back = s.nextInt();
		}while(back!=0);
	}
}