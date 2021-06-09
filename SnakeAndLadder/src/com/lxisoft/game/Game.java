package com.lxisoft.game;

import com.lxisoft.players.*;
import java.util.*;

public class Game
{
      Snake s=new Snake();
      Ladder l=new Ladder();		

     Board b1=new Board(); 
     Board b2=new Board();
     Board b3=new Board();
 
    Die d=new Die();
 
    Player p1=new Player1();
    Player p2=new Player2();
	
	
    public int dieNumber,dieCount,pos;
    public boolean isHomeP1,isHomeP2,isCompleted;
 
    int ans,i;
 
    Scanner sc=new Scanner(System.in);

public  void startGame(Player p)
   { 
	    dieNumber=p.getHome();
		
		    if(dieNumber==6)
		      {	
			    p.coinPosition=1;
				
			    System.out.println("\nThe  "+p.getClass().getSimpleName()+" is eligible to play and is ready to play!!!!!");
		
        		   if(p instanceof Player1  )
						{
			             	isHomeP1=true;
			            }
			       else if(p instanceof Player2 )
		            	{	
                     		isHomeP2=true;
			            }
	         }
		     else
		      {
			       p.coinPosition=0;
			       System.out.println("\nThe  "+p.getClass().getSimpleName()+" is not eligible to play and cannot start to play");
		      }
     }





//Easy Level 

public void moveEasy(Player p)
{
	p.play();
	
	System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	
	if(p.coinPosition==5 || p.coinPosition==30 || p.coinPosition ==48 || p.coinPosition==69 ||p.coinPosition==80)
	{
		p.coinPosition=s.getSnake(p.coinPosition);
		System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	}
	else if(p.coinPosition==7 || p.coinPosition==14|| p.coinPosition==25 || p.coinPosition==39|| p.coinPosition==58 || p.coinPosition==77)
	{
		p.coinPosition=l.getLadder(p.coinPosition);
		System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	}

	b1.getBoardEasy(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=100 )
	{	
        isCompleted=true;
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Game Ends!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                                                      try{ 
			                                                         Thread.sleep(2000);
				                                                     }
	                                                           catch(InterruptedException e)
		                                                            {
						                                            Thread.currentThread().interrupt();
					                                                }
		System.out.println("Winner of the Game is : "+p.getClass().getSimpleName()+"!!!!!!!!!!!!!!!!!");
	}

}





//Medium Level

public void moveMedium(Player p)
{
	p.play();
	System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	
	if(p.coinPosition==6 || p.coinPosition==27 || p.coinPosition ==49 || p.coinPosition==69 ||p.coinPosition==89 || p.coinPosition==112 || p.coinPosition==139 )
	{
		p.coinPosition=s.getSnake(p.coinPosition);
		System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	}
	else if(p.coinPosition==4 || p.coinPosition==29 || p.coinPosition==60 || p.coinPosition==105 || p.coinPosition==129)
	{
		p.coinPosition=l.getLadder(p.coinPosition);
		System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	}

	
	
	b2.getBoardMedium(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=150 )
	{	
        isCompleted=true;
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Game Ends!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                                                      try{ 
			                                                         Thread.sleep(2000);
				                                                     }
	                                                           catch(InterruptedException e)
		                                                            {
						                                            Thread.currentThread().interrupt();
					                                                }
		System.out.println("Winner of the Game is : "+p.getClass().getSimpleName()+"!!!!!!!!!!");
	}

}





//Hard Level

public void moveHard(Player p)
{
    	p.play();
		
	    System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	
	if(p.coinPosition==2 || p.coinPosition==15|| p.coinPosition==25|| p.coinPosition==35 || p.coinPosition ==45 || p.coinPosition==75 ||p.coinPosition==85 || p.coinPosition==105 || p.coinPosition==125 || p.coinPosition==145 || p.coinPosition==165 || p.coinPosition==195 )
	{
		p.coinPosition=s.getSnake(p.coinPosition);
		System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	}
	
	else if(p.coinPosition==9 || p.coinPosition==26 || p.coinPosition==54 || p.coinPosition==81 || p.coinPosition==109 || p.coinPosition==120)
	{
		p.coinPosition=l.getLadder(p.coinPosition);
		System.out.println("\nThe  Gamer "+p.getClass().getSimpleName()+" has moved to position : "+p.coinPosition);
	}

         	b3.getBoardHard(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=200 )
	{	
        isCompleted=true;
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Game Ends!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		                                                      try{ 
			                                                         Thread.sleep(2000);
				                                                     }
	                                                           catch(InterruptedException e)
		                                                            {
						                                            Thread.currentThread().interrupt();
					                                                }
		System.out.println("Winner of the Game is : "+p.getClass().getSimpleName()+"!!!!!!!!!!!!!!!!!!!!!");
	}

}

}