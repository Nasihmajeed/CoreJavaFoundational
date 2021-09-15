package com.lxisoft.user;
import com.lxisoft.hotel.Menu;
import com.lxisoft.user.Customer;
//import com.lxisoft.hotel.Order;
import com.lxisoft.hotel.FoodItem;

import java.util.*;

public class Cashier {

public void calculateBill(Customer customer,Menu menu){
HashMap<ArrayList<FoodItem>,ArrayList<Integer>> order=customer.getOrder();
ArrayList<Integer> listOfOrderedFood=customer.getListOfOrderedFood();
ArrayList<FoodItem> list=menu.getArraylist();
ArrayList<Integer> quantityOfFoodItem=customer.getquantityOfFoodItem();
//int indexNumber=0;
 int priceOfAllFoodOrder=0;
System.out.println("FoodItems and It's Prices");
//int indexNumber=0;
for(int indexNumber=0;indexNumber<listOfOrderedFood.size();indexNumber++){
System.out.println(list.get(listOfOrderedFood.get(indexNumber)-1).getfoodName());
System.out.println(quantityOfFoodItem.get(listOfOrderedFood.get(indexNumber)-1));
//for(String  foodName:order.keySet()){
 /// System.out.println("key :"+ foodName);
//  System.out.println(order.get(foodName));
//System.out.println(quantityOfFoodItem.get(indexNumber));
//System.out.println("")

int   priceOfEachFoodOrder=quantityOfFoodItem.get(listOfOrderedFood.get(indexNumber)-1)*list.get(listOfOrderedFood.get(indexNumber)-1).getfoodPrice();
priceOfAllFoodOrder = priceOfEachFoodOrder+priceOfAllFoodOrder;///indexNumber++;
}
System.out.println("Total money to pay   "+priceOfAllFoodOrder+"Rupees");
 System.out.println("*****");

}
}