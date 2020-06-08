package com.lxisoft.hotelapp;
import java.util.Scanner;
public class Menu
{	
    Order order=new Order();
    
     Scanner scnr = new Scanner(System.in);
        boolean quit= false;
        int sum=0,i=0;        
        int chickenmandhi=550,chickenbiriyani=120,alfahm=400,shavayi=430,softdrinks=50;

        public void printMenu(String[] food)
        {
        String menu="";
            do
            {
            System.out.println("ITEM"+"\t\t\t"+"Price");
            System.out.println("1.Chicken Mandhi"+"\t\t\t\t"+"550");
            System.out.println("2.Chicken Biriyani"+"\t\t\t"+"120");
            System.out.println("3.Alfahm"+"\t\t\t\t"+"400");
            System.out.println("4.Shavayi"+"\t\t\t\t"+"430");
            System.out.println("5.Soft Drinks"+"\t\t\t\t"+"50");
            System.out.println("6.Quit");
            System.out.print("Enter the Choice \t:");
            int choice=scnr.nextInt();
            order.createOrder(food,choice,i);
            i++;
            }
            while(i==0);
            
            
        }

        
        
    
    }
    
