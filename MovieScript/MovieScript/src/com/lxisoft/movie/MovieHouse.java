package com.lxisoft.movie;

import java.util.HashMap;
import java.util.Scanner;

public class MovieHouse extends Info
{
	MultiplexTheatre theatre = new MultiplexTheatre();
	public void start() throws MyEx{
		
	Scanner sc = new Scanner(System.in);
	int c = 0;
	do {
	HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("t1", "THEATRE_1");
	hm.put("t2", "THEATRE_2");
	Info.adress();
	ticketInfo();
	System.out.println("----THEATRE LIST-----");
	System.out.println("---------------------");
	System.out.println("1."+hm.get("t1"));
	System.out.println("2."+hm.get("t2"));
	System.out.println("Enter ur Choice:");
	int ch = sc.nextInt();
	if(ch>2)
	{
		throw new MyEx("error");
	}
	try {
		switch(ch)
		{
		case 1:theatre.MultiplexMovieMenu();break;
		case 2:theatre.MultiplexMovieMenu("Grand");break;
		default:System.out.println("Select Valid Choice...");break;
		}
		System.out.println("Do You want To Watch Movie ...(Press 1)");
		c = sc.nextInt();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}while(c==1);
	}
	
	
	public void ticketInfo() {
		System.out.println("Ticket Rate:120.Including GST....");
		
	}
}
