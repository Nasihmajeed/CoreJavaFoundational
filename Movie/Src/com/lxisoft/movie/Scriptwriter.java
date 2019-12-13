package com.lxisoft.movie;
import java.util.Scanner;
import java.lang.Math;
public class Scriptwriter
{
	String name;
	Script script;
	Actor[] s;
	
	public void setScript()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number of Actors");
		int num=scr.nextInt();
		for (int i=0;i<num;i++)
		{
			int n=(int)(Math.random()*4);						
			script=new Script();
			/*s=script.setDialouge1(n);*/
		}
	}
	public Actor[] getScript()
	{
		return s;
	}
}	
