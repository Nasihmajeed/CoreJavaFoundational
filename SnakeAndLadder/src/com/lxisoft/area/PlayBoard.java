package com.lxisoft.area;
import com.lxisoft.game.*;
import java.util.*;
import java.io.*;
import com.lxisoft.area.*;
public class PlayBoard
{
   static Scanner input =new Scanner(System.in);
   
   ArrayList<Snake>snakes = new ArrayList<Snake>();
   ArrayList<Ladder>ladders = new ArrayList<Ladder>();
   ArrayList<Cell>cells = new ArrayList<Cell>();
   
   Game game;
   Snake snake;
   Ladder ladder;
public void createBoard()
	{
		game=new Game();
		creatCells();
		creatSnakeAndLadder();
		game.playGame(snakes,ladders,cells);
		//showPlayBoard();

	}


	public void creatSnakeAndLadder()
	{
	for(int i=0;i<7;i++)
	{	
	snakes.add(new Snake());
	ladders.add(new Ladder());		
	}
	setSnakePositions();
	setLadderPositions();
	}

	public void setSnakePositions()
	{
		snakes.get(0).setHead(48);
		snakes.get(0).setTail(26);
		snakes.get(1).setHead(36);
		snakes.get(1).setTail(28);
		snakes.get(2).setHead(22);
		snakes.get(2).setTail(14);
		snakes.get(3).setHead(98);
		snakes.get(3).setTail(41);
		snakes.get(4).setHead(87);
		snakes.get(4).setTail(53);
		snakes.get(5).setHead(56);
		snakes.get(5).setTail(31);
		snakes.get(6).setHead(70);
		snakes.get(6).setTail(33);
	}

	public void setLadderPositions()
	{
		ladders.get(0).setStart(4);
		ladders.get(0).setEnd(21);
		ladders.get(1).setStart(13);
		ladders.get(1).setEnd(44);
		ladders.get(2).setStart(28);
		ladders.get(2).setEnd(35);
		ladders.get(3).setStart(42);
		ladders.get(3).setEnd(63);
		ladders.get(4).setStart(50);
		ladders.get(4).setEnd(67);
		ladders.get(5).setStart(74);
		ladders.get(5).setEnd(92);
		ladders.get(6).setStart(32);
		ladders.get(6).setEnd(54);
	}

public void creatCells()
	{
		int counter=100,iteration=-1,i=0;
		 while (counter >0)
		{
			cells.add(new Cell());
            if (counter%10 == 0 && counter != 100){
                if(iteration==-1)
                {   counter-=9;
                    iteration=1;
                }
                else
                {  // System.out.print(counter+"\t");
            		cells.get(i).setPosition(counter);
            		cells.get(i).setCoinPlace(" ");
            		i++;
                    counter-=10;
                    iteration=-1;
                }
                if(counter!=0)	
                {   cells.add(new Cell());
                	cells.get(i).setPosition(counter);
                	cells.get(i).setCoinPlace(" ");
                	i++;
                	//System.out.print("\n" + counter + "\t");
                }
            }
            else
            { cells.get(i).setPosition(counter);
              cells.get(i).setCoinPlace(" "); 
              i++;
           // System.out.print(counter + "\t");
            }
            counter+=iteration; 
        }
	}	


public void changePosition(Player player,int flag,int position)
	{
		if(flag==1)
		{
			System.out.println("\nThere is a Snake At that Position");
			snake=new Snake();
			snake.behaviour();
			player.setPlayerPosition(position);
		}
		if(flag==2)
		{
			System.out.println("\nThere is a Ladder At that Position\n");
			ladder=new Ladder();
			ladder.behaviour();
			player.setPlayerPosition(position);
		}	
	}

public void showPlayBoard(ArrayList<Cell>cells,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		System.out.println("____________________________________Board________________________________________\n\n");
		for (int j=1;j<=100;j++)
		{			
		System.out.print(cells.get(j-1).getPosition()+" ");
		System.out.print(cells.get(j-1).getCoinPlace()+"\t");
		if(j%10==0)
			{
				System.out.println("\n");
			}				
		}

		// for(int x=0;x<ladders.size();x++)
		// { System.out.println("Ladder "+x+1+"From "+ladders.get(x).getStart()+" To "+ladders.get(x).getEnd());	}
		// for(int y=0;y<snakes.size();y++)
		// { System.out.println("Snake "+y+1+"From "+snakes.get(y).getHead()+" To "+snakes.get(y).getTail());	}
	System.out.println("________________________________________________________________________________________");
	}	

public void setPlayersPosition(ArrayList<Player> players,ArrayList<Cell>cells)
	{
		for (int x=0;x<cells.size();x++)
		{
			for (int j=0;j<players.size();j++)
			{
				if(cells.get(x).getPosition()==players.get(j).getPlayerPosition())
				{
					cells.get(x).setCoinPlace(players.get(j).getCoin());
				}
				else
				{
					cells.get(x).setCoinPlace(" ");
				}	
			}
		}
	}		
}
 