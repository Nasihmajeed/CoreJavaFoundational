package com.lxisoft.movie;
import com.lxisoft.movie.Actor;
public class Actor
{
	private String[] charecter=new String[2];
	String name;
	public void setCharecter(String[] names)
	{
		this.charecter=names;
		
		System.out.println("\n");
	}
	public String[] getCharecter()
	{
		return this.charecter;
	}

}
