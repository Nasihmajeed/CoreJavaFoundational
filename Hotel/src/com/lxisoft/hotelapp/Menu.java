package com.lxisoft.hotelapp;
import java.util.Scanner;
public class Menu
{	
    Order order=new Order();
     Scanner scnr = new Scanner(System.in);
        boolean quit= false;
        int sum=0;        
        int chickenmandhi=550,chickenbiriyani=120,alfahm=400,shavayi=430,softdrinks=50;

        public void printMenu()
        {
        String order="";
        
        do
        {
            System.out.println("ITEM"+"\t\t\t"+"Price");
            System.out.println("1.Chicken Mandhi"+"\t\t\t\t"+"550");
            System.out.println("2.Chicken Biriyani"+"\t\t\t"+"120");
            System.out.println("3.Alfahm"+"\t\t\t\t"+"400");
            System.out.println("4.Shavayi"+"\t\t\t\t"+"430");
            System.out.println("5.Soft Drinks"+"\t\t\t\t"+"50");
            System.out.println("6.Quit");
            
            int choice=scnr.nextInt();
            
            switch(choice)
            {
                
                case 1:System.out.println("Chicken Mandhi"+"\n");
                        sum=sum+chickenmandhi;
                        order=order.concat("Chicken Mandhi"+"\n");
                        
                    break;
                case 2:
                    System.out.println("Chicken Biriyani");
                    sum=sum+chickenbiriyani;
                    order=order.concat("Chicken Biriyani"+"\n");
                    
                       break;
                case 3:
                    System.out.println("Alfahm");
                    sum=sum+alfahm;
                    order=order.concat("Alfahm"+"\n");
                      break;
                case 4:
                    System.out.println("Shavayi");
                    sum=sum+shavayi;
                    order=order.concat("Shavayi"+"\n");
                    break;
                case 5:
                    System.out.println("Soft Drinks");
                    sum=sum+softdrinks;
                    order=order.concat("Soft Drinks"+"\n");
                    break;

                case 6:
                     quit=true;
                     
                    break;
                default:
                    System.out.println("Entered Wrong Input");
            }
        
        }
        while(!quit);
       
        System.out.println("Your Orders are:\n"+order);        
        System.out.println("Your total bill="+sum);
        System.out.println("")
        System.out.println("Enjoy Your Meals");
        System.out.println("Thank You Visit Again ");
    
        }

        
        
    
    }
    
