package com.lxisoft.movie;
public class Director
{
	String name;

	public void direction()
	{
		Script script=new Script();
		String[] scene;
		scene=script.scenes();
		System.out.println(scene[0]);
	}
}