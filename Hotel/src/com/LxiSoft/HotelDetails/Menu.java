package com.LxiSoft.HotelDetails;
import java.util.*;
public class Menu{
	//Menu menu = new Menu();

	ArrayList<Food> list = new ArrayList<Food>();
	public void setMenu(){
		list.add(new Food());
		list.get(0).setName("Poratta");
		list.get(0).setType("Main Dish");
		list.get(0).setPrize(30);
		list.add(new Food());
		list.get(1).setName("Pathiri");
		list.get(1).setType("Main Dish");
		list.get(1).setPrize(25);
		list.add(new Food());
		list.get(2).setName("Dosa");
		list.get(2).setType("Main Dish");
		list.get(2).setPrize(15);
		list.add(new Food());
		list.get(3).setName("Meals");
		list.get(3).setType("Main Dish");
		list.get(3).setPrize(70);
	}
	public void getMenu(int n){
		int size = list.size();
		System.out.println(size);
		Food food = new Food();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Dish ");
		    food.foodName = s.next();
		    System.out.println("Enter the type of that dish ");
		    food.foodType = s.next();
		    System.out.println("enter the prize of that dish ");
		    food.prize = s.nextInt();
		    s.nextLine();
		    list.add(new Food());
		    list.get(size+i).setName(food.foodName);
		    System.out.println(size);
		    list.get(size+i).setType(food.foodType);
		    System.out.println(size);
		    list.get(size+i).setPrize(food.prize);
		}
	}
	public void printMenu(){
		for(int i=0; i<list.size(); i++){
			System.out.println("Food\t: "+list.get(i).getName());
		    System.out.println("Type\t: "+list.get(i).getType());
		    System.out.println("Rate\t: "+list.get(i).getPrize());
		}

	}
}