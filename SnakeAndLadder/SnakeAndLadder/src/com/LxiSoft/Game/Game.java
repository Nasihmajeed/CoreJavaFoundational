package com.LxiSoft.Game;
import com.LxiSoft.Game.*;

import java.util.*;

public class Game
{
    List<Players> player = new ArrayList<Players>();
    Dice dice = new Dice();

    enum GameLevel
    {
        EASY, HARD
    }
    GameLevel level;

    public void startGame()
    {
        System.out.println("\n\n +-------------------- SNAKE AND LADDER -------------------+");
        
        System.out.println("\nRules :");
        System.out.println("           1 : Get 1 on dice to enter the Game.");
        System.out.println("           2 : Each player gets a dice roll adjacently.");
        System.out.println("           3 : 6 on dice gives a bonus roll.");
        System.out.println("           4 : There are snakes and ladders.");
        System.out.println("           5 : Snake bites moves the player to the tail.");
        System.out.println("           6 : Ladder helps to move upwards.");
        System.out.println("           7 : First player to reach 100 wins.");
        Scanner s = new Scanner(System.in);

        System.out.println("\nStart Game? \n\t1. Yes \n\t0. No");
        int start = s.nextInt();
        if(start == 1)
        {
            System.out.println("Levels \n\t 1. Easy \n\t 2. Hard");
           
            System.out.println("\n      Note :");
            System.out.println("           1 : Easy level contains more ladders and less snakes.");
            System.out.println("           2 : Hard level contains more snakes and less ladders.");
           
            System.out.println("\nSelect Level :");
            int level = s.nextInt();
            if(level == 1)
            {
                String gameLevel = "EASY";
                this.setEasyGame();
            }
            else if(level == 2)
            {
                String gameLevel = "HARD";
                this.setHardGame();
            }
        }
    }

    public void setEasyGame()
    {
		Scanner s = new Scanner(System.in);

	    int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Enter the number of players (1-6): " );
			numPlayers = s.nextInt();
		}
        List<Players> players = new ArrayList<Players>();
		for (int idx = 0; idx < numPlayers; idx++)
        {
			Players player = new Players("Player " +(idx+1),"P"+(idx+1));
			players.add(player);
		}

		Board board = new Board(player);
		board.eBoardDescription();
		boolean done = false;
		int playerIdx = 0;
		while (!done)
        {	
			Players currPlayer = player.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			done = board.eMovePlayer(currPlayer, roll);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(board);
			System.out.println("----------------------------------------------------------------------------\n");
			
			if (done)
            {
				System.out.println("-----------------------");
				System.out.println(" "+currPlayer + " wins ");
				System.out.println("-----------------------");
			}
			
			playerIdx++;
			if (playerIdx == numPlayers)
            {
				playerIdx = 0;
			}	
		}
	}

	public void setHardGame()
    {
		Scanner s = new Scanner(System.in);

	    int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Enter the number of players (1-6): " );
			numPlayers = s.nextInt();
		}
		
		List<Players> players = new ArrayList<Players>();
		for (int idx = 0; idx < numPlayers; idx++)
        {
			Players player = new Players("Player " + (idx+1),"P"+(idx+1));
			players.add(player);
		}

		Board board = new Board(players,numPlayers);
		board.hBoardDescription();
		boolean done = false;
		int playerIdx = 0;
		while (!done)
        {	
			Players currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			done = board.hMovePlayer(currPlayer, roll);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(board);
			System.out.println("----------------------------------------------------------------------------\n");

			if (done)
            {
				System.out.println("-----------------------");
				System.out.println(" "+currPlayer + " wins");
				System.out.println("-----------------------");
			}
			
			playerIdx++;
			if (playerIdx == numPlayers)
            {
				playerIdx = 0;
			}	
		}
    }
}
