package com.lxisoft.hotel;
import java.util.Scanner;
public class Order

{
    Order order=new Order();
    public void createOrder(String[] food, int choice,int i )
    {   
        switch(choice)
            {
                
                case 1: food[i]="Chicken Mandhi"; 
                 System.out.println("Chicken Mandhi"+"\n");
                 
                
                        
                    break;
                case 2: food[i]="Chicken Biriyani"; 
                    System.out.println("Chicken Biriyani");
                   
                 
                    
                       break;
                case 3:food[i]="Alfahm"; 
                    System.out.println("Alfahm");
                    
                    
                      break;
                case 4:food[i]="Shavayi"; 
                    System.out.println("Shavayi");
                    
                    
                    break;
                case 5:food[i]="soft Drinks"; 
                    System.out.println("Soft Drinks");
                    
                    
                    break;

                default:
                    System.out.println("Entered Wrong Input");
            }
            i++;
    }

public void viewOrder(String [] food)
    {
        for (int i=0;i<food.length;i++)
        {
            System.out.println("\nThe Orders Are :");
            System.out.println(food[i]);    
        }
    }   
}