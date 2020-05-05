package com.lxisoft.movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MultiplexTheatre {
	
	static Scanner sc = new Scanner(System.in);
	Movie movie1 = new Movie();
	Movie movie2 = new Movie();
	ArrayList<Movie> movieList = new ArrayList<Movie>();
	public void MultiplexMovieMenu()
	{
		System.out.println("1.Play Movie.\n2.Script Writer Option.\n3.Director Option.\n4.Check Whether The Two Movies are Same.\n Enter Ur Choice:");
		int ch = sc.nextInt();
		selectMovie(ch);
	}
	public void movieInSortedOrder()
	{
		System.out.println("Movies That are Currently Running In This Multiplex");
		movie2.setMovieName("Terminator\n");
		movie1.setMovieName("Avenger");
		
		MovieNameComparator mnc = new MovieNameComparator();
		movieList.add(movie1);
		movieList.add(movie2);
		Collections.sort(movieList,mnc);
		for(Movie l:movieList)
		{
			System.out.println(l.getMovieName());
		}
			
	}
	public void selectMovie(int ch)
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

	public void comic() {
		
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
	public void playComicMovie()
	{
		
	}

	public void editComic() {
		
		
	}

	public void viewComicCast() {
		
		
	}
	public void scifi() {
		System.out.println("1.Play Movie.\n2.View Movie Cast.\n3.Edit Cast.\n4.Back.\n Enter Ur Choice:");
		int ch3 = sc.nextInt();
		switch(ch3)
		{
		case 1:playSciFiMovie();break;
		case 2:viewSciFiCast();break;
		case 3:editSciFi();break;
		case 4:MultiplexMovieMenu();break;
		default:System.out.println("Enter valid Choice.....");
		}
		
	}

	public void editSciFi() {
		
		
	}

	public void viewSciFiCast() {
		
		
	}

	public void playSciFiMovie() {
		
		
	}

}
