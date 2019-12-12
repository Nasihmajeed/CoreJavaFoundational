package com.lxisoft.movie;
import java.lang.Math;
public class Scriptwriter
{
	String name;
	Script script;
	public int randomDialouge()
	{
		int n=(int)(Math.random()*5);	
		return n;
	}
	public Actor[] setScript(Actor[] actorlist)
	{
		
		
		for (int i=0;i<actorlist.length;i++) 
		{

			int num=randomDialouge();			
			script=new Script();
			String s=script.setDialouge1(num);
			actorlist[i].setDialogues(s);
		}
		return actorlist;
	}
}	