package com.lxisoft.user;

import com.lxisoft.hotel.Menu;
import com.lxisoft.hotel.FoodItem;
//import com.lxisoft.hotel.Customer;
import java.util.*;
public class Admin {
//Customer customer = new Customer();
//Menu menu;
Scanner input=new Scanner(System.in);
int userEnteredPassword;
public void adminVerification(){
  int originalPassword=123;
  System.out.println("Enter Password");
  userEnteredPassword=input.nextInt();
  input.nextLine();
  if(userEnteredPassword==originalPassword){
    System.out.println("Welcome");
  }
  else{
    System.out.println("Wrong Password");
  }
  } 
  public void addFoodDetail(Menu menu){
  //this.menu=menu;
 ArrayList<FoodItem> list=menu.getArraylist();
System.out.println("Enter Index No Of food Item");
int indexNumber=input.nextInt();
indexNumber=indexNumber-1;
int loopNumberToAddItem;

  System.out.println("Enter how many food Items you want To add");
 int numberOfItemUserToAddOnMenu=input.nextInt();
 
  input.nextLine();
  for(loopNumberToAddItem=0;loopNumberToAddItem<numberOfItemUserToAddOnMenu;loopNumberToAddItem++){
   
//  list.add(new FoodItems());

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
 // return menu;
  }
  
  }