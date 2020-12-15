package com.LxiSoft.HotelDetails;
import java.util.*;
public class Menu{
	String foodName = "Poratta";
	String foodType = "Main Dish";
	int prize = 30;
	public void getMenu(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the new Dish ");
		this.foodName = s.next();
		System.out.println("Enter the type of that dish ");
		this.foodType = s.next();
		System.out.println("enter the prize of that dish ");
		this.prize = s.nextInt();
	}
	public void printMenu(){
		System.out.println("Food\t: "+foodName);
		System.out.println("Type\t: "+foodType);
		System.out.println("Rate\t: "+prize);
	}
}