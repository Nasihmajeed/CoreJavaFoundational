package com.lxisoft.hotelapp;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
public class Hotel
{
    Menu menu=new Menu();
	Item item=new Item();
    Admin admin=new Admin();
    Order order=new Order();
    Scanner scnr = new Scanner(System.in);

public void printHotel()
     {
      
        System.out.println("       ************************************************************************");
        System.out.println("       *                                                                      *");
        System.out.println("       *                          Top Chicken                                 *");   
        System.out.println("       *                    Multi Cuisine Restuarent                          *");
        System.out.println("       *         Mele Pattambi, Palakkad Road, Near juma Masjid               *");
        System.out.println("       *                                                                      *");
        System.out.println("       ************************************************************************");
        System.out.println("");
}

public void printDetails()
{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. Customer Menu \n\n2. Admin \n\n3. Employees \n\n Press 0 for Exit \n");
        choice=scnr.nextInt();
        if(choice==1)
        {
            menu.myMenu();
           menu.printMenu();
           menu.getOrder();
        }
        if(choice==2)
        {
             
           admin.getMenu();
         
        }
        if(choice==3)
        {
             
           admin.getMenu();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
}

}
   
