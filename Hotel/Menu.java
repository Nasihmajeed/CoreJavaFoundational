package com.lxisoft.hotel;

import com.lxisoft.hotel.FoodItem;
import java.util.*;
public class Menu {
int  quantityOfFoodItem;
Scanner input= new Scanner(System.in);
ArrayList<FoodItem> list=new ArrayList<FoodItem>();

public void foodMenuList(){
list.add(new FoodItem("Biriyani",100));
list.add(new FoodItem("Porota",10));
list.add(new FoodItem("dosa",20));
}
/*list.get(0).setfoodName("Biriyani");
list.get(0).setfoodPrice(100);
list.add(new FoodItems());
list.get(1).setfoodName("porota");
list.get(1).setfoodPrice(10);
list.add(new FoodItems());
list.get(2).setfoodName("Dosa");
list.get(2).setfoodPrice(20);*/
public void printFoodMenu(){
System.out.println("FoodItems and It's Prices");
int arrayNumber;
int arrayListSize=list.size();
for( arrayNumber=0;arrayNumber<arrayListSize;arrayNumber++){
System.out.println(1+arrayNumber +".    "+ list.get(arrayNumber).getfoodName() +" "+ list.get(arrayNumber).getfoodPrice()+"\n");
//System.out.println(i);

 
}

}
//use of polymorphism method over loading
/*public void printFoodMenu(int numberToRemoveUnwantedArraylist){
list.add(new FoodItem("Biriyani",100));
list.add(new FoodItem("Porota",10));
list.add(new FoodItem("dosa",20));
/*list.add(new FoodItems());
list.get(0).setfoodName("Biriyani");
list.get(0).setfoodPrice(100);
list.add(new FoodItems());
list.get(1).setfoodName("porota");
list.get(1).setfoodPrice(10);
list.add(new FoodItems());
list.get(2).setfoodName("Dosa");
list.get(2).setfoodPrice(20);*/
////
//System.out.println("FoodItems and It's Prices");
//int arrayNumber;
//int arrayListSize=list.size();
//for( arrayNumber=0;arrayNumber<arrayListSize-numberToRemoveUnwantedArraylist;arrayNumber++){
//System.out.println(1+arrayNumber +".    "+ list.get(arrayNumber).getfoodName() +" "+ list.get(arrayNumber).getfoodPrice()+"\n");
//System.out.println(i);

 
//}

//


//public int j=list.size();
public void addFoodDetail(){
System.out.println("Enter Index No Of food Item");
int indexNumber=input.nextInt();
indexNumber=indexNumber-1;
int loopNumberToAddItem;

  System.out.println("Enter how many food Items you want To add");
 int numberOfItemUserToAddOnMenu=input.nextInt();
 
  input.nextLine();
  for(loopNumberToAddItem=0;loopNumberToAddItem<numberOfItemUserToAddOnMenu;loopNumberToAddItem++){
   
 // list.add(new FoodItems());

  System.out.println("Enter Name of FoodItem ");
  String name=input.nextLine();
//list.get(j).setfoodName(name);

    System.out.println("Enter Price of Food Item ");
    
    int price=input.nextInt();
    
    list.add(new FoodItem(name,price));
   
 /*list.get(indexNumber).setfoodName(name);
 list.get(indexNumber).setfoodPrice(price);*/
 //list.add(new FoodItems());


    input.nextLine();
   
indexNumber++;
  }
  }
  
  
public void orderFoodFromMenu(){
int numberOfFoodOrder; int totalPriceOfAllFoodOrder=0;
System.out.println("Enter how many dishes you want to order");
numberOfFoodOrder=input.nextInt();
for(int numberToRunLoop=0;numberToRunLoop<numberOfFoodOrder;numberToRunLoop++){
  System.out.println("Enter the Item Number");
  int foodItemIndexNumber=input.nextInt();
  input.nextLine();
 
 System.out.println("Enter Quantity You Need");
  quantityOfFoodItem=input.nextInt();
  input.nextLine();
 
  System.out.println("food Item : "+list.get(foodItemIndexNumber-1).getfoodName());
  System.out.println("total price: "+quantityOfFoodItem*list.get(foodItemIndexNumber-1).getfoodPrice());
 
  totalPriceOfAllFoodOrder=totalPriceOfAllFoodOrder+quantityOfFoodItem*list.get(foodItemIndexNumber-1).getfoodPrice();
   }
   System.out.println("Total money to pay   "+totalPriceOfAllFoodOrder+"Rupees");
   System.out.println("*****************************");
   }
   
     
   }