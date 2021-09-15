package com.lxisoft.user;
//import com.lxisoft.hotel.Employee;
import com.lxisoft.hotel.FoodItem;
import com.lxisoft.hotel.Menu;
//import com.lxisoft.hotel.Order;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;


public class Customer {
//Employee e=new Employee();
//ArrayList<Order> orderList=new ArrayList<Order>();
Scanner input = new Scanner(System.in);
  HashMap<ArrayList<FoodItem>,ArrayList<Integer>> order= new HashMap<ArrayList<FoodItem>,ArrayList<Integer>>();
  ArrayList<Integer> quantityOfFoodItem =new ArrayList<Integer>();
  ArrayList<Integer> listOfOrderedFood=new ArrayList<Integer>();

//Menu menu;
//ArrayList<FoodItem> list;
//menu.orderFoodFromMenu(ArrayList<FoodItem> list);

public void giveOrder(Menu menu){
//this.menu=menu;
ArrayList<FoodItem> list=menu.getArraylist();
//HashMap<String,Integer> order=new HashMap<String,Integer>();
  //this.foodMenuList();
  //this.printFoodMenu();
int numberOfFoodOrder=0;
this.order=order;
// int totalPriceOfAllFoodOrder=0;
System.out.println("Enter how many dishes you want to order");
numberOfFoodOrder=input.nextInt();
for(int numberToRunLoop=0;numberToRunLoop<numberOfFoodOrder;numberToRunLoop++){
  System.out.println("Enter the Item Number");
  int foodItemIndexNumber=input.nextInt();
  input.nextLine();
  listOfOrderedFood.add(foodItemIndexNumber);
  
 
 System.out.println("Enter Quantity You Need");
 int quantityOfFood=input.nextInt();
   input.nextLine();
   quantityOfFoodItem.add(quantityOfFood);
 // this.quantityOfFoodItem=quantityOfFoodItem;
order.put(list,quantityOfFoodItem);
//order.put(list,quantityOfFoodItem);
//numberOfFoodOrder++;
 }
  }
 
public HashMap<ArrayList<FoodItem>,ArrayList<Integer>> getOrder(){
this.order=order;
return order;
}
public ArrayList<Integer> getListOfOrderedFood(){
this.listOfOrderedFood=listOfOrderedFood;
return listOfOrderedFood;
//this.quantityOfFoodItem=quantityOfFoodItem;
  }
public ArrayList<Integer> getquantityOfFoodItem(){
//this.quantityOfFoodItem=quantityOfFoodItem;
return quantityOfFoodItem;
//this.quantityOfFoodItem=quantityOfFoodItem;
  }
  
  
}