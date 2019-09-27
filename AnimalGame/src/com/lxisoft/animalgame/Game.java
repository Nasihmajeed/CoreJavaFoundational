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
		do
		{
			System.out.println("enter game level type");
			System.out.println("Type 0 - EASY  \n "+ "Type 1 - MEDIUM  \n "+ "Type 2 - HARD");
			value =sc.nextInt();
		}while((0>value && value>3));
		switch(value)
		{
			case 0 : forest.easyMode();break;
			case 1 : forest.mediumMode();break;
			case 2 : forest.hardMode();break;
		}


	}

}