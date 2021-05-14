package com.lxisoft.game;

import com.lxisoft.kit.Dice;
import com.lxisoft.kit.Board;

public class SnakeNLadder
{

     final static int winner=100;
	 
    Dice die=new Dice();
	Board board=new Board();
	
	Map<Integer,Integer> snakeValues=new HashMap<Integer,Integer>();
	
	snakeValues.put(99,70);
	snakeValues.put(90,72);
	snakeValues.put(65,45);
	snakeValues.put(46,27);
	snakeValues.put(25,2);
	
	Map<Integer,Integer> ladderValues=new HashMap<Integer,Integer>();

     ladderValues.put(5,20);
	 ladderValues.put(10,30);
	 ladderValues.put(23,33);
	 ladderValues.put(41,60);
	 ladderValues.put(57,77);
	 

	
	public void intro()
	{
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------S_N_A_K_E---&&&---L_A_D_D_E_R---------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------M_O_K_S_H_A----Patam---------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
	}
	
  int select;
	
	public void letsGo()
	{
		
	}
	int startNum;
	public void play()
	 {
		do{
			     startNum=die.rollDice();
				 System.out.println("Die is thrown and the number obtained is : "+startNum);
		     } while(startNum<6);
			 
		  while(startNum==6)
		  {
			  System.out.println("Player has entered into the Board !!!");
		  }			  
	 }







package com.lxisoft.game;

import com.lxisoft.players.*;
import java.util.*;
public class Play
{
Player p1=new Player1();
Player p2=new Player2();
Snake s=new Snake();
Ladder l=new Ladder();		


 Board b1=new Board();
  Board b2=new Board();
   Board b3=new Board();
 Die d=new Die();
public int dieNumber,dieCount,pos;
 public boolean isHomeP1,isHomeP2,isWin;
 int ans,i;
 Scanner sc=new Scanner(System.in);


 public void begining()
 {
 	System.out.println("\n-------------------Snake and Lader Game--------------");
	System.out.println("------------------------------------------------------ ");
	System.out.println("------------------Play Begins------------------------");
	b1.setColumns();
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
			
			}
			else if(p instanceof Player2 )
			{	isHomeP2=true;
				
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

	
	
	b1.getBoardEasy(p.coinPosition,p,p.coinPosition,p);

	
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

	
	
	b2.getBoardMedium(p.coinPosition,p,p.coinPosition,p);

	
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

	
	
	b3.getBoardHard(p.coinPosition,p,p.coinPosition,p);

	
	if(p.coinPosition>=200 )
	{	isWin=true;
		System.out.println("\nThe  "+p.getClass().getSimpleName()+" wins the game");











	
	
}