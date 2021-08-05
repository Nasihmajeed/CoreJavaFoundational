package com.lxisoft.hotel;
import com.lxisoft.hotel.Customer;
import com.lxisoft.menu.Order;
import java.util.*;

public class Cashier {

public void printBill(Customer customer){
ArrayList<Order> 
 orderList=customer.getOrderlist();
 int priceOfAllFoodOrder=0;
System.out.println("FoodItems and It's Prices");
int arrayNumber;
int arrayListSize=orderList.size();
for( arrayNumber=0;arrayNumber<arrayListSize;arrayNumber++){
System.out.println(1+arrayNumber +".    "+ orderList.get(arrayNumber).getSelectedFoodName()+" "+ orderList.get(arrayNumber).   getSelectedFoodItemPrice()+"\n");

int  priceOfEachFoodOrder=orderList.get(arrayNumber).getSelectedQuantityOfFoodItem()*orderList.get(arrayNumber).getSelectedFoodItemPrice();
 priceOfAllFoodOrder = priceOfEachFoodOrder+priceOfAllFoodOrder;
}
System.out.println("Total money to pay   "+priceOfAllFoodOrder+"Rupees");
  System.out.println("***********");

}
}