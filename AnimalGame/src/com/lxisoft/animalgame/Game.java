package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import java.util.Scanner;
public class Game
{
	enum GameLevel
	{
		EASY,
		MEDIUM,
		HARD;
	}
	
	public void setGameLevel()
	{
		 Forest forest=new Forest();
		 forest.setAnimalDetails();
		 Scanner sc=new Scanner(System.in);
		 int choice;
		 GameLevel level=null;
		do
		{
			System.out.println("enter your choice");
			System.out.println(" 0  - EASY  \n "+ "1 - MEDIUM  \n "+ "2 - HARD");
			choice =sc.nextInt();

		}while((0>choice && choice>3));
		System.out.println(choice);
		switch(choice)
		{
			case 0 : level=GameLevel.EASY;break;
			case 1 : level=GameLevel.MEDIUM;break;
			case 2 : level=GameLevel.HARD;break;
		}
		if(level==GameLevel.EASY) forest.levelEasy();
		else if(level==GameLevel.MEDIUM) forest.levelMedium();
		else forest.levelHard();

	}

} 
