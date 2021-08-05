package com.lxisoft.hotel;
//import com.lxisoft.hotel.Employee;
import com.lxisoft.menu.FoodItem;
import com.lxisoft.hotel.Menu;
import com.lxisoft.menu.Order;
import java.util.*;
//import java.util.Scanner;


public class Customer {
//Employee e=new Employee();
ArrayList<Order> orderList=new ArrayList<Order>();
Scanner input = new Scanner(System.in);

//Menu menu;
//ArrayList<FoodItem> list;
//menu.orderFoodFromMenu(ArrayList<FoodItem> list);
public void printSelectedFoodAndBill(Menu menu){
//this.menu=menu;
ArrayList<FoodItem> list=menu.getArraylist();
  //this.foodMenuList();
  //this.printFoodMenu();
int numberOfFoodOrder; int totalPriceOfAllFoodOrder=0;
System.out.println("Enter how many dishes you want to order");
numberOfFoodOrder=input.nextInt();
for(int numberToRunLoop=0;numberToRunLoop<numberOfFoodOrder;numberToRunLoop++){
  System.out.println("Enter the Item Number");
  int foodItemIndexNumber=input.nextInt();
  input.nextLine();
 int foodItemPrice =list.get(foodItemIndexNumber-1).getfoodPrice();
 String foodName=list.get(foodItemIndexNumber-1).getfoodName();
  
 
 System.out.println("Enter Quantity You Need");
 int quantityOfFoodItem=input.nextInt();
  input.nextLine();
   orderList.add(new Order( foodItemPrice, quantityOfFoodItem,foodName));
  }
  }
 public ArrayList<Order> getOrderlist(){
  return orderList;
}

}

  
 
 // System.out.println("food Item : "+list.get(foodItemIndexNumber-1).getfoodName());
 // System.out.println("total price: "+quantityOfFoodItem*list.get(foodItemIndexNumber-1).getfoodPrice());
 
  //int priceOfAllFoodOrder=totalPriceOfAllFoodOrder+quantityOfFoodItem*list.get(foodItemIndexNumber-1).getfoodPrice();
//   }
   
//   System.out.println("Total money to pay   "+totalPriceOfAllFoodOrder+"Rupees");
   //System.out.println("***********");
//   }
   
//menu.printFoodMenu();
//  menu.orderFoodFromMenu();

//}