package com.lxisoft.tdd;

import com.lxisoft.movies.*;

public class TDD
{
	public static void main(String[] args)
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("=========MOVIE---SCRIPT=============");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		
		Movie movie=new Movie();
		String film=movie.selectMovie();
	    
		System.out.println("The movie you have selected is"+film);
	}
	
}