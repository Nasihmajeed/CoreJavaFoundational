package com.lxisoft.Admin;
import com.lxisoft.hotelapp.Hotel;
import com.lxisoft.hotelapp.Menu;
import java.util.Scanner;

public class Admin
{
	Menu menu=new Menu();
    Scanner s=new Scanner(System.in);
	    

	public void getMenu( )
	{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println(" \n\n1. Add Item \n\n2.Delete Item \n\n Press 0 for Exit \n");
        choice=s.nextInt();
      
        if(choice==1)
        {
           menu.addFood();
        }
         if(choice==2)
        {
            menu.deleteFood();
        }
        else if (choice==0)
        {
        	 System.out.println(" ");
             System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}
