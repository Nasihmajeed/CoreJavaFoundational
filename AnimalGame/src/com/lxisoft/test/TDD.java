package com.lxisoft.test;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class TDD
{
	public static void main(String[] arg)
	{
		Forest forest=new Forest();
		int level=0;
		boolean ex=true;
		do{					
        try
		{	
			Scanner sc=new Scanner(System.in);						
			System.out.println("enter the level");
			System.out.println(" 1= LOW  2= MEDIUM  3= HIGH");
			level=sc.nextInt();
			if(level>3)throw new NullPointerException("null point exception");
			switch(level)
			{
				case 1:
	 			forest.gamelevel=Gamelevel.EASY;
	 			System.out.println("first level"+forest.gamelevel);ex=false;
	 			break;
	 			case 2:
	  			forest.gamelevel=Gamelevel.MEDIUM; 
	  			System.out.println("second level"+forest.gamelevel);ex=false;
	  			break;
	  			case 3:
	  			forest.gamelevel=Gamelevel.HARD;
	  			System.out.println("third level-"+forest.gamelevel);ex=false;
	  			break;
	  		}
		}				
		catch(NullPointerException e)
		{
			System.out.println("exception "+e );				
		}
	}while(ex);
		//finally
		//{
		 //	System.out.println("finally block executed");
		 //}  
  		//System.out.println("rest of the code...");
  		forest.animalMeet();  
  	}  	
	
}	
				

