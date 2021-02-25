package com.LxiSoft.SnakeAndLadder;
import com.LxiSoft.SnakeAndLadder.*;
import java.util.*;
public class Board {
	
	int row = 10;
	int col = 10;
	int eSnakesNum = 6;
	int eLaddersNum = 6;
	int hSnakesNum = 11;
	int hLaddersNum = 5;
	
    int[][] bord;
	int[][] snake;
	int[][] ladder;
	Map<Players, Integer> playerPositions;

	public Board(List<Players> players)
	{
		this.playerPositions = new HashMap<Players, Integer>();
		for (Players player : players)
		{
			this.playerPositions.put(player, 0);
		}

        bord = new int[row][col];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				bord[i][j] = i*row + j + 1;
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

        bord = new int[row][col];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				bord[i][j] = i*row + j + 1;
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
			    if (snake[i][0] == position)
				{
	    			position = snake[i][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " gets snake bite from " + snake[i][0] + " and moves to " + snake[i][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int i = 0; i < eLaddersNum; i++)
			{
	    		if (ladder[i][0] == position)
				{
	    			position = ladder[i][1];
		    		playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes ladder from " + ladder[i][0] + " to " + ladder[i][1]);
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
		if (position >= 100)
		{
			playerPositions.put(player, 100);
			return true;
		} 
		else 
		{
		    for (int i = 0; i < hSnakesNum; i++)
			{
			    if (snake[i][0] == position)
				{
	    			position = snake[i][1];
	     			playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " gets snake bite from " + snake[i][0] + " and moves to " + snake[i][1]);
	    			System.out.println("----------------------------------------------------------------------");
   
		    		return false;
			    }
		    }
    		for (int i = 0; i < hLaddersNum; i++)
			{
	    		if (ladder[i][0] == position
				){
	    			position = ladder[i][1];
		    		playerPositions.put(player, position);
		    		System.out.println("----------------------------------------------------------------------");
	    			System.out.println(" " + player + " takes ladder from " + ladder[i][0] + " to " + ladder[i][1]);
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
	System.out.println("\nHints :");
	System.out.println("        There are ladders at :");
	System.out.println("                                  position  4");
	System.out.println("                            	  position 20");
	System.out.println("                                  position 22");
	System.out.println("                                  position 36");
	System.out.println("                                  position 54");
	System.out.println("                                  position 80");
	
	System.out.println("\n        There are snakes at :");
	System.out.println("                                   position 28");
	System.out.println("                                   position 47");
	System.out.println("                                   position 58");
	System.out.println("                                   position 74");
	System.out.println("                                   position 86");
	System.out.println("                                   position 95");
}

public void hBoardDetails()
{
	System.out.println("\nHints :");
	System.out.println("        There are snakes at :");
	System.out.println("                                position 22");
	System.out.println("                                position 28");
	System.out.println("                                position 47");
	System.out.println("                                position 49");
	System.out.println("                                position 58");
	System.out.println("                                position 61");
	System.out.println("                                position 72");
	System.out.println("                                position 86");
	System.out.println("                                position 93");
	System.out.println("                                position 95");
	System.out.println("                                position 97");

	System.out.println("\n        There are ladders at :");
	System.out.println("                                position  4");
	System.out.println("                                position  8");
	System.out.println("                                position 20");
	System.out.println("                                position 32");
	System.out.println("                                position 54");
}


	private void setSnakeEasy()
	{
		snake = new int[eSnakesNum][2];
		snake[0][0] = 28;
		snake[0][1] = 10;

		snake[1][0] = 47;
		snake[1][1] = 16;

		snake[2][0] = 58;
		snake[2][1] = 3;

		snake[3][0] = 74;
		snake[3][1] = 32;

		snake[4][0] = 86;
		snake[4][1] = 71;
		
		snake[5][0] = 95;
		snake[5][1] = 42;		
	}
	private void setSnakeHard()
	{
		snake = new int[hSnakesNum][2];
		snake[0][0] = 22;
		snake[0][1] = 2;

		snake[1][0] = 28;
		snake[1][1] = 6;

		snake[2][0] = 47;
		snake[2][1] = 10;

		snake[3][0] = 49;
		snake[3][1] = 26;

		snake[4][0] = 58;
		snake[4][1] = 42;

		snake[5][0] = 61;
		snake[5][1] = 36;

		snake[6][0] = 72;
		snake[6][1] = 50;

		snake[7][0] = 86;
		snake[7][1] = 64;

		snake[8][0] = 93;
		snake[8][1] = 62;

		snake[9][0] = 95;
		snake[9][1] = 82;

		snake[10][0] = 97;
		snake[10][1] = 78;		
	}

	private void setLadderEasy()
	{
		ladder = new int[eLaddersNum][2];
		ladder[0][0] = 4;
		ladder[0][1] = 49;

		ladder[1][0] = 20;
		ladder[1][1] = 50;

		ladder[2][0] = 22;
		ladder[2][1] = 38;

		ladder[3][0] = 36;
		ladder[3][1] = 53;

		ladder[4][0] = 54;
		ladder[4][1] = 88;

		ladder[5][0] = 80;
		ladder[5][1] = 92;
	}
	private void setLadderHard()
	{
		ladder = new int[hLaddersNum][2];
		ladder[0][0] = 4;
		ladder[0][1] = 16;

		ladder[1][0] = 8;
		ladder[1][1] = 20;

		ladder[2][0] = 20;
		ladder[2][1] = 74;

		ladder[3][0] = 32;
		ladder[3][1] = 56;
		
		ladder[4][0] = 54;
		ladder[4][1] = 70;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		boolean oddRow = true;
		for (int rows = row-1; rows >= 0; rows--)
		{
			for (int colms = 0; colms < col; colms++)
			{
				if (oddRow){
					String pl = "";
					boolean occupied = false;
					for (Players temp : playerPositions.keySet())
					{
						if (playerPositions.get(temp) == bord[rows][col-1-colms])
						{
							occupied = true;
							pl += temp + " ";
						}
					}
					
					if (occupied)
					{
						pl += "\t";
						sb.append(pl);
					} else {
						sb.append(bord[rows][col-1-colms] + "\t");						
					}
				} 
				else 
				{
					boolean occupied = false;
					String pl = "";
					for (Players temp : playerPositions.keySet())
					{
						if (playerPositions.get(temp) == bord[rows][colms])
						{
							occupied = true;
							pl += (temp + " ");
						}
					}
					
					if (occupied)
					{	
						pl += "\t";
						sb.append(pl);	
					} 
					else 
					{
						sb.append(bord[rows][colms] + "\t");
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
