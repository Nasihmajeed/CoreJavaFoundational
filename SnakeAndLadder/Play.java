import java.util.*;
class Play
{
Player p1=new Player1();
Player p2=new Player2();
Snake s=new Snake();
Ladder l=new Ladder();		


 Board b=new Board();
 Die d=new Die();
 int dieNumber,dieCount,pos;
 boolean isHomeP1,isHomeP2,isWin;
 int ans,i;
 Scanner sc=new Scanner(System.in);


 public void begining()
 {
 	System.out.println("\n-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b.setColumns();
	System.out.println("------------------------------------------------------ ");
	System.out.println("\t \t Position 6 ,32,56,72,95 \tcontains Snake\t \t ");					
	System.out.println("\t \tPosition 8,36,64,82 \tcontains Ladder	\t \t");
	System.out.println("------------------------------------------------------ ");


	System.out.println("------------------------------------------------------ ");
	System.out.println("\t Select the Difficulty level \t");
	System.out.println("\t 1.EASY ");
	System.out.println("\t 2.MEDIUM ");
	System.out.println("\t 3.HARD ");		


 }

public  void start(Player p)
{
	
	
	dieNumber=p.getHome();
		if(dieNumber==6)
		{	
			p.coinPosition=1;
			System.out.println("\nThe  "+p.getClass().getSimpleName()+" is in home and can play");
			if(p instanceof Player1  )
			{	isHomeP1=true;
				//move(p1);
			}
			else if(p instanceof Player2 )
			{	isHomeP2=true;
				//move(p2);
			}
		}
		else
		{
			p.coinPosition=0;
			System.out.println("\nThe  "+p.getClass().getSimpleName()+" is not in home and can't play");
		}


}





public void moveEasy(Player p)
{
	p.play();
	System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	
	if(p.coinPosition==6 || p.coinPosition==32 || p.coinPosition ==56 || p.coinPosition==72 ||p.coinPosition==95)
	{
		p.coinPosition=s.getSnake(p.coinPosition);
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	}
	else if(p.coinPosition==8 || p.coinPosition==26|| p.coinPosition==36 || p.coinPosition==42|| p.coinPosition==64 || p.coinPosition==82)
	{
		p.coinPosition=l.getLadder(p.coinPosition);
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	}

	
	
	b.getBoardEasy(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=100 )
	{	isWin=true;
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" wins the game");
	}

}

public void moveMedium(Player p)
{
	p.play();
	System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	
	if(p.coinPosition==6 || p.coinPosition==32 || p.coinPosition ==56 || p.coinPosition==72 ||p.coinPosition==95 || p.coinPosition==120 || p.coinPosition==145 )
	{
		p.coinPosition=s.getSnake(p.coinPosition);
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	}
	else if(p.coinPosition==8 || p.coinPosition==36 || p.coinPosition==64 || p.coinPosition==82 || p.coinPosition==110)
	{
		p.coinPosition=l.getLadder(p.coinPosition);
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	}

	
	
	b.getBoardMedium(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=150 )
	{	isWin=true;
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" wins the game");
	}


}

	public void moveHard(Player p)
{
	p.play();
	System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	
	if(p.coinPosition==6 || p.coinPosition==18|| p.coinPosition==24|| p.coinPosition==32 || p.coinPosition ==56 || p.coinPosition==72 ||p.coinPosition==95 || p.coinPosition==113 || p.coinPosition==135 || p.coinPosition==156 || p.coinPosition==185 || p.coinPosition==192 )
	{
		p.coinPosition=s.getSnake(p.coinPosition);
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	}
	else if(p.coinPosition==8 || p.coinPosition==36 || p.coinPosition==64 || p.coinPosition==82 || p.coinPosition==110 || p.coinPosition==130)
	{
		p.coinPosition=l.getLadder(p.coinPosition);
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" is moved to"+p.coinPosition);
	}

	
	
	b.getBoardHard(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=200 )
	{	isWin=true;
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" wins the game");
	}



	
/*else
{	//System.out.println("The  "+p.getClass().getSimpleName()+" is not in home and can't play");
	start(p);
}*/

}


	

}

