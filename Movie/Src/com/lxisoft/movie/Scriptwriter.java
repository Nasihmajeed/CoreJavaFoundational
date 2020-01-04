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
			int randdialogue;
			Fileoperation fo=new Fileoperation();
			//int randdialogue=(int)(Math.random()*4);	
			if(actorlist[i] instanceof Hero)
			{
				randdialogue=0;
			}
			else if(actorlist[i] instanceof Comedian)
			{
				randdialogue=1;
			}
			else if(actorlist[i] instanceof Villain)
			{
				randdialogue=2;
			}
			else if(actorlist[i] instanceof Heroin)
			{
				randdialogue=3;
			}
			else
			{
				randdialogue=4;
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
