package com.LxiSoft.HotelDetails;
import java.util.*;
public class Menu{
	Eatables eat = new Eatables();
	Drinks drink = new Drinks();
	
	ArrayList<Food> list = new ArrayList<Food>();
	ArrayList<Food> vegCurry = new ArrayList<Food>();
	ArrayList<Food> nonVegCurry = new ArrayList<Food>();
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
	public void setVegCurryMenu(){
		vegCurry.add(new Eatables());
		vegCurry.get(0).setName("Stew");
		vegCurry.get(0).setPrize(20);
		
		vegCurry.add(new Eatables());
		vegCurry.get(1).setName("Sambar");
		vegCurry.get(1).setPrize(25);
		
	}
	public void setNonVegCurryMenu(){
		nonVegCurry.add(new Eatables());
		nonVegCurry.get(0).setName("Chicken");
		nonVegCurry.get(0).setPrize(40);

		nonVegCurry.add(new Eatables());
		nonVegCurry.get(1).setName("Beef");
		nonVegCurry.get(1).setPrize(65);

	}
	public void getEatables(int n){
	    int j = list.size();	
		//Food food = new Food();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Dish ");
		    String foodName = s.next();
		    
		    System.out.println("Enter the prize of that dish ");
		    int prize = s.nextInt();
		    list.add(new Eatables());		    
		    list.get(j).setName(foodName);
		    
		    list.get(j).setPrize(prize);
		    j++;
		}
		System.out.println("The new Menu");
		this.printMenu();
	}
	public void getDrinks(int n){
	    int l = list.size();	
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Enter the new Drink ");
		    String drinkName = s.next();

		    System.out.println("Enter the prize of that drink ");
		    int prizee = s.nextInt();
		    list.add(new Drinks());		    
		    list.get(l).setName(drinkName);

		    list.get(l).setPrize(prizee);
		    l++;
		}
		System.out.println("The new Menu");
		this.printMenu();
	}
	public void editEatables(int index){
		Scanner s = new Scanner(System.in);	
		System.out.println("Insert the new amount");
		int newPrize = s.nextInt();
		list.get(index-1).setPrize(newPrize);
		System.out.println("The updated Menu ");
		this.printMenu();
	}
	public void editDrinks(int index){
		Scanner s = new Scanner(System.in);	
		System.out.println("Insert the new amount");
		int nwPrize = s.nextInt();
		list.get(index-1).setPrize(nwPrize);
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
	public void printVegCurryMenu(){
		this.setVegCurryMenu();
		System.out.println("+---------+-------------+-------------+");
		System.out.println("  S.No\t    Food    \t  Rate\t");
		System.out.println("+---------+-------------+-------------+");
		System.out.println(vegCurry.size());
		for(int i=0; i<vegCurry.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+vegCurry.get(i).getName()+"\t "+vegCurry.get(i).getPrize()+"    \t");
		}
		System.out.println("+---------+-------------+-------------+");
	}
	public void printNonVegCurryMenu(){
		this.setNonVegCurryMenu();
		System.out.println("+---------+-------------+-------------+");
		System.out.println("  S.No\t    Food    \t  Rate\t");
		System.out.println("+---------+-------------+-------------+");
		System.out.println(nonVegCurry.size());
		for(int i=0; i<nonVegCurry.size(); i++){
			
		    System.out.println("  "+(i+1)+"\t    "+nonVegCurry.get(i).getName()+"\t "+nonVegCurry.get(i).getPrize()+"    \t");
		}
		System.out.println("+---------+-------------+-------------+");
	}
	int totalPrize=0;
	int vegPrice=0;
	int nonPrice=0;
	public void getVegOrder(int ordr, int quan){
		int p = quan*list.get(ordr-1).getPrize();
		vegPrice = vegPrice+p;
	}
	public void getNonOrder(int oder, int quant){
		int price = quant*list.get(oder-1).getPrize();
		nonPrice = nonPrice+price;
	}
	public void getOrder(int order, int quantity){
		int prize = (quantity*list.get(order-1).getPrize())+vegPrice+nonPrice;
		totalPrize = totalPrize+prize;
	}	
}