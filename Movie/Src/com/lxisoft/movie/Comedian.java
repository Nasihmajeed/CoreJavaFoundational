package com.lxisoft.movie;
import com.lxisoft.movie.Comedian;
public class Comedian extends Actor implements Comic
{
	String name;
	
	public void charecter()
	{
		System.out.println("News Reporter");
	}
	public void act()
	{
		System.out.println("Soldier");
	}
	public void type()
	{
		System.out.println("Super Hero");

	}
	
}