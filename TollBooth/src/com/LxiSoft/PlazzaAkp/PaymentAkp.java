package com.LxiSoft.PlazzaAkp;
import java.util.Scanner;
public class PaymentAkp
{
	   Scanner scakp = new Scanner(System.in);
	   CarToll carToll=new CarToll();
	   public void collectPaymentAkp()

{  
 int choice=0;
    
    	System.out.println("\n\t Select any Option");
      System.out.println("\t________________________");
        System.out.println("\n\n1.One Direction \n\n2.Two Direction \n\n Press 0 for Exit \n");
        choice=scakp.nextInt();
        if(choice==1)
        {
			carToll.oneSide();
        }
        if(choice==2)
        {  
        	carToll.twoSide();
        }
        else if(choice==0)
        {
         System.out.println(" ");
        }
  
      
}


	   }
