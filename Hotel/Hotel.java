package com.lxisoft.hotel;

import com.lxisoft.user.Cashier;
import com.lxisoft.user.Customer;
import com.lxisoft.hotel.Menu;
import com.lxisoft.user.Admin;
import java.util.*;
public class Hotel {

Admin admin = new Admin();

Menu menu=new Menu();
Customer customer =new Customer();
Cashier cashier = new Cashier();
Scanner input=new Scanner(System.in);

public void showHotelDetail(){
  System.out.println("WELCOME TO PARIS HOTEL");
  }
  public void inputUserDetail(){
  int userIdentificationNumber;
  
    System.out.println("Select Who Are You");
    System.out.println("1 For Admin \n2 For Customer \n3 For Exit");
 //  menu.inbuiltMenuList();
   userIdentificationNumber=input.nextInt();
   input.nextLine();

    switch (userIdentificationNumber){
      case 1: System.out.println("Admin");
     admin.adminVerification();
     menu.inbuiltMenuList();
      menu.printFoodMenu();
     admin.addFoodDetail(menu);
      menu.printFoodMenu();
     this.inputUserDetail();
      break;
      case 2: System.out.println("Customer");
      menu.printFoodMenu();
     //menu.orderFoodFromMenu();
     customer.giveOrder(menu);
   cashier.calculateBill(customer,menu);
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