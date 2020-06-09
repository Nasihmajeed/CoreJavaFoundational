package com.LxiSoft.Hotel;
import java.util.Scanner;
import java.util.ArrayList;
import com.LxiSoft.Admin.Admin;
public class Menu
{	
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
     	for (int i=0; i<theMenu.size(); i++)
     	{
     		System.out.println(theMenu.get(i).getName()   + /t theMenu.get(i).getPrize());
     	}
       	
  
  }
      public void addItem()
      {
     
   }
}
