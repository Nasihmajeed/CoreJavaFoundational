package com.lxisoft.hotelapp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.Admin.Admin;
public class Menu
{	
	int n;
     Scanner scnr = new Scanner(System.in);
     ArrayList<Item> theMenu = new ArrayList<Item>();
     public void myMenu()
     {
     	
      theMenu.add(new Item());
     	theMenu.get(0).setName("Chicken Mandhi\t");
     	theMenu.get(0).setPrize(550);
     	theMenu.add(new Item());
     	theMenu.get(1).setName("Chicken Biriyani");
     	theMenu.get(1).setPrize(120);
     	theMenu.add(new Item());
     	theMenu.get(2).setName("Alfahhm\t\t");
     	theMenu.get(2).setPrize(130);
     	theMenu.add(new Item());
     	theMenu.get(3).setName("Shavayi\t\t");
     	theMenu.get(3).setPrize(480);
     	
     }

     public void printMenu()
     {
     	System.out.println("\t MENU    \t Price");
     	for (int i=0; i<theMenu.size(); i++)
     	{	
     		System.out.println("\n"+(i+1)+"\t"+theMenu.get(i).getName()+"\t \t"+theMenu.get(i).getPrize());
     	}
     }
       	

      public void addItem()
      {
        theMenu.add(new Item());

    	 System.out.println("\n enter item name");
			String name=scnr.nextLine();
      scnr.nextLine();

       System.out.println("\n enter item prize");
      int prize=scnr.nextInt();
      

       theMenu.get(4).setName(name);
       theMenu.get(4).setPrize(prize);

    
   }
  public void deleteItem()
   { 

   
  	
  	System.out.println("Enter item to be deleted");


   	int n=scnr.nextInt()  ;
    theMenu.remove(n-1);
    } 
    public void updateMenu()
    {
     
       System.out.println("Enter index number of item to b update: ");
       int n=scnr.nextInt();
       System.out.println("Enter  item name to update");
       String name=scnr.nextLine();
       theMenu.get(n-1).setName(name);
        scnr.nextLine();
         System.out.println("Enter updated item prize");
           int prize=scnr.nextInt();
       theMenu.get(n-1).setPrize(prize);
    }
    
    public void getOrder()
    {
      System.out.println("Your No.Of Orders Please : ");
      int ordernumber=scnr.nextInt();
      int sum=0;
      int total=0;
      int grantTotal=0;
      ArrayList<Item> bill = new ArrayList<Item>();

      for(int i=0;i<=ordernumber;i++)
      {

        System.out.println("Your Order Please : ");
        ordernumber=scnr.nextInt();
        System.out.println("Quantity you need :");
        int quantity=scnr.nextInt();
        total=theMenu.get(ordernumber).getPrize()*quantity;
        System.out.println("Your order and price is"+theMenu.get(ordernumber).getName() +"      "+total);
        bill.add(new Item());
        bill.get(i).setPrize(total);
        grantTotal=grantTotal+bill.get(i).getPrize();   
        System.out.println("Your total bill is"+grantTotal);

      }
    }
  }


		

