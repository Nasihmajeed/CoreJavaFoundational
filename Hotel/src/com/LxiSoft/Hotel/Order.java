package com.LxiSoft.Hotel;
import java.util.Scanner;
public class Order
{
         Scanner scnr = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int tea=10,coffee=15,lime=20,juice=30;
        public void setMenu()
        {
        String order="";
        
        do
        {
            System.out.println("\n ITEM"+"\t\tPrice");
            System.out.println("1.Tea"+"\t\t"+"10");
            System.out.println("2.Coffee"+"\t"+"15");
            System.out.println("3.Lime"+"\t\t"+"20");
            System.out.println("4.Juice"+"\t\t"+"30");
            System.out.println("5.Quit");
            
            int choice=scnr.nextInt();
            
            switch(choice)
            {
                case 1:System.out.println("tea"+"\n");
                        sum=sum+tea;
                        order=order.concat("tea"+"\n");
                        
                    break;
                case 2:
                    System.out.println("coffee");
                    sum=sum+coffee;
                    order=order.concat("coffee"+"\n");
                    
                       break;
                case 3:
                    System.out.println("lime");
                    sum=sum+lime;
                    order=order.concat("lime"+"\n");
                      break;
                case 4:
                    System.out.println("juice");
                    sum=sum+juice;
                    order=order.concat("Juice"+"\n");
                    break;
                case 5:
                     quit=true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }
        while(!quit);
       
        System.out.println("Your Orders are:\n"+order);
        System.out.println("Your total bill="+sum);
        
         System.out.println("Thank you");
    
        }


	}