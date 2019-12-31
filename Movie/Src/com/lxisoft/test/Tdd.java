package com.lxisoft.test;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Fileoperation;
import java.util.Scanner;
public class Tdd
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		Movie movie=new Movie();
		
		
						System.out.println("\n");
						movie.playScene();
				
						Fileoperation fo=new Fileoperation();
						fo.writeIntoFile();
				

	
 			
	}
}