package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu{

	Order order=new Order();
	Food food=new Food();

   
    Scanner scanner=new Scanner(System.in);
    ArrayList<Food> menuList = new ArrayList<Food>();

     public void printMenuDetails(){


        menuList.add(new Food());
        menuList.get(0).setFoodName("VEG MEALS");
        menuList.get(0).setFoodPrice(10);

        menuList.add(new Food());
        menuList.get(1).setFoodName("NON VEG MEALS");
        menuList.get(1).setFoodPrice(15);

        for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }
        }
    }
      
     


     


     	




         









        
        

