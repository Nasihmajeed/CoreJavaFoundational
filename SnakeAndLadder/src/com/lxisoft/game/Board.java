package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    private Ladder[] ladders;
    private Snake[] snakes;  
    //private Cell[] locationCells;                                              
        
    Scanner sc = new Scanner(System.in);     
    Random rand = new Random();
   
    Players player = new Players();
    
    int randomDicePoint=rand.nextInt(6);

    final static int winPoint=100;   
 

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

    public void startPlaying()
    {  
        for(int i = 0;i < 100;i++)
        {
            player.gameLoading();
            
            System.out.println("Use x to roll Dice");
            //xPress=sc.next();            
            System.out.println(randomDicePoint);

                                    
        }  
      
    }
    
}
