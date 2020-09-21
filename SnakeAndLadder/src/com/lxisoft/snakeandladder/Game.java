package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	int[][] Board = new int[100][100];
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
				Board[0][0]=i;
				System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
				a1=players[0].die.randomGeneration();

				System.out.println("\n"+a1);
				int incrementi=0+a1;
				Board[incrementi][0]=i;
				System.out.println("\n NOW PLAYER1 IS IN "+incrementi);//incremeti to store value of i in new position


		}
		else{
			System.out.println("\n PLAYER ONE CAN NOT ENTER THE GAME CHANCE GOES TO PLAYER TWO");
			System.out.println("\nDIE ROLLING FOR PLAYER2	");
			b=players[1].die.randomGeneration();
			System.out.println(b);
		}
		if(b==1){
				System.out.println("\nPLAYER TWO ENTERS THE GAME AND IS IN FIRST POSITION");
				Board[0][1]=j;
				System.out.println("\n NEXT CHANCE"+"\n DIE ROLLING FOR PLAYER2");
				b1=players[1].die.randomGeneration();

				System.out.println("\n"+b1);
				int incrementj=0+b1;
				Board[incrementj][0]=j;
				System.out.println("\n NOW PLAYER2 IS IN "+incrementj);



			}
		else{
			System.out.println("\n PLAYER TWO CAN NOT ENTER THE GAME CHANCE GOES TO PLAYER ONE");
		}
	}
	
}