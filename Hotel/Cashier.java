package com.lxisoft.user;
import com.lxisoft.hotel.Menu;
import com.lxisoft.user.Customer;
//import com.lxisoft.hotel.Order;
import com.lxisoft.hotel.FoodItem;

import java.util.*;

public class Cashier {

public void calculateBill(Customer customer,Menu menu){
HashMap<String,Integer> order=customer.getOrder();
ArrayList<Integer> listOfOrderedFood=customer.getIndexNumberOfOrderedFood();
ArrayList<FoodItem> list=menu.getArraylist();
//ArrayList<Integer> quantityOfFoodItem=customer.getquantityOfFoodItem();
//int indexNumber=0;
 int priceOfAllFoodOrder=0;
 int indexNumber=0;
System.out.println("FoodItems ");
//int indexNumber=0;
for(String key :order.keySet()){
System.out.println(key+" "+order.get(key));

//System.out.println(indexNumber);
//for(String  foodName:order.keySet()){
 /// System.out.println("key :"+ foodName);
//  System.out.println(order.get(foodName));
//System.out.println(quantityOfFoodItem.get(indexNumber));
//System.out.println("")

int   priceOfEachFoodOrder=order.get(key)*list.get(listOfOrderedFood.get(indexNumber)-1).getfoodPrice();

priceOfAllFoodOrder = priceOfEachFoodOrder+priceOfAllFoodOrder;
indexNumber++;
}
System.out.println("Total money to pay   "+priceOfAllFoodOrder+"Rupees");
 System.out.println("*****");

}
}
