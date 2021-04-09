package com.lxisoft.HotelPackage;

import java.util.ArrayList;
import java.util.Scanner;
public class Bill{
	
	int foodId;
	String foodName;
	float foodPrice;
	int qnty;
	ArrayList<Bill> bill= new ArrayList<Bill>();
			Bill[] b=new Bill[10];
	Scanner sc=new Scanner(System.in);
	
		
	public Bill(){
		this.foodId=foodId;
		this.foodName=foodName;
		this.foodPrice=foodPrice;
		this.qnty=qnty;
	}
	public void setFoodId(int foodId){
		this.foodId=foodId;
	}
	public int getFoodId(){
		return foodId;
	}
	public void setFoodName(String foodName){
		this.foodName=foodName;
	}
	public String getFoodName(){
		return foodName;
		
	}
	public void setFoodPrice(float foodPrice){
		this.foodPrice=foodPrice;
	}
	public float getFoodPrice(){
		return foodPrice;
	}
	public void setQnty(int qnty){
		this.qnty=qnty;
	}
	public int getQnty(){
		return qnty;
	}
	
	public void printBill(ArrayList<Food> food, ArrayList<Bill> bill){
		Hotel ho=new Hotel();
		Order order=new Order();
		System.out.println(" ----------------------------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.println(" -------------------BILL------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.println(" ----------------------------------------------- ");
	System.out.printf("%-2s %-18s %6s %6s\n","ID","FoodItem","Price","Qty");
	System.out.println(" ----------------------------------------------- ");
		int j=1;
		for(int i=0;i<bill.size();i++){
			if(j<=bill.size()){
		System.out.printf("%-2s %-18s %6s %6s\n",j,bill.get(i).getFoodName(),bill.get(i).getFoodPrice(),bill.get(i).getQnty());
		j++;
		}
		}
		System.out.println("-----------------------------------------------");
	System.out.println("-----------------------------------------------");
	
	}
	/* public void printTotal(){
		Order od=new Order();
		System.out.println("Total : "+ od.total);
	} */
}