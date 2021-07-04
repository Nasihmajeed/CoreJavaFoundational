package com.lxisoft.hotel;

import com.lxisoft.hotel.Menu;
import com.lxisoft.hotel.Customer;
import java.util.*;
public class Admin {
Customer customer = new Customer();
Menu menu=new Menu();
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
  public void takeOrderFromCustomer(){
customer.giveOrderToWaiter();
  }
}