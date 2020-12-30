package com.LxiSoft.HotelDetails;
import java.util.*;
public class Menu{
	Eatables eat = new Eatables();
	Drinks drink = new Drinks();
	ArrayList<Food> list = new ArrayList<Food>();
	public void setMenu(){
		list.add(new Eatables());
		list.get(0).setName("Poratta");
		//list.get(0).setType("Main Dish");
		list.get(0).setPrize(30);
		list.add(new Eatables());
		list.get(1).setName("Pathiri");
		//list.get(1).setType("Main Dish");
		list.get(1).setPrize(25);
		list.add(new Drinks());
		list.get(2).setName("Lemonide");
		//list.get(2).setType("Main Dish");
		list.get(2).setPrize(15);
		list.add(new Drinks());
		list.get(3).setName("Fresh Juice");
		//list.get(3).setType("Main Dish");
		list.get(3).setPrize(17);
	}
	public void getEatables(int n){
	    int j = list.size();	
		//Food food = new Food();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Dish ");
		    eat.foodName = s.next();
		    //System.out.println("Enter the type of that dish ");
		    //food.foodType = s.next();
		    System.out.println("Enter the prize of that dish ");
		    eat.prize = s.nextInt();
		    list.add(new Eatables());		    
		    list.get(j).setName(eat.foodName);
		    //list.get(j).setType(food.foodType);
		    list.get(j).setPrize(eat.prize);
		    j++;
		}
		System.out.println("The new Menu");
		this.printMenu();
	}
	public void getDrinks(int n){
	    int j = list.size();	
		//Food food = new Food();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Drink ");
		    drink.foodName = s.next();
		    //System.out.println("Enter the type of that dish ");
		    //food.foodType = s.next();
		    System.out.println("Enter the prize of that drink ");
		    drink.prize = s.nextInt();
		    list.add(new Drinks());		    
		    list.get(j).setName(drink.foodName);
		    //list.get(j).setType(food.foodType);
		    list.get(j).setPrize(drink.prize);
		    j++;
		}
		System.out.println("The new Menu");
		this.printMenu();
	}
	public void editEatables(int index){
		Scanner s = new Scanner(System.in);	
		System.out.println("Insert the new amount");
		eat.prize = s.nextInt();
		list.get(index-1).setPrize(eat.prize);
		System.out.println("The updated Menu ");
		this.printMenu();
	}
	public void editDrinks(int index){
		Scanner s = new Scanner(System.in);	
		System.out.println("Insert the new amount");
		drink.prize = s.nextInt();
		list.get(index-1).setPrize(drink.prize);
		System.out.println("The updated Menu ");
		this.printMenu();
	}
	public void deleteMenu(int index){
		Scanner s = new Scanner(System.in);
		list.remove(index-1);
		System.out.println("The updated Menu ");
		this.printMenu();
	}
	
	public void printMenu(){
		//this.setMenu();
		System.out.println("+---------+-------------+-------------+");
		System.out.println("  S.No\t    Food    \t  Rate\t");
		System.out.println("+---------+-------------+-------------+");
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+list.get(i).getName()+"\t "+list.get(i).getPrize()+"    \t");
		}
		System.out.println("+---------+-------------+-------------+");
	}
	int totalPrize=0;
	public void getOrder(int order, int quantity){
		int prize = quantity*list.get(order-1).getPrize();
		totalPrize = totalPrize+prize;
	}	
}