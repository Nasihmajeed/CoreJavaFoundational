package com.LxiSoft.Hotel;
import java.util.Scanner;
public class Menu
{	
    Order order=new Order();
    public void printMenu()
    {
        System.out.println("\t*****MENU*****");
         System.out.println(" choose your item by pressing the corespondiong no.");
        System.out.println("\n Enter 1 for coffee-------Rs.10");
         System.out.println("Enter 2 for TeA------------Rs.10");
        System.out.println("Enter 3 for lIME------------Rs.10");
        order.getOrderDetails();
    }
	
	
}
