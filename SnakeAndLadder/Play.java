import java.util.*;
class Play
{
	
	/*Player1 p1=new Player1();
	Player2 p2=new Pla*/



	

		Player p1=new Player1();
	

		Player p2=new Player2();
		


 Board b=new Board();
 Die d=new Die();
 int dieNumber,dieCount,pos;
 boolean isHome,isWin;
 int ans,i;
 Scanner sc=new Scanner(System.in);













public  void start()
{
	System.out.println("-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	

	pos=p1.getHome();

		if(pos==6)
		{	System.out.println("The "+p1.getClass().getSimpleName()+" is  in home");
			p1.setCoinPosition(1);
				
			//players.get(i).play();
			System.out.println("The "+p1.getClass().getSimpleName()+" moved to "+p1.coinPosition);

		}
		else if((p1.getHome()==1) && (p1.getCoinPosition()==1))
		{
			p1.setCoinPosition(1);

		}
		else if((p1.getHome()==2) && (p1.getCoinPosition()==1))
		{
			p1.setCoinPosition(2);
		}
		else if((p1.getHome()==3) && (p1.getCoinPosition()==1))
		{
			p1.setCoinPosition(3);
		}

		else if((p1.getHome()==4) && (p1.getCoinPosition()==1))
		{
			p1.setCoinPosition(4);
		}

		else if((p1.getHome()==5) && (p1.getCoinPosition()==1))
		{
			p1.setCoinPosition(5);
		}


		else
	{
		System.out.println("The "+p1.getClass().getSimpleName()+" is not in home");
	}


if(p2.getHome()==6)
		{	System.out.println("The "+p2.getClass().getSimpleName()+" is  in home");
			p1.setCoinPosition(1);
				
			//players.get(i).play();
			System.out.println("The "+p1.getClass().getSimpleName()+" moved to "+p2.coinPosition);

		}
		else if((p2.getHome()==1) && (p2.getCoinPosition()==1))
		{
			p2.setCoinPosition(1);

		}
		else if((p2.getHome()==2) && (p2.getCoinPosition()==1))
		{
			p1.setCoinPosition(2);
		}
		else if((p2.getHome()==3) && (p2.getCoinPosition()==1))
		{
			p1.setCoinPosition(3);
		}

		else if((p2.getHome()==4) && (p2.getCoinPosition()==1))
		{
			p2.setCoinPosition(4);
		}

		else if((p2.getHome()==5) && (p2.getCoinPosition()==1))
		{
			p2.setCoinPosition(5);
		}





	
	else
	{
		System.out.println("The "+p2.getClass().getSimpleName()+" is not in home");
	}

		


	

}


	public void move(Player p)
	{
			
				
					

			
	}





}