package com.lxisoft.HotelPackage;

import java.util.ArrayList;
import java.util.*;
public class Food{
	int id;
	String foodItem;
	float price;
	int qty;
	public static ArrayList<Food> food=new ArrayList<Food>(10);
	public static ArrayList<Food> drinks=new ArrayList<Food>(10);

	ArrayList<Bill> bill= new ArrayList<Bill>(10);
	//ArrayList<Integer> qty=new ArrayList<Integer>(10);
	public Food(){
		this.id=id;
		this.foodItem=foodItem;
		this.price=price;
		this.qty=qty;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setFoodItem(String foodItem){
		this.foodItem=foodItem;
	}
	public String getFoodItem(){
		return foodItem;
		
	}
	public void setPrice(float price){
		this.price=price;
	}
	public float getPrice(){
		return price;
		
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public  void addMenu(ArrayList<Food> food){
		Food[] f=new Food[10];
		/* food.add(new Food());
		food.get(0).setFoodItem("Chappathi");
		food.get(0).setPrice(10);
		
		food.get(0).setId(1);
		food.add(new Food());
		food.get(1).setFoodItem("Parotta");
		food.get(1).setPrice(12);
		food.get(1).setId(2); */
		
		
		for(int i=0;i<10;i++){
		f[i]=new Food();
		}
		f[0].setId(1);
		f[0].setFoodItem("Chappathi");
		f[0].setPrice(9);
		f[0].setQty(0);
		f[1].setId(2);
		f[1].setFoodItem("Parotta");
		f[1].setPrice(10);
		f[1].setQty(0);
		f[2].setId(3);
		f[2].setFoodItem("Dosa");
		f[2].setPrice(7);
		f[2].setQty(0);
		f[3].setId(4);
		f[3].setFoodItem("Idli");
		f[3].setPrice(5);
		f[3].setQty(0);
		f[4].setId(5);
		f[4].setFoodItem("Putt");
		f[4].setPrice(30);
		f[4].setQty(0);
		f[5].setId(6);
		f[5].setFoodItem("Chicken Curry");
		f[5].setPrice(50);
		f[5].setQty(0);
		f[6].setId(7);
		f[6].setFoodItem("Beef Curry");
		f[6].setPrice(80);
		f[6].setQty(0);
		f[7].setId(8);
		f[7].setFoodItem("Pathiri");
		f[7].setPrice(4);
		f[7].setQty(0);
		f[8].setId(9);
		f[8].setFoodItem("Biriyani-Chicken");
		f[8].setPrice(110);
		f[8].setQty(0);
		f[9].setId(10);
		f[9].setFoodItem("Biriyani-Beef");
		f[9].setPrice(90);
		f[9].setQty(0);
		for(int i=0;i<10;i++){
		food.add(f[i]);
		}
		
			
	}
	public void addDrinks(ArrayList<Food> drinks){
		Food[] d=new Food[10];
		for(int i=0;i<10;i++){
		d[i]=new Food();
		}
		d[0].setId(1);
		d[0].setFoodItem("7-up");
		d[0].setPrice(35);
		d[0].setQty(0);
		d[1].setId(2);
		d[1].setFoodItem("Mirinda");
		d[1].setPrice(30);
		d[1].setQty(0);
		d[2].setId(3);
		d[2].setFoodItem("RedBull");
		d[2].setPrice(110);
		d[2].setQty(0);
		d[3].setId(4);
		d[3].setFoodItem("Frooti");
		d[3].setPrice(10);
		d[3].setQty(0);
		d[4].setId(5);
		d[4].setFoodItem("Soda");
		d[4].setPrice(8);
		d[4].setQty(0);
		d[5].setId(6);
		d[5].setFoodItem("Beer");
		d[5].setPrice(110);
		d[5].setQty(0);
		d[6].setId(7);
		d[6].setFoodItem("Water");
		d[6].setPrice(13);
		d[6].setQty(0);
		d[7].setId(8);
		d[7].setFoodItem("Sprite");
		d[7].setPrice(32);
		d[7].setQty(0);
		d[8].setId(9);
		d[8].setFoodItem("Pepsi");
		d[8].setPrice(40);
		d[8].setQty(0);
		d[9].setId(10);
		d[9].setFoodItem("Cola");
		d[9].setPrice(30);
		d[9].setQty(0);
		for(int i=0;i<10;i++){
		drinks.add(d[i]);
		}
	}
	public static void printMenu(ArrayList<Food> food){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST");
		System.out.println("**********************************");
		System.out.printf("%-2s %-18s %6s\n","ID","FoodItem","Price");
		int j=1;
		for(int i=0;i<food.size();i++){
			if(j<=food.size()){
				System.out.printf("%-2s %-18s %-1s %6s\n",j,food.get(i).getFoodItem(),"-",food.get(i).getPrice());
			//System.out.println(j+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
			j++;
		}
		}
	}
	public  void printMenuUser(ArrayList<Food> food){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST"+food.size());
		System.out.println("**********************************");
		System.out.printf("%-2s %-10s %6s","ID","FoodItem","Price");

		int j=1;
		for(int i=0;i<food.size();i++){
			if(j<food.size()){
			System.out.printf("%-2s %-18s %-1s %6s",j,food.get(i).getFoodItem(),"-",food.get(i).getPrice());
			//System.out.println(j+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
			j++;
		}
		}
	}
	public void printDrinksMenu(ArrayList<Food> drinks){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST"+drinks.get(0).getFoodItem());
		System.out.println("**********************************");
		System.out.printf("%-2s %-18s %6s\n","ID","DrinkItem","Price");
		int j=1;
		for(int i=0;i<drinks.size();i++){
			if(j<=drinks.size()){
				System.out.printf("%-2s %-18s %-1s %6s\n",j,drinks.get(i).getFoodItem(),"-",drinks.get(i).getPrice());
			//System.out.println(j+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
			j++;
		}
		}
	}
		public static void printDrinksMenuUser(ArrayList<Food> drinks){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST"+drinks.get(0).getFoodItem());
		System.out.println("**********************************");
		System.out.printf("%-2s %-18s %6s\n","ID","DrinkItem","Price");
		int j=1;
		for(int i=0;i<drinks.size();i++){
			if(j<=drinks.size()){
				System.out.printf("%-2s %-18s %-1s %6s\n",j,drinks.get(i).getFoodItem(),"-",drinks.get(i).getPrice());
			//System.out.println(j+" : "+ food.get(i).getFoodItem()+"  "+food.get(i).getPrice());
			j++;
		}
		}
	}
	
}