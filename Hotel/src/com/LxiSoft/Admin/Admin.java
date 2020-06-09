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
        System.out.println(" \n\n1. Add Item \n\n2.Delete Item \n\n Press 0 for Exit \n");
        choice=scnr.nextInt();
      
        if(choice==1)
        {
           menu.addItem();
        }
         if(choice==2)
        {
            item.editMenu();
        }
        else if (choice==0)
        {
        	 System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}


