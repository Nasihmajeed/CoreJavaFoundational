package com.lxisoft.test;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Fileoperation;
public class Tdd
{
	public static void main(String[] args) 
	{
		
		System.out.println("\n");
		Movie movie=new Movie();
		movie.playScene();
		Fileoperation fo=new Fileoperation();
		fo.writeIntoFile();
 			
	}
}