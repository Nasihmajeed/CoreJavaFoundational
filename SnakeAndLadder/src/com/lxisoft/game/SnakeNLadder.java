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
		System.out.println("Select the Player number.........");
		System.out.println("1.Player-1");
		System.out.println("2.Player-2");
		select=sc.nextInt();
		
		if(select==1)
		{
			System.out.println("You have selected Player-1");
		                                                                                          play();
		}
		
		else if(select==2)
		    {
			System.out.println("You have selected Player-2");
			                                                                                       play();
		     }
		
		else	
		   {
			System.out.println("Sorry !!!!! Invalid Player Number !!!!");
		   }
		
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
	
	
}