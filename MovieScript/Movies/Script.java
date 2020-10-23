package com.lxisoft.Movies;
import java.util.Scanner;
public abstract class Script
{
	String name;

	public void scriptDisplay()
	{
		System.out.println("Woody (Tom Hanks), a good-hearted cowboy doll who belongs to a young boy named Andy (John Morris),");
		System.out.println("sees his position as Andy's favorite toy jeopardized when his parents buy him a Buzz Lightyear (Tim Allen) action figure.");
		System.out.println("Even worse, the arrogant Buzz thinks he's a real spaceman on a mission to return to his home planet.");
		System.out.println("When Andy's family moves to a new house, Woody and Buzz must escape the clutches of maladjusted neighbor Sid Phillips (Erik von Detten) and reunite with their boy.");
	}

	public void setName(String a)
	{
		this.name=a;
	}
	public String getName()
	{
		return name;
	}
}