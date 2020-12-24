package com.LxiSoft.HotelDetails;
import java.util.*;
public class Menu{
	Food food = new Food();
	ArrayList<Food> list = new ArrayList<Food>();

	public void getMenu(int n){
	    int size = list.size();	
		//Food food = new Food();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Dish ");
		    food.foodName = s.next();
		    System.out.println("Enter the type of that dish ");
		    food.foodType = s.next();
		    System.out.println("enter the prize of that dish ");
		    food.prize = s.nextInt();
		    list.add(new Food());		    
		    list.get(size).setName(food.foodName);
		    list.get(size).setType(food.foodType);
		    list.get(size).setPrize(food.prize);
		    size++;
		}
	}
	public void editMenu(int index){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert the new amount");
		food.prize = s.nextInt();
		list.get(index-1).setPrize(food.prize);
		System.out.println("The updated Menu ");
		this.printMenu();
	}
	public void deleteMenu(int index){
		Scanner s = new Scanner(System.in);
		list.remove(index-1);
		System.out.println("The updated Menu ");
		this.printMenu();
	}
	
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
	public void printMenu(){
		//this.setMenu();
		System.out.println("+---------+-------------+-------------+------------+");
		System.out.println("  S.No\t    Food    \t  Type     \t  Rate\t");
		System.out.println("+---------+-------------+-------------+------------+");
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t  "+list.get(i).getName()+"    \t  "+list.get(i).getType()+"   \t  "+list.get(i).getPrize()+"    \t");
		}
		System.out.println("+---------+-------------+-------------+------------+");
	}

	int totalPrize=0;
	public void getOrder(int order, int quantity){
		int prize = quantity*list.get(order-1).getPrize();
		totalPrize = totalPrize+prize;
	}
	
}