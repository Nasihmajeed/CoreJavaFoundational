package com.lxisoft.hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Food{

	Drinks drinks=new Drinks();
	
	protected String foodName;
	public void setFoodName(String a){
		this.foodName=a;
	}
	public String getFoodName(){
		return foodName;
	}

	protected Integer foodPrice;
	public void setFoodPrice(Integer a){
		this.foodPrice=a;
	}
	public Integer getFoodPrice(){
		return foodPrice;
	}

	public void print(){
		System.out.println("ENJOY YOUR FOOD");
	}
}