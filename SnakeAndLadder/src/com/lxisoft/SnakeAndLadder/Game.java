package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Game{
	int noOfPlayers;	
	//Board bord = new Board();
	Dice dice  = new Dice();
	//Snake snake = new Snake();
	//Ladder ladder = new Ladder();
	//ArrayList<Players> player = new ArrayList<Players>();
	enum GameLevel{
		EASY,
		HARD
	}
	GameLevel gLevel;
	public void startGame(){
		Scanner s = new Scanner(System.in);

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
		    //this.winner(noOfPlayers);
		}
	}
	void setEasyGame(){
		Scanner scan = new Scanner(System.in);
	    int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Please enter the number of player (1-6): " );
			numPlayers = scan.nextInt();
		}
		
		List<Players> players = new ArrayList<Players>();
		for (int idx = 0; idx < numPlayers; idx++){
			Players player = new Players("P" + idx);
			players.add(player);
		}

		Board board = new Board(players);
		boolean done = false;
		int playerIdx = 0;
		while (!done){
			
			Players currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			done = board.movePlayer(currPlayer, roll);
			
			System.out.println(board);
			System.out.println("-----------------------\n");
			
			if (done){
				System.out.println(currPlayer + " wins");
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
			Players player = new Players("P" + idx);
			players.add(player);
		}

		Board board = new Board(players);
		boolean done = false;
		int playerIdx = 0;
		while (!done){
			
			Players currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			done = board.movePlayer(currPlayer, roll);
			
			System.out.println(board);
			System.out.println("-----------------------\n");
			
			if (done){
				System.out.println(currPlayer + " wins");
			}
			
			playerIdx++;
			if (playerIdx == numPlayers){
				playerIdx = 0;
			}
			
		}
	}
}