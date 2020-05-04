package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*; 
import java.io.*; 
public class Movie
{
	public String movieName;
	Script script;
	Actors actor;
	static Scanner sc=new Scanner(System.in);				
	public void doAct()
	{
		Scanner sc=new Scanner(System.in);
		script=new Script();
		script.addDialogues();
		System.out.println("Movie Begins");
		System.out.println("\n--Actors meet--\n");
		System.out.println("Which type actor you want");
		System.out.println("\n 1.Comedy \n 2.Villain");
		int act=sc.nextInt();		
		switch(act)
		{
			case 1: doComedy(script); break;
			case 2: doVillanic(script); break;
			default:				
		}			
	}	
	public void doComedy(Script script)
	{

		int[] integer=new int[4];
			for(int i=0;i<integer.length;i++)
			{	
				int	y=(int) (Math.random()*3);
				integer[i]=y;			
				System.out.println(script.cdiaQuest[y].dialogueType + "  =Vs=  " + script.vdiaAns[y].dialogueType);			
				if(integer[y]==integer[i])
				{
					break;
				}
				else
				{
					continue;
				}
			}
		
	}
	public void doVillanic(Script script)
	{		
		for(int j=0;j<3;j++)
		{
			int	x=(int) (Math.random()*3);			
			System.out.println(script.vdiaQuest[x].dialogueType + "  =Vs=  " + script.cdiaAns[x].dialogueType);
		}
	}
	
}	



		
		
