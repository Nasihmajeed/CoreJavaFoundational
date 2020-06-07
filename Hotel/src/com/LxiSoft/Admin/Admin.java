package com.LxiSoft.Admin;
import com.LxiSoft.Hotel.Hotel;
import com.LxiSoft.Hotel.Order;
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
        System.out.println("\n\n1.  Menu \n\n2. Add Item \n\n3.Delete Item \n\n Press 0 for Exit \n");
        choice=scnr.nextInt();
        if(choice==1)
        {
           order.setMenu();
        }
        if(choice==2)
        {
           item.editMenu();
        }
         if(choice==03)
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

