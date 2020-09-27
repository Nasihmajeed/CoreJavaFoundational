package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	Board board=new Board();//no need for board this is done in diaplay class
	Display display=new Display();
	int[][] BoardArray = new int[100][2];
	Scanner scanner=new Scanner(System.in);
	int i,j;
	int a,b,a1,b1;
	int counter= 100;
	int iteration=-1; 
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
        while(i==BoardArray[99][0]||j== BoardArray[99][0]){
        this.player1();
        this.player2();
       	}

       
		
	}//method1


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
	}

	public void player1(){

					System.out.println("\nDIE ROLLING FOR PLAYER1	");//implemting loops to run the pgm till end
					a=players[0].die.randomGeneration();
					System.out.println(a);
					if(a==1){//player1 nte die one vannal cheyandathu
						System.out.println("\n--------------------------------------------------------------------------------------");
						display.boardPrinting();
						System.out.println("\nPLAYER ONE ENTERS THE GAME AND IS IN FIRST POSITION");
						System.out.println("\n--------------------------------------------------------------------------------------");
						BoardArray[0][0]=i;
						System.out.println("\n PRESS Y TO CONTINUE");
						char c = scanner.next().charAt(0);// chodich chodich kalikan
						if(c== 'Y'){//DIE ONE VANNAL PLAYER1 NU VEENDUM KALIKAN
							System.out.println("\n--------------------------------------------------------------------------------------");
							System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
							System.out.println("\n--------------------------------------------------------------------------------------");
							a1=players[0].die.randomGeneration();
							System.out.println("\n"+a1);
							int incrementi=0+a1+1;
							BoardArray[incrementi][0]=i;
							System.out.println("\n--------------------------------------------------------------------------------------");
							display.boardPrinting();//THIS IS NOT WOEKING CHEK
							System.out.println("\n NOW PLAYER1 IS IN "+incrementi);//incremeti to store value of i in new position
							System.out.println("\n--------------------------------------------------------------------------------------");
							
							}	//DIE ONE VANNAL PLAYER1 NU VEENDUM KALIKAN
					}//player1 nte die one vannal cheyandathu
					else{
						System.out.println("\n--------------------------------------------------------------------------------------");
						System.out.println("\n PLAYER1 *CAN NOT* ENTER THE GAME");
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
				BoardArray[0][1]=j;
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.println("\n NEXT CHANCE"+"\n DIE ROLLING FOR PLAYER2");
				b1=players[1].die.randomGeneration();
				System.out.println("\n"+b1);
				int incrementj=0+b1+1;
				BoardArray[incrementj][0]=j;
				display.boardPrinting();
				System.out.println("\n NOW PLAYER2 IS IN "+incrementj);
				System.out.println("\n--------------------------------------------------------------------------------------");
			}
			else{
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.println("\n PLAYER2 *CAN NOT* ENTER THE GAME CHANCE GOES TO PLAYER1");
				System.out.println("\n--------------------------------------------------------------------------------------");

			}

		}
	}


}//class