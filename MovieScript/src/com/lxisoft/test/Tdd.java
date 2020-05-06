package com.lxisoft.test;
import java.util.Scanner;
import com.lxisoft.moviescript.Movie;
public class Tdd
{
	public static void main(String[] args)throws NullPointerException
	{
		Scanner sc=new Scanner (System.in);
     	System.out.println("  WELCOME\n*************");
        Movie movie = new Movie("Luka");
        movie.startMovie();
	}
}
