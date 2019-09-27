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
	public void gameOn()
	{
		Scanner sc=new Scanner(System.in);
		Forest forest=new Forest();
		forest.aninalInitialisation();
		int value=0;
		Level temp=null;
		do
		{
			System.out.println("enter game level type");
			System.out.println("Type 0 - EASY  \n "+ "Type 1 - MEDIUM  \n "+ "Type 2 - HARD");
			value =sc.nextInt();
		}while((0>value && value>3));
		switch(value)
		{
			case 0 : temp=Level.EASY;break;
			case 1 : temp=Level.MEDIUM;break;
			case 2 : temp=Level.HARD;break;
		}

		switch(temp)
		{
			case EASY : forest.easyMode();break;
			case MEDIUM : forest.mediumMode();break;
			case HARD : forest.hardMode();break;
		}


	}

} 