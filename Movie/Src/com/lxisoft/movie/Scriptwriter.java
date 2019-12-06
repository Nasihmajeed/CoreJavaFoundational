package com.lxisoft.movie;
import java.lang.Math;
public class Scriptwriter
{
	String name;
	Script script;
	public int randomdialouge()
	{
		int n=(int)(Math.random()*2)+1;	
		return n;
	}
	
	public void setscript()
	{
		int num=randomdialouge();
		String[] s=new String[2];
		for(int k=0;k<s.length;k++)
		{
			
			name=new String();

			script=new Script();

			
			s=script.setdialouge1();
			Actor actor1=new Actor();
			actor1.name="Ajith";
			
			System.out.println(actor1.name+" : "+s[num]);
			

			System.out.println("\n");
			s=script.setdialouge2();	
			Actor actor2=new Actor();
			actor2.name="Sankil";
			
			
			System.out.println(actor2.name+" : "+s[num]);
	
			
		}

	}
}	