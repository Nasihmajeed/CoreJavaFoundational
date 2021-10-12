package com.lxisoft.game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
public class PlayBoard
{
   static Scanner input =new Scanner(System.in);
   
   ArrayList<Snake>snakes = new ArrayList<Snake>();
   ArrayList<Ladder>ladders = new ArrayList<Ladder>();
   ArrayList<Cell>cells = new ArrayList<Cell>();
   
   Game game;
   Snake  snake=new Snake();
   Ladder   ladder=new Ladder();

public void createBoard()
    {
       game =new Game();//created like this for avoiding stack overflow exception
        this.creatCells();
        this.creatSnakeAndLadder();
        game.playGame(snakes,ladders,cells);
    }


    public void creatSnakeAndLadder()
    {
        snakes.add(new Snake());
        snakes.get(0).setHead(98);
        snakes.get(0).setTail(8);

         snakes.add(new Snake());
        snakes.get(1).setHead(92);
        snakes.get(1).setTail(53);
   
        snakes.add(new Snake());
        snakes.get(2).setHead(62);
        snakes.get(2).setTail(57);

         snakes.add(new Snake());
        snakes.get(3).setHead(36);
        snakes.get(3).setTail(15);
   
        snakes.add(new Snake());
        snakes.get(4).setHead(25);
        snakes.get(4).setTail(4);

    
    //ladder
        ladders.add(new Ladder());      
        ladders.get(0).setStart(2);
        ladders.get(0).setEnd(38);
       
         ladders.add(new Ladder());      
        ladders.get(1).setStart(6);
        ladders.get(1).setEnd(14);

         ladders.add(new Ladder());      
        ladders.get(2).setStart(17);
        ladders.get(2).setEnd(47);

         ladders.add(new Ladder());      
        ladders.get(3).setStart(33);
        ladders.get(3).setEnd(85);

         ladders.add(new Ladder());      
        ladders.get(4).setStart(52);
        ladders.get(4).setEnd(88);

          }


public void creatCells()//for movement of coin in table
    {
        int counter=1000,iteration=-1,i=0;
         while (counter >0)
        {
            cells.add(new Cell());
            if (counter%10 == 0 && counter != 1000)
            {
                if(iteration==-1)
                { 
                    counter-=9;
                    iteration=1;
                }
                else
                {  
                    cells.get(i).setPosition(counter);
                    cells.get(i).setCoinPlace(" ");
                    i++;
                    counter-=10;
                    iteration=-1;
                }

                if(counter!=0)  
                {  
                    cells.add(new Cell());
                    cells.get(i).setPosition(counter);
                    cells.get(i).setCoinPlace(" ");
                    i++;
                }
            }
            else
            { 
              cells.get(i).setPosition(counter);
              cells.get(i).setCoinPlace(" "); 
              i++;
            }
            counter+=iteration; 
        }
    }   


public void changePosition(Player player,int flag,int position)
    {
        if(flag==1)
        {
            System.out.println("\nSorry there is  Snake At that Position");
             player.setPlayerPosition(position);
        }
        if(flag==2)
        {
            System.out.println("\ncongrats There is  Ladder At that Position\n");
          
            player.setPlayerPosition(position);
        }   
    }

public void showPlayBoard(ArrayList<Cell>cells,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
    {
        System.out.println("____________________________________Board______________________________________\n\n");
        for (int j=1;j<=1000;j++)
        {           
        System.out.print(cells.get(j-1).getPosition()+" ");
        System.out.print(cells.get(j-1).getCoinPlace()+"\t");
        if(j%10==0)
            {
                System.out.println("\n");
            }               
        }

        for (int x=0;x<cells.size();x++)
        {
            cells.get(x).setSpace(true);
        }

    System.out.println("________________________________________________________________________________");
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
                    cells.get(x).setSpace(false);
                }
                if(cells.get(x).getSpace()==true)
                {
                    cells.get(x).setCoinPlace(" ");
                }   
            }
        }
    
    }       
}
