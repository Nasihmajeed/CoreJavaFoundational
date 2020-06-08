package com.lxisoft.Admin;
import com.lxisoft.hotelapp.Hotel;
import com.lxisoft.hotelapp.Order;
import java.util.Scanner;

public class Admin
{
	Scanner scnr=new Scanner(System.in);
	    Order order=new Order();
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
           item.editMenu();
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
