package com.lxisoft.UserPackage;
import com.lxisoft.HotelPackage.*;
import java.util.Scanner;
import java.util.ArrayList;
public class User{
	ArrayList<Bill> bill=new ArrayList<Bill>();
	ArrayList<Food> food=new ArrayList<Food>();
	ArrayList<Food> drinks=new ArrayList<Food>();
	//ArrayList<Drinks> drinks=new ArrayList<Drinks>();
	Food fd=new Food();
	Order o=new Order();
	//Drinks d=new Drinks();
	Scanner sc=new Scanner(System.in);
	String userName;
	public void userDetails(ArrayList<Food> food, ArrayList<Food> drinks){
		System.out.println("ENTER USER NAME ");
		userName=sc.nextLine();
		//fd.printMenuUser(food);
		//d.printDrinksMenu(drinks);
		o.takeOrder(food,bill,drinks);
	}
}