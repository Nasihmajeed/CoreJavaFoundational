package com.lxisoft.movie;
import com.lxisoft.movie.Comedian;
public class Villain extends Actor implements Villainic
{
	String name;
	
	public String charecter()
	{
		String chr="Stone collector";
		return chr;
	}
	public String act()
	{ 
		String ac="Steet cloun";
		return ac;
	}
	public String type()
	{
		String tp="Villain";
		return tp;
	}
}