package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import java.util.*;
import java.io.*;


enum Level
{
	EASY,
	MEDIUM, 
	HARD;
}
public class Game
{
	public void setGameLevel() throws RuntimeException
	{
		Scanner sc=new Scanner(System.in);
		Forest forest=new Forest();
		forest.setAnimals();
		String value="fgh";
		Level temp=null;
		boolean exception =true;
			
		do
		{	
			//do
			//{
			try
			{
				System.out.println("enter game level type");
				System.out.println("Type 0 - EASY  \n "+ "Type 1 - MEDIUM  \n "+ "Type 2 - HARD");
				value =sc.next();
				int v=Integer.parseInt(value);
				if(v==3)throw new NumberFormatException(" from try block ");

				
			//}while((0>value && value>3));
			
			
				switch(v)
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
			}
			catch(NullPointerException ex)
			{
				System.out.println("Exception found ::" +ex );
				
			}
			catch(InputMismatchException i)
			{
				System.out.println("Exception found ::" +i+ sc.nextLine() );
				
			}
			catch(NumberFormatException ti)
			{
				System.out.println("Exception found ::" +ti );
			}
				finally
				{
					System.out.println("End of program??...");
				}

		}while(exception);


	}

} 