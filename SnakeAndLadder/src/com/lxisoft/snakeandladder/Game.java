package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	int[] Board = new int[100];
	Scanner scanner=new Scanner(System.in);

	Player[] players;


	public void userInterface(){
		System.out.println("\n*** SNAKE");
		System.out.println("\n	***AND");
		System.out.println("\n		***LADDER");
		this.startGame();
		this.playerInformation();
	}

	public void startGame(){
		System.out.println("IF YOU WANT TO START PRESS Y");
		Scanner scanner=new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if(c== 'Y'){
			System.out.println("WELCOME TO THE GAME");
		}
		else{
			System.out.println("EXITED FROM GAME");
		}
		System.out.println("How many players");
		int count=scanner.nextInt();
		System.out.println(" "+count+	"PLAYERS");
		players=new Player[count];

		for(int i=0;i<players.length;i++){
			players[i]=new Player();

		}
	} 

	public void playerInformation(){
		for(int i=0;i<players.length;i++){
		System.out.println("Enter the name of the player");
		playerName=scanner.nextLine();	
		players[i].setPlayerName(playerName);
		}
		for(int i=0;i<players.length;i++){
			System.out.println("\n THE PALYERS ARE");

			System.out.println("\n "+players[i].getPlayerName());
		}



	}

	
	
}