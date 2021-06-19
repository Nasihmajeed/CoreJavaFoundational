package com.lxisoft.mahesan711.Hotel;

import com.lxisoft.mahesan711.Hotel.FoodItems;
import java.util.*;
public class Menu {
int num,i, quantity;
Scanner input= new Scanner(System.in);
ArrayList<FoodItems> list=new ArrayList<FoodItems>();

public void printMenu(){
list.add(new FoodItems());
list.get(0).setfoodName("Biriyani");
list.get(0).setfoodPrice(100);
list.add(new FoodItems());
list.get(1).setfoodName("porota");
list.get(1).setfoodPrice(10);
list.add(new FoodItems());
list.get(2).setfoodName("Dosa");
list.get(2).setfoodPrice(20);

System.out.println("FoodItems and It's Prices");
int num1;
int num2=list.size();
for( num1=0;num1<num2;num1++){
System.out.println(num1+1 +".    "+ list.get(num1).getfoodName() +" "+ list.get(num1).getfoodPrice()+"\n");
//System.out.println(i);

 
}

}
//use of polymorphism method over loading
public void printMenu(int num3){
list.add(new FoodItems());
list.get(0).setfoodName("Biriyani");
list.get(0).setfoodPrice(100);
list.add(new FoodItems());
list.get(1).setfoodName("porota");
list.get(1).setfoodPrice(10);
list.add(new FoodItems());
list.get(2).setfoodName("Dosa");
list.get(2).setfoodPrice(20);

System.out.println("FoodItems and It's Prices");
int num1;
int num2=list.size();
for( num1=0;num1<num2-3;num1++){
System.out.println(num1+1 +".    "+ list.get(num1).getfoodName() +" "+ list.get(num1).getfoodPrice()+"\n");
//System.out.println(i);

 
}

}


//public int j=list.size();
public void addFoodDetails(){
System.out.println("Enter Index No Of food Item");
int num3=input.nextInt();
num3=num3-1;
int num1;

  System.out.println("Enter how many food Items you want To add");
 int num2=input.nextInt();
 
  input.nextLine();
  for(num1=0;num1<num2;num1++){
   
 // list.add(new FoodItems());

  System.out.println("Enter Name of FoodItem ");
  String name=input.nextLine();
//list.get(j).setfoodName(name);

    System.out.println("Enter Price of Food Item ");
    
    int price=input.nextInt();
    
    list.add(new FoodItems());
   
 list.get(num3).setfoodName(name);
 list.get(num3).setfoodPrice(price);
 //list.add(new FoodItems());


    input.nextLine();
   
  num3++;
  }
  }
  
  
public void orderFood(){
int num1; int num3=0;
System.out.println("Enter how many dishes you want to order");
num1=input.nextInt();
for(int num2=0;num2<num1;num2++){
  System.out.println("Enter the Item Number");
  num=input.nextInt();
  input.nextLine();
 
 System.out.println("Enter Quantity You Need");
  quantity=input.nextInt();
  input.nextLine();
 
  System.out.println("food Item : "+list.get(num-1).getfoodName());
  System.out.println("total price: "+quantity*list.get(num-1).getfoodPrice());
 
  num3=num3+quantity*list.get(num-1).getfoodPrice();
   }
   System.out.println("Total money to pay   "+num3+"Rupees");
   System.out.println("*****************************");
   }
   
     
   }