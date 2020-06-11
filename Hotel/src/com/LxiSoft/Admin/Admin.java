package com.LxiSoft.Admin;
import com.LxiSoft.Hotel.Hotel;
import com.LxiSoft.Hotel.Menu;
import java.util.Scanner;

public class Admin
{
	Scanner scnr=new Scanner(System.in);
	  Menu menu=new Menu();
	    Item item=new Item();
	public void getMenu( )
	{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println(" \n\n1. View Menu \n\n2.Add Item  \n\n3. Delete Item  \n\n Press 0 for Exit \n");
        choice=scnr.nextInt();
      
        if(choice==1)
        {
        	menu.myMenu();
           menu.printMenu();
        }
         if(choice==2)
        {
            menu.addItem();
        }
         if(choice==3)
        {
            menu.deleteItem();
        }
        else if (choice==0)
        {
        	 System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}


