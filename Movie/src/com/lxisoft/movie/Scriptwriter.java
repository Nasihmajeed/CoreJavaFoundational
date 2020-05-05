package com.lxisoft.movie;
import java.lang.Math;
import java.util.Scanner;
import java.util.*;
public class Scriptwriter
{
	String name;
	Script script;
	Actor[] dialoguelist;
	public void setScript(Actor[] actorlist,ArrayList<String>test)
	{
		ArrayList<Integer>randVariable=new ArrayList<Integer>();
		for (int i=0;i<actorlist.length;i++) 
		{
						
			script=new Script();
			int actordia;
			Fileoperation fo=new Fileoperation();
			//int actordia=(int)(Math.random()*4);	
			if(actorlist[i] instanceof Hero)
			{
				actordia=0;
			}
			else if(actorlist[i] instanceof Comedian)
			{
				actordia=1;
			}
			else if(actorlist[i] instanceof Villain)
			{
				actordia=2;
			}
			else if(actorlist[i] instanceof Heroin)
			{
				actordia=3;
			}
			else
			{
				actordia=4;
			}
			String s=fo.operation(actordia);
			
			test.add(s);
			for(int j=0;j<test.size();j++)
			{
				if(!s.equals(test.get(j)))
				{
					actorlist[j].setDialogues(s);
				}
			}
			
		}
		dialoguelist=actorlist;
	}
	public Actor[] getScript()
	{
		return dialoguelist;
	}
}	
