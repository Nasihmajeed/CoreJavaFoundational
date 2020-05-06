package com.lxisoft.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultiplexTheatre {
	
	static Scanner sc = new Scanner(System.in);
	Movie movie1 = new Movie();
	Movie movie2 = new Movie();
	ArrayList<Movie> movieList = new ArrayList<Movie>();
	{
	movie2.setMovieName("Terminator\n");
	movie1.setMovieName("Avenger");
	}
	public void MultiplexMovieMenu()
	{	
		System.out.println("----AROMA-----");
		System.out.println("1.Play Movie.\n2.Check Whether The Two Movies are Same.\n3.Back.\nEnter Ur Choice:");
		int ch = sc.nextInt();
		select(ch);
	}
	public void MultiplexMovieMenu(String Name) 
	{
		System.out.println("----"+Name+"-----");
		System.out.println("1.Play Movie.\n2.Check Whether The Two Movies are Same.\n3.Back.\nEnter Ur Choice:");
		int ch = sc.nextInt();
		select(ch);
	}
	
	public void movieInSortedOrder()
	{
		System.out.println("Movies That are Currently Running In This Multiplex");
		movie1.getMovieName();
		movie2.getMovieName();
		MovieNameComparator mnc = new MovieNameComparator();
		movieList.clear();
		movieList.add(movie1);
		movieList.add(movie2);
		Collections.sort(movieList,mnc);
		for(Movie l:movieList)
		{
			System.out.println(l.getMovieName());
		}
			
	}
	public void select(int ch) 
	{
		switch(ch)
		{
		case 1:selectMovie();break;
		case 2:check();break;
		case 3:MultiplexMovieMenu();break;
		default:System.out.println("Enter valid choice...");break;
		}
	}
	public void check()
	{
		if(movie1.equals(movie2))
		{
			System.out.println("Same Movies Are Playing");
		}
		else
		{
			System.out.println("Different Movies Are Playing");
		}
	}
	public void selectMovie() 
	{
		movieInSortedOrder();
		System.out.println("1.Play Terminator .\n2.Play Avengers.\n Enter Ur Choice:");
		int ch1 = sc.nextInt();
		switch(ch1)
		{
		case 1:scifi();break;
		case 2:comic();break;
		}
	}
	public void comic()  {
		
		System.out.println("1.Play Movie.\n2.View Movie Cast.\n3.Search Cast.\n4.Back.\n Enter Ur Choice:");
		int ch2 = sc.nextInt();
		switch(ch2)
		{
		case 1:movie1.playComicMovie();;break;
		case 2:movie1.viewComicMovieCast();break;
		case 3:movie1.searchComicCast();break;
		case 4:MultiplexMovieMenu();break;
		default:System.out.println("Enter valid Choice.....");
		}
		
	}
		public void scifi()  {
		
		System.out.println("1.Play Movie.\n2.View Movie Cast.\n3.Search Cast.\n4.Back.\n Enter Ur Choice:");
		int ch3 = sc.nextInt();
		switch(ch3)
		{
		case 1:movie2.playSciFiMovie();break;
		case 2:movie2.viewSciFiCast();break;
		case 3:movie2.searchSciFiCast();break;
		case 4:MultiplexMovieMenu();break;
		default:System.out.println("Enter valid Choice.....");
		}
		
	}

}
