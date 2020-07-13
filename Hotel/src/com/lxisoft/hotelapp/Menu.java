package com.lxisoft.hotelapp;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu
{
	int n;
  Food food=new Food();
  Scanner s = new Scanner(System.in);
	ArrayList<Food> nonVegMenu = new ArrayList<Food>();
  ArrayList<Food> vegMenu=new ArrayList<Food>();
  ArrayList<Food> drinksMenu=new ArrayList<Food>();
    public void NonVegMenu()
    {
    	nonVegMenu.add(new Food());
     	nonVegMenu.get(0).setName("Chicken Mandhi\t");
     	nonVegMenu.get(0).setPrice(550);
     	
     	nonVegMenu.add(new Food());
     	nonVegMenu.get(1).setName("Chicken Biriyani");
     	nonVegMenu.get(1).setPrice(120);
     	
     	nonVegMenu.add(new Food());
     	nonVegMenu.get(2).setName("Alfahhm\t\t");
     	nonVegMenu.get(2).setPrice(430);
     	
     	nonVegMenu.add(new Food());
     	nonVegMenu.get(3).setName("Shavayi\t\t");
     	nonVegMenu.get(3).setPrice(480);
    }
  
  	public void printNonVegMenu()
     {
     	System.out.println("\t MENU    \t Price");
     	for (int i=0; i<nonVegMenu.size(); i++)
     	{	
     		System.out.println("\n"+(i+1)+"\t"+nonVegMenu.get(i).getName()+"\t \t"+nonVegMenu.get(i).getPrice());
     	}
     }
    public void NonVegMenu()
    {
      vegMenu.add(new Food());
      vegMenu.get(0).setName("Dosa\t");
      vegMenu.get(0).setPrice(10);
      
      vegMenu.add(new Food());
      vegMenu.get(1).setName("Masala Dosa");
      vegMenu.get(1).setPrice(60);
      
      vegMenu.add(new Food());
      vegMenu.get(2).setName("Ghee Roast\t\t");
      vegMenu.get(2).setPrice(50);
      
      vegMenu.add(new Food());
      vegMenu.get(3).setName("Paneer Ticka \t\t");
      vegMenu.get(3).setPrice(120);
      
      vegMenu.add(new Food());
      vegMenu.get(4).setName("Gobi Manjuri \t\t");
      vegMenu.get(4).setPrice(120);      
    }     
    public void printVegMenu()
     {
      System.out.println("\t MENU    \t Price");
      for (int i=0; i<vegMenu.size(); i++)
      { 
        System.out.println("\n"+(i+1)+"\t"+vegMenu.get(i).getName()+"\t \t"+vegMenu.get(i).getPrice());
      }
     }

     public void DrinksMenu()
    {
      drinksMenu.add(new Food());
      drinksMenu.get(0).setName("Tea\t");
      drinksMenu.get(0).setPrice(10);
      
      drinksMenu.add(new Food());
      drinksMenu.get(1).setName("Coffee");
      drinksMenu.get(1).setPrice(15);
      
      drinksMenu.add(new Food());
      drinksMenu.get(2).setName("Fresh Juices\t\t");
      drinksMenu.get(2).setPrice(50);
      
      drinksMenu.add(new Food());
      drinksMenu.get(3).setName("Shakes\t\t");
      drinksMenu.get(3).setPrice(60);
    }
  
    public void printDrinks()
     {
      System.out.println("\t MENU    \t Price");
      for (int i=9; i<drinksMenu.size(); i++)
      { 
        System.out.println("\n"+(i+1)+"\t"+drinksMenu.get(i).getName()+"\t \t"+drinksMenu.get(i).getPrice());
      }
     }

     public void addVegFood()
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
    public void addNonVegFood()
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
          System.out.println("-----------------------------------------------");
          System.out.println("-Your Orders are:\n-"+order);
          System.out.println("-----------------------------------------------");
          System.out.println("Your total bill="+sum);
          System.out.println("Have A Nice Day");
          System.out.println("Please Visit Again");
          System.out.println("Thank You");  
      }
}