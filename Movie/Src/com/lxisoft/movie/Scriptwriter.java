package com.lxisoft.movie;
import java.lang.Math;
public class Scriptwriter
{
	String name;
	Script script;
	public int randomDialouge()
	{
		int n=(int)(Math.random()*3);	
		return n;
	}
	
	public void setScript()
	{
		int num=0;
		String[] s=new String[3];
		String[] names=new String[3];
		for(int k=0;k<s.length;k++)
		{
			num=randomDialouge();
			name=new String();

			script=new Script();

			
			s=script.setDialouge1();
			names=script.name();
			Actor actor1=new Actor();
			actor1.name="Ajith";
			
			System.out.println(names[0]+" : "+s[num]);
			

			System.out.println("\n");
			s=script.setDialouge2();	
			Actor actor2=new Actor();
			actor2.name="Sankil";
			
			
			System.out.println(names[1]+" : "+s[num]);
	
			
		}

	}
}	