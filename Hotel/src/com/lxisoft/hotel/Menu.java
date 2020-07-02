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
        menuList.get(0).setFoodPrice(60);

        menuList.add(new Food());
        menuList.get(1).setFoodName("NON VEG MEALS");
        menuList.get(1).setFoodPrice(80);

        menuList.add(new Food());
        menuList.get(2).setFoodName("VEG BIRIYANI");
        menuList.get(2).setFoodPrice(100);

        menuList.add(new Food());
        menuList.get(3).setFoodName("NON BIRIYANI");
        menuList.get(3).setFoodPrice(150);




        for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }
        }

        public void addDynamically(){

            System.out.println("Enter the food items to be added");
            String element=menuList.get(4).setFoodName();
        }
    }
      
     


     


     	




         









        
        

