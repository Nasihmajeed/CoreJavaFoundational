package com.lxisoft.movie;
import com.lxisoft.Interface.Villanic;
public class Villan extends Actors implements Villanic
{
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}