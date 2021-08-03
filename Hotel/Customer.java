
package com.lxisoft.user;

import com.lxisoft.hotel.Menu;
import com.lxisoft.menu.FoodItem;
import java.util.*;
public class Customer {
//Menu menu;
Scanner input=new Scanner(System.in);
public void printSelectedFoodAndBill(Menu menu){
	//this.menu=menu;
	ArrayList<FoodItem> list =menu.getArraylist();
  //this.foodMenuList();
  //this.printFoodMenu();
int numberOfFoodOrder; int totalPriceOfAllFoodOrder=0;
System.out.println("Enter how many dishes you want to order");
numberOfFoodOrder=input.nextInt();
for(int numberToRunLoop=0;numberToRunLoop<numberOfFoodOrder;numberToRunLoop++){
  System.out.println("Enter the Item Number");
  int foodItemIndexNumber=input.nextInt();
  input.nextLine();
 
 System.out.println("Enter Quantity You Need");
  int quantityOfFoodItem=input.nextInt();
  input.nextLine();
 
  System.out.println("food Item : "+list.get(foodItemIndexNumber-1).getfoodName());
  System.out.println("total price: "+quantityOfFoodItem*list.get(foodItemIndexNumber-1).getfoodPrice());
 
  totalPriceOfAllFoodOrder=totalPriceOfAllFoodOrder+quantityOfFoodItem*list.get(foodItemIndexNumber-1).getfoodPrice();
   }
   System.out.println("Total money to pay   "+totalPriceOfAllFoodOrder+"Rupees");
   System.out.println("*****************************");
   }

	
	}
