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
			int randdialogue=(int)(Math.random()*10);			
			script=new Script();
			String s=script.setDialouge1(randdialogue);
			actorlist[i].setDialogues(s);
		}
		dialoguelist=actorlist;
	}
	public Actor[] getScript()
	{
		return dialoguelist;
	}
}	