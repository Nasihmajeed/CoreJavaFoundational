package com.lxisoft.game;
import java.lang.Random;    
import java.util.*;

public class Board
{   
    private Ladder[] ladders;
    private Snake[] snakes;  
    private Cells[] locationCells;                                         
    
    Scanner sc = new Scanner(System.in);            
    
    public Ladder[] getLadder()                //Ladder settings     
    {       
        return ladders;
    }

    public void setLadder(Ladder[] Ladder)
    {
        this.ladders=Ladder;
    }   
    
    public Snake[] getSnake()                   //Snakes settings
    {
        return snakes;
    }

    public void setSnake(Snake[] Snake)
    {
        this.snakes=Snake;
    }

    public Cells[] getLocationCell()            //locationCell Settings
    {
        return locationCells;
    }       

    public void setLocationCell(Cells[] LocationCells)
    {
        this.locationCells=LocationCells;
    }

    public void startPlaying()
    {  
        System.out.println("\t "+"LXI Soft Presents "+"\n");
        System.out.println("     " + "Snake And Ladder Game 1.0"+"\n");
        System.out.println("\t "+"Game Is Loading..."+"\n");                    

        //players[0].throwDice();                                   

        for(int i = 0;i < 4;i++)
        {

            int x=random.nextInt(50);

            System.out.println("\n"+"Player 1 Throw Dice :");        
            //System.out.println("Use x to roll Dice");
                    
            //players[0].setPlayerOneScore(sc.nextInt());  ///////Use Math.random();

            System.out.println("Player 2 Throw Dice :");
            players[1].setPlayerTwoScore(sc.nextInt()); 

            if(players[0].getPlayerOneScore() == ladders[i].getLocationOne())
            {
                 players[0].useLadder();
                 System.out.println("Yey Player One Going To Space!");                                                         
            }
                    
            if(players[1].getPlayerTwoScore() == ladders[i].getLocationOne())
            {
                players[1].useLadder();
                System.out.println("Yey Player Two Going To Space!");                                           
            }                                     
        
                if(players[0].getPlayerOneScore() == snakes[i].getLocationOne())
                {
                    snakes[0].snakeBites();
                    System.out.println("Ouch Snake Bites Player 1!");
                    System.out.println("Player Two Wins!!!");                                                                                         
         
                }               

                if(players[1].getPlayerTwoScore() == snakes[i].getLocationOne())
                {   
                    snakes[1].snakeBites();
                    System.out.println("Ouch Snake Bites Player 2!");
                    System.out.println("Player One Wins!!!");                                        
                }                            
        }  
      
    }
    
}
