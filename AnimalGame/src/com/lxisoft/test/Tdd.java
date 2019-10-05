package com.lxisoft.test;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
     	Forest f=new Forest();
    	int level=0;

     	try
     	{
    		System.out.println("Enter 1 for HIGH,2 for MEDIUM,3 for LOW");
    		level=sc.nextInt();
    	}
    	catch (Exception e)
    	{
        	 System.out.println("Exception  :" );
    	}
    	gameLevel(level,f);
    	f.fight();
	}
	public static void gameLevel(int level,Forest f)
	{
    	switch(level)
    	{
			case 1:
			{
				f.gamelevel=GameLevel.HIGH;
				break;
			}
			case 2:
			{
				f.gamelevel=GameLevel.MEDIUM;
				break;
			}
			case 3:
			{
				f.gamelevel=GameLevel.LOW;
				break;
			}

    	}
    	 System.out.println("game level="+f.gamelevel);
    }
}