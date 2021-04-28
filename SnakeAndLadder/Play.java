import java.util.*;
class Play
{
	
	/*Player1 p1=new Player1();
	Player2 p2=new Pla*/



	Player p1=new Player1();
	Player p2=new Player2();
Board b=new Board();
Die d=new Die();
int dieNumber,dieCount,coinPos;
boolean isHome;
int ans;
Scanner sc=new Scanner(System.in);
public void play()
{
	System.out.println("-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	System.out.println("Player throws die");
	
	/*isHome=getHome(p1);
		
			if(isHome==true)
			{*/
				//System.out.println(" And can throw die one more time");
				
				
		/*	}

			else
			{
			System.out.println("The "+p1.getClass().getSimpleName()+" can't play, switch player");

			}
	

				/*System.out.println("continue playing press 1:");
				
				ans=sc.nextInt();*/
	
	

		
			
	

				/*System.out.println("continue playing press 1:");
				
				ans=sc.nextInt();*/
	




}
public boolean getHome(Player p)
	{
		if(d.getNumberOnDie()==6)
			{	System.out.println("Player "+p.getClass().getSimpleName()+" got 6 ");
				p.setCoinPosition(0);
				System.out.println("Player "+p.getClass().getSimpleName()+" moved to home");
				return true;
			}
		else
			{
				return false;
			}

	}



	public void move()
	{
		coinPos=0;
				while(coinPos<=10){
					

				dieNumber=d.getNumberOnDie();

					System.out.println("The number on die"+dieNumber);	
				coinPos=coinPos+dieNumber;

				System.out.println("Now the Player 1 moved to "+coinPos);
				}
				
	}



}