package com.LxiSoft.Game;
import com.LxiSoft.Game.*;
import java.util.*;

public class Board 
{
    int row = 10;
	int column = 10;
	int eSnakesNum = 6;
	int eLaddersNum = 6;
	int hSnakesNum = 11;
	int hLaddersNum = 5;
	
    int[][] gameBoard;
	int[][] snakes;
	int[][] ladders;

	Map<Players, Integer> playerPositions;

	public Board(List<Players> players)
	{
		this.playerPositions = new HashMap<Players, Integer>();
		for (Players player : players)
		{
			this.playerPositions.put(player, 0);
		}
        gameBoard = new int[row][column];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				gameBoard[i][j] = i*row + j + 1;
			}
		}
		setSnakeEasy();
		setLadderEasy();

	}

	public Board(List<Players> players, int n)
	{
		this.playerPositions = new HashMap<Players, Integer>();
		for (Players player : players)
		{
			this.playerPositions.put(player, 0);
		}
        gameBoard = new int[row][column];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				gameBoard[i][j] = i*row + j + 1;
			}
		}
		setSnakeHard();
		setLadderHard();
	}

	public boolean eMovePlayer(Players player, int value)
	{
		int position = playerPositions.get(player);
		position += value;

		if (position >= 100)
		{
			playerPositions.put(player, 100);
			return true;
		} 
		else 
		{
		    for (int i = 0; i < eSnakesNum; i++)
			{
			    if (snakes[i][0] == position)
				{
	    			position = snakes[i][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " gets snake bite : moves from " + snakes[i][0] + " to " + snakes[i][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int i = 0; i < eLaddersNum; i++)
			{
	    		if (ladders[i][0] == position)
				{
	    			position = ladders[i][1];
		    		playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes ladder from " + ladders[i][0] + " to " + ladders[i][1]);
	    			System.out.println("----------------------------------------------------------------------");	
			
		    		return false;
		    	}
	     	}
	     	playerPositions.put(player, position);
			return false;
    	}
    }

    public boolean hMovePlayer(Players player, int value)
	{
		int position = playerPositions.get(player);
		position += value;


		if (position >= 100){
			
			playerPositions.put(player, 100);
			return true;
		} 
		else 
		{
		    for (int i = 0; i < hSnakesNum; i++)
			{
			    if (snakes[i][0] == position)
				{
	    			position = snakes[i][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " gets snake bite : moves from " + snakes[i][0] + " to " + snakes[i][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int i = 0; i < hLaddersNum; i++)
			{
	    		if (ladders[i][0] == position)
				{
	    			position = ladders[i][1];
		    		playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes ladder from " + ladders[i][0] + " to " + ladders[i][1]);
	    			System.out.println("----------------------------------------------------------------------");	
			
		    		return false;
		    	}
	     	}
	     	playerPositions.put(player, position);
			return false;
    	}
    }

    public void eBoardDetails()
		{
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are ladders at :                      |");
		System.out.println("|                                  position  4       |");
		System.out.println("|                            	   position 12       |");
		System.out.println("|                                  position 14       |");
		System.out.println("|                                  position 22       |");
		System.out.println("|                                  position 41       |");
		System.out.println("|                                  position 54       |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are snakes at :                       |");
		System.out.println("|                                   position 28      |");
		System.out.println("|                                   position 37      |");
		System.out.println("|                                   position 47      |");
		System.out.println("|                                   position 75      |");
		System.out.println("|                                   position 94      |");
		System.out.println("|                                   position 96      |");
		System.out.println("+----------------------------------------------------+");
	}

	public void hBoardDescription()
	{
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are ladders at :                      |");
		System.out.println("|                            	 position  4         |");
		System.out.println("|                                position  8         |");
		System.out.println("|                                position 20         |");
		System.out.println("|                                position 32         |");
		System.out.println("|                                position 54         |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are snakes at :                       |");
		System.out.println("|                                position 22         |");
		System.out.println("|                                position 28         |");
		System.out.println("|                                position 30         |");
		System.out.println("|                                position 44         |");
		System.out.println("|                                position 58         |");
		System.out.println("|                                position 66         |");
		System.out.println("|                                position 72         |");
		System.out.println("|                                position 84         |");
		System.out.println("|                                position 94         |");
		System.out.println("|                                position 96         |");
		System.out.println("|                                position 98         |");
		System.out.println("+----------------------------------------------------+");
	}

	private void setSnakeEasy()
	{
		snakes = new int[eSnakesNum][2];
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

	private void setSnakeHard()
	{
		snakes = new int[hSnakesNum][2];
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

	private void setLadderEasy()
	{
		ladders = new int[eLaddersNum][2];
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
	
	private void setLadderHard()
	{
		ladders = new int[hLaddersNum][2];
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

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		boolean oddRow = true;
		for (int rows = row-1; rows >= 0; rows--)
		{
			for (int columns = 0; columns < column; columns++)
			{
				if (oddRow)
				{
					String play = "";
					boolean occupied = false;
					for (Players temp : playerPositions.keySet())
					{
						if (playerPositions.get(temp) == gameBoard[rows][column-1-columns])
						{
							occupied = true;
							play += temp + " ";
						}
					}
					
					if (occupied)
					{
						play += "\t";
						sb.append(play);
					} 
					else 
					{
						sb.append(gameBoard[rows][column-1-columns] + "\t");						
					}
				} 
				else 
				{
					boolean occupied = false;
					String play = "";
					for (Players temp : playerPositions.keySet())
					{
						if (playerPositions.get(temp) == gameBoard[rows][columns])
						{
							occupied = true;
							play += (temp + " ");
						}
					}
					
					if (occupied)
					{	
						play += "\t";
						sb.append(play);	
					} 
					else 
					{
						sb.append(gameBoard[rows][columns] + "\t");
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