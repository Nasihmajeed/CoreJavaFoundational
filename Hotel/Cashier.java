package com.lxisoft.user;
import com.lxisoft.user.Customer;
//import com.lxisoft.hotel.Order;
import com.lxisoft.hotel.FoodItem;
import java.util.*;

public class Cashier {

public void printBill(Customer customer){
//customer.getOrder(order,quantityOfFoodItem);
 HashMap<String,Integer> order=customer.order;
ArrayList<Integer> quantityOfFoodItem=customer.quantityOfFoodItem;
 int priceOfAllFoodOrder=0;
System.out.println("FoodItems and It's Prices");
int indexNumber=0;
//int arrayNumber;
//int arrayListSize=order.size();
for(String  foodName:order.keySet()){
  System.out.println("key :"+ foodName);
  System.out.println(order.get(foodName));
System.out.println(quantityOfFoodItem.get(indexNumber));
/*for(FoodItem arrayListDetails:order.get(quantityValue))
System.out.println(arrayListDetails.getfoodName());*/

int   priceOfEachFoodOrder=quantityOfFoodItem.get(indexNumber)*order.get(foodName);
priceOfAllFoodOrder = priceOfEachFoodOrder+priceOfAllFoodOrder;
indexNumber++;
}
System.out.println("Total money to pay   "+priceOfAllFoodOrder+"Rupees");
  System.out.println("*****");

}
}