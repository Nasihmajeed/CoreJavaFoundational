package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	Board board=new Board();//no need for board this is done in diaplay class
	Display display=new Display();
	Integer[] BoardArray = new Integer[101];
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

        players[0].setPosition(0);
        players[1].setPosition(0);

       this.player1();
        this.player2();
        
       
    
       
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

	public void player1(){

					

					System.out.println("PRESS Y TO CONTINUE");	
						char l = scanner.next().charAt(0);
						if(l=='Y'){
							System.out.println("\nDIE ROLLING FOR PLAYER1	");//implemting loops to run the pgm till end
							a=players[0].die.randomGeneration();

							System.out.println(a);
							if(a==1){//player1 nte die one vannal cheyandathu
								System.out.println("\n--------------------------------------------------------------------------------------");
								display.boardPrinting();
								System.out.println("\nPLAYER ONE ENTERS THE GAME AND IS IN FIRST POSITION");
								System.out.println("\n--------------------------------------------------------------------------------------");
							players[0].setPosition(1);//
								System.out.println("\n PRESS Y TO CONTINUE");
								char c = scanner.next().charAt(0);// chodich chodich kalikan
								if(c== 'Y'){//DIE ONE VANNAL PLAYER1 NU VEENDUM KALIKAN
									System.out.println("\n--------------------------------------------------------------------------------------");
									System.out.println("\n NEXT CHANCE 	"+"\n  DIE ROLLING");
									System.out.println("\n--------------------------------------------------------------------------------------");
									a1=players[0].die.randomGeneration();
									System.out.println("\n"+a1);
								players[0].setPosition(players[0].getPosition()+a1);
								BoardArray[i]=players[0].getPosition();
									System.out.println("\n--------------------------------------------------------------------------------------");
									display.boardPrinting();//THIS IS NOT WOEKING CHEK
									System.out.println("\n NOW PLAYER1 IS IN "+players[0].getPosition());//incremeti to store value of i in new position
									System.out.println("\n--------------------------------------------------------------------------------------");
									
									}	//DIE ONE VANNAL PLAYER1 NU VEENDUM KALIKAN
							}//player1 nte die one vannal cheyandathu
							else if(a!=1){
								System.out.println("\n--------------------------------------------------------------------------------------");
								System.out.println("\n PLAYER1 *CAN NOT* ENTER THE GAME");
								System.out.println("\n--------------------------------------------------------------------------------------");
							}
						}


	}

	

	public void player1Board(){
		System.out.println("\n PRESS Y TO ROLL THE DIE FOR PLAYER1");
		char c = scanner.next().charAt(0);
		if(c=='Y'){
			System.out.println("\n--------------------------------------------------------------------------------------");
			System.out.println("\nDIE ROLLING FOR PLAYER1	");
			System.out.println("\n--------------------------------------------------------------------------------------");
			p1=players[0].die.randomGeneration();
			System.out.println(p1);
		players[0].setPosition(players[0].getPosition()+p1);
		BoardArray[i]=players[0].getPosition();
			
		
		System.out.println("PLAYER1 IS IN"+players[0].getPosition());
		this.snakeMethod();
		this.ladderMethod();
			this.finalWinner();
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
				//BoardArray[1]=j;
			players[1].setPosition(1);
				System.out.println("\n PRESS Y TO CONTINUE");
				char q = scanner.next().charAt(0);// chodich chodich kalikan
				if(q== 'Y'){

					System.out.println("\n--------------------------------------------------------------------------------------");
					System.out.println("\n NEXT CHANCE"+"\n DIE ROLLING FOR PLAYER2");
					b1=players[1].die.randomGeneration();
					System.out.println("\n"+b1);
					//int incrementj=0+b1+1;
				players[1].setPosition(players[1].getPosition()+b1);
				BoardArray[j]=players[1].getPosition();

					//BoardArray[incrementj]=j;
					display.boardPrinting();
					System.out.println("\n NOW PLAYER2 IS IN "+players[1].getPosition());
					System.out.println("\n--------------------------------------------------------------------------------------");
				}
			}
			else if(b!=1){
				System.out.println("\n--------------------------------------------------------------------------------------");
				System.out.println("\n PLAYER2 *CAN NOT* ENTER THE GAME CHANCE GOES TO PLAYER1");
				System.out.println("\n--------------------------------------------------------------------------------------");

			}
			

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
		System.out.println(p2);
			//newIncrementj=incrementj+p2;
		players[1].setPosition(players[1].getPosition()+p2);
	
		
			
			BoardArray[j]=players[1].getPosition();
			System.out.println("PLAYER2 IS IN"+players[1].getPosition());
			this.snakeMethod();
			this.ladderMethod();
			this.finalWinner();
			System.out.println("\n--------------------------------------------------------------------------------------");





		}

	}
	

					public void trickMethod(){//to play the game efectively
			while(players[0].getPosition()<=100 || players[1].getPosition()<=100)
						{


							if(players[0].getPosition()==0 && players[1].getPosition()==1){
								
								this.player1();
								this.player2();
							}

							if(players[0].getPosition()>0 &&  players[1].getPosition()==1){
							
								this.player1Board();
								this.player2();
							}

							if(players[0].getPosition()==0 &&  players[1].getPosition()>1){
							
								this.player1();
								this.player2Board();
							}
							if(players[0].getPosition()>0 &&  players[1].getPosition()>0){
								
								this.player1Board();
								this.player2Board();
							}

						}

				}


					public void snakeMethod(){
						if(players[0].getPosition()==35)
						{
							players[0].setPosition(10);
							BoardArray[i]=players[0].getPosition();
							System.out.println("\n BITE BY SNAKE NOW PLAYER1 IS IN POSITION"+players[0].getPosition());
						}
						else if(players[1].getPosition()==35){
							players[1].setPosition(10);
								BoardArray[j]=players[1].getPosition();
									System.out.println("\n BITE BY SNAKE NOW PLAYER2 IS IN POSITION"+players[1].getPosition());
						}
						else if(players[0].getPosition()==55){
							players[0].setPosition(25);
								BoardArray[i]=players[0].getPosition();
									System.out.println("\n BITE BY SNAKE NOW PLAYER1 IS IN POSITION"+players[0].getPosition());
						}
						else if(players[1].getPosition()==55){
							players[1].setPosition(25);
								BoardArray[j]=players[1].getPosition();
									System.out.println("\n BITE BY SNAKE NOW PLAYER2 IS IN POSITION"+players[1].getPosition());
						}
						else if(players[0].getPosition()==85){
							players[0].setPosition(8);
								BoardArray[i]=players[0].getPosition();
									System.out.println("\n BITE BY SNAKE NOW PLAYER1 IS IN POSITION"+players[0].getPosition());
						}
						else if(players[1].getPosition()==85){
							players[1].setPosition(8);
								BoardArray[j]=players[1].getPosition();
								System.out.println("\n BITE BY SNAKE NOW PLAYER2 IS IN POSITION"+players[1].getPosition());
						}

					}

					public void ladderMethod(){
						if(players[0].getPosition()==12)
						{
							players[0].setPosition(24);
								BoardArray[i]=players[0].getPosition();
									System.out.println("\n CLIMBED A LADDER NOW PLAYER1 IS IN POSITION"+players[0].getPosition());
						}
						else if(players[1].getPosition()==12){
							players[1].setPosition(24);
								BoardArray[j]=players[1].getPosition();
								System.out.println("\n CLIMBED A LADDER NOW PLAYER2 IS IN POSITION"+players[1].getPosition());
						}
						else if(players[0].getPosition()==30){
							players[0].setPosition(60);
								BoardArray[i]=players[0].getPosition();
										System.out.println("\n CLIMBED A LADDER NOW PLAYER1 IS IN POSITION"+players[0].getPosition());
						}
						else if(players[1].getPosition()==30){
							players[1].setPosition(60);
								BoardArray[j]=players[1].getPosition();
								System.out.println("\n CLIMBED A LADDER NOW PLAYER2 IS IN POSITION"+players[1].getPosition());
						}
						else if(players[0].getPosition()==59){
							players[0].setPosition(95);
								BoardArray[i]=players[0].getPosition();
									System.out.println("\n CLIMBED A LADDER NOW PLAYER1 IS IN POSITION"+players[0].getPosition());
						}
						else if(players[1].getPosition()==59){
							players[1].setPosition(95);
								BoardArray[j]=players[1].getPosition();
								System.out.println("\n CLIMBED A LADDER NOW PLAYER2 IS IN POSITION"+players[1].getPosition());
						}

					}

					public void finalWinner(){
						if(players[0].getPosition()>=100){
							System.out.println("\n************************************************************************************************");
        	System.out.println("                                                                                    ");
        	System.out.println("             				ULTIMATE WINNER IS PLAYER1   				                                  ");

        	System.out.println("                                                                                      ");
        	System.out.println("\n************************************************************************************************");

						}
						else if(players[1].getPosition()>=100){
							System.out.println("\n************************************************************************************************");
        	System.out.println("                                                                                    ");
        	System.out.println("             				ULTIMATE WINNER IS PLAYER2				                                  ");

        	System.out.println("                                                                                      ");
        	System.out.println("\n************************************************************************************************");

						}

					}



					
					

}//class

