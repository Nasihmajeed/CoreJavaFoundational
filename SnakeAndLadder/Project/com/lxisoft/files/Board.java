package com.lxisoft.files;
import java.util.*;

public class Board
{
    private Dice dice;
    private Ladder[] ladders;
    private Person[] players;
    private Snake[] snakes;             
    
    int locationOfLadder = 4;
    int locationOfSnake = 6;
    int playerOneScore;
    int playerTwoScore;        
    
    int k = 5;
    int m = 2;
    
    Scanner sc = new Scanner(System.in);            
        
    public Dice getDice()                      //Dice settings
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)
    {
        this.dice=Dice;
    }      
    
    public Ladder[] getLadder()                //Ladder settings     
    {       
        return ladders;
    }

    public void setLadder(Ladder[] Ladder)
    {
        this.ladders=Ladder;
    }

    public Person[] getPlayer()                 //Person settings
    {
        return players;
    }

    public void setPlayer(Person[] Players)
    {
        this.players=Players;
    }
    
    public Snake[] getSnake()                   //Snakes settings
    {
        return snakes;
    }

    public void setSnake(Snake[] Snake)
    {
        this.snakes=Snake;
    }

    //set ladders locations                
    //mark and set person(2 players) 
    //set snakes locations   

    public void startPlaying()
    {      
        dice.throwDice();        
        //ladders[i].useLadder();  //which means player 1 or 2 uses ladder to goto space.
        //snakes[k].snakeBites();  //which means snakes bites player 1 or 2. 
    
        for(int i = 0;i < k;i++)
        {
            System.out.println("Player 1 Throw Dice :");
            playerOneScore=sc.nextInt();

            System.out.println("Player 2 Throw Dice :");
            playerTwoScore=sc.nextInt(); 

            if(playerOneScore == locationOfSnake)
            {
                System.out.println("Ouch Snake Bites Player 1!");
                System.out.println("Player Two Wins!!!");                                                
                break;    
            }
                    
            else if(playerTwoScore == locationOfSnake)
            {
                System.out.println("Ouch Snake Bites Player 2!");
                System.out.println("Player One Wins!!!");
                break;
            } 
                
                if(playerOneScore == locationOfLadder)
                {
                    System.out.println("Yey Player One Going To Space!");                                 
                }               

                else if(playerTwoScore == locationOfLadder)
                {
                    System.out.println("Yey Player Two Going To Space!");                    
                }

            System.out.println("\n" + m++ + " Rounds " + "\n");                   
        }  
      
    }
    
}
