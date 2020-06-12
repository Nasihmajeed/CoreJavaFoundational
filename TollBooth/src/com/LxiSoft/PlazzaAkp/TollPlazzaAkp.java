package com.LxiSoft.PlazzaAkp;
import java.util.Scanner;
public class TollPlazzaAkp
{
	    Scanner scakp = new Scanner(System.in);
	    FastTag fastTag=new FastTag();
	    PaymentAkp paymentAkp=new PaymentAkp();

public void printTollPlazzaAkp()
     {
      
    System.out.println("       ************************************************************************");
    System.out.println("       *                                                                      *");
    System.out.println("       *                      TOLL PLAZZA                                     *");   
    System.out.println("       *                       AMBALLUR                                       *");
    System.out.println("       *                                                                      *");
    System.out.println("       ************************************************************************");

}
public void printMethodAkp()
{  
 int choice=0;
  
    	System.out.println("\n\t Select Payment Method");
      System.out.println("\t________________________");
        System.out.println("\n\n1.FAST TAG \n\n2.ORDINARY PAYMENT \n\n Press 0 for Exit \n");
        choice=scakp.nextInt();
        if(choice==1)
        {
			fastTag.printFasTag();
        }
        if(choice==2)
        { 
        	paymentAkp.collectPaymentAkp();
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    
      
}

   

