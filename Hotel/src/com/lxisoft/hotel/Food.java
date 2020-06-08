package com.lxisoft.hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Food{
	
	String foodName;
	Integer  foodPrice;

	//Food tea=new Food();
	//Food coffee=new Food();

	Food(String foodName,int foodPrice){
		this.foodName=foodName;
		this.foodPrice=foodPrice;
	}

	 Scanner scanner=new Scanner(System.in);

	 Food tea=new Food("TEA",10);
	 Food coffee=new Food("COFFEE",15);
	 Food limejuice=new Food("LIME JUICE",20);
     ArrayList<Food> mylist = new ArrayList<Food>();

    // mylist.add(tea);
     //mylist.add(coffee);
     //mylist.add(limejuice);

     public void setMenuDetails(){
     	//foodList.add(tea);
     	//foodList.add(coffee);
     }
     


	




}