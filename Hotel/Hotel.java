package com.lxisoft.hotel;

import com.lxisoft.hotel.Admin;
import com.lxisoft.hotel.Menu;
import java.util.*;
public class Hotel {

Admin admin = new Admin();

Menu menu=new Menu();
Scanner input=new Scanner(System.in);

public void showHotelDetail(){
  System.out.println("WELCOME TO PARIS HOTEL");
  }
  public void inputUserDetail(){
  int userIdentificationNumber;
    System.out.println("Select Who Are You");
    System.out.println("1 For Admin \n2 For Customer \n3 For Exit");
   userIdentificationNumber=input.nextInt();
   input.nextLine();
    switch (userIdentificationNumber){
      case 1: System.out.println("Admin");
     admin.adminVerification();
     menu.foodMenuList();
     menu.printFoodMenu();
      menu.addFoodDetail();
      menu.printFoodMenu();//use of method over loading (polymorphism)
     this.inputUserDetail();
      break;
      case 2: System.out.println("Customer");
      menu.printFoodMenu();
     menu.orderFoodFromMenu();
      //admin.takeOrderFromCustomer();
   this.inputUserDetail();
      break;
      case 3:
      System.out.println("Thank you");
      break;
      default :
      System.out.println("Wrong Entry");
      break;
    }
 }
  }