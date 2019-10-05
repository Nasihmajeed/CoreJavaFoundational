package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import java.util.*;
import java.io.*;
public class Game
{
	enum GameLevel
	{
		EASY,
		MEDIUM,
		HARD;
	}
	
	public void setGameLevel()throws NullPointerException,InputMismatchException 
	{
		Forest forest=new Forest();
		forest.setAnimalDetails();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		GameLevel level=null;
		boolean exception=true;
		do
		{
			try
			{
								
					System.out.println("enter your choice");
					System.out.println(" 0  - EASY  \n "+ "1 - MEDIUM  \n "+ "2 - HARD");
					choice =sc.nextInt();
				

				switch(choice)
				{
					case 0 : level=GameLevel.EASY;exception=false;break;
					case 1 : level=GameLevel.MEDIUM;exception=false;break;
					case 2 : level=GameLevel.HARD;exception=false;break;
				}
				switch(level)
				{
					case EASY   :forest.levelEasy(); break;
					case MEDIUM :forest.levelMedium() ;break;
					case HARD: forest.levelHard();break;
				}
				// if(level==GameLevel.EASY) forest.levelEasy();
				// else if(level==GameLevel.MEDIUM) forest.levelMedium();
				// else forest.levelHard();

			}
			catch(NullPointerException | InputMismatchException e)
			{
				exception=true;
				System.out.println("exception occured " +e +sc.nextLine());
				
			}
			
		}while(exception);
			
	}

} 
