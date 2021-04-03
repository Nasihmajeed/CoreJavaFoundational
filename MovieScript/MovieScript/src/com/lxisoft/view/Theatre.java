package com.lxisoft.view;
import com.lxisoft.view.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum Seats
{
	VIP,NORMAL;   		
}

public class Theatre
{
	int ticketRate;
	String theatre;
	String place;
	int[] age;
	Seats seat;

	public Theatre()
	{
		theatre = "LUMIERE";
		place = "KOTTAKKAL";
	}

	public void selectSeat()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("                 	 	 "+theatre);
		System.out.println("                 		"+place);
		System.out.println("\n   This movie is certified  as an 18+ movie. Below 18 are not allowed.");
		System.out.println("          The seats are limitted due to COVID-19 pandemic.");
		System.out.println("   Obey COVID-19 protocols : Masks, Sanitizers and Social distancing.");
		System.out.println("+-----------------------------------------------------------------------+");
		
		System.out.println("Seat type : \n          1.VIP 	Rs:200/-\n          2.Normal	Rs:120/-");
		int seats = s.nextInt();
		
		if(seats == 1)
		{
			seat = Seats.VIP;
		}
		else if(seats == 2)
		{
			seat = Seats.NORMAL;
		}
		else
		{
			System.out.println("\n Invalid entry \n Try again");
			this.selectSeat();
		}
		
		switch (seat) 
		{
			case VIP:
			ticketRate = 200;
			this.booking(ticketRate);
			break;

			case NORMAL:
			ticketRate = 120;
			this.booking(ticketRate);	
			break;		
		}
	}

	public void booking(int rate)
	{
		Scanner s = new Scanner(System.in);
		age = new int[10];
		System.out.print("Number of Tickets (4 per head) : ");
		int num = s.nextInt();
		if (num > 4)
		{
			System.out.println("Maximum 4 tickets can be booked");
		}
		else
		{
			for(int i=0; i<num; i++)
			{
				System.out.print("Viewer "+(i+1)+" ; Age : ");
				age[i] = s.nextInt();
				assert(age[i] >18);
				// System.out.println("Permitted ");//" Age :"+age[i]);
				if(age[i]<18)
				{
					System.out.println("\nViewer "+(i+1)+" : (below 18) Not permitted ");
					System.out.println("\nTry again");
					return;
				}
				else
				{
					System.out.println("Permitted ");
					
				}
			}
			System.out.println("\n	Number of tickets booked : "+num+" \n	Total amount	 	 : "+(num*rate));
			System.out.println("\n	1.Confirm \n 	2.Clear");
			Scanner sc = new Scanner(System.in);
			int confirm = sc.nextInt();
			if (confirm == 1)
			{
				System.out.println("\n	Booking confirmed."); 
			}
			else
			{
				
				return;
			}
			System.out.println("\n Thank you. ");
			return;
		}
	}

	public void search()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\n	Enter actor name : ");
		String actor = s.nextLine();
		Pattern pattern = Pattern.compile(actor);
		Matcher matcher = pattern.matcher("Dileep");
		Matcher matcher1 = pattern.matcher("Kalabhavan Mani");
		Matcher matcher2 = pattern.matcher("Bhavna Pani");
		Matcher matcher3 = pattern.matcher("Mithun Ramesh");
		if(matcher.matches())
		{
			System.out.println(" 	Actor "+actor+" is acting in this movie");
		}
		else if(matcher1.matches())
		{
			System.out.println(" 	Actor "+actor+" is acting in this movie");
		}
		else if(matcher2.matches())
		{
			System.out.println(" 	Actor "+actor+" is acting in this movie");
		}
		else if(matcher3.matches())
		{
			System.out.println(" 	Actor "+actor+" is acting in this movie");
		}
		else
		{
			System.out.println(" 	Actor "+actor+" is not acting in this movie");
			return;
		}
	}
}