package com.lxisoft.movie;
import com.lxisoft.Interface.Comic;
public class Comedian extends Actors implements Comic
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