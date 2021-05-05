import java.util.*;
class TDD
{
	
	public static void main(String [] args)
	{
			Play play=new Play();
			boolean isHomeP1,isHomeP2;
			Player p1=new Player1();
			Player p2=new Player2();
				Player p=new Player();
				 int ans;
 Scanner sc=new Scanner(System.in);
			play.begining();
			do{
 			System.out.println("To Start playing press 1  ");
 			ans=sc.nextInt();
 			switch(ans)
 			{
 				case 1:
 						if(play.isHomeP1)
 						{
 							play.move(p1);
 						}
 						else{
 							play.start(p1);
 						}



 				case 2:	if(play.isHomeP2)
 						{
 							play.move(p2);
 						}
 						else{
 							play.start(p2);
 						}
 						
 			}

			}while(!play.isWin);
			
			
	
	}
}