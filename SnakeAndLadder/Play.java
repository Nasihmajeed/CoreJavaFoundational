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
boolean isHome,isWin;
int ans;
Scanner sc=new Scanner(System.in);
public void start(Player p)
{
	System.out.println("-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	System.out.println("The "+p.getClass().getSimpleName()+" throws die");

	
		do{
			if(p instanceof Player1){
				p.play();
				System.out.println("The "+p.getClass().getSimpleName()+" moved to"+p.coinPosition);
			
				if(p.coinPosition>=10)
				{
				System.out.println("The "+p.getClass().getSimpleName()+" wins");
				System.exit(0);
				}
				}
			if(p instanceof Player2)
				{p.play();
				System.out.println("The "+p.getClass().getSimpleName()+" moved to"+p.coinPosition);
			
				if(p.coinPosition>=10)
				{
				System.out.println("The "+p.getClass().getSimpleName()+" wins");
				System.exit(0);
				}
				}
				System.out.println("Continue Playing press 1");
			ans=sc.nextInt();	

}while(ans==1);
	
/**/
	/*do{

		p.play();
		System.out.println("The "+p.getClass().getSimpleName()+" moved to"+p.coinPosition);
		System.out.println("Continue Playing press 1 for player 1 or 2 for player 2");
	ans=sc.nextInt();
	}while(ans==2);*/



	

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



	public void move(Player p)
	{
			
				
					

			
	}





}