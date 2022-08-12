package com.lxisoft.files;
import java.util.*;
 
public class Board
{
    private Board board;
    private Dice dice;
    private Ladder[] ladders;
    private Person[] players;
    private Snake[] snakes;             
    
    int playerOneScore;
    int playerTwoScore;
    
    int k = 5;
    int ladderLocation = 10; 
    int snakeLocation = 9;    
   
    Scanner sc = new Scanner(System.in);            
    
    public Board getBoard()                    //Board settings
    {
        return board;
    }
    public void setBoard(Board Board)
    {
        this.board=Board;
    }
    
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

    public void startPlaying()
    {      
        dice.throwDice();        
        //ladder.useLadder();  //which means player 1 or 2 uses ladder to goto space.
        //snake.snakeBites();  //which means snakes bites player 1 or 2. 
    
        for(int i = 0;i < k;i++)
        {
            System.out.println("Player 1 Throw Dice :");
            playerOneScore=sc.nextInt();

            System.out.println("Player 2 Throw Dice :");
            playerTwoScore=sc.nextInt(); 

            if(playerOneScore == snakeLocation)
            {
                System.out.println("Ouch Snake Bites Player 1!");
                System.out.println("Player Two Wins!!!");                                                
                break;    
            }
                    
            else if(playerTwoScore == snakeLocation)
            {
                System.out.println("Ouch Snake Bites Player 2!");
                System.out.println("Player One Wins!!!");
                break;
            } 
                
                if(playerOneScore == ladderLocation)
                {
                    System.out.println("Yey Player One Going To Space!");                                                       
                }               

                else if(playerTwoScore == ladderLocation)
                {
                    System.out.println("Yey Player Two Going To Space!");                    
                }               
        }  
      
    }
    
}
