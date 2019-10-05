package com.lxisoft.test;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Forest forest=new Forest();
		System.out.println(" enter animal game lavel (1-easy,2-medium,3hard)");
		int level=s.nextInt();
		forest=animalGameLevel(forest,ag);
		forest.meetAnimal();
	}
	public static Forest animalGameLevel(Forest forest,int ag)
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