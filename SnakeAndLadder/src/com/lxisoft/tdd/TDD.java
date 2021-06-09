package com.lxisoft.tdd;
import com.lxisoft.players.*;
import com.lxisoft.game.*;
import java.util.*;
 
 
public class TDD
{
	
       enum Difficulty{   easy,medium,hard; }
	
	
public static void main(String [] args)	
	{
			Game game=new Game();
			
			boolean isHomeP1,isHomeP2;
			
			Player p1=new Player1();
			Player p2=new Player2();
			Player p=new Player();
			
			int st,gameMode;
		    String easy="easy";
			String hard="hard";
			String medium="medium";
		
			Scanner sc=new Scanner(System.in);
		
           System.out.println("=====================================");
		   System.out.println("=====================================");
		   System.out.println("=====================================");
		   System.out.println("=====================================");
		   System.out.println("--------------------------------------------------------------------");
           System.out.println("-----------------SNAKE===AND===LADDER-----------------");
           System.out.println("--------------------------------------------------------------------");
           System.out.println("=====================================");
		   System.out.println("=====================================");
		   System.out.println("=====================================");
		   System.out.println("=====================================");

			Difficulty level=Difficulty.easy;
		  
			String selectedLevel="easy";
		
            System.out.println("------------------------------------------------------ ");
			System.out.println("ENTER THE MODE IN WHICH YOU WANT TO PLAY THE GAME1.Easy 2.Medium 3.Hard");
			System.out.println("1.Easy");
			System.out.println("2.Medium");
			System.out.println("3.Hard");
			gameMode=sc.nextInt();
					
			if(gameMode==1)
			{	
		        Difficulty.valueOf(easy);
			    selectedLevel="easy";
				System.out.println("You have selected the game in Easy mode!!!!!!");
			}
			else if(gameMode==2)
			{ 
		        Difficulty.valueOf(medium);
			    selectedLevel="medium";
				System.out.println("You have selected the game in Medium mode!!!!!!");
			}
			else if(gameMode==3)
			{	
		         Difficulty.valueOf(hard);
				 selectedLevel="hard";
				 System.out.println("You have selected the game in Hard mode!!!!!!");
			}
			
			

			do{
 			       System.out.println("To Start the game in Easy mode , Press 1 ");
 			       st=sc.nextInt();
 			       switch(st)
 			         {
 				        case 1:
						
						           if(selectedLevel=="easy")
						             {
 						                if(game.isHomeP1)
 						                  {
 							                game.moveEasy(p1);
 						                  }
 						                else
								          {
 							            game.startGame(p1);
 						                  }
 					                 }
 					              
								  
								  else if(selectedLevel=="medium")
 					                {
 						               if(game.isHomeP1)
 						                 {
 							               game.moveMedium(p1);
 						                 }
 						               else
									   {
 							              game.startGame(p1);
 						               }
 					                }
									
									
 					             else if(selectedLevel=="hard")
 					              {
 						              if(game.isHomeP1)
 						                {
 							               game.moveHard(p1);
 						                }
 						             else
									   {
 							             game.startGame(p1);
 						               }
 					               }


 				case 2:
				
 						if(gameMode==1)
						{
 							if(game.isHomeP2)
 						      {
 							      game.moveEasy(p2);
 						      }
 						    else
						      {
 							      game.startGame(p2);
 						      }
 						}
						
						
						
						
 						else if(gameMode==2)
 						{
 							  if(game.isHomeP2)
 						       {
 						     	    game.moveMedium(p2);
 						       }
 						       else
						       {
 							   game.startGame(p2);
 						       }
 						}
						
						
						
						
 						else if(gameMode==3)
 						 {
 						     if(game.isHomeP2)
 						     {
 							 game.moveHard(p2);
 						     }
 						     else
						    {
 							 game.startGame(p2);
 						    }
 						}
 						
 			}   //switch close

	   }while(!game.isCompleted);
			
	}
}