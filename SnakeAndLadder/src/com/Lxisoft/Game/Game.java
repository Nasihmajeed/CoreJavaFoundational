package com.Lxisoft.Game;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Game
{
	String playerName;
	int[][] Board = new int[100][2];
	Scanner scanner=new Scanner(System.in);
	int i,j;
	int a,b,a1,b1;
    Player[] players=new Player[2];;


	public void start()
	{

	  	 
        this.startGame();
		this.diceRolling();
	}

	public void startGame()
	   {
		String sGame = "y"; 
        System.out.println(" START PRESS Y TO START  "); 
        sGame = scanner.nextLine ();
              
       if (sGame.equals ("y") || sGame.equals ("Y"))
         {
         System.out.println("\nU R IN THE GAME!!!");
		 }
		else
		 {
		  System.out.println("\nOH NO SEE U AGAIN!!!");
		  }

		 System.out.println("\nEnter the two players name");
		
		

		for(int i=0;i<players.length;i++)
		{
			players[i]=new Player();

		}
		this.playerInformation();
	} 

	public void playerInformation()
	{
		for (Player player : players) 
		{
			System.out.println("\nEnter the name of the player");
			playerName = scanner.nextLine();
			player.setPlayerName(playerName);
		}
		for(int i=0;i<players.length;i++)
		{
			System.out.println("\n THE PALYERS ARE");
        	System.out.println("        "     +players[i].getPlayerName()+ "     	             ");
        }



	}

	public void diceRolling()
	{
    while(i==Board[99][0]||j== Board[99][0])
     {
		
			System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER 1");
			char c = scanner.next().charAt(0);
			if(c=='Y')
     		{
	    		System.out.println("\nDIE ROLLING FOR PLAYER 1	");
				b=players[1].dice.randomGeneration();
				System.out.println(b);
		   
		   		if(a==1)
			    {
				System.out.println("\nPLAYER ONE ENTERS THE GAME ");
				Board[0][0]=i;
				this.if1RollsOne();
				}
			      else
			      {
				     System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER 2");
				      char d = scanner.next().charAt(0);
				   
				       if(d=='Y')
				       {
				        	System.out.println("\nDIE ROLLING FOR PLAYER2	");
				        	b=players[1].dice.randomGeneration();
					        System.out.println(b);
					   
			             if(b==1)
		            	   {
				            	System.out.println("\nPLAYER TWO ENTERS THE GAME ");
					            Board[0][1]=j;
					            this.if2RollsOne();
					        }
                        } 

		            }    
	
                }   
       }
}
					public void if1RollsOne()
					{

		while(i==Board[99][0]||j== Board[99][0])
		{
			             System.out.println("\n PRESS Y TO CONTINUE");
						char c = scanner.next().charAt(0);
					if(c== 'Y')
					{
							System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
							a1=players[0].dice.randomGeneration();
							System.out.println("\n"+a1);
							int incrementi=0+a1+1;
							Board[incrementi][0]=i;
							System.out.println("\n NOW PLAYER1 IS IN "+incrementi);
		}
		}
					}
						public void if2RollsOne()
						{
							while(i==Board[99][0]||j== Board[99][0])
							{
							b1=players[1].dice.randomGeneration();

					System.out.println("\n"+b1);
				   int incrementj = 0+b1;
					Board[incrementj][0]=j;
					System.out.println("\n NOW PLAYER2 IS IN "+incrementj);
							}
						} 
}

/*public class Game
{
	Dice d =new Dice();
	int[][] Board = new int[100][2];
	int i,j;
	int a,b,a1,b1;
	Scanner start=new Scanner(System.in);
	String y;
	Player[] players=new Player[2];;
	public void start()
	{
		System.out.println("\nSTART PRESS Y TO START");
		Scanner scanner=new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if(c== 'Y'){
			System.out.println("\n U R IN THE GAME!!!");
		}
		else
		{
			System.out.println("\nOH NO SEE YOU AGAIN !!!");
		}
		this.diceRolling();
	}

    //public void startGame()
    //{
    	//System.out.println("Game Started");
    	//d.randomGeneration();
    	//d.getDice();
    	/*System.out.println("\nDIE ROLLING");
					d.randomGeneration();
					System.out.println(a);
					if(a==1){
						System.out.println("\nU R IN !!!");
						Board[0][0]=i;
						System.out.println("\n PRESS Y TO CONTINUE");
						char c = start.next().charAt(0);
						if(c== 'Y'){
							System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
							d.randomGeneration();
							System.out.println("\n"+a1);
							int incrementi=0+a1+1;
							Board[incrementi][0]=i;
							System.out.println("\n NOW PLAYER1 IS IN "+incrementi);
							System.out.println("\n--------------------------------------------------------------------------------------");
							System.out.println("\n--------------------------------------------------------------------------------------");
							*/
			/*public void diceRolling()
	{
    while(i==Board[99][0]||j== Board[99][0])
     {
		
			System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER 1");
			char c = start.next().charAt(0);
			if(c=='Y')
     		{
	    		System.out.println("\nDIE ROLLING FOR PLAYER 1	");
				b=players[1].dice.randomGeneration();
				System.out.println(b);
		   
		   		if(a==1)
			    {
				System.out.println("\nPLAYER ONE ENTERS THE GAME ");
				Board[0][0]=i;
				this.if1RollsOne();
				}
			      else
			      {
				     System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER 2");
				      char d = start.next().charAt(0);
				   
				       if(d=='Y')
				       {
				        	System.out.println("\nDIE ROLLING FOR PLAYER2	");
				        	b=players[1].dice.randomGeneration();
					        System.out.println(b);
					   
			             if(b==1)
		            	   {
				            	System.out.println("\nPLAYER TWO ENTERS THE GAME ");
					            Board[0][1]=j;
					            this.if2RollsOne();
					        }
                        } 

		            }    
	
            }  
		} 
	}					public void if1RollsOne()
					{

		while(i==Board[99][0]||j== Board[99][0])
		{
			             System.out.println("\n PRESS Y TO CONTINUE");
						char c = start.next().charAt(0);
					if(c== 'Y')
					{
							System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
							a1=players[0].dice.randomGeneration();
							System.out.println("\n"+a1);
							int incrementi=0+a1+1;
							Board[incrementi][0]=i;
							System.out.println("\n NOW PLAYER1 IS IN "+incrementi);
		}
		}
					}
						public void if2RollsOne()
						{
							while(i==Board[99][0]||j== Board[99][0])
							{
							b1=players[1].dice.randomGeneration();

					System.out.println("\n"+b1);
				   int incrementj = 0+b1;
					Board[incrementj][0]=j;
					System.out.println("\n NOW PLAYER2 IS IN "+incrementj);
							}
						} 

			}*/



