package com.lxisoft.movie;
import com.lxisoft.movie.Comedian;
public class Villain extends Actor implements Villainic
{
	String name;
	
	public void charecter()
	{
		System.out.println("Stone collector");
	}
	public void act()
	{ 
		System.out.println("Steet cloun");
	}
	public void type()
	{
		System.out.println("Villain");
	}
}