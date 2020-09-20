package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	int[] Board = new int[100];
	Scanner scanner=new Scanner(System.in);
	int i,j;
	int a,b,a1,b1;

	Player[] players;


	public void userInterface(){
		System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                SNAKE AND LADDER                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                      GAME                                            *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
		this.startGame();
		this.playerInformation();
	}

	public void startGame(){
		System.out.println("\nIF YOU WANT TO START PRESS Y");
		Scanner scanner=new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if(c== 'Y'){
			System.out.println("\nWELCOME TO THE GAME");
		}
		else{
			System.out.println("\nEXITED FROM GAME");
		}
		System.out.println("\nHow many players");
		int count=scanner.nextInt();
		System.out.println("\n THERE ARE "+count+	"PLAYERS");
		players=new Player[count];

		for(int i=0;i<players.length;i++){
			players[i]=new Player();

		}
	} 

	public void playerInformation(){
		for(int i=0;i<players.length;i++){
		System.out.println("\nEnter the name of the player");
		playerName=scanner.nextLine();	
		players[i].setPlayerName(playerName);
		}
		for(int i=0;i<players.length;i++){
			System.out.println("\n THE PALYERS ARE");
			System.out.println("\n************************************************************************************************");
       		System.out.println("************************************************************************************************");
        	System.out.println("************************************************************************************************");
        	System.out.println("                                                                                    ");
        	System.out.println("             				"     +players[i].getPlayerName()+"     				                                  ");
        	System.out.println("                                                                                      ");
        	System.out.println("************************************************************************************************");
       		System.out.println("************************************************************************************************");
        	System.out.println("************************************************************************************************");
			
			
		}



	}

	public void dieRolling(){
	
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("\nDIE ROLLING FOR PLAYER1	");
		
		a=players[0].die.randomGeneration();
		System.out.println(a);
		if(a==1){
				System.out.println("\nPLAYER ONE ENTERS THE GAME AND IS IN FIRST POSITION");
				Board[1]=i;
				System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
				a1=players[0].die.randomGeneration();

				System.out.println("\n"+a1);
				int increment=0+a1;
				Board[increment]=i;
				System.out.println("\n NOW PLAYER1 IS IN "+increment);


		}
		System.out.println("\n PLAYER ONE CANT ENTER THE GAME CHANCE GOES TO PLAYER TWO");
		System.out.println("\nDIE ROLLING FOR PLAYER2	");
		b=players[1].die.randomGeneration();
		System.out.println(b);

		if(b==1){
				System.out.println("\nPLAYER TWO ENTERS THE GAME AND IS IN FIRST POSITION");
				System.out.println("\n NEXT CHANCE"+players[1].die.randomGeneration());
			}
		else{
			System.out.println("\n PLAYER TWO CANT ENTER THE GAME CHANCE GOES TO PLAYER ONE");
		}
	}

	


	public void gameMechanism(){

			if(players[0].die.randomGeneration()==1){
				System.out.println("\nPLAYER ONE ENTERS THE GAME AND IS IN FIRST POSITION");
				Board[1]=i;
				System.out.println("\n"+players[0].die.randomGeneration());
				int increment=0+players[0].die.randomGeneration();
				Board[increment]=i;
				System.out.println("\n NOW PLAYER1 IS IN "+increment);

			}
			else{

				System.out.println("\nDIE ROLLING FOR PLAYER2");
				System.out.println(players[1].die.randomGeneration());
				
				if(players[1].die.randomGeneration()==1){
					System.out.println("\nPLAYER TWO ENTERS THE GAME AND IS IN FIRST POSITION");
					Board[1]=j;
					System.out.println("\n"+players[1].die. randomGeneration());
					int increment=0+players[1].die.randomGeneration();
					Board[increment]=j;
					System.out.println("\n NOW PLAYER2 IS IN "+increment);
			

				}
			}

	

	}

	
	
}