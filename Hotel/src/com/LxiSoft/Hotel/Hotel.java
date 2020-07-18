package com.LxiSoft.Hotel;
import com.LxiSoft.Admin.Admin;
import java.util.Scanner;
public class Hotel
{
    Menu menu=new Menu();
    Admin admin=new Admin();
    Order order=new Order();
    Scanner scnr = new Scanner(System.in);

public void printHotel()
     {
      
    System.out.println("       ************************************************************************");
    System.out.println("       *                                                                      *");
    System.out.println("       *                       HOTEL MALABAR                                  *");   
    System.out.println("       *                         Meenadom                                     *");
    System.out.println("       *                                                                      *");
    System.out.println("       ************************************************************************");

}

public void printDetail()
{  
 int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. User Menu \n\n2. Manager \n\n Press 0 for Exit \n");
        choice=scnr.nextInt();
        if(choice==1)
        {
            menu.myMenu();
           menu.printMenu();
          order.getOrder();
        }
        if(choice==2)
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
   
