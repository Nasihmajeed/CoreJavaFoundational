import java.util.*;
 enum DifficultyLevel{
 	easy,medium,hard;

}

class TDD
{	 
	
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
			
			


			DifficultyLevel []mode=DifficultyLevel.values();
			/*DifficultyLevel mode[0]=DifficultyLevel.easy;
			DifficultyLevel mode[1]=DifficultyLevel.medium;
			DifficultyLevel mode[2]=DifficultyLevel.hard;*/
			String modeSelected;
System.out.println("------------------------------------------------------ ");
			System.out.println("Enter the option (1.Easy 2.Medium 3.Hard)");
			ansMode=sc.nextInt();
					
			if(ansMode==1)
			{
			 modeSelected=mode[0].toString();
				
			}
			else if(ansMode==2)
			{
			 modeSelected=mode[1].toString();
				
			}
			else if(ansMode==3)
			{
				 modeSelected=mode[2].toString();
				 
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