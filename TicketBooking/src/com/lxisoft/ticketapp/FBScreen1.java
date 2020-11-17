package com.lxisoft.ticketapp;
import java.util.Scanner;
public class FBScreen1
{Scanner s =new Scanner(System.in);
	public void printScreen1()
	{

		System.out.println("\tMOVIE");
		System.out.println("________________________");
		System.out.println("MALIK");
		System.out.println("Ticket Price RS.120");
		for(int i=10; i>0; i--)
		{
			System.out.println("\n Enter Name");
			String fbname=s.nextLine();
			

			System.out.println("\n Enter Seat Number");
			int fbticket=s.nextInt();
			
			System.out.println("Total Amount "+i*150);
			System.out.println("Seats Available "+i);


		}
		
		System.out.println(" ");
		System.out.println("NO Seats Available");
	}
}	
