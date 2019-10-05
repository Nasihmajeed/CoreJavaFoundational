package com.lxisoft.test;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Forest forest=new Forest();
		int level=0;
		try
		{
			System.out.println(" enter animal game lavel (1-easy,2-medium,3hard)");
			level=s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("InputMismatchException");
		}
		forest=animalGameLevel(forest,level);
		forest.meetAnimal();
	}
	public static Forest animalGameLevel(Forest forest,int level)
	{
		switch(level)
		{
			case 1:
				{forest.gamelevel=Gamelevel.EASY; break;}
			case 2:
				{forest.gamelevel=Gamelevel.MEDIUM; break;}
			case 3:
				{forest.gamelevel=Gamelevel.HARD; break;}
		}
		System.out.println("gamelevel--"+forest.gamelevel);
		return forest;

	}
	
}   