package com.lxisoft.hotel;

import java.util.Scanner;
public abstract class Dummy {


	private String foodName;
	public void setFoodName(String a){
		this.foodName=a;
	}
	public String getFoodName(){
		return foodName;
	}

	private Integer foodPrice;
	public void setFoodPrice(Integer a){
		this.foodPrice=a;
	}
	public Integer getFoodPrice(){
		return foodPrice;
	}

	public abstract void print();

	

	
}