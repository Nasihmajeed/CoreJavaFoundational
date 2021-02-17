package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Board {

	
	int row = 10;
	int col = 10;
	int numSnakes = 6;
	int numLadders = 6;
	
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
			}
		}
		setSnakes();
		setLadders();
	}
	public boolean movePlayer(Players player, int value){
		int position = playerPositions.get(player);
		position += value;


		if (position >= 100){
			
			playerPositions.put(player, 100);
			return true;
		} 
		else {
		    for (int idx = 0; idx < numSnakes; idx++){
			    if (snakes[idx][0] == position){
	    			position = snakes[idx][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes snake from " + snakes[idx][0] + " to " + snakes[idx][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int idx = 0; idx < numLadders; idx++){
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

	private void setSnakes(){
		snakes = new int[numSnakes][2];
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

	private void setLadders(){
		ladders = new int[numLadders][2];
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
			//Switch oddRow flag and print new line
			oddRow = !oddRow;
			sb.append("\n");
		}
		sb.append("\n");

		return sb.toString();
	}

}
