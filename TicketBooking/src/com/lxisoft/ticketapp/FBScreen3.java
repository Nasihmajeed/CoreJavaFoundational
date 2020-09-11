package com.lxisoft.ticketapp;
import java.util.Scanner;
public class FBScreen3
{
	
	FBData data=new FBData();
	Scanner s =new Scanner(System.in);
	public void printScreen3()
	{

		System.out.println("\tMOVIE");
		System.out.println("________________________");
		System.out.println("THE PRIEST");
		System.out.println("Ticket Price RS.100");
		System.out.println(" ");
		for(int i=10; i>0; i--)
		{
			System.out.println("\n Enter Name");
			String fbname=s.nextLine();
			data.nextLine;

			System.out.println("\n Enter Seat Number");
			int fbticket=s.nextInt();
			
			
			System.out.println("Seats Available "+i);


		}
		
		System.out.println(" ");
		System.out.println("NO Seats Available");
		


	}
	public void printBill()
	{
		System.out.println(" \tBILL RECIEPT");
		System.out.println("Name:- "+fbname[i].getFBName());
		System.out.println("No.of Tickets :-"+fbticket[i].getFBTicket());
		System.out.println("Total Amount:- "+i*100);
	}

}
