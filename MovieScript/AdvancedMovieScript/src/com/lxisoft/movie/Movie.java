package com.lxisoft.movie;

import java.util.Scanner;
import com.lxisoft.movie.Director;

public class Movie {
	
	private String movieName;
	private String releaseDate;
	private static Scanner scanner;
	
	
	public static Scanner getScanner()
	{
		if(scanner == null)
		{
			scanner = new Scanner(System.in);
			return scanner;
		}
		else
		{
			return scanner;
		}
	}
	
	public Movie(String movieName,String releaseDate)
	{
		this.movieName = movieName;
		this.releaseDate = releaseDate;
	}
	
//	public void getMovieDetails()
//	{
//		System.out.println("Movie Name : "+movieName);
//		System.out.println("Release Date : "+releaseDate);
//	}
	
	public void selectOption()
	{
		scanner = this.getScanner();
		boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("Press ==> 1.Start Movie 2.Edit Movie");
			int selectedOption = scanner.nextInt();
			
			switch(selectedOption)
			{
			case 1:
				this.startMovie();
				//isTrue = true;
				break;
			case 2:
				this.editMovie();
				break;
			default :
				System.out.println("Warning !!! Select Options From The List");
				isTrue = true;
				break;
			}
			
		}while(isTrue);
		
	}
	
	public void startMovie()
	{
		scanner = this.getScanner();
		boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("Press ==> 1.Comedy Movie 2.Romantic Movie 3.Back");
			int selectedOption = scanner.nextInt();
			
			switch(selectedOption)
			{
			case 1:
				this.playMovie(1);
				break;
			case 2:
				this.playMovie(2);
				break;
			case 3 :
				break;
			default :
				System.out.println("Warning !!! Select Options From The List");
				isTrue = true;
				break;
			}
		}while(isTrue);
	}
	
	public void editMovie()
	{
		
	}
	
	public void playMovie(int movieCode)
	{
		Director director = new Director();
		director.selectScript(movieCode);
	}
}
