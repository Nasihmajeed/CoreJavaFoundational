import java.util.*;
class Play
{
	
	/*Player1 p1=new Player1();
	Player2 p2=new Pla*/



static	Player p1=new Player1();
static	Player p2=new Player2();
static Board b=new Board();
static Die d=new Die();
static int dieNumber,dieCount,coinPos;
static boolean isHome,isWin;
static int ans;
static Scanner sc=new Scanner(System.in);

static {	
			while((p1.dieNumber!=6)||(p2.dieNumber!=6))
				{
					p1.dieNumber=d.getNumberOnDie();
					p2.dieNumber=d.getNumberOnDie();
					if(p1.dieNumber==6 )
					{	p1.isHome=true;
					System.out.println("The"+p1.getClass().getSimpleName()+" reached the home");
					startPlayer1(p1,p2);

					}
					else if( p2.dieNumber==6)
					{p2.isHome=true;
					System.out.println("The"+p2.getClass().getSimpleName()+" reached the home");
					startPlayer1(p1,p2);
					}
					else
					{
					System.out.println("players havent reached the home");
					}

	



				}
}
{
					p1.dieNumber=d.getNumberOnDie();
					p2.dieNumber=d.getNumberOnDie();
					if(p1.dieNumber==6 )
					{	p1.isHome=true;
					System.out.println("The"+p1.getClass().getSimpleName()+" reached the home");
					startPlayer1(p1,p2);

					}
					else if( p2.dieNumber==6)
					{p2.isHome=true;
					System.out.println("The"+p2.getClass().getSimpleName()+" reached the home");
					startPlayer1(p1,p2);
					}
					else
					{
					System.out.println("players havent reached the home");
					}

	



				}







public static void startPlayer1(Player p1,Player p2)
{
	System.out.println("-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	System.out.println("The "+p1.getClass().getSimpleName()+" throws die");

do{
		
/*if(d.getNumberOnDie()==6)
			{	System.out.println("Player "+p1.getClass().getSimpleName()+" got 6 ");
				p.setCoinPosition(0);
				System.out.println("Player "+p1.getClass().getSimpleName()+" moved to home");*/

		do{
				
			if(p1 instanceof Player1){
					if(p1.isHome==true){

				p1.play();
				System.out.println("The "+p1.getClass().getSimpleName()+" moved to"+p1.coinPosition);
			
				if(p1.coinPosition>=10)
				{
				System.out.println("The "+p1.getClass().getSimpleName()+" wins");
					isWin=true;
				System.exit(0);
				}
				
			}
				else
			{	//p2.coinPosition=0;
					//p1.dieNumber=d.getNumberOnDie();
					Play p=new Play();
				System.out.println("The "+p1.getClass().getSimpleName()+" not in home");
			}
			}
			
				if(p1 instanceof Player1){
				if(p2.isHome==true){
				p2.play();
				System.out.println("The "+p2.getClass().getSimpleName()+" moved to"+p2.coinPosition);
			
				if(p2.coinPosition>=10)
				{
				System.out.println("The "+p2.getClass().getSimpleName()+" wins");
					isWin=true;
				System.exit(0);
				}
			}
			else
			{	//p2.coinPosition=0;
				Play p=new Play();
				//p2.dieNumber=d.getNumberOnDie();
				System.out.println("The "+p2.getClass().getSimpleName()+" not in home");
			}
			}
			//startPlayer1(p2);
				b.getBoard(p1.coinPosition,p2.coinPosition);

				System.out.println("Continue Playing press 1");
			ans=sc.nextInt();	

}while(ans==1);

/*else
{
System.out.println("The "+p.getClass().getSimpleName()+" not in home");
startPlayer1(p2);
}*/

}while(!isWin);	
/**/
	



	

}

/*{

	System.out.println("-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	System.out.println("The "+p.getClass().getSimpleName()+" throws die");
	do{

		if(p instanceof Player2)
				{p.play();
				System.out.println("The "+p.getClass().getSimpleName()+" moved to"+p.coinPosition);
			
				if(p.coinPosition>=10)
				{
				System.out.println("The "+p.getClass().getSimpleName()+" wins");
				isWin=true;
				System.exit(0);
				}
				}
			System.out.println("Continue Playing press 1");
			ans=sc.nextInt();
	}while(ans==1);
}*/

/*public boolean getHome(Player p)
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

	}*/



	public void move(Player p)
	{
			
				
					

			
	}





}