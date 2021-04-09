package com.lxisoft.HotelPackage;
import com.lxisoft.UserPackage.*;
//import TddPackage.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Hotel{
	Food ff= new Food();
	//Drinks dr=new Drinks();
	Admin ad=new Admin();
	ArrayList<Food> food=new ArrayList<Food>();
	ArrayList<Food> drinks=new ArrayList<Food>();
	//ArrayList<Drinks> drinks=new ArrayList<Drinks>();
	User u=new User();
	Scanner sc=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	int sel;
	String username,pas;
	public void displayHotel(){
		System.out.println("***************************************");
		System.out.println("ABCD FIVE STAR HOTEL");
		System.out.println("PATHIRIPALA, PALAKKAD");
		System.out.println("***************************************");
		ff.addMenu(food);
		ff.addDrinks(drinks);
		selectUser();
	}
	public void selectUser(){
		System.out.println("SELECT THE MODE ");
		System.out.println("1. ADMIN");
		System.out.println("2. USER");
		sel=sc.nextInt();
		switch(sel){
			case 1:
				System.out.println("ENTER ID");
				username=sc.next();
				System.out.println("ENTER PASSWORD");
				pas=sc.next();
				if(username.equals("nishad")&pas.equals("123")){
					ad.adminDetails(food,drinks);
				}
				else{
					System.out.println("WRONG ID OR PASSWORD");
					displayHotel();
				}
				
				
			break;
			case 2:
			//ff.addMenu(food);
				u.userDetails(food,drinks);
				
				break;
		}
	}
}