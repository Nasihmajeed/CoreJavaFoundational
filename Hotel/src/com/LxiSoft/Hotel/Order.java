package com.LxiSoft.Hotel;
import java.util.Scanner;
public class Order
{
	public void getOrderDetails()
	{
		
		
		System.out.println("enter your no. of orders");
		Scanner sc=new Scanner(System.in);
		int itemNumber=sc.nextInt();
		
		  

        for ( int i = 1; i <= itemNumber ; i ++ )
         {
      

         
				int choice;          
           
				System.out.println("ENTER YOUR CHOICE");

				choice=sc.nextInt();
		
           

        	String food;

        
        switch (choice) {
            case 1:
                food = " coffee-----------Rs.10";
                break;
            case 2:
                food = "tea---------------Rs.10";
                break;
            case 3:
                food = "fresh lime--------Rs.10";
                break;

            default:
                food = "NO SUCH item";
                break;
        }
        System.out.println("The choice is " + food);
    }
}
public void printOrderDetails()
{

}
}
