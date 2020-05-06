package com.lxisoft.movie;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.lxisoft.movie.Director;

public class Movie {
	
	private String movieName;
	private String releaseDate;
	private String productionCompany;
	private final int productionCode = 123456;
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
	public void setMovie(String movieName,String releaseDate,String productionCompany)
	{
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.productionCompany = productionCompany;
	}
	public void printMovie()
	{
		System.out.println("Movie Name : "+movieName);
		System.out.println("Release Date : "+releaseDate);
		System.out.println("Production Company : "+productionCompany);
		System.out.println("Production Id : "+productionCode);
		System.out.println(" ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(" ");
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)return true;
		if(obj == null)return false;
		if(this.getClass() != obj.getClass()) return false;
		Movie movie = (Movie)obj;
		if(this.movieName.equals(movie.movieName)) return false;
		return true;
		
	}
	
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
				isTrue = true;
				break;
			case 2:
				this.editMovie();
				isTrue = true;
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
				Movie movie1 = new Movie();
				movie1.setMovie("ComedyMovie","20/05/2020","Ashirvad Cinemas");
				movie1.printMovie();
				this.playMovie(1);
				break;
			case 2:
				Movie movie2 = new Movie();
				movie2.setMovie("RomanticMovie","11/02/2020","Ashirvad Cinemas");
				movie2.printMovie();
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
		scanner = this.getScanner();
		boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("Press ==> 1.Comedy Movie 2.Romantic Movie 3.Print All Charecters 4.Back");
			int selectedOption = scanner.nextInt();
			
			switch(selectedOption)
			{
			case 1:
				this.editMovie(1);
				isTrue = true;
				break;
			case 2:
				this.editMovie(2);
				isTrue = true;
				break;
			case 3 :
				this.printAllCharecters();
				isTrue = true;
				break;
			case 4 :
				break;
			default :
				System.out.println("Warning !!! Select Options From The List");
				isTrue = true;
				break;
			}
		}while(isTrue);
	}
	
	public void printAllCharecters()
	{
		Map map = new HashMap();
		
		map.put(1,"Comedian");
		map.put(3, "Heroin");
		map.put(2, "Villan");
		map.put(4,"Hero");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+"."+entry.getValue());
		}
	}
	
	public void playMovie(int movieCode)
	{
		System.out.println("****Movie Started****");
		System.out.println(" ");
		Director director = new Director();
		director.selectScript(movieCode);
		System.out.println(" ");
		System.out.println("****Movie End****");
	}
	
	public void editMovie(int movieCode)
	{
		Director director = new Director();
		director.editMovie(movieCode);
	}
}
