package com.lxisoft.test;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class TDD
{
	public static void main(String[] arg)
	{
		Forest forest=new Forest();
		int level=0;					
        try
			{	
				Scanner sc=new Scanner(System.in);						
				System.out.println("enter the level");
				System.out.println(" 1= LOW  2= MEDIUM  3= HIGH");
				level=sc.nextInt();
				switch(level)
				{
					case 1:
		 			forest.gamelevel=Gamelevel.EASY;
		 			System.out.println("first level"+forest.gamelevel);
		 			break;
		 			case 2:
		  			forest.gamelevel=Gamelevel.MEDIUM; 
		  			System.out.println("second level"+forest.gamelevel);
		  			break;
		  			case 3:
		  			forest.gamelevel=Gamelevel.HARD;
		  			System.out.println("third level-"+forest.gamelevel);
		  			break;
		  		}
			}				
		catch(ArithmeticException e)
		{
			System.out.println("exception occured ArithmeticException"+e );				
		}
				forest.animalMeet();
	}
}	
				
 // public void gameLevel(Animal animal)
	//  {
	//  	switch(level)
	//  	{
 // 		case LOW:
 // 		animal.level=(int) (Math.random()*20);
 // 		break;
 // 		case MEDIUM:
 //  		animal.level=(int) (Math.random()*40); 
 //  		break;
 //  		case HIGH:
 //  		animals.level=(int) (Math.random()*60);
 //  		break;
 //  		}
 //  		System.out.println("animal speed-"+animal.level);
 //  		return animal.level;
 //  	}



