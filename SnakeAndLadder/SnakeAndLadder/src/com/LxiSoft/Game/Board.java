package com.LxiSoft.Game;
import com.LxiSoft.Game.*;
import java.util.*;

public class Board 
{
    int row = 10;
	int col = 10;
	int eNumSnakes = 6;
	int eNumLadders = 6;
	int hNumSnakes = 11;
	int hNumLadders = 5;
	
    int[][] gameBoard;
	int[][] snakes;
	int[][] ladders;
	Map<Players, Integer> playerPositions;

	public Board(List<Players> players){
		this.playerPositions = new HashMap<Players, Integer>();
		for (Players player : players){
			this.playerPositions.put(player, 0);
		}
        gameBoard = new int[row][col];
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				gameBoard[i][j] = i*row + j + 1;
				//System.out.print(gameBoard[i][j]);
			}
		}
		setSnakesEasy();
		setLaddersEasy();

	}
	public Board(List<Players> players, int n){
		this.playerPositions = new HashMap<Players, Integer>();
		for (Players player : players){
			this.playerPositions.put(player, 0);
		}
        gameBoard = new int[row][col];
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				gameBoard[i][j] = i*row + j + 1;
				//System.out.print(gameBoard[i][j]);
			}
		}
		setSnakesHard();
		setLaddersHard();
	}
	public boolean eMovePlayer(Players player, int value){
		int position = playerPositions.get(player);
		position += value;


		if (position >= 100){
			
			playerPositions.put(player, 100);
			return true;
		} 
		else {
		    for (int idx = 0; idx < eNumSnakes; idx++){
			    if (snakes[idx][0] == position){
	    			position = snakes[idx][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes snake from " + snakes[idx][0] + " to " + snakes[idx][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int idx = 0; idx < eNumLadders; idx++){
	    		if (ladders[idx][0] == position){
	    			position = ladders[idx][1];
		    		playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes ladder from " + ladders[idx][0] + " to " + ladders[idx][1]);
	    			System.out.println("----------------------------------------------------------------------");	
			
		    		return false;
		    	}
	     	}
	     	playerPositions.put(player, position);
			return false;
    	}
    }

    public boolean hMovePlayer(Players player, int value){
		int position = playerPositions.get(player);
		position += value;


		if (position >= 100){
			
			playerPositions.put(player, 100);
			return true;
		} 
		else {
		    for (int idx = 0; idx < hNumSnakes; idx++){
			    if (snakes[idx][0] == position){
	    			position = snakes[idx][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes snake from " + snakes[idx][0] + " to " + snakes[idx][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int idx = 0; idx < hNumLadders; idx++){
	    		if (ladders[idx][0] == position){
	    			position = ladders[idx][1];
		    		playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes ladder from " + ladders[idx][0] + " to " + ladders[idx][1]);
	    			System.out.println("----------------------------------------------------------------------");	
			
		    		return false;
		    	}
	     	}
	     	playerPositions.put(player, position);
			return false;
    	}
    }
    	public void eBoardDescription(){
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are ladder :                          |");
		System.out.println("|                            in 4th position         |");
		System.out.println("|                            in 12th position        |");
		System.out.println("|                            in 14th position        |");
		System.out.println("|                            in 22th position        |");
		System.out.println("|                            in 41th position        |");
		System.out.println("|                            in 54th position        |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are snakes :                          |");
		System.out.println("|                            in 28th position        |");
		System.out.println("|                            in 37th position        |");
		System.out.println("|                            in 47th position        |");
		System.out.println("|                            in 75th position        |");
		System.out.println("|                            in 94th position        |");
		System.out.println("|                            in 96th position        |");
		System.out.println("+----------------------------------------------------+");
	}
	public void hBoardDescription(){
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are ladder :                          |");
		System.out.println("|                            in 4th position         |");
		System.out.println("|                            in 8th position         |");
		System.out.println("|                            in 20th position        |");
		System.out.println("|                            in 32th position        |");
		System.out.println("|                            in 54th position        |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are snakes :                          |");
		System.out.println("|                            in 22th position        |");
		System.out.println("|                            in 28th position        |");
		System.out.println("|                            in 30th position        |");
		System.out.println("|                            in 44th position        |");
		System.out.println("|                            in 58th position        |");
		System.out.println("|                            in 66th position        |");
		System.out.println("|                            in 72th position        |");
		System.out.println("|                            in 84th position        |");
		System.out.println("|                            in 94th position        |");
		System.out.println("|                            in 96th position        |");
		System.out.println("|                            in 98th position        |");
		System.out.println("+----------------------------------------------------+");
	}

	private void setSnakesEasy(){
		snakes = new int[eNumSnakes][2];
		snakes[0][0] = 28;
		snakes[0][1] = 10;
		snakes[1][0] = 37;
		snakes[1][1] = 3;
		snakes[2][0] = 47;
		snakes[2][1] = 16;
		snakes[3][0] = 75;
		snakes[3][1] = 32;
		snakes[4][0] = 94;
		snakes[4][1] = 71;
		snakes[5][0] = 96;
		snakes[5][1] = 42;		
	}
	private void setSnakesHard(){
		snakes = new int[hNumSnakes][2];
		snakes[0][0] = 22;
		snakes[0][1] = 2;
		snakes[1][0] = 28;
		snakes[1][1] = 6;
		snakes[2][0] = 30;
		snakes[2][1] = 10;
		snakes[3][0] = 44;
		snakes[3][1] = 26;
		snakes[4][0] = 58;
		snakes[4][1] = 42;
		snakes[5][0] = 66;
		snakes[5][1] = 14;
		snakes[6][0] = 72;
		snakes[6][1] = 50;
		snakes[7][0] = 84;
		snakes[7][1] = 62;
		snakes[8][0] = 94;
		snakes[8][1] = 64;
		snakes[9][0] = 96;
		snakes[9][1] = 82;
		snakes[10][0] = 98;
		snakes[10][1] = 78;		
	}

	private void setLaddersEasy(){
		ladders = new int[eNumLadders][2];
		ladders[0][0] = 4;
		ladders[0][1] = 44;
		ladders[1][0] = 12;
		ladders[1][1] = 50;
		ladders[2][0] = 14;
		ladders[2][1] = 53;
		ladders[3][0] = 22;
		ladders[3][1] = 38;
		ladders[4][0] = 41;
		ladders[4][1] = 79;
		ladders[5][0] = 54;
		ladders[5][1] = 88;
	}
	private void setLaddersHard(){
		ladders = new int[hNumLadders][2];
		ladders[0][0] = 4;
		ladders[0][1] = 16;
		ladders[1][0] = 8;
		ladders[1][1] = 12;
		ladders[2][0] = 20;
		ladders[2][1] = 74;
		ladders[3][0] = 32;
		ladders[3][1] = 56;
		ladders[4][0] = 54;
		ladders[4][1] = 70;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		boolean oddRow = true;
		for (int rows = row-1; rows >= 0; rows--){
			for (int colms = 0; colms < col; colms++){
				if (oddRow){
					String pl = "";
					boolean occupied = false;
					for (Players temp : playerPositions.keySet()){
						if (playerPositions.get(temp) == gameBoard[rows][col-1-colms]){
							occupied = true;
							pl += temp + " ";
						}
					}
					
					if (occupied){
						pl += "\t";
						sb.append(pl);
					} else {
						sb.append(gameBoard[rows][col-1-colms] + "\t");						
					}
				} else {
					boolean occupied = false;
					String pl = "";
					for (Players temp : playerPositions.keySet()){
						if (playerPositions.get(temp) == gameBoard[rows][colms]){
							occupied = true;
							pl += (temp + " ");
						}
					}
					
					if (occupied){
						
						pl += "\t";
						sb.append(pl);	
					} else {

						sb.append(gameBoard[rows][colms] + "\t");
					}
			
				}
			}
			oddRow = !oddRow;
			sb.append("\n");
		}
		sb.append("\n");

		return sb.toString();
	}

}