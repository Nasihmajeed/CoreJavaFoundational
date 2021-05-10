package com.lxisoft.tdd;
import com.lxisoft.players.*;
import com.lxisoft.game.*;
import java.util.*;
 public class TDD
{	 enum DifficultyLevel{
 	easy,medium,hard;

}
	
	public static void main(String [] args)
	{
			Play play=new Play();
			boolean isHomeP1,isHomeP2;
			Player p1=new Player1();
			Player p2=new Player2();
				Player p=new Player();
				 int ans,ansMode;
		 Scanner sc=new Scanner(System.in);
			
			play.begining();
			
		
			String easy="easy";
			String hard="hard";
			String medium="medium";

			DifficultyLevel mode=DifficultyLevel.easy;
		//DifficultyLevel mode=DifficultyLevel.easy;
			//this.mode=mode;
			/*DifficultyLevel mode=DifficultyLevel.medium;
			DifficultyLevel mode=DifficultyLevel.hard;*/
			String modeSelected="easy";
System.out.println("------------------------------------------------------ ");
			System.out.println("Enter the option (1.Easy 2.Medium 3.Hard)");
			ansMode=sc.nextInt();
					
			if(ansMode==1)
			{	DifficultyLevel.valueOf(easy);
			 modeSelected="easy";
				
			}
			else if(ansMode==2)
			{ DifficultyLevel.valueOf(medium);
				//this.mode=mode;
			 modeSelected="medium";
				
			}
			else if(ansMode==3)
			{	DifficultyLevel.valueOf(hard);
				//this.mode=mode;
				 modeSelected="hard";
				 
			}
			
			

			do{
 			System.out.println("To Start playing press 1  ");
 			ans=sc.nextInt();
 			switch(ans)
 			{
 				case 1:if(modeSelected=="easy"){
 						if(play.isHomeP1)
 						{
 							play.moveEasy(p1);
 						}
 						else{
 							play.start(p1);
 						}

 					}
 					else if(modeSelected=="medium")
 					{
 						if(play.isHomeP1)
 						{
 							play.moveMedium(p1);
 						}
 						else{
 							play.start(p1);
 						}
 					}
 					else if(modeSelected=="hard")
 					{
 						if(play.isHomeP1)
 						{
 							play.moveHard(p1);
 						}
 						else{
 							play.start(p1);
 						}
 					}


 				case 2:
 						if(ansMode==1){
 							if(play.isHomeP2)
 						{
 							play.moveEasy(p2);
 						}
 						else{
 							play.start(p2);
 						}

 						}
 						else if(ansMode==2)
 						{
 							if(play.isHomeP2)
 						{
 							play.moveMedium(p2);
 						}
 						else{
 							play.start(p2);
 						}
 						}
 						else if(ansMode==3)
 						{
 							if(play.isHomeP2)
 						{
 							play.moveHard(p2);
 						}
 						else{
 							play.start(p2);
 						}
 						}
 						
 			}

			}while(!play.isWin);
			
			
	
	}
}