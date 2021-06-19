package com.lxisoft.mahesan711.Hotel;

import com.lxisoft.mahesan711.Hotel.Menu;
import java.util.*;
public class Admin {

Menu menu=new Menu();
Scanner input=new Scanner(System.in);
int num;
public void conformation(){
  int password=123;
  System.out.println("Enter Password");
  num=input.nextInt();
  input.nextLine();
  if(num==password){
    System.out.println("Welcome");
  }
  else{
    System.out.println("Wrong Password");
  }
  } 
}