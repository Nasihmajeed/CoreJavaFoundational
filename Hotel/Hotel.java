package com.lxisoft.Hotel;

import com.lxisoft.Hotel.Admin;
import com.lxisoft.Hotel.Menu;
import java.util.*;
public class Hotel {

Admin admin = new Admin();

Menu menu=new Menu();
Scanner input=new Scanner(System.in);

public void showDetails(){
  System.out.println("WELCOME TO PARIS HOTEL");
  }
  public void inputDetails(){
  int num;
    System.out.println("Select Who Are You");
    System.out.println("1 For Admin \n2 For Customer \n3 For Exit");
   num=input.nextInt();
   input.nextLine();
    switch (num){
      case 1: System.out.println("Admin");
     admin.conformation();
     menu.printMenu();
      menu.addFoodDetails();
      menu.printMenu(3);//use of method over loading (polymorphism)
     this.inputDetails();
      break;
      case 2: System.out.println("Customer");
      menu.printMenu();
     menu.orderFood();
   this.inputDetails();
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