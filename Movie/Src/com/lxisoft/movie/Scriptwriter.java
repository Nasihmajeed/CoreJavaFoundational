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
	
	public Actor[] setScript(Actor[] actorlist)
	{
		int num=0;
		String s;
		
	
			num=randomDialouge();			
			script=new Script();
			s=script.setDialouge1(num);
			actorlist[0].setDialogues(s);
			
			num=randomDialouge();			
			script=new Script();
			s=script.setDialouge2(num);
			actorlist[1].setDialogues(s);

			num=randomDialouge();			
			script=new Script();
			s=script.setDialouge1(num);

			actorlist[2].setDialogues(s);

			num=randomDialouge();			
			script=new Script();
			s=script.setDialouge2(num);
			actorlist[3].setDialogues(s);
		
		
		
		
		return actorlist;

	}
}	