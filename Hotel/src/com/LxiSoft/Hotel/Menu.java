package com.LxiSoft.Hotel;
import java.util.Scanner;
import java.util.ArrayList;
import com.LxiSoft.Admin.Admin;
public class Menu
{	
	int n;
     Scanner scnr = new Scanner(System.in);
ArrayList<Item> theMenu = new ArrayList<Item>();
     public void myMenu()
     {
     	theMenu.add(new Item());
     	theMenu.get(0).setName("Tea");
     	theMenu.get(0).setPrize(10);
     	theMenu.add(new Item());
     	theMenu.get(1).setName("Coffee");
     	theMenu.get(1).setPrize(15);
     	theMenu.add(new Item());
     	theMenu.get(2).setName("Lime");
     	theMenu.get(2).setPrize(20);
     	theMenu.add(new Item());
     	theMenu.get(3).setName("Juice");
     	theMenu.get(3).setPrize(30);
     	
     }
     
     public void printMenu()
     {
     	System.out.println("MENU    \t prize");
     	for (int i=0; i<theMenu.size(); i++)
     	{	
     		System.out.println("\n" +theMenu.get(i).getName()+"\t \t"+theMenu.get(i).getPrize());
     	}
     }
       	

      public void addItem()
      {
	       	theMenu.add(new Item());

      	System.out.println (" \n Enter number of items to be added ");
	      n=scnr.nextInt();
         scnr.nextLine();

       for (int i=1; i<=n; i++)
    {

		if(theMenu.get(i).getName()==null)

    	{

    	 System.out.println("\n enter item name");
			String name=scnr.nextLine();
       theMenu.get(i).setName(name);
       scnr.nextLine();
      
       System.out.println("\n enter item prize");
      int prize=scnr.nextInt();
       theMenu.get(i).setPrize(prize);
         }
         
        }

     }
    public void deleteItem()
   {
  /* 	theMenu.remove(new Item());
  	System.out.println("Enter index no. of item to be deleted");

   	theMenu.get(i).getName(i)=scnr.nextInt()  ;             */
    } 

		
}
