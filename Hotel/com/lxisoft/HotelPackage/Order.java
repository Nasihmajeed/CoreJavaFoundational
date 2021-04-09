package com.lxisoft.HotelPackage;
import com.lxisoft.UserPackage.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Order{ 
int home;
	public float total=0;
	//int[] qty=new int[10];
	Bill bi= new Bill();
	int id,select;
	int proceed;
	Food ff=new Food();
	//Drinks dd=new Drinks();
	Scanner sc=new Scanner(System.in);
	Scanner sn=new Scanner(System.in);
	Scanner sr=new Scanner(System.in);
	ArrayList<Bill> bill=new ArrayList<Bill>();
	ArrayList<Food> food=new ArrayList<Food>();
	//ArrayList<Drinks> drinks=new ArrayList<Drinks>();
	
	public void takeOrder(ArrayList<Food> food, ArrayList<Bill> bill,ArrayList<Food> drinks){
		Hotel ho=new Hotel();
		
		Order order=new Order();
		Bill[] b=new Bill[10];
	for (int i=0;i<10;i++){
		b[i]=new Bill();
	}
		System.out.println("SELECT ");
		System.out.println("1.FOOD");
		System.out.println("2.DRINKS");
		select=sc.nextInt();
		switch(select){
			case 1:
				do{
				ff.printMenu(food);
				System.out.println("SELECT FOOD ");
				id=sc.nextInt();
				System.out.println("____________________________________________________");
				System.out.println("____________________________________________________");
				for(int i=0;i<food.size(); i++){
					if(id==food.get(i).getId()){
					System.out.println("ENTER QUANTITY YOU WANT TO BUY");
					b[i].setQnty(sr.nextInt());
					b[i].setFoodId(food.get(i).getId());
					b[i].setFoodName(food.get(i).getFoodItem());
					b[i].setFoodPrice(food.get(i).getPrice());
					
					bill.add(b[i]);	
					total=total+b[i].getQnty()*food.get(i).getPrice();
					System.out.println("Order Placed "+food.get(i).getFoodItem()+": Price :"+food.get(i).getPrice());
					}
					}
				
				
				
				System.out.println("____________________________________________________");
				System.out.println("____________________________________________________");
				System.out.println("Do you wish to order more? 1.YES 2.NO");
				proceed=sn.nextInt();
				}while(proceed==1);
				
				break;
				
			case 2:
				do{
				ff.printDrinksMenuUser(drinks);
				System.out.println("SELECT DRINKS ");
				id=sc.nextInt();
				System.out.println("____________________________________________________");
				System.out.println("____________________________________________________");
				for(int i=0;i<drinks.size(); i++){
					if(id==drinks.get(i).getId()){
					System.out.println("ENTER QUANTITY YOU WANT TO BUY");
					b[i].setQnty(sr.nextInt());
					//b[i].setFoodId(food.get(i).getId());
					b[i].setFoodName(drinks.get(i).getFoodItem());
					b[i].setFoodPrice(drinks.get(i).getPrice());
					
					bill.add(b[i]);	
					total=total+b[i].getQnty()*drinks.get(i).getPrice();
					System.out.println("Order Placed "+drinks.get(i).getFoodItem()+": Price :"+drinks.get(i).getPrice());
					}
					}
				
				
				
				System.out.println("____________________________________________________");
				System.out.println("____________________________________________________");
				System.out.println("Do you wish to order more? 1.YES 2.NO");
				proceed=sn.nextInt();
				}while(proceed==1);
				break;
				
		}
		
	bi.printBill(food,bill);
	System.out.println("Total :"+total);
	System.out.println("RETURN TO HOME 1.Yes 2.NO");
	home=sc.nextInt();
	if(home==1){
	ho.displayHotel();
	}
	}
	
}