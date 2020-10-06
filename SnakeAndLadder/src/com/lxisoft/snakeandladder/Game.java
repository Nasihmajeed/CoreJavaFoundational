package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	Board board=new Board();//no need for board this is done in diaplay class
	Display display=new Display();
	int[] BoardArray = new int[101];
	Scanner scanner=new Scanner(System.in);
	int i,j;
	int incrementi,incrementj;
	int newIncrementi,newIncrementj;
	int a,b,a1,b1,a2,b2,p1,p2;
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
        this.permissionAsking();
        display.boardPrinting();
        display.display();
        this.trickMethod();

        
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
        	System.out.println("                                                                                    ");
        	System.out.println("             				"     +players[i].getPlayerName()+"     				                                  ");
        	System.out.println("                                                                                      ");
        	System.out.println("\n************************************************************************************************");
			
		}
	}

	public void permissionAsking(){
		System.out.println("DO YOU WANT TO CONTINUE");
		char c = scanner.next().charAt(0);
		if(c== 'Y'){
			System.out.println("\nPLAYING GAME");
		}
		else{
			System.out.println("\nEXITED FROM GAME");
		}
		//BoardArray[0][0]=i;
		//BoardArray[0][1]=j;
	}

	

	public void player1Board(){
		System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER1");
		char c = scanner.next().charAt(0);
		if(c=='Y'){
			System.out.println("\n--------------------------------------------------------------------------------------");
			System.out.println("\nDIE ROLLING FOR PLAYER1	");
			System.out.println("\n--------------------------------------------------------------------------------------");
			p1=players[0].die.randomGeneration();
			System.out.println(p1+"pi ");
			newIncrementi=incrementi+p1;
			System.out.println(newIncrementi);
			BoardArray[newIncrementi]=i;
			System.out.println("PLAYER1 IS IN"+newIncrementi);
			System.out.println("\n--------------------------------------------------------------------------------------");
		}
	}


	public void player2(){


		System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER2");
		char c = scanner.next().charAt(0);
		if(c=='Y'){//player2 nte die roll cheyan
			System.out.println("\n--------------------------------------------------------------------------------------");
			System.out.println("\nDIE ROLLING FOR PLAYER2	");
			System.out.println("\n--------------------------------------------------------------------------------------");
			b=players[1].die.randomGeneration();
			System.out.println(b);
			if(b==1){//player2 nte one vannal
				System.out.println("\n--------------------------------------------------------------------------------------");
				display.boardPrinting();
				System.out.println("\nPLAYER TWO ENTERS THE GAME AND IS IN FIRST POSITION");
				System.out.println("\n--------------------------------------------------------------------------------------");
				BoardArray[1]=j;
				System.out.println("\n PRESS Y TO CONTINUE");
				char q = scanner.next().charAt(0);// chodich chodich kalikan
				if(q== 'Y'){

					System.out.println("\n--------------------------------------------------------------------------------------");
					System.out.println("\n NEXT CHANCE"+"\n DIE ROLLING FOR PLAYER2");
					b1=players[1].die.randomGeneration();
					System.out.println("\n"+b1);
					int incrementj=0+b1+1;
					BoardArray[incrementj]=j;
					display.boardPrinting();
					System.out.println("\n NOW PLAYER2 IS IN "+incrementj);
					System.out.println("\n--------------------------------------------------------------------------------------");
				}
			}
			else if(b!=1){
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.println("\n PLAYER2 *CAN NOT* ENTER THE GAME CHANCE GOES TO PLAYER1");
				System.out.println("\n--------------------------------------------------------------------------------------");

			}
			

		}
		System.out.println("\n PRESS Y TO ROLL FOR PLAYER1");
				char k = scanner.next().charAt(0);// chodich chodich kalikan
				if(k== 'Y'){
					
				}

	}

	public void player2Board(){
		System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER2");
		char c = scanner.next().charAt(0);
		if(c=='Y'){
			System.out.println("\n--------------------------------------------------------------------------------------");
			System.out.println("\nDIE ROLLING FOR PLAYER2	");
			System.out.println("\n--------------------------------------------------------------------------------------");
			p2=players[1].die.randomGeneration();
			System.out.println(p2+"p2 ");
			newIncrementj=incrementj+p2;
			System.out.println(newIncrementj);
			BoardArray[newIncrementi]=j;
			System.out.println("PLAYER2 IS IN"+newIncrementj);
			System.out.println("\n--------------------------------------------------------------------------------------");





		}

	}

					public void trickMethod(){//to play the game efectively

					while(i==BoardArray[100] || j==BoardArray[100])
						//display.boardPrinting();
						{
							if(i==BoardArray[0] && j==BoardArray[0]){
								display.boardPrinting();
								this.player1();
								this.player2();
							}

							if(i>BoardArray[0] && j==BoardArray[0]){
								display.boardPrinting();
								this.player1Board();
								this.player2();
							}

							if(i==BoardArray[0] && j>BoardArray[0]){
								display.boardPrinting();
								this.player1();
								this.player2Board();
							}
							if(i>BoardArray[0] && j>BoardArray[0]){
								display.boardPrinting();
								this.player1Board();
								this.player2Board();
							}

						}



					}

					public void snakeMethod(){

					}

					public void ladderMethod(){

					}

}//class

