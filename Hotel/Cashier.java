package com.lxisoft.user;
import com.lxisoft.hotel.Menu;
import com.lxisoft.user.Customer;
//import com.lxisoft.hotel.Order;
import com.lxisoft.hotel.FoodItem;

import java.util.*;

public class Cashier {

public void calculateBill(Customer customer){
HashMap<FoodItem,Integer> order=customer.getOrder();
//ArrayList<Integer> listOfOrderedFood=customer.getIndexNumberOfOrderedFood();
//ArrayList<FoodItem> list=menu.getArraylist();
//ArrayList<Integer> quantityOfFoodItem=customer.getquantityOfFoodItem();
//int indexNumber=0;
 int priceOfAllFoodOrder=0;
 int indexNumber=0;
System.out.println("FoodItems   & Quantity");
//int indexNumber=0;
for(Map.Entry<FoodItem,Integer> entry: order.entrySet()){
System.out.println(entry.getKey().getfoodName()+" "+entry.getValue());

int priceOfEachFoodOrder=entry.getValue()*entry.getKey().getfoodPrice();

priceOfAllFoodOrder = priceOfEachFoodOrder+priceOfAllFoodOrder;
//indexNumber++;
}
System.out.println("Total money to pay   "+priceOfAllFoodOrder+"Rupees");
 System.out.println("*****");

}
}