package com.lxisoft.hotelapp;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu
{
	int n;
  Food food=new Food();
  Scanner s = new Scanner(System.in);
	ArrayList<Food> foodMenu = new ArrayList<Food>();
    public void foodMenu()
    {
    	foodMenu.add(new Food());
     	foodMenu.get(0).setName("Chicken Mandhi\t");
     	foodMenu.get(0).setPrice(550);
     	
     	foodMenu.add(new Food());
     	foodMenu.get(1).setName("Chicken Biriyani");
     	foodMenu.get(1).setPrice(120);
     	
     	foodMenu.add(new Food());
     	foodMenu.get(2).setName("Alfahhm\t\t");
     	foodMenu.get(2).setPrice(430);
     	
     	foodMenu.add(new Food());
     	foodMenu.get(3).setName("Shavayi\t\t");
     	foodMenu.get(3).setPrice(480);
    }
  
  	public void printMenu()
     {
     	System.out.println("\t MENU    \t Price");
     	for (int i=0; i<foodMenu.size(); i++)
     	{	
     		System.out.println("\n"+(i+1)+"\t"+foodMenu.get(i).getName()+"\t \t"+foodMenu.get(i).getPrice());
     	}
     }
     public void addingFood()
    	{
      		foodMenu.add(new Food());
          {

    		System.out.println("\n Enter Food name");
			String name=s.nextLine();
      		s.nextLine();

       		System.out.println("\n Enter Food prize");
       		int prize=s.nextInt();
      

       		foodMenu.get(4).setName(name);
       		foodMenu.get(4).setName(price);
    	}
    }
    public void deleteFood()
   		{ 

      		System.out.println("Enter item to be deleted");


  			int n=s.nextInt()  ;
    		foodMenu.remove(n-1);
    	} 
    public void updateMenu()
    	{
     
       		System.out.println("Enter index number of item to b update: ");
       		int n=s.nextInt();

       		System.out.println("Enter  item name to update");
       		String name=s.nextLine();
       		foodMenu.get(n-1).setName(name);
        	s.nextLine();

         	System.out.println("Enter updated item price");
            int price=s.nextInt();
       		foodMenu.get(n-1).setPrice(price);
      }
    public void getOrder()
    {
        System.out.println("Your Order Please");
        System.out.println("PRESS 0 TO QUIT");
        boolean quit= false;
        int sum=0;
        String order="\n ";
                
        do
        {

          int foodnumber=s.nextInt();
          switch(foodnumber)
                {
                    case 1:
                    System.out.println(foodMenu.get(0).getName());
                    sum=sum+foodMenu.get(0).getPrice();
                    order=order.concat(foodMenu.get(0).getName());
                    break;

                    case 2:
                    System.out.println(foodMenu.get(1).getName());
                    sum=sum+foodMenu.get(1).getPrice();
                    order=order.concat(foodMenu.get(1).getName());
                    break;

                    case 3:
                    System.out.println(foodMenu.get(2).getName());
                    sum=sum+foodMenu.get(2).getPrice();
                    order=order.concat(foodMenu.get(2).getName());
                    break;

                    case 4:
                    System.out.println(foodMenu.get(3).getName());
                    sum=sum+foodMenu.get(3).getPrice();
                    order=order.concat(foodMenu.get(3).getName());
                    break;

                    case 0:
                    quit=true;
                    default:
                    System.out.println("Wrong input");

                }  
            
           }
           while(!quit);
          