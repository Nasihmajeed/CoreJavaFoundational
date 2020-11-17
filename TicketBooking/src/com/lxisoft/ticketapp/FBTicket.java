package com.lxisoft.ticketapp;
import java.util.Scanner;
public class FBTicket
{	
	Scanner s=new Scanner(System.in);
	FBScreen1 screen1=new FBScreen1();
	FBScreen2 screen2=new FBScreen2();
	FBScreen3 screen3=new FBScreen3();
	public void printName()
	{
		System.out.println("       ************************************************************************");
    	System.out.println("       *                                                                      *");
    	System.out.println("       *                          Krishna Cinemas                             *");   
    	System.out.println("       *                       Multiplex 4k Theatre                           *");
    	System.out.println("       *         Pattambi, Pallipuram Road, near putiyagate                   *");
    	System.out.println("       *                                                                      *");
    	System.out.println("       ************************************************************************");
		System.out.println("");
	}
	public void printScreen()
	{
		{
		int choice=0;
		do
		{
			 System.out.println("\n________________________");
			 System.out.println("\n\n1. Screen 1 \n\n2. Screen 2 \n\n3. Screen 3 \n\n Press 0 for Exit \n");
			 choice=s.nextInt();
			 if(choice==1)
			 {
			 	screen1.printScreen1();
			 }
			 if(choice==2)
			 {
			 	screen2.printScreen2();
			 }
			if(choice==3)
			 {
			 	screen3.printScreen3();
			 }
			 else if(choice==0)
			 {
			 	System.out.println(" ");
			 }

		}while(choice>0);
		System.out.println(" ");
	}
	}
}