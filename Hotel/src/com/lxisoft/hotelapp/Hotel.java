package com.lxisoft.hotelapp;
import java.util.Scanner;
public class Hotel
{
	Menu menu=new Menu();
    Order order=new Order();
    String[] food =new String[10];
Scanner input = new Scanner(System.in);
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
    System.out.println("");
    System.out.println("");

}
public void printDetail()
{   int choi=0;
    do{
      System.out.println("\n________________________");
        System.out.println("\n\n1. User Menu \n\n2. Manager \n\n Press 0 for Exit \n");
        choi=input.nextInt();
        if(choi==1)
        {
	       menu.printMenu(food);
        }
        if(choi==2)
        {
           order.viewOrder(food);
        }
        else if(choi==0)
        {
            System.out.println(" ");
        }
    }while(choi>0);
}
}
   
