package com.lxisoft.movie;
import java.util.Scanner;
import java.lang.Math;
public class Scriptwriter
{
	String name;
	Script script;
	String s;
	
	public void setScript(Actor[] actorlist)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number of Actors");
		int num=scr.nextInt();	
		for (int i=0;i<num;i++) 
		{
			int n=(int)(Math.random()*3)+1;					
			script=new Script();
			s=script.setDialouge1(n);
			actorlist[i].setDialogues(s);
		}
	}
	public String getScript()
	{
		return s;
	}
}	
