package com.LxiSoft.Hotel;
import java.util.Scanner;
public class Menu
{	
    Order order=new Order();
     Scanner input = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int wine=200,cold=20,bear=400,juice=100;
        public void printMenu()
        {
        String order="";
        
        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Wine"+"\t\t"+"200");
            System.out.println("2.ColdDrink"+"\t"+"20");
            System.out.println("3.Bear"+"\t\t"+"400");
            System.out.println("4.Juice"+"\t\t"+"100");
            System.out.println("5.Quit");
            
            int choice=input.nextInt();
            
            switch(choice){
                case 1:System.out.println("Wine"+"\n");
                        sum=sum+wine;
                        order=order.concat("wine"+"\n");
                        
                    break;
                case 2:
                    System.out.println("ColdDrink");
                    sum=sum+cold;
                    order=order.concat("ColdDrink"+"\n");
                    
                       break;
                case 3:
                    System.out.println("Bear");
                    sum=sum+bear;
                    order=order.concat("Bear"+"\n");
                      break;
                case 4:
                    System.out.println("Juice");
                    sum=sum+juice;
                    order=order.concat("Juice"+"\n");
                    break;
                case 5:
                     quit=true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }while(!quit);
       
        System.out.println("Your Orders are:\n"+order);
        System.out.println("Your total bill="+sum);
        
         System.out.println("Thank you");
    
        }

        
        
    
    }
    
