package com.lxisoft.movie;
public class Movie 
{
	private String name;

	public Movie(String name)
	{
		this.name=name;
	}
	public void coversation()
	{
		Script script = new Script();
		script.setDialougeArrayList();
		script.writeToFile();
		script.readFromFile();
	}
}