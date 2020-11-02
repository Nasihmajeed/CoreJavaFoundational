package com.lxisoft.Movie;
import java.util.Scanner;
import java.util.ArrayList;
public class Movie
{
	public void movieDetails()
	{
	  System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                       SHANDAPAN THEATERS                                                       -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                       MOVIE SHOW                                                               -");
      System.out.print("\n");
      System.out.print("-                                              ----------------------------                                                      -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-    SHOWS ARE : 1. ARUMELATHA LOGHATE RAJAV  (ONLY 1 SHOW AND 1 MOVIE BECAUSE OF COVID-19)                                      -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("\n"); 
	}
	public void playList()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("           DETAILS OF THE MOVIES           ");
		System.out.print("\n");
		System.out.print("          -----------------------          ");
		System.out.print("\n");
		System.out.print(" PRESS THE NUMBERS TO KNOW THE DETAILS ");
		System.out.print("\n");
		System.out.print("       -----------------------          ");
		System.out.print("\n");
		System.out.print(" 1. ACTORS DETAILS \n 2. MOVIE START ");
		System.out.print("\n");
		System.out.print("ENTER THE NUMBER : ");
		int num = scanner.nextInt();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		if(num==1)
		{
			System.out.print("           ACTORS NAME AND CHARACTER           ");
			System.out.print("\n");
		    System.out.print("          ---------------------------          ");
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
			Tintumone tintu = new Tintumone();
			Dundumole dundu = new Dundumole();
			Katakadarajan rajan = new Katakadarajan();
			tintu.scriptPlay();
			System.out.print("\n");
			dundu.scriptPlay();
			System.out.print("\n");
			rajan.scriptPlay();
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			this.playList();


		}
		else if(num==2)
		{
			System.out.print("           MOVIE STARTS           ");
			System.out.print("\n");
		    System.out.print("          --------------          ");
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
		    System.out.print("\n");
			Director  director = new Director();
            director.sceneDialogue(); 
		}

				
	}
}