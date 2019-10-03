package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import java.util.Scanner;


enum Level
{
	EASY,
	MEDIUM, 
	HARD;
}
public class Game
{
	public void setGameLevel()
	{
		Scanner sc=new Scanner(System.in);
		Forest forest=new Forest();
		forest.setAnimals();
		int value=0;
		Level temp=null;
		boolean exception =true;
			
		do
		{	
			do
			{
				System.out.println("enter game level type");
				System.out.println("Type 0 - EASY  \n "+ "Type 1 - MEDIUM  \n "+ "Type 2 - HARD");
				value =sc.nextInt();
			}while((0>value && value>3));
			
			try
			{
				switch(value)
				{
					case 0 : temp=Level.EASY;exception=false;break;
					case 1 : temp=Level.MEDIUM;exception=false;break;
					case 2 : temp=Level.HARD;exception=false;break;

				}
			
				switch(temp)
				{
					case EASY : forest.setEasyMode();break;
					case MEDIUM : forest.setMediumMode();break;
					case HARD : forest.setHardMode();break;
				}
			}catch(NullPointerException ex)
			{
				System.out.println("Exception found ::" +ex );

			}

		}while(exception);


	}

} 