package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Game{
	List<Players> players = new ArrayList<Players>();
	Dice dice  = new Dice();
	enum GameLevel{
		EASY,
		HARD
	}
	GameLevel gLevel;
	public void startGame(){
		Scanner s = new Scanner(System.in);

		System.out.println("             WELCOME TO SNAKE AND LADDER         ");
		System.out.println("            =============================        ");
		System.out.println("Start Game \n1.Yes \n2.No");
		int start = s.nextInt();
		if(start==1){
			System.out.println("Select the game level \n1.Easy \t2.Hard");
			int level = s.nextInt();
			if(level == 1){
				String gameLevel = "EASY";
				this.setEasyGame();
			}
			else if(level == 2){
				String gameLevel = "HARD";
				this.setHardGame();
			}
		}
	}
	public void gameDescription(List<Players> player){
		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                  Game Description                          |");
		System.out.println("|                 ------------------                         |");
		System.out.println("| The game has a tottal of 100 cells.There can be any number |");
		System.out.println("| of players. Each Player can roll the Dice simontaniously , |");
		System.out.println("| the player who gets 1 will enter the match at the begening |");
		System.out.println("| There are Snakes and Ladder all around the board the player|");
		System.out.println("| who reaches 100 first will be the winner of the game.      |");
		System.out.println("|                      Players                               |");
		System.out.println("|                     ---------                              |");
		System.out.println("   "+player+"   ");
		System.out.println("+------------------------------------------------------------+");
	}
	void setEasyGame(){
		Scanner scan = new Scanner(System.in);
	    int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Please enter the number of player (1-6): " );
			numPlayers = scan.nextInt();
		}

		for (int idx = 0; idx < numPlayers; idx++){
			Players player = new Players("Player " +(idx+1),"P"+(idx+1));
			players.add(player);
		}
		this.gameDescription(players);
		Board board = new Board(players);
		board.eBoardDescription();
		boolean done = false;
		int playerIdx = 0;
		while (!done){
			
			Players currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			done = board.eMovePlayer(currPlayer, roll);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(board);
			System.out.println("----------------------------------------------------------------------------\n");
			//System.out.println("-----------------------\n");
			
			if (done){
				System.out.println("-----------------------");
				System.out.println(" "+currPlayer + " wins ");
				System.out.println("-----------------------");
			}
			
			playerIdx++;
			if (playerIdx == numPlayers){
				playerIdx = 0;
			}	
		}
	}

	void setHardGame(){
		Scanner scan = new Scanner(System.in);

	    int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Please enter the number of player (1-6): " );
			numPlayers = scan.nextInt();
		}
		
		List<Players> players = new ArrayList<Players>();
		for (int idx = 0; idx < numPlayers; idx++){
			Players player = new Players("Player " + (idx+1),"P"+(idx+1));
			players.add(player);
		}
		this.gameDescription(players);
		Board board = new Board(players,numPlayers);
		board.hBoardDescription();
		boolean done = false;
		int playerIdx = 0;
		while (!done){
			
			Players currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			done = board.hMovePlayer(currPlayer, roll);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(board);
			System.out.println("----------------------------------------------------------------------------\n");

			if (done){
				System.out.println("-----------------------");
				System.out.println(" "+currPlayer + " wins");
				System.out.println("-----------------------");
			}
			
			playerIdx++;
			if (playerIdx == numPlayers){
				playerIdx = 0;
			}	
		}
	}
	/*public void finalPosition(){
	    Collections.sort(players);
	  	System.out.println(" PLAYERS FINAL POSITIONS ");
	   	System.out.println("-------------------------");
	   	for(Players pl : player){
	   		System.out.println("Player : "+pl.player+"  Coin : "+pl.coin+" Position : "+pl.position);
	  	}
	}*/
}