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
			String actordia;
			Fileoperation fo=new Fileoperation();
			//int actordia=(int)(Math.random()*4);	
			if(actorlist[i] instanceof Hero)
			{
				actordia="Hero";
			}
			else if(actorlist[i] instanceof Comedian)
			{
				actordia="Comedian";
			}
			else if(actorlist[i] instanceof Villain)
			{
				actordia="Villain";
			}
			else if(actorlist[i] instanceof Heroin)
			{
				actordia="Heroin";
			}
			else
			{
				actordia="Dialouge";
			}
			String s=fo.operation(actordia);
			
			actorlist[i].setDialogues(s);
		}
		dialoguelist=actorlist;
	}
	public Actor[] getScript()
	{
		return dialoguelist;
	}
}	
