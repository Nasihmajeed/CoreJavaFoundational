package com.lxisoft.hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Food{
	
	String foodName;
	Integer  foodPrice;

	
	Food(String foodName,int foodPrice){
		this.foodName=foodName;
		this.foodPrice=foodPrice;
	}

	 Scanner scanner=new Scanner(System.in);

	 Food tea=new Food("TEA",10);
	 Food coffee=new Food("COFFEE",15);
	 Food limejuice=new Food("LIME JUICE",20);
     ArrayList<Food> foodlist = new ArrayList<Food>();

    foodlist.add(new Food());

    
     public void setMenuDetails(){
     	
     }
     


	




}