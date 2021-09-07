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
 HashMap<String,Integer> order;
 ArrayList<Integer> quantityOfFoodItem =new ArrayList<Integer>();
//Menu menu;
//ArrayList<FoodItem> list;
//menu.orderFoodFromMenu(ArrayList<FoodItem> list);

public void printSelectedFoodAndBill(Menu menu){
//this.menu=menu;
ArrayList<FoodItem> list=menu.getArraylist();
HashMap<String,Integer> order=new HashMap<String,Integer>();
  //this.foodMenuList();
  //this.printFoodMenu();
int numberOfFoodOrder;
this.order=order;
// int totalPriceOfAllFoodOrder=0;
System.out.println("Enter how many dishes you want to order");
numberOfFoodOrder=input.nextInt();
for(int numberToRunLoop=0;numberToRunLoop<numberOfFoodOrder;numberToRunLoop++){
  System.out.println("Enter the Item Number");
  int foodItemIndexNumber=input.nextInt();
  input.nextLine();
  
 
 System.out.println("Enter Quantity You Need");
 int quantityOfFood=input.nextInt();
   input.nextLine();
   quantityOfFoodItem.add(quantityOfFood);
 // this.quantityOfFoodItem=quantityOfFoodItem;
order.put(list.get(foodItemIndexNumber-1).getfoodName(),list.get(foodItemIndexNumber-1).getfoodPrice());
//order.put(list,quantityOfFoodItem);
 }
  }
 
public void getOrder(HashMap<String,Integer> order, ArrayList<Integer> quantityOfFoodItem){
this.order=order;
this.quantityOfFoodItem=quantityOfFoodItem;
  }
  
}