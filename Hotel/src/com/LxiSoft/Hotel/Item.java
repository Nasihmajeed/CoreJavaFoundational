package com.LxiSoft.Hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Item
{	
	int n;
    Scanner scnr=new Scanner(System.in);
    ArrayList<String> theMenu = new ArrayList<String>();

    public void setMenu()
    {
 	
 	theMenu.add("Tea");
 	theMenu.add("Coffee");
 	theMenu.add("Lime");
 	theMenu.add("Juice");
 	 for (int i = 0; i < theMenu.size();i++) 
	      { 		      
	          System.out.println(theMenu.get(i)); 		
	      }   		
  
}
	public void editMenu()
	{
		System.out.println (" \n Enter number of items to be added ");
	n=scnr.nextInt();
    scnr.nextLine();
    
    for (int i=1; i<=n; i++)
    {

        System.out.println("\n enter item " +i+  " details");
        theMenu.add(i);
          System.out.println(theMenu.get(i)); 
       
    }
	}
}

    
    

