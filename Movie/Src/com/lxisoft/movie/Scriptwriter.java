package com.lxisoft.movie;
import java.lang.Math;
import java.util.Scanner;
public class Scriptwriter
{
	String name;
	Script script;
	Actor[] dialoguelist;
	public void setScript(Actor[] actorlist)
	{
		
		for (int i=0;i<actorlist.length;i++) 
		{
						
			script=new Script();
			String randdialogue;
			Fileoperation fo=new Fileoperation();
			//int randdialogue=(int)(Math.random()*4);	
			if(actorlist[i] instanceof Hero)
			{
				randdialogue="Hero";
			}
			else if(actorlist[i] instanceof Comedian)
			{
				randdialogue="Comedian";
			}
			else if(actorlist[i] instanceof Villain)
			{
				randdialogue="Villain";
			}
			else if(actorlist[i] instanceof Heroin)
			{
				randdialogue="Heroin";
			}
			else
			{
				randdialogue="Dialouge";
			}
			String s=fo.operation(randdialogue);
			
			actorlist[i].setDialogues(s);
		}
		dialoguelist=actorlist;
	}
	public Actor[] getScript()
	{
		return dialoguelist;
	}
}	
