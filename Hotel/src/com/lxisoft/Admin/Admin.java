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
        System.out.println(" \n\n1. View Menu \n\n2. Add Item  \n\n3. Delete Item \n\n4. Update Menu \n\nPress 0 for Exit \n");
        choice=s.nextInt();
      
         if(choice==1)
         {
          menu.printMenu();
         }

         if(choice==2)
        {
          
          menu.printMenu();
          menu.addItem();
          menu.printMenu();
        }
         if(choice==3)
        {
          menu.printMenu();
          menu.deleteItem();
          menu.printMenu();
        }
          if(choice==4)
        {
          menu.printMenu();
          menu.updateMenu();
          menu.printMenu();
        }
        else if (choice==0)
        {
             System.out.println(" ");
        }
    }
    while(choice>0);
      
}
}
