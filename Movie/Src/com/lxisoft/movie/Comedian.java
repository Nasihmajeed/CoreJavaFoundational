package com.lxisoft.movie;
import com.lxisoft.movie.Comedian;
public class Comedian extends Actor implements Comic
{
	String name;
	
	public String charecter()
	{
		String chr="News Reporter";
		return chr;
	}
	public String act()
	{
		String ac="Soldier";
		return ac;
	}
	public String type()
	{
		String tp="Super Hero";
		return tp;
	}
	
}