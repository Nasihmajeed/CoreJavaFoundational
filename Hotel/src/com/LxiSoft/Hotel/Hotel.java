package com.LxiSoft.Hotel;
public class Hotel
{
	Menu menu=new Menu();
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
	menu.getOrderDetails();
}
}
   
