package com.lxisoft.hotel;
import java.util.Scanner;
public class Order{

    Food food=new Food();
    

   

       

    public void getOrderDetails(){

        System.out.println("GIVE YOUR ORDER PLEASE......");
        
        
        Scanner scanner=new Scanner(System.in);
        
          


        boolean quit= false;
        int sum=0;
        int priceChickenBiriyani=100,priceVegBiriyani=80,priceRegularMeals=70;
       
        
        String order="";
        
        do
        {
          /*  System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.CHICKEN BIRIYANI"+"\t\t"+"100");
            System.out.println("2.VEG BIRIYANI"+"\t"+"80");
            System.out.println("3.REGULAR MEALS"+"\t\t"+"70");
            System.out.println("4.JUICE"+"\t\t"+"30");
            System.out.println("5.Quit");*/
            
            int choice=scanner.nextInt();
            
            switch(choice)
            {
                case 1:System.out.println("CHICKEN BIRIYANI"+"\n");
                        sum=sum+priceChickenBiriyani;
                        order=order.concat("CHICKEN BIRIYANI"+"\n");
                        
                    break;
                case 2:
                    System.out.println("VEG BIRIYANI");
                    sum=sum+priceVegBiriyani;
                    order=order.concat("VEG BIRIYANI"+"\n");
                    
                       break;
                case 3:
                    System.out.println("REGULAR MEALS");
                    sum=sum+priceRegularMeals;
                    order=order.concat("REGULAR MEALS"+"\n");
                      break;
               
                case 4:
                     quit=true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }
        while(!quit);
        System.out.println("-----------------------------------------------");
        System.out.println("-Your Orders are:\n-"+order);
        System.out.println("-----------------------------------------------");
        System.out.println("Your total bill="+sum);
        System.out.println("Thank you");
    
        }

       
}





    
    
