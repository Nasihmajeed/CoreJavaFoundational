package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu{

	Order order=new Order();
	Food food=new Food();

   
    Scanner scanner=new Scanner(System.in);
    ArrayList<Food> menuList = new ArrayList<Food>();

     public void printMenuDetails(){
       //print items in arraylist 
     System.out.println("WHAT WOULD YOU LIKE TO HAVE");
     menuList.add(new Food());
     menuList.get(0).setFoodName("Regular Meals");
     menuList.get(0).setFoodPrice(80);
        menuList.add(new Food());
     menuList.get(1).setFoodName("Chicken Biriyani");
     menuList.get(1).setFoodPrice(120);
        menuList.add(new Food());
     menuList.get(2).setFoodName("Veg Biriyani");
     menuList.get(2).setFoodPrice(100);
        menuList.add(new Food());
     menuList.get(3).setFoodName("Tea");
     menuList.get(3).setFoodPrice(10);
        menuList.add(new Food());
     menuList.get(4).setFoodName("Coffee");
     menuList.get(4).setFoodPrice(15);
        menuList.add(new Food());
     menuList.get(5).setFoodName("Lime juice");
     menuList.get(5).setFoodPrice(20);

     System.out.println("THE MENU ");
     	for (int i=0; i<menuList.size(); i++){
            
        }
     


     	




         









        
        }

    }
    

