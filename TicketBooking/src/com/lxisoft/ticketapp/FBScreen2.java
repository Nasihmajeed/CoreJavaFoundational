package com.lxisoft.ticketapp;
import java.util.Scanner;
public class FBScreen2
{
	Scanner s =new Scanner(System.in);
	public void printScreen2()
	{

		System.out.println("\tMOVIE");
		System.out.println("________________________");
		System.out.println("THURAMUKHAM");
		System.out.println("Ticket Price RS.150");
		for(int i=10; i>0; i--)
		{
			System.out.println("\n Enter Name");
			String fbname=s.nextLine();
			

			System.out.println("\n Enter Seat Number");
			int fbticket=s.nextInt();
			
			
			System.out.println("Seats Available "+i);


		}
		
		System.out.println(" ");
		System.out.println("NO Seats Available");
		
	}
}