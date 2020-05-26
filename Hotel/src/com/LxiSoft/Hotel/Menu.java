package com.LxiSoft.Hotel;
import java.util.Scanner;
public class Menu
{	
	
	public void getOrderDetails()
	{
		
		
		System.out.println("enter your no. of orders");
		Scanner sc=new Scanner(System.in);
		int itemNumber=sc.nextInt();
		
		  

        for ( int i = 1; i <= itemNumber ; i ++ )
         {
System.out.println("\n choose your item by pressing the corespondiong no.");
       System.out.println("Enter 1 for coffee");
       System.out.println("Enter 2 for TeA");
       System.out.println("Enter 3 for lIME");

         
				int choice;          
           
				System.out.println("ENTER YOUR CHOICE");

				choice=sc.nextInt();
		
           

        	String food;

        
        switch (choice) {
            case 1:
                food = " coffee";
                break;
            case 2:
                food = "tea";
                break;
            case 3:
                food = "fresh lime";
                break;

            default:
                food = "NO SUCH item";
                break;
        }
        System.out.println("The choice is " + food);
    }
}
}
